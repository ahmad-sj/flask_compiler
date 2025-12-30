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
		J_STMNT_END=20, J_STMNT_WS=21, MULT=22, PLUS=23, MINUS=24, DIV=25, FLOORDIV=26, 
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
		RULE_template = 0, RULE_jinjaBlock = 1, RULE_templateText = 2, RULE_setStatement = 3, 
		RULE_ifBlock = 4, RULE_ifStatmentStart = 5, RULE_ifBody = 6, RULE_ifBodyElem = 7, 
		RULE_ifStatmentEnd = 8, RULE_elifBlock = 9, RULE_elseBlock = 10, RULE_subBlock = 11, 
		RULE_forBlock = 12, RULE_forStartStatement = 13, RULE_forEndStatement = 14, 
		RULE_forBody = 15, RULE_extendsBlock = 16, RULE_inheritBlock = 17, RULE_inheritBlockBody = 18, 
		RULE_inheritBlockStart = 19, RULE_inheritBlockEnd = 20, RULE_jinjaExpression = 21, 
		RULE_jinjaExprStart = 22, RULE_jinjaExprEnd = 23, RULE_expression = 24, 
		RULE_ternaryExt = 25, RULE_defaultExpr = 26, RULE_orExpr = 27, RULE_andExpr = 28, 
		RULE_notExpr = 29, RULE_compareExpr = 30, RULE_isExpr = 31, RULE_compExpr = 32, 
		RULE_inExpr = 33, RULE_comparisonOperator = 34, RULE_pipeExpr = 35, RULE_filter = 36, 
		RULE_argumentList = 37, RULE_argument = 38, RULE_concatExpr = 39, RULE_addExpr = 40, 
		RULE_addExprOptor = 41, RULE_mulExpr = 42, RULE_mulExprOptor = 43, RULE_unaryExpr = 44, 
		RULE_powExpr = 45, RULE_atom = 46, RULE_parenthedExpr = 47, RULE_primary = 48, 
		RULE_trailer = 49, RULE_memberTrailer = 50, RULE_subTrailer = 51, RULE_callTrailer = 52, 
		RULE_list = 53, RULE_dict = 54, RULE_pair = 55, RULE_htmlElement = 56, 
		RULE_htmlRegularElement = 57, RULE_htmlStartTag = 58, RULE_htmlElementBody = 59, 
		RULE_htmlEndTag = 60, RULE_htmlSelfClosingElement = 61, RULE_htmlSelfClosingTag = 62, 
		RULE_htmlTagAttr = 63, RULE_booleanAttr = 64, RULE_attrWithUnquotedVal = 65, 
		RULE_attrWithQuotedVal = 66, RULE_quotedValElem = 67, RULE_jinjaAttrVal = 68, 
		RULE_styleAttr = 69, RULE_inlineStyleProp = 70, RULE_htmlStyleElem = 71, 
		RULE_htmlStyleElemOpenTag = 72, RULE_htmlStyleElemCloseTag = 73, RULE_cssBlock = 74, 
		RULE_selectorList = 75, RULE_selector = 76, RULE_simpleSelector = 77, 
		RULE_pseudoClassSelector = 78, RULE_cssProp = 79;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "jinjaBlock", "templateText", "setStatement", "ifBlock", 
			"ifStatmentStart", "ifBody", "ifBodyElem", "ifStatmentEnd", "elifBlock", 
			"elseBlock", "subBlock", "forBlock", "forStartStatement", "forEndStatement", 
			"forBody", "extendsBlock", "inheritBlock", "inheritBlockBody", "inheritBlockStart", 
			"inheritBlockEnd", "jinjaExpression", "jinjaExprStart", "jinjaExprEnd", 
			"expression", "ternaryExt", "defaultExpr", "orExpr", "andExpr", "notExpr", 
			"compareExpr", "isExpr", "compExpr", "inExpr", "comparisonOperator", 
			"pipeExpr", "filter", "argumentList", "argument", "concatExpr", "addExpr", 
			"addExprOptor", "mulExpr", "mulExprOptor", "unaryExpr", "powExpr", "atom", 
			"parenthedExpr", "primary", "trailer", "memberTrailer", "subTrailer", 
			"callTrailer", "list", "dict", "pair", "htmlElement", "htmlRegularElement", 
			"htmlStartTag", "htmlElementBody", "htmlEndTag", "htmlSelfClosingElement", 
			"htmlSelfClosingTag", "htmlTagAttr", "booleanAttr", "attrWithUnquotedVal", 
			"attrWithQuotedVal", "quotedValElem", "jinjaAttrVal", "styleAttr", "inlineStyleProp", 
			"htmlStyleElem", "htmlStyleElemOpenTag", "htmlStyleElemCloseTag", "cssBlock", 
			"selectorList", "selector", "simpleSelector", "pseudoClassSelector", 
			"cssProp"
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
			"J_STMNT_END", "J_STMNT_WS", "MULT", "PLUS", "MINUS", "DIV", "FLOORDIV", 
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
		public List<JinjaBlockContext> jinjaBlock() {
			return getRuleContexts(JinjaBlockContext.class);
		}
		public JinjaBlockContext jinjaBlock(int i) {
			return getRuleContext(JinjaBlockContext.class,i);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(160);
				extendsBlock();
				}
				break;
			}
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_TAG_OPEN:
				{
				setState(163);
				htmlElement();
				}
				break;
			case EOF:
			case J_STMNT_START:
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J_STMNT_START) {
					{
					{
					setState(164);
					jinjaBlock();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
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
	public static class JinjaBlockContext extends ParserRuleContext {
		public InheritBlockContext inheritBlock() {
			return getRuleContext(InheritBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jinjaBlock);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				inheritBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				forBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
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
			setState(180);
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
			setState(182);
			match(J_STMNT_START);
			setState(183);
			match(SET);
			setState(184);
			match(ID);
			setState(185);
			match(ASSIGN);
			setState(186);
			expression();
			setState(187);
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
			setState(189);
			ifStatmentStart();
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(190);
				ifBody();
				}
				break;
			}
			setState(193);
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
			setState(195);
			match(J_STMNT_START);
			setState(196);
			match(IF);
			setState(197);
			expression();
			setState(198);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(200);
						ifBodyElem();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(203); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(205);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				elifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				forBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				jinjaExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				htmlElement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				templateText();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
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
			setState(220);
			match(J_STMNT_START);
			setState(221);
			match(ENDIF);
			setState(222);
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
			setState(224);
			match(J_STMNT_START);
			setState(225);
			match(ELIF);
			setState(226);
			expression();
			setState(227);
			match(J_EXPR_STMNT_END);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					subBlock();
					}
					} 
				}
				setState(233);
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
			setState(234);
			match(J_STMNT_START);
			setState(235);
			match(ELSE);
			setState(236);
			match(J_STMNT_END);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					subBlock();
					}
					} 
				}
				setState(242);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				forBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				jinjaExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				htmlElement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				templateText();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
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
			setState(251);
			forStartStatement();
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(252);
				forBody();
				}
				break;
			}
			setState(255);
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
			setState(257);
			match(J_STMNT_START);
			setState(258);
			match(FOR);
			setState(259);
			match(ID);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				match(ID);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(IN);
			setState(268);
			expression();
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
			setState(271);
			match(J_STMNT_START);
			setState(272);
			match(ENDFOR);
			setState(273);
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
			setState(276); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(275);
					subBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(278); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(280);
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
			setState(283);
			match(J_STMNT_START);
			setState(284);
			match(EXTENDS);
			setState(285);
			match(STRING);
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
			setState(288);
			inheritBlockStart();
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(289);
				inheritBlockBody();
				}
				break;
			}
			setState(292);
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
			setState(296); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(294);
						subBlock();
						}
						break;
					case 2:
						{
						setState(295);
						inheritBlock();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(298); 
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
			setState(300);
			match(J_STMNT_START);
			setState(301);
			match(BLOCK);
			setState(302);
			match(ID);
			setState(303);
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
			setState(305);
			match(J_STMNT_START);
			setState(306);
			match(ENDBLOCK);
			setState(307);
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
			setState(309);
			jinjaExprStart();
			setState(310);
			expression();
			setState(311);
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
			setState(313);
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
			setState(315);
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
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				orExpr();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QMARK) {
					{
					setState(318);
					ternaryExt();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
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
			setState(324);
			match(QMARK);
			setState(325);
			expression();
			setState(326);
			match(COLON);
			setState(327);
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
			setState(329);
			orExpr();
			setState(330);
			match(ELVIS);
			setState(331);
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
			setState(333);
			andExpr();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(334);
				match(OR);
				setState(335);
				andExpr();
				}
				}
				setState(340);
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
			setState(341);
			notExpr();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(342);
				match(AND);
				setState(343);
				notExpr();
				}
				}
				setState(348);
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
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(NOT);
				setState(350);
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
				setState(351);
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
		public IsExprContext isExpr() {
			return getRuleContext(IsExprContext.class,0);
		}
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public InExprContext inExpr() {
			return getRuleContext(InExprContext.class,0);
		}
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_compareExpr);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				isExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				compExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				inExpr();
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
	public static class IsExprContext extends ParserRuleContext {
		public ConcatExprContext concatExpr() {
			return getRuleContext(ConcatExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(templateParser.IS, 0); }
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public TerminalNode NOT() { return getToken(templateParser.NOT, 0); }
		public IsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isExpr; }
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

	public final IsExprContext isExpr() throws RecognitionException {
		IsExprContext _localctx = new IsExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_isExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			concatExpr();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(360);
				match(IS);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(361);
					match(NOT);
					}
				}

				setState(364);
				match(ID);
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
	public static class CompExprContext extends ParserRuleContext {
		public List<PipeExprContext> pipeExpr() {
			return getRuleContexts(PipeExprContext.class);
		}
		public PipeExprContext pipeExpr(int i) {
			return getRuleContext(PipeExprContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
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

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			pipeExpr();
			setState(368);
			comparisonOperator();
			setState(369);
			pipeExpr();
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
	public static class InExprContext extends ParserRuleContext {
		public List<PipeExprContext> pipeExpr() {
			return getRuleContexts(PipeExprContext.class);
		}
		public PipeExprContext pipeExpr(int i) {
			return getRuleContext(PipeExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(templateParser.IN, 0); }
		public InExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inExpr; }
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

	public final InExprContext inExpr() throws RecognitionException {
		InExprContext _localctx = new InExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_inExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			pipeExpr();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(372);
				match(IN);
				setState(373);
				pipeExpr();
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
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(templateParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(templateParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(templateParser.LT, 0); }
		public TerminalNode GT() { return getToken(templateParser.GT, 0); }
		public TerminalNode LE() { return getToken(templateParser.LE, 0); }
		public TerminalNode GE() { return getToken(templateParser.GE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_pipeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			concatExpr();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPELINE) {
				{
				{
				setState(379);
				filter();
				}
				}
				setState(384);
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
		enterRule(_localctx, 72, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(PIPELINE);
			setState(386);
			match(ID);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(387);
				match(LPAREN);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276126954325803008L) != 0)) {
					{
					setState(388);
					argumentList();
					}
				}

				setState(391);
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
		enterRule(_localctx, 74, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			argument();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(396);
				argument();
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
		enterRule(_localctx, 76, RULE_argument);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(ID);
				setState(404);
				match(ASSIGN);
				setState(405);
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
		enterRule(_localctx, 78, RULE_concatExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			addExpr();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TILDE) {
				{
				{
				setState(409);
				match(TILDE);
				setState(410);
				addExpr();
				}
				}
				setState(415);
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
		enterRule(_localctx, 80, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			mulExpr();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(417);
				addExprOptor();
				setState(418);
				mulExpr();
				}
				}
				setState(424);
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
		public TerminalNode PLUS() { return getToken(templateParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(templateParser.MINUS, 0); }
		public AddExprOptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExprOptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterAddExprOptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitAddExprOptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitAddExprOptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprOptorContext addExprOptor() throws RecognitionException {
		AddExprOptorContext _localctx = new AddExprOptorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_addExprOptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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
		enterRule(_localctx, 84, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			unaryExpr();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 239075328L) != 0)) {
				{
				{
				setState(428);
				mulExprOptor();
				setState(429);
				unaryExpr();
				}
				}
				setState(435);
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
		public TerminalNode MULT() { return getToken(templateParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(templateParser.DIV, 0); }
		public TerminalNode FLOORDIV() { return getToken(templateParser.FLOORDIV, 0); }
		public TerminalNode MOD() { return getToken(templateParser.MOD, 0); }
		public MulExprOptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExprOptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterMulExprOptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitMulExprOptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitMulExprOptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExprOptorContext mulExprOptor() throws RecognitionException {
		MulExprOptorContext _localctx = new MulExprOptorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mulExprOptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 239075328L) != 0)) ) {
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
		enterRule(_localctx, 88, RULE_unaryExpr);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
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
				setState(440);
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
		enterRule(_localctx, 90, RULE_powExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			primary();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(444);
				match(POW);
				setState(445);
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
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public TerminalNode INT() { return getToken(templateParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(templateParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(templateParser.STRING, 0); }
		public ParenthedExprContext parenthedExpr() {
			return getRuleContext(ParenthedExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_atom);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				match(STRING);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(452);
				parenthedExpr();
				}
				break;
			case LSB:
				enterOuterAlt(_localctx, 6);
				{
				setState(453);
				list();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(454);
				dict();
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
	public static class ParenthedExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(templateParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(templateParser.RPAREN, 0); }
		public ParenthedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthedExpr; }
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

	public final ParenthedExprContext parenthedExpr() throws RecognitionException {
		ParenthedExprContext _localctx = new ParenthedExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parenthedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(LPAREN);
			setState(458);
			expression();
			setState(459);
			match(RPAREN);
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
		enterRule(_localctx, 96, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			atom();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1477743627730944L) != 0)) {
				{
				{
				setState(462);
				trailer();
				}
				}
				setState(467);
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
		public MemberTrailerContext memberTrailer() {
			return getRuleContext(MemberTrailerContext.class,0);
		}
		public SubTrailerContext subTrailer() {
			return getRuleContext(SubTrailerContext.class,0);
		}
		public CallTrailerContext callTrailer() {
			return getRuleContext(CallTrailerContext.class,0);
		}
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_trailer);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				memberTrailer();
				}
				break;
			case LSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				subTrailer();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				callTrailer();
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
	public static class MemberTrailerContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(templateParser.DOT, 0); }
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public MemberTrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberTrailer; }
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

	public final MemberTrailerContext memberTrailer() throws RecognitionException {
		MemberTrailerContext _localctx = new MemberTrailerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_memberTrailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(DOT);
			setState(474);
			match(ID);
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
	public static class SubTrailerContext extends ParserRuleContext {
		public TerminalNode LSB() { return getToken(templateParser.LSB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSB() { return getToken(templateParser.RSB, 0); }
		public SubTrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTrailer; }
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

	public final SubTrailerContext subTrailer() throws RecognitionException {
		SubTrailerContext _localctx = new SubTrailerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_subTrailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(LSB);
			setState(477);
			expression();
			setState(478);
			match(RSB);
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
	public static class CallTrailerContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(templateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(templateParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallTrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callTrailer; }
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

	public final CallTrailerContext callTrailer() throws RecognitionException {
		CallTrailerContext _localctx = new CallTrailerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_callTrailer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(LPAREN);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276126954325803008L) != 0)) {
				{
				setState(481);
				argumentList();
				}
			}

			setState(484);
			match(RPAREN);
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
	public static class ListContext extends ParserRuleContext {
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
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
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

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(LSB);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276126954325803008L) != 0)) {
				{
				setState(487);
				expression();
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(488);
					match(COMMA);
					setState(489);
					expression();
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(497);
			match(RSB);
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
	public static class DictContext extends ParserRuleContext {
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
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
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

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(LBRACE);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276126954325803008L) != 0)) {
				{
				setState(500);
				pair();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(501);
					match(COMMA);
					setState(502);
					pair();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(510);
			match(RBRACE);
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
		enterRule(_localctx, 110, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			expression();
			setState(513);
			match(COLON);
			setState(514);
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
		enterRule(_localctx, 112, RULE_htmlElement);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				htmlRegularElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
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
		enterRule(_localctx, 114, RULE_htmlRegularElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			htmlStartTag();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 646L) != 0) || _la==INSIDE_START_TAG_J_EXPR_OPEN) {
				{
				setState(521);
				htmlElementBody();
				}
			}

			setState(524);
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
		enterRule(_localctx, 116, RULE_htmlStartTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(START_TAG_OPEN);
			setState(527);
			match(START_TAG_NAME);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 11L) != 0)) {
				{
				{
				setState(528);
				htmlTagAttr();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
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
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public List<JinjaBlockContext> jinjaBlock() {
			return getRuleContexts(JinjaBlockContext.class);
		}
		public JinjaBlockContext jinjaBlock(int i) {
			return getRuleContext(JinjaBlockContext.class,i);
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
		enterRule(_localctx, 118, RULE_htmlElementBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(536);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(537);
					htmlStyleElem();
					}
					break;
				case 3:
					{
					setState(538);
					jinjaExpression();
					}
					break;
				case 4:
					{
					setState(539);
					jinjaBlock();
					}
					break;
				case 5:
					{
					setState(540);
					templateText();
					}
					break;
				}
				}
				setState(543); 
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
		enterRule(_localctx, 120, RULE_htmlEndTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(CLOSE_TAG_START);
			setState(546);
			match(END_TAG_NAME);
			setState(547);
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
		enterRule(_localctx, 122, RULE_htmlSelfClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		enterRule(_localctx, 124, RULE_htmlSelfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(START_TAG_OPEN);
			setState(552);
			match(START_TAG_NAME);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 11L) != 0)) {
				{
				{
				setState(553);
				htmlTagAttr();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
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
		enterRule(_localctx, 126, RULE_htmlTagAttr);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				styleAttr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				booleanAttr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				attrWithQuotedVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
				attrWithUnquotedVal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(565);
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
		enterRule(_localctx, 128, RULE_booleanAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		enterRule(_localctx, 130, RULE_attrWithUnquotedVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(ATTR_NAME);
			setState(571);
			match(ATTR_EQ);
			setState(572);
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
		enterRule(_localctx, 132, RULE_attrWithQuotedVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(ATTR_NAME);
			setState(575);
			match(ATTR_EQ);
			setState(576);
			match(ATTR_DQUOTE_START);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTR_VAL_J_EXPR_START || _la==ATTR_VAL_TEXT) {
				{
				{
				setState(577);
				quotedValElem();
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
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
		enterRule(_localctx, 134, RULE_quotedValElem);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR_VAL_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(ATTR_VAL_TEXT);
				}
				break;
			case ATTR_VAL_J_EXPR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
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
		enterRule(_localctx, 136, RULE_jinjaAttrVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(ATTR_VAL_J_EXPR_START);
			setState(590);
			expression();
			setState(591);
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
		enterRule(_localctx, 138, RULE_styleAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(STYLE_ATTR);
			setState(594);
			match(CSS_INLINE_EQ);
			setState(595);
			match(CSS_INLINE_DQUOT_START);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_INLINE_PROP_NAME) {
				{
				{
				setState(596);
				inlineStyleProp();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
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
		enterRule(_localctx, 140, RULE_inlineStyleProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(CSS_INLINE_PROP_NAME);
			setState(605);
			match(CSS_INLINE_PROP_COLON);
			setState(607); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(606);
				match(CSS_PROP_VAL);
				}
				}
				setState(609); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(611);
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
		enterRule(_localctx, 142, RULE_htmlStyleElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			htmlStyleElemOpenTag();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0)) {
				{
				{
				setState(614);
				cssBlock();
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
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
		enterRule(_localctx, 144, RULE_htmlStyleElemOpenTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(START_TAG_OPEN);
			setState(623);
			match(STYLE_TAG_START_NAME);
			setState(624);
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
		enterRule(_localctx, 146, RULE_htmlStyleElemCloseTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(CLOSE_STYLE_START);
			setState(627);
			match(STYLE_END_TAG_NAME);
			setState(628);
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
		enterRule(_localctx, 148, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			selectorList();
			setState(631);
			match(CSS_LBRACE);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLK_PROP_NAME) {
				{
				{
				setState(632);
				cssProp();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
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
		enterRule(_localctx, 150, RULE_selectorList);
		int _la;
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new SingleSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				selector();
				}
				break;
			case 2:
				_localctx = new DescendentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(642); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(641);
					selector();
					}
					}
					setState(644); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0) );
				}
				break;
			case 3:
				_localctx = new GroupSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(646);
				selector();
				setState(649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(647);
					match(CSS_SEL_COMMA);
					setState(648);
					selector();
					}
					}
					setState(651); 
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
		enterRule(_localctx, 152, RULE_selector);
		try {
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				simpleSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
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
		enterRule(_localctx, 154, RULE_simpleSelector);
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_SEL_ID:
				_localctx = new IdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(CSS_SEL_ID);
				}
				break;
			case CSS_SEL_CLASS:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(CSS_SEL_CLASS);
				}
				break;
			case CSS_SEL_ELEM:
				_localctx = new ElementSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
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
		enterRule(_localctx, 156, RULE_pseudoClassSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			simpleSelector();
			setState(665);
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
		enterRule(_localctx, 158, RULE_cssProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(BLK_PROP_NAME);
			setState(668);
			match(BLK_COLON);
			setState(670); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(669);
				match(CSS_PROP_VAL);
				}
				}
				setState(672); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(674);
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
		"\u0004\u0001l\u02a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0001"+
		"\u0000\u0003\u0000\u00a2\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00a6"+
		"\b\u0000\n\u0000\f\u0000\u00a9\t\u0000\u0003\u0000\u00ab\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00b3\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00c0\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006\u00ca"+
		"\b\u0006\u000b\u0006\f\u0006\u00cb\u0001\u0006\u0003\u0006\u00cf\b\u0006"+
		"\u0001\u0006\u0003\u0006\u00d2\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00db\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00e6\b\t\n\t\f\t\u00e9\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0005\n\u00ef\b\n\n\n\f\n\u00f2\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fa\b\u000b\u0001\f"+
		"\u0001\f\u0003\f\u00fe\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0107\b\r\n\r\f\r\u010a\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004"+
		"\u000f\u0115\b\u000f\u000b\u000f\f\u000f\u0116\u0001\u000f\u0003\u000f"+
		"\u011a\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0123\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0004\u0012\u0129\b\u0012\u000b\u0012\f\u0012"+
		"\u012a\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0140\b\u0018\u0001\u0018\u0003\u0018\u0143"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0151\b\u001b\n\u001b\f\u001b\u0154\t\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0159\b\u001c\n\u001c\f\u001c\u015c"+
		"\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0161\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0166\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u016b\b\u001f\u0001\u001f\u0003\u001f"+
		"\u016e\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0003"+
		"!\u0177\b!\u0001\"\u0001\"\u0001#\u0001#\u0005#\u017d\b#\n#\f#\u0180\t"+
		"#\u0001$\u0001$\u0001$\u0001$\u0003$\u0186\b$\u0001$\u0003$\u0189\b$\u0001"+
		"%\u0001%\u0001%\u0005%\u018e\b%\n%\f%\u0191\t%\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u0197\b&\u0001\'\u0001\'\u0001\'\u0005\'\u019c\b\'\n\'\f\'\u019f"+
		"\t\'\u0001(\u0001(\u0001(\u0001(\u0005(\u01a5\b(\n(\f(\u01a8\t(\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0005*\u01b0\b*\n*\f*\u01b3\t*\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0003,\u01ba\b,\u0001-\u0001-\u0001-\u0003"+
		"-\u01bf\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01c8"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00050\u01d0\b0\n0\f0\u01d3"+
		"\t0\u00011\u00011\u00011\u00031\u01d8\b1\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00034\u01e3\b4\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00055\u01eb\b5\n5\f5\u01ee\t5\u00035\u01f0\b5\u00015"+
		"\u00015\u00016\u00016\u00016\u00016\u00056\u01f8\b6\n6\f6\u01fb\t6\u0003"+
		"6\u01fd\b6\u00016\u00016\u00017\u00017\u00017\u00017\u00018\u00018\u0003"+
		"8\u0207\b8\u00019\u00019\u00039\u020b\b9\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0005:\u0212\b:\n:\f:\u0215\t:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0004;\u021e\b;\u000b;\f;\u021f\u0001<\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001>\u0001>\u0001>\u0005>\u022b\b>\n>\f>\u022e\t>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u0237\b?\u0001@\u0001@\u0001"+
		"A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0005B\u0243\bB\nB"+
		"\fB\u0246\tB\u0001B\u0001B\u0001C\u0001C\u0003C\u024c\bC\u0001D\u0001"+
		"D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0005E\u0256\bE\nE\fE\u0259"+
		"\tE\u0001E\u0001E\u0001F\u0001F\u0001F\u0004F\u0260\bF\u000bF\fF\u0261"+
		"\u0001F\u0001F\u0001G\u0001G\u0005G\u0268\bG\nG\fG\u026b\tG\u0001G\u0001"+
		"G\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001J\u0001"+
		"J\u0001J\u0005J\u027a\bJ\nJ\fJ\u027d\tJ\u0001J\u0001J\u0001K\u0001K\u0004"+
		"K\u0283\bK\u000bK\fK\u0284\u0001K\u0001K\u0001K\u0004K\u028a\bK\u000b"+
		"K\fK\u028b\u0003K\u028e\bK\u0001L\u0001L\u0003L\u0292\bL\u0001M\u0001"+
		"M\u0001M\u0003M\u0297\bM\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0004"+
		"O\u029f\bO\u000bO\fO\u02a0\u0001O\u0001O\u0001O\u0000\u0000P\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u0000\u0004\u0002\u0000\u0001\u0001KK\u0001\u0000!&\u0001\u0000\u0017"+
		"\u0018\u0002\u0000\u0016\u0016\u0019\u001b\u02af\u0000\u00a1\u0001\u0000"+
		"\u0000\u0000\u0002\u00b2\u0001\u0000\u0000\u0000\u0004\u00b4\u0001\u0000"+
		"\u0000\u0000\u0006\u00b6\u0001\u0000\u0000\u0000\b\u00bd\u0001\u0000\u0000"+
		"\u0000\n\u00c3\u0001\u0000\u0000\u0000\f\u00d1\u0001\u0000\u0000\u0000"+
		"\u000e\u00da\u0001\u0000\u0000\u0000\u0010\u00dc\u0001\u0000\u0000\u0000"+
		"\u0012\u00e0\u0001\u0000\u0000\u0000\u0014\u00ea\u0001\u0000\u0000\u0000"+
		"\u0016\u00f9\u0001\u0000\u0000\u0000\u0018\u00fb\u0001\u0000\u0000\u0000"+
		"\u001a\u0101\u0001\u0000\u0000\u0000\u001c\u010f\u0001\u0000\u0000\u0000"+
		"\u001e\u0114\u0001\u0000\u0000\u0000 \u011b\u0001\u0000\u0000\u0000\""+
		"\u0120\u0001\u0000\u0000\u0000$\u0128\u0001\u0000\u0000\u0000&\u012c\u0001"+
		"\u0000\u0000\u0000(\u0131\u0001\u0000\u0000\u0000*\u0135\u0001\u0000\u0000"+
		"\u0000,\u0139\u0001\u0000\u0000\u0000.\u013b\u0001\u0000\u0000\u00000"+
		"\u0142\u0001\u0000\u0000\u00002\u0144\u0001\u0000\u0000\u00004\u0149\u0001"+
		"\u0000\u0000\u00006\u014d\u0001\u0000\u0000\u00008\u0155\u0001\u0000\u0000"+
		"\u0000:\u0160\u0001\u0000\u0000\u0000<\u0165\u0001\u0000\u0000\u0000>"+
		"\u0167\u0001\u0000\u0000\u0000@\u016f\u0001\u0000\u0000\u0000B\u0173\u0001"+
		"\u0000\u0000\u0000D\u0178\u0001\u0000\u0000\u0000F\u017a\u0001\u0000\u0000"+
		"\u0000H\u0181\u0001\u0000\u0000\u0000J\u018a\u0001\u0000\u0000\u0000L"+
		"\u0196\u0001\u0000\u0000\u0000N\u0198\u0001\u0000\u0000\u0000P\u01a0\u0001"+
		"\u0000\u0000\u0000R\u01a9\u0001\u0000\u0000\u0000T\u01ab\u0001\u0000\u0000"+
		"\u0000V\u01b4\u0001\u0000\u0000\u0000X\u01b9\u0001\u0000\u0000\u0000Z"+
		"\u01bb\u0001\u0000\u0000\u0000\\\u01c7\u0001\u0000\u0000\u0000^\u01c9"+
		"\u0001\u0000\u0000\u0000`\u01cd\u0001\u0000\u0000\u0000b\u01d7\u0001\u0000"+
		"\u0000\u0000d\u01d9\u0001\u0000\u0000\u0000f\u01dc\u0001\u0000\u0000\u0000"+
		"h\u01e0\u0001\u0000\u0000\u0000j\u01e6\u0001\u0000\u0000\u0000l\u01f3"+
		"\u0001\u0000\u0000\u0000n\u0200\u0001\u0000\u0000\u0000p\u0206\u0001\u0000"+
		"\u0000\u0000r\u0208\u0001\u0000\u0000\u0000t\u020e\u0001\u0000\u0000\u0000"+
		"v\u021d\u0001\u0000\u0000\u0000x\u0221\u0001\u0000\u0000\u0000z\u0225"+
		"\u0001\u0000\u0000\u0000|\u0227\u0001\u0000\u0000\u0000~\u0236\u0001\u0000"+
		"\u0000\u0000\u0080\u0238\u0001\u0000\u0000\u0000\u0082\u023a\u0001\u0000"+
		"\u0000\u0000\u0084\u023e\u0001\u0000\u0000\u0000\u0086\u024b\u0001\u0000"+
		"\u0000\u0000\u0088\u024d\u0001\u0000\u0000\u0000\u008a\u0251\u0001\u0000"+
		"\u0000\u0000\u008c\u025c\u0001\u0000\u0000\u0000\u008e\u0265\u0001\u0000"+
		"\u0000\u0000\u0090\u026e\u0001\u0000\u0000\u0000\u0092\u0272\u0001\u0000"+
		"\u0000\u0000\u0094\u0276\u0001\u0000\u0000\u0000\u0096\u028d\u0001\u0000"+
		"\u0000\u0000\u0098\u0291\u0001\u0000\u0000\u0000\u009a\u0296\u0001\u0000"+
		"\u0000\u0000\u009c\u0298\u0001\u0000\u0000\u0000\u009e\u029b\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0003 \u0010\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a3\u00ab\u0003p8\u0000\u00a4\u00a6\u0003\u0002\u0001\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a3\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0000\u0000\u0001\u00ad"+
		"\u0001\u0001\u0000\u0000\u0000\u00ae\u00b3\u0003\"\u0011\u0000\u00af\u00b3"+
		"\u0003\b\u0004\u0000\u00b0\u00b3\u0003\u0018\f\u0000\u00b1\u00b3\u0003"+
		"\u0006\u0003\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00af\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u0003\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\t\u0000\u0000\u00b5\u0005\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0002"+
		"\u0000\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00b9\u00059\u0000"+
		"\u0000\u00b9\u00ba\u0005*\u0000\u0000\u00ba\u00bb\u00030\u0018\u0000\u00bb"+
		"\u00bc\u0005;\u0000\u0000\u00bc\u0007\u0001\u0000\u0000\u0000\u00bd\u00bf"+
		"\u0003\n\u0005\u0000\u00be\u00c0\u0003\f\u0006\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0003\u0010\b\u0000\u00c2\t\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0002\u0000\u0000\u00c4\u00c5\u0005\n\u0000"+
		"\u0000\u00c5\u00c6\u00030\u0018\u0000\u00c6\u00c7\u0005;\u0000\u0000\u00c7"+
		"\u000b\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003\u000e\u0007\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003\u0014\n\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\u0014\n\u0000\u00d1\u00c9\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\r\u0001\u0000"+
		"\u0000\u0000\u00d3\u00db\u0003\b\u0004\u0000\u00d4\u00db\u0003\u0012\t"+
		"\u0000\u00d5\u00db\u0003\u0018\f\u0000\u00d6\u00db\u0003*\u0015\u0000"+
		"\u00d7\u00db\u0003p8\u0000\u00d8\u00db\u0003\u0004\u0002\u0000\u00d9\u00db"+
		"\u0003\u0006\u0003\u0000\u00da\u00d3\u0001\u0000\u0000\u0000\u00da\u00d4"+
		"\u0001\u0000\u0000\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00da\u00d6"+
		"\u0001\u0000\u0000\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u000f"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0002\u0000\u0000\u00dd\u00de"+
		"\u0005\u0011\u0000\u0000\u00de\u00df\u0005\u0014\u0000\u0000\u00df\u0011"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0002\u0000\u0000\u00e1\u00e2"+
		"\u0005\u000b\u0000\u0000\u00e2\u00e3\u00030\u0018\u0000\u00e3\u00e7\u0005"+
		";\u0000\u0000\u00e4\u00e6\u0003\u0016\u000b\u0000\u00e5\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u0013\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0002"+
		"\u0000\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec\u00f0\u0005\u0014"+
		"\u0000\u0000\u00ed\u00ef\u0003\u0016\u000b\u0000\u00ee\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u0015\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00fa\u0003\b\u0004"+
		"\u0000\u00f4\u00fa\u0003\u0018\f\u0000\u00f5\u00fa\u0003*\u0015\u0000"+
		"\u00f6\u00fa\u0003p8\u0000\u00f7\u00fa\u0003\u0004\u0002\u0000\u00f8\u00fa"+
		"\u0003\u0006\u0003\u0000\u00f9\u00f3\u0001\u0000\u0000\u0000\u00f9\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00f9\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u0017\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\u0003\u001a\r\u0000\u00fc\u00fe\u0003\u001e\u000f\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0003\u001c\u000e\u0000\u0100\u0019\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005\u0002\u0000\u0000\u0102\u0103\u0005"+
		"\f\u0000\u0000\u0103\u0108\u00059\u0000\u0000\u0104\u0105\u0005-\u0000"+
		"\u0000\u0105\u0107\u00059\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0005\'\u0000\u0000\u010c"+
		"\u010d\u00030\u0018\u0000\u010d\u010e\u0005;\u0000\u0000\u010e\u001b\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\u0002\u0000\u0000\u0110\u0111\u0005"+
		"\u0012\u0000\u0000\u0111\u0112\u0005\u0014\u0000\u0000\u0112\u001d\u0001"+
		"\u0000\u0000\u0000\u0113\u0115\u0003\u0016\u000b\u0000\u0114\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001"+
		"\u0000\u0000\u0000\u0118\u011a\u0003\u0014\n\u0000\u0119\u0118\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u001f\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0005\u0002\u0000\u0000\u011c\u011d\u0005\r\u0000"+
		"\u0000\u011d\u011e\u00058\u0000\u0000\u011e\u011f\u0005;\u0000\u0000\u011f"+
		"!\u0001\u0000\u0000\u0000\u0120\u0122\u0003&\u0013\u0000\u0121\u0123\u0003"+
		"$\u0012\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0003(\u0014"+
		"\u0000\u0125#\u0001\u0000\u0000\u0000\u0126\u0129\u0003\u0016\u000b\u0000"+
		"\u0127\u0129\u0003\"\u0011\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128"+
		"\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b"+
		"%\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0002\u0000\u0000\u012d\u012e"+
		"\u0005\u000e\u0000\u0000\u012e\u012f\u00059\u0000\u0000\u012f\u0130\u0005"+
		";\u0000\u0000\u0130\'\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0002"+
		"\u0000\u0000\u0132\u0133\u0005\u0013\u0000\u0000\u0133\u0134\u0005\u0014"+
		"\u0000\u0000\u0134)\u0001\u0000\u0000\u0000\u0135\u0136\u0003,\u0016\u0000"+
		"\u0136\u0137\u00030\u0018\u0000\u0137\u0138\u0003.\u0017\u0000\u0138+"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0007\u0000\u0000\u0000\u013a-\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005:\u0000\u0000\u013c/\u0001\u0000\u0000"+
		"\u0000\u013d\u013f\u00036\u001b\u0000\u013e\u0140\u00032\u0019\u0000\u013f"+
		"\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u0143\u0001\u0000\u0000\u0000\u0141\u0143\u00034\u001a\u0000\u0142\u013d"+
		"\u0001\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u01431\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0005(\u0000\u0000\u0145\u0146\u00030\u0018"+
		"\u0000\u0146\u0147\u0005/\u0000\u0000\u0147\u0148\u00030\u0018\u0000\u0148"+
		"3\u0001\u0000\u0000\u0000\u0149\u014a\u00036\u001b\u0000\u014a\u014b\u0005"+
		")\u0000\u0000\u014b\u014c\u00030\u0018\u0000\u014c5\u0001\u0000\u0000"+
		"\u0000\u014d\u0152\u00038\u001c\u0000\u014e\u014f\u0005\u001e\u0000\u0000"+
		"\u014f\u0151\u00038\u001c\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151"+
		"\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0001\u0000\u0000\u0000\u01537\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0155\u015a\u0003:\u001d\u0000\u0156\u0157\u0005"+
		"\u001d\u0000\u0000\u0157\u0159\u0003:\u001d\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b9\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u001f\u0000"+
		"\u0000\u015e\u0161\u0003:\u001d\u0000\u015f\u0161\u0003<\u001e\u0000\u0160"+
		"\u015d\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161"+
		";\u0001\u0000\u0000\u0000\u0162\u0166\u0003>\u001f\u0000\u0163\u0166\u0003"+
		"@ \u0000\u0164\u0166\u0003B!\u0000\u0165\u0162\u0001\u0000\u0000\u0000"+
		"\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000"+
		"\u0166=\u0001\u0000\u0000\u0000\u0167\u016d\u0003N\'\u0000\u0168\u016a"+
		"\u0005 \u0000\u0000\u0169\u016b\u0005\u001f\u0000\u0000\u016a\u0169\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016c\u016e\u00059\u0000\u0000\u016d\u0168\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e?\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0003F#\u0000\u0170\u0171\u0003D\"\u0000\u0171\u0172"+
		"\u0003F#\u0000\u0172A\u0001\u0000\u0000\u0000\u0173\u0176\u0003F#\u0000"+
		"\u0174\u0175\u0005\'\u0000\u0000\u0175\u0177\u0003F#\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177C\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0007\u0001\u0000\u0000\u0179E\u0001\u0000"+
		"\u0000\u0000\u017a\u017e\u0003N\'\u0000\u017b\u017d\u0003H$\u0000\u017c"+
		"\u017b\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e"+
		"\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f"+
		"G\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0005,\u0000\u0000\u0182\u0188\u00059\u0000\u0000\u0183\u0185\u00050"+
		"\u0000\u0000\u0184\u0186\u0003J%\u0000\u0185\u0184\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0189\u00051\u0000\u0000\u0188\u0183\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0001\u0000\u0000\u0000\u0189I\u0001\u0000\u0000\u0000\u018a\u018f"+
		"\u0003L&\u0000\u018b\u018c\u0005-\u0000\u0000\u018c\u018e\u0003L&\u0000"+
		"\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000"+
		"\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000"+
		"\u0190K\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192"+
		"\u0197\u00030\u0018\u0000\u0193\u0194\u00059\u0000\u0000\u0194\u0195\u0005"+
		"*\u0000\u0000\u0195\u0197\u00030\u0018\u0000\u0196\u0192\u0001\u0000\u0000"+
		"\u0000\u0196\u0193\u0001\u0000\u0000\u0000\u0197M\u0001\u0000\u0000\u0000"+
		"\u0198\u019d\u0003P(\u0000\u0199\u019a\u0005+\u0000\u0000\u019a\u019c"+
		"\u0003P(\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000"+
		"\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"+
		"\u0000\u0000\u019eO\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a6\u0003T*\u0000\u01a1\u01a2\u0003R)\u0000\u01a2\u01a3"+
		"\u0003T*\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7Q\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0007\u0002\u0000"+
		"\u0000\u01aaS\u0001\u0000\u0000\u0000\u01ab\u01b1\u0003X,\u0000\u01ac"+
		"\u01ad\u0003V+\u0000\u01ad\u01ae\u0003X,\u0000\u01ae\u01b0\u0001\u0000"+
		"\u0000\u0000\u01af\u01ac\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b2U\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0007\u0003\u0000\u0000\u01b5W\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0007\u0002\u0000\u0000\u01b7\u01ba\u0003X,\u0000\u01b8\u01ba"+
		"\u0003Z-\u0000\u01b9\u01b6\u0001\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01baY\u0001\u0000\u0000\u0000\u01bb\u01be\u0003`0\u0000"+
		"\u01bc\u01bd\u0005\u001c\u0000\u0000\u01bd\u01bf\u0003X,\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf[\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c8\u00059\u0000\u0000\u01c1\u01c8\u00057\u0000"+
		"\u0000\u01c2\u01c8\u00056\u0000\u0000\u01c3\u01c8\u00058\u0000\u0000\u01c4"+
		"\u01c8\u0003^/\u0000\u01c5\u01c8\u0003j5\u0000\u01c6\u01c8\u0003l6\u0000"+
		"\u01c7\u01c0\u0001\u0000\u0000\u0000\u01c7\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c2\u0001\u0000\u0000\u0000\u01c7\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8]\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u00050\u0000\u0000\u01ca\u01cb\u00030\u0018\u0000\u01cb\u01cc\u0005"+
		"1\u0000\u0000\u01cc_\u0001\u0000\u0000\u0000\u01cd\u01d1\u0003\\.\u0000"+
		"\u01ce\u01d0\u0003b1\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d2a\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d8\u0003d2\u0000\u01d5\u01d8\u0003f3\u0000"+
		"\u01d6\u01d8\u0003h4\u0000\u01d7\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8c\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0005.\u0000\u0000\u01da\u01db\u00059\u0000"+
		"\u0000\u01dbe\u0001\u0000\u0000\u0000\u01dc\u01dd\u00052\u0000\u0000\u01dd"+
		"\u01de\u00030\u0018\u0000\u01de\u01df\u00053\u0000\u0000\u01dfg\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e2\u00050\u0000\u0000\u01e1\u01e3\u0003J%"+
		"\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u00051\u0000\u0000"+
		"\u01e5i\u0001\u0000\u0000\u0000\u01e6\u01ef\u00052\u0000\u0000\u01e7\u01ec"+
		"\u00030\u0018\u0000\u01e8\u01e9\u0005-\u0000\u0000\u01e9\u01eb\u00030"+
		"\u0018\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ef\u01e7\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u00053\u0000"+
		"\u0000\u01f2k\u0001\u0000\u0000\u0000\u01f3\u01fc\u00054\u0000\u0000\u01f4"+
		"\u01f9\u0003n7\u0000\u01f5\u01f6\u0005-\u0000\u0000\u01f6\u01f8\u0003"+
		"n7\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fc\u01f4\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u00055\u0000\u0000"+
		"\u01ffm\u0001\u0000\u0000\u0000\u0200\u0201\u00030\u0018\u0000\u0201\u0202"+
		"\u0005/\u0000\u0000\u0202\u0203\u00030\u0018\u0000\u0203o\u0001\u0000"+
		"\u0000\u0000\u0204\u0207\u0003r9\u0000\u0205\u0207\u0003z=\u0000\u0206"+
		"\u0204\u0001\u0000\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207"+
		"q\u0001\u0000\u0000\u0000\u0208\u020a\u0003t:\u0000\u0209\u020b\u0003"+
		"v;\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0003x<\u0000\u020d"+
		"s\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u0007\u0000\u0000\u020f\u0213"+
		"\u0005>\u0000\u0000\u0210\u0212\u0003~?\u0000\u0211\u0210\u0001\u0000"+
		"\u0000\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000"+
		"\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u0217\u0005L\u0000"+
		"\u0000\u0217u\u0001\u0000\u0000\u0000\u0218\u021e\u0003p8\u0000\u0219"+
		"\u021e\u0003\u008eG\u0000\u021a\u021e\u0003*\u0015\u0000\u021b\u021e\u0003"+
		"\u0002\u0001\u0000\u021c\u021e\u0003\u0004\u0002\u0000\u021d\u0218\u0001"+
		"\u0000\u0000\u0000\u021d\u0219\u0001\u0000\u0000\u0000\u021d\u021a\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021c\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u021d\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220w\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0005\u0006\u0000\u0000\u0222\u0223\u0005@\u0000"+
		"\u0000\u0223\u0224\u0005A\u0000\u0000\u0224y\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0003|>\u0000\u0226{\u0001\u0000\u0000\u0000\u0227\u0228\u0005"+
		"\u0007\u0000\u0000\u0228\u022c\u0005>\u0000\u0000\u0229\u022b\u0003~?"+
		"\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000"+
		"\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0005M\u0000\u0000\u0230}\u0001\u0000\u0000\u0000\u0231"+
		"\u0237\u0003\u008aE\u0000\u0232\u0237\u0003\u0080@\u0000\u0233\u0237\u0003"+
		"\u0084B\u0000\u0234\u0237\u0003\u0082A\u0000\u0235\u0237\u0003*\u0015"+
		"\u0000\u0236\u0231\u0001\u0000\u0000\u0000\u0236\u0232\u0001\u0000\u0000"+
		"\u0000\u0236\u0233\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0237\u007f\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0005I\u0000\u0000\u0239\u0081\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0005I\u0000\u0000\u023b\u023c\u0005J\u0000\u0000\u023c\u023d"+
		"\u0005P\u0000\u0000\u023d\u0083\u0001\u0000\u0000\u0000\u023e\u023f\u0005"+
		"I\u0000\u0000\u023f\u0240\u0005J\u0000\u0000\u0240\u0244\u0005O\u0000"+
		"\u0000\u0241\u0243\u0003\u0086C\u0000\u0242\u0241\u0001\u0000\u0000\u0000"+
		"\u0243\u0246\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000"+
		"\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0247\u0001\u0000\u0000\u0000"+
		"\u0246\u0244\u0001\u0000\u0000\u0000\u0247\u0248\u0005T\u0000\u0000\u0248"+
		"\u0085\u0001\u0000\u0000\u0000\u0249\u024c\u0005S\u0000\u0000\u024a\u024c"+
		"\u0003\u0088D\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024a\u0001"+
		"\u0000\u0000\u0000\u024c\u0087\u0001\u0000\u0000\u0000\u024d\u024e\u0005"+
		"R\u0000\u0000\u024e\u024f\u00030\u0018\u0000\u024f\u0250\u0005:\u0000"+
		"\u0000\u0250\u0089\u0001\u0000\u0000\u0000\u0251\u0252\u0005H\u0000\u0000"+
		"\u0252\u0253\u0005_\u0000\u0000\u0253\u0257\u0005`\u0000\u0000\u0254\u0256"+
		"\u0003\u008cF\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256\u0259\u0001"+
		"\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001"+
		"\u0000\u0000\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0257\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0005h\u0000\u0000\u025b\u008b\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0005f\u0000\u0000\u025d\u025f\u0005g\u0000\u0000"+
		"\u025e\u0260\u0005j\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0005k\u0000\u0000\u0264\u008d\u0001\u0000\u0000\u0000\u0265\u0269"+
		"\u0003\u0090H\u0000\u0266\u0268\u0003\u0094J\u0000\u0267\u0266\u0001\u0000"+
		"\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026c\u0001\u0000"+
		"\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026d\u0003\u0092"+
		"I\u0000\u026d\u008f\u0001\u0000\u0000\u0000\u026e\u026f\u0005\u0007\u0000"+
		"\u0000\u026f\u0270\u0005=\u0000\u0000\u0270\u0271\u0005C\u0000\u0000\u0271"+
		"\u0091\u0001\u0000\u0000\u0000\u0272\u0273\u0005V\u0000\u0000\u0273\u0274"+
		"\u0005E\u0000\u0000\u0274\u0275\u0005F\u0000\u0000\u0275\u0093\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0003\u0096K\u0000\u0277\u027b\u0005\\\u0000"+
		"\u0000\u0278\u027a\u0003\u009eO\u0000\u0279\u0278\u0001\u0000\u0000\u0000"+
		"\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000"+
		"\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000\u0000"+
		"\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u027f\u0005d\u0000\u0000\u027f"+
		"\u0095\u0001\u0000\u0000\u0000\u0280\u028e\u0003\u0098L\u0000\u0281\u0283"+
		"\u0003\u0098L\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0283\u0284\u0001"+
		"\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001"+
		"\u0000\u0000\u0000\u0285\u028e\u0001\u0000\u0000\u0000\u0286\u0289\u0003"+
		"\u0098L\u0000\u0287\u0288\u0005[\u0000\u0000\u0288\u028a\u0003\u0098L"+
		"\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000"+
		"\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000"+
		"\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u0280\u0001\u0000\u0000"+
		"\u0000\u028d\u0282\u0001\u0000\u0000\u0000\u028d\u0286\u0001\u0000\u0000"+
		"\u0000\u028e\u0097\u0001\u0000\u0000\u0000\u028f\u0292\u0003\u009aM\u0000"+
		"\u0290\u0292\u0003\u009cN\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0291"+
		"\u0290\u0001\u0000\u0000\u0000\u0292\u0099\u0001\u0000\u0000\u0000\u0293"+
		"\u0297\u0005W\u0000\u0000\u0294\u0297\u0005X\u0000\u0000\u0295\u0297\u0005"+
		"Y\u0000\u0000\u0296\u0293\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000"+
		"\u0000\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0297\u009b\u0001\u0000"+
		"\u0000\u0000\u0298\u0299\u0003\u009aM\u0000\u0299\u029a\u0005Z\u0000\u0000"+
		"\u029a\u009d\u0001\u0000\u0000\u0000\u029b\u029c\u0005b\u0000\u0000\u029c"+
		"\u029e\u0005c\u0000\u0000\u029d\u029f\u0005j\u0000\u0000\u029e\u029d\u0001"+
		"\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u029e\u0001"+
		"\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0005k\u0000\u0000\u02a3\u009f\u0001\u0000"+
		"\u0000\u0000A\u00a1\u00a7\u00aa\u00b2\u00bf\u00cb\u00ce\u00d1\u00da\u00e7"+
		"\u00f0\u00f9\u00fd\u0108\u0116\u0119\u0122\u0128\u012a\u013f\u0142\u0152"+
		"\u015a\u0160\u0165\u016a\u016d\u0176\u017e\u0185\u0188\u018f\u0196\u019d"+
		"\u01a6\u01b1\u01b9\u01be\u01c7\u01d1\u01d7\u01e2\u01ec\u01ef\u01f9\u01fc"+
		"\u0206\u020a\u0213\u021d\u021f\u022c\u0236\u0244\u024b\u0257\u0261\u0269"+
		"\u027b\u0284\u028b\u028d\u0291\u0296\u02a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}