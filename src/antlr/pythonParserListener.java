// Generated from C:/Users/ASUS/Desktop/compiler project/grammars/pythonParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(pythonParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(pythonParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(pythonParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(pythonParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#call_or_name}.
	 * @param ctx the parse tree
	 */
	void enterCall_or_name(pythonParser.Call_or_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#call_or_name}.
	 * @param ctx the parse tree
	 */
	void exitCall_or_name(pythonParser.Call_or_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(pythonParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(pythonParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(pythonParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(pythonParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(pythonParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(pythonParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(pythonParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(pythonParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(pythonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(pythonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(pythonParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(pythonParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(pythonParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(pythonParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(pythonParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(pythonParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#target_list}.
	 * @param ctx the parse tree
	 */
	void enterTarget_list(pythonParser.Target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#target_list}.
	 * @param ctx the parse tree
	 */
	void exitTarget_list(pythonParser.Target_listContext ctx);
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
	 * Enter a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(pythonParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(pythonParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(pythonParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(pythonParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(pythonParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(pythonParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(pythonParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(pythonParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(pythonParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(pythonParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(pythonParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(pythonParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(pythonParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pythonParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pythonParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(pythonParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(pythonParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(pythonParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(pythonParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(pythonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(pythonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(pythonParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(pythonParser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#key_value}.
	 * @param ctx the parse tree
	 */
	void enterKey_value(pythonParser.Key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#key_value}.
	 * @param ctx the parse tree
	 */
	void exitKey_value(pythonParser.Key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(pythonParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(pythonParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(pythonParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(pythonParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(pythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(pythonParser.Dotted_nameContext ctx);
}