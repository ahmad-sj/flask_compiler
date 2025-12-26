package models.jinja.expressions;

import models.Node;

public class PowerExpression extends Expression {
    public Node baseValueExpr;
    public Node powerValueExpr;

    public PowerExpression(Node baseValueExpr, Node powerValueExpr) {
        this.baseValueExpr = baseValueExpr;
        this.powerValueExpr = powerValueExpr;
    }

    @Override
    public String toString() {
        return baseValueExpr.toString() + "**" + powerValueExpr.toString();
    }
}
