package models;

import java.util.ArrayList;

public class Template {
    public ArrayList<Node> nodes;
    boolean hasExtends;
    String templateName;

    public Template() {
        this.nodes = new ArrayList<>();
        hasExtends = false;
    }

    public Template(String templateName) {
        this.nodes = new ArrayList<>();
        this.hasExtends = false;
        this.templateName = templateName;
    }

    public void addNode(Node n) {
        nodes.add(n);
    }
}
