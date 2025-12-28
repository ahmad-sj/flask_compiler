package models.jinja.dataTypes;

import models.Node;

public class OperatorType extends Node {
    public String operator;

    public OperatorType(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return this.operator;
    }

    @Override
    public String print(int level) {
        return this.operator;
    }
}
