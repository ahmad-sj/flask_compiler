package visitors;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import models.jinja.atoms.*;
import models.jinja.expressions.*;
import models.jinja.trailers.CallTrailer;
import models.jinja.trailers.MemberTrailer;
import models.jinja.trailers.SubTrailer;

import java.util.ArrayList;
import java.util.List;

public class ExpressionVisitor extends templateParserBaseVisitor<Node> {

    public NodeVisitor nodeVisitor;

    public ExpressionVisitor(NodeVisitor nodeVisitor) {
        this.nodeVisitor = nodeVisitor;
    }

    @Override
    public Node visitExpression(templateParser.ExpressionContext ctx) {
        // check if expr is "or" / "ternary" exp
        if (ctx.defaultExpr() == null) {
            // check if expr is "or" exp
            if (ctx.ternaryExt() == null) {
                return this.visit(ctx.orExpr());
            }
            // expr is "ternary" exp
            else {
                Node condExpr = this.visit(ctx.orExpr());
                condExpr.setNodeName("ternary cond");
                condExpr.setLineNumber(ctx.orExpr().start.getLine());

                Node trueExpr = this.visit(ctx.ternaryExt().expression().getFirst());
                trueExpr.setNodeName("ternary true expr");
                trueExpr.setLineNumber(ctx.ternaryExt().expression().getFirst().getStart().getLine());

                Node falseExpr = this.visit(ctx.ternaryExt().expression().getLast());
                falseExpr.setNodeName("ternary false expr");
                falseExpr.setLineNumber(ctx.ternaryExt().expression().getLast().getStart().getLine());

                TernaryExpression ternaryExpression = new TernaryExpression(condExpr, trueExpr, falseExpr);
                ternaryExpression.setNodeName("ternary expr");
                ternaryExpression.setLineNumber(ctx.getStart().getLine());

                return ternaryExpression;
            }
        }
        // expr is "default" expr
        else {
            Node value = this.visit(ctx.defaultExpr().orExpr());
            value.setNodeName("default expr main value");
            value.setLineNumber(ctx.defaultExpr().orExpr().getStart().getLine());

            Node defaultValue = this.visit(ctx.defaultExpr().expression());
            defaultValue.setNodeName("default expr backup value");
            defaultValue.setLineNumber(ctx.defaultExpr().expression().getStart().getLine());

            DefaultExpression defaultExpression = new DefaultExpression(value, defaultValue);
            defaultExpression.setNodeName("default expr");
            defaultExpression.setLineNumber(ctx.defaultExpr().getStart().getLine());

            return defaultExpression;
        }
    }

    @Override
    public Node visitOrExpr(templateParser.OrExprContext ctx) {
        List<templateParser.AndExprContext> exprListCtx = ctx.andExpr();

        // checking if it's an "or" expr
        if (exprListCtx.size() > 1) {
            ArrayList<Node> exprList = new ArrayList<>();

            for (int i = 0; i < exprListCtx.size(); i++) {
                exprList.add(this.visit(exprListCtx.get(i)));
            }

            OrExpression orExpression = new OrExpression(exprList);
            orExpression.setNodeName("or expr");
            orExpression.setLineNumber(ctx.OR().getFirst().getSymbol().getLine());

            return orExpression;
        }
        // check if remaining expr is "and" expr
        else {
            return this.visit(ctx.andExpr().getFirst());
        }
    }

    @Override
    public Node visitAndExpr(templateParser.AndExprContext ctx) {
        // checking if it's an "and" expr
        if (ctx.children.size() > 1) {

            ArrayList<Node> exprList = new ArrayList<>();
            for (int i = 0; i < ctx.notExpr().size(); i++) {
                exprList.add(this.visit(ctx.notExpr().get(i)));
            }

            AndExpression andExpression = new AndExpression(exprList);
            andExpression.setNodeName("and expr");
            andExpression.setLineNumber(ctx.getStart().getLine());

            return andExpression;
        }
        // check if remaining expr is "not" expr
        else {
            return this.visit(ctx.children.getFirst());
        }
    }

    @Override
    public Node visitNotExpr(templateParser.NotExprContext ctx) {
        // checking if it's "not" expr
        if (ctx.notExpr() != null) {
            Node expression = this.visit(ctx.notExpr());

            NotExpression notExpression = new NotExpression(expression);
            notExpression.setNodeName("not expr");
            notExpression.setLineNumber(ctx.NOT().getSymbol().getLine());

            return notExpression;
        }
        // check if remaining expr is "compare" expr
        else {
            return this.visit(ctx.compareExpr());
        }
    }

    @Override
    public Node visitCompareExpr(templateParser.CompareExprContext ctx) {

        if (ctx.isExpr() != null)
            return this.visit(ctx.isExpr());

        if (ctx.compExpr() != null)
            return this.visit(ctx.compExpr());

        return this.visit(ctx.inExpr());
    }

    @Override
    public Node visitIsExpr(templateParser.IsExprContext ctx) {
        if (ctx.IS() != null) {
            // visit "concat" expr
            Node expr = this.visit(ctx.concatExpr());

            // check if expr is negated (not is used)
            boolean negated = (ctx.NOT() != null);

            // getting id
            IdType id = new IdType(ctx.ID().getText());
            id.setNodeName("id");
            id.setLineNumber(ctx.ID().getSymbol().getLine());

            // return in expr
            IsExpression isExpression = new IsExpression(expr, negated, id);
            isExpression.setNodeName("is expr");
            isExpression.setLineNumber(ctx.getStart().getLine());

            return isExpression;
        } else
            return this.visit(ctx.concatExpr());
    }

    @Override
    public Node visitCompExpr(templateParser.CompExprContext ctx) {

        Node expr1 = this.visit(ctx.pipeExpr().getFirst());
        Node expr2 = this.visit(ctx.pipeExpr().getLast());
        Node compOptor = this.visitComparisonOperator(ctx.comparisonOperator());

        ComparisonExpression compExpr = new ComparisonExpression(expr1, expr2, compOptor);
        compExpr.setNodeName("comparison expr");
        compExpr.setLineNumber(ctx.getStart().getLine());

        return compExpr;
    }

    @Override
    public Node visitInExpr(templateParser.InExprContext ctx) {

        // check if expr is "in" expr
        if (ctx.pipeExpr().size() > 1) {
            // visit "pipe" expressions
            Node expr1 = this.visit(ctx.pipeExpr().getFirst());
            Node expr2 = this.visit(ctx.pipeExpr().getLast());

            InExpression inExpression = new InExpression(expr1, expr2);
            inExpression.setNodeName("in expr");
            inExpression.setLineNumber(ctx.IN().getSymbol().getLine());

            return inExpression;
        }
        // visit "pipe" expr
        else {
            return this.visit(ctx.pipeExpr().getFirst());
        }
    }

    @Override
    public Node visitComparisonOperator(templateParser.ComparisonOperatorContext ctx) {
        Operator operator = new Operator(ctx.getText());
        operator.setLineNumber(ctx.getStart().getLine());

        switch (ctx.getText()) {
            case "==":
                operator.setNodeName("EQ operator");
                break;

            case "!=":
                operator.setNodeName("NEQ operator");
                break;

            case "<":
                operator.setNodeName("LT operator");
                break;

            case ">":
                operator.setNodeName("GT operator");
                break;

            case "<=":
                operator.setNodeName("LE operator");
                break;

            default: // >=
                operator.setNodeName("GE operator");
        }
        return operator;
    }

    @Override
    public Node visitPipeExpr(templateParser.PipeExprContext ctx) {

        if (ctx.filter() == null || ctx.filter().isEmpty()) {
            return this.visit(ctx.concatExpr());
        } else {
            Node expr = this.visit(ctx.concatExpr());
            ArrayList<Node> filterList = new ArrayList<>();

            for (int i = 0; i < ctx.filter().size(); i++)
                filterList.add(this.visit(ctx.filter().get(i)));

            PipeExpression pipeExpression = new PipeExpression(expr, filterList);
            pipeExpression.setNodeName("pipe expr");
            pipeExpression.setLineNumber(ctx.getStart().getLine());

            return pipeExpression;
        }
    }

    @Override
    public Node visitFilter(templateParser.FilterContext ctx) {
        Node filterName = new IdType(ctx.ID().getText());
        filterName.setNodeName("filterName");
        filterName.setLineNumber(ctx.ID().getSymbol().getLine());

        Node argList = null;

        if (ctx.argumentList() != null)
            argList = this.visit(ctx.argumentList());

        FilterExpression filter = new FilterExpression(filterName, argList);
        filter.setNodeName("filter expr");
        filter.setLineNumber(ctx.getStart().getLine());

        return filter;
    }

    @Override
    public Node visitArgumentList(templateParser.ArgumentListContext ctx) {
        ArrayList<Node> argList = new ArrayList<>();

        for (int i = 0; i < ctx.argument().size(); i++)
            argList.add(this.visit(ctx.argument().get(i)));

        ArgumentList argumentList = new ArgumentList(argList);
        argumentList.setNodeName("arg list");
        argumentList.setLineNumber(ctx.getStart().getLine());

        return argumentList;
    }

    @Override
    public Node visitArgument(templateParser.ArgumentContext ctx) {
        Node expr = this.visit(ctx.expression());
        Node argName = null;

        if (ctx.ID() != null) {
            argName = new IdType(ctx.ID().getText());
            argName.setNodeName("id");
            argName.setLineNumber(ctx.ID().getSymbol().getLine());
        }

        Argument argument = new Argument(expr, argName);
        argument.setNodeName("argument");
        argument.setLineNumber(ctx.getStart().getLine());

        return argument;
    }

    @Override
    public Node visitConcatExpr(templateParser.ConcatExprContext ctx) {
        // check if expr is "concat" expr
        if (ctx.children.size() > 1) {

            ArrayList<Node> exprList = new ArrayList<>();
            for (int i = 0; i < ctx.addExpr().size(); i++) {
                exprList.add(this.visit(ctx.addExpr().get(i)));
            }

            ConcatExpression concatExpression = new ConcatExpression(exprList);
            concatExpression.setNodeName("concat expr");
            concatExpression.setLineNumber(ctx.getStart().getLine());

            return concatExpression;
        }
        // visit "add" expr
        else {
            return this.visit(ctx.addExpr().getFirst());
        }
    }

    @Override
    public Node visitAddExpr(templateParser.AddExprContext ctx) {
        // checking if it's an "add" expr
        if (ctx.children.size() > 1) {

            ArrayList<Node> exprList = new ArrayList<>();
            for (int i = 0; i < ctx.mulExpr().size(); i++) {
                exprList.add(this.visit(ctx.mulExpr().get(i)));
            }

            AddExpression addExpression = new AddExpression(exprList);
            addExpression.setNodeName("add expr");
            addExpression.setLineNumber(ctx.getStart().getLine());

            return addExpression;
        }
        // visit mul expr
        else {
            return this.visit(ctx.mulExpr().getFirst());
        }
    }

    @Override
    public Node visitAddExprOptor(templateParser.AddExprOptorContext ctx) {

        Operator operator = new Operator(ctx.getText());
        operator.setLineNumber(ctx.getStart().getLine());

        if (ctx.getText().equals("-"))
            operator.setNodeName("minus operator");
        else
            operator.setNodeName("plus operator");

        return operator;
    }

    @Override
    public Node visitMulExpr(templateParser.MulExprContext ctx) {
        // check if it's mul expr
        if (ctx.children.size() > 1) {
            ArrayList<Node> exprList = new ArrayList<>();

            for (int i = 0; i < ctx.unaryExpr().size(); i++) {
                exprList.add(this.visit(ctx.unaryExpr().get(i)));
            }

            MulExpression mulExpression = new MulExpression(exprList);
            mulExpression.setNodeName("mul expr");
            mulExpression.setLineNumber(ctx.getStart().getLine());

            return mulExpression;
        }
        // visit unary expr
        else {
            return this.visit(ctx.unaryExpr().getFirst());
        }
    }

    @Override
    public Node visitMulExprOptor(templateParser.MulExprOptorContext ctx) {
        Operator operator = new Operator(ctx.getText());
        operator.setLineNumber(ctx.getStart().getLine());

        switch (ctx.getText()) {
            case "*":
                operator.setNodeName("mul operator");
                break;

            case "/":
                operator.setNodeName("div operator");
                break;

            case "//":
                operator.setNodeName("floor operator");
                break;

            default:
                operator.setNodeName("mod operator");
        }
        return operator;
    }

    @Override
    public Node visitUnaryExpr(templateParser.UnaryExprContext ctx) {
        if (ctx.unaryExpr() != null) {
            Node expr = this.visit(ctx.unaryExpr());
            Node sign;

            if (ctx.MINUS() != null) {
                sign = new UnaryOperator(ctx.MINUS().getText());
                sign.setLineNumber(ctx.MINUS().getSymbol().getLine());
            } else {
                sign = new UnaryOperator(ctx.PLUS().getText());
                sign.setLineNumber(ctx.PLUS().getSymbol().getLine());
            }
            sign.setNodeName("sign type");

            UnaryExpression unaryExpression = new UnaryExpression(sign, expr);
            unaryExpression.setNodeName("unary expr");
            unaryExpression.setLineNumber(ctx.getStart().getLine());

            return unaryExpression;
        } else {
            return this.visit(ctx.powExpr());
        }
    }

    @Override
    public Node visitPowExpr(templateParser.PowExprContext ctx) {
        // check if expr is "power" expr
        if (ctx.POW() != null) {
            // visit "primary" expr
            Node baseValueExpr = this.visit(ctx.primary());
            // visit "unary" expr
            Node powerValueExpr = this.visit(ctx.unaryExpr());

            PowerExpression powerExpression = new PowerExpression(baseValueExpr, powerValueExpr);
            powerExpression.setNodeName("power expr");
            powerExpression.setLineNumber(ctx.POW().getSymbol().getLine());

            return powerExpression;
        }
        // expr is "primary" expr
        else {
            return this.visit(ctx.primary());
        }
    }

    @Override
    public Node visitAtom(templateParser.AtomContext ctx) {
        if (ctx.ID() != null) {
            IdType idType = new IdType(ctx.ID().getText());
            idType.setNodeName("id");
            idType.setLineNumber(ctx.ID().getSymbol().getLine());

            return idType;
        }

        if (ctx.INT() != null) {
            IntType intType = new IntType(ctx.INT().getText());
            intType.setNodeName("int type");
            intType.setLineNumber(ctx.INT().getSymbol().getLine());

            return intType;
        }

        if (ctx.FLOAT() != null) {
            FloatType floatType = new FloatType(ctx.FLOAT().getText());
            floatType.setNodeName("float type");
            floatType.setLineNumber(ctx.FLOAT().getSymbol().getLine());

            return floatType;
        }

        if (ctx.STRING() != null) {
            StringType stringType = new StringType(ctx.STRING().getText());
            stringType.setNodeName("string type");
            stringType.setLineNumber(ctx.STRING().getSymbol().getLine());

            return stringType;
        }

        if (ctx.parenthedExpr() != null) {
            return this.visit(ctx.parenthedExpr());
        }

        if (ctx.list() != null)
            return this.visit(ctx.list());

        return this.visit(ctx.dict());
    }

    @Override
    public Node visitParenthedExpr(templateParser.ParenthedExprContext ctx) {
        Node expr = this.visit(ctx.expression());

        ParenthedExpression parenthedExpression = new ParenthedExpression(expr);
        parenthedExpression.setNodeName("parenthed expr");
        parenthedExpression.setLineNumber(ctx.getStart().getLine());

        return parenthedExpression;
    }

    @Override
    public Node visitPrimary(templateParser.PrimaryContext ctx) {
        Node atom = this.visit(ctx.atom());
        ArrayList<Node> trailerList = null;

        if (ctx.trailer() != null) {
            trailerList = new ArrayList<>();

            for (int i = 0; i < ctx.trailer().size(); i++) {
                trailerList.add(this.visit(ctx.trailer().get(i)));
            }
        }

        PrimaryExpression primary = new PrimaryExpression(atom, trailerList);
        primary.setNodeName("primary type");
        primary.setLineNumber(ctx.atom().getStart().getLine());

        return primary;
    }

    @Override
    public Node visitTrailer(templateParser.TrailerContext ctx) {
        if (ctx.memberTrailer() != null)
            return this.visit(ctx.memberTrailer());

        if (ctx.subTrailer() != null)
            return this.visit(ctx.subTrailer());

        return visit(ctx.callTrailer());
    }

    @Override
    public Node visitMemberTrailer(templateParser.MemberTrailerContext ctx) {
        Node id = new IdType(ctx.ID().getText());
        id.setNodeName("id");
        id.setLineNumber(ctx.ID().getSymbol().getLine());

        MemberTrailer memberTrailer = new MemberTrailer(id);
        memberTrailer.setNodeName("member trailer");
        memberTrailer.setLineNumber(ctx.DOT().getSymbol().getLine());

        return memberTrailer;
    }

    @Override
    public Node visitSubTrailer(templateParser.SubTrailerContext ctx) {
        Node expr = this.visit(ctx.expression());

        SubTrailer subTrailer = new SubTrailer(expr);
        subTrailer.setNodeName("sub trailer");
        subTrailer.setLineNumber(ctx.getStart().getLine());

        return subTrailer;
    }

    @Override
    public Node visitCallTrailer(templateParser.CallTrailerContext ctx) {
        Node argList = null;

        if (ctx.argumentList() != null) {
            argList = this.visit(ctx.argumentList());
        }

        CallTrailer callTrailer = new CallTrailer(argList);
        callTrailer.setNodeName("call trailer");
        callTrailer.setLineNumber(ctx.LPAREN().getSymbol().getLine());

        return callTrailer;
    }

    @Override
    public Node visitList(templateParser.ListContext ctx) {
        ArrayList<Node> exprList = null;

        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            exprList = new ArrayList<>();

            for (templateParser.ExpressionContext expr : ctx.expression())
                exprList.add(this.visit(expr));
        }

        ListType listType = new ListType(exprList);
        listType.setNodeName("list type");
        listType.setLineNumber(ctx.getStart().getLine());

        return listType;
    }

    @Override
    public Node visitDict(templateParser.DictContext ctx) {
        ArrayList<Node> pairList = null;

        if (ctx.pair() != null && !ctx.pair().isEmpty()) {
            pairList = new ArrayList<>();

            for (templateParser.PairContext pair : ctx.pair()) {
                pairList.add(this.visit(pair));
            }
        }

        DictType dictType = new DictType(pairList);
        dictType.setNodeName("dict type");
        dictType.setLineNumber(ctx.LBRACE().getSymbol().getLine());

        return dictType;
    }

    @Override
    public Node visitPair(templateParser.PairContext ctx) {
        Node expr1 = this.visit(ctx.expression().getFirst());
        Node expr2 = this.visit(ctx.expression().getLast());

        PairType pairType = new PairType(expr1, expr2);
        pairType.setNodeName("pair type");
        pairType.setLineNumber(ctx.getStart().getLine());

        return pairType;
    }
}
