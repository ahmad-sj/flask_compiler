package models.python.expressions;

import models.Node;

public class ExprNode extends Node {
    private Node condition;  // الجزء قبل IF أو orExpr
    private Node ifExpr;     // الجزء بعد IF
    private Node elseExpr;   // الجزء بعد ELSE

    public ExprNode(Node condition, int lineNumber) {
        this.condition = condition;
        this.lineNumber = lineNumber;
        this.nodeName = "expr";
    }

    // للـ ternary
    public void setTernary(Node ifExpr, Node elseExpr) {
        this.ifExpr = ifExpr;
        this.elseExpr = elseExpr;
    }

    @Override
    public String toString() {
        if (ifExpr != null && elseExpr != null) {
            return condition.toString() + " ? " + ifExpr.toString() + " : " + elseExpr.toString();
        } else {
            return condition.toString();
        }
    }
}
