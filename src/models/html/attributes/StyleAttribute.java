package models.html.attributes;

import models.css.properties.Property;

import java.util.ArrayList;

public class StyleAttribute extends Attribute {
    ArrayList<Property> properties;

    public StyleAttribute() {
    }

    public StyleAttribute(String name, ArrayList<Property> properties) {
        this.name = name;
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder properties = new StringBuilder();

        for (Property property : this.properties) {
            properties.append(property);
            properties.append("; ");
        }

        return "style=" + '"' + properties + '"';
    }
}
