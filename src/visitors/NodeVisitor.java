package visitors;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import models.NormalText;
import visitors.html.HtmlVisitor;
import visitors.jinja.JinjaVisitor;

public class NodeVisitor extends templateParserBaseVisitor<Node> {

    HtmlVisitor htmlVisitor = new HtmlVisitor();
    JinjaVisitor jinjaVisitor = new JinjaVisitor();

    @Override
    public Node visitExtendsBlock(templateParser.ExtendsBlockContext ctx) {
        return jinjaVisitor.visit(ctx);
    }

    @Override
    public Node visitJinjaBlock(templateParser.JinjaBlockContext ctx) {
        return jinjaVisitor.visit(ctx);
    }

    @Override
    public Node visitJinjaExpression(templateParser.JinjaExpressionContext ctx) {
        return jinjaVisitor.visit(ctx);
    }

    @Override
    public Node visitHtmlElement(templateParser.HtmlElementContext ctx) {
        return htmlVisitor.visit(ctx);
    }

    @Override
    public Node visitTemplateText(templateParser.TemplateTextContext ctx) {
        NormalText normalText = new NormalText(ctx.NORMAL_TEXT().getText());
        normalText.setNodeName(ctx.NORMAL_TEXT().getText());
        normalText.setLineNumber(ctx.NORMAL_TEXT().getSymbol().getLine());

        return normalText;
    }

}
