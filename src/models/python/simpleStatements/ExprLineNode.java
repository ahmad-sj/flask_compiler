package models.python.simpleStatements;

import models.Node;

public class ExprLineNode extends Node {
    private Node expr;

    public ExprLineNode(Node expr, int lineNumber) {
        this.expr = expr;
        this.lineNumber = lineNumber;
        this.nodeName = "expr line";
    }

    public Node getExpr() {
        return expr;
    }

    @Override
    public String toString() {
        return "ExprLine (" + lineNumber + "): " + expr.toString() + "\n";
    }
}
