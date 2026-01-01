package models.html.attributes;

public class UnquotedAttribute extends Attribute {
    public String attrValue;

    public UnquotedAttribute(String name, String attrValue) {
        this.attrName = name;
        this.attrValue = attrValue;
    }

    @Override
    public String toString() {
        return this.attrName + "=" + this.attrValue;
    }
}
