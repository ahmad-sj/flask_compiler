package models.html.elements;

import models.Node;

import java.util.ArrayList;

public class ElementBody extends Node {
    ArrayList<Node> nodesList;

    public ElementBody(ArrayList<Node> nodesList) {
        this.nodesList = nodesList;
    }

    @Override
    public String toString() {
        StringBuilder nodes = new StringBuilder();

        if (!this.nodesList.isEmpty()){
            int nodesCount = this.nodesList.size() - 1;

            for (int i = 0; i < nodesCount; i++) {
                nodes.append(this.nodesList.get(i).toString()).append("\n");
            }
            nodes.append(this.nodesList.get(nodesCount));
        }

        return (this.nodesList.isEmpty() ? "" : nodes.toString());
    }
}
