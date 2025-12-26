package models.jinja.dataTypes;

import models.Node;

public class NumberType extends Node {
    public int value;

    public NumberType(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }
}
