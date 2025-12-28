package app;

import models.Node;
import models.Template;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import antlr.templateParser;
import antlr.templateLexer;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.TemplateVisitor;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FlaskCompiler {
    public static void main(String[] args) {

        // Get the current working directory (project root in most cases)
        Path currentPath = Paths.get("").toAbsolutePath();

        String addTemplate = "tests/add.html";
        String indexTemplate = "tests/index.html";

        Path fullPath = currentPath.resolve(indexTemplate);

//        IO.print("Enter file path: ");
//        String filePath = IO.readln();

//        if (args.length != 1) {
//            System.err.print("Usage: file name\n");
//        } else {
//            String fileName = args[0];
            String fileName = fullPath.toString();
            templateParser parser = getParser(fileName);

            // tell antlr to build a parse tree
            // parse from the start symbol (template)
            ParseTree antlrAST = parser.template();

            // create a visitor for converting the parse tree into node object
            TemplateVisitor templateVisitor = new TemplateVisitor();
            Template template = templateVisitor.visit(antlrAST);

            for (Node node : template.nodes) {
//                System.out.println(node);
                System.out.println(node.print(0));
            }
//        }
    }

    // types of parser and lexer are specific to the grammar name template.
    private static templateParser getParser(String fileName) {
        templateParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            templateLexer lexer = new templateLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new templateParser(tokens);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return parser;
    }
}