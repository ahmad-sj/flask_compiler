package models.python.IFSTMT;



import models.Node;
import models.python.BlockNode;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends Node {

    private final Node condition; // IF expr
    private final BlockNode thenBlock; // IF block
    private final List<ElifNode> elifBlocks; // ELIF blocks
    private final BlockNode elseBlock; // ELSE block (nullable)

    public IfNode(int lineNumber,
                  Node condition,
                  BlockNode thenBlock,
                  List<ElifNode> elifBlocks,
                  BlockNode elseBlock) {

        this.nodeName = "If";
        this.lineNumber = lineNumber;
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elifBlocks = elifBlocks;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("If (line=").append(lineNumber).append(")\n");
        if (condition != null) sb.append(condition.toString()).append("\n");
        if (thenBlock != null) sb.append(thenBlock.toString()).append("\n");
        if (elifBlocks != null) {
            for (ElifNode elif : elifBlocks) sb.append(elif.toString()).append("\n");
        }
        if (elseBlock != null) sb.append("Else\n").append(elseBlock.toString());
        return sb.toString();
    }
}

