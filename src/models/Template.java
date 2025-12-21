package models;

import java.util.ArrayList;

public class Template {
    public ArrayList<Node> nodes;

    public Template(){
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node n){
        nodes.add(n);
    }
}
