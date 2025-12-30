package visitors;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import symbols.SymbolTable;
import models.Template;

public class TemplateVisitor extends templateParserBaseVisitor<Template> {

    String templateName;
    SymbolTable symbolTable;

    public TemplateVisitor(String fileName) {
        this.templateName = fileName;
        this.symbolTable = new SymbolTable();
    }

    public TemplateVisitor(String templateName, SymbolTable symbolTable) {
        this.templateName = templateName;
        this.symbolTable = symbolTable;
    }

    @Override
    public Template visitTemplate(templateParser.TemplateContext ctx) {
        Template template = new Template(templateName);

        NodeVisitor nodeVisitor = new NodeVisitor(symbolTable);

        for (int i = 0; i < ctx.getChildCount() - 1; i++) {
            Node child = nodeVisitor.visit(ctx.getChild(i));
            template.addNode(child);
        }

        symbolTable.exitScope();

        return template;
    }
}