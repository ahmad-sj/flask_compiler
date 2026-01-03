package models.python;

import models.Node;
import java.util.List;

public class BlockNode extends Node {

    private final List<Node> statements;

    public BlockNode(int lineNumber, List<Node> statements) {
        this.nodeName = "Block";
        this.lineNumber = lineNumber;
        this.statements = statements;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(4))
                .append(nodeName)
                .append(" (line=")
                .append(lineNumber)
                .append(")\n");

        if (statements != null) {
            for (Node stmt : statements) {
//                sb.append(stmt.toString(level + 1));
            }
        }

        return sb.toString();
    }
}
