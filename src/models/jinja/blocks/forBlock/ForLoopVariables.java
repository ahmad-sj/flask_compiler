package models.jinja.blocks.forBlock;

import models.Node;
import models.jinja.JinjaId;

import java.util.ArrayList;

public class ForLoopVariables extends Node {
    ArrayList<JinjaId> variablesList;

    public ForLoopVariables(ArrayList<JinjaId> variablesList) {
        this.variablesList = variablesList;
    }

    @Override
    public String toString() {
        int varsCount = this.variablesList.size();

        StringBuilder variableslist = new StringBuilder();

        for (int i = 0; i < varsCount; i++) {
            variableslist.append(this.variablesList.get(i));
            if (i + 1 < varsCount)
                variableslist.append(", ");
        }

        return variableslist.toString();
    }
}
