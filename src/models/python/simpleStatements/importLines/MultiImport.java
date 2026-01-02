package models.python.simpleStatements.importLines;

import models.Node;

import java.util.ArrayList;

public class MultiImport extends Node {
    Node importedNames; // of type NameList
    ArrayList<Node> importList; // of type TypeName

    public MultiImport(Node importedNames, ArrayList<Node> importList) {
        this.importedNames = importedNames;
        this.importList = importList;
    }

    @Override
    public String toString() {
        StringBuilder imports = new StringBuilder();

        for (int i = 0; i < importList.size(); i++) {
            imports.append(importList.get(i));

            if (i + 1 < importList.size())
                imports.append(", ");
        }

        return "from " + importedNames.toString() + " import " + imports.toString() + "\n";
    }
}
