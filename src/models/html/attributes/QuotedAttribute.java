package models.html.attributes;

import models.jinja.JinjaExpression;

import java.util.ArrayList;

public class QuotedAttribute extends Attribute{
    public ArrayList<String> values;

    public QuotedAttribute() {
    }

    public QuotedAttribute(String name, ArrayList<String> values, ArrayList<JinjaExpression> jinjaExpressions) {
        this.name = name;
        this.values = values;

        if (jinjaExpressions != null){
            for (JinjaExpression jinjaExpression : jinjaExpressions){
                values.add(jinjaExpression.evaluate());
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder values = new StringBuilder();

        for (int i = 0; i < this.values.size(); i++) {
            values.append(this.values.get(i));

            if (i + 1 != this.values.size()){
                values.append(", ");
            }
        }

        return this.name + "=" + '"' + values + '"';
    }
}
