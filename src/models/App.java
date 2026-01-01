package models;

import java.util.ArrayList;

public class App {
    public ArrayList<Node> nodes;

    public App() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node n) {
        nodes.add(n);
    }

}
