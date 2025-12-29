package models.jinja.expressions;

import models.Node;

public class UnaryExpression extends Expression {
    public Node sign;
    public Node expr;

    public UnaryExpression(Node sign, Node expr) {
        this.sign = sign;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return sign.toString() + expr.toString();
    }

    @Override
    public String print(int level) {
        String indent = getIndent(level);

        return "unary expr\n"
                + indent + "├─ line no: " + lineNumber + "\n"
                + indent + "├─ sign: " + sign.print(level)
                + indent + "└─ expr: " + expr.print(level + 2)
                ;
    }
}
