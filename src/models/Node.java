package models;

public abstract class Node {
//    public String name;
    protected String nodeName;
    protected int lineNumber;

    public void setNodeName(String nodeName){
        this.nodeName = nodeName;
    }

    public void setLineNumber(int lineNumber){
        this.lineNumber = lineNumber;
    }
}
