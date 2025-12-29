/*
package visitors.css;

import models.css.properties.InlineProperty;
import models.css.properties.Property;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class PropertyVisitor extends templateParserBaseVisitor<Property> {
    @Override
    public Property visitInlineStyleProp(templateParser.InlineStylePropContext ctx) {
        String name = ctx.CSS_INLINE_PROP_NAME().getText();

        ArrayList<String> values = new ArrayList<>();

        List<TerminalNode> valuesContext = ctx.CSS_PROP_VAL();

        for (TerminalNode value : valuesContext) {
            values.add(value.getText());
        }
        return new InlineProperty(name, values);
    }
}
*/
