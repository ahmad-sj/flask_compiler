package models.python.simpleStatements.importLines;

import models.Node;
import models.python.Statement;

public class SingleImport extends Statement {


    Node importedName; // of type Name
    Node importAlias; // of type TypeName

    public SingleImport(Node importedName, Node importAlias) {
        this.importedName = importedName;
        this.importAlias = importAlias;
    }


    @Override
    public String print(int level) {

        String indent = getIndent(level);

        return "Single Import \n" +
                indent + "line number: " + lineNumber + "\n"
                + indent + "imported name: " + importedName.print(level + 1)+
                ?importAlias

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
