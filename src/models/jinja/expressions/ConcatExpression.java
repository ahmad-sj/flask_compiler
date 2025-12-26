package models.jinja.expressions;

import models.Node;

public class ConcatExpression extends Expression{
    public Node expr1;
    public Node expr2;

    public ConcatExpression(Node expr1, Node expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public String toString() {
        return expr1.toString() + " ~ " + expr2.toString();
    }
}
