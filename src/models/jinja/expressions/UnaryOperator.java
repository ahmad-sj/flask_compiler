package models.jinja.expressions;

import models.Node;

public class UnaryOperator extends Node {
    public String sign;

    public UnaryOperator(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return this.sign;
    }

    @Override
    public String print(int level) {
        return this.sign + "\n";
    }
}
