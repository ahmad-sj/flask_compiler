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

    @Override
    public String print(int level) {
        String indent = getIndent(level + 1);

        return "filter\n" +
                indent + "├─ line no: " + lineNumber + "\n" +
                (argList == null
                        ? indent + "└─ name: " + filterName.print(level + 2)
                        : indent + "├─ name: " + filterName.print(level + 2) + "\n"
                        + indent + "└─ args: " + argList.print(level + 2)
                );
    }
}
