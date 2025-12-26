package models.jinja.expressions;

import models.Node;

public class TernaryExpression extends Expression{
    Node condExpr;
    Node trueExpr;
    Node falseExpr;

    public TernaryExpression(Node condExpr, Node trueExpr, Node falseExpr) {
        this.condExpr = condExpr;
        this.trueExpr = trueExpr;
        this.falseExpr = falseExpr;
    }

    @Override
    public String toString() {
        return "("
                + condExpr.toString()
                + " ? "
                + trueExpr.toString()
                + " : "
                + falseExpr.toString()
                + ")";
    }
}
