package visitors;

import antlr.pythonParser;
import antlr.pythonParserBaseVisitor;
import models.Node;
import models.python.*;
import models.python.importLines.MultiImport;
import models.python.importLines.SingleImport;
import models.python.simpleStatements.AssignLine;

import java.util.ArrayList;

public class PythonVisitor extends pythonParserBaseVisitor<Node> {

    @Override
    public Node visitStmtList(pythonParser.StmtListContext ctx) {
        ArrayList<Node> stmtList = new ArrayList<>();

        for (int i = 0; i < ctx.stmt().size(); i++)
            stmtList.add(this.visit(ctx.stmt(i)));

        StatementList statementList = new StatementList(stmtList);
        statementList.setNodeName("statement list");
        statementList.setLineNumber(ctx.getStart().getLine());

        return statementList;
    }

    @Override
    public Node visitSingleImport(pythonParser.SingleImportContext ctx) {
        Node importedName = this.visit(ctx.name()); // type NameList is returned
        importedName.setNodeName("imported name");

        // check if there is "AS NAME"
        TypeName importAlias = null;
        if (ctx.NAME() != null) {
            importAlias = new TypeName(ctx.NAME().getText());
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
            TypeName name = new TypeName(ctx.NAME(i).getText());
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
    public Node visitName(pythonParser.NameContext ctx) {

        ArrayList<Node> tempList = new ArrayList<>();

        for (int i = 0; i < ctx.NAME().size(); i++) {
            TypeName typeName = new TypeName(ctx.NAME(i).getText());
            typeName.setNodeName("name");
            typeName.setLineNumber(ctx.NAME(i).getSymbol().getLine());

            tempList.add(typeName);
        }

        DotTrailableName dotTrailableName = new DotTrailableName(tempList);
        dotTrailableName.setNodeName("dot trailable name");
        dotTrailableName.setLineNumber(ctx.getStart().getLine());

        return dotTrailableName;
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
    public Node visitTarget(pythonParser.TargetContext ctx) {
        if (ctx.NAME() != null) {
            TypeName typeName = new TypeName(ctx.NAME().getText());
            typeName.setNodeName("name");
            typeName.setLineNumber(ctx.NAME().getSymbol().getLine());

            return typeName;
        } else {
            return this.visit(ctx.value());
        }
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

    @Override
    public Node visitBaseValue(pythonParser.BaseValueContext ctx) {
        return super.visitBaseValue(ctx);
    }
}
