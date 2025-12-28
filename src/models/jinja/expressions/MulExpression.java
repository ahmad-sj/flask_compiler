package models.jinja.expressions;

import models.Node;

import java.util.ArrayList;

public class MulExpression extends Expression {
    ArrayList<Node> exprList;

    public MulExpression(ArrayList<Node> exprList) {
        this.exprList = exprList;
    }

    @Override
    public String toString() {
        StringBuilder mulExpr = new StringBuilder();

        for (int i = 0; i < exprList.size(); i++) {
            mulExpr.append(exprList.get(i));

            if (i + 1 < exprList.size())
                mulExpr.append(" * ");
        }
        return mulExpr.toString();
    }

    @Override
    public String print(int level) {
        String indent = getIndent(level);

        StringBuilder mulExpr = new StringBuilder();

        for (int i = 0; i < exprList.size(); i++) {
            if (i + 1 < exprList.size()) {
                mulExpr.append(indent).append("├─ expr").append(i).append(": ");
                mulExpr.append(exprList.get(i).print(level + 2));

                mulExpr.append("\n");
                mulExpr.append(indent).append("├─ optor: *\n");
            } else {
                mulExpr.append(indent).append("└─ expr").append(i).append(": ");
                mulExpr.append(exprList.get(i).print(level + 2));
            }
        }

        return "mul expr\n"
                + indent + "├─ line no: " + lineNumber + "\n"
                + mulExpr
                ;
    }
}
