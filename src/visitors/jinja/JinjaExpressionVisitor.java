/*
package visitors.jinja;

import models.jinja.JinjaExpression;
import models.jinja.JinjaFilter;
import models.jinja.JinjaId;

public class JinjaExpressionVisitor extends templateParserBaseVisitor<JinjaExpression> {
    @Override
    public JinjaExpression visitJinjaExpression(templateParser.JinjaExpressionContext ctx) {

        String filter = ctx.jinjaExprBody().jinjaFilter().getText();

        String id = ctx.jinjaExprBody().jinjaId().getText();

        return new JinjaExpression(new JinjaFilter(filter), new JinjaId(id));
    }

    @Override
    public JinjaExpression visitJinjaAttrVal(templateParser.JinjaAttrValContext ctx) {
        String id = ctx.jinjaExprBody().jinjaId().getText();

        if (ctx.jinjaExprBody().jinjaFilter() != null){
            String filter = ctx.jinjaExprBody().jinjaFilter().getText();
            return new JinjaExpression(new JinjaFilter(filter), new JinjaId(id));
        }

        return new JinjaExpression(new JinjaId(id));
    }
}
*/
