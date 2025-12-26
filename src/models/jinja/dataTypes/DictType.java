package models.jinja.dataTypes;

import models.Node;

import java.util.ArrayList;

public class DictType extends Node {
    ArrayList<Node> pairsList;

    public DictType(ArrayList<Node> pairList) {
        this.pairsList = pairList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (pairsList != null){
            for (int i = 0; i < pairsList.size(); i++) {
                stringBuilder.append(pairsList.get(i).toString());

                if (i + 1 < pairsList.size())
                    stringBuilder.append(", ");
            }
        }

        return "{" + stringBuilder + "}";
    }
}
