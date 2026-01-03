package models.python;

import models.Node;

import java.util.List;

public class Decorator extends Node {

    private final String name;
    private final List<Node> callArgs;

    public Decorator(int lineNumber, String name, List<Node> callArgs) {
        this.nodeName = "Decorator";
        this.lineNumber = lineNumber;
        this.name = name;
        this.callArgs = callArgs;
    }

    @Override
    public String toString() {
        StringBuilder args = new StringBuilder();

        if (callArgs != null) {
            for (int i = 0; i < callArgs.size(); i++) {
                args.append(callArgs.get(i).toString());

                if (i + 1 < callArgs.size())
                    args.append(", ");
            }
        }


        return "- decorator line" +
                "\nline no: " + lineNumber +
                "\nname: " + name.toString() +
                (callArgs == null
                        ? "\n"
                        : "\nargs: " + args + "\n"
                );
    }

}
