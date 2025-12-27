package models.html.elements;

import models.Node;

import java.util.ArrayList;

public class HtmlElementBody extends Node {
    ArrayList<Node> nodesList;

    public HtmlElementBody(ArrayList<Node> nodesList) {
        this.nodesList = nodesList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < this.nodesList.size(); i++) {
            stringBuilder.append(this.nodesList.get(i));

            if (i + 1 < this.nodesList.size())
                stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
