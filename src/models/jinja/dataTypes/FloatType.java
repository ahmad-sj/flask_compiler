package models.jinja.dataTypes;

import models.Node;

public class FloatType extends Node {
    public float value;

    public FloatType(float value) {
        this.value = value;
    }

    public FloatType(String value) {
        this.value = Float.parseFloat(value);
    }

    @Override
    public String toString() {
        return Float.toString(this.value);
    }
}
