package models.jinja.expressions;

import models.Node;

public class MulExpression extends Expression{
    public Node optor;
    public Node expr1;
    public Node expr2;

    public MulExpression(Node optor, Node expr1, Node expr2) {
        this.optor = optor;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public String toString() {
        return expr1.toString() + " " + optor.toString() + " " + expr2.toString();
    }
}
