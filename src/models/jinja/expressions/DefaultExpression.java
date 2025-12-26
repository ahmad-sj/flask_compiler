package models.jinja.expressions;

import models.Node;

public class DefaultExpression extends Expression{
    Node expr;
    Node defaultExpr;

    public DefaultExpression(Node expr, Node defaultExpr) {
        this.expr = expr;
        this.defaultExpr = defaultExpr;
    }

    @Override
    public String toString() {
        return "("
                + expr.toString()
                + " ?? "
                + defaultExpr.toString()
                + ")";
    }
}
