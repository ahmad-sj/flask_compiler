package models.html.elements;

import models.Node;

import java.util.ArrayList;

public abstract class HtmlElement extends Node {
    public String tagName;
    public ArrayList<Node> attrList;

    public HtmlElement(String tagName, ArrayList<Node> attrList) {
        this.tagName = tagName;
        this.attrList = attrList;
    }
}
