package models.jinja.expressions;

import models.Node;

import java.util.ArrayList;

public class OrExpression extends Expression {
    ArrayList<Node> expressionsList;

    public OrExpression(ArrayList<Node> expressionsList) {
        this.expressionsList = expressionsList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < expressionsList.size(); i++) {
            stringBuilder.append(expressionsList.get(i));

            if (i + 1 < expressionsList.size())
                stringBuilder.append(" or ");
        }
        return stringBuilder.toString();
    }
}
