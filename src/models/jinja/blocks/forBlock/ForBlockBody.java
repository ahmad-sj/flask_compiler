package models.jinja.blocks.forBlock;

import models.Node;

import java.util.ArrayList;

public class ForBlockBody extends Node{
    ArrayList<Node> nodesList;

    public ForBlockBody(ArrayList<Node> nodesList) {
        this.nodesList = nodesList;
    }

    @Override
    public String toString() {
        StringBuilder nodesList = new StringBuilder();
        int nodesCount = this.nodesList.size();

        for (int i = 0; i < nodesCount; i++) {
            nodesList.append(this.nodesList.get(i)).append("\n");
        }

        return nodesList.toString();
    }
}
