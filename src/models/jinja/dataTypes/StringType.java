package models.jinja.dataTypes;

import models.Node;

public class StringType extends Node {
    public String value;

    public StringType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
