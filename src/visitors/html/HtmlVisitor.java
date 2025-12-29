package visitors.html;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import models.NodeBody;
import models.css.CssBlock;
import models.css.properties.Property;
import models.css.properties.PropertyValue;
import models.css.selectors.*;
import models.html.attributes.*;
import models.html.elements.HtmlRegularElement;
import models.html.elements.HtmlSelfClosingElement;
import models.html.elements.HtmlStyleElement;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import visitors.NodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlVisitor extends templateParserBaseVisitor<Node> {

    public NodeVisitor nodeVisitor;

    public HtmlVisitor(NodeVisitor nodeVisitor) {
        this.nodeVisitor = nodeVisitor;
    }

    @Override
    public Node visitHtmlRegularElement(templateParser.HtmlRegularElementContext ctx) {
        // getting tag name
        String tagName = ctx.htmlStartTag().START_TAG_NAME().getText();

        // getting tag attributes
        ArrayList<Node> attrList = null;

        if (ctx.htmlStartTag().htmlTagAttr() != null) {
            attrList = new ArrayList<>();

            for (int i = 0; i < ctx.htmlStartTag().htmlTagAttr().size(); i++)
                attrList.add(this.visit(ctx.htmlStartTag().htmlTagAttr().get(i)));
        }

        //getting element body
        Node elementBody = null;

        if (ctx.htmlElementBody() != null) {
            elementBody = this.visit(ctx.htmlElementBody());
            elementBody.setNodeName(tagName + " element body");
            elementBody.setLineNumber(ctx.htmlElementBody().getStart().getLine());
        }

        // return html element
        HtmlRegularElement htmlRegularElement = new HtmlRegularElement(tagName, attrList, elementBody);
        htmlRegularElement.setNodeName(tagName + " html element");
        htmlRegularElement.setLineNumber(ctx.getStart().getLine());

        return htmlRegularElement;
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

        return new NodeBody(nodes);
    }

    @Override
    public Node visitHtmlSelfClosingTag(templateParser.HtmlSelfClosingTagContext ctx) {
        String tagName = ctx.START_TAG_NAME().getText();

        List<templateParser.HtmlTagAttrContext> attributesContext = ctx.htmlTagAttr();

        // getting element attributes
        ArrayList<Node> attrList = null;

        if (ctx.htmlTagAttr() != null) {
            attrList = new ArrayList<>();

            for (int i = 0; i < ctx.htmlTagAttr().size(); i++)
                attrList.add(this.visit(ctx.htmlTagAttr().get(i)));
        }

        HtmlSelfClosingElement htmlSelfClosingElement = new HtmlSelfClosingElement(tagName, attrList);
        htmlSelfClosingElement.setNodeName(tagName);
        htmlSelfClosingElement.setLineNumber(ctx.START_TAG_NAME().getSymbol().getLine());

        return htmlSelfClosingElement;
    }

    @Override
    public Node visitBooleanAttr(templateParser.BooleanAttrContext ctx) {
        String attrName = ctx.ATTR_NAME().getText();

        BooleanAttribute booleanAttribute = new BooleanAttribute(attrName);
        booleanAttribute.setNodeName(attrName);
        booleanAttribute.setLineNumber(ctx.ATTR_NAME().getSymbol().getLine());

        return booleanAttribute;
    }

    @Override
    public Node visitAttrWithUnquotedVal(templateParser.AttrWithUnquotedValContext ctx) {
        String attributeName = ctx.ATTR_NAME().getText();
        String attributeValue = ctx.ATTR_VALUE_UNQUOTED().getText();

        UnquotedAttribute unquotedAttribute = new UnquotedAttribute(attributeName, attributeValue);
        unquotedAttribute.setNodeName(attributeName);
        unquotedAttribute.setLineNumber(ctx.ATTR_NAME().getSymbol().getLine());

        return unquotedAttribute;
    }

    @Override
    public Node visitAttrWithQuotedVal(templateParser.AttrWithQuotedValContext ctx) {
        String attributeName = ctx.ATTR_NAME().getText();

        // getting attribute values
        ArrayList<Node> attrValList = null;

        if (ctx.quotedValElem() != null) {
            attrValList = new ArrayList<>();

            for (int i = 0; i < ctx.quotedValElem().size(); i++)
                attrValList.add(this.visit(ctx.quotedValElem().get(i)));
        }

        QuotedAttribute quotedAttribute = new QuotedAttribute(attributeName, attrValList);
        quotedAttribute.setNodeName("html element attribute: " + attributeName);
        quotedAttribute.setLineNumber(ctx.ATTR_NAME().getSymbol().getLine());

        return quotedAttribute;
    }

    @Override
    public Node visitQuotedValElem(templateParser.QuotedValElemContext ctx) {
        if (ctx.jinjaAttrVal() != null) {
            Node jinjaExprAsAttrVal = nodeVisitor.jinjaVisitor.visit(ctx.jinjaAttrVal());
            jinjaExprAsAttrVal.setNodeName("jinja expr as atrr val");
            jinjaExprAsAttrVal.setLineNumber(ctx.jinjaAttrVal().getStart().getLine());

            return jinjaExprAsAttrVal;
        } else {
            Token attrValCtx = ctx.ATTR_VAL_TEXT().getSymbol();

            AttributeValue attributeValue = new AttributeValue(attrValCtx.getText());
            attributeValue.setNodeName("html" + attrValCtx.getText());
            attributeValue.setLineNumber(attrValCtx.getLine());

            return attributeValue;
        }
    }

    @Override
    public Node visitStyleAttr(templateParser.StyleAttrContext ctx) {
        String attrName = ctx.STYLE_ATTR().getText(); // attrName = style

        // getting properties
        ArrayList<Node> propList = null;

        if (ctx.inlineStyleProp() != null) {
            propList = new ArrayList<>();

            for (int i = 0; i < ctx.inlineStyleProp().size(); i++) {
                propList.add(this.visit(ctx.inlineStyleProp().get(i)));
            }
        }

        StyleAttribute styleAttribute = new StyleAttribute(attrName, propList);
        styleAttribute.setNodeName(attrName);
        styleAttribute.setLineNumber(ctx.STYLE_ATTR().getSymbol().getLine());
        return styleAttribute;
    }

    @Override
    public Node visitInlineStyleProp(templateParser.InlineStylePropContext ctx) {
        String propName = ctx.CSS_INLINE_PROP_NAME().getText();

        ArrayList<Node> propValues = new ArrayList<>();

        for (TerminalNode propValue : ctx.CSS_PROP_VAL())
            propValues.add(new PropertyValue(propValue.getText()));

        return new Property(propName, propValues);
    }

    @Override
    public Node visitHtmlStyleElem(templateParser.HtmlStyleElemContext ctx) {
        //getting style element name
        String tagName = ctx.htmlStyleElemOpenTag().STYLE_TAG_START_NAME().getText();

        // getting style element body
        NodeBody htmlElementBody = null;

        if (ctx.cssBlock() != null) {
            ArrayList<Node> blockList = new ArrayList<>();

            for (int i = 0; i < ctx.cssBlock().size(); i++)
                blockList.add(this.visit(ctx.cssBlock().get(i)));

            htmlElementBody = new NodeBody(blockList);
            htmlElementBody.setNodeName("style element body");
            htmlElementBody.setLineNumber(ctx.cssBlock().getFirst().getStart().getLine());
        }

        HtmlStyleElement htmlStyleElement = new HtmlStyleElement(tagName, null, htmlElementBody);
        htmlStyleElement.setNodeName("html style element");
        htmlStyleElement.setLineNumber(ctx.getStart().getLine());

        return htmlStyleElement;
    }

    @Override
    public Node visitCssBlock(templateParser.CssBlockContext ctx) {
        // getting css block selectors
        Node selectorList = this.visit(ctx.selectorList());
        selectorList.setNodeName("css block selectors");
        selectorList.setLineNumber(ctx.selectorList().getStart().getLine());

        //getting css block properties
        ArrayList<Node> propList = null;

        if (ctx.cssProp() != null) {
            propList = new ArrayList<>();

            for (int i = 0; i < ctx.cssProp().size(); i++)
                propList.add(this.visit(ctx.cssProp().get(i)));

        }
        // returning css block object
        CssBlock cssBlock = new CssBlock(selectorList, propList);
        cssBlock.setNodeName("css block");
        cssBlock.setLineNumber(ctx.getStart().getLine());

        return cssBlock;
    }

    @Override
    public Node visitSingleSelector(templateParser.SingleSelectorContext ctx) {
        return this.visit(ctx.children.getFirst());
    }

    @Override
    public Node visitDescendentSelector(templateParser.DescendentSelectorContext ctx) {
        ArrayList<Node> selectorList = new ArrayList<>();

        for (int i = 0; i < ctx.selector().size(); i++)
            selectorList.add(this.visit(ctx.selector().get(i)));

        DescendantSelector descendantSelector = new DescendantSelector(selectorList);
        descendantSelector.setNodeName("descendant selector");
        descendantSelector.setLineNumber(ctx.getStart().getLine());

        return descendantSelector;
    }

    @Override
    public Node visitGroupSelector(templateParser.GroupSelectorContext ctx) {
        ArrayList<Node> selectorList = new ArrayList<>();

        for (int i = 0; i < ctx.selector().size(); i++)
            selectorList.add(this.visit(ctx.selector().get(i)));

        GroupSelector groupSelector = new GroupSelector(selectorList);
        groupSelector.setNodeName("group selector");
        groupSelector.setLineNumber(ctx.getStart().getLine());

        return groupSelector;
    }

    @Override
    public Node visitSelector(templateParser.SelectorContext ctx) {
        return this.visit(ctx.children.getFirst());
    }

    @Override
    public Node visitIdSelector(templateParser.IdSelectorContext ctx) {
        String idName = ctx.CSS_SEL_ID().getText().substring(1);

        IdSelector idSelector = new IdSelector(idName);
        idSelector.setNodeName("css id selector: " + idName);
        idSelector.setLineNumber(ctx.CSS_SEL_ID().getSymbol().getLine());

        return idSelector;
    }

    @Override
    public Node visitClassSelector(templateParser.ClassSelectorContext ctx) {
        String className = ctx.CSS_SEL_CLASS().getText().substring(1);

        ClassSelector classSelector = new ClassSelector(className);
        classSelector.setNodeName("class id selector: " + className);
        classSelector.setLineNumber(ctx.CSS_SEL_CLASS().getSymbol().getLine());

        return classSelector;
    }

    @Override
    public Node visitElementSelector(templateParser.ElementSelectorContext ctx) {
        String elementName = ctx.CSS_SEL_ELEM().getText();

        ElementSelector elementSelector = new ElementSelector(elementName);
        elementSelector.setNodeName("class element selector: " + elementName);
        elementSelector.setLineNumber(ctx.CSS_SEL_ELEM().getSymbol().getLine());

        return elementSelector;
    }

    @Override
    public Node visitPseudoClassSelector(templateParser.PseudoClassSelectorContext ctx) {
        // getting selector first part
        Node selector = this.visit(ctx.simpleSelector());
        selector.setNodeName("pseudo selector id");
        selector.setLineNumber(ctx.simpleSelector().getStart().getLine());

        // getting selector state
        String selectorState = ctx.CSS_SEL_STATE().getSymbol().getText().substring(1);

        // return pseudoClassSelector object
        PseudoClassSelector pseudoClassSelector = new PseudoClassSelector(selector, selectorState);
        pseudoClassSelector.setNodeName("pseudo class selector: " + selector.toString());
        pseudoClassSelector.setLineNumber(ctx.getStart().getLine());

        return pseudoClassSelector;
    }

    @Override
    public Node visitCssProp(templateParser.CssPropContext ctx) {
        String propName = ctx.BLK_PROP_NAME().getText();

        ArrayList<Node> propValues = new ArrayList<>();

        for (int i = 0; i < ctx.CSS_PROP_VAL().size(); i++)
            propValues.add(new PropertyValue(ctx.CSS_PROP_VAL().get(i).getText()));

        Property property = new Property(propName, propValues);
        property.setNodeName(propName + " css property");
        property.setLineNumber(ctx.getStart().getLine());

        return property;
    }

    @Override
    public Node visitJinjaExpression(templateParser.JinjaExpressionContext ctx) {
        return nodeVisitor.visit(ctx);
    }
}
