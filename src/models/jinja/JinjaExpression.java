package models.jinja;

import models.Node;

public class JinjaExpression extends Node {
    Node expression;

    public JinjaExpression(Node expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "{{ " + this.expression.toString() + " }}";
    }

    public String evaluate(){
        return "{{ " + this.expression.toString() + " }}";
    }
}
