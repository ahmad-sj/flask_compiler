// Generated from C:/Users/ASUS/Desktop/compiler project/grammars/pythonParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(pythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(pythonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(pythonParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(pythonParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#call_or_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_or_name(pythonParser.Call_or_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(pythonParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(pythonParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(pythonParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(pythonParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(pythonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(pythonParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(pythonParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(pythonParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_list(pythonParser.Target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(pythonParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(pythonParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(pythonParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(pythonParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(pythonParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(pythonParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(pythonParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(pythonParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(pythonParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(pythonParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(pythonParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(pythonParser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_value(pythonParser.Key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(pythonParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(pythonParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(pythonParser.Dotted_nameContext ctx);
}