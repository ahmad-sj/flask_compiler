package visitors.jinja;

import models.Node;
import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.jinja.JinjaExpression;
import models.jinja.blocks.ElseBlock;
import models.jinja.blocks.ForBlock;
import models.jinja.blocks.ExtendsBlock;
import models.jinja.blocks.SubBlocks;
import models.jinja.blocks.InheritedBlock;
import models.jinja.dataTypes.IdType;
import org.antlr.v4.runtime.tree.TerminalNode;
import visitors.NodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class JinjaVisitor extends templateParserBaseVisitor<Node> {
    NodeVisitor nodeVisitor;
    ExpressionVisitor expressionVisitor = new ExpressionVisitor();

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
    public Node visitInheritBlock(templateParser.InheritBlockContext ctx) {
        String blockName = ctx.inheritBlockStart().ID().getText();

        // getting block body
        SubBlocks subBlocks = null;

        if (ctx.subBlock() != null) {
            ArrayList<Node> nodeList = new ArrayList<>();

            for (int i = 0; i < ctx.subBlock().size(); i++) {
                nodeList.add(this.visit(ctx.subBlock().get(i)));
            }

            subBlocks = new SubBlocks(nodeList);
            subBlocks.setNodeName("inherit block");
            subBlocks.setLineNumber(ctx.subBlock().getFirst().getStart().getLine());
        }
        InheritedBlock inheritedBlock = new InheritedBlock(blockName, subBlocks);
        inheritedBlock.setNodeName("block " + blockName);
        inheritedBlock.setLineNumber(ctx.getStart().getLine());

        return inheritedBlock;
    }

    @Override
    public Node visitJinjaAttrVal(templateParser.JinjaAttrValContext ctx) {
        Node expr = expressionVisitor.visit(ctx.expression());

        return new JinjaExpression(expr);
    }

    @Override
    public Node visitJinjaExpression(templateParser.JinjaExpressionContext ctx) {

        Node expression = expressionVisitor.visit(ctx.expression());
        expression.setNodeName("expression");
        expression.setLineNumber(ctx.jinjaExprStart().J_EXPR_START().getSymbol().getLine());

        return new JinjaExpression(expression);
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
        Node iterable = expressionVisitor.visit(ctx.forStartStatement().expression());
        iterable.setNodeName("for iterable expr");
        iterable.setLineNumber(ctx.forStartStatement().expression().getStart().getLine());

        // getting for body
        Node forBody = null;

        if (ctx.forBody() != null) {
            forBody = this.visit(ctx.forBody());
            forBody.setNodeName("for loop body");
            forBody.setLineNumber(ctx.forBody().getStart().getLine());
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

        for (int i = 0; i < ctx.subBlock().size(); i++)
            nodeList.add(this.visit(ctx.subBlock().get(i)));

        if (ctx.elseBlock() != null)
            nodeList.add(this.visit(ctx.elseBlock()));

        SubBlocks forBody = new SubBlocks(nodeList);
        forBody.setNodeName("for block body");
        forBody.setLineNumber(ctx.getStart().getLine());

        return forBody;
    }

    @Override
    public Node visitElseBlock(templateParser.ElseBlockContext ctx) {
        ArrayList<Node> nodeList = null;

        if (ctx.subBlock() != null) {
            nodeList = new ArrayList<>();

            for (int i = 0; i < ctx.subBlock().size(); i++) {
                nodeList.add(this.visit(ctx.subBlock().get(i)));
            }
        }

        ElseBlock elseBlock = new ElseBlock(nodeList);
        elseBlock.setNodeName("else block");
        elseBlock.setLineNumber(ctx.getStart().getLine());

        return elseBlock;
    }

    @Override
    public Node visitSubBlock(templateParser.SubBlockContext ctx) {
        return this.nodeVisitor.visit(ctx.children.getFirst());
    }
}
