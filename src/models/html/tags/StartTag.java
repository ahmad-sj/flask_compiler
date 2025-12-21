package models.html.tags;

import models.html.attributes.Attribute;

import java.util.ArrayList;

public class StartTag extends Tag {
    public ArrayList<Attribute> attributesList;

    public StartTag() {
    }

    public StartTag(String name, ArrayList<Attribute> attributesList) {
        this.name = name;
        this.attributesList = attributesList;
    }

    @Override
    public String toString() {
        StringBuilder attributesList = new StringBuilder();

        if (!this.attributesList.isEmpty()){
            int attributesCount = this.attributesList.size() - 1;

            for (int i = 0; i < attributesCount; i++) {
                attributesList.append(this.attributesList.get(i)).append(" ");
            }
            attributesList.append(this.attributesList.get(attributesCount));
        }
        
        return "<" + name + (this.attributesList.isEmpty() ? ">" : " " + attributesList + ">");
    }
}
