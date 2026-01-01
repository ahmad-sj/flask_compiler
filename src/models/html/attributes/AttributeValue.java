package models.html.attributes;

import models.Node;

public class AttributeValue extends Node {
    public String attrValue;

    public AttributeValue(String attrValue) {
        this.attrValue = attrValue;
    }

    @Override
    public String toString() {
        return this.attrValue;
    }
}
