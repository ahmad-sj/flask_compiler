package models.jinja.dataTypes;

import models.Node;

public class Argument extends Node {
    public Node expr;
    public Node argName;

    public Argument(Node expr, Node argName) {
        this.expr = expr;
        this.argName = argName;
    }

    @Override
    public String toString() {
        return (argName == null? "" : argName.toString() + " = ") + expr.toString();
    }
}
