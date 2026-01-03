package visitors;

import antlr.pythonParser;
import antlr.pythonParserBaseVisitor;
import models.Node;
import models.jinja.atoms.*;
import models.jinja.expressions.*;
import models.jinja.trailers.CallTrailer;
import models.jinja.trailers.MemberTrailer;
import models.jinja.trailers.SubTrailer;
import models.python.*;
import models.python.Exprs.CompareExpression;
import models.python.Exprs.EqualExpression;
import models.python.Exprs.MulExpression;
import models.python.IFSTMT.ElifNode;
import models.python.IFSTMT.ForNode;
import models.python.IFSTMT.IfNode;
import models.python.IFSTMT.WhileNode;
import models.python.literals.*;
import models.python.simpleStatements.ExprLineNode;
import models.python.simpleStatements.Pass;
import models.python.simpleStatements.ReturnLine;
import models.python.simpleStatements.importLines.MultiImport;
import models.python.simpleStatements.importLines.SingleImport;
import models.python.simpleStatements.AssignLine;

import java.util.ArrayList;
import java.util.List;

public class PythonVisitor extends pythonParserBaseVisitor<Node> {

    @Override
    public Node visitStmtList(pythonParser.StmtListContext ctx) {
        StatementListNode statementList = new StatementListNode("StmtList", ctx.getStart().getLine());

        for (var stmtCtx : ctx.stmt()) {
            Node stmtNode = visit(stmtCtx);
            if (stmtNode != null) {
                statementList.addStatement(stmtNode);
            }
        }

        return statementList;
    }

    @Override
    public Node visitProgSimple(pythonParser.ProgSimpleContext ctx) {
        StatementListNode statementList = new StatementListNode("ProgSimple", ctx.getStart().getLine());

        for (var stmtCtx : ctx.stmt()) {
            Node stmtNode = visit(stmtCtx);
            if (stmtNode != null) {
                statementList.addStatement(stmtNode);
            }
        }

        return statementList;
    }






    // simple statements

    @Override
    public Node visitSingleImport(pythonParser.SingleImportContext ctx) {
        Node importedName = this.visit(ctx.name()); // type NameList is returned
        importedName.setNodeName("imported name");

        // check if there is "AS NAME"
        IdType importAlias = null;
        if (ctx.NAME() != null) {
            importAlias = new IdType(ctx.NAME().getText());
            importAlias.setNodeName("alias for imported name");
            importAlias.setLineNumber(ctx.NAME().getSymbol().getLine());
        }

        SingleImport singleImport = new SingleImport(importedName, importAlias);
        singleImport.setNodeName("single import line");
        singleImport.setLineNumber(ctx.getStart().getLine());

        return singleImport;
    }

    @Override
    public Node visitMultiImport(pythonParser.MultiImportContext ctx) {
        Node fromName = this.visit(ctx.name()); // type DotTrailableName is returned
        fromName.setNodeName("multi import from name");

        // getting imported names
        ArrayList<Node> importedNamesList = new ArrayList<>();

        for (int i = 0; i < ctx.NAME().size(); i++) {
            IdType name = new IdType(ctx.NAME(i).getText());
            name.setNodeName("imported name");
            name.setLineNumber(ctx.NAME(i).getSymbol().getLine());

            importedNamesList.add(name);
        }

        MultiImport multiImport = new MultiImport(fromName, importedNamesList);
        multiImport.setNodeName("multi import line");
        multiImport.setLineNumber(ctx.getStart().getLine());

        return multiImport;
    }




    @Override
    public Node visitAssignLine(pythonParser.AssignLineContext ctx) {
        Node target = this.visit(ctx.target());
        target.setNodeName("assign target");
        target.setLineNumber(ctx.target().getStart().getLine());

        Node expr = this.visit(ctx.expr());
        expr.setNodeName("assigned expr");
        expr.setLineNumber(ctx.expr().getStart().getLine());

        AssignLine assignLine = new AssignLine(target, expr);
        assignLine.setNodeName("assign line");
        assignLine.setLineNumber(ctx.getStart().getLine());

        return assignLine;
    }

    @Override
    public Node visitReturnLine(pythonParser.ReturnLineContext ctx) {

        // إنشاء كائن ReturnLine مع lineNumber و nodeName
        ReturnLine returnLine = new ReturnLine(ctx.getStart().getLine(), "return line");

        if (ctx.returnExpr() != null) {
            // visit returnExpr
            pythonParser.ReturnExprContext returnExprCtx = ctx.returnExpr();

            // نتحقق إذا كان tuple return أو single return حسب labels
            if (returnExprCtx instanceof pythonParser.TupleReturnWithoutParensContext) {
                pythonParser.TupleReturnWithoutParensContext tupleCtx =
                        (pythonParser.TupleReturnWithoutParensContext) returnExprCtx;

                for (var exprCtx : tupleCtx.expr()) {
                    Node exprNode = visit(exprCtx);        // زيارة كل expr
                    exprNode.setNodeName("return expr");
                    exprNode.setLineNumber(exprCtx.getStart().getLine());
                    returnLine.addReturnValue(exprNode);
                }

            } else if (returnExprCtx instanceof pythonParser.SingleReturnContext) {
                pythonParser.SingleReturnContext singleCtx =
                        (pythonParser.SingleReturnContext) returnExprCtx;

                Node exprNode = visit(singleCtx.expr());
                exprNode.setNodeName("return expr");
                exprNode.setLineNumber(singleCtx.expr().getStart().getLine());
                returnLine.addReturnValue(exprNode);
            }
        }

        return returnLine;
    }


    @Override
    public Node visitTupleReturnWithoutParens(pythonParser.TupleReturnWithoutParensContext ctx) {
        return visitChildren(ctx); // مجرد default behavior
    }

    @Override
    public Node visitSingleReturn(pythonParser.SingleReturnContext ctx) {
        return visitChildren(ctx); // مجرد default behavior
    }


//    @Override
//    public Node visitExprLine(pythonParser.ExprLineContext ctx) {
//
//        Node expr = this.visit(ctx.expr());
//        expr.setNodeName("expr");
//        expr.setLineNumber(ctx.expr().getStart().getLine());
//
//        ExprLine exprLine = new ExprLine(expr);
//        exprLine.setNodeName("expr line");
//        exprLine.setLineNumber(ctx.getStart().getLine());
//
//        return exprLine;
//    }

    @Override
    public Node visitExprLine(pythonParser.ExprLineContext ctx) {

        Node exprNode = visit(ctx.expr());
        ExprLineNode node = new ExprLineNode(exprNode, ctx.getStart().getLine());

        return node;
    }

    @Override
    public Node visitExpr(pythonParser.ExprContext ctx) {
        // زيارة الجزء الأول قبل IF
        Node conditionNode = visit(ctx.orExpr(0));

        // إنشاء AST node
        models.python.expressions.ExprNode exprNode = new models.python.expressions.ExprNode(conditionNode, ctx.getStart().getLine());

        // إذا كان ternary expression موجود
        if (ctx.IF() != null) {
            Node ifNode = visit(ctx.orExpr(1));  // الجزء بعد IF
            Node elseNode = visit(ctx.expr());   // الجزء بعد ELSE (قد يكون expr كامل)
            exprNode.setTernary(ifNode, elseNode);
        }

        return exprNode;
    }


    @Override
    public Node visitPass(pythonParser.PassContext ctx) {
        Pass pass = new Pass();
        pass.setNodeName("pass");
        pass.setLineNumber(ctx.PASS().getSymbol().getLine());

        return pass;
    }

    // ================================


    @Override
    public Node visitId(pythonParser.IdContext ctx) {
        IdType idType = new IdType(ctx.NAME().getText());
        idType.setNodeName("id");
        idType.setLineNumber(ctx.NAME().getSymbol().getLine());

        return idType;
    }

    @Override
    public Node visitName(pythonParser.NameContext ctx) {
        Node id = this.visit(ctx.id());

        ArrayList<Node> trailerList = null;
        if (ctx.dotTrailer() != null && !ctx.dotTrailer().isEmpty()) {
            trailerList = new ArrayList<>();

            for (int i = 0; i < ctx.dotTrailer().size(); i++)
                trailerList.add(this.visit(ctx.dotTrailer(i)));
        }

        Name name = new Name(id, trailerList);
        name.setNodeName("name");
        name.setLineNumber(ctx.getStart().getLine());

        return name;
    }

    @Override
    public Node visitValue(pythonParser.ValueContext ctx) {
        Node baseValue = this.visit(ctx.baseValue());
        baseValue.setNodeName("base value");
        baseValue.setLineNumber(ctx.baseValue().getStart().getLine());

        ArrayList<Node> trailers = null;
        if (ctx.valueTrailer() != null && !ctx.valueTrailer().isEmpty()) {
            trailers = new ArrayList<>();

            for (int i = 0; i < ctx.valueTrailer().size(); i++)
                trailers.add(this.visit(ctx.valueTrailer(i)));
        }

        Value value = new Value(baseValue, trailers);
        value.setNodeName("value node");
        value.setLineNumber(ctx.getStart().getLine());

        return value;
    }

    // trailers

    @Override
    public Node visitDotTrailer(pythonParser.DotTrailerContext ctx) {
        Node name = new IdType(ctx.NAME().getText());
        name.setNodeName("id");
        name.setLineNumber(ctx.NAME().getSymbol().getLine());

        MemberTrailer memberTrailer = new MemberTrailer(name);
        memberTrailer.setNodeName("dot trailer");
        memberTrailer.setLineNumber(ctx.DOT().getSymbol().getLine());

        return memberTrailer;
    }

    @Override
    public Node visitSquareTrailer(pythonParser.SquareTrailerContext ctx) {
        Node expr = this.visit(ctx.expr());

        SubTrailer subTrailer = new SubTrailer(expr);
        subTrailer.setNodeName("square trailer");
        subTrailer.setLineNumber(ctx.getStart().getLine());

        return subTrailer;
    }

    @Override
    public Node visitCallArgs(pythonParser.CallArgsContext ctx) {
        Node argList = null;

        if (ctx.callList() != null) {
            argList = this.visit(ctx.callList());
        }

        CallTrailer callTrailer = new CallTrailer(argList);
        callTrailer.setNodeName("call trailer");
        callTrailer.setLineNumber(ctx.getStart().getLine());

        return callTrailer;
    }

    @Override
    public Node visitCallList(pythonParser.CallListContext ctx) {
        ArrayList<Node> argList = new ArrayList<>();

        for (int i = 0; i < ctx.callArg().size(); i++)
            argList.add(this.visit(ctx.callArg().get(i)));

        ArgumentList argumentList = new ArgumentList(argList);
        argumentList.setNodeName("call list");
        argumentList.setLineNumber(ctx.getStart().getLine());

        return argumentList;
    }

    @Override
    public Node visitCallArg(pythonParser.CallArgContext ctx) {
        Node expr = this.visit(ctx.expr());
        Node argName = null;

        if (ctx.NAME() != null) {
            argName = new IdType(ctx.NAME().getText());
            argName.setNodeName("id");
            argName.setLineNumber(ctx.NAME().getSymbol().getLine());
        }

        Argument argument = new Argument(expr, argName);
        argument.setNodeName("call arg");
        argument.setLineNumber(ctx.getStart().getLine());

        return argument;
    }

    // ===================================

    // expressions

    @Override
    public Node visitOrExpr(pythonParser.OrExprContext ctx) {
        List<pythonParser.AndExprContext> exprListCtx = ctx.andExpr();

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
    public Node visitAndExpr(pythonParser.AndExprContext ctx) {
        // checking if it's an "and" expr
        if (ctx.children.size() > 1) {

            ArrayList<Node> exprList = new ArrayList<>();
            for (int i = 0; i < ctx.equalExpr().size(); i++) {
                exprList.add(this.visit(ctx.equalExpr().get(i)));
            }

            AndExpression andExpression = new AndExpression(exprList);
            andExpression.setNodeName("and expr");
            andExpression.setLineNumber(ctx.getStart().getLine());

            return andExpression;
        }
        // check if remaining expr is "equal" expr
        else {
            return this.visit(ctx.children.getFirst());
        }
    }

    @Override
    public Node visitAddExpr(pythonParser.AddExprContext ctx) {
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
    public Node visitPlusOperator(pythonParser.PlusOperatorContext ctx) {
        Operator operator = new Operator(ctx.getText());
        operator.setLineNumber(ctx.getStart().getLine());
        operator.setNodeName("plus operator");

        return operator;
    }

    @Override
    public Node visitMinusOperator(pythonParser.MinusOperatorContext ctx) {
        Operator operator = new Operator(ctx.getText());
        operator.setLineNumber(ctx.getStart().getLine());
        operator.setNodeName("minus operator");

        return operator;
    }


    @Override
    public Node visitMulExpr(pythonParser.MulExprContext ctx) {

        List<Node> exprList = new ArrayList<>();
        List<Operator> operators = new ArrayList<>();

        // زيارة كل singleExpr
        for (var singleCtx : ctx.singleExpr()) {
            exprList.add(this.visit(singleCtx));
        }

        // زيارة كل muloperator
        for (var opCtx : ctx.muiltoperator()) {
            operators.add((Operator) this.visit(opCtx));
        }

        // إذا لم يوجد operator (single expr فقط)
        if (operators.isEmpty()) return exprList.get(0);

        // إنشاء MulExpression
        models.python.Exprs.MulExpression  mulExpr = new MulExpression (exprList, operators);
        mulExpr.setNodeName("mul expr");
        mulExpr.setLineNumber(ctx.getStart().getLine());

        return mulExpr;
    }



    @Override
    public Node visitCompareExpr(pythonParser.CompareExprContext ctx) {
        if (ctx.children.size() > 1) {
            CompareExpression cmpExpr = new CompareExpression();
            cmpExpr.setNodeName("compare expr");
            cmpExpr.setLineNumber(ctx.getStart().getLine());

            // visit addExpr
            for (int i = 0; i < ctx.addExpr().size(); i++) {
                cmpExpr.addExpr(visit(ctx.addExpr(i)));
            }

            // store operators
            for (var opToken : ctx.getTokens(pythonParser.LESSTHAN)) cmpExpr.addOperator(opToken.getText());
            for (var opToken : ctx.getTokens(pythonParser.GREATERTHAN)) cmpExpr.addOperator(opToken.getText());
            for (var opToken : ctx.getTokens(pythonParser.LESSOREQUAL)) cmpExpr.addOperator(opToken.getText());
            for (var opToken : ctx.getTokens(pythonParser.GREATEROREQUAL)) cmpExpr.addOperator(opToken.getText());

            return cmpExpr;
        } else {
            return visit(ctx.addExpr(0));
        }
    }

    @Override
    public Node visitEqualExpr(pythonParser.EqualExprContext ctx) {
        if (ctx.children.size() > 1) {
            EqualExpression eqExpr = new EqualExpression();
            eqExpr.setNodeName("equal expr");
            eqExpr.setLineNumber(ctx.getStart().getLine());

            // visit compareExpr
            for (int i = 0; i < ctx.compareExpr().size(); i++) {
                eqExpr.addExpr(visit(ctx.compareExpr(i)));
            }

            // store operators
            for (var opToken : ctx.getTokens(pythonParser.EQUALEQUAL)) eqExpr.addOperator(opToken.getText());
            for (var opToken : ctx.getTokens(pythonParser.NOTEQUAL)) eqExpr.addOperator(opToken.getText());

            return eqExpr;
        } else {
            return visit(ctx.compareExpr(0));
        }
    }





    // literals
    @Override
    public Node visitInt(pythonParser.IntContext ctx) {
        IntType intType = new IntType(ctx.INT().getText());
        intType.setNodeName("int type");
        intType.setLineNumber(ctx.INT().getSymbol().getLine());

        return intType;
    }

    @Override
    public Node visitFloat(pythonParser.FloatContext ctx) {
        FloatType floatType = new FloatType(ctx.FLOAT().getText());
        floatType.setNodeName("float type");
        floatType.setLineNumber(ctx.FLOAT().getSymbol().getLine());

        return floatType;
    }

    @Override
    public Node visitString(pythonParser.StringContext ctx) {
        StringType stringType = new StringType(ctx.STRING().getText());
        stringType.setNodeName("string type");
        stringType.setLineNumber(ctx.STRING().getSymbol().getLine());

        return stringType;
    }

    @Override
    public Node visitTrue(pythonParser.TrueContext ctx) {
        TrueValue trueValue = new TrueValue();
        trueValue.setNodeName("true");
        trueValue.setLineNumber(ctx.TRUE().getSymbol().getLine());

        return trueValue;
    }

    @Override
    public Node visitFalse(pythonParser.FalseContext ctx) {
        FalseValue falseValue = new FalseValue();
        falseValue.setNodeName("true");
        falseValue.setLineNumber(ctx.FALSE().getSymbol().getLine());

        return falseValue;
    }

    @Override
    public Node visitNone(pythonParser.NoneContext ctx) {
        NoneValue noneValue = new NoneValue();
        noneValue.setNodeName("true");
        noneValue.setLineNumber(ctx.NONE().getSymbol().getLine());

        return noneValue;
    }

    @Override
    public Node visitListVal(pythonParser.ListValContext ctx) {
        ArrayList<Node> exprList = null;

        if (ctx.listItem() != null && !ctx.listItem().isEmpty()) {
            exprList = new ArrayList<>();

            for (int i = 0; i < ctx.listItem().size(); i++)
                exprList.add(this.visit(ctx.listItem(i).expr()));
        }

        ListType list = new ListType(exprList);
        list.setNodeName("list type");
        list.setLineNumber(ctx.getStart().getLine());

        return list;
    }

    @Override
    public Node visitDictVal(pythonParser.DictValContext ctx) {
        ArrayList<Node> itemList = null;

        if (ctx.dictItem() != null && !ctx.dictItem().isEmpty()) {
            itemList = new ArrayList<>();

            for (int i = 0; i < ctx.dictItem().size(); i++)
                itemList.add(this.visit(ctx.dictItem(i)));
        }

        Dict dict = new Dict(itemList);
        dict.setNodeName("dictionary literal");
        dict.setLineNumber(ctx.getStart().getLine());

        return dict;
    }

    @Override
    public Node visitDictItem(pythonParser.DictItemContext ctx) {
        Node literal = this.visit(ctx.literal());
        Node expr = this.visit(ctx.expr());

        DictItem dictItem = new DictItem(literal, expr);
        dictItem.setNodeName("dict item");
        dictItem.setLineNumber(ctx.getStart().getLine());

        return dictItem;
    }




    @Override
    public Node visitFunc(pythonParser.FuncContext ctx) {

        int line = ctx.start.getLine();
        String name = ctx.NAME().getText();

        // ---------- parameters ----------
        List<String> parameters = new ArrayList<>();

        if (ctx.funcArgs().argsNames() != null) {
            for (var id : ctx.funcArgs().argsNames().NAME()) {
                parameters.add(id.getText());
            }
        }

        // ---------- decorator ----------
        List<Node> decorators = null;

        if (ctx.decorator() != null) {
            decorators = new ArrayList<>();
            decorators.add(visit(ctx.decorator()));
        }

        // ---------- block ----------
        BlockNode body = null;
        if (ctx.block() != null) {
            body = (BlockNode) visit(ctx.block());
        }

        return new FuncNode(
                line,
                name,
                parameters,
                decorators,
                body
        );
    }

//    @Override
//    public Node visitDecorator(pythonParser.DecoratorContext ctx) {
//
//        int line = ctx.start.getLine();
//        String name = ctx.name().getText();
//
//        List<Node> callArgs = null;
//
//        if (ctx.callArgs() != null) {
//            callArgs = new ArrayList<>();
//            for (var expr : ctx.callArgs().expr()) {
//                callArgs.add(visit(expr)); // لاحقًا ExprNode
//            }
//        }
//
//        return new DecoratorNode(line, name, callArgs);
//    }

    @Override
    public Node visitBlock(pythonParser.BlockContext ctx) {

        int line = ctx.start.getLine();
        List<Node> statements = new ArrayList<>();

        for (var stmt : ctx.stmtList().stmt()) {
            Node stmtNode = visit(stmt);
            if (stmtNode != null) {
                statements.add(stmtNode);
            }
        }

        return new BlockNode(line, statements);
    }




    //IfBLock


    @Override
    public Node visitIfBlock(pythonParser.IfBlockContext ctx) {

        int line = ctx.start.getLine();

        // ---------- IF condition ----------
        Node ifCondition = visit(ctx.expr(0));
        BlockNode thenBlock = (BlockNode) visit(ctx.block(0));

        // ---------- ELIF blocks ----------
        List<ElifNode> elifBlocks = new ArrayList<>();
        int numElif = ctx.ELIF().size();
        for (int i = 0; i < numElif; i++) {
            Node elifCond = visit(ctx.expr(i + 1)); // expr بعد كل ELIF
            BlockNode elifBlock = (BlockNode) visit(ctx.block(i + 1));
            elifBlocks.add(new ElifNode(ctx.ELIF(i).getSymbol().getLine(), elifCond, elifBlock));
        }

        // ---------- ELSE block ----------
        BlockNode elseBlock = null;
        if (ctx.ELSE() != null) {
            int totalBlocks = ctx.block().size();
            elseBlock = (BlockNode) visit(ctx.block(totalBlocks - 1));
        }

        return new IfNode(line, ifCondition, thenBlock, elifBlocks, elseBlock);
    }



    //forBLock
    @Override
    public Node visitForBlock(pythonParser.ForBlockContext ctx) {

        int line = ctx.start.getLine();

        String iterator = ctx.NAME().getText();          // الاسم بعد FOR
        Node iterable = visit(ctx.expr());               // expr بعد IN
        BlockNode body = (BlockNode) visit(ctx.block()); // جسم الحلقة

        return new ForNode(line, iterator, iterable, body);
    }


    //WhileBlock

    @Override
    public Node visitWhileBlock(pythonParser.WhileBlockContext ctx) {

        int line = ctx.start.getLine();

        Node condition = visit(ctx.expr());               // expr بعد WHILE
        BlockNode body = (BlockNode) visit(ctx.block());  // جسم الحلقة

        return new WhileNode(line, condition, body);
    }



}
