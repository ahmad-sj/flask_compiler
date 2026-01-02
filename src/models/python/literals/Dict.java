package models.python.literals;

import models.Node;

import java.util.ArrayList;

public class Dict extends Node {
    ArrayList<Node> itemList;

    public Dict(ArrayList<Node> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        StringBuilder items = new StringBuilder();

        if (itemList != null) {
            for (int i = 0; i < itemList.size(); i++) {
                items.append(itemList.get(i));

                if (i + 1 < itemList.size())
                    items.append(", ");
            }
        }

        return "[" + items + "]\n";
    }
}
