package models.html.attributes;

public class UnquotedAttribute extends Attribute {
    public String value;

    public UnquotedAttribute() {
    }

    public UnquotedAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.name + "=" + this.value;
    }
}
