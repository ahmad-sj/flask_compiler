package models.jinja.expressions;

import models.Node;

public class FilterExpression extends Expression {
    Node filterName;
    Node argList;

    public FilterExpression(Node filterName, Node argList) {
        this.filterName = filterName;
        this.argList = argList;
    }

    @Override
    public String toString() {
        return filterName.toString()
                + (argList == null ? "" : "(" + argList.toString() + ")");
    }
}
