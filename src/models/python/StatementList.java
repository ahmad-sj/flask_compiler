package models.python;

import models.Node;

import java.util.ArrayList;

public class StatementList extends Node {
    ArrayList<Node> statementList;

    public StatementList(ArrayList<Node> statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        StringBuilder statements = new StringBuilder();

        for (int i = 0; i < statementList.size(); i++)
            statements.append(statementList.get(i).toString());

        return statements.toString();
    }
}
