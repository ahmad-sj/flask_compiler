package visitors.jinja;

import models.Node;
import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.NodeBody;
import models.jinja.JinjaExpression;
import models.jinja.blocks.*;
import models.jinja.dataTypes.IdType;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import visitors.NodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class JinjaVisitor extends templateParserBaseVisitor<Node> {
    NodeVisitor nodeVisitor;

    public JinjaVisitor(NodeVisitor nodeVisitor) {
        this.nodeVisitor = nodeVisitor;
    }

    @Override
    public Node visitExtendsBlock(templateParser.ExtendsBlockContext ctx) {
        String templateName = ctx.STRING().getText();

        ExtendsBlock extendsBlock = new ExtendsBlock(templateName);
        extendsBlock.setNodeName("extends block: " + templateName);
        extendsBlock.setLineNumber(ctx.getStart().getLine());

        return extendsBlock;
    }

    @Override
    public Node visitSetStatement(templateParser.SetStatementContext ctx) {
        Token idToken = ctx.ID().getSymbol();

        IdType id = new IdType(idToken.getText());
        id.setNodeName("set statement id");
        id.setLineNumber(idToken.getLine());

        Node idValueExpr = this.visit(ctx.expression());
        idValueExpr.setNodeName("set statement id value");
        idValueExpr.setLineNumber(ctx.expression().getStart().getLine());

        SetStatement setStatement = new SetStatement(id, idValueExpr);
        setStatement.setNodeName("set statement");
        setStatement.setLineNumber(ctx.getStart().getLine());

        return setStatement;
    }

    @Override
    public Node visitInheritBlock(templateParser.InheritBlockContext ctx) {
        String blockName = ctx.inheritBlockStart().ID().getText();

        // getting block body
        NodeBody nodeBody = null;

        if (ctx.subBlock() != null && !ctx.subBlock().isEmpty()) {
            ArrayList<Node> nodeList = new ArrayList<>();

            for (int i = 0; i < ctx.subBlock().size(); i++) {
                nodeList.add(this.visit(ctx.subBlock().get(i)));
            }

            nodeBody = new NodeBody(nodeList);
            nodeBody.setNodeName("inherit block");
            nodeBody.setLineNumber(ctx.getStart().getLine());
        }
        InheritedBlock inheritedBlock = new InheritedBlock(blockName, nodeBody);
        inheritedBlock.setNodeName("block " + blockName);
        inheritedBlock.setLineNumber(ctx.getStart().getLine());

        return inheritedBlock;
    }

    @Override
    public Node visitJinjaAttrVal(templateParser.JinjaAttrValContext ctx) {
        Node expr = this.visit(ctx.expression());
        expr.setNodeName("expr as html attr");
        expr.setLineNumber(ctx.getStart().getLine());

        return new JinjaExpression(expr);
    }

    @Override
    public Node visitJinjaExpression(templateParser.JinjaExpressionContext ctx) {

        Node expression = this.visit(ctx.expression());

        JinjaExpression jinjaExpression = new JinjaExpression(expression);
        jinjaExpression.setNodeName("jinja expression");
        jinjaExpression.setLineNumber(ctx.jinjaExprStart().getStart().getLine());

        return jinjaExpression;
    }

    public Node visitId(TerminalNode Id) {
        IdType idType = new IdType(Id.getText());
        idType.setNodeName("id: " + Id.getText());
        idType.setLineNumber(Id.getSymbol().getLine());

        return idType;
    }

    @Override
    public Node visitForBlock(templateParser.ForBlockContext ctx) {
        // getting loop vars
        ArrayList<Node> loopVarList = new ArrayList<>();
        List<TerminalNode> loopVarCtxList = ctx.forStartStatement().ID();

        for (int i = 0; i < loopVarCtxList.size(); i++)
            loopVarList.add(this.visitId(loopVarCtxList.get(i)));

        // getting iterable expr
        Node iterable = this.visit(ctx.forStartStatement().expression());
        iterable.setNodeName("for iterable expr");
        iterable.setLineNumber(ctx.forStartStatement().expression().getStart().getLine());

        // getting for body
        Node forBody = null;

        if (ctx.forBody() != null) {
            forBody = this.visit(ctx.forBody());
        }

        // return for block node
        ForBlock forBlock = new ForBlock(loopVarList, iterable, forBody);
        forBlock.setNodeName("for block");
        forBlock.setLineNumber(ctx.getStart().getLine());

        return forBlock;
    }

    @Override
    public Node visitForBody(templateParser.ForBodyContext ctx) {
        ArrayList<Node> nodeList = new ArrayList<>();

        for (int i = 0; i < ctx.children.size(); i++)
            nodeList.add(this.visit(ctx.children.get(i)));

        NodeBody nodeBody = new NodeBody(nodeList);
        nodeBody.setNodeName("for block body");
        nodeBody.setLineNumber(ctx.getStart().getLine());

        return nodeBody;
    }

    @Override
    public Node visitElseBlock(templateParser.ElseBlockContext ctx) {
        NodeBody nodeBody = null;

        if (ctx.subBlock() != null && !ctx.subBlock().isEmpty()) {
            ArrayList<Node> nodeList = new ArrayList<>();

            for (int i = 0; i < ctx.subBlock().size(); i++)
                nodeList.add(this.visit(ctx.subBlock().get(i)));

            nodeBody = new NodeBody(nodeList);
            nodeBody.setNodeName("else block body");
            nodeBody.setLineNumber(ctx.getStart().getLine());
        }

        ElseBlock elseBlock = new ElseBlock(nodeBody);
        elseBlock.setNodeName("else block");
        elseBlock.setLineNumber(ctx.getStart().getLine());

        return elseBlock;
    }

    @Override
    public Node visitElifBlock(templateParser.ElifBlockContext ctx) {
        Node condition = this.visit(ctx.expression());
        condition.setNodeName("elif condition");
        condition.setLineNumber(ctx.expression().getStart().getLine());

        NodeBody nodeBody = null;

        if (ctx.subBlock() != null && !ctx.subBlock().isEmpty()) {
            ArrayList<Node> nodeList = new ArrayList<>();

            for (int i = 0; i < ctx.subBlock().size(); i++) {
                nodeList.add(this.visit(ctx.subBlock().get(i)));
            }

            nodeBody = new NodeBody(nodeList);
            nodeBody.setNodeName("elif body");
            nodeBody.setLineNumber(ctx.subBlock().getFirst().getStart().getLine());
        }

        ElifBlock elifBlock = new ElifBlock(condition, nodeBody);
        elifBlock.setNodeName("elif block");
        elifBlock.setLineNumber(ctx.getStart().getLine());

        return elifBlock;
    }

    @Override
    public Node visitSubBlock(templateParser.SubBlockContext ctx) {
        return this.visit(ctx.children.getFirst());
    }

    @Override
    public Node visitIfBlock(templateParser.IfBlockContext ctx) {
        // getting if condition
        Node condition = this.visit(ctx.ifStatmentStart().expression());
        condition.setNodeName("if condition");
        condition.setLineNumber(ctx.ifStatmentStart().expression().getStart().getLine());

        // getting if body
        NodeBody nodeBody = null;

        if (ctx.ifBody() != null) {
            ArrayList<Node> nodeList = new ArrayList<>();

            for (int i = 0; i < ctx.ifBody().children.size(); i++) {
                nodeList.add(this.visit(ctx.ifBody().children.get(i)));
            }

            nodeBody = new NodeBody(nodeList);
            nodeBody.setNodeName("if body");
            nodeBody.setLineNumber(ctx.ifBody().getStart().getLine());
        }

        // return if block object
        IfBlock ifBlock = new IfBlock(condition, nodeBody);
        ifBlock.setNodeName("if block");
        ifBlock.setLineNumber(ctx.getStart().getLine());

        return ifBlock;
    }

    // redirection calls
    @Override
    public Node visitHtmlElement(templateParser.HtmlElementContext ctx) {
        return nodeVisitor.htmlVisitor.visit(ctx);
    }

    @Override
    public Node visitTemplateText(templateParser.TemplateTextContext ctx) {
        return nodeVisitor.visit(ctx);
    }

    @Override
    public Node visitExpression(templateParser.ExpressionContext ctx) {
        return this.nodeVisitor.expressionVisitor.visit(ctx);
    }
}
