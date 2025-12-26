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
		FOR=12, EXTENDS=13, BLOCK=14, ELSE=15, ENDIF=16, ENDFOR=17, ENDBLOCK=18, 
		J_STMNT_END=19, J_STMNT_WS=20, MULT=21, PLUS=22, MINUS=23, DIV=24, FLOORDIV=25, 
		MOD=26, POW=27, AND=28, OR=29, NOT=30, IS=31, EQ=32, NEQ=33, GT=34, GE=35, 
		LT=36, LE=37, IN=38, QMARK=39, ELVIS=40, ASSIGN=41, TILDE=42, PIPELINE=43, 
		COMMA=44, DOT=45, COLON=46, LPAREN=47, RPAREN=48, LSB=49, RSB=50, LBRACE=51, 
		RBRACE=52, FLOAT=53, INT=54, STRING=55, ID=56, J_EXPR_END=57, J_EXPR_STMNT_END=58, 
		EXPRESSION_MODE_WS=59, STYLE_TAG_START_NAME=60, START_TAG_NAME=61, START_TAG_WS=62, 
		END_TAG_NAME=63, END_TAG_CLOSE=64, END_TAG_MODE_WS=65, STYLE_TAG_START_CLOSE=66, 
		STYLE_START_TAG_MODE_WS=67, STYLE_END_TAG_NAME=68, STYLE_END_TAG_CLOSE=69, 
		STYLE_END_TAG_MODE_WS=70, STYLE_ATTR=71, ATTR_NAME=72, ATTR_EQ=73, INSIDE_START_TAG_J_EXPR_OPEN=74, 
		START_TAG_CLOSE=75, SELF_CLOSING_TAG_CLOSE=76, INSIDE_START_TAG_MODE_WS=77, 
		ATTR_DQUOTE_START=78, ATTR_VALUE_UNQUOTED=79, ATTR_VAL_WS=80, ATTR_VAL_J_EXPR_START=81, 
		ATTR_VAL_TEXT=82, ATTR_DQUOTE_END=83, ATTR_VAL_QOUTED_WS=84, CLOSE_STYLE_START=85, 
		CSS_SEL_ID=86, CSS_SEL_CLASS=87, CSS_SEL_ELEM=88, CSS_SEL_STATE=89, CSS_SEL_COMMA=90, 
		CSS_LBRACE=91, STYLE_EXIT_RAB=92, CSS_WS=93, CSS_INLINE_EQ=94, CSS_INLINE_DQUOT_START=95, 
		CSS_INLINE_WS=96, BLK_PROP_NAME=97, BLK_COLON=98, BLK_RBRACE=99, BLK_WS=100, 
		CSS_INLINE_PROP_NAME=101, CSS_INLINE_PROP_COLON=102, CSS_INLINE_PROP_DQUOT_END=103, 
		CSS_INLINE_PROP_WS=104, CSS_PROP_VAL=105, CSS_PROP_SEMICOLON=106, CSS_PROP_VALUES_WS=107;
	public static final int
		RULE_template = 0, RULE_jinjaBlock = 1, RULE_templateText = 2, RULE_ifBlock = 3, 
		RULE_ifStatmentStart = 4, RULE_ifBody = 5, RULE_ifStatmentEnd = 6, RULE_elifBlock = 7, 
		RULE_elseBlock = 8, RULE_subBlock = 9, RULE_forBlock = 10, RULE_forStartStatement = 11, 
		RULE_forEndStatement = 12, RULE_forBody = 13, RULE_extendsBlock = 14, 
		RULE_inheritBlock = 15, RULE_inheritBlockStart = 16, RULE_inheritBlockEnd = 17, 
		RULE_jinjaExpression = 18, RULE_jinjaExprStart = 19, RULE_jinjaExprEnd = 20, 
		RULE_expression = 21, RULE_ternaryExt = 22, RULE_defaultExpr = 23, RULE_orExpr = 24, 
		RULE_andExpr = 25, RULE_notExpr = 26, RULE_compareExpr = 27, RULE_compExpr = 28, 
		RULE_inExpr = 29, RULE_comparisonOperator = 30, RULE_pipeExpr = 31, RULE_filter = 32, 
		RULE_argumentList = 33, RULE_argument = 34, RULE_concatExpr = 35, RULE_addExpr = 36, 
		RULE_addExprOptor = 37, RULE_mulExpr = 38, RULE_mulExprOptor = 39, RULE_unaryExpr = 40, 
		RULE_powExpr = 41, RULE_atom = 42, RULE_parenthedExpr = 43, RULE_primary = 44, 
		RULE_trailer = 45, RULE_memberTrailer = 46, RULE_subTrailer = 47, RULE_callTrailer = 48, 
		RULE_list = 49, RULE_dict = 50, RULE_pair = 51, RULE_htmlElement = 52, 
		RULE_htmlRegularElement = 53, RULE_htmlStartTag = 54, RULE_htmlElementBody = 55, 
		RULE_htmlEndTag = 56, RULE_htmlSelfClosingElement = 57, RULE_htmlSelfClosingTag = 58, 
		RULE_htmlTagAttr = 59, RULE_booleanAttr = 60, RULE_attrWithUnquotedVal = 61, 
		RULE_attrWithQuotedVal = 62, RULE_jinjaAttrVal = 63, RULE_styleAttr = 64, 
		RULE_inlineStyleProp = 65, RULE_htmlStyleElem = 66, RULE_htmlStyleElemOpenTag = 67, 
		RULE_htmlStyleElemCloseTag = 68, RULE_cssBlockDecl = 69, RULE_cssSel = 70, 
		RULE_cssSelWithState = 71, RULE_cssSelectors = 72, RULE_cssBlock = 73, 
		RULE_cssPropDecl = 74, RULE_cssBlockPropVal = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "jinjaBlock", "templateText", "ifBlock", "ifStatmentStart", 
			"ifBody", "ifStatmentEnd", "elifBlock", "elseBlock", "subBlock", "forBlock", 
			"forStartStatement", "forEndStatement", "forBody", "extendsBlock", "inheritBlock", 
			"inheritBlockStart", "inheritBlockEnd", "jinjaExpression", "jinjaExprStart", 
			"jinjaExprEnd", "expression", "ternaryExt", "defaultExpr", "orExpr", 
			"andExpr", "notExpr", "compareExpr", "compExpr", "inExpr", "comparisonOperator", 
			"pipeExpr", "filter", "argumentList", "argument", "concatExpr", "addExpr", 
			"addExprOptor", "mulExpr", "mulExprOptor", "unaryExpr", "powExpr", "atom", 
			"parenthedExpr", "primary", "trailer", "memberTrailer", "subTrailer", 
			"callTrailer", "list", "dict", "pair", "htmlElement", "htmlRegularElement", 
			"htmlStartTag", "htmlElementBody", "htmlEndTag", "htmlSelfClosingElement", 
			"htmlSelfClosingTag", "htmlTagAttr", "booleanAttr", "attrWithUnquotedVal", 
			"attrWithQuotedVal", "jinjaAttrVal", "styleAttr", "inlineStyleProp", 
			"htmlStyleElem", "htmlStyleElemOpenTag", "htmlStyleElemCloseTag", "cssBlockDecl", 
			"cssSel", "cssSelWithState", "cssSelectors", "cssBlock", "cssPropDecl", 
			"cssBlockPropVal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{%'", null, "'<!DOCTYPE html>'", null, null, null, null, 
			null, "'if'", "'elif'", "'for'", "'extends'", "'block'", "'else'", "'endif'", 
			"'endfor'", "'endblock'", null, null, "'*'", "'+'", "'-'", "'/'", "'//'", 
			"'%'", "'**'", "'and'", "'or'", "'not'", "'is'", "'=='", "'!='", null, 
			"'>='", null, "'<='", "'in'", "'?'", "'??'", "'='", "'~'", "'|'", "','", 
			"'.'", "':'", "'('", "')'", "'['", "']'", null, null, null, null, null, 
			null, "'}}'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "J_EXPR_START", "J_STMNT_START", "J_COMMENT", "DOCTYPE", "HTML_COMMENT", 
			"CLOSE_TAG_START", "START_TAG_OPEN", "WS", "NORMAL_TEXT", "IF", "ELIF", 
			"FOR", "EXTENDS", "BLOCK", "ELSE", "ENDIF", "ENDFOR", "ENDBLOCK", "J_STMNT_END", 
			"J_STMNT_WS", "MULT", "PLUS", "MINUS", "DIV", "FLOORDIV", "MOD", "POW", 
			"AND", "OR", "NOT", "IS", "EQ", "NEQ", "GT", "GE", "LT", "LE", "IN", 
			"QMARK", "ELVIS", "ASSIGN", "TILDE", "PIPELINE", "COMMA", "DOT", "COLON", 
			"LPAREN", "RPAREN", "LSB", "RSB", "LBRACE", "RBRACE", "FLOAT", "INT", 
			"STRING", "ID", "J_EXPR_END", "J_EXPR_STMNT_END", "EXPRESSION_MODE_WS", 
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(152);
				extendsBlock();
				}
				break;
			}
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_TAG_OPEN:
				{
				setState(155);
				htmlElement();
				}
				break;
			case EOF:
			case J_STMNT_START:
				{
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J_STMNT_START) {
					{
					{
					setState(156);
					jinjaBlock();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				inheritBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				forBlock();
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
			setState(171);
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
		enterRule(_localctx, 6, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			ifStatmentStart();
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(174);
				ifBody();
				}
				break;
			}
			setState(177);
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
		enterRule(_localctx, 8, RULE_ifStatmentStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(J_STMNT_START);
			setState(180);
			match(IF);
			setState(181);
			expression();
			setState(182);
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
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<ElifBlockContext> elifBlock() {
			return getRuleContexts(ElifBlockContext.class);
		}
		public ElifBlockContext elifBlock(int i) {
			return getRuleContext(ElifBlockContext.class,i);
		}
		public List<ForBlockContext> forBlock() {
			return getRuleContexts(ForBlockContext.class);
		}
		public ForBlockContext forBlock(int i) {
			return getRuleContext(ForBlockContext.class,i);
		}
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TemplateTextContext> templateText() {
			return getRuleContexts(TemplateTextContext.class);
		}
		public TemplateTextContext templateText(int i) {
			return getRuleContext(TemplateTextContext.class,i);
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
		enterRule(_localctx, 10, RULE_ifBody);
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(190);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(184);
							ifBlock();
							}
							break;
						case 2:
							{
							setState(185);
							elifBlock();
							}
							break;
						case 3:
							{
							setState(186);
							forBlock();
							}
							break;
						case 4:
							{
							setState(187);
							jinjaExpression();
							}
							break;
						case 5:
							{
							setState(188);
							htmlElement();
							}
							break;
						case 6:
							{
							setState(189);
							templateText();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(192); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(194);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
		enterRule(_localctx, 12, RULE_ifStatmentEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(J_STMNT_START);
			setState(201);
			match(ENDIF);
			setState(202);
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
		enterRule(_localctx, 14, RULE_elifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(J_STMNT_START);
			setState(205);
			match(ELIF);
			setState(206);
			expression();
			setState(207);
			match(J_EXPR_STMNT_END);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					subBlock();
					}
					} 
				}
				setState(213);
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
		enterRule(_localctx, 16, RULE_elseBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(J_STMNT_START);
			setState(215);
			match(ELSE);
			setState(216);
			match(J_STMNT_END);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					subBlock();
					}
					} 
				}
				setState(222);
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
		enterRule(_localctx, 18, RULE_subBlock);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				forBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				jinjaExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				htmlElement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				templateText();
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
		enterRule(_localctx, 20, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			forStartStatement();
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(231);
				forBody();
				}
				break;
			}
			setState(234);
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
		enterRule(_localctx, 22, RULE_forStartStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(J_STMNT_START);
			setState(237);
			match(FOR);
			setState(238);
			match(ID);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(239);
				match(COMMA);
				setState(240);
				match(ID);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(IN);
			setState(247);
			expression();
			setState(248);
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
		enterRule(_localctx, 24, RULE_forEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(J_STMNT_START);
			setState(251);
			match(ENDFOR);
			setState(252);
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
		enterRule(_localctx, 26, RULE_forBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(254);
					subBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(257); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(259);
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
		enterRule(_localctx, 28, RULE_extendsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(J_STMNT_START);
			setState(263);
			match(EXTENDS);
			setState(264);
			match(STRING);
			setState(265);
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
		public List<SubBlockContext> subBlock() {
			return getRuleContexts(SubBlockContext.class);
		}
		public SubBlockContext subBlock(int i) {
			return getRuleContext(SubBlockContext.class,i);
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
		enterRule(_localctx, 30, RULE_inheritBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			inheritBlockStart();
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(268);
					subBlock();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(274);
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
		enterRule(_localctx, 32, RULE_inheritBlockStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(J_STMNT_START);
			setState(277);
			match(BLOCK);
			setState(278);
			match(ID);
			setState(279);
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
		enterRule(_localctx, 34, RULE_inheritBlockEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(J_STMNT_START);
			setState(282);
			match(ENDBLOCK);
			setState(283);
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
		enterRule(_localctx, 36, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			jinjaExprStart();
			setState(286);
			expression();
			setState(287);
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
		enterRule(_localctx, 38, RULE_jinjaExprStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		enterRule(_localctx, 40, RULE_jinjaExprEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				orExpr();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QMARK) {
					{
					setState(294);
					ternaryExt();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
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
		enterRule(_localctx, 44, RULE_ternaryExt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(QMARK);
			setState(301);
			expression();
			setState(302);
			match(COLON);
			setState(303);
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
		enterRule(_localctx, 46, RULE_defaultExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			orExpr();
			setState(306);
			match(ELVIS);
			setState(307);
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
		enterRule(_localctx, 48, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			andExpr();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(310);
				match(OR);
				setState(311);
				andExpr();
				}
				}
				setState(316);
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
		enterRule(_localctx, 50, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			notExpr();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(318);
				match(AND);
				setState(319);
				notExpr();
				}
				}
				setState(324);
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
		enterRule(_localctx, 52, RULE_notExpr);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(NOT);
				setState(326);
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
				setState(327);
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
		public ConcatExprContext concatExpr() {
			return getRuleContext(ConcatExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(templateParser.IS, 0); }
		public TerminalNode ID() { return getToken(templateParser.ID, 0); }
		public TerminalNode NOT() { return getToken(templateParser.NOT, 0); }
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
		enterRule(_localctx, 54, RULE_compareExpr);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				concatExpr();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(331);
					match(IS);
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(332);
						match(NOT);
						}
					}

					setState(335);
					match(ID);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				compExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
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
		enterRule(_localctx, 56, RULE_compExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			pipeExpr();
			setState(343);
			comparisonOperator();
			setState(344);
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
		enterRule(_localctx, 58, RULE_inExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			pipeExpr();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(347);
				match(IN);
				setState(348);
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
		enterRule(_localctx, 60, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_pipeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			concatExpr();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPELINE) {
				{
				{
				setState(354);
				filter();
				}
				}
				setState(359);
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
		enterRule(_localctx, 64, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(PIPELINE);
			setState(361);
			match(ID);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(362);
				match(LPAREN);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138063477162901504L) != 0)) {
					{
					setState(363);
					argumentList();
					}
				}

				setState(366);
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
		enterRule(_localctx, 66, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			argument();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(370);
				match(COMMA);
				setState(371);
				argument();
				}
				}
				setState(376);
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
		enterRule(_localctx, 68, RULE_argument);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(ID);
				setState(379);
				match(ASSIGN);
				setState(380);
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
		enterRule(_localctx, 70, RULE_concatExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			addExpr();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TILDE) {
				{
				{
				setState(384);
				match(TILDE);
				setState(385);
				addExpr();
				}
				}
				setState(390);
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
		enterRule(_localctx, 72, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			mulExpr();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(392);
				addExprOptor();
				setState(393);
				mulExpr();
				}
				}
				setState(399);
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
		enterRule(_localctx, 74, RULE_addExprOptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		enterRule(_localctx, 76, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			unaryExpr();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 119537664L) != 0)) {
				{
				{
				setState(403);
				mulExprOptor();
				setState(404);
				unaryExpr();
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
		enterRule(_localctx, 78, RULE_mulExprOptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 119537664L) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_unaryExpr);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(414);
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
				setState(415);
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
		enterRule(_localctx, 82, RULE_powExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			primary();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(419);
				match(POW);
				setState(420);
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
		enterRule(_localctx, 84, RULE_atom);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				match(STRING);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				parenthedExpr();
				}
				break;
			case LSB:
				enterOuterAlt(_localctx, 6);
				{
				setState(428);
				list();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(429);
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
		enterRule(_localctx, 86, RULE_parenthedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(LPAREN);
			setState(433);
			expression();
			setState(434);
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
		enterRule(_localctx, 88, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			atom();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 738871813865472L) != 0)) {
				{
				{
				setState(437);
				trailer();
				}
				}
				setState(442);
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
		enterRule(_localctx, 90, RULE_trailer);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				memberTrailer();
				}
				break;
			case LSB:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				subTrailer();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
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
		enterRule(_localctx, 92, RULE_memberTrailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(DOT);
			setState(449);
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
		enterRule(_localctx, 94, RULE_subTrailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(LSB);
			setState(452);
			expression();
			setState(453);
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
		enterRule(_localctx, 96, RULE_callTrailer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(LPAREN);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138063477162901504L) != 0)) {
				{
				setState(456);
				argumentList();
				}
			}

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
		enterRule(_localctx, 98, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(LSB);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138063477162901504L) != 0)) {
				{
				setState(462);
				expression();
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(463);
					match(COMMA);
					setState(464);
					expression();
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(472);
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
		enterRule(_localctx, 100, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(LBRACE);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138063477162901504L) != 0)) {
				{
				setState(475);
				pair();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(476);
					match(COMMA);
					setState(477);
					pair();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(485);
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
		enterRule(_localctx, 102, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			expression();
			setState(488);
			match(COLON);
			setState(489);
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
		enterRule(_localctx, 104, RULE_htmlElement);
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				htmlRegularElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
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
		enterRule(_localctx, 106, RULE_htmlRegularElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			htmlStartTag();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 646L) != 0) || _la==INSIDE_START_TAG_J_EXPR_OPEN) {
				{
				setState(496);
				htmlElementBody();
				}
			}

			setState(499);
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
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
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
		enterRule(_localctx, 108, RULE_htmlStartTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(START_TAG_OPEN);
			setState(502);
			match(START_TAG_NAME);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 11L) != 0)) {
				{
				setState(505);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STYLE_ATTR:
				case ATTR_NAME:
					{
					setState(503);
					htmlTagAttr();
					}
					break;
				case J_EXPR_START:
				case INSIDE_START_TAG_J_EXPR_OPEN:
					{
					setState(504);
					jinjaExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
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
		enterRule(_localctx, 110, RULE_htmlElementBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(512);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(513);
					htmlStyleElem();
					}
					break;
				case 3:
					{
					setState(514);
					jinjaExpression();
					}
					break;
				case 4:
					{
					setState(515);
					jinjaBlock();
					}
					break;
				case 5:
					{
					setState(516);
					templateText();
					}
					break;
				}
				}
				setState(519); 
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
		enterRule(_localctx, 112, RULE_htmlEndTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(CLOSE_TAG_START);
			setState(522);
			match(END_TAG_NAME);
			setState(523);
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
		enterRule(_localctx, 114, RULE_htmlSelfClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
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
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
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
		enterRule(_localctx, 116, RULE_htmlSelfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(START_TAG_OPEN);
			setState(528);
			match(START_TAG_NAME);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 11L) != 0)) {
				{
				setState(531);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STYLE_ATTR:
				case ATTR_NAME:
					{
					setState(529);
					htmlTagAttr();
					}
					break;
				case J_EXPR_START:
				case INSIDE_START_TAG_J_EXPR_OPEN:
					{
					setState(530);
					jinjaExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
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
		enterRule(_localctx, 118, RULE_htmlTagAttr);
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				styleAttr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				booleanAttr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				attrWithQuotedVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				attrWithUnquotedVal();
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
		enterRule(_localctx, 120, RULE_booleanAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
		enterRule(_localctx, 122, RULE_attrWithUnquotedVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(ATTR_NAME);
			setState(547);
			match(ATTR_EQ);
			setState(548);
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
		public List<TerminalNode> ATTR_VAL_TEXT() { return getTokens(templateParser.ATTR_VAL_TEXT); }
		public TerminalNode ATTR_VAL_TEXT(int i) {
			return getToken(templateParser.ATTR_VAL_TEXT, i);
		}
		public List<JinjaAttrValContext> jinjaAttrVal() {
			return getRuleContexts(JinjaAttrValContext.class);
		}
		public JinjaAttrValContext jinjaAttrVal(int i) {
			return getRuleContext(JinjaAttrValContext.class,i);
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
		enterRule(_localctx, 124, RULE_attrWithQuotedVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(ATTR_NAME);
			setState(551);
			match(ATTR_EQ);
			setState(552);
			match(ATTR_DQUOTE_START);
			setState(555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(555);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ATTR_VAL_TEXT:
					{
					setState(553);
					match(ATTR_VAL_TEXT);
					}
					break;
				case ATTR_VAL_J_EXPR_START:
					{
					setState(554);
					jinjaAttrVal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTR_VAL_J_EXPR_START || _la==ATTR_VAL_TEXT );
			setState(559);
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
		enterRule(_localctx, 126, RULE_jinjaAttrVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(ATTR_VAL_J_EXPR_START);
			setState(562);
			expression();
			setState(563);
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
		enterRule(_localctx, 128, RULE_styleAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(STYLE_ATTR);
			setState(566);
			match(CSS_INLINE_EQ);
			setState(567);
			match(CSS_INLINE_DQUOT_START);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_INLINE_PROP_NAME) {
				{
				{
				setState(568);
				inlineStyleProp();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
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
		enterRule(_localctx, 130, RULE_inlineStyleProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(CSS_INLINE_PROP_NAME);
			setState(577);
			match(CSS_INLINE_PROP_COLON);
			setState(579); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(578);
				match(CSS_PROP_VAL);
				}
				}
				setState(581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(583);
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
		public List<CssBlockDeclContext> cssBlockDecl() {
			return getRuleContexts(CssBlockDeclContext.class);
		}
		public CssBlockDeclContext cssBlockDecl(int i) {
			return getRuleContext(CssBlockDeclContext.class,i);
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
		enterRule(_localctx, 132, RULE_htmlStyleElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			htmlStyleElemOpenTag();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 7L) != 0)) {
				{
				{
				setState(586);
				cssBlockDecl();
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
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
		enterRule(_localctx, 134, RULE_htmlStyleElemOpenTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(START_TAG_OPEN);
			setState(595);
			match(STYLE_TAG_START_NAME);
			setState(596);
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
		enterRule(_localctx, 136, RULE_htmlStyleElemCloseTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(CLOSE_STYLE_START);
			setState(599);
			match(STYLE_END_TAG_NAME);
			setState(600);
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
	public static class CssBlockDeclContext extends ParserRuleContext {
		public CssSelectorsContext cssSelectors() {
			return getRuleContext(CssSelectorsContext.class,0);
		}
		public CssBlockContext cssBlock() {
			return getRuleContext(CssBlockContext.class,0);
		}
		public CssBlockDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlockDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCssBlockDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCssBlockDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCssBlockDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockDeclContext cssBlockDecl() throws RecognitionException {
		CssBlockDeclContext _localctx = new CssBlockDeclContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cssBlockDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			cssSelectors();
			setState(603);
			cssBlock();
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
	public static class CssSelContext extends ParserRuleContext {
		public CssSelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSel; }
	 
		public CssSelContext() { }
		public void copyFrom(CssSelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SEL_IDContext extends CssSelContext {
		public TerminalNode CSS_SEL_ID() { return getToken(templateParser.CSS_SEL_ID, 0); }
		public CSS_SEL_IDContext(CssSelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SEL_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SEL_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SEL_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SEL_CLASSContext extends CssSelContext {
		public TerminalNode CSS_SEL_CLASS() { return getToken(templateParser.CSS_SEL_CLASS, 0); }
		public CSS_SEL_CLASSContext(CssSelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SEL_CLASS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SEL_CLASS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SEL_CLASS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SEL_ELEMContext extends CssSelContext {
		public TerminalNode CSS_SEL_ELEM() { return getToken(templateParser.CSS_SEL_ELEM, 0); }
		public CSS_SEL_ELEMContext(CssSelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SEL_ELEM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SEL_ELEM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SEL_ELEM(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SEL_PSEUDO_CLASSContext extends CssSelContext {
		public CssSelWithStateContext cssSelWithState() {
			return getRuleContext(CssSelWithStateContext.class,0);
		}
		public CSS_SEL_PSEUDO_CLASSContext(CssSelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SEL_PSEUDO_CLASS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SEL_PSEUDO_CLASS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SEL_PSEUDO_CLASS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelContext cssSel() throws RecognitionException {
		CssSelContext _localctx = new CssSelContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cssSel);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new CSS_SEL_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(CSS_SEL_ID);
				}
				break;
			case 2:
				_localctx = new CSS_SEL_CLASSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(CSS_SEL_CLASS);
				}
				break;
			case 3:
				_localctx = new CSS_SEL_ELEMContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				match(CSS_SEL_ELEM);
				}
				break;
			case 4:
				_localctx = new CSS_SEL_PSEUDO_CLASSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				cssSelWithState();
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
	public static class CssSelWithStateContext extends ParserRuleContext {
		public TerminalNode CSS_SEL_STATE() { return getToken(templateParser.CSS_SEL_STATE, 0); }
		public TerminalNode CSS_SEL_ID() { return getToken(templateParser.CSS_SEL_ID, 0); }
		public TerminalNode CSS_SEL_CLASS() { return getToken(templateParser.CSS_SEL_CLASS, 0); }
		public TerminalNode CSS_SEL_ELEM() { return getToken(templateParser.CSS_SEL_ELEM, 0); }
		public CssSelWithStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelWithState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCssSelWithState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCssSelWithState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCssSelWithState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelWithStateContext cssSelWithState() throws RecognitionException {
		CssSelWithStateContext _localctx = new CssSelWithStateContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cssSelWithState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(612);
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
	public static class CssSelectorsContext extends ParserRuleContext {
		public CssSelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectors; }
	 
		public CssSelectorsContext() { }
		public void copyFrom(CssSelectorsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SEL_SINGLEContext extends CssSelectorsContext {
		public CssSelContext cssSel() {
			return getRuleContext(CssSelContext.class,0);
		}
		public CSS_SEL_SINGLEContext(CssSelectorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SEL_SINGLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SEL_SINGLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SEL_SINGLE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SEL_GROUPContext extends CssSelectorsContext {
		public List<CssSelContext> cssSel() {
			return getRuleContexts(CssSelContext.class);
		}
		public CssSelContext cssSel(int i) {
			return getRuleContext(CssSelContext.class,i);
		}
		public List<TerminalNode> CSS_SEL_COMMA() { return getTokens(templateParser.CSS_SEL_COMMA); }
		public TerminalNode CSS_SEL_COMMA(int i) {
			return getToken(templateParser.CSS_SEL_COMMA, i);
		}
		public CSS_SEL_GROUPContext(CssSelectorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SEL_GROUP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SEL_GROUP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SEL_GROUP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SEL_DESCENDENTContext extends CssSelectorsContext {
		public List<CssSelContext> cssSel() {
			return getRuleContexts(CssSelContext.class);
		}
		public CssSelContext cssSel(int i) {
			return getRuleContext(CssSelContext.class,i);
		}
		public CSS_SEL_DESCENDENTContext(CssSelectorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SEL_DESCENDENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SEL_DESCENDENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SEL_DESCENDENT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorsContext cssSelectors() throws RecognitionException {
		CssSelectorsContext _localctx = new CssSelectorsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cssSelectors);
		int _la;
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new CSS_SEL_SINGLEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				cssSel();
				}
				break;
			case 2:
				_localctx = new CSS_SEL_DESCENDENTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(616); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(615);
					cssSel();
					}
					}
					setState(618); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 7L) != 0) );
				}
				break;
			case 3:
				_localctx = new CSS_SEL_GROUPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				cssSel();
				setState(623); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(621);
					match(CSS_SEL_COMMA);
					setState(622);
					cssSel();
					}
					}
					setState(625); 
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
	public static class CssBlockContext extends ParserRuleContext {
		public TerminalNode CSS_LBRACE() { return getToken(templateParser.CSS_LBRACE, 0); }
		public TerminalNode BLK_RBRACE() { return getToken(templateParser.BLK_RBRACE, 0); }
		public List<CssPropDeclContext> cssPropDecl() {
			return getRuleContexts(CssPropDeclContext.class);
		}
		public CssPropDeclContext cssPropDecl(int i) {
			return getRuleContext(CssPropDeclContext.class,i);
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
		enterRule(_localctx, 146, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(CSS_LBRACE);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLK_PROP_NAME) {
				{
				{
				setState(630);
				cssPropDecl();
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636);
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
	public static class CssPropDeclContext extends ParserRuleContext {
		public TerminalNode BLK_PROP_NAME() { return getToken(templateParser.BLK_PROP_NAME, 0); }
		public TerminalNode BLK_COLON() { return getToken(templateParser.BLK_COLON, 0); }
		public CssBlockPropValContext cssBlockPropVal() {
			return getRuleContext(CssBlockPropValContext.class,0);
		}
		public CssPropDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssPropDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCssPropDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCssPropDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCssPropDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropDeclContext cssPropDecl() throws RecognitionException {
		CssPropDeclContext _localctx = new CssPropDeclContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_cssPropDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(BLK_PROP_NAME);
			setState(639);
			match(BLK_COLON);
			setState(640);
			cssBlockPropVal();
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
	public static class CssBlockPropValContext extends ParserRuleContext {
		public TerminalNode CSS_PROP_SEMICOLON() { return getToken(templateParser.CSS_PROP_SEMICOLON, 0); }
		public List<TerminalNode> CSS_PROP_VAL() { return getTokens(templateParser.CSS_PROP_VAL); }
		public TerminalNode CSS_PROP_VAL(int i) {
			return getToken(templateParser.CSS_PROP_VAL, i);
		}
		public CssBlockPropValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlockPropVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCssBlockPropVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCssBlockPropVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCssBlockPropVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockPropValContext cssBlockPropVal() throws RecognitionException {
		CssBlockPropValContext _localctx = new CssBlockPropValContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_cssBlockPropVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(642);
				match(CSS_PROP_VAL);
				}
				}
				setState(645); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(647);
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
		"\u0004\u0001k\u028a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0001\u0000\u0003\u0000\u009a\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u009e\b\u0000\n\u0000\f\u0000\u00a1\t\u0000\u0003\u0000\u00a3"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00aa\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00b0\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00bf\b\u0005\u000b\u0005\f"+
		"\u0005\u00c0\u0001\u0005\u0003\u0005\u00c4\b\u0005\u0001\u0005\u0003\u0005"+
		"\u00c7\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d2\b\u0007"+
		"\n\u0007\f\u0007\u00d5\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u00db\b\b\n\b\f\b\u00de\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00e5\b\t\u0001\n\u0001\n\u0003\n\u00e9\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f2\b\u000b"+
		"\n\u000b\f\u000b\u00f5\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\r\u0100\b\r\u000b"+
		"\r\f\r\u0101\u0001\r\u0003\r\u0105\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u010e\b\u000f"+
		"\n\u000f\f\u000f\u0111\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0128\b\u0015\u0001\u0015\u0003\u0015\u012b\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0139\b\u0018\n\u0018\f\u0018\u013c\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0141\b\u0019\n\u0019\f\u0019\u0144\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0149\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u014e\b\u001b\u0001\u001b\u0003\u001b\u0151\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0155\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u015e\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0164\b\u001f\n\u001f\f\u001f\u0167\t\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u016d\b \u0001 \u0003 \u0170\b \u0001!\u0001!\u0001!\u0005"+
		"!\u0175\b!\n!\f!\u0178\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u017e"+
		"\b\"\u0001#\u0001#\u0001#\u0005#\u0183\b#\n#\f#\u0186\t#\u0001$\u0001"+
		"$\u0001$\u0001$\u0005$\u018c\b$\n$\f$\u018f\t$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0005&\u0197\b&\n&\f&\u019a\t&\u0001\'\u0001\'\u0001("+
		"\u0001(\u0001(\u0003(\u01a1\b(\u0001)\u0001)\u0001)\u0003)\u01a6\b)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01af\b*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0005,\u01b7\b,\n,\f,\u01ba\t,\u0001-\u0001"+
		"-\u0001-\u0003-\u01bf\b-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00030\u01ca\b0\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00051\u01d2\b1\n1\f1\u01d5\t1\u00031\u01d7\b1\u00011\u00011\u00012"+
		"\u00012\u00012\u00012\u00052\u01df\b2\n2\f2\u01e2\t2\u00032\u01e4\b2\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u00034\u01ee\b4\u0001"+
		"5\u00015\u00035\u01f2\b5\u00015\u00015\u00016\u00016\u00016\u00016\u0005"+
		"6\u01fa\b6\n6\f6\u01fd\t6\u00016\u00016\u00017\u00017\u00017\u00017\u0001"+
		"7\u00047\u0206\b7\u000b7\f7\u0207\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0005:\u0214\b:\n:\f:\u0217\t:\u0001:\u0001"+
		":\u0001;\u0001;\u0001;\u0001;\u0003;\u021f\b;\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0004>\u022c\b>\u000b"+
		">\f>\u022d\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0005@\u023a\b@\n@\f@\u023d\t@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0004A\u0244\bA\u000bA\fA\u0245\u0001A\u0001A\u0001B\u0001B\u0005B\u024c"+
		"\bB\nB\fB\u024f\tB\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001D\u0001"+
		"D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0003"+
		"F\u0262\bF\u0001G\u0001G\u0001G\u0001H\u0001H\u0004H\u0269\bH\u000bH\f"+
		"H\u026a\u0001H\u0001H\u0001H\u0004H\u0270\bH\u000bH\fH\u0271\u0003H\u0274"+
		"\bH\u0001I\u0001I\u0005I\u0278\bI\nI\fI\u027b\tI\u0001I\u0001I\u0001J"+
		"\u0001J\u0001J\u0001J\u0001K\u0004K\u0284\bK\u000bK\fK\u0285\u0001K\u0001"+
		"K\u0001K\u0000\u0000L\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0000\u0005\u0002\u0000\u0001\u0001JJ\u0001\u0000 "+
		"%\u0001\u0000\u0016\u0017\u0002\u0000\u0015\u0015\u0018\u001a\u0001\u0000"+
		"VX\u0294\u0000\u0099\u0001\u0000\u0000\u0000\u0002\u00a9\u0001\u0000\u0000"+
		"\u0000\u0004\u00ab\u0001\u0000\u0000\u0000\u0006\u00ad\u0001\u0000\u0000"+
		"\u0000\b\u00b3\u0001\u0000\u0000\u0000\n\u00c6\u0001\u0000\u0000\u0000"+
		"\f\u00c8\u0001\u0000\u0000\u0000\u000e\u00cc\u0001\u0000\u0000\u0000\u0010"+
		"\u00d6\u0001\u0000\u0000\u0000\u0012\u00e4\u0001\u0000\u0000\u0000\u0014"+
		"\u00e6\u0001\u0000\u0000\u0000\u0016\u00ec\u0001\u0000\u0000\u0000\u0018"+
		"\u00fa\u0001\u0000\u0000\u0000\u001a\u00ff\u0001\u0000\u0000\u0000\u001c"+
		"\u0106\u0001\u0000\u0000\u0000\u001e\u010b\u0001\u0000\u0000\u0000 \u0114"+
		"\u0001\u0000\u0000\u0000\"\u0119\u0001\u0000\u0000\u0000$\u011d\u0001"+
		"\u0000\u0000\u0000&\u0121\u0001\u0000\u0000\u0000(\u0123\u0001\u0000\u0000"+
		"\u0000*\u012a\u0001\u0000\u0000\u0000,\u012c\u0001\u0000\u0000\u0000."+
		"\u0131\u0001\u0000\u0000\u00000\u0135\u0001\u0000\u0000\u00002\u013d\u0001"+
		"\u0000\u0000\u00004\u0148\u0001\u0000\u0000\u00006\u0154\u0001\u0000\u0000"+
		"\u00008\u0156\u0001\u0000\u0000\u0000:\u015a\u0001\u0000\u0000\u0000<"+
		"\u015f\u0001\u0000\u0000\u0000>\u0161\u0001\u0000\u0000\u0000@\u0168\u0001"+
		"\u0000\u0000\u0000B\u0171\u0001\u0000\u0000\u0000D\u017d\u0001\u0000\u0000"+
		"\u0000F\u017f\u0001\u0000\u0000\u0000H\u0187\u0001\u0000\u0000\u0000J"+
		"\u0190\u0001\u0000\u0000\u0000L\u0192\u0001\u0000\u0000\u0000N\u019b\u0001"+
		"\u0000\u0000\u0000P\u01a0\u0001\u0000\u0000\u0000R\u01a2\u0001\u0000\u0000"+
		"\u0000T\u01ae\u0001\u0000\u0000\u0000V\u01b0\u0001\u0000\u0000\u0000X"+
		"\u01b4\u0001\u0000\u0000\u0000Z\u01be\u0001\u0000\u0000\u0000\\\u01c0"+
		"\u0001\u0000\u0000\u0000^\u01c3\u0001\u0000\u0000\u0000`\u01c7\u0001\u0000"+
		"\u0000\u0000b\u01cd\u0001\u0000\u0000\u0000d\u01da\u0001\u0000\u0000\u0000"+
		"f\u01e7\u0001\u0000\u0000\u0000h\u01ed\u0001\u0000\u0000\u0000j\u01ef"+
		"\u0001\u0000\u0000\u0000l\u01f5\u0001\u0000\u0000\u0000n\u0205\u0001\u0000"+
		"\u0000\u0000p\u0209\u0001\u0000\u0000\u0000r\u020d\u0001\u0000\u0000\u0000"+
		"t\u020f\u0001\u0000\u0000\u0000v\u021e\u0001\u0000\u0000\u0000x\u0220"+
		"\u0001\u0000\u0000\u0000z\u0222\u0001\u0000\u0000\u0000|\u0226\u0001\u0000"+
		"\u0000\u0000~\u0231\u0001\u0000\u0000\u0000\u0080\u0235\u0001\u0000\u0000"+
		"\u0000\u0082\u0240\u0001\u0000\u0000\u0000\u0084\u0249\u0001\u0000\u0000"+
		"\u0000\u0086\u0252\u0001\u0000\u0000\u0000\u0088\u0256\u0001\u0000\u0000"+
		"\u0000\u008a\u025a\u0001\u0000\u0000\u0000\u008c\u0261\u0001\u0000\u0000"+
		"\u0000\u008e\u0263\u0001\u0000\u0000\u0000\u0090\u0273\u0001\u0000\u0000"+
		"\u0000\u0092\u0275\u0001\u0000\u0000\u0000\u0094\u027e\u0001\u0000\u0000"+
		"\u0000\u0096\u0283\u0001\u0000\u0000\u0000\u0098\u009a\u0003\u001c\u000e"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u00a2\u0001\u0000\u0000\u0000\u009b\u00a3\u0003h4\u0000\u009c"+
		"\u009e\u0003\u0002\u0001\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2"+
		"\u009f\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0000\u0000\u0001\u00a5\u0001\u0001\u0000\u0000\u0000\u00a6"+
		"\u00aa\u0003\u001e\u000f\u0000\u00a7\u00aa\u0003\u0006\u0003\u0000\u00a8"+
		"\u00aa\u0003\u0014\n\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u0003"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\t\u0000\u0000\u00ac\u0005\u0001"+
		"\u0000\u0000\u0000\u00ad\u00af\u0003\b\u0004\u0000\u00ae\u00b0\u0003\n"+
		"\u0005\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\f\u0006"+
		"\u0000\u00b2\u0007\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0002\u0000"+
		"\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6\u0003*\u0015\u0000"+
		"\u00b6\u00b7\u0005:\u0000\u0000\u00b7\t\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bf\u0003\u0006\u0003\u0000\u00b9\u00bf\u0003\u000e\u0007\u0000\u00ba"+
		"\u00bf\u0003\u0014\n\u0000\u00bb\u00bf\u0003$\u0012\u0000\u00bc\u00bf"+
		"\u0003h4\u0000\u00bd\u00bf\u0003\u0004\u0002\u0000\u00be\u00b8\u0001\u0000"+
		"\u0000\u0000\u00be\u00b9\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000"+
		"\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003\u0010"+
		"\b\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\u0010\b\u0000"+
		"\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u000b\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0002\u0000\u0000"+
		"\u00c9\u00ca\u0005\u0010\u0000\u0000\u00ca\u00cb\u0005\u0013\u0000\u0000"+
		"\u00cb\r\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0002\u0000\u0000\u00cd"+
		"\u00ce\u0005\u000b\u0000\u0000\u00ce\u00cf\u0003*\u0015\u0000\u00cf\u00d3"+
		"\u0005:\u0000\u0000\u00d0\u00d2\u0003\u0012\t\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u000f\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"\u0002\u0000\u0000\u00d7\u00d8\u0005\u000f\u0000\u0000\u00d8\u00dc\u0005"+
		"\u0013\u0000\u0000\u00d9\u00db\u0003\u0012\t\u0000\u00da\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u0011\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e5\u0003\u0006"+
		"\u0003\u0000\u00e0\u00e5\u0003\u0014\n\u0000\u00e1\u00e5\u0003$\u0012"+
		"\u0000\u00e2\u00e5\u0003h4\u0000\u00e3\u00e5\u0003\u0004\u0002\u0000\u00e4"+
		"\u00df\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u0013\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0003\u0016\u000b\u0000\u00e7\u00e9\u0003\u001a\r\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003\u0018\f\u0000\u00eb\u0015\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005\u0002\u0000\u0000\u00ed\u00ee\u0005"+
		"\f\u0000\u0000\u00ee\u00f3\u00058\u0000\u0000\u00ef\u00f0\u0005,\u0000"+
		"\u0000\u00f0\u00f2\u00058\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005&\u0000\u0000\u00f7"+
		"\u00f8\u0003*\u0015\u0000\u00f8\u00f9\u0005:\u0000\u0000\u00f9\u0017\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005\u0002\u0000\u0000\u00fb\u00fc\u0005"+
		"\u0011\u0000\u0000\u00fc\u00fd\u0005\u0013\u0000\u0000\u00fd\u0019\u0001"+
		"\u0000\u0000\u0000\u00fe\u0100\u0003\u0012\t\u0000\u00ff\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000"+
		"\u0000\u0000\u0103\u0105\u0003\u0010\b\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u001b\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005\u0002\u0000\u0000\u0107\u0108\u0005\r\u0000\u0000"+
		"\u0108\u0109\u00057\u0000\u0000\u0109\u010a\u0005:\u0000\u0000\u010a\u001d"+
		"\u0001\u0000\u0000\u0000\u010b\u010f\u0003 \u0010\u0000\u010c\u010e\u0003"+
		"\u0012\t\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0003\"\u0011\u0000\u0113\u001f\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0005\u0002\u0000\u0000\u0115\u0116\u0005\u000e\u0000"+
		"\u0000\u0116\u0117\u00058\u0000\u0000\u0117\u0118\u0005:\u0000\u0000\u0118"+
		"!\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0002\u0000\u0000\u011a\u011b"+
		"\u0005\u0012\u0000\u0000\u011b\u011c\u0005\u0013\u0000\u0000\u011c#\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0003&\u0013\u0000\u011e\u011f\u0003*\u0015"+
		"\u0000\u011f\u0120\u0003(\u0014\u0000\u0120%\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0007\u0000\u0000\u0000\u0122\'\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u00059\u0000\u0000\u0124)\u0001\u0000\u0000\u0000\u0125\u0127\u00030"+
		"\u0018\u0000\u0126\u0128\u0003,\u0016\u0000\u0127\u0126\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000"+
		"\u0000\u0129\u012b\u0003.\u0017\u0000\u012a\u0125\u0001\u0000\u0000\u0000"+
		"\u012a\u0129\u0001\u0000\u0000\u0000\u012b+\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005\'\u0000\u0000\u012d\u012e\u0003*\u0015\u0000\u012e\u012f"+
		"\u0005.\u0000\u0000\u012f\u0130\u0003*\u0015\u0000\u0130-\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u00030\u0018\u0000\u0132\u0133\u0005(\u0000\u0000"+
		"\u0133\u0134\u0003*\u0015\u0000\u0134/\u0001\u0000\u0000\u0000\u0135\u013a"+
		"\u00032\u0019\u0000\u0136\u0137\u0005\u001d\u0000\u0000\u0137\u0139\u0003"+
		"2\u0019\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b1\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000"+
		"\u0000\u013d\u0142\u00034\u001a\u0000\u013e\u013f\u0005\u001c\u0000\u0000"+
		"\u013f\u0141\u00034\u001a\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141"+
		"\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u01433\u0001\u0000\u0000\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u001e\u0000\u0000\u0146\u0149"+
		"\u00034\u001a\u0000\u0147\u0149\u00036\u001b\u0000\u0148\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u01495\u0001\u0000\u0000"+
		"\u0000\u014a\u0150\u0003F#\u0000\u014b\u014d\u0005\u001f\u0000\u0000\u014c"+
		"\u014e\u0005\u001e\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u0151\u00058\u0000\u0000\u0150\u014b\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0155\u0001\u0000\u0000\u0000\u0152\u0155"+
		"\u00038\u001c\u0000\u0153\u0155\u0003:\u001d\u0000\u0154\u014a\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000"+
		"\u0000\u0000\u01557\u0001\u0000\u0000\u0000\u0156\u0157\u0003>\u001f\u0000"+
		"\u0157\u0158\u0003<\u001e\u0000\u0158\u0159\u0003>\u001f\u0000\u01599"+
		"\u0001\u0000\u0000\u0000\u015a\u015d\u0003>\u001f\u0000\u015b\u015c\u0005"+
		"&\u0000\u0000\u015c\u015e\u0003>\u001f\u0000\u015d\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e;\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0007\u0001\u0000\u0000\u0160=\u0001\u0000\u0000\u0000\u0161"+
		"\u0165\u0003F#\u0000\u0162\u0164\u0003@ \u0000\u0163\u0162\u0001\u0000"+
		"\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166?\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0169\u0005+\u0000\u0000"+
		"\u0169\u016f\u00058\u0000\u0000\u016a\u016c\u0005/\u0000\u0000\u016b\u016d"+
		"\u0003B!\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0170\u00050\u0000"+
		"\u0000\u016f\u016a\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170A\u0001\u0000\u0000\u0000\u0171\u0176\u0003D\"\u0000\u0172"+
		"\u0173\u0005,\u0000\u0000\u0173\u0175\u0003D\"\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177C\u0001\u0000"+
		"\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017e\u0003*\u0015"+
		"\u0000\u017a\u017b\u00058\u0000\u0000\u017b\u017c\u0005)\u0000\u0000\u017c"+
		"\u017e\u0003*\u0015\u0000\u017d\u0179\u0001\u0000\u0000\u0000\u017d\u017a"+
		"\u0001\u0000\u0000\u0000\u017eE\u0001\u0000\u0000\u0000\u017f\u0184\u0003"+
		"H$\u0000\u0180\u0181\u0005*\u0000\u0000\u0181\u0183\u0003H$\u0000\u0182"+
		"\u0180\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
		"G\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u018d"+
		"\u0003L&\u0000\u0188\u0189\u0003J%\u0000\u0189\u018a\u0003L&\u0000\u018a"+
		"\u018c\u0001\u0000\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018c"+
		"\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0001\u0000\u0000\u0000\u018eI\u0001\u0000\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0007\u0002\u0000\u0000\u0191K\u0001"+
		"\u0000\u0000\u0000\u0192\u0198\u0003P(\u0000\u0193\u0194\u0003N\'\u0000"+
		"\u0194\u0195\u0003P(\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0193"+
		"\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199M\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019c\u0007"+
		"\u0003\u0000\u0000\u019cO\u0001\u0000\u0000\u0000\u019d\u019e\u0007\u0002"+
		"\u0000\u0000\u019e\u01a1\u0003P(\u0000\u019f\u01a1\u0003R)\u0000\u01a0"+
		"\u019d\u0001\u0000\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"Q\u0001\u0000\u0000\u0000\u01a2\u01a5\u0003X,\u0000\u01a3\u01a4\u0005"+
		"\u001b\u0000\u0000\u01a4\u01a6\u0003P(\u0000\u01a5\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6S\u0001\u0000\u0000\u0000"+
		"\u01a7\u01af\u00058\u0000\u0000\u01a8\u01af\u00056\u0000\u0000\u01a9\u01af"+
		"\u00055\u0000\u0000\u01aa\u01af\u00057\u0000\u0000\u01ab\u01af\u0003V"+
		"+\u0000\u01ac\u01af\u0003b1\u0000\u01ad\u01af\u0003d2\u0000\u01ae\u01a7"+
		"\u0001\u0000\u0000\u0000\u01ae\u01a8\u0001\u0000\u0000\u0000\u01ae\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ae\u01aa\u0001\u0000\u0000\u0000\u01ae\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01ad"+
		"\u0001\u0000\u0000\u0000\u01afU\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005"+
		"/\u0000\u0000\u01b1\u01b2\u0003*\u0015\u0000\u01b2\u01b3\u00050\u0000"+
		"\u0000\u01b3W\u0001\u0000\u0000\u0000\u01b4\u01b8\u0003T*\u0000\u01b5"+
		"\u01b7\u0003Z-\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b9Y\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bf\u0003\\.\u0000\u01bc\u01bf\u0003^/\u0000\u01bd"+
		"\u01bf\u0003`0\u0000\u01be\u01bb\u0001\u0000\u0000\u0000\u01be\u01bc\u0001"+
		"\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf[\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0005-\u0000\u0000\u01c1\u01c2\u00058\u0000\u0000"+
		"\u01c2]\u0001\u0000\u0000\u0000\u01c3\u01c4\u00051\u0000\u0000\u01c4\u01c5"+
		"\u0003*\u0015\u0000\u01c5\u01c6\u00052\u0000\u0000\u01c6_\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c9\u0005/\u0000\u0000\u01c8\u01ca\u0003B!\u0000"+
		"\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u00050\u0000\u0000\u01cc"+
		"a\u0001\u0000\u0000\u0000\u01cd\u01d6\u00051\u0000\u0000\u01ce\u01d3\u0003"+
		"*\u0015\u0000\u01cf\u01d0\u0005,\u0000\u0000\u01d0\u01d2\u0003*\u0015"+
		"\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d6\u01ce\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u00052\u0000\u0000"+
		"\u01d9c\u0001\u0000\u0000\u0000\u01da\u01e3\u00053\u0000\u0000\u01db\u01e0"+
		"\u0003f3\u0000\u01dc\u01dd\u0005,\u0000\u0000\u01dd\u01df\u0003f3\u0000"+
		"\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e3\u01db\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u00054\u0000\u0000\u01e6"+
		"e\u0001\u0000\u0000\u0000\u01e7\u01e8\u0003*\u0015\u0000\u01e8\u01e9\u0005"+
		".\u0000\u0000\u01e9\u01ea\u0003*\u0015\u0000\u01eag\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ee\u0003j5\u0000\u01ec\u01ee\u0003r9\u0000\u01ed\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01eei\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f1\u0003l6\u0000\u01f0\u01f2\u0003n7\u0000"+
		"\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4\u0003p8\u0000\u01f4k"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\u0007\u0000\u0000\u01f6\u01fb"+
		"\u0005=\u0000\u0000\u01f7\u01fa\u0003v;\u0000\u01f8\u01fa\u0003$\u0012"+
		"\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005K\u0000\u0000"+
		"\u01ffm\u0001\u0000\u0000\u0000\u0200\u0206\u0003h4\u0000\u0201\u0206"+
		"\u0003\u0084B\u0000\u0202\u0206\u0003$\u0012\u0000\u0203\u0206\u0003\u0002"+
		"\u0001\u0000\u0204\u0206\u0003\u0004\u0002\u0000\u0205\u0200\u0001\u0000"+
		"\u0000\u0000\u0205\u0201\u0001\u0000\u0000\u0000\u0205\u0202\u0001\u0000"+
		"\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0204\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208o\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0005\u0006\u0000\u0000\u020a\u020b\u0005?\u0000\u0000"+
		"\u020b\u020c\u0005@\u0000\u0000\u020cq\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0003t:\u0000\u020es\u0001\u0000\u0000\u0000\u020f\u0210\u0005\u0007"+
		"\u0000\u0000\u0210\u0215\u0005=\u0000\u0000\u0211\u0214\u0003v;\u0000"+
		"\u0212\u0214\u0003$\u0012\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0212\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215"+
		"\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u0218\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0005L\u0000\u0000\u0219u\u0001\u0000\u0000\u0000\u021a\u021f\u0003"+
		"\u0080@\u0000\u021b\u021f\u0003x<\u0000\u021c\u021f\u0003|>\u0000\u021d"+
		"\u021f\u0003z=\u0000\u021e\u021a\u0001\u0000\u0000\u0000\u021e\u021b\u0001"+
		"\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021d\u0001"+
		"\u0000\u0000\u0000\u021fw\u0001\u0000\u0000\u0000\u0220\u0221\u0005H\u0000"+
		"\u0000\u0221y\u0001\u0000\u0000\u0000\u0222\u0223\u0005H\u0000\u0000\u0223"+
		"\u0224\u0005I\u0000\u0000\u0224\u0225\u0005O\u0000\u0000\u0225{\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0005H\u0000\u0000\u0227\u0228\u0005I\u0000"+
		"\u0000\u0228\u022b\u0005N\u0000\u0000\u0229\u022c\u0005R\u0000\u0000\u022a"+
		"\u022c\u0003~?\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022a\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022b\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0005S\u0000\u0000\u0230}\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0005Q\u0000\u0000\u0232\u0233\u0003*\u0015\u0000\u0233"+
		"\u0234\u00059\u0000\u0000\u0234\u007f\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0005G\u0000\u0000\u0236\u0237\u0005^\u0000\u0000\u0237\u023b\u0005_"+
		"\u0000\u0000\u0238\u023a\u0003\u0082A\u0000\u0239\u0238\u0001\u0000\u0000"+
		"\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023e\u0001\u0000\u0000"+
		"\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u023f\u0005g\u0000\u0000"+
		"\u023f\u0081\u0001\u0000\u0000\u0000\u0240\u0241\u0005e\u0000\u0000\u0241"+
		"\u0243\u0005f\u0000\u0000\u0242\u0244\u0005i\u0000\u0000\u0243\u0242\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0243\u0001"+
		"\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001"+
		"\u0000\u0000\u0000\u0247\u0248\u0005j\u0000\u0000\u0248\u0083\u0001\u0000"+
		"\u0000\u0000\u0249\u024d\u0003\u0086C\u0000\u024a\u024c\u0003\u008aE\u0000"+
		"\u024b\u024a\u0001\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000"+
		"\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000"+
		"\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0003\u0088D\u0000\u0251\u0085\u0001\u0000\u0000\u0000\u0252"+
		"\u0253\u0005\u0007\u0000\u0000\u0253\u0254\u0005<\u0000\u0000\u0254\u0255"+
		"\u0005B\u0000\u0000\u0255\u0087\u0001\u0000\u0000\u0000\u0256\u0257\u0005"+
		"U\u0000\u0000\u0257\u0258\u0005D\u0000\u0000\u0258\u0259\u0005E\u0000"+
		"\u0000\u0259\u0089\u0001\u0000\u0000\u0000\u025a\u025b\u0003\u0090H\u0000"+
		"\u025b\u025c\u0003\u0092I\u0000\u025c\u008b\u0001\u0000\u0000\u0000\u025d"+
		"\u0262\u0005V\u0000\u0000\u025e\u0262\u0005W\u0000\u0000\u025f\u0262\u0005"+
		"X\u0000\u0000\u0260\u0262\u0003\u008eG\u0000\u0261\u025d\u0001\u0000\u0000"+
		"\u0000\u0261\u025e\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000"+
		"\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262\u008d\u0001\u0000\u0000"+
		"\u0000\u0263\u0264\u0007\u0004\u0000\u0000\u0264\u0265\u0005Y\u0000\u0000"+
		"\u0265\u008f\u0001\u0000\u0000\u0000\u0266\u0274\u0003\u008cF\u0000\u0267"+
		"\u0269\u0003\u008cF\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269\u026a"+
		"\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0001\u0000\u0000\u0000\u026b\u0274\u0001\u0000\u0000\u0000\u026c\u026f"+
		"\u0003\u008cF\u0000\u026d\u026e\u0005Z\u0000\u0000\u026e\u0270\u0003\u008c"+
		"F\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000"+
		"\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000"+
		"\u0000\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0266\u0001\u0000\u0000"+
		"\u0000\u0273\u0268\u0001\u0000\u0000\u0000\u0273\u026c\u0001\u0000\u0000"+
		"\u0000\u0274\u0091\u0001\u0000\u0000\u0000\u0275\u0279\u0005[\u0000\u0000"+
		"\u0276\u0278\u0003\u0094J\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0278"+
		"\u027b\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0001\u0000\u0000\u0000\u027a\u027c\u0001\u0000\u0000\u0000\u027b"+
		"\u0279\u0001\u0000\u0000\u0000\u027c\u027d\u0005c\u0000\u0000\u027d\u0093"+
		"\u0001\u0000\u0000\u0000\u027e\u027f\u0005a\u0000\u0000\u027f\u0280\u0005"+
		"b\u0000\u0000\u0280\u0281\u0003\u0096K\u0000\u0281\u0095\u0001\u0000\u0000"+
		"\u0000\u0282\u0284\u0005i\u0000\u0000\u0283\u0282\u0001\u0000\u0000\u0000"+
		"\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000"+
		"\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0005j\u0000\u0000\u0288\u0097\u0001\u0000\u0000\u0000@\u0099"+
		"\u009f\u00a2\u00a9\u00af\u00be\u00c0\u00c3\u00c6\u00d3\u00dc\u00e4\u00e8"+
		"\u00f3\u0101\u0104\u010f\u0127\u012a\u013a\u0142\u0148\u014d\u0150\u0154"+
		"\u015d\u0165\u016c\u016f\u0176\u017d\u0184\u018d\u0198\u01a0\u01a5\u01ae"+
		"\u01b8\u01be\u01c9\u01d3\u01d6\u01e0\u01e3\u01ed\u01f1\u01f9\u01fb\u0205"+
		"\u0207\u0213\u0215\u021e\u022b\u022d\u023b\u0245\u024d\u0261\u026a\u0271"+
		"\u0273\u0279\u0285";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}