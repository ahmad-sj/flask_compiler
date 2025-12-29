/*
package visitors.html;

import models.html.attributes.Attribute;
import models.html.tags.EndTag;
import models.html.tags.SelfClosingTag;
import models.html.tags.StartTag;
import models.html.tags.Tag;

import java.util.ArrayList;
import java.util.List;

public class TagVisitor extends templateParserBaseVisitor<Tag> {
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
*/
