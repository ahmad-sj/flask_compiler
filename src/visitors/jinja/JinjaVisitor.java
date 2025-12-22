package visitors.jinja;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import models.jinja.JinjaId;
import models.jinja.blocks.JinjaExtendsBlock;
import models.jinja.blocks.forBlock.*;
import models.jinja.blocks.inheritedBlock.InheritedBlock;
import models.jinja.blocks.inheritedBlock.InheritedBlockBody;
import models.jinja.blocks.inheritedBlock.InheritedBlockEndStatement;
import models.jinja.blocks.inheritedBlock.InheritedBlockStartStatement;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.NodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class JinjaVisitor extends templateParserBaseVisitor<Node> {
    @Override
    public Node visitExtendsBlock(templateParser.ExtendsBlockContext ctx) {
        String extendsString = ctx.J_EXTENDS_STRING().getText();

        JinjaExtendsBlock jinjaExtendsBlock = new JinjaExtendsBlock(extendsString);
        jinjaExtendsBlock.setNodeName(ctx.J_STMNT_EXTENDS().getText());
        jinjaExtendsBlock.setLineNumber(ctx.J_EXTENDS_STRING().getSymbol().getLine());

        return jinjaExtendsBlock;
    }

    @Override
    public Node visitInheritBlock(templateParser.InheritBlockContext ctx) {
        String inheritedBlockStartName = ctx.inheritBlockStart().J_INHERIT_BLOCK_NAME().getText();
//        String inheritedBlockEndName = ctx.inheritBlockEnd().J_STMNT_ENDBLOCK().getText();

        InheritedBlockStartStatement inheritedBlockStartStatement = new InheritedBlockStartStatement(inheritedBlockStartName);
        inheritedBlockStartStatement.setNodeName(inheritedBlockStartName + " block");
        inheritedBlockStartStatement.setLineNumber(ctx.inheritBlockStart().J_INHERIT_BLOCK_NAME().getSymbol().getLine());

        InheritedBlockEndStatement inheritedBlockEndStatement = new InheritedBlockEndStatement(inheritedBlockStartName);
        inheritedBlockEndStatement.setNodeName(inheritedBlockStartName + " endblock");
        inheritedBlockEndStatement.setLineNumber(ctx.inheritBlockEnd().J_STMNT_ENDBLOCK().getSymbol().getLine());

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
    public Node visitForBlock(templateParser.ForBlockContext ctx) {
        JinjaForLoopVisitor jinjaForLoopVisitor = new JinjaForLoopVisitor();

        ForBlockStartStatement forBlockStartStatement =
                (ForBlockStartStatement) jinjaForLoopVisitor.visit(ctx.forStartStatement());

        ForBlockBody forBlockBody = (ForBlockBody) jinjaForLoopVisitor.visit(ctx.forBody());

        ForBlockEndStatement forBlockEndStatement =
                (ForBlockEndStatement) jinjaForLoopVisitor.visit(ctx.forEndStatement());

        return new ForBlock(forBlockStartStatement, forBlockBody, forBlockEndStatement);
    }
}
