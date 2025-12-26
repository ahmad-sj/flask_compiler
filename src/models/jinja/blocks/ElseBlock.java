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
}
