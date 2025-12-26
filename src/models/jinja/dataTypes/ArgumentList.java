package models.jinja.dataTypes;

import models.Node;

import java.util.ArrayList;

public class ArgumentList extends Node {
    public ArrayList<Node> argList;

    public ArgumentList(ArrayList<Node> argList) {
        this.argList = argList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < argList.size(); i++) {
            stringBuilder.append(argList.get(i));

            if (i + 1 < argList.size())
                stringBuilder.append(", ");
        }

        return stringBuilder.toString();
    }
}
