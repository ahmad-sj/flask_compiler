//package models.python;
//
//import models.Node;
//
//import java.util.ArrayList;
//
//public class StatementList extends Node {
//    ArrayList<Node> statementList;
//
//    public StatementList(ArrayList<Node> statementList) {
//        this.statementList = statementList;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder statements = new StringBuilder();
//
//        for (int i = 0; i < statementList.size(); i++)
//            statements.append(statementList.get(i).toString());
//
//        return statements.toString();
//    }
//}



package models.python;


import models.Node;
import java.util.ArrayList;
import java.util.List;

public class StatementListNode extends Node {

    private final ArrayList<Node> statementList ;

    public StatementListNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;   // مصدر نحوي مختلف
        this.lineNumber = lineNumber;
        statementList= new ArrayList<>();
    }

    public void addStatement(Node stmt) {
        if (stmt != null) {
            statementList.add(stmt);
        }
    }

    public List<Node> getStatements() {
        return statementList;
    }

     @Override
    public String print(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(getIndent(level))
                .append("NodeName :")
                .append(nodeName)
                .append("\n(line :")
                .append(lineNumber)
                .append(")\n");

        for (Node stmt : statementList) {
            sb.append(stmt.print(level + 1));
        }

        return sb.toString();
    }


//        @Override
//    public String toString() {
//        StringBuilder statements = new StringBuilder();
//
//        for (int i = 0; i < statementList.size(); i++)
//            statements.append(statementList.get(i).toString());
//
//        return statements.toString();
//    }
}
