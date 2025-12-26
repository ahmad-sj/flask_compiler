package visitors.jinja;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import models.jinja.JinjaExpression;
import models.jinja.blocks.JinjaExtendsBlock;
import models.jinja.blocks.inheritedBlock.InheritedBlock;
import models.jinja.blocks.inheritedBlock.InheritedBlockBody;
import models.jinja.blocks.inheritedBlock.InheritedBlockEndStatement;
import models.jinja.blocks.inheritedBlock.InheritedBlockStartStatement;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.NodeVisitor;

import java.util.ArrayList;

public class JinjaVisitor extends templateParserBaseVisitor<Node> {
    ExpressionVisitor expressionVisitor = new ExpressionVisitor();

    @Override
    public Node visitExtendsBlock(templateParser.ExtendsBlockContext ctx) {
        String extendsString = ctx.STRING().getText();

        JinjaExtendsBlock jinjaExtendsBlock = new JinjaExtendsBlock(extendsString);
        jinjaExtendsBlock.setNodeName(ctx.EXTENDS().getText());
        jinjaExtendsBlock.setLineNumber(ctx.STRING().getSymbol().getLine());

        return jinjaExtendsBlock;
    }

    @Override
    public Node visitInheritBlock(templateParser.InheritBlockContext ctx) {
        String inheritedBlockStartName = ctx.inheritBlockStart().ID().getText();
//        String inheritedBlockEndName = ctx.inheritBlockEnd().J_STMNT_ENDBLOCK().getText();

        InheritedBlockStartStatement inheritedBlockStartStatement = new InheritedBlockStartStatement(inheritedBlockStartName);
        inheritedBlockStartStatement.setNodeName(inheritedBlockStartName + " block");
        inheritedBlockStartStatement.setLineNumber(ctx.inheritBlockStart().ID().getSymbol().getLine());

        InheritedBlockEndStatement inheritedBlockEndStatement = new InheritedBlockEndStatement(inheritedBlockStartName);
        inheritedBlockEndStatement.setNodeName(inheritedBlockStartName + " endblock");
        inheritedBlockEndStatement.setLineNumber(ctx.inheritBlockEnd().ENDBLOCK().getSymbol().getLine());

        InheritedBlockBody inheritedBlockBody = null;
        if (ctx.inheritBlockBody() != null){
            inheritedBlockBody = (InheritedBlockBody) this.visit(ctx.inheritBlockBody());
        }

        return new InheritedBlock(inheritedBlockStartStatement, inheritedBlockBody, inheritedBlockEndStatement);
    }

    @Override
    public Node visitInheritBlockBody(templateParser.InheritBlockBodyContext ctx) {
        ArrayList<Node> nodes = new ArrayList<>();
        NodeVisitor nodeVisitor = new NodeVisitor();

        for (ParseTree child : ctx.children) {
            nodes.add(nodeVisitor.visit(child));
        }

        return new InheritedBlockBody(nodes);
    }

    @Override
    public Node visitJinjaAttrVal(templateParser.JinjaAttrValContext ctx) {
        Node expr = expressionVisitor.visit(ctx.expression());

        return new JinjaExpression(expr);
    }

    @Override
    public Node visitJinjaExpression(templateParser.JinjaExpressionContext ctx) {

        Node expression = new ExpressionVisitor().visit(ctx.expression());
        expression.setNodeName("expression");
        expression.setLineNumber(ctx.jinjaExprStart().J_EXPR_START().getSymbol().getLine());

        return new JinjaExpression(expression);
    }


}
