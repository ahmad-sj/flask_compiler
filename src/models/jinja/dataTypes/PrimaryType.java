package models.jinja.dataTypes;

import models.Node;

import java.util.ArrayList;

public class PrimaryType extends Node {
    Node atom;
    ArrayList<Node> trailerList;

    public PrimaryType(Node atom, ArrayList<Node> trailerList) {
        this.atom = atom;
        this.trailerList = trailerList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (trailerList != null) {
            for (int i = 0; i < trailerList.size(); i++) {
                stringBuilder.append(trailerList.get(i).toString());

                if (i + 1 < trailerList.size())
                    stringBuilder.append(".");
            }
        }
        return atom.toString() + (stringBuilder.isEmpty() ? "" : stringBuilder.toString());
    }

    @Override
    public String print(int level) {
        String indent = getIndent(level);

        StringBuilder trailers = new StringBuilder();

        if (trailerList != null) {
            for (int i = 0; i < trailerList.size(); i++) {

                if (i + 1 < trailerList.size()) {
                    trailers.append(indent);
                    trailers.append("├─ ").append(trailerList.get(i).print(level + 2));
                    trailers.append("\n");
                } else {
                    trailers.append(indent);
                    trailers.append("└─ ").append(trailerList.get(i).print(level + 2));
                }

            }
        }

        return "primary type\n" +
                indent + "├─ line no: " + lineNumber + "\n" +
                (trailers.isEmpty()
                        ? indent + "└─ atom: " + atom.print(level + 2)
                        : indent + "├─ atom: " + atom.print(level + 2) + "\n"
                        + indent + "└─ trailers:\n" + trailers
                );
    }
}
