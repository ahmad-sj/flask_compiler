package models.html.attributes;

import models.Node;

import java.util.ArrayList;

public class QuotedAttribute extends Attribute {
    public ArrayList<Node> attrValList;

    public QuotedAttribute(String name, ArrayList<Node> attrValList) {
        this.attrName = name;
        this.attrValList = attrValList;
    }

    @Override
    public String toString() {
        StringBuilder values = new StringBuilder();

        if (this.attrValList != null) {
            for (int i = 0; i < this.attrValList.size(); i++) {
                values.append(this.attrValList.get(i));

                if (i + 1 < this.attrValList.size())
                    values.append(" ");
            }
        }


        return this.attrName + "=" + '"' + values + '"';
    }
}
