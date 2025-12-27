package models.css.properties;

import models.Node;

import java.util.ArrayList;

public class Property extends Node {
    String propName;
    ArrayList<Node> propValues;

    public Property(String name, ArrayList<Node> propValues) {
        this.propName = name;
        this.propValues = propValues;
    }

    @Override
    public String toString() {
        StringBuilder values = new StringBuilder();

        for (int i = 0; i < this.propValues.size(); i++) {
            values.append(this.propValues.get(i).toString());

            if (i + 1 != this.propValues.size()){
                values.append(" ");
            }
        }

        return this.propName + ": " + values + ";";
    }
}
