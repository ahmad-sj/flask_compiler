package symbols;

import models.Node;

public class SymbolTable {
    public Scope globalScope;
    public Scope currentScope;

    public SymbolTable() {
        globalScope = new Scope("global", null);
        currentScope = globalScope;
    }

    // Enter a new scope
    public void enterScope(String name) {
        currentScope = new Scope(name, currentScope);
    }

    // Exit the current scope
    public void exitScope() {
        if (currentScope.parent != null) {
            currentScope = currentScope.parent;
        }
    }

    // Define a symbol in the current scope
    public void define(String name, String kind, String type, Node value) {
        currentScope.define(name, kind, type, value);
    }

    // Resolve a symbol starting from the current scope
    public Symbol resolve(String name) {
        var symbol = currentScope.resolve(name);
        if (symbol == null) {
            throw new RuntimeException(
                    String.format("Symbol '%s' not found in current or parent scopes.", name));
        }
        return symbol;
    }

    public void print() {
        System.out.format("%-30s%-30s%-30s%-40s%-30s%n", "symbol", "kind", "type", "value", "scope");
        System.out.format("%-30s%-30s%-30s%-40s%-30s%n", "--------------", "--------------", "--------------", "--------------", "--------------");
        globalScope.print();
    }
}
