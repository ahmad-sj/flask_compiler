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

    @Override
    public String print(int level) {
        String indent = getIndent(level);
        String dedent = getIndent(level - 1);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < this.nodesList.size(); i++) {
            stringBuilder.append(indent);

            if (i + 1 < nodesList.size())
                stringBuilder.append("├─ ");
            else
                stringBuilder.append("└─ ");

            stringBuilder.append(this.nodesList.get(i).print(level));
        }

        return stringBuilder.toString();
    }
}
