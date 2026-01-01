package symbols;

import models.Node;

import java.util.HashMap;

public class Symbol {
    public String name;
    public String kind; // "variable", "method", "class", "namespace"
    public String type; // e.g., "int", "MyClass"
    public Node value;
    public Scope scope; // The scope this symbol belongs to
    public HashMap<String, Object> attributes; // Extra info (e.g., method parameters)

    public Symbol(String name, String kind, String type, Node value, Scope scope) {
        this.name = name;
        this.kind = kind;
        this.type = type;
        this.scope = scope;
        this.value = value;
        this.attributes = new HashMap<String, Object>();
    }

    @Override
    public String toString() {
        System.out.format("%-30s%-30s%-30s%-40s%-30s%n", name, kind, type, value.toString(), scope.name);
        return "";
    }
}
