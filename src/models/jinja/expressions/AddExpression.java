package models.jinja.expressions;

import models.Node;

public class AddExpression extends Expression{
    Node expr1;
    Node expr2;
    Node optor;

    public AddExpression(Node expr1, Node expr2, Node optor) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.optor = optor;
    }

    @Override
    public String toString() {
        return expr1.toString() + " " + optor + " " + expr2.toString();
    }
}
