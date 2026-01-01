package models.python.simpleStatements;

import models.Node;

public class AssignLine extends Node {
    Node target;
    Node expr;

    public AssignLine(Node target, Node expr) {
        this.target = target;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return target.toString() + " = " + expr.toString();
    }
}
