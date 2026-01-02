package models.python.simpleStatements;

import models.Node;

public class ExprLine extends Node {
    Node expr;

    public ExprLine(Node expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return this.expr.toString();
    }
}
