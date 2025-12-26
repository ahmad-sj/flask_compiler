package models.jinja.expressions;

import models.Node;

public class ParenthedExpression extends Expression {
    public Node expr;

    public ParenthedExpression(Node expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "(" + expr.toString() + ")";
    }
}
