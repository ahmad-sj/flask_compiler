package models.python.simpleStatements;

import models.Node;

public class ReturnLine extends Node {
    Node expr;

    public ReturnLine() {
    }

    public ReturnLine(Node expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return (expr != null ? "return " + this.expr.toString() : "return \n");
    }
}
