package models.jinja.blocks;

import models.Node;

import java.util.ArrayList;

public class ElseBlock extends JinjaBlock {
    ArrayList<Node> nodeList;

    public ElseBlock(ArrayList<Node> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (this.nodeList != null) {
            for (int i = 0; i < nodeList.size(); i++) {
                stringBuilder.append(this.nodeList.get(i));

                if (i + 1 < this.nodeList.size())
                    stringBuilder.append("\n");
            }
        }
        return "{% else %}\n"
                + stringBuilder;
    }

    @Override
    public String print(int level) {
        String indent = getIndent(level + 1);

        StringBuilder stringBuilder = new StringBuilder();

        if (this.nodeList != null) {
            for (int i = 0; i < nodeList.size(); i++) {
                stringBuilder.append(indent);

                if (i + 1 < nodeList.size()) {
                    stringBuilder.append("├─ ");
                } else {
                    stringBuilder.append("└─ ");
                }
                stringBuilder.append(this.nodeList.get(i).print(level + 1));
            }
        }

        return "else block\n" +
                (stringBuilder.isEmpty()
                        ? indent + "└─ line no " + lineNumber + "\n"
                        : indent + "├─ line no " + lineNumber + "\n"
                        + indent + "└─ children:\n" + stringBuilder + "\n"
                );
    }
}
