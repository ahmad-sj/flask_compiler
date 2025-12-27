package models.html.attributes;

public class BooleanAttribute extends Attribute {

    public BooleanAttribute(String name) {
        this.attrName = name;
    }

    @Override
    public String toString() {
        return this.attrName;
    }
}
