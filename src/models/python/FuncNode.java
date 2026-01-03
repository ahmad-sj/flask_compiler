package models.python;

import models.Node;
import java.util.List;

public class FuncNode extends Node {

    private final String name;
    private final List<String> parameters;
    private final List<Node> decorators;
    private final BlockNode body;

    public FuncNode(
            int lineNumber,
            String name,
            List<String> parameters,
            List<Node> decorators,
            BlockNode body
    ) {
        this.nodeName = "Func";
        this.lineNumber = lineNumber;
        this.name = name;
        this.parameters = parameters;
        this.decorators = decorators;
        this.body = body;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(4))
                .append(nodeName)
                .append(" (line=")
                .append(lineNumber)
                .append(", name=")
                .append(name)
                .append(", params=")
                .append(parameters)
                .append(")\n");

        if (decorators != null) {
            for (Node dec : decorators) {
//                sb.append(dec.toString(level + 1));
            }
        }

        if (body != null) {
//            sb.append(body.toString(level + 1));
        }

        return sb.toString();
    }
}
