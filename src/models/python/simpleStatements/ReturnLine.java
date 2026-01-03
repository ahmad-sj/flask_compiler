//package models.python.simpleStatements;
//
//import models.Node;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReturnLine extends Node {
//
//    List<Node> expr =new ArrayList<>();
//
//    public ReturnLine() {
//    }
//
//    public ReturnLine(Node expr) {
//        this.expr.add(expr);
//    }
//
//    @Override
//    public String toString() {
//        return (expr != null ? "return " + this.expr.toString() : "return \n");
//    }
//}

package models.python.simpleStatements;

import models.Node;
import java.util.ArrayList;
import java.util.List;

public class ReturnLine extends Node {

    private final List<Node> returnValues = new ArrayList<>();

    public ReturnLine(int lineNumber,String nodeName) {
        this.lineNumber = lineNumber;
        this.nodeName = nodeName;
    }

    public void addReturnValue(Node expr) {
        if (expr != null) {
            returnValues.add(expr);
        }
    }

    public List<Node> getReturnValues() {
        return returnValues;
    }

    @Override
    public String toString() {
        if (returnValues.isEmpty()) {
            return "return\n";
        }

        StringBuilder sb = new StringBuilder("return ");
        for (int i = 0; i < returnValues.size(); i++) {
            sb.append(returnValues.get(i).toString());
            if (i + 1 < returnValues.size()) {
                sb.append(", ");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
}
