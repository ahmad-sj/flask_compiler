package models.jinja.expressions;

import models.Node;

import java.util.ArrayList;

public class PipeExpression extends Node {
    public Node expr;
    ArrayList<Node> filterList;

    public PipeExpression(Node expr, ArrayList<Node> filterList) {
        this.expr = expr;
        this.filterList = filterList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (filterList != null) {
            for (int i = 0; i < filterList.size(); i++) {
                stringBuilder.append(filterList.get(i));

                if (i + 1 < filterList.size())
                    stringBuilder.append(" | ");
            }
        }

        return expr.toString() + " | " + stringBuilder;
    }
}
