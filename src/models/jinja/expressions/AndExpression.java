package models.jinja.expressions;

import models.Node;

import java.util.ArrayList;

public class AndExpression extends Expression {
    ArrayList<Node> expressionsList;

    public AndExpression(ArrayList<Node> expressionsList) {
        this.expressionsList = expressionsList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < expressionsList.size(); i++) {
            stringBuilder.append(expressionsList.get(i));

            if (i + 1 < expressionsList.size())
                stringBuilder.append(" and ");
        }
        return stringBuilder.toString();
    }
}
