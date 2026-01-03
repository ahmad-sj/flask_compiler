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

    public BlockNode(List<Node> statements) {
        this.statements = statements;
    }

//    @Override
//    public String toString() {
//
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(getIndent(4))
//                .append(nodeName)
//                .append(" (line=")
//                .append(this.lineNumber)
//                .append(")\n");
//
//        if (statements != null) {
//            for (Node stmt : statements) {

    /// /                sb.append(stmt.toString(level + 1));
//            }
//        }
//
//        return sb.toString();
//    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < statements.size(); i++) {
            sb.append(statements.get(i).toString());

            if (i + 1 < statements.size())
                sb.append("\n");
        }

        return "block:\n"
                + "line no: " + this.lineNumber + "\n"
                + "statements list:\n" + sb.toString()
                ;
    }
}
