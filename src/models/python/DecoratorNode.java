package models.python;

import models.Node;
import java.util.List;

public class DecoratorNode extends Node {

    private final String name;
    private final List<Node> callArgs;

    public DecoratorNode(int lineNumber, String name, List<Node> callArgs) {
        this.nodeName = "Decorator";
        this.lineNumber = lineNumber;
        this.name = name;
        this.callArgs = callArgs;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(4))
                .append(nodeName)
                .append(" (line=")
                .append(lineNumber)
                .append(", @")
                .append(name)
                .append(")\n");

        if (callArgs != null) {
            for (Node arg : callArgs) {
//                sb.append(arg.toString(4 + 1));
            }
        }

        return sb.toString();
    }
}
