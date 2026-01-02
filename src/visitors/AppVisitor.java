package visitors;

import antlr.pythonParser;
import antlr.pythonParserBaseVisitor;
import models.App;
import models.Node;

public class AppVisitor extends pythonParserBaseVisitor<App> {
    @Override
    public App visitProg(pythonParser.ProgContext ctx) {
        App app = new App();

        PythonVisitor pythonVisitor = new PythonVisitor();

        for (int i = 0; i < ctx.getChildCount() - 1; i++) {
            Node child = pythonVisitor.visit(ctx.getChild(i));
            app.addNode(child);
        }

        return app;
    }
}
