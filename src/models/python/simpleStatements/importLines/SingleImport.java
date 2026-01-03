package models.python.simpleStatements.importLines;

import models.Node;
import models.python.StmtNode;

public class SingleImport extends StmtNode {
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
