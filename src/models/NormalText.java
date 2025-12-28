package models;

public class NormalText extends Node{
    public String text;

    public NormalText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }

    @Override
    public String print(int level) {
        String indent = getIndent(level);

        return "text: " + this.toString() + "\n";
    }
}
