package app;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FlaskCompiler {
    public static void main(String[] args) {

        // creating an array with file names to be compiled
        ArrayList<String> fileNames = new ArrayList<>();
        fileNames.add("tests/base.html");
        fileNames.add("tests/index.html");
        fileNames.add("tests/add.html");
        fileNames.add("tests/detail.html");

        // Get the current working directory (project root in most cases)
        Path currentPath = Paths.get("").toAbsolutePath();

        // getting files full path
        ArrayList<String> files = new ArrayList<>();
        for (String fileName : fileNames) {

            // get full path for file name number i
            Path filePathObject = currentPath.resolve(fileName);

            // add file full path to files array
            files.add(filePathObject.toString());
        }

        // passing array of files full path to compiler
        TemplateCompiler templateCompiler = new TemplateCompiler(files);

        // start compiling
        templateCompiler.compile();
    }
}