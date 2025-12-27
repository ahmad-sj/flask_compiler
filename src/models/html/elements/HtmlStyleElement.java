package models.html.elements;

import models.Node;

import java.util.ArrayList;

public class HtmlStyleElement extends HtmlElement{
    Node elementBody; // object of type HtmlElementBody

    public HtmlStyleElement(String tagName, ArrayList<Node> attrList, Node elementBody) {
        super(tagName, attrList);
        this.elementBody = elementBody;
    }

    @Override
    public String toString() {
        StringBuilder attributes = new StringBuilder();

        if (attrList != null) {
            for (int i = 0; i < attrList.size(); i++) {
                attributes.append(attrList.get(i).toString());

                if (i + 1 < attrList.size())
                    attributes.append(" ");
            }
        }

        return "<" + tagName + (attributes.isEmpty() ? "" : " " + attributes) + ">"
                + (this.elementBody == null ? "" : "\n" + elementBody.toString())
                + "\n</" + tagName + ">";
    }
}
