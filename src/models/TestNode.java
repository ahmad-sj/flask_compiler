package models;

public class TestNode extends Node{

    public String testNodeName;


    public TestNode(String testNodeName) {
        this.testNodeName = testNodeName;
    }

    @Override
    public String toString() {
        return testNodeName;
    }
}
