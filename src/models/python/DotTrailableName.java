package models.python;

import models.Node;

import java.util.ArrayList;

public class DotTrailableName extends Node {
    ArrayList<Node> typeNameList; // list of type TypeName

    public DotTrailableName(ArrayList<Node> typeNameList) {
        this.typeNameList = typeNameList;
    }

    @Override
    public String toString() {
        StringBuilder names = new StringBuilder();

        for (int i = 0; i < typeNameList.size(); i++) {
            names.append(typeNameList.get(i));

            if (i + 1 < typeNameList.size())
                names.append(".");
        }

        return names.toString();
    }
}
