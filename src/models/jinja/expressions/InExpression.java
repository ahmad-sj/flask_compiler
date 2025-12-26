package models.jinja.expressions;

import models.Node;

public class InExpression extends Expression {
    public Node expression1;
    public Node expression2;

    public InExpression(Node expression1, Node expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public String toString() {
        return expression1.toString() + " in " + expression2.toString();
    }
}
