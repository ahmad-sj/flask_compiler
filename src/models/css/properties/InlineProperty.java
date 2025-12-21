package models.css.properties;

import java.util.ArrayList;

public class InlineProperty extends Property{
    ArrayList<String> values;

    public InlineProperty() {
    }

    public InlineProperty(String name, ArrayList<String> values) {
        this.name = name;
        this.values = values;
    }

    @Override
    public String toString() {
        StringBuilder values = new StringBuilder();

        for (int i = 0; i < this.values.size(); i++) {
            values.append(this.values.get(i));

            if (i + 1 != this.values.size()){
                values.append(" ");
            }
        }

        return this.name + ": " + values;
    }
}
