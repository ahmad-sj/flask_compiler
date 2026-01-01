package models.python.importLines;

import models.Node;

public class SingleImport extends Node {
    Node importedName; // of type DotTrailableName
    Node importAlias; // of type TypeName

    public SingleImport(Node importedName, Node importAlias) {
        this.importedName = importedName;
        this.importAlias = importAlias;
    }

    @Override
    public String toString() {

        return "import " + importedName.toString() +
                (importAlias == null
                        ? "\n"
                        : " as " + importAlias.toString() + "\n"
                )
                ;
    }
}
