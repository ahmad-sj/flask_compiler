package visitors.html;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import models.html.attributes.Attribute;
import models.html.elements.Element;
import models.html.elements.ElementBody;
import models.html.tags.EndTag;
import models.html.tags.SelfClosingTag;
import models.html.tags.StartTag;
import models.html.tags.Tag;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.NodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlVisitor extends templateParserBaseVisitor<Node> {

    NodeVisitor nodeVisitor;

    public HtmlVisitor(NodeVisitor nodeVisitor) {
        this.nodeVisitor = nodeVisitor;
    }

    @Override
    public Node visitHtmlRegularElement(templateParser.HtmlRegularElementContext ctx) {

        StartTag startTag = (StartTag) this.visit(ctx.htmlStartTag());
        EndTag endTag = (EndTag) this.visit(ctx.htmlEndTag());
        ElementBody elementBody = null;

        if (ctx.htmlElementBody() != null) {
            elementBody = (ElementBody) visit(ctx.htmlElementBody());
            elementBody.setNodeName(ctx.htmlStartTag().START_TAG_NAME().getText() + " tag body");
            elementBody.setLineNumber(ctx.getStart().getLine());
        }
        return new Element(startTag, elementBody, endTag);
    }

    @Override
    public Node visitHtmlSelfClosingElement(templateParser.HtmlSelfClosingElementContext ctx) {
        return this.visit(ctx.htmlSelfClosingTag());
    }

    @Override
    public Node visitHtmlElementBody(templateParser.HtmlElementBodyContext ctx) {
        ArrayList<Node> nodes = new ArrayList<>();

        for (ParseTree child : ctx.children)
            nodes.add(this.nodeVisitor.visit(child));

        return new ElementBody(nodes);
    }

    @Override
    public Tag visitHtmlStartTag(templateParser.HtmlStartTagContext ctx) {
        String tagName = ctx.START_TAG_NAME().getText();

        List<templateParser.HtmlTagAttrContext> attributesContext = ctx.htmlTagAttr();

        AttributeVisitor attributeVisitor = new AttributeVisitor();

        ArrayList<Attribute> attributesList = new ArrayList<>();

        for (templateParser.HtmlTagAttrContext htmlTagAttrContext : attributesContext) {
            attributesList.add(attributeVisitor.visit(htmlTagAttrContext));
        }

        StartTag startTag = new StartTag(tagName, attributesList);
        startTag.setNodeName(tagName);
        startTag.setLineNumber(ctx.START_TAG_NAME().getSymbol().getLine());

        return startTag;
    }

    @Override
    public Tag visitHtmlEndTag(templateParser.HtmlEndTagContext ctx) {
        String tagName = ctx.END_TAG_NAME().getText();

        EndTag endTag = new EndTag(tagName);
        endTag.setNodeName(tagName);
        endTag.setLineNumber(ctx.END_TAG_NAME().getSymbol().getLine());

        return endTag;
    }

    @Override
    public Tag visitHtmlSelfClosingTag(templateParser.HtmlSelfClosingTagContext ctx) {
        String tagName = ctx.START_TAG_NAME().getText();

        List<templateParser.HtmlTagAttrContext> attributesContext = ctx.htmlTagAttr();

        AttributeVisitor attributeVisitor = new AttributeVisitor();

        ArrayList<Attribute> attributesList = new ArrayList<>();

        for (templateParser.HtmlTagAttrContext htmlTagAttrContext : attributesContext) {
            attributesList.add(attributeVisitor.visit(htmlTagAttrContext));
        }

        SelfClosingTag selfClosingTag = new SelfClosingTag(tagName, attributesList);
        selfClosingTag.setNodeName(tagName);
        selfClosingTag.setLineNumber(ctx.START_TAG_NAME().getSymbol().getLine());

        return selfClosingTag;
    }
}
