package models;

import java.util.ArrayList;

public class NodeBody extends Node {
    public ArrayList<Node> nodeList;

    public NodeBody(ArrayList<Node> nodeList) {
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

    @Override
    public String print(int level) {
        String indent = getIndent(level);
        StringBuilder stringBuilder = new StringBuilder();

        if (this.nodeList != null) {
            for (int i = 0; i < nodeList.size(); i++) {
                stringBuilder.append(indent);

                if (i + 1 < nodeList.size()) {
                    stringBuilder.append("├─ ");
                    stringBuilder.append(nodeList.get(i).print(level + 1));
//                    stringBuilder.append("\n");
                } else {
                    stringBuilder.append("└─ ");
                    stringBuilder.append(nodeList.get(i).print(level + 1));
                }
            }
        }
        return stringBuilder.toString();
    }
}
