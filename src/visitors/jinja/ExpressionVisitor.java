package visitors.jinja;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import models.jinja.dataTypes.*;
import models.jinja.expressions.*;
import models.jinja.trailers.CallTrailer;
import models.jinja.trailers.MemberTrailer;
import models.jinja.trailers.SubTrailer;

import java.util.ArrayList;
import java.util.List;

public class ExpressionVisitor extends templateParserBaseVisitor<Node> {

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
                falseExpr.setNodeName("ternary true expr");
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
        List<templateParser.NotExprContext> exprListCtx = ctx.notExpr();

        // checking if it's an "and" expr
        if (exprListCtx.size() > 1) {
            ArrayList<Node> exprList = new ArrayList<>();

            for (int i = 0; i < exprListCtx.size(); i++) {
                exprList.add(this.visit(exprListCtx.get(i)));
            }

            AndExpression andExpression = new AndExpression(exprList);
            andExpression.setNodeName("and expr");
            andExpression.setLineNumber(ctx.AND().getFirst().getSymbol().getLine());

            return andExpression;
        }
        // check if remaining expr is "not" expr
        else {
            return this.visit(ctx.notExpr().getFirst());
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

        // check if expr is "is" expr
        if (ctx.IS() != null) {
            // visit "concat" expr
            Node expression = this.visit(ctx.concatExpr());
            boolean negated = (ctx.NOT() != null);
            String id = ctx.ID().getText();

            IsExpression isExpression = new IsExpression(expression, negated, id);
            isExpression.setNodeName("is expr");
            isExpression.setLineNumber(ctx.getStart().getLine());

            return isExpression;
        }
        // visit "concat" expr
        else if (ctx.concatExpr() != null) {
            return this.visit(ctx.concatExpr());
        }

        // check if expr is "in" or "pipe" expr
        if (ctx.inExpr() != null) {
            // visit "pipe" expr
            Node expression1 = this.visit(ctx.inExpr().pipeExpr().getFirst());

            // check if expr is "in" expr
            if (ctx.inExpr().pipeExpr().size() > 1) {
                // visit "pipe" expr
                Node expression2 = this.visit(ctx.inExpr().pipeExpr().getLast());

                InExpression inExpression = new InExpression(expression1, expression2);
                inExpression.setNodeName("in expr");
                inExpression.setLineNumber(ctx.inExpr().IN().getSymbol().getLine());

                return inExpression;
            }
            // visit "pipe" expr
            else {
                return this.visit(ctx.inExpr().pipeExpr().getFirst());
            }
        }

        // expr should be "comp" expr
        Node expression1 = this.visit(ctx.compExpr().pipeExpr().getFirst());
        Node expression2 = this.visit(ctx.compExpr().pipeExpr().getLast());
        Node comparisonOperator = this.visitComparisonOperator(ctx.compExpr().comparisonOperator());

        ComparisonExpression comparisonExpression = new ComparisonExpression(expression1, expression2, comparisonOperator);
        comparisonExpression.setNodeName("comparison expr");
        comparisonExpression.setLineNumber(ctx.getStart().getLine());

        return comparisonExpression;
    }

    @Override
    public Node visitComparisonOperator(templateParser.ComparisonOperatorContext ctx) {
        OperatorType operatorType = new OperatorType(ctx.getText());
        operatorType.setLineNumber(ctx.getStart().getLine());

        switch (ctx.getText()) {
            case "==":
                operatorType.setNodeName("EQ operator");
                break;

            case "!=":
                operatorType.setNodeName("NEQ operator");
                break;

            case "<":
                operatorType.setNodeName("LT operator");
                break;

            case ">":
                operatorType.setNodeName("GT operator");
                break;

            case "<=":
                operatorType.setNodeName("LE operator");
                break;

            default: // >=
                operatorType.setNodeName("GE operator");
        }
        return operatorType;
    }

    @Override
    public Node visitPipeExpr(templateParser.PipeExprContext ctx) {
        if (ctx.filter() == null) {
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
        if (ctx.addExpr().size() > 1) {
            Node expr1 = this.visit(ctx.addExpr().getFirst());
            Node expr2 = this.visit(ctx.addExpr().get(1));

            ConcatExpression concatExpression = new ConcatExpression(expr1, expr2);
            concatExpression.setNodeName("concat operation");
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
        if (ctx.mulExpr().size() > 1) {
            Node expr1 = this.visit(ctx.mulExpr().getFirst());
            Node expr2 = this.visit(ctx.mulExpr().get(1));
            Node optor = this.visit(ctx.mulExpr().getFirst());

            AddExpression addExpression = new AddExpression(optor, expr1, expr2);
            addExpression.setNodeName(optor.toString() + " operation");
            addExpression.setLineNumber(ctx.addExprOptor().getFirst().getStart().getLine());

            return addExpression;
        } else {
            return this.visit(ctx.mulExpr().getFirst());
        }
    }

    @Override
    public Node visitAddExprOptor(templateParser.AddExprOptorContext ctx) {

        OperatorType operatorType = new OperatorType(ctx.getText());
        operatorType.setLineNumber(ctx.getStart().getLine());

        if (ctx.getText().equals("-"))
            operatorType.setNodeName("minus operator");
        else
            operatorType.setNodeName("plus operator");

        return operatorType;
    }

    @Override
    public Node visitMulExpr(templateParser.MulExprContext ctx) {
        if (ctx.unaryExpr().size() > 1) {
            Node expr1 = this.visit(ctx.unaryExpr().getFirst());
            Node expr2 = this.visit(ctx.unaryExpr().get(1));
            Node optor = this.visit(ctx.mulExprOptor().getFirst());

            MulExpression mulExpression = new MulExpression(optor, expr1, expr2);
            mulExpression.setNodeName(optor.toString() + " operation");
            mulExpression.setLineNumber(ctx.mulExprOptor().getFirst().getStart().getLine());

            return mulExpression;
        } else {
            return this.visit(ctx.unaryExpr().getFirst());
        }
    }

    @Override
    public Node visitMulExprOptor(templateParser.MulExprOptorContext ctx) {
        OperatorType operatorType = new OperatorType(ctx.getText());
        operatorType.setLineNumber(ctx.getStart().getLine());

        switch (ctx.getText()) {
            case "*":
                operatorType.setNodeName("mul operator");
                break;

            case "/":
                operatorType.setNodeName("div operator");
                break;

            case "//":
                operatorType.setNodeName("floor operator");
                break;

            default:
                operatorType.setNodeName("mod operator");
        }
        return operatorType;
    }

    @Override
    public Node visitUnaryExpr(templateParser.UnaryExprContext ctx) {
        if (ctx.unaryExpr() != null) {
            Node expr = this.visit(ctx.unaryExpr());
            Node sign;

            if (ctx.MINUS() != null) {
                sign = new SignType(ctx.MINUS().getText());
                sign.setLineNumber(ctx.MINUS().getSymbol().getLine());
            } else {
                sign = new SignType(ctx.PLUS().getText());
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
            this.visit(ctx.parenthedExpr());
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
        parenthedExpression.setLineNumber(ctx.LPAREN().getSymbol().getLine());

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

        PrimaryType primaryType = new PrimaryType(atom, trailerList);
        primaryType.setNodeName("primary type");
        primaryType.setLineNumber(ctx.atom().getStart().getLine());

        return primaryType;
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
        subTrailer.setLineNumber(ctx.LSB().getSymbol().getLine());

        return super.visitSubTrailer(ctx);
    }

    @Override
    public Node visitCallTrailer(templateParser.CallTrailerContext ctx) {
        Node argList = null;

        if (ctx.argumentList() != null){
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

        if (ctx.expression() != null) {
            exprList = new ArrayList<>();

            for (templateParser.ExpressionContext expr : ctx.expression()) {
                exprList.add(this.visit(expr));
            }
        }

        ListType listType = new ListType(exprList);
        listType.setNodeName("list type");
        listType.setLineNumber(ctx.LSB().getSymbol().getLine());

        return listType;
    }

    @Override
    public Node visitDict(templateParser.DictContext ctx) {
        ArrayList<Node> pairList = null;

        if (ctx.pair() != null) {
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

        return super.visitPair(ctx);
    }
}
