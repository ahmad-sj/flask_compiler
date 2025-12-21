package visitors.jinja;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import models.jinja.blocks.JinjaExtendsBlock;
import models.jinja.blocks.inheritedBlock.InheritedBlock;
import models.jinja.blocks.inheritedBlock.InheritedBlockBody;
import models.jinja.blocks.inheritedBlock.InheritedBlockEnd;
import models.jinja.blocks.inheritedBlock.InheritedBlockStart;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.NodeVisitor;

import java.util.ArrayList;

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

        InheritedBlockStart inheritedBlockStart = new InheritedBlockStart(inheritedBlockStartName);
        inheritedBlockStart.setNodeName(inheritedBlockStartName + " block");
        inheritedBlockStart.setLineNumber(ctx.inheritBlockStart().J_INHERIT_BLOCK_NAME().getSymbol().getLine());

        InheritedBlockEnd inheritedBlockEnd = new InheritedBlockEnd(inheritedBlockStartName);
        inheritedBlockEnd.setNodeName(inheritedBlockStartName + " endblock");
        inheritedBlockEnd.setLineNumber(ctx.inheritBlockEnd().J_STMNT_ENDBLOCK().getSymbol().getLine());

        InheritedBlockBody inheritedBlockBody = null;
        if (ctx.inheritBlockBody() != null){
            inheritedBlockBody = (InheritedBlockBody) this.visit(ctx.inheritBlockBody());
        }

        return new InheritedBlock(inheritedBlockStart, inheritedBlockBody, inheritedBlockEnd);
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
}
