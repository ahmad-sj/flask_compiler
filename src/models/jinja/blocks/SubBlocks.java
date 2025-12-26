package models.jinja.blocks;

import models.Node;

import java.util.ArrayList;

public class SubBlocks extends Node {
    public ArrayList<Node> nodeList;

    public SubBlocks(ArrayList<Node> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (this.nodeList != null) {
            for (int i = 0; i < nodeList.size(); i++) {
                stringBuilder.append(nodeList.get(i));

                if (i + 1 < this.nodeList.size())
                    stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
