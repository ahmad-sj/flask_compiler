package models.css.properties;

import models.Node;

public class PropertyValue extends Node {
    String propVal;

    public PropertyValue(String propVal) {
        this.propVal = propVal;
    }

    @Override
    public String toString() {
        return this.propVal;
    }
}
