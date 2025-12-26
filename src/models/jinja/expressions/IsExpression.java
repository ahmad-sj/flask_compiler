package models.jinja.expressions;

import models.Node;

public class IsExpression extends Expression {
    public Node expression;
    public boolean negated;
    public String id;

    public IsExpression(Node expression, boolean negated, String id) {
        this.expression = expression;
        this.negated = negated;
        this.id = id;
    }

    @Override
    public String toString() {
        return expression.toString() + " is " + (negated? "not " : "") + id;
    }
}
