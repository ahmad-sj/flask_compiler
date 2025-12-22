package visitors.jinja;

import antlr.templateParser;
import antlr.templateParserBaseVisitor;
import models.Node;
import models.jinja.JinjaId;
import models.jinja.blocks.forBlock.ForBlockBody;
import models.jinja.blocks.forBlock.ForBlockEndStatement;
import models.jinja.blocks.forBlock.ForBlockStartStatement;
import models.jinja.blocks.forBlock.ForLoopVariables;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.NodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class JinjaForLoopVisitor extends templateParserBaseVisitor<Node> {
    @Override
    public Node visitForStartStatement(templateParser.ForStartStatementContext ctx) {
        ArrayList<JinjaId> loopVariables = new ArrayList<>();

        Token firstLoopVariableToken =
                ctx.iterationStatement().loopVariables().firstLoopVariable().J_LOOP_VARIABLE().getSymbol();

        // getting data of first loop variable
        JinjaId firstLoopVariable = new JinjaId(firstLoopVariableToken.getText());
        firstLoopVariable.setNodeName("loop variable: " + firstLoopVariableToken.getText());
        firstLoopVariable.setLineNumber(firstLoopVariableToken.getLine());

        loopVariables.add(firstLoopVariable);

        // checking if there are other loop variables and getting their data
        List<templateParser.AnotherLoopVariableContext> otherLoopVariables =
                ctx.iterationStatement().loopVariables().anotherLoopVariable();

        if (otherLoopVariables != null){
            for (templateParser.AnotherLoopVariableContext context : otherLoopVariables){
                Token anotherLoopVariableToken = context.J_LOOP_VARIABLE().getSymbol();

                JinjaId anotherLoopVariable = new JinjaId(anotherLoopVariableToken.getText());
                anotherLoopVariable.setNodeName("loop variable: " + anotherLoopVariableToken.getText());
                anotherLoopVariable.setLineNumber(anotherLoopVariableToken.getLine());

                loopVariables.add(new JinjaId(context.J_LOOP_VARIABLE().getText()));
            }
        }

        // getting data of the iterable variable
        Token iterableToken = ctx.iterationStatement().iterable().J_LOOP_ITERABLE().getSymbol();
        JinjaId iterable = new JinjaId(iterableToken.getText());
        iterable.setNodeName("for iterable: " + iterableToken.getText());
        iterable.setLineNumber(iterableToken.getLine());

        // creating for start statement object
        ForBlockStartStatement forBlockStartStatement = new ForBlockStartStatement(new ForLoopVariables(loopVariables), iterable);
        forBlockStartStatement.setNodeName("for block start statement");
        forBlockStartStatement.setLineNumber(ctx.J_STMNT_START().getSymbol().getLine());

        return forBlockStartStatement;
    }

    @Override
    public Node visitForBody(templateParser.ForBodyContext ctx) {
        ArrayList<Node> nodesList = new ArrayList<>();
        NodeVisitor nodeVisitor = new NodeVisitor();

        for (ParseTree child : ctx.children){
            nodesList.add(nodeVisitor.visit(child));
        }
        return new ForBlockBody(nodesList);
    }

    @Override
    public Node visitForEndStatement(templateParser.ForEndStatementContext ctx) {
        ForBlockEndStatement forBlockEndStatement = new ForBlockEndStatement();
        forBlockEndStatement.setNodeName("for block end statement");
        forBlockEndStatement.setLineNumber(ctx.J_STMNT_START().getSymbol().getLine());

        return new ForBlockEndStatement();
    }
}
