package models.jinja.dataTypes;

import models.Node;

public class PairType extends Node {
    public Node expr1;
    public Node expr2;

    public PairType(Node expr1, Node expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public String toString() {
        return expr1.toString() + " : " + expr2.toString();
    }
}
