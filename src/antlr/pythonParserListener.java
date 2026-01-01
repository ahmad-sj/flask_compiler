// Generated from C:/Users/Admin/Desktop/compiler project/flask_compiler/grammars/pythonParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(pythonParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(pythonParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(pythonParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(pythonParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(pythonParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(pythonParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(pythonParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(pythonParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#pass}.
	 * @param ctx the parse tree
	 */
	void enterPass(pythonParser.PassContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#pass}.
	 * @param ctx the parse tree
	 */
	void exitPass(pythonParser.PassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleImport}
	 * labeled alternative in {@link pythonParser#importLine}.
	 * @param ctx the parse tree
	 */
	void enterSingleImport(pythonParser.SingleImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleImport}
	 * labeled alternative in {@link pythonParser#importLine}.
	 * @param ctx the parse tree
	 */
	void exitSingleImport(pythonParser.SingleImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiImport}
	 * labeled alternative in {@link pythonParser#importLine}.
	 * @param ctx the parse tree
	 */
	void enterMultiImport(pythonParser.MultiImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiImport}
	 * labeled alternative in {@link pythonParser#importLine}.
	 * @param ctx the parse tree
	 */
	void exitMultiImport(pythonParser.MultiImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(pythonParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(pythonParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assignLine}.
	 * @param ctx the parse tree
	 */
	void enterAssignLine(pythonParser.AssignLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assignLine}.
	 * @param ctx the parse tree
	 */
	void exitAssignLine(pythonParser.AssignLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(pythonParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(pythonParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(pythonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(pythonParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#valueTrailer}.
	 * @param ctx the parse tree
	 */
	void enterValueTrailer(pythonParser.ValueTrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#valueTrailer}.
	 * @param ctx the parse tree
	 */
	void exitValueTrailer(pythonParser.ValueTrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dotTrailer}.
	 * @param ctx the parse tree
	 */
	void enterDotTrailer(pythonParser.DotTrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dotTrailer}.
	 * @param ctx the parse tree
	 */
	void exitDotTrailer(pythonParser.DotTrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#squareTrailer}.
	 * @param ctx the parse tree
	 */
	void enterSquareTrailer(pythonParser.SquareTrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#squareTrailer}.
	 * @param ctx the parse tree
	 */
	void exitSquareTrailer(pythonParser.SquareTrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#baseValue}.
	 * @param ctx the parse tree
	 */
	void enterBaseValue(pythonParser.BaseValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#baseValue}.
	 * @param ctx the parse tree
	 */
	void exitBaseValue(pythonParser.BaseValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#tupleExpr}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpr(pythonParser.TupleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#tupleExpr}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpr(pythonParser.TupleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#genExpr}.
	 * @param ctx the parse tree
	 */
	void enterGenExpr(pythonParser.GenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#genExpr}.
	 * @param ctx the parse tree
	 */
	void exitGenExpr(pythonParser.GenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#callArgs}.
	 * @param ctx the parse tree
	 */
	void enterCallArgs(pythonParser.CallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#callArgs}.
	 * @param ctx the parse tree
	 */
	void exitCallArgs(pythonParser.CallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#callList}.
	 * @param ctx the parse tree
	 */
	void enterCallList(pythonParser.CallListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#callList}.
	 * @param ctx the parse tree
	 */
	void exitCallList(pythonParser.CallListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#callArg}.
	 * @param ctx the parse tree
	 */
	void enterCallArg(pythonParser.CallArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#callArg}.
	 * @param ctx the parse tree
	 */
	void exitCallArg(pythonParser.CallArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#returnLine}.
	 * @param ctx the parse tree
	 */
	void enterReturnLine(pythonParser.ReturnLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#returnLine}.
	 * @param ctx the parse tree
	 */
	void exitReturnLine(pythonParser.ReturnLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#exprLine}.
	 * @param ctx the parse tree
	 */
	void enterExprLine(pythonParser.ExprLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#exprLine}.
	 * @param ctx the parse tree
	 */
	void exitExprLine(pythonParser.ExprLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(pythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(pythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(pythonParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(pythonParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(pythonParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(pythonParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(pythonParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#equalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(pythonParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(pythonParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(pythonParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(pythonParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(pythonParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(pythonParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(pythonParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#singleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpr(pythonParser.SingleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#singleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpr(pythonParser.SingleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(pythonParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(pythonParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(pythonParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(pythonParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(pythonParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(pythonParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(pythonParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(pythonParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#argsNames}.
	 * @param ctx the parse tree
	 */
	void enterArgsNames(pythonParser.ArgsNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#argsNames}.
	 * @param ctx the parse tree
	 */
	void exitArgsNames(pythonParser.ArgsNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(pythonParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(pythonParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(pythonParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(pythonParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(pythonParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(pythonParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#listVal}.
	 * @param ctx the parse tree
	 */
	void enterListVal(pythonParser.ListValContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#listVal}.
	 * @param ctx the parse tree
	 */
	void exitListVal(pythonParser.ListValContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(pythonParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(pythonParser.ListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#listItemSeparator}.
	 * @param ctx the parse tree
	 */
	void enterListItemSeparator(pythonParser.ListItemSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#listItemSeparator}.
	 * @param ctx the parse tree
	 */
	void exitListItemSeparator(pythonParser.ListItemSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dictVal}.
	 * @param ctx the parse tree
	 */
	void enterDictVal(pythonParser.DictValContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dictVal}.
	 * @param ctx the parse tree
	 */
	void exitDictVal(pythonParser.DictValContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dictItem}.
	 * @param ctx the parse tree
	 */
	void enterDictItem(pythonParser.DictItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dictItem}.
	 * @param ctx the parse tree
	 */
	void exitDictItem(pythonParser.DictItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dictItemSeparator}.
	 * @param ctx the parse tree
	 */
	void enterDictItemSeparator(pythonParser.DictItemSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dictItemSeparator}.
	 * @param ctx the parse tree
	 */
	void exitDictItemSeparator(pythonParser.DictItemSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(pythonParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(pythonParser.LiteralContext ctx);
}