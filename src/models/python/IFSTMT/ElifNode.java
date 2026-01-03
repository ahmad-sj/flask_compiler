package models.python.IFSTMT;



import models.Node;
import models.python.BlockNode;

public class ElifNode extends Node {

    private final Node condition;
    private final BlockNode block;

    public ElifNode(int lineNumber, Node condition, BlockNode block) {
        this.nodeName = "Elif";
        this.lineNumber = lineNumber;
        this.condition = condition;
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elif (line=").append(lineNumber).append(")\n");
        if (condition != null) sb.append(condition.toString()).append("\n");
        if (block != null) sb.append(block.toString());
        return sb.toString();
    }
}

