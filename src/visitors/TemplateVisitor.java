package visitors;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import symbols.SymbolTable;
import models.Template;

public class TemplateVisitor extends templateParserBaseVisitor<Template> {

    @Override
    public Template visitTemplate(templateParser.TemplateContext ctx) {
        Template template = new Template();

        NodeVisitor nodeVisitor = new NodeVisitor(new SymbolTable());

        for (int i = 0; i < ctx.getChildCount() - 1; i++) {
            Node child = nodeVisitor.visit(ctx.getChild(i));
            template.addNode(child);
        }
        return template;
    }
}