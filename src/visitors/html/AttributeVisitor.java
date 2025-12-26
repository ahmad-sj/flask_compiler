package visitors.html;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.css.properties.Property;
import models.html.attributes.*;
import models.jinja.JinjaExpression;
import org.antlr.v4.runtime.tree.TerminalNode;
import visitors.css.PropertyVisitor;
import visitors.jinja.JinjaVisitor;

import java.util.ArrayList;
import java.util.List;

public class AttributeVisitor extends templateParserBaseVisitor<Attribute> {

    @Override
    public Attribute visitBooleanAttr(templateParser.BooleanAttrContext ctx) {
        String attributeName = ctx.ATTR_NAME().getText();
        BooleanAttribute booleanAttribute = new BooleanAttribute(attributeName);

        booleanAttribute.setNodeName(attributeName);
        booleanAttribute.setLineNumber(ctx.ATTR_NAME().getSymbol().getLine());
        return booleanAttribute;
    }

    @Override
    public Attribute visitAttrWithUnquotedVal(templateParser.AttrWithUnquotedValContext ctx) {
        String attributeName = ctx.ATTR_NAME().getText();
        String attributeValue = ctx.ATTR_VALUE_UNQUOTED().getText();

        UnquotedAttribute unquotedAttribute = new UnquotedAttribute(attributeName, attributeValue);
        unquotedAttribute.setNodeName(attributeName);
        unquotedAttribute.setLineNumber(ctx.ATTR_NAME().getSymbol().getLine());
        return unquotedAttribute;
    }

    @Override
    public Attribute visitAttrWithQuotedVal(templateParser.AttrWithQuotedValContext ctx) {
        String attributeName = ctx.ATTR_NAME().getText();

        ArrayList<String> textValues = new ArrayList<>();

        if (ctx.ATTR_VAL_TEXT() != null && !ctx.ATTR_VAL_TEXT().isEmpty()){
            for (TerminalNode terminalNode : ctx.ATTR_VAL_TEXT()) {
                textValues.add(terminalNode.getText());
            }
        }

        // checking if there are any jinja expressions used as attribute values
        ArrayList<JinjaExpression> jinjaValues = new ArrayList<>();

        if (ctx.jinjaAttrVal() != null){
            JinjaVisitor jinjaVisitor = new JinjaVisitor();

            for (templateParser.JinjaAttrValContext jinjaExpr : ctx.jinjaAttrVal()){
                jinjaValues.add((JinjaExpression) jinjaVisitor.visit(jinjaExpr));
            }
        }

        QuotedAttribute quotedAttribute = new QuotedAttribute(attributeName, textValues, jinjaValues);
        quotedAttribute.setNodeName(attributeName);
        quotedAttribute.setLineNumber(ctx.ATTR_NAME().getSymbol().getLine());
        return quotedAttribute;
    }

    @Override
    public Attribute visitStyleAttr(templateParser.StyleAttrContext ctx) {
        String name = ctx.STYLE_ATTR().getText();

        ArrayList<Property> properties = new ArrayList<>();

        List<templateParser.InlineStylePropContext> propertiesContext = ctx.inlineStyleProp();
        PropertyVisitor propertyVisitor = new PropertyVisitor();

        for (templateParser.InlineStylePropContext inlineStylePropContext : propertiesContext) {
            properties.add(propertyVisitor.visit(inlineStylePropContext));
        }

        StyleAttribute styleAttribute = new StyleAttribute(name, properties);
        styleAttribute.setNodeName(name);
        styleAttribute.setLineNumber(ctx.STYLE_ATTR().getSymbol().getLine());
        return styleAttribute;
    }
}
