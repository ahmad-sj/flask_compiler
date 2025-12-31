// Generated from C:/Users/Admin/Desktop/compiler project/flask_compiler/grammars/templateParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class templateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		J_EXPR_START=1, J_STMNT_START=2, J_COMMENT=3, DOCTYPE=4, HTML_COMMENT=5, 
		CLOSE_TAG_START=6, START_TAG_OPEN=7, WS=8, NORMAL_TEXT=9, IF=10, ELIF=11, 
		FOR=12, EXTENDS=13, BLOCK=14, SET=15, ELSE=16, ENDIF=17, ENDFOR=18, ENDBLOCK=19, 
		J_STMNT_END=20, J_STMNT_WS=21, MUL=22, PLUS=23, MINUS=24, DIV=25, FLOORDIV=26, 
		MOD=27, POW=28, AND=29, OR=30, NOT=31, IS=32, EQ=33, NEQ=34, GT=35, GE=36, 
		LT=37, LE=38, IN=39, QMARK=40, ELVIS=41, ASSIGN=42, TILDE=43, PIPELINE=44, 
		COMMA=45, DOT=46, COLON=47, LPAREN=48, RPAREN=49, LSB=50, RSB=51, LBRACE=52, 
		RBRACE=53, FLOAT=54, INT=55, STRING=56, ID=57, J_EXPR_END=58, J_EXPR_STMNT_END=59, 
		EXPRESSION_MODE_WS=60, STYLE_TAG_START_NAME=61, START_TAG_NAME=62, START_TAG_WS=63, 
		END_TAG_NAME=64, END_TAG_CLOSE=65, END_TAG_MODE_WS=66, STYLE_TAG_START_CLOSE=67, 
		STYLE_START_TAG_MODE_WS=68, STYLE_END_TAG_NAME=69, STYLE_END_TAG_CLOSE=70, 
		STYLE_END_TAG_MODE_WS=71, STYLE_ATTR=72, ATTR_NAME=73, ATTR_EQ=74, INSIDE_START_TAG_J_EXPR_OPEN=75, 
		START_TAG_CLOSE=76, SELF_CLOSING_TAG_CLOSE=77, INSIDE_START_TAG_MODE_WS=78, 
		ATTR_DQUOTE_START=79, ATTR_VALUE_UNQUOTED=80, ATTR_VAL_WS=81, ATTR_VAL_J_EXPR_START=82, 
		ATTR_VAL_TEXT=83, ATTR_DQUOTE_END=84, ATTR_VAL_QOUTED_WS=85, CLOSE_STYLE_START=86, 
		CSS_SEL_ID=87, CSS_SEL_CLASS=88, CSS_SEL_ELEM=89, CSS_SEL_STATE=90, CSS_SEL_COMMA=91, 
		CSS_LBRACE=92, STYLE_EXIT_RAB=93, CSS_WS=94, CSS_INLINE_EQ=95, CSS_INLINE_DQUOT_START=96, 
		CSS_INLINE_WS=97, BLK_PROP_NAME=98, BLK_COLON=99, BLK_RBRACE=100, BLK_WS=101, 
		CSS_INLINE_PROP_NAME=102, CSS_INLINE_PROP_COLON=103, CSS_INLINE_PROP_DQUOT_END=104, 
		CSS_INLINE_PROP_WS=105, CSS_PROP_VAL=106, CSS_PROP_SEMICOLON=107, CSS_PROP_VALUES_WS=108;
	public static final int
		RULE_template = 0, RULE_jinjaElement = 1, RULE_templateText = 2, RULE_setStatement = 3, 
		RULE_ifBlock = 4, RULE_ifStatmentStart = 5, RULE_ifBody = 6, RULE_ifBodyElem = 7, 
		RULE_ifStatmentEnd = 8, RULE_elifBlock = 9, RULE_elseBlock = 10, RULE_subBlock = 11, 
		RULE_forBlock = 12, RULE_forStartStatement = 13, RULE_forEndStatement = 14, 
		RULE_forBody = 15, RULE_extendsBlock = 16, RULE_inheritBlock = 17, RULE_inheritBlockBody = 18, 
		RULE_inheritBlockStart = 19, RULE_inheritBlockEnd = 20, RULE_jinjaExpression = 21, 
		RULE_jinjaExprStart = 22, RULE_jinjaExprEnd = 23, RULE_expression = 24, 
		RULE_ternaryExt = 25, RULE_defaultExpr = 26, RULE_orExpr = 27, RULE_andExpr = 28, 
		RULE_notExpr = 29, RULE_compareExpr = 30, RULE_comparisonOperator = 31, 
		RULE_pipeExpr = 32, RULE_filter = 33, RULE_argumentList = 34, RULE_argument = 35, 
		RULE_concatExpr = 36, RULE_addExpr = 37, RULE_addExprOptor = 38, RULE_mulExpr = 39, 
		RULE_mulExprOptor = 40, RULE_unaryExpr = 41, RULE_powExpr = 42, RULE_atom = 43, 
		RULE_pair = 44, RULE_primary = 45, RULE_trailer = 46, RULE_htmlElement = 47, 
		RULE_htmlRegularElement = 48, RULE_htmlStartTag = 49, RULE_htmlElementBody = 50, 
		RULE_htmlEndTag = 51, RULE_htmlSelfClosingElement = 52, RULE_htmlSelfClosingTag = 53, 
		RULE_htmlTagAttr = 54, RULE_booleanAttr = 55, RULE_attrWithUnquotedVal = 56, 
		RULE_attrWithQuotedVal = 57, RULE_quotedValElem = 58, RULE_jinjaAttrVal = 59, 
		RULE_styleAttr = 60, RULE_inlineStyleProp = 61, RULE_htmlStyleElem = 62, 
		RULE_htmlStyleElemOpenTag = 63, RULE_htmlStyleElemCloseTag = 64, RULE_cssBlock = 65, 
		RULE_selectorList = 66, RULE_selector = 67, RULE_simpleSelector = 68, 
		RULE_pseudoClassSelector = 69, RULE_cssProp = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "jinjaElement", "templateText", "setStatement", "ifBlock", 
			"ifStatmentStart", "ifBody", "ifBodyElem", "ifStatmentEnd", "elifBlock", 
			"elseBlock", "subBlock", "forBlock", "forStartStatement", "forEndStatement", 
			"forBody", "extendsBlock", "inheritBlock", "inheritBlockBody", "inheritBlockStart", 
			"inheritBlockEnd", "jinjaExpression", "jinjaExprStart", "jinjaExprEnd", 
			"expression", "ternaryExt", "defaultExpr", "orExpr", "andExpr", "notExpr", 
			"compareExpr", "comparisonOperator", "pipeExpr", "filter", "argumentList", 
			"argument", "concatExpr", "addExpr", "addExprOptor", "mulExpr", "mulExprOptor", 
			"unaryExpr", "powExpr", "atom", "pair", "primary", "trailer", "htmlElement", 
			"htmlRegularElement", "htmlStartTag", "htmlElementBody", "htmlEndTag", 
			"htmlSelfClosingElement", "htmlSelfClosingTag", "htmlTagAttr", "booleanAttr", 
			"attrWithUnquotedVal", "attrWithQuotedVal", "quotedValElem", "jinjaAttrVal", 
			"styleAttr", "inlineStyleProp", "htmlStyleElem", "htmlStyleElemOpenTag", 
			"htmlStyleElemCloseTag", "cssBlock", "selectorList", "selector", "simpleSelector", 
			"pseudoClassSelector", "cssProp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{%'", null, "'<!DOCTYPE html>'", null, null, null, null, 
			null, "'if'", "'elif'", "'for'", "'extends'", "'block'", "'set'", "'else'", 
			"'endif'", "'endfor'", "'endblock'", null, null, "'*'", "'+'", "'-'", 
			"'/'", "'//'", "'%'", "'**'", "'and'", "'or'", "'not'", "'is'", "'=='", 
			"'!='", null, "'>='", null, "'<='", "'in'", "'?'", "'??'", "'='", "'~'", 
			"'|'", "','", "'.'", "':'", "'('", "')'", "'['", "']'", null, null, null, 
			null, null, null, "'}}'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "J_EXPR_START", "J_STMNT_START", "J_COMMENT", "DOCTYPE", "HTML_COMMENT", 
			"CLOSE_TAG_START", "START_TAG_OPEN", "WS", "NORMAL_TEXT", "IF", "ELIF", 
			"FOR", "EXTENDS", "BLOCK", "SET", "ELSE", "ENDIF", "ENDFOR", "ENDBLOCK", 
			"J_STMNT_END", "J_STMNT_WS", "MUL", "PLUS", "MINUS", "DIV", "FLOORDIV", 
			"MOD", "POW", "AND", "OR", "NOT", "IS", "EQ", "NEQ", "GT", "GE", "LT", 
			"LE", "IN", "QMARK", "ELVIS", "ASSIGN", "TILDE", "PIPELINE", "COMMA", 
			"DOT", "COLON", "LPAREN", "RPAREN", "LSB", "RSB", "LBRACE", "RBRACE", 
			"FLOAT", "INT", "STRING", "ID", "J_EXPR_END", "J_EXPR_STMNT_END", "EXPRESSION_MODE_WS", 
			"STYLE_TAG_START_NAME", "START_TAG_NAME", "START_TAG_WS", "END_TAG_NAME", 
			"END_TAG_CLOSE", "END_TAG_MODE_WS", "STYLE_TAG_START_CLOSE", "STYLE_START_TAG_MODE_WS", 
			"STYLE_END_TAG_NAME", "STYLE_END_TAG_CLOSE", "STYLE_END_TAG_MODE_WS", 
			"STYLE_ATTR", "ATTR_NAME", "ATTR_EQ", "INSIDE_START_TAG_J_EXPR_OPEN", 
			"START_TAG_CLOSE", "SELF_CLOSING_TAG_CLOSE", "INSIDE_START_TAG_MODE_WS", 
			"ATTR_DQUOTE_START", "ATTR_VALUE_UNQUOTED", "ATTR_VAL_WS", "ATTR_VAL_J_EXPR_START", 
			"ATTR_VAL_TEXT", "ATTR_DQUOTE_END", "ATTR_VAL_QOUTED_WS", "CLOSE_STYLE_START", 
			"CSS_SEL_ID", "CSS_SEL_CLASS", "CSS_SEL_ELEM", "CSS_SEL_STATE", "CSS_SEL_COMMA", 
			"CSS_LBRACE", "STYLE_EXIT_RAB", "CSS_WS", "CSS_INLINE_EQ", "CSS_INLINE_DQUOT_START", 
			"CSS_INLINE_WS", "BLK_PROP_NAME", "BLK_COLON", "BLK_RBRACE", "BLK_WS", 
			"CSS_INLINE_PROP_NAME", "CSS_INLINE_PROP_COLON", "CSS_INLINE_PROP_DQUOT_END", 
			"CSS_INLINE_PROP_WS", "CSS_PROP_VAL", "CSS_PROP_SEMICOLON", "CSS_PROP_VALUES_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "templateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public templateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(templateParser.EOF, 0); }
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public ExtendsBlockContext extendsBlock() {
			return getRuleContext(ExtendsBlockContext.class,0);
		}
		public List<JinjaElementContext> jinjaElement() {
			return getRuleContexts(JinjaElementContext.class);
		}
		public JinjaElementContext jinjaElement(int i) {
			return getRuleContext(JinjaElementContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(142);
				extendsBlock();
				}
				break;
			}
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_TAG_OPEN:
				{
				setState(145);
				htmlElement();
				}
				break;
			case EOF:
			case J_EXPR_START:
			case J_STMNT_START:
			case INSIDE_START_TAG_J_EXPR_OPEN:
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J_EXPR_START || _la==J_STMNT_START || _la==INSIDE_START_TAG_J_EXPR_OPEN) {
					{
					{
					setState(146);
					jinjaElement();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElementContext extends ParserRuleContext {
		public InheritBlockContext inheritBlock() {
			return getRuleContext(InheritBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public JinjaElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterJinjaElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitJinjaElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitJinjaElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElementContext jinjaElement() throws RecognitionException {
		JinjaElementContext _localctx = new JinjaElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jinjaElement);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				inheritBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				forBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				jinjaExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				setStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateTextContext extends ParserRuleContext {
		public TerminalNode NORMAL_TEXT() { return getToken(templateParser.NORMAL_TEXT, 0); }
		public TemplateTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterTemplateText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitTemplateText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitTemplateText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateTextContext templateText() throws RecognitionException {
		TemplateTextContext _localctx = new TemplateTextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_templateText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(NORMAL_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetStatementContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode SET() { return getToken(templateParser.SET, 0); }
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(templateParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode J_EXPR_STMNT_END() { return getToken(templateParser.J_EXPR_STMNT_END, 0); }
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(J_STMNT_START);
			setState(166);
			match(SET);
			setState(167);
			match(ID);
			setState(168);
			match(ASSIGN);
			setState(169);
			expression();
			setState(170);
			match(J_EXPR_STMNT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public IfStatmentStartContext ifStatmentStart() {
			return getRuleContext(IfStatmentStartContext.class,0);
		}
		public IfStatmentEndContext ifStatmentEnd() {
			return getRuleContext(IfStatmentEndContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			ifStatmentStart();
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(173);
				ifBody();
				}
				break;
			}
			setState(176);
			ifStatmentEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatmentStartContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode IF() { return getToken(templateParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode J_EXPR_STMNT_END() { return getToken(templateParser.J_EXPR_STMNT_END, 0); }
		public IfStatmentStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatmentStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIfStatmentStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIfStatmentStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIfStatmentStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatmentStartContext ifStatmentStart() throws RecognitionException {
		IfStatmentStartContext _localctx = new IfStatmentStartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatmentStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(J_STMNT_START);
			setState(179);
			match(IF);
			setState(180);
			expression();
			setState(181);
			match(J_EXPR_STMNT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfBodyContext extends ParserRuleContext {
		public List<IfBodyElemContext> ifBodyElem() {
			return getRuleContexts(IfBodyElemContext.class);
		}
		public IfBodyElemContext ifBodyElem(int i) {
			return getRuleContext(IfBodyElemContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifBody);
		try {
			int _alt;
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(183);
						ifBodyElem();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(186); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(188);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				elseBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfBodyElemContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElifBlockContext elifBlock() {
			return getRuleContext(ElifBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TemplateTextContext templateText() {
			return getRuleContext(TemplateTextContext.class,0);
		}
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public IfBodyElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBodyElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIfBodyElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIfBodyElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIfBodyElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyElemContext ifBodyElem() throws RecognitionException {
		IfBodyElemContext _localctx = new IfBodyElemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifBodyElem);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				elifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				forBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				jinjaExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				htmlElement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				templateText();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				setStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatmentEndContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode ENDIF() { return getToken(templateParser.ENDIF, 0); }
		public TerminalNode J_STMNT_END() { return getToken(templateParser.J_STMNT_END, 0); }
		public IfStatmentEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatmentEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIfStatmentEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIfStatmentEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIfStatmentEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatmentEndContext ifStatmentEnd() throws RecognitionException {
		IfStatmentEndContext _localctx = new IfStatmentEndContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatmentEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(J_STMNT_START);
			setState(204);
			match(ENDIF);
			setState(205);
			match(J_STMNT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElifBlockContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode ELIF() { return getToken(templateParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode J_EXPR_STMNT_END() { return getToken(templateParser.J_EXPR_STMNT_END, 0); }
		public List<SubBlockContext> subBlock() {
			return getRuleContexts(SubBlockContext.class);
		}
		public SubBlockContext subBlock(int i) {
			return getRuleContext(SubBlockContext.class,i);
		}
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterElifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitElifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitElifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(J_STMNT_START);
			setState(208);
			match(ELIF);
			setState(209);
			expression();
			setState(210);
			match(J_EXPR_STMNT_END);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					subBlock();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode ELSE() { return getToken(templateParser.ELSE, 0); }
		public TerminalNode J_STMNT_END() { return getToken(templateParser.J_STMNT_END, 0); }
		public List<SubBlockContext> subBlock() {
			return getRuleContexts(SubBlockContext.class);
		}
		public SubBlockContext subBlock(int i) {
			return getRuleContext(SubBlockContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(J_STMNT_START);
			setState(218);
			match(ELSE);
			setState(219);
			match(J_STMNT_END);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					subBlock();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubBlockContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TemplateTextContext templateText() {
			return getRuleContext(TemplateTextContext.class,0);
		}
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public SubBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterSubBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitSubBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitSubBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubBlockContext subBlock() throws RecognitionException {
		SubBlockContext _localctx = new SubBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subBlock);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				forBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				jinjaExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				htmlElement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				templateText();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				setStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForBlockContext extends ParserRuleContext {
		public ForStartStatementContext forStartStatement() {
			return getRuleContext(ForStartStatementContext.class,0);
		}
		public ForEndStatementContext forEndStatement() {
			return getRuleContext(ForEndStatementContext.class,0);
		}
		public ForBodyContext forBody() {
			return getRuleContext(ForBodyContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			forStartStatement();
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(235);
				forBody();
				}
				break;
			}
			setState(238);
			forEndStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStartStatementContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode FOR() { return getToken(templateParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(templateParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(templateParser.ID, i);
		}
		public TerminalNode IN() { return getToken(templateParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode J_EXPR_STMNT_END() { return getToken(templateParser.J_EXPR_STMNT_END, 0); }
		public List<TerminalNode> COMMA() { return getTokens(templateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(templateParser.COMMA, i);
		}
		public ForStartStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStartStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterForStartStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitForStartStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitForStartStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStartStatementContext forStartStatement() throws RecognitionException {
		ForStartStatementContext _localctx = new ForStartStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStartStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(J_STMNT_START);
			setState(241);
			match(FOR);
			setState(242);
			match(ID);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(243);
				match(COMMA);
				setState(244);
				match(ID);
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(IN);
			setState(251);
			expression();
			setState(252);
			match(J_EXPR_STMNT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForEndStatementContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode ENDFOR() { return getToken(templateParser.ENDFOR, 0); }
		public TerminalNode J_STMNT_END() { return getToken(templateParser.J_STMNT_END, 0); }
		public ForEndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEndStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterForEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitForEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitForEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEndStatementContext forEndStatement() throws RecognitionException {
		ForEndStatementContext _localctx = new ForEndStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(J_STMNT_START);
			setState(255);
			match(ENDFOR);
			setState(256);
			match(J_STMNT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForBodyContext extends ParserRuleContext {
		public List<SubBlockContext> subBlock() {
			return getRuleContexts(SubBlockContext.class);
		}
		public SubBlockContext subBlock(int i) {
			return getRuleContext(SubBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ForBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterForBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitForBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitForBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBodyContext forBody() throws RecognitionException {
		ForBodyContext _localctx = new ForBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(258);
					subBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(263);
				elseBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsBlockContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode EXTENDS() { return getToken(templateParser.EXTENDS, 0); }
		public TerminalNode STRING() { return getToken(templateParser.STRING, 0); }
		public TerminalNode J_EXPR_STMNT_END() { return getToken(templateParser.J_EXPR_STMNT_END, 0); }
		public ExtendsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterExtendsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitExtendsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitExtendsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsBlockContext extendsBlock() throws RecognitionException {
		ExtendsBlockContext _localctx = new ExtendsBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_extendsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(J_STMNT_START);
			setState(267);
			match(EXTENDS);
			setState(268);
			match(STRING);
			setState(269);
			match(J_EXPR_STMNT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InheritBlockContext extends ParserRuleContext {
		public InheritBlockStartContext inheritBlockStart() {
			return getRuleContext(InheritBlockStartContext.class,0);
		}
		public InheritBlockEndContext inheritBlockEnd() {
			return getRuleContext(InheritBlockEndContext.class,0);
		}
		public InheritBlockBodyContext inheritBlockBody() {
			return getRuleContext(InheritBlockBodyContext.class,0);
		}
		public InheritBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterInheritBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitInheritBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitInheritBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritBlockContext inheritBlock() throws RecognitionException {
		InheritBlockContext _localctx = new InheritBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inheritBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			inheritBlockStart();
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(272);
				inheritBlockBody();
				}
				break;
			}
			setState(275);
			inheritBlockEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InheritBlockBodyContext extends ParserRuleContext {
		public List<SubBlockContext> subBlock() {
			return getRuleContexts(SubBlockContext.class);
		}
		public SubBlockContext subBlock(int i) {
			return getRuleContext(SubBlockContext.class,i);
		}
		public List<InheritBlockContext> inheritBlock() {
			return getRuleContexts(InheritBlockContext.class);
		}
		public InheritBlockContext inheritBlock(int i) {
			return getRuleContext(InheritBlockContext.class,i);
		}
		public InheritBlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritBlockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterInheritBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitInheritBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitInheritBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritBlockBodyContext inheritBlockBody() throws RecognitionException {
		InheritBlockBodyContext _localctx = new InheritBlockBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inheritBlockBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(277);
						subBlock();
						}
						break;
					case 2:
						{
						setState(278);
						inheritBlock();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InheritBlockStartContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode BLOCK() { return getToken(templateParser.BLOCK, 0); }
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public TerminalNode J_EXPR_STMNT_END() { return getToken(templateParser.J_EXPR_STMNT_END, 0); }
		public InheritBlockStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritBlockStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterInheritBlockStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitInheritBlockStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitInheritBlockStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritBlockStartContext inheritBlockStart() throws RecognitionException {
		InheritBlockStartContext _localctx = new InheritBlockStartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inheritBlockStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(J_STMNT_START);
			setState(284);
			match(BLOCK);
			setState(285);
			match(ID);
			setState(286);
			match(J_EXPR_STMNT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InheritBlockEndContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode ENDBLOCK() { return getToken(templateParser.ENDBLOCK, 0); }
		public TerminalNode J_STMNT_END() { return getToken(templateParser.J_STMNT_END, 0); }
		public InheritBlockEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritBlockEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterInheritBlockEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitInheritBlockEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitInheritBlockEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritBlockEndContext inheritBlockEnd() throws RecognitionException {
		InheritBlockEndContext _localctx = new InheritBlockEndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inheritBlockEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(J_STMNT_START);
			setState(289);
			match(ENDBLOCK);
			setState(290);
			match(J_STMNT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionContext extends ParserRuleContext {
		public JinjaExprStartContext jinjaExprStart() {
			return getRuleContext(JinjaExprStartContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JinjaExprEndContext jinjaExprEnd() {
			return getRuleContext(JinjaExprEndContext.class,0);
		}
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			jinjaExprStart();
			setState(293);
			expression();
			setState(294);
			jinjaExprEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprStartContext extends ParserRuleContext {
		public TerminalNode J_EXPR_START() { return getToken(templateParser.J_EXPR_START, 0); }
		public TerminalNode INSIDE_START_TAG_J_EXPR_OPEN() { return getToken(templateParser.INSIDE_START_TAG_J_EXPR_OPEN, 0); }
		public JinjaExprStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterJinjaExprStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitJinjaExprStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitJinjaExprStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprStartContext jinjaExprStart() throws RecognitionException {
		JinjaExprStartContext _localctx = new JinjaExprStartContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jinjaExprStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==J_EXPR_START || _la==INSIDE_START_TAG_J_EXPR_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprEndContext extends ParserRuleContext {
		public TerminalNode J_EXPR_END() { return getToken(templateParser.J_EXPR_END, 0); }
		public JinjaExprEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterJinjaExprEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitJinjaExprEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitJinjaExprEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprEndContext jinjaExprEnd() throws RecognitionException {
		JinjaExprEndContext _localctx = new JinjaExprEndContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jinjaExprEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(J_EXPR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public TernaryExtContext ternaryExt() {
			return getRuleContext(TernaryExtContext.class,0);
		}
		public DefaultExprContext defaultExpr() {
			return getRuleContext(DefaultExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				orExpr();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QMARK) {
					{
					setState(301);
					ternaryExt();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				defaultExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExtContext extends ParserRuleContext {
		public TerminalNode QMARK() { return getToken(templateParser.QMARK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(templateParser.COLON, 0); }
		public TernaryExtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterTernaryExt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitTernaryExt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitTernaryExt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExtContext ternaryExt() throws RecognitionException {
		TernaryExtContext _localctx = new TernaryExtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ternaryExt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(QMARK);
			setState(308);
			expression();
			setState(309);
			match(COLON);
			setState(310);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public TerminalNode ELVIS() { return getToken(templateParser.ELVIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterDefaultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitDefaultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitDefaultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultExprContext defaultExpr() throws RecognitionException {
		DefaultExprContext _localctx = new DefaultExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_defaultExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			orExpr();
			setState(313);
			match(ELVIS);
			setState(314);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(templateParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(templateParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			andExpr();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(317);
				match(OR);
				setState(318);
				andExpr();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public List<NotExprContext> notExpr() {
			return getRuleContexts(NotExprContext.class);
		}
		public NotExprContext notExpr(int i) {
			return getRuleContext(NotExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(templateParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(templateParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			notExpr();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(325);
				match(AND);
				setState(326);
				notExpr();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(templateParser.NOT, 0); }
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_notExpr);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(NOT);
				setState(333);
				notExpr();
				}
				break;
			case PLUS:
			case MINUS:
			case LPAREN:
			case LSB:
			case LBRACE:
			case FLOAT:
			case INT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				compareExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareExprContext extends ParserRuleContext {
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
	 
		public CompareExprContext() { }
		public void copyFrom(CompareExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InExprContext extends CompareExprContext {
		public List<PipeExprContext> pipeExpr() {
			return getRuleContexts(PipeExprContext.class);
		}
		public PipeExprContext pipeExpr(int i) {
			return getRuleContext(PipeExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(templateParser.IN, 0); }
		public InExprContext(CompareExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterInExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitInExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitInExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompExprContext extends CompareExprContext {
		public List<PipeExprContext> pipeExpr() {
			return getRuleContexts(PipeExprContext.class);
		}
		public PipeExprContext pipeExpr(int i) {
			return getRuleContext(PipeExprContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public CompExprContext(CompareExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsExprContext extends CompareExprContext {
		public ConcatExprContext concatExpr() {
			return getRuleContext(ConcatExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(templateParser.IS, 0); }
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public TerminalNode NOT() { return getToken(templateParser.NOT, 0); }
		public IsExprContext(CompareExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_compareExpr);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new IsExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				concatExpr();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(338);
					match(IS);
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(339);
						match(NOT);
						}
					}

					setState(342);
					match(ID);
					}
				}

				}
				break;
			case 2:
				_localctx = new CompExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				pipeExpr();
				setState(346);
				comparisonOperator();
				setState(347);
				pipeExpr();
				}
				break;
			case 3:
				_localctx = new InExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				pipeExpr();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(350);
					match(IN);
					setState(351);
					pipeExpr();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	 
		public ComparisonOperatorContext() { }
		public void copyFrom(ComparisonOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualOperatorContext extends ComparisonOperatorContext {
		public TerminalNode EQ() { return getToken(templateParser.EQ, 0); }
		public EqualOperatorContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterEqualOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitEqualOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualOperatorContext extends ComparisonOperatorContext {
		public TerminalNode NEQ() { return getToken(templateParser.NEQ, 0); }
		public NotEqualOperatorContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterNotEqualOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitNotEqualOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitNotEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterOrEqualOperatorContext extends ComparisonOperatorContext {
		public TerminalNode GE() { return getToken(templateParser.GE, 0); }
		public GreaterOrEqualOperatorContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterGreaterOrEqualOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitGreaterOrEqualOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitGreaterOrEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOperatorContext extends ComparisonOperatorContext {
		public TerminalNode LT() { return getToken(templateParser.LT, 0); }
		public LessThanOperatorContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterLessThanOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitLessThanOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitLessThanOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOperatorContext extends ComparisonOperatorContext {
		public TerminalNode GT() { return getToken(templateParser.GT, 0); }
		public GreaterThanOperatorContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterGreaterThanOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitGreaterThanOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitGreaterThanOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessOrEqualOperatorContext extends ComparisonOperatorContext {
		public TerminalNode LE() { return getToken(templateParser.LE, 0); }
		public LessOrEqualOperatorContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterLessOrEqualOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitLessOrEqualOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitLessOrEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparisonOperator);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new EqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(EQ);
				}
				break;
			case NEQ:
				_localctx = new NotEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(NEQ);
				}
				break;
			case LT:
				_localctx = new LessThanOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(LT);
				}
				break;
			case GT:
				_localctx = new GreaterThanOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				match(GT);
				}
				break;
			case LE:
				_localctx = new LessOrEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				match(LE);
				}
				break;
			case GE:
				_localctx = new GreaterOrEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(361);
				match(GE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PipeExprContext extends ParserRuleContext {
		public ConcatExprContext concatExpr() {
			return getRuleContext(ConcatExprContext.class,0);
		}
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public PipeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterPipeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitPipeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitPipeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeExprContext pipeExpr() throws RecognitionException {
		PipeExprContext _localctx = new PipeExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pipeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			concatExpr();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPELINE) {
				{
				{
				setState(365);
				filter();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterContext extends ParserRuleContext {
		public TerminalNode PIPELINE() { return getToken(templateParser.PIPELINE, 0); }
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(templateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(templateParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(PIPELINE);
			setState(372);
			match(ID);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(373);
				match(LPAREN);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276126954325803008L) != 0)) {
					{
					setState(374);
					argumentList();
					}
				}

				setState(377);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(templateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(templateParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			argument();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(381);
				match(COMMA);
				setState(382);
				argument();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(templateParser.ASSIGN, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_argument);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(ID);
				setState(390);
				match(ASSIGN);
				setState(391);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConcatExprContext extends ParserRuleContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public List<TerminalNode> TILDE() { return getTokens(templateParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(templateParser.TILDE, i);
		}
		public ConcatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterConcatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitConcatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitConcatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatExprContext concatExpr() throws RecognitionException {
		ConcatExprContext _localctx = new ConcatExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_concatExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			addExpr();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TILDE) {
				{
				{
				setState(395);
				match(TILDE);
				setState(396);
				addExpr();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ParserRuleContext {
		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}
		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class,i);
		}
		public List<AddExprOptorContext> addExprOptor() {
			return getRuleContexts(AddExprOptorContext.class);
		}
		public AddExprOptorContext addExprOptor(int i) {
			return getRuleContext(AddExprOptorContext.class,i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			mulExpr();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(403);
				addExprOptor();
				setState(404);
				mulExpr();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddExprOptorContext extends ParserRuleContext {
		public AddExprOptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExprOptor; }
	 
		public AddExprOptorContext() { }
		public void copyFrom(AddExprOptorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusOperatorContext extends AddExprOptorContext {
		public TerminalNode PLUS() { return getToken(templateParser.PLUS, 0); }
		public PlusOperatorContext(AddExprOptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterPlusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitPlusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitPlusOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusOperatorContext extends AddExprOptorContext {
		public TerminalNode MINUS() { return getToken(templateParser.MINUS, 0); }
		public MinusOperatorContext(AddExprOptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterMinusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitMinusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitMinusOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprOptorContext addExprOptor() throws RecognitionException {
		AddExprOptorContext _localctx = new AddExprOptorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_addExprOptor);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new MinusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(MINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<MulExprOptorContext> mulExprOptor() {
			return getRuleContexts(MulExprOptorContext.class);
		}
		public MulExprOptorContext mulExprOptor(int i) {
			return getRuleContext(MulExprOptorContext.class,i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			unaryExpr();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 239075328L) != 0)) {
				{
				{
				setState(416);
				mulExprOptor();
				setState(417);
				unaryExpr();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulExprOptorContext extends ParserRuleContext {
		public MulExprOptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExprOptor; }
	 
		public MulExprOptorContext() { }
		public void copyFrom(MulExprOptorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivOperatorContext extends MulExprOptorContext {
		public TerminalNode DIV() { return getToken(templateParser.DIV, 0); }
		public DivOperatorContext(MulExprOptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterDivOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitDivOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitDivOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloorDivOperatorContext extends MulExprOptorContext {
		public TerminalNode FLOORDIV() { return getToken(templateParser.FLOORDIV, 0); }
		public FloorDivOperatorContext(MulExprOptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterFloorDivOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitFloorDivOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitFloorDivOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulOperatorContext extends MulExprOptorContext {
		public TerminalNode MUL() { return getToken(templateParser.MUL, 0); }
		public MulOperatorContext(MulExprOptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterMulOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitMulOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitMulOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModOperatorContext extends MulExprOptorContext {
		public TerminalNode MOD() { return getToken(templateParser.MOD, 0); }
		public ModOperatorContext(MulExprOptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterModOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitModOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitModOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExprOptorContext mulExprOptor() throws RecognitionException {
		MulExprOptorContext _localctx = new MulExprOptorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mulExprOptor);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new MulOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(MUL);
				}
				break;
			case DIV:
				_localctx = new DivOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(DIV);
				}
				break;
			case FLOORDIV:
				_localctx = new FloorDivOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(FLOORDIV);
				}
				break;
			case MOD:
				_localctx = new ModOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				match(MOD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(templateParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(templateParser.MINUS, 0); }
		public PowExprContext powExpr() {
			return getRuleContext(PowExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unaryExpr);
		int _la;
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(431);
				unaryExpr();
				}
				break;
			case LPAREN:
			case LSB:
			case LBRACE:
			case FLOAT:
			case INT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				powExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode POW() { return getToken(templateParser.POW, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public PowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExprContext powExpr() throws RecognitionException {
		PowExprContext _localctx = new PowExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_powExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			primary();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(436);
				match(POW);
				setState(437);
				unaryExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(templateParser.STRING, 0); }
		public StringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthedExprContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(templateParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(templateParser.RPAREN, 0); }
		public ParenthedExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterParenthedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitParenthedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitParenthedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictContext extends AtomContext {
		public TerminalNode LBRACE() { return getToken(templateParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(templateParser.RBRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(templateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(templateParser.COMMA, i);
		}
		public DictContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends AtomContext {
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public IdContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(templateParser.FLOAT, 0); }
		public FloatContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends AtomContext {
		public TerminalNode LSB() { return getToken(templateParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(templateParser.RSB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(templateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(templateParser.COMMA, i);
		}
		public ListContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends AtomContext {
		public TerminalNode INT() { return getToken(templateParser.INT, 0); }
		public IntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_atom);
		int _la;
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(ID);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(443);
				match(STRING);
				}
				break;
			case LPAREN:
				_localctx = new ParenthedExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				match(LPAREN);
				setState(445);
				expression();
				setState(446);
				match(RPAREN);
				}
				break;
			case LSB:
				_localctx = new ListContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				match(LSB);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276126954325803008L) != 0)) {
					{
					setState(449);
					expression();
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(450);
						match(COMMA);
						setState(451);
						expression();
						}
						}
						setState(456);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(459);
				match(RSB);
				}
				break;
			case LBRACE:
				_localctx = new DictContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(460);
				match(LBRACE);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276126954325803008L) != 0)) {
					{
					setState(461);
					pair();
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(462);
						match(COMMA);
						setState(463);
						pair();
						}
						}
						setState(468);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(471);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(templateParser.COLON, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			expression();
			setState(475);
			match(COLON);
			setState(476);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			atom();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1477743627730944L) != 0)) {
				{
				{
				setState(479);
				trailer();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrailerContext extends ParserRuleContext {
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
	 
		public TrailerContext() { }
		public void copyFrom(TrailerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubTrailerContext extends TrailerContext {
		public TerminalNode LSB() { return getToken(templateParser.LSB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSB() { return getToken(templateParser.RSB, 0); }
		public SubTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterSubTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitSubTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitSubTrailer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberTrailerContext extends TrailerContext {
		public TerminalNode DOT() { return getToken(templateParser.DOT, 0); }
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public MemberTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterMemberTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitMemberTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitMemberTrailer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallTrailerContext extends TrailerContext {
		public TerminalNode LPAREN() { return getToken(templateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(templateParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCallTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCallTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCallTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_trailer);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new MemberTrailerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(DOT);
				setState(486);
				match(ID);
				}
				break;
			case LSB:
				_localctx = new SubTrailerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(LSB);
				setState(488);
				expression();
				setState(489);
				match(RSB);
				}
				break;
			case LPAREN:
				_localctx = new CallTrailerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				match(LPAREN);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276126954325803008L) != 0)) {
					{
					setState(492);
					argumentList();
					}
				}

				setState(495);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlRegularElementContext htmlRegularElement() {
			return getRuleContext(HtmlRegularElementContext.class,0);
		}
		public HtmlSelfClosingElementContext htmlSelfClosingElement() {
			return getRuleContext(HtmlSelfClosingElementContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_htmlElement);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				htmlRegularElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				htmlSelfClosingElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlRegularElementContext extends ParserRuleContext {
		public HtmlStartTagContext htmlStartTag() {
			return getRuleContext(HtmlStartTagContext.class,0);
		}
		public HtmlEndTagContext htmlEndTag() {
			return getRuleContext(HtmlEndTagContext.class,0);
		}
		public HtmlElementBodyContext htmlElementBody() {
			return getRuleContext(HtmlElementBodyContext.class,0);
		}
		public HtmlRegularElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlRegularElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlRegularElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlRegularElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlRegularElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlRegularElementContext htmlRegularElement() throws RecognitionException {
		HtmlRegularElementContext _localctx = new HtmlRegularElementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_htmlRegularElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			htmlStartTag();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 646L) != 0) || _la==INSIDE_START_TAG_J_EXPR_OPEN) {
				{
				setState(503);
				htmlElementBody();
				}
			}

			setState(506);
			htmlEndTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStartTagContext extends ParserRuleContext {
		public TerminalNode START_TAG_OPEN() { return getToken(templateParser.START_TAG_OPEN, 0); }
		public TerminalNode START_TAG_NAME() { return getToken(templateParser.START_TAG_NAME, 0); }
		public TerminalNode START_TAG_CLOSE() { return getToken(templateParser.START_TAG_CLOSE, 0); }
		public List<HtmlTagAttrContext> htmlTagAttr() {
			return getRuleContexts(HtmlTagAttrContext.class);
		}
		public HtmlTagAttrContext htmlTagAttr(int i) {
			return getRuleContext(HtmlTagAttrContext.class,i);
		}
		public HtmlStartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlStartTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlStartTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlStartTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlStartTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlStartTagContext htmlStartTag() throws RecognitionException {
		HtmlStartTagContext _localctx = new HtmlStartTagContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_htmlStartTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(START_TAG_OPEN);
			setState(509);
			match(START_TAG_NAME);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 11L) != 0)) {
				{
				{
				setState(510);
				htmlTagAttr();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(START_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementBodyContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlStyleElemContext> htmlStyleElem() {
			return getRuleContexts(HtmlStyleElemContext.class);
		}
		public HtmlStyleElemContext htmlStyleElem(int i) {
			return getRuleContext(HtmlStyleElemContext.class,i);
		}
		public List<JinjaElementContext> jinjaElement() {
			return getRuleContexts(JinjaElementContext.class);
		}
		public JinjaElementContext jinjaElement(int i) {
			return getRuleContext(JinjaElementContext.class,i);
		}
		public List<TemplateTextContext> templateText() {
			return getRuleContexts(TemplateTextContext.class);
		}
		public TemplateTextContext templateText(int i) {
			return getRuleContext(TemplateTextContext.class,i);
		}
		public HtmlElementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlElementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlElementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlElementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementBodyContext htmlElementBody() throws RecognitionException {
		HtmlElementBodyContext _localctx = new HtmlElementBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_htmlElementBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(518);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(519);
					htmlStyleElem();
					}
					break;
				case 3:
					{
					setState(520);
					jinjaElement();
					}
					break;
				case 4:
					{
					setState(521);
					templateText();
					}
					break;
				}
				}
				setState(524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 646L) != 0) || _la==INSIDE_START_TAG_J_EXPR_OPEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlEndTagContext extends ParserRuleContext {
		public TerminalNode CLOSE_TAG_START() { return getToken(templateParser.CLOSE_TAG_START, 0); }
		public TerminalNode END_TAG_NAME() { return getToken(templateParser.END_TAG_NAME, 0); }
		public TerminalNode END_TAG_CLOSE() { return getToken(templateParser.END_TAG_CLOSE, 0); }
		public HtmlEndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlEndTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlEndTagContext htmlEndTag() throws RecognitionException {
		HtmlEndTagContext _localctx = new HtmlEndTagContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_htmlEndTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(CLOSE_TAG_START);
			setState(527);
			match(END_TAG_NAME);
			setState(528);
			match(END_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingElementContext extends ParserRuleContext {
		public HtmlSelfClosingTagContext htmlSelfClosingTag() {
			return getRuleContext(HtmlSelfClosingTagContext.class,0);
		}
		public HtmlSelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlSelfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlSelfClosingElementContext htmlSelfClosingElement() throws RecognitionException {
		HtmlSelfClosingElementContext _localctx = new HtmlSelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_htmlSelfClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			htmlSelfClosingTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingTagContext extends ParserRuleContext {
		public TerminalNode START_TAG_OPEN() { return getToken(templateParser.START_TAG_OPEN, 0); }
		public TerminalNode START_TAG_NAME() { return getToken(templateParser.START_TAG_NAME, 0); }
		public TerminalNode SELF_CLOSING_TAG_CLOSE() { return getToken(templateParser.SELF_CLOSING_TAG_CLOSE, 0); }
		public List<HtmlTagAttrContext> htmlTagAttr() {
			return getRuleContexts(HtmlTagAttrContext.class);
		}
		public HtmlTagAttrContext htmlTagAttr(int i) {
			return getRuleContext(HtmlTagAttrContext.class,i);
		}
		public HtmlSelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlSelfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlSelfClosingTagContext htmlSelfClosingTag() throws RecognitionException {
		HtmlSelfClosingTagContext _localctx = new HtmlSelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_htmlSelfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(START_TAG_OPEN);
			setState(533);
			match(START_TAG_NAME);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 11L) != 0)) {
				{
				{
				setState(534);
				htmlTagAttr();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			match(SELF_CLOSING_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagAttrContext extends ParserRuleContext {
		public StyleAttrContext styleAttr() {
			return getRuleContext(StyleAttrContext.class,0);
		}
		public BooleanAttrContext booleanAttr() {
			return getRuleContext(BooleanAttrContext.class,0);
		}
		public AttrWithQuotedValContext attrWithQuotedVal() {
			return getRuleContext(AttrWithQuotedValContext.class,0);
		}
		public AttrWithUnquotedValContext attrWithUnquotedVal() {
			return getRuleContext(AttrWithUnquotedValContext.class,0);
		}
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public HtmlTagAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlTagAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlTagAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlTagAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagAttrContext htmlTagAttr() throws RecognitionException {
		HtmlTagAttrContext _localctx = new HtmlTagAttrContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_htmlTagAttr);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				styleAttr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				booleanAttr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				attrWithQuotedVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				attrWithUnquotedVal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				jinjaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAttrContext extends ParserRuleContext {
		public TerminalNode ATTR_NAME() { return getToken(templateParser.ATTR_NAME, 0); }
		public BooleanAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterBooleanAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitBooleanAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitBooleanAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanAttrContext booleanAttr() throws RecognitionException {
		BooleanAttrContext _localctx = new BooleanAttrContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_booleanAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(ATTR_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrWithUnquotedValContext extends ParserRuleContext {
		public TerminalNode ATTR_NAME() { return getToken(templateParser.ATTR_NAME, 0); }
		public TerminalNode ATTR_EQ() { return getToken(templateParser.ATTR_EQ, 0); }
		public TerminalNode ATTR_VALUE_UNQUOTED() { return getToken(templateParser.ATTR_VALUE_UNQUOTED, 0); }
		public AttrWithUnquotedValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrWithUnquotedVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterAttrWithUnquotedVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitAttrWithUnquotedVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitAttrWithUnquotedVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrWithUnquotedValContext attrWithUnquotedVal() throws RecognitionException {
		AttrWithUnquotedValContext _localctx = new AttrWithUnquotedValContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_attrWithUnquotedVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(ATTR_NAME);
			setState(552);
			match(ATTR_EQ);
			setState(553);
			match(ATTR_VALUE_UNQUOTED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrWithQuotedValContext extends ParserRuleContext {
		public TerminalNode ATTR_NAME() { return getToken(templateParser.ATTR_NAME, 0); }
		public TerminalNode ATTR_EQ() { return getToken(templateParser.ATTR_EQ, 0); }
		public TerminalNode ATTR_DQUOTE_START() { return getToken(templateParser.ATTR_DQUOTE_START, 0); }
		public TerminalNode ATTR_DQUOTE_END() { return getToken(templateParser.ATTR_DQUOTE_END, 0); }
		public List<QuotedValElemContext> quotedValElem() {
			return getRuleContexts(QuotedValElemContext.class);
		}
		public QuotedValElemContext quotedValElem(int i) {
			return getRuleContext(QuotedValElemContext.class,i);
		}
		public AttrWithQuotedValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrWithQuotedVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterAttrWithQuotedVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitAttrWithQuotedVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitAttrWithQuotedVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrWithQuotedValContext attrWithQuotedVal() throws RecognitionException {
		AttrWithQuotedValContext _localctx = new AttrWithQuotedValContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_attrWithQuotedVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(ATTR_NAME);
			setState(556);
			match(ATTR_EQ);
			setState(557);
			match(ATTR_DQUOTE_START);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTR_VAL_J_EXPR_START || _la==ATTR_VAL_TEXT) {
				{
				{
				setState(558);
				quotedValElem();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
			match(ATTR_DQUOTE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedValElemContext extends ParserRuleContext {
		public TerminalNode ATTR_VAL_TEXT() { return getToken(templateParser.ATTR_VAL_TEXT, 0); }
		public JinjaAttrValContext jinjaAttrVal() {
			return getRuleContext(JinjaAttrValContext.class,0);
		}
		public QuotedValElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedValElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterQuotedValElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitQuotedValElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitQuotedValElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedValElemContext quotedValElem() throws RecognitionException {
		QuotedValElemContext _localctx = new QuotedValElemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_quotedValElem);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR_VAL_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(ATTR_VAL_TEXT);
				}
				break;
			case ATTR_VAL_J_EXPR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				jinjaAttrVal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaAttrValContext extends ParserRuleContext {
		public TerminalNode ATTR_VAL_J_EXPR_START() { return getToken(templateParser.ATTR_VAL_J_EXPR_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode J_EXPR_END() { return getToken(templateParser.J_EXPR_END, 0); }
		public JinjaAttrValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaAttrVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterJinjaAttrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitJinjaAttrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitJinjaAttrVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaAttrValContext jinjaAttrVal() throws RecognitionException {
		JinjaAttrValContext _localctx = new JinjaAttrValContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jinjaAttrVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(ATTR_VAL_J_EXPR_START);
			setState(571);
			expression();
			setState(572);
			match(J_EXPR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttrContext extends ParserRuleContext {
		public TerminalNode STYLE_ATTR() { return getToken(templateParser.STYLE_ATTR, 0); }
		public TerminalNode CSS_INLINE_EQ() { return getToken(templateParser.CSS_INLINE_EQ, 0); }
		public TerminalNode CSS_INLINE_DQUOT_START() { return getToken(templateParser.CSS_INLINE_DQUOT_START, 0); }
		public TerminalNode CSS_INLINE_PROP_DQUOT_END() { return getToken(templateParser.CSS_INLINE_PROP_DQUOT_END, 0); }
		public List<InlineStylePropContext> inlineStyleProp() {
			return getRuleContexts(InlineStylePropContext.class);
		}
		public InlineStylePropContext inlineStyleProp(int i) {
			return getRuleContext(InlineStylePropContext.class,i);
		}
		public StyleAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterStyleAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitStyleAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitStyleAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttrContext styleAttr() throws RecognitionException {
		StyleAttrContext _localctx = new StyleAttrContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_styleAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(STYLE_ATTR);
			setState(575);
			match(CSS_INLINE_EQ);
			setState(576);
			match(CSS_INLINE_DQUOT_START);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_INLINE_PROP_NAME) {
				{
				{
				setState(577);
				inlineStyleProp();
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			match(CSS_INLINE_PROP_DQUOT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineStylePropContext extends ParserRuleContext {
		public TerminalNode CSS_INLINE_PROP_NAME() { return getToken(templateParser.CSS_INLINE_PROP_NAME, 0); }
		public TerminalNode CSS_INLINE_PROP_COLON() { return getToken(templateParser.CSS_INLINE_PROP_COLON, 0); }
		public TerminalNode CSS_PROP_SEMICOLON() { return getToken(templateParser.CSS_PROP_SEMICOLON, 0); }
		public List<TerminalNode> CSS_PROP_VAL() { return getTokens(templateParser.CSS_PROP_VAL); }
		public TerminalNode CSS_PROP_VAL(int i) {
			return getToken(templateParser.CSS_PROP_VAL, i);
		}
		public InlineStylePropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineStyleProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterInlineStyleProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitInlineStyleProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitInlineStyleProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineStylePropContext inlineStyleProp() throws RecognitionException {
		InlineStylePropContext _localctx = new InlineStylePropContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_inlineStyleProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(CSS_INLINE_PROP_NAME);
			setState(586);
			match(CSS_INLINE_PROP_COLON);
			setState(588); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(587);
				match(CSS_PROP_VAL);
				}
				}
				setState(590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(592);
			match(CSS_PROP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStyleElemContext extends ParserRuleContext {
		public HtmlStyleElemOpenTagContext htmlStyleElemOpenTag() {
			return getRuleContext(HtmlStyleElemOpenTagContext.class,0);
		}
		public HtmlStyleElemCloseTagContext htmlStyleElemCloseTag() {
			return getRuleContext(HtmlStyleElemCloseTagContext.class,0);
		}
		public List<CssBlockContext> cssBlock() {
			return getRuleContexts(CssBlockContext.class);
		}
		public CssBlockContext cssBlock(int i) {
			return getRuleContext(CssBlockContext.class,i);
		}
		public HtmlStyleElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlStyleElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlStyleElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlStyleElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlStyleElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlStyleElemContext htmlStyleElem() throws RecognitionException {
		HtmlStyleElemContext _localctx = new HtmlStyleElemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_htmlStyleElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			htmlStyleElemOpenTag();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				{
				setState(595);
				cssBlock();
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
			htmlStyleElemCloseTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStyleElemOpenTagContext extends ParserRuleContext {
		public TerminalNode START_TAG_OPEN() { return getToken(templateParser.START_TAG_OPEN, 0); }
		public TerminalNode STYLE_TAG_START_NAME() { return getToken(templateParser.STYLE_TAG_START_NAME, 0); }
		public TerminalNode STYLE_TAG_START_CLOSE() { return getToken(templateParser.STYLE_TAG_START_CLOSE, 0); }
		public HtmlStyleElemOpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlStyleElemOpenTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlStyleElemOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlStyleElemOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlStyleElemOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlStyleElemOpenTagContext htmlStyleElemOpenTag() throws RecognitionException {
		HtmlStyleElemOpenTagContext _localctx = new HtmlStyleElemOpenTagContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_htmlStyleElemOpenTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(START_TAG_OPEN);
			setState(604);
			match(STYLE_TAG_START_NAME);
			setState(605);
			match(STYLE_TAG_START_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStyleElemCloseTagContext extends ParserRuleContext {
		public TerminalNode CLOSE_STYLE_START() { return getToken(templateParser.CLOSE_STYLE_START, 0); }
		public TerminalNode STYLE_END_TAG_NAME() { return getToken(templateParser.STYLE_END_TAG_NAME, 0); }
		public TerminalNode STYLE_END_TAG_CLOSE() { return getToken(templateParser.STYLE_END_TAG_CLOSE, 0); }
		public HtmlStyleElemCloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlStyleElemCloseTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlStyleElemCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlStyleElemCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlStyleElemCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlStyleElemCloseTagContext htmlStyleElemCloseTag() throws RecognitionException {
		HtmlStyleElemCloseTagContext _localctx = new HtmlStyleElemCloseTagContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_htmlStyleElemCloseTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(CLOSE_STYLE_START);
			setState(608);
			match(STYLE_END_TAG_NAME);
			setState(609);
			match(STYLE_END_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockContext extends ParserRuleContext {
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(templateParser.CSS_LBRACE, 0); }
		public TerminalNode BLK_RBRACE() { return getToken(templateParser.BLK_RBRACE, 0); }
		public List<CssPropContext> cssProp() {
			return getRuleContexts(CssPropContext.class);
		}
		public CssPropContext cssProp(int i) {
			return getRuleContext(CssPropContext.class,i);
		}
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCssBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCssBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCssBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			selectorList();
			setState(612);
			match(CSS_LBRACE);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLK_PROP_NAME) {
				{
				{
				setState(613);
				cssProp();
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619);
			match(BLK_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorListContext extends ParserRuleContext {
		public SelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorList; }
	 
		public SelectorListContext() { }
		public void copyFrom(SelectorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupSelectorContext extends SelectorListContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> CSS_SEL_COMMA() { return getTokens(templateParser.CSS_SEL_COMMA); }
		public TerminalNode CSS_SEL_COMMA(int i) {
			return getToken(templateParser.CSS_SEL_COMMA, i);
		}
		public GroupSelectorContext(SelectorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterGroupSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitGroupSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitGroupSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleSelectorContext extends SelectorListContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public SingleSelectorContext(SelectorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterSingleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitSingleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitSingleSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescendentSelectorContext extends SelectorListContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public DescendentSelectorContext(SelectorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterDescendentSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitDescendentSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitDescendentSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorListContext selectorList() throws RecognitionException {
		SelectorListContext _localctx = new SelectorListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_selectorList);
		int _la;
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new SingleSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				selector();
				}
				break;
			case 2:
				_localctx = new DescendentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(623); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(622);
					selector();
					}
					}
					setState(625); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0) );
				}
				break;
			case 3:
				_localctx = new GroupSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				selector();
				setState(630); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(628);
					match(CSS_SEL_COMMA);
					setState(629);
					selector();
					}
					}
					setState(632); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CSS_SEL_COMMA );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public SimpleSelectorContext simpleSelector() {
			return getRuleContext(SimpleSelectorContext.class,0);
		}
		public PseudoClassSelectorContext pseudoClassSelector() {
			return getRuleContext(PseudoClassSelectorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_selector);
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				simpleSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				pseudoClassSelector();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	 
		public SimpleSelectorContext() { }
		public void copyFrom(SimpleSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_SEL_ID() { return getToken(templateParser.CSS_SEL_ID, 0); }
		public IdSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_SEL_CLASS() { return getToken(templateParser.CSS_SEL_CLASS, 0); }
		public ClassSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementSelectorContext extends SimpleSelectorContext {
		public TerminalNode CSS_SEL_ELEM() { return getToken(templateParser.CSS_SEL_ELEM, 0); }
		public ElementSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_simpleSelector);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_SEL_ID:
				_localctx = new IdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(CSS_SEL_ID);
				}
				break;
			case CSS_SEL_CLASS:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(CSS_SEL_CLASS);
				}
				break;
			case CSS_SEL_ELEM:
				_localctx = new ElementSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				match(CSS_SEL_ELEM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassSelectorContext extends ParserRuleContext {
		public SimpleSelectorContext simpleSelector() {
			return getRuleContext(SimpleSelectorContext.class,0);
		}
		public TerminalNode CSS_SEL_STATE() { return getToken(templateParser.CSS_SEL_STATE, 0); }
		public PseudoClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClassSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterPseudoClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitPseudoClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitPseudoClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoClassSelectorContext pseudoClassSelector() throws RecognitionException {
		PseudoClassSelectorContext _localctx = new PseudoClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_pseudoClassSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			simpleSelector();
			setState(646);
			match(CSS_SEL_STATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropContext extends ParserRuleContext {
		public TerminalNode BLK_PROP_NAME() { return getToken(templateParser.BLK_PROP_NAME, 0); }
		public TerminalNode BLK_COLON() { return getToken(templateParser.BLK_COLON, 0); }
		public TerminalNode CSS_PROP_SEMICOLON() { return getToken(templateParser.CSS_PROP_SEMICOLON, 0); }
		public List<TerminalNode> CSS_PROP_VAL() { return getTokens(templateParser.CSS_PROP_VAL); }
		public TerminalNode CSS_PROP_VAL(int i) {
			return getToken(templateParser.CSS_PROP_VAL, i);
		}
		public CssPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCssProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCssProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCssProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropContext cssProp() throws RecognitionException {
		CssPropContext _localctx = new CssPropContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cssProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(BLK_PROP_NAME);
			setState(649);
			match(BLK_COLON);
			setState(651); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(650);
				match(CSS_PROP_VAL);
				}
				}
				setState(653); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(655);
			match(CSS_PROP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001l\u0292\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0001\u0000\u0003\u0000\u0090\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0094\b\u0000\n\u0000\f\u0000\u0097\t\u0000\u0003\u0000\u0099"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00a2\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00af\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0004\u0006\u00b9\b\u0006\u000b\u0006\f\u0006\u00ba\u0001\u0006"+
		"\u0003\u0006\u00be\b\u0006\u0001\u0006\u0003\u0006\u00c1\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00ca\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00d5\b\t\n\t\f\t\u00d8\t\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00de\b\n\n\n\f\n\u00e1\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00e9\b\u000b\u0001\f\u0001\f\u0003\f\u00ed\b\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f6\b\r\n\r\f\r\u00f9"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0004\u000f\u0104\b\u000f\u000b\u000f\f\u000f"+
		"\u0105\u0001\u000f\u0003\u000f\u0109\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0112"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0004\u0012\u0118"+
		"\b\u0012\u000b\u0012\f\u0012\u0119\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u012f\b\u0018"+
		"\u0001\u0018\u0003\u0018\u0132\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0140\b\u001b\n\u001b"+
		"\f\u001b\u0143\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u0148\b\u001c\n\u001c\f\u001c\u014b\t\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0150\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0155\b\u001e\u0001\u001e\u0003\u001e\u0158\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0161\b\u001e\u0003\u001e\u0163\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u016b"+
		"\b\u001f\u0001 \u0001 \u0005 \u016f\b \n \f \u0172\t \u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0178\b!\u0001!\u0003!\u017b\b!\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u0180\b\"\n\"\f\"\u0183\t\"\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0189\b#\u0001$\u0001$\u0001$\u0005$\u018e\b$\n$\f$\u0191\t$\u0001%"+
		"\u0001%\u0001%\u0001%\u0005%\u0197\b%\n%\f%\u019a\t%\u0001&\u0001&\u0003"+
		"&\u019e\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01a4\b\'\n\'\f\'\u01a7"+
		"\t\'\u0001(\u0001(\u0001(\u0001(\u0003(\u01ad\b(\u0001)\u0001)\u0001)"+
		"\u0003)\u01b2\b)\u0001*\u0001*\u0001*\u0003*\u01b7\b*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u01c5\b+\n+\f+\u01c8\t+\u0003+\u01ca\b+\u0001+\u0001+\u0001+\u0001+"+
		"\u0001+\u0005+\u01d1\b+\n+\f+\u01d4\t+\u0003+\u01d6\b+\u0001+\u0003+\u01d9"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0005-\u01e1\b-\n-\f-\u01e4"+
		"\t-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01ee"+
		"\b.\u0001.\u0003.\u01f1\b.\u0001/\u0001/\u0003/\u01f5\b/\u00010\u0001"+
		"0\u00030\u01f9\b0\u00010\u00010\u00011\u00011\u00011\u00051\u0200\b1\n"+
		"1\f1\u0203\t1\u00011\u00011\u00012\u00012\u00012\u00012\u00042\u020b\b"+
		"2\u000b2\f2\u020c\u00013\u00013\u00013\u00013\u00014\u00014\u00015\u0001"+
		"5\u00015\u00055\u0218\b5\n5\f5\u021b\t5\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u0224\b6\u00017\u00017\u00018\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u00059\u0230\b9\n9\f9\u0233\t9\u00019\u0001"+
		"9\u0001:\u0001:\u0003:\u0239\b:\u0001;\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0005<\u0243\b<\n<\f<\u0246\t<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0004=\u024d\b=\u000b=\f=\u024e\u0001=\u0001=\u0001>\u0001>\u0005"+
		">\u0255\b>\n>\f>\u0258\t>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001"+
		"@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0005A\u0267\bA\nA\fA\u026a"+
		"\tA\u0001A\u0001A\u0001B\u0001B\u0004B\u0270\bB\u000bB\fB\u0271\u0001"+
		"B\u0001B\u0001B\u0004B\u0277\bB\u000bB\fB\u0278\u0003B\u027b\bB\u0001"+
		"C\u0001C\u0003C\u027f\bC\u0001D\u0001D\u0001D\u0003D\u0284\bD\u0001E\u0001"+
		"E\u0001E\u0001F\u0001F\u0001F\u0004F\u028c\bF\u000bF\fF\u028d\u0001F\u0001"+
		"F\u0001F\u0000\u0000G\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u0000\u0002"+
		"\u0002\u0000\u0001\u0001KK\u0001\u0000\u0017\u0018\u02ae\u0000\u008f\u0001"+
		"\u0000\u0000\u0000\u0002\u00a1\u0001\u0000\u0000\u0000\u0004\u00a3\u0001"+
		"\u0000\u0000\u0000\u0006\u00a5\u0001\u0000\u0000\u0000\b\u00ac\u0001\u0000"+
		"\u0000\u0000\n\u00b2\u0001\u0000\u0000\u0000\f\u00c0\u0001\u0000\u0000"+
		"\u0000\u000e\u00c9\u0001\u0000\u0000\u0000\u0010\u00cb\u0001\u0000\u0000"+
		"\u0000\u0012\u00cf\u0001\u0000\u0000\u0000\u0014\u00d9\u0001\u0000\u0000"+
		"\u0000\u0016\u00e8\u0001\u0000\u0000\u0000\u0018\u00ea\u0001\u0000\u0000"+
		"\u0000\u001a\u00f0\u0001\u0000\u0000\u0000\u001c\u00fe\u0001\u0000\u0000"+
		"\u0000\u001e\u0103\u0001\u0000\u0000\u0000 \u010a\u0001\u0000\u0000\u0000"+
		"\"\u010f\u0001\u0000\u0000\u0000$\u0117\u0001\u0000\u0000\u0000&\u011b"+
		"\u0001\u0000\u0000\u0000(\u0120\u0001\u0000\u0000\u0000*\u0124\u0001\u0000"+
		"\u0000\u0000,\u0128\u0001\u0000\u0000\u0000.\u012a\u0001\u0000\u0000\u0000"+
		"0\u0131\u0001\u0000\u0000\u00002\u0133\u0001\u0000\u0000\u00004\u0138"+
		"\u0001\u0000\u0000\u00006\u013c\u0001\u0000\u0000\u00008\u0144\u0001\u0000"+
		"\u0000\u0000:\u014f\u0001\u0000\u0000\u0000<\u0162\u0001\u0000\u0000\u0000"+
		">\u016a\u0001\u0000\u0000\u0000@\u016c\u0001\u0000\u0000\u0000B\u0173"+
		"\u0001\u0000\u0000\u0000D\u017c\u0001\u0000\u0000\u0000F\u0188\u0001\u0000"+
		"\u0000\u0000H\u018a\u0001\u0000\u0000\u0000J\u0192\u0001\u0000\u0000\u0000"+
		"L\u019d\u0001\u0000\u0000\u0000N\u019f\u0001\u0000\u0000\u0000P\u01ac"+
		"\u0001\u0000\u0000\u0000R\u01b1\u0001\u0000\u0000\u0000T\u01b3\u0001\u0000"+
		"\u0000\u0000V\u01d8\u0001\u0000\u0000\u0000X\u01da\u0001\u0000\u0000\u0000"+
		"Z\u01de\u0001\u0000\u0000\u0000\\\u01f0\u0001\u0000\u0000\u0000^\u01f4"+
		"\u0001\u0000\u0000\u0000`\u01f6\u0001\u0000\u0000\u0000b\u01fc\u0001\u0000"+
		"\u0000\u0000d\u020a\u0001\u0000\u0000\u0000f\u020e\u0001\u0000\u0000\u0000"+
		"h\u0212\u0001\u0000\u0000\u0000j\u0214\u0001\u0000\u0000\u0000l\u0223"+
		"\u0001\u0000\u0000\u0000n\u0225\u0001\u0000\u0000\u0000p\u0227\u0001\u0000"+
		"\u0000\u0000r\u022b\u0001\u0000\u0000\u0000t\u0238\u0001\u0000\u0000\u0000"+
		"v\u023a\u0001\u0000\u0000\u0000x\u023e\u0001\u0000\u0000\u0000z\u0249"+
		"\u0001\u0000\u0000\u0000|\u0252\u0001\u0000\u0000\u0000~\u025b\u0001\u0000"+
		"\u0000\u0000\u0080\u025f\u0001\u0000\u0000\u0000\u0082\u0263\u0001\u0000"+
		"\u0000\u0000\u0084\u027a\u0001\u0000\u0000\u0000\u0086\u027e\u0001\u0000"+
		"\u0000\u0000\u0088\u0283\u0001\u0000\u0000\u0000\u008a\u0285\u0001\u0000"+
		"\u0000\u0000\u008c\u0288\u0001\u0000\u0000\u0000\u008e\u0090\u0003 \u0010"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0098\u0001\u0000\u0000\u0000\u0091\u0099\u0003^/\u0000\u0092"+
		"\u0094\u0003\u0002\u0001\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u0091\u0001\u0000\u0000\u0000\u0098"+
		"\u0095\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u0000\u0000\u0001\u009b\u0001\u0001\u0000\u0000\u0000\u009c"+
		"\u00a2\u0003\"\u0011\u0000\u009d\u00a2\u0003\b\u0004\u0000\u009e\u00a2"+
		"\u0003\u0018\f\u0000\u009f\u00a2\u0003*\u0015\u0000\u00a0\u00a2\u0003"+
		"\u0006\u0003\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1\u009d\u0001"+
		"\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u0003\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\t\u0000\u0000\u00a4\u0005\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0002\u0000\u0000\u00a6\u00a7\u0005\u000f"+
		"\u0000\u0000\u00a7\u00a8\u00059\u0000\u0000\u00a8\u00a9\u0005*\u0000\u0000"+
		"\u00a9\u00aa\u00030\u0018\u0000\u00aa\u00ab\u0005;\u0000\u0000\u00ab\u0007"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003\n\u0005\u0000\u00ad\u00af\u0003"+
		"\f\u0006\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u0010"+
		"\b\u0000\u00b1\t\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0002\u0000"+
		"\u0000\u00b3\u00b4\u0005\n\u0000\u0000\u00b4\u00b5\u00030\u0018\u0000"+
		"\u00b5\u00b6\u0005;\u0000\u0000\u00b6\u000b\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0003\u000e\u0007\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00be\u0003\u0014\n\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00c1"+
		"\u0003\u0014\n\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\r\u0001\u0000\u0000\u0000\u00c2\u00ca\u0003\b"+
		"\u0004\u0000\u00c3\u00ca\u0003\u0012\t\u0000\u00c4\u00ca\u0003\u0018\f"+
		"\u0000\u00c5\u00ca\u0003*\u0015\u0000\u00c6\u00ca\u0003^/\u0000\u00c7"+
		"\u00ca\u0003\u0004\u0002\u0000\u00c8\u00ca\u0003\u0006\u0003\u0000\u00c9"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c9\u00c3\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u000f\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\u0002\u0000\u0000\u00cc\u00cd\u0005\u0011\u0000\u0000\u00cd"+
		"\u00ce\u0005\u0014\u0000\u0000\u00ce\u0011\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0002\u0000\u0000\u00d0\u00d1\u0005\u000b\u0000\u0000\u00d1"+
		"\u00d2\u00030\u0018\u0000\u00d2\u00d6\u0005;\u0000\u0000\u00d3\u00d5\u0003"+
		"\u0016\u000b\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u0013\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\u0002\u0000\u0000\u00da\u00db\u0005"+
		"\u0010\u0000\u0000\u00db\u00df\u0005\u0014\u0000\u0000\u00dc\u00de\u0003"+
		"\u0016\u000b\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u0015\u0001\u0000\u0000\u0000\u00e1\u00df\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e9\u0003\b\u0004\u0000\u00e3\u00e9\u0003\u0018"+
		"\f\u0000\u00e4\u00e9\u0003*\u0015\u0000\u00e5\u00e9\u0003^/\u0000\u00e6"+
		"\u00e9\u0003\u0004\u0002\u0000\u00e7\u00e9\u0003\u0006\u0003\u0000\u00e8"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e8\u00e3\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u0017\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003\u001a\r\u0000\u00eb\u00ed"+
		"\u0003\u001e\u000f\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0003\u001c\u000e\u0000\u00ef\u0019\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0005\u0002\u0000\u0000\u00f1\u00f2\u0005\f\u0000\u0000\u00f2\u00f7\u0005"+
		"9\u0000\u0000\u00f3\u00f4\u0005-\u0000\u0000\u00f4\u00f6\u00059\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\'\u0000\u0000\u00fb\u00fc\u00030\u0018\u0000"+
		"\u00fc\u00fd\u0005;\u0000\u0000\u00fd\u001b\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005\u0002\u0000\u0000\u00ff\u0100\u0005\u0012\u0000\u0000\u0100"+
		"\u0101\u0005\u0014\u0000\u0000\u0101\u001d\u0001\u0000\u0000\u0000\u0102"+
		"\u0104\u0003\u0016\u000b\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107"+
		"\u0109\u0003\u0014\n\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u001f\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0005\u0002\u0000\u0000\u010b\u010c\u0005\r\u0000\u0000\u010c\u010d\u0005"+
		"8\u0000\u0000\u010d\u010e\u0005;\u0000\u0000\u010e!\u0001\u0000\u0000"+
		"\u0000\u010f\u0111\u0003&\u0013\u0000\u0110\u0112\u0003$\u0012\u0000\u0111"+
		"\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0003(\u0014\u0000\u0114#\u0001"+
		"\u0000\u0000\u0000\u0115\u0118\u0003\u0016\u000b\u0000\u0116\u0118\u0003"+
		"\"\u0011\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a%\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0005\u0002\u0000\u0000\u011c\u011d\u0005\u000e\u0000"+
		"\u0000\u011d\u011e\u00059\u0000\u0000\u011e\u011f\u0005;\u0000\u0000\u011f"+
		"\'\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u0002\u0000\u0000\u0121\u0122"+
		"\u0005\u0013\u0000\u0000\u0122\u0123\u0005\u0014\u0000\u0000\u0123)\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0003,\u0016\u0000\u0125\u0126\u00030\u0018"+
		"\u0000\u0126\u0127\u0003.\u0017\u0000\u0127+\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0007\u0000\u0000\u0000\u0129-\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005:\u0000\u0000\u012b/\u0001\u0000\u0000\u0000\u012c\u012e\u00036"+
		"\u001b\u0000\u012d\u012f\u00032\u0019\u0000\u012e\u012d\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000"+
		"\u0000\u0130\u0132\u00034\u001a\u0000\u0131\u012c\u0001\u0000\u0000\u0000"+
		"\u0131\u0130\u0001\u0000\u0000\u0000\u01321\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0005(\u0000\u0000\u0134\u0135\u00030\u0018\u0000\u0135\u0136\u0005"+
		"/\u0000\u0000\u0136\u0137\u00030\u0018\u0000\u01373\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u00036\u001b\u0000\u0139\u013a\u0005)\u0000\u0000\u013a"+
		"\u013b\u00030\u0018\u0000\u013b5\u0001\u0000\u0000\u0000\u013c\u0141\u0003"+
		"8\u001c\u0000\u013d\u013e\u0005\u001e\u0000\u0000\u013e\u0140\u00038\u001c"+
		"\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u01427\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0149\u0003:\u001d\u0000\u0145\u0146\u0005\u001d\u0000\u0000\u0146"+
		"\u0148\u0003:\u001d\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014b"+
		"\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a9\u0001\u0000\u0000\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0005\u001f\u0000\u0000\u014d\u0150\u0003"+
		":\u001d\u0000\u014e\u0150\u0003<\u001e\u0000\u014f\u014c\u0001\u0000\u0000"+
		"\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150;\u0001\u0000\u0000\u0000"+
		"\u0151\u0157\u0003H$\u0000\u0152\u0154\u0005 \u0000\u0000\u0153\u0155"+
		"\u0005\u001f\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158"+
		"\u00059\u0000\u0000\u0157\u0152\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u0163\u0001\u0000\u0000\u0000\u0159\u015a\u0003"+
		"@ \u0000\u015a\u015b\u0003>\u001f\u0000\u015b\u015c\u0003@ \u0000\u015c"+
		"\u0163\u0001\u0000\u0000\u0000\u015d\u0160\u0003@ \u0000\u015e\u015f\u0005"+
		"\'\u0000\u0000\u015f\u0161\u0003@ \u0000\u0160\u015e\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001\u0000\u0000"+
		"\u0000\u0162\u0151\u0001\u0000\u0000\u0000\u0162\u0159\u0001\u0000\u0000"+
		"\u0000\u0162\u015d\u0001\u0000\u0000\u0000\u0163=\u0001\u0000\u0000\u0000"+
		"\u0164\u016b\u0005!\u0000\u0000\u0165\u016b\u0005\"\u0000\u0000\u0166"+
		"\u016b\u0005%\u0000\u0000\u0167\u016b\u0005#\u0000\u0000\u0168\u016b\u0005"+
		"&\u0000\u0000\u0169\u016b\u0005$\u0000\u0000\u016a\u0164\u0001\u0000\u0000"+
		"\u0000\u016a\u0165\u0001\u0000\u0000\u0000\u016a\u0166\u0001\u0000\u0000"+
		"\u0000\u016a\u0167\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b?\u0001\u0000\u0000\u0000"+
		"\u016c\u0170\u0003H$\u0000\u016d\u016f\u0003B!\u0000\u016e\u016d\u0001"+
		"\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171A\u0001\u0000"+
		"\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0174\u0005,\u0000"+
		"\u0000\u0174\u017a\u00059\u0000\u0000\u0175\u0177\u00050\u0000\u0000\u0176"+
		"\u0178\u0003D\"\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b"+
		"\u00051\u0000\u0000\u017a\u0175\u0001\u0000\u0000\u0000\u017a\u017b\u0001"+
		"\u0000\u0000\u0000\u017bC\u0001\u0000\u0000\u0000\u017c\u0181\u0003F#"+
		"\u0000\u017d\u017e\u0005-\u0000\u0000\u017e\u0180\u0003F#\u0000\u017f"+
		"\u017d\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181"+
		"\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"E\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0189"+
		"\u00030\u0018\u0000\u0185\u0186\u00059\u0000\u0000\u0186\u0187\u0005*"+
		"\u0000\u0000\u0187\u0189\u00030\u0018\u0000\u0188\u0184\u0001\u0000\u0000"+
		"\u0000\u0188\u0185\u0001\u0000\u0000\u0000\u0189G\u0001\u0000\u0000\u0000"+
		"\u018a\u018f\u0003J%\u0000\u018b\u018c\u0005+\u0000\u0000\u018c\u018e"+
		"\u0003J%\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000"+
		"\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000"+
		"\u0000\u0000\u0190I\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0192\u0198\u0003N\'\u0000\u0193\u0194\u0003L&\u0000\u0194\u0195"+
		"\u0003N\'\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0193\u0001"+
		"\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199K\u0001\u0000"+
		"\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019e\u0005\u0017"+
		"\u0000\u0000\u019c\u019e\u0005\u0018\u0000\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019eM\u0001\u0000\u0000"+
		"\u0000\u019f\u01a5\u0003R)\u0000\u01a0\u01a1\u0003P(\u0000\u01a1\u01a2"+
		"\u0003R)\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6O\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ad\u0005\u0016\u0000"+
		"\u0000\u01a9\u01ad\u0005\u0019\u0000\u0000\u01aa\u01ad\u0005\u001a\u0000"+
		"\u0000\u01ab\u01ad\u0005\u001b\u0000\u0000\u01ac\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ac\u01a9\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01adQ\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0007\u0001\u0000\u0000\u01af\u01b2\u0003R)\u0000\u01b0\u01b2"+
		"\u0003T*\u0000\u01b1\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b2S\u0001\u0000\u0000\u0000\u01b3\u01b6\u0003Z-\u0000"+
		"\u01b4\u01b5\u0005\u001c\u0000\u0000\u01b5\u01b7\u0003R)\u0000\u01b6\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7U\u0001"+
		"\u0000\u0000\u0000\u01b8\u01d9\u00059\u0000\u0000\u01b9\u01d9\u00057\u0000"+
		"\u0000\u01ba\u01d9\u00056\u0000\u0000\u01bb\u01d9\u00058\u0000\u0000\u01bc"+
		"\u01bd\u00050\u0000\u0000\u01bd\u01be\u00030\u0018\u0000\u01be\u01bf\u0005"+
		"1\u0000\u0000\u01bf\u01d9\u0001\u0000\u0000\u0000\u01c0\u01c9\u00052\u0000"+
		"\u0000\u01c1\u01c6\u00030\u0018\u0000\u01c2\u01c3\u0005-\u0000\u0000\u01c3"+
		"\u01c5\u00030\u0018\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c1\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01d9"+
		"\u00053\u0000\u0000\u01cc\u01d5\u00054\u0000\u0000\u01cd\u01d2\u0003X"+
		",\u0000\u01ce\u01cf\u0005-\u0000\u0000\u01cf\u01d1\u0003X,\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d9\u00055\u0000\u0000\u01d8\u01b8"+
		"\u0001\u0000\u0000\u0000\u01d8\u01b9\u0001\u0000\u0000\u0000\u01d8\u01ba"+
		"\u0001\u0000\u0000\u0000\u01d8\u01bb\u0001\u0000\u0000\u0000\u01d8\u01bc"+
		"\u0001\u0000\u0000\u0000\u01d8\u01c0\u0001\u0000\u0000\u0000\u01d8\u01cc"+
		"\u0001\u0000\u0000\u0000\u01d9W\u0001\u0000\u0000\u0000\u01da\u01db\u0003"+
		"0\u0018\u0000\u01db\u01dc\u0005/\u0000\u0000\u01dc\u01dd\u00030\u0018"+
		"\u0000\u01ddY\u0001\u0000\u0000\u0000\u01de\u01e2\u0003V+\u0000\u01df"+
		"\u01e1\u0003\\.\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e3[\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0005.\u0000\u0000\u01e6\u01f1\u00059\u0000"+
		"\u0000\u01e7\u01e8\u00052\u0000\u0000\u01e8\u01e9\u00030\u0018\u0000\u01e9"+
		"\u01ea\u00053\u0000\u0000\u01ea\u01f1\u0001\u0000\u0000\u0000\u01eb\u01ed"+
		"\u00050\u0000\u0000\u01ec\u01ee\u0003D\"\u0000\u01ed\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f1\u00051\u0000\u0000\u01f0\u01e5\u0001\u0000\u0000"+
		"\u0000\u01f0\u01e7\u0001\u0000\u0000\u0000\u01f0\u01eb\u0001\u0000\u0000"+
		"\u0000\u01f1]\u0001\u0000\u0000\u0000\u01f2\u01f5\u0003`0\u0000\u01f3"+
		"\u01f5\u0003h4\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f5_\u0001\u0000\u0000\u0000\u01f6\u01f8\u0003b1"+
		"\u0000\u01f7\u01f9\u0003d2\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0003f3\u0000\u01fba\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005"+
		"\u0007\u0000\u0000\u01fd\u0201\u0005>\u0000\u0000\u01fe\u0200\u0003l6"+
		"\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000"+
		"\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000"+
		"\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0005L\u0000\u0000\u0205c\u0001\u0000\u0000\u0000\u0206"+
		"\u020b\u0003^/\u0000\u0207\u020b\u0003|>\u0000\u0208\u020b\u0003\u0002"+
		"\u0001\u0000\u0209\u020b\u0003\u0004\u0002\u0000\u020a\u0206\u0001\u0000"+
		"\u0000\u0000\u020a\u0207\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000"+
		"\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000"+
		"\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020de\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u0006\u0000"+
		"\u0000\u020f\u0210\u0005@\u0000\u0000\u0210\u0211\u0005A\u0000\u0000\u0211"+
		"g\u0001\u0000\u0000\u0000\u0212\u0213\u0003j5\u0000\u0213i\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0005\u0007\u0000\u0000\u0215\u0219\u0005>\u0000"+
		"\u0000\u0216\u0218\u0003l6\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218"+
		"\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219"+
		"\u021a\u0001\u0000\u0000\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b"+
		"\u0219\u0001\u0000\u0000\u0000\u021c\u021d\u0005M\u0000\u0000\u021dk\u0001"+
		"\u0000\u0000\u0000\u021e\u0224\u0003x<\u0000\u021f\u0224\u0003n7\u0000"+
		"\u0220\u0224\u0003r9\u0000\u0221\u0224\u0003p8\u0000\u0222\u0224\u0003"+
		"*\u0015\u0000\u0223\u021e\u0001\u0000\u0000\u0000\u0223\u021f\u0001\u0000"+
		"\u0000\u0000\u0223\u0220\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000"+
		"\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0224m\u0001\u0000\u0000"+
		"\u0000\u0225\u0226\u0005I\u0000\u0000\u0226o\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0005I\u0000\u0000\u0228\u0229\u0005J\u0000\u0000\u0229\u022a\u0005"+
		"P\u0000\u0000\u022aq\u0001\u0000\u0000\u0000\u022b\u022c\u0005I\u0000"+
		"\u0000\u022c\u022d\u0005J\u0000\u0000\u022d\u0231\u0005O\u0000\u0000\u022e"+
		"\u0230\u0003t:\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u0230\u0233\u0001"+
		"\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001"+
		"\u0000\u0000\u0000\u0232\u0234\u0001\u0000\u0000\u0000\u0233\u0231\u0001"+
		"\u0000\u0000\u0000\u0234\u0235\u0005T\u0000\u0000\u0235s\u0001\u0000\u0000"+
		"\u0000\u0236\u0239\u0005S\u0000\u0000\u0237\u0239\u0003v;\u0000\u0238"+
		"\u0236\u0001\u0000\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239"+
		"u\u0001\u0000\u0000\u0000\u023a\u023b\u0005R\u0000\u0000\u023b\u023c\u0003"+
		"0\u0018\u0000\u023c\u023d\u0005:\u0000\u0000\u023dw\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0005H\u0000\u0000\u023f\u0240\u0005_\u0000\u0000\u0240"+
		"\u0244\u0005`\u0000\u0000\u0241\u0243\u0003z=\u0000\u0242\u0241\u0001"+
		"\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244\u0242\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0247\u0001"+
		"\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247\u0248\u0005"+
		"h\u0000\u0000\u0248y\u0001\u0000\u0000\u0000\u0249\u024a\u0005f\u0000"+
		"\u0000\u024a\u024c\u0005g\u0000\u0000\u024b\u024d\u0005j\u0000\u0000\u024c"+
		"\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0005k\u0000\u0000\u0251{\u0001"+
		"\u0000\u0000\u0000\u0252\u0256\u0003~?\u0000\u0253\u0255\u0003\u0082A"+
		"\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000"+
		"\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000"+
		"\u0000\u0257\u0259\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u0003\u0080@\u0000\u025a}\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0005\u0007\u0000\u0000\u025c\u025d\u0005=\u0000\u0000\u025d\u025e"+
		"\u0005C\u0000\u0000\u025e\u007f\u0001\u0000\u0000\u0000\u025f\u0260\u0005"+
		"V\u0000\u0000\u0260\u0261\u0005E\u0000\u0000\u0261\u0262\u0005F\u0000"+
		"\u0000\u0262\u0081\u0001\u0000\u0000\u0000\u0263\u0264\u0003\u0084B\u0000"+
		"\u0264\u0268\u0005\\\u0000\u0000\u0265\u0267\u0003\u008cF\u0000\u0266"+
		"\u0265\u0001\u0000\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268"+
		"\u0266\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269"+
		"\u026b\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026b"+
		"\u026c\u0005d\u0000\u0000\u026c\u0083\u0001\u0000\u0000\u0000\u026d\u027b"+
		"\u0003\u0086C\u0000\u026e\u0270\u0003\u0086C\u0000\u026f\u026e\u0001\u0000"+
		"\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u027b\u0001\u0000"+
		"\u0000\u0000\u0273\u0276\u0003\u0086C\u0000\u0274\u0275\u0005[\u0000\u0000"+
		"\u0275\u0277\u0003\u0086C\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0277"+
		"\u0278\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0278"+
		"\u0279\u0001\u0000\u0000\u0000\u0279\u027b\u0001\u0000\u0000\u0000\u027a"+
		"\u026d\u0001\u0000\u0000\u0000\u027a\u026f\u0001\u0000\u0000\u0000\u027a"+
		"\u0273\u0001\u0000\u0000\u0000\u027b\u0085\u0001\u0000\u0000\u0000\u027c"+
		"\u027f\u0003\u0088D\u0000\u027d\u027f\u0003\u008aE\u0000\u027e\u027c\u0001"+
		"\u0000\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027f\u0087\u0001"+
		"\u0000\u0000\u0000\u0280\u0284\u0005W\u0000\u0000\u0281\u0284\u0005X\u0000"+
		"\u0000\u0282\u0284\u0005Y\u0000\u0000\u0283\u0280\u0001\u0000\u0000\u0000"+
		"\u0283\u0281\u0001\u0000\u0000\u0000\u0283\u0282\u0001\u0000\u0000\u0000"+
		"\u0284\u0089\u0001\u0000\u0000\u0000\u0285\u0286\u0003\u0088D\u0000\u0286"+
		"\u0287\u0005Z\u0000\u0000\u0287\u008b\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0005b\u0000\u0000\u0289\u028b\u0005c\u0000\u0000\u028a\u028c\u0005j"+
		"\u0000\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000"+
		"\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000"+
		"\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0005k\u0000"+
		"\u0000\u0290\u008d\u0001\u0000\u0000\u0000D\u008f\u0095\u0098\u00a1\u00ae"+
		"\u00ba\u00bd\u00c0\u00c9\u00d6\u00df\u00e8\u00ec\u00f7\u0105\u0108\u0111"+
		"\u0117\u0119\u012e\u0131\u0141\u0149\u014f\u0154\u0157\u0160\u0162\u016a"+
		"\u0170\u0177\u017a\u0181\u0188\u018f\u0198\u019d\u01a5\u01ac\u01b1\u01b6"+
		"\u01c6\u01c9\u01d2\u01d5\u01d8\u01e2\u01ed\u01f0\u01f4\u01f8\u0201\u020a"+
		"\u020c\u0219\u0223\u0231\u0238\u0244\u024e\u0256\u0268\u0271\u0278\u027a"+
		"\u027e\u0283\u028d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}