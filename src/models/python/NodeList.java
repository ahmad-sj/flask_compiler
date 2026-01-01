package models.python;

import models.Node;

import java.util.ArrayList;

public class NodeList extends Node {

    ArrayList<Node> nodeList;

    public NodeList(ArrayList<Node> nodeList) {
        this.nodeList = nodeList;
    }

    public ArrayList<Node> getList() {
        return this.nodeList;
    }

    public void addNode(Node node) {
        this.nodeList.add(node);
    }

    @Override
    public String toString() {
        StringBuilder nodes = new StringBuilder();

        for (int i = 0; i < nodeList.size(); i++) {
            nodes.append(nodeList.get(i).toString());
        }
        return nodes.toString();
    }


}
