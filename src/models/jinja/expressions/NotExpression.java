package models.jinja.expressions;

import models.Node;

public class NotExpression extends Expression {
    Node expression;

    public NotExpression(Node expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return this.expression.toString();
    }
}
