package models.jinja.dataTypes;

import models.Node;

import java.util.ArrayList;

public class ListType extends Node {
    public ArrayList<Node> itemList;

    public ListType(ArrayList<Node> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (itemList != null){
            for (int i = 0; i < itemList.size(); i++) {
                stringBuilder.append(itemList.get(i).toString());

                if (i + 1 < itemList.size())
                    stringBuilder.append(", ");
            }
        }

        return "[" + stringBuilder + "]";
    }
}
