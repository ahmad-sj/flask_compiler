package app;

import antlr.pythonLexer;
import antlr.pythonParser;
import models.App;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
import visitors.AppVisitor;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FlaskCompiler {
    public static void main(String[] args) {

        // getting parser for python file
        try {
            // مسار الملف app.py
            Path currentPath = Paths.get("").toAbsolutePath();
            Path fullPath = currentPath.resolve("tests/app.py");

            // إنشاء Lexer و Parser
            CharStream input = CharStreams.fromFileName(fullPath.toString());
            pythonLexer lexer = new pythonLexer(input, 0);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // طباعة جميع التوكنات للتأكد من INDENT و DEDENT
//            tokens.fill(); // اجلب كل التوكنات
//            List<Token> tokenList = tokens.getTokens();
//            System.out.println("Tokens (type : text) including INDENT/DEDENT:");
//            for (Token t : tokenList) {
//                String tokenName = pythonLexer.VOCABULARY.getSymbolicName(t.getType());
//                System.out.printf("%s : '%s'%n", tokenName, t.getText().replace("\r","\\r").replace("\n","\\n"));
//            }

            // تمرير التوكنات للـ parser
            pythonParser parser = new pythonParser(tokens);

            // إنشاء Parse Tree من القاعدة الرئيسية
            ParseTree tree = parser.prog();

            // طباعة Parse Tree بشكل نصي
//            System.out.println("\nParse Tree (text format):");
//            System.out.println(tree.toStringTree(parser));
//
//            // طباعة Parse Tree بشكل شجري (Hierarchy)
//            System.out.println("\nParse Tree (hierarchy):");
//            printTree(tree, parser, 0);


            AppVisitor appVisitor = new AppVisitor();
            App app = appVisitor.visit(tree);

            IO.println("================================================================================");
            for (int i = 0; i < app.nodes.size(); i++) {
                IO.println(app.nodes.get(i).toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ===================================================================================
        // getting template files

        // creating an array with file names to be compiled
//        ArrayList<String> fileNames = new ArrayList<>();
//        fileNames.add("tests/base.html");
//        fileNames.add("tests/index.html");
//        fileNames.add("tests/add.html");
//        fileNames.add("tests/detail.html");
//        fileNames.add("tests/tests.html");

        // Get the current working directory (project root in most cases)
//        Path currentPath = Paths.get("").toAbsolutePath();

        // getting files full path
//        ArrayList<String> files = new ArrayList<>();
//        for (String fileName : fileNames) {

        // get full path for file name number i
//            Path filePathObject = currentPath.resolve(fileName);

        // add file full path to files array
//            files.add(filePathObject.toString());
//        }

        // passing array of files full path to compiler
//        TemplateCompiler templateCompiler = new TemplateCompiler(files);

        // start compiling
//        templateCompiler.compile();
    }

    // دالة مساعدة لطباعة شجرة Parse Tree بشكل هرمي
    private static void printTree(ParseTree tree, pythonParser parser, int indent) {
        for (int i = 0; i < indent; i++) System.out.print("  ");
        String nodeText = Trees.getNodeText(tree, parser);

        // إبراز INDENT / DEDENT
        if (nodeText.equals("INDENT")) {
            System.out.println("▶ INDENT");
        } else if (nodeText.equals("DEDENT")) {
            System.out.println("◀ DEDENT");
        } else {
            System.out.println(nodeText);
        }

        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), parser, indent + 1);
        }
    }

}