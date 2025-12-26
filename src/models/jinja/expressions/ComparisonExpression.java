package models.jinja.expressions;

import models.Node;

public class ComparisonExpression extends Expression {
    public Node expr1;
    public Node expr2;
    public Node compOptor;

    public ComparisonExpression(Node expr1, Node expr2, Node compOptor) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.compOptor = compOptor;
    }

    @Override
    public String toString() {
        return expr1.toString()
                + " " + compOptor.toString() + " "
                + expr2.toString();
    }
}
