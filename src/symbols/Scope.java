package symbols;

import models.Node;

import java.util.*;

public class Scope {
    public String name; // e.g., "MyNamespace", "MyClass", "MyMethod"
    public Scope parent; // Parent scope (null for global)
    public HashMap<String, Symbol> symbols; // symbols in this scope
    public List<Scope> children; // Nested scopes (e.g., blocks inside a method)

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
        this.symbols = new HashMap<String, Symbol>();
        this.children = new ArrayList<>();
        if (parent != null) {
            parent.children.add(this);
        }
    }

    public void define(String name, String kind, String type, Node value) {
        Symbol symbol = new Symbol(name, kind, type, value, this);

        if (symbols.containsKey(name)) {
            throw new RuntimeException(
                    String.format("Symbol '%s' already defined in scope '%s'.", name, this.name));
        }

        symbols.put(name, symbol);
    }

    public Symbol resolve(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol != null) {
            return symbol;
        }

        // Walk up the scope chain
        if (parent != null) {
            return parent.resolve(name);
        }

        return null; // Not found in this scope or any parent
    }

    public void print() {

        for (Map.Entry<String, Symbol> entry : symbols.entrySet()) {
            System.out.println(entry.getValue());
        }

        for (Scope child : children) {
            child.print();
        }

    }
}
