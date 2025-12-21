package models.html.attributes;

public class BooleanAttribute extends Attribute {
    public BooleanAttribute() {
    }

    public BooleanAttribute(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
