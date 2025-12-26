package models.jinja.expressions;

import models.Node;

public class UnaryExpression extends Expression{
    public Node sign;
    public Node expr;

    public UnaryExpression(Node sign, Node expr) {
        this.sign = sign;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return sign.toString() + expr.toString();
    }
}
