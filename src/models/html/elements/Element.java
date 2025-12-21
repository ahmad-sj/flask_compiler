package models.html.elements;

import models.Node;
import models.html.tags.EndTag;
import models.html.tags.StartTag;

public class Element extends Node {
    StartTag startTag;
    ElementBody elementBody;
    EndTag endTag;

    public Element(StartTag startTag, ElementBody elementBody, EndTag endTag) {
        this.startTag = startTag;
        this.elementBody = elementBody;
        this.endTag = endTag;
    }

    @Override
    public String toString() {
        return  startTag.toString()
                + (this.elementBody == null ? "" : "\n" + elementBody.toString())
                + "\n" +endTag.toString() + "\n";
    }
}
