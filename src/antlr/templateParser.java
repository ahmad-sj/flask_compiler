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
		J_EXPR_START=1, J_STMNT_START=2, J_COMMENT=3, CLOSE_TAG_START=4, HTML_COMMENT=5, 
		DOCTYPE=6, START_TAG_OPEN=7, WS=8, NORMAL_TEXT=9, J_STMNT_IF=10, J_STMNT_ELIF=11, 
		J_STMNT_ELSE=12, J_STMNT_ENDIF=13, J_STMNT_FOR=14, J_STMNT_ENDFOR=15, 
		J_STMNT_EXTENDS=16, J_STMNT_BLOCK=17, J_STMNT_ENDBLOCK=18, J_STMNT_END=19, 
		J_STMNT_WS=20, J_CONDITION_NOT=21, J_CONDITION_VAR_NAME=22, J_CONDITION_PRIMITIVE=23, 
		J_COND_PRIM_AND=24, J_COND_PRIM_OR=25, J_COND_PRIM_COMP_OPTOR=26, J_CONDITION_SUBSTATEMENT_START=27, 
		J_CONDITION_END=28, J_CONDITION_MODE_WS=29, J_CONDITION_ELSE_END=30, J_CONDITION_ELSE_WS=31, 
		J_TEST_VALUE=32, J_TEST_MODE_WS=33, J_LOOP_END=34, J_LOOP_ITERABLE=35, 
		J_LOOP_MODE_WS=36, J_LOOP_KEYWORD=37, J_VARIABLES_COMMA=38, J_LOOP_VARIABLE=39, 
		J_LOOP_VARIABLES_WS=40, J_EXTENDS_STRING=41, J_EXTENDS_END=42, J_EXTENDS_MODE_WS=43, 
		J_INHERIT_BLOCK_NAME=44, J_BLOCK_MODE_WS=45, J_EXPR_END=46, J_FORMAT_STRING=47, 
		J_EXPR_PIPELINE=48, J_EXPR_ID=49, J_EXPR_MODE_WS=50, J_ID_DOT=51, J_ID_LSB=52, 
		J_FUNC_LPAREN=53, J_FUNC_RPAREN=54, J_ID_COMMA=55, J_COND_ID_IS=56, J_COND_ID_AND=57, 
		J_COND_ID_OR=58, J_COND_ID_COMP_OPTOR=59, J_ID_EXPR_END=60, J_ID_END=61, 
		J_ID_MODE_WS=62, J_DICT_VAR_RSB=63, J_DICT_KEY=64, J_DICT_VAR_MODE_WS=65, 
		J_VAR_ATTR=66, J_OBJ_VAR_MODE_WS=67, J_FUNC_PARAMLESS_RPAREN=68, J_FUNC_PARAM_ALIAS=69, 
		J_FUNC_PARAM_ID=70, J_FUNC_PARAM_STRING=71, J_FUNC_MODE_WS=72, STYLE_TAG_START_NAME=73, 
		START_TAG_NAME=74, START_TAG_WS=75, END_TAG_NAME=76, END_TAG_CLOSE=77, 
		END_TAG_MODE_WS=78, STYLE_TAG_START_CLOSE=79, STYLE_START_TAG_MODE_WS=80, 
		STYLE_END_TAG_NAME=81, STYLE_END_TAG_CLOSE=82, STYLE_END_TAG_MODE_WS=83, 
		STYLE_ATTR=84, ATTR_NAME=85, ATTR_EQ=86, INSIDE_START_TAG_J_EXPR_OPEN=87, 
		START_TAG_CLOSE=88, SELF_CLOSING_TAG_CLOSE=89, INSIDE_START_TAG_MODE_WS=90, 
		ATTR_DQUOTE_START=91, ATTR_VALUE_UNQUOTED=92, ATTR_VAL_WS=93, ATTR_VAL_J_EXPR_START=94, 
		ATTR_VAL_TEXT=95, ATTR_DQUOTE_END=96, ATTR_VAL_QOUTED_WS=97, CLOSE_STYLE_START=98, 
		CSS_SEL_ID=99, CSS_SEL_CLASS=100, CSS_SEL_ELEM=101, CSS_SEL_STATE=102, 
		CSS_SEL_COMMA=103, CSS_LBRACE=104, STYLE_EXIT_RAB=105, CSS_WS=106, CSS_INLINE_EQ=107, 
		CSS_INLINE_DQUOT_START=108, CSS_INLINE_WS=109, BLK_PROP_NAME=110, BLK_COLON=111, 
		BLK_RBRACE=112, BLK_WS=113, CSS_INLINE_PROP_NAME=114, CSS_INLINE_PROP_COLON=115, 
		CSS_INLINE_PROP_DQUOT_END=116, CSS_INLINE_PROP_WS=117, CSS_PROP_VAL=118, 
		CSS_PROP_SEMICOLON=119, CSS_PROP_VALUES_WS=120;
	public static final int
		RULE_template = 0, RULE_jinjaBlock = 1, RULE_templateText = 2, RULE_ifBlock = 3, 
		RULE_ifStatmentStart = 4, RULE_ifBody = 5, RULE_ifStatmentEnd = 6, RULE_elifBlock = 7, 
		RULE_elseBlock = 8, RULE_subconitionBody = 9, RULE_condition = 10, RULE_singleClauseCondition = 11, 
		RULE_multiClauseCondition = 12, RULE_conditionOperand = 13, RULE_conditionOperandTest = 14, 
		RULE_binaryLogicalOperator = 15, RULE_conditionComparisionOperator = 16, 
		RULE_forBlock = 17, RULE_forStatementStart = 18, RULE_iterationStatement = 19, 
		RULE_loopVariables = 20, RULE_iterable = 21, RULE_forStatementEnd = 22, 
		RULE_forBody = 23, RULE_extendsBlock = 24, RULE_inheritBlock = 25, RULE_inheritBlockStart = 26, 
		RULE_inheritBlockEnd = 27, RULE_inheritBlockBody = 28, RULE_jinjaExpression = 29, 
		RULE_jinjaExprStart = 30, RULE_jinjaExprEnd = 31, RULE_jinjaExprBody = 32, 
		RULE_jinjaFilter = 33, RULE_jinjaId = 34, RULE_varMember = 35, RULE_dictKey = 36, 
		RULE_objAttr = 37, RULE_funcParamList = 38, RULE_funcParamId = 39, RULE_funcParam = 40, 
		RULE_htmlElement = 41, RULE_htmlRegularElement = 42, RULE_htmlStartTag = 43, 
		RULE_htmlElementBody = 44, RULE_htmlEndTag = 45, RULE_htmlSelfClosingElement = 46, 
		RULE_htmlSelfClosingTag = 47, RULE_htmlTagAttr = 48, RULE_booleanAttr = 49, 
		RULE_attrWithUnquotedVal = 50, RULE_attrWithQuotedVal = 51, RULE_jinjaAttrVal = 52, 
		RULE_styleAttr = 53, RULE_inlineStyleProp = 54, RULE_htmlStyleElem = 55, 
		RULE_htmlStyleElemOpenTag = 56, RULE_htmlStyleElemCloseTag = 57, RULE_cssBlockDecl = 58, 
		RULE_cssSel = 59, RULE_cssSelWithState = 60, RULE_cssSelectors = 61, RULE_cssBlock = 62, 
		RULE_cssPropDecl = 63, RULE_cssBlockPropVal = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "jinjaBlock", "templateText", "ifBlock", "ifStatmentStart", 
			"ifBody", "ifStatmentEnd", "elifBlock", "elseBlock", "subconitionBody", 
			"condition", "singleClauseCondition", "multiClauseCondition", "conditionOperand", 
			"conditionOperandTest", "binaryLogicalOperator", "conditionComparisionOperator", 
			"forBlock", "forStatementStart", "iterationStatement", "loopVariables", 
			"iterable", "forStatementEnd", "forBody", "extendsBlock", "inheritBlock", 
			"inheritBlockStart", "inheritBlockEnd", "inheritBlockBody", "jinjaExpression", 
			"jinjaExprStart", "jinjaExprEnd", "jinjaExprBody", "jinjaFilter", "jinjaId", 
			"varMember", "dictKey", "objAttr", "funcParamList", "funcParamId", "funcParam", 
			"htmlElement", "htmlRegularElement", "htmlStartTag", "htmlElementBody", 
			"htmlEndTag", "htmlSelfClosingElement", "htmlSelfClosingTag", "htmlTagAttr", 
			"booleanAttr", "attrWithUnquotedVal", "attrWithQuotedVal", "jinjaAttrVal", 
			"styleAttr", "inlineStyleProp", "htmlStyleElem", "htmlStyleElemOpenTag", 
			"htmlStyleElemCloseTag", "cssBlockDecl", "cssSel", "cssSelWithState", 
			"cssSelectors", "cssBlock", "cssPropDecl", "cssBlockPropVal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'<!DOCTYPE html>'", "'<'", null, 
			null, "'if'", "'elif'", "'else'", "'endif'", "'for'", "'endfor'", "'extends'", 
			"'block'", "'endblock'", null, null, "'not'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'in'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'.'", "'['", "'('", null, null, "'is'", null, null, null, null, 
			null, null, "']'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'>'", "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "J_EXPR_START", "J_STMNT_START", "J_COMMENT", "CLOSE_TAG_START", 
			"HTML_COMMENT", "DOCTYPE", "START_TAG_OPEN", "WS", "NORMAL_TEXT", "J_STMNT_IF", 
			"J_STMNT_ELIF", "J_STMNT_ELSE", "J_STMNT_ENDIF", "J_STMNT_FOR", "J_STMNT_ENDFOR", 
			"J_STMNT_EXTENDS", "J_STMNT_BLOCK", "J_STMNT_ENDBLOCK", "J_STMNT_END", 
			"J_STMNT_WS", "J_CONDITION_NOT", "J_CONDITION_VAR_NAME", "J_CONDITION_PRIMITIVE", 
			"J_COND_PRIM_AND", "J_COND_PRIM_OR", "J_COND_PRIM_COMP_OPTOR", "J_CONDITION_SUBSTATEMENT_START", 
			"J_CONDITION_END", "J_CONDITION_MODE_WS", "J_CONDITION_ELSE_END", "J_CONDITION_ELSE_WS", 
			"J_TEST_VALUE", "J_TEST_MODE_WS", "J_LOOP_END", "J_LOOP_ITERABLE", "J_LOOP_MODE_WS", 
			"J_LOOP_KEYWORD", "J_VARIABLES_COMMA", "J_LOOP_VARIABLE", "J_LOOP_VARIABLES_WS", 
			"J_EXTENDS_STRING", "J_EXTENDS_END", "J_EXTENDS_MODE_WS", "J_INHERIT_BLOCK_NAME", 
			"J_BLOCK_MODE_WS", "J_EXPR_END", "J_FORMAT_STRING", "J_EXPR_PIPELINE", 
			"J_EXPR_ID", "J_EXPR_MODE_WS", "J_ID_DOT", "J_ID_LSB", "J_FUNC_LPAREN", 
			"J_FUNC_RPAREN", "J_ID_COMMA", "J_COND_ID_IS", "J_COND_ID_AND", "J_COND_ID_OR", 
			"J_COND_ID_COMP_OPTOR", "J_ID_EXPR_END", "J_ID_END", "J_ID_MODE_WS", 
			"J_DICT_VAR_RSB", "J_DICT_KEY", "J_DICT_VAR_MODE_WS", "J_VAR_ATTR", "J_OBJ_VAR_MODE_WS", 
			"J_FUNC_PARAMLESS_RPAREN", "J_FUNC_PARAM_ALIAS", "J_FUNC_PARAM_ID", "J_FUNC_PARAM_STRING", 
			"J_FUNC_MODE_WS", "STYLE_TAG_START_NAME", "START_TAG_NAME", "START_TAG_WS", 
			"END_TAG_NAME", "END_TAG_CLOSE", "END_TAG_MODE_WS", "STYLE_TAG_START_CLOSE", 
			"STYLE_START_TAG_MODE_WS", "STYLE_END_TAG_NAME", "STYLE_END_TAG_CLOSE", 
			"STYLE_END_TAG_MODE_WS", "STYLE_ATTR", "ATTR_NAME", "ATTR_EQ", "INSIDE_START_TAG_J_EXPR_OPEN", 
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(130);
				extendsBlock();
				}
				break;
			}
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_TAG_OPEN:
				{
				setState(133);
				htmlElement();
				}
				break;
			case EOF:
			case J_STMNT_START:
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J_STMNT_START) {
					{
					{
					setState(134);
					jinjaBlock();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				inheritBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
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
			setState(149);
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
			setState(151);
			ifStatmentStart();
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(152);
				ifBody();
				}
				break;
			}
			setState(155);
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
		public TerminalNode J_STMNT_IF() { return getToken(templateParser.J_STMNT_IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode J_ID_END() { return getToken(templateParser.J_ID_END, 0); }
		public TerminalNode J_CONDITION_END() { return getToken(templateParser.J_CONDITION_END, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(J_STMNT_START);
			setState(158);
			match(J_STMNT_IF);
			setState(159);
			condition();
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==J_CONDITION_END || _la==J_ID_END) ) {
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(168);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(162);
							ifBlock();
							}
							break;
						case 2:
							{
							setState(163);
							elifBlock();
							}
							break;
						case 3:
							{
							setState(164);
							forBlock();
							}
							break;
						case 4:
							{
							setState(165);
							jinjaExpression();
							}
							break;
						case 5:
							{
							setState(166);
							htmlElement();
							}
							break;
						case 6:
							{
							setState(167);
							templateText();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(170); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(172);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
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
		public TerminalNode J_STMNT_ENDIF() { return getToken(templateParser.J_STMNT_ENDIF, 0); }
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
			setState(178);
			match(J_STMNT_START);
			setState(179);
			match(J_STMNT_ENDIF);
			setState(180);
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
		public TerminalNode J_STMNT_ELIF() { return getToken(templateParser.J_STMNT_ELIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode J_ID_END() { return getToken(templateParser.J_ID_END, 0); }
		public SubconitionBodyContext subconitionBody() {
			return getRuleContext(SubconitionBodyContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(J_STMNT_START);
			setState(183);
			match(J_STMNT_ELIF);
			setState(184);
			condition();
			setState(185);
			match(J_ID_END);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(186);
				subconitionBody();
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
	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode J_STMNT_ELSE() { return getToken(templateParser.J_STMNT_ELSE, 0); }
		public TerminalNode J_CONDITION_ELSE_END() { return getToken(templateParser.J_CONDITION_ELSE_END, 0); }
		public SubconitionBodyContext subconitionBody() {
			return getRuleContext(SubconitionBodyContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(J_STMNT_START);
			setState(190);
			match(J_STMNT_ELSE);
			setState(191);
			match(J_CONDITION_ELSE_END);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(192);
				subconitionBody();
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
	public static class SubconitionBodyContext extends ParserRuleContext {
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
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
		public SubconitionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subconitionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterSubconitionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitSubconitionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitSubconitionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubconitionBodyContext subconitionBody() throws RecognitionException {
		SubconitionBodyContext _localctx = new SubconitionBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subconitionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(195);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(196);
						forBlock();
						}
						break;
					case 3:
						{
						setState(197);
						jinjaExpression();
						}
						break;
					case 4:
						{
						setState(198);
						htmlElement();
						}
						break;
					case 5:
						{
						setState(199);
						templateText();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class ConditionContext extends ParserRuleContext {
		public MultiClauseConditionContext multiClauseCondition() {
			return getRuleContext(MultiClauseConditionContext.class,0);
		}
		public SingleClauseConditionContext singleClauseCondition() {
			return getRuleContext(SingleClauseConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				multiClauseCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				singleClauseCondition();
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
	public static class SingleClauseConditionContext extends ParserRuleContext {
		public List<ConditionOperandContext> conditionOperand() {
			return getRuleContexts(ConditionOperandContext.class);
		}
		public ConditionOperandContext conditionOperand(int i) {
			return getRuleContext(ConditionOperandContext.class,i);
		}
		public TerminalNode J_CONDITION_NOT() { return getToken(templateParser.J_CONDITION_NOT, 0); }
		public ConditionComparisionOperatorContext conditionComparisionOperator() {
			return getRuleContext(ConditionComparisionOperatorContext.class,0);
		}
		public ConditionOperandTestContext conditionOperandTest() {
			return getRuleContext(ConditionOperandTestContext.class,0);
		}
		public SingleClauseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleClauseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterSingleClauseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitSingleClauseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitSingleClauseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleClauseConditionContext singleClauseCondition() throws RecognitionException {
		SingleClauseConditionContext _localctx = new SingleClauseConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singleClauseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_CONDITION_NOT) {
				{
				setState(208);
				match(J_CONDITION_NOT);
				}
			}

			setState(211);
			conditionOperand();
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_COND_PRIM_COMP_OPTOR:
			case J_COND_ID_COMP_OPTOR:
				{
				setState(212);
				conditionComparisionOperator();
				setState(213);
				conditionOperand();
				}
				break;
			case J_COND_ID_IS:
				{
				setState(215);
				conditionOperandTest();
				}
				break;
			case J_COND_PRIM_AND:
			case J_COND_PRIM_OR:
			case J_CONDITION_END:
			case J_COND_ID_AND:
			case J_COND_ID_OR:
			case J_ID_END:
				break;
			default:
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
	public static class MultiClauseConditionContext extends ParserRuleContext {
		public List<SingleClauseConditionContext> singleClauseCondition() {
			return getRuleContexts(SingleClauseConditionContext.class);
		}
		public SingleClauseConditionContext singleClauseCondition(int i) {
			return getRuleContext(SingleClauseConditionContext.class,i);
		}
		public TerminalNode J_CONDITION_NOT() { return getToken(templateParser.J_CONDITION_NOT, 0); }
		public List<BinaryLogicalOperatorContext> binaryLogicalOperator() {
			return getRuleContexts(BinaryLogicalOperatorContext.class);
		}
		public BinaryLogicalOperatorContext binaryLogicalOperator(int i) {
			return getRuleContext(BinaryLogicalOperatorContext.class,i);
		}
		public MultiClauseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiClauseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterMultiClauseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitMultiClauseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitMultiClauseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiClauseConditionContext multiClauseCondition() throws RecognitionException {
		MultiClauseConditionContext _localctx = new MultiClauseConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiClauseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(218);
				match(J_CONDITION_NOT);
				}
				break;
			}
			setState(221);
			singleClauseCondition();
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				binaryLogicalOperator();
				setState(223);
				singleClauseCondition();
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 432345564277899264L) != 0) );
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
	public static class ConditionOperandContext extends ParserRuleContext {
		public TerminalNode J_CONDITION_VAR_NAME() { return getToken(templateParser.J_CONDITION_VAR_NAME, 0); }
		public VarMemberContext varMember() {
			return getRuleContext(VarMemberContext.class,0);
		}
		public FuncParamListContext funcParamList() {
			return getRuleContext(FuncParamListContext.class,0);
		}
		public TerminalNode J_CONDITION_PRIMITIVE() { return getToken(templateParser.J_CONDITION_PRIMITIVE, 0); }
		public ConditionOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterConditionOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitConditionOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitConditionOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionOperandContext conditionOperand() throws RecognitionException {
		ConditionOperandContext _localctx = new ConditionOperandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionOperand);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_CONDITION_VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(J_CONDITION_VAR_NAME);
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case J_ID_DOT:
				case J_ID_LSB:
					{
					setState(230);
					varMember();
					}
					break;
				case J_FUNC_LPAREN:
					{
					setState(231);
					funcParamList();
					}
					break;
				case J_COND_PRIM_AND:
				case J_COND_PRIM_OR:
				case J_COND_PRIM_COMP_OPTOR:
				case J_CONDITION_END:
				case J_COND_ID_IS:
				case J_COND_ID_AND:
				case J_COND_ID_OR:
				case J_COND_ID_COMP_OPTOR:
				case J_ID_END:
					break;
				default:
					break;
				}
				}
				break;
			case J_CONDITION_PRIMITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(J_CONDITION_PRIMITIVE);
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
	public static class ConditionOperandTestContext extends ParserRuleContext {
		public TerminalNode J_COND_ID_IS() { return getToken(templateParser.J_COND_ID_IS, 0); }
		public TerminalNode J_TEST_VALUE() { return getToken(templateParser.J_TEST_VALUE, 0); }
		public ConditionOperandTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOperandTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterConditionOperandTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitConditionOperandTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitConditionOperandTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionOperandTestContext conditionOperandTest() throws RecognitionException {
		ConditionOperandTestContext _localctx = new ConditionOperandTestContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionOperandTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(J_COND_ID_IS);
			setState(238);
			match(J_TEST_VALUE);
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
	public static class BinaryLogicalOperatorContext extends ParserRuleContext {
		public TerminalNode J_COND_ID_AND() { return getToken(templateParser.J_COND_ID_AND, 0); }
		public TerminalNode J_COND_ID_OR() { return getToken(templateParser.J_COND_ID_OR, 0); }
		public TerminalNode J_COND_PRIM_AND() { return getToken(templateParser.J_COND_PRIM_AND, 0); }
		public TerminalNode J_COND_PRIM_OR() { return getToken(templateParser.J_COND_PRIM_OR, 0); }
		public BinaryLogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLogicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterBinaryLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitBinaryLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitBinaryLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLogicalOperatorContext binaryLogicalOperator() throws RecognitionException {
		BinaryLogicalOperatorContext _localctx = new BinaryLogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryLogicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345564277899264L) != 0)) ) {
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
	public static class ConditionComparisionOperatorContext extends ParserRuleContext {
		public TerminalNode J_COND_ID_COMP_OPTOR() { return getToken(templateParser.J_COND_ID_COMP_OPTOR, 0); }
		public TerminalNode J_COND_PRIM_COMP_OPTOR() { return getToken(templateParser.J_COND_PRIM_COMP_OPTOR, 0); }
		public ConditionComparisionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionComparisionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterConditionComparisionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitConditionComparisionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitConditionComparisionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionComparisionOperatorContext conditionComparisionOperator() throws RecognitionException {
		ConditionComparisionOperatorContext _localctx = new ConditionComparisionOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionComparisionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==J_COND_PRIM_COMP_OPTOR || _la==J_COND_ID_COMP_OPTOR) ) {
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
	public static class ForBlockContext extends ParserRuleContext {
		public ForStatementStartContext forStatementStart() {
			return getRuleContext(ForStatementStartContext.class,0);
		}
		public ForStatementEndContext forStatementEnd() {
			return getRuleContext(ForStatementEndContext.class,0);
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
		enterRule(_localctx, 34, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			forStatementStart();
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(245);
				forBody();
				}
				break;
			}
			setState(248);
			forStatementEnd();
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
	public static class ForStatementStartContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode J_STMNT_FOR() { return getToken(templateParser.J_STMNT_FOR, 0); }
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public TerminalNode J_ID_END() { return getToken(templateParser.J_ID_END, 0); }
		public ForStatementStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterForStatementStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitForStatementStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitForStatementStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementStartContext forStatementStart() throws RecognitionException {
		ForStatementStartContext _localctx = new ForStatementStartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forStatementStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(J_STMNT_START);
			setState(251);
			match(J_STMNT_FOR);
			setState(252);
			iterationStatement();
			setState(253);
			match(J_ID_END);
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
	public static class IterationStatementContext extends ParserRuleContext {
		public LoopVariablesContext loopVariables() {
			return getRuleContext(LoopVariablesContext.class,0);
		}
		public TerminalNode J_LOOP_KEYWORD() { return getToken(templateParser.J_LOOP_KEYWORD, 0); }
		public IterableContext iterable() {
			return getRuleContext(IterableContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iterationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			loopVariables();
			setState(256);
			match(J_LOOP_KEYWORD);
			setState(257);
			iterable();
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
	public static class LoopVariablesContext extends ParserRuleContext {
		public List<TerminalNode> J_LOOP_VARIABLE() { return getTokens(templateParser.J_LOOP_VARIABLE); }
		public TerminalNode J_LOOP_VARIABLE(int i) {
			return getToken(templateParser.J_LOOP_VARIABLE, i);
		}
		public List<TerminalNode> J_VARIABLES_COMMA() { return getTokens(templateParser.J_VARIABLES_COMMA); }
		public TerminalNode J_VARIABLES_COMMA(int i) {
			return getToken(templateParser.J_VARIABLES_COMMA, i);
		}
		public LoopVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterLoopVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitLoopVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitLoopVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopVariablesContext loopVariables() throws RecognitionException {
		LoopVariablesContext _localctx = new LoopVariablesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loopVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(J_LOOP_VARIABLE);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_VARIABLES_COMMA) {
				{
				{
				setState(260);
				match(J_VARIABLES_COMMA);
				setState(261);
				match(J_LOOP_VARIABLE);
				}
				}
				setState(266);
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
	public static class IterableContext extends ParserRuleContext {
		public TerminalNode J_LOOP_ITERABLE() { return getToken(templateParser.J_LOOP_ITERABLE, 0); }
		public VarMemberContext varMember() {
			return getRuleContext(VarMemberContext.class,0);
		}
		public FuncParamListContext funcParamList() {
			return getRuleContext(FuncParamListContext.class,0);
		}
		public IterableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIterable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIterable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIterable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterableContext iterable() throws RecognitionException {
		IterableContext _localctx = new IterableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_iterable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(J_LOOP_ITERABLE);
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_DOT:
			case J_ID_LSB:
				{
				setState(268);
				varMember();
				}
				break;
			case J_FUNC_LPAREN:
				{
				setState(269);
				funcParamList();
				}
				break;
			case J_ID_END:
				break;
			default:
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
	public static class ForStatementEndContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode J_STMNT_ENDFOR() { return getToken(templateParser.J_STMNT_ENDFOR, 0); }
		public TerminalNode J_STMNT_END() { return getToken(templateParser.J_STMNT_END, 0); }
		public ForStatementEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterForStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitForStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitForStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementEndContext forStatementEnd() throws RecognitionException {
		ForStatementEndContext _localctx = new ForStatementEndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forStatementEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(J_STMNT_START);
			setState(273);
			match(J_STMNT_ENDFOR);
			setState(274);
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
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
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
		enterRule(_localctx, 46, RULE_forBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(276);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(277);
						forBlock();
						}
						break;
					case 3:
						{
						setState(278);
						jinjaExpression();
						}
						break;
					case 4:
						{
						setState(279);
						htmlElement();
						}
						break;
					case 5:
						{
						setState(280);
						templateText();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(283); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(285);
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
		public TerminalNode J_STMNT_EXTENDS() { return getToken(templateParser.J_STMNT_EXTENDS, 0); }
		public TerminalNode J_EXTENDS_STRING() { return getToken(templateParser.J_EXTENDS_STRING, 0); }
		public TerminalNode J_EXTENDS_END() { return getToken(templateParser.J_EXTENDS_END, 0); }
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
		enterRule(_localctx, 48, RULE_extendsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(J_STMNT_START);
			setState(289);
			match(J_STMNT_EXTENDS);
			setState(290);
			match(J_EXTENDS_STRING);
			setState(291);
			match(J_EXTENDS_END);
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
		enterRule(_localctx, 50, RULE_inheritBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			inheritBlockStart();
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(294);
				inheritBlockBody();
				}
				break;
			}
			setState(297);
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
		public TerminalNode J_STMNT_BLOCK() { return getToken(templateParser.J_STMNT_BLOCK, 0); }
		public TerminalNode J_INHERIT_BLOCK_NAME() { return getToken(templateParser.J_INHERIT_BLOCK_NAME, 0); }
		public TerminalNode J_STMNT_END() { return getToken(templateParser.J_STMNT_END, 0); }
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
		enterRule(_localctx, 52, RULE_inheritBlockStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(J_STMNT_START);
			setState(300);
			match(J_STMNT_BLOCK);
			setState(301);
			match(J_INHERIT_BLOCK_NAME);
			setState(302);
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
	public static class InheritBlockEndContext extends ParserRuleContext {
		public TerminalNode J_STMNT_START() { return getToken(templateParser.J_STMNT_START, 0); }
		public TerminalNode J_STMNT_ENDBLOCK() { return getToken(templateParser.J_STMNT_ENDBLOCK, 0); }
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
		enterRule(_localctx, 54, RULE_inheritBlockEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(J_STMNT_START);
			setState(305);
			match(J_STMNT_ENDBLOCK);
			setState(306);
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
	public static class InheritBlockBodyContext extends ParserRuleContext {
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
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
		enterRule(_localctx, 56, RULE_inheritBlockBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(308);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(309);
						forBlock();
						}
						break;
					case 3:
						{
						setState(310);
						jinjaExpression();
						}
						break;
					case 4:
						{
						setState(311);
						htmlElement();
						}
						break;
					case 5:
						{
						setState(312);
						templateText();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class JinjaExpressionContext extends ParserRuleContext {
		public JinjaExprStartContext jinjaExprStart() {
			return getRuleContext(JinjaExprStartContext.class,0);
		}
		public JinjaExprBodyContext jinjaExprBody() {
			return getRuleContext(JinjaExprBodyContext.class,0);
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
		enterRule(_localctx, 58, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			jinjaExprStart();
			setState(318);
			jinjaExprBody();
			setState(319);
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
		enterRule(_localctx, 60, RULE_jinjaExprStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		public TerminalNode J_ID_EXPR_END() { return getToken(templateParser.J_ID_EXPR_END, 0); }
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
		enterRule(_localctx, 62, RULE_jinjaExprEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(J_ID_EXPR_END);
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
	public static class JinjaExprBodyContext extends ParserRuleContext {
		public JinjaIdContext jinjaId() {
			return getRuleContext(JinjaIdContext.class,0);
		}
		public JinjaFilterContext jinjaFilter() {
			return getRuleContext(JinjaFilterContext.class,0);
		}
		public JinjaExprBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterJinjaExprBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitJinjaExprBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitJinjaExprBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprBodyContext jinjaExprBody() throws RecognitionException {
		JinjaExprBodyContext _localctx = new JinjaExprBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_jinjaExprBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_FORMAT_STRING) {
				{
				setState(325);
				jinjaFilter();
				}
			}

			setState(328);
			jinjaId();
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
	public static class JinjaFilterContext extends ParserRuleContext {
		public TerminalNode J_FORMAT_STRING() { return getToken(templateParser.J_FORMAT_STRING, 0); }
		public TerminalNode J_EXPR_PIPELINE() { return getToken(templateParser.J_EXPR_PIPELINE, 0); }
		public JinjaFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterJinjaFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitJinjaFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitJinjaFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaFilterContext jinjaFilter() throws RecognitionException {
		JinjaFilterContext _localctx = new JinjaFilterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_jinjaFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(J_FORMAT_STRING);
			setState(331);
			match(J_EXPR_PIPELINE);
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
	public static class JinjaIdContext extends ParserRuleContext {
		public TerminalNode J_EXPR_ID() { return getToken(templateParser.J_EXPR_ID, 0); }
		public VarMemberContext varMember() {
			return getRuleContext(VarMemberContext.class,0);
		}
		public FuncParamListContext funcParamList() {
			return getRuleContext(FuncParamListContext.class,0);
		}
		public JinjaIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterJinjaId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitJinjaId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitJinjaId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIdContext jinjaId() throws RecognitionException {
		JinjaIdContext _localctx = new JinjaIdContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_jinjaId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(J_EXPR_ID);
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_DOT:
			case J_ID_LSB:
				{
				setState(334);
				varMember();
				}
				break;
			case J_FUNC_LPAREN:
				{
				setState(335);
				funcParamList();
				}
				break;
			case J_ID_EXPR_END:
				break;
			default:
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
	public static class VarMemberContext extends ParserRuleContext {
		public DictKeyContext dictKey() {
			return getRuleContext(DictKeyContext.class,0);
		}
		public ObjAttrContext objAttr() {
			return getRuleContext(ObjAttrContext.class,0);
		}
		public VarMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterVarMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitVarMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitVarMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarMemberContext varMember() throws RecognitionException {
		VarMemberContext _localctx = new VarMemberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_varMember);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_LSB:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				dictKey();
				}
				break;
			case J_ID_DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				objAttr();
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
	public static class DictKeyContext extends ParserRuleContext {
		public TerminalNode J_ID_LSB() { return getToken(templateParser.J_ID_LSB, 0); }
		public TerminalNode J_DICT_KEY() { return getToken(templateParser.J_DICT_KEY, 0); }
		public TerminalNode J_DICT_VAR_RSB() { return getToken(templateParser.J_DICT_VAR_RSB, 0); }
		public ObjAttrContext objAttr() {
			return getRuleContext(ObjAttrContext.class,0);
		}
		public DictKeyContext dictKey() {
			return getRuleContext(DictKeyContext.class,0);
		}
		public DictKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterDictKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitDictKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitDictKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictKeyContext dictKey() throws RecognitionException {
		DictKeyContext _localctx = new DictKeyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dictKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(J_ID_LSB);
			setState(343);
			match(J_DICT_KEY);
			setState(344);
			match(J_DICT_VAR_RSB);
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_DOT:
				{
				setState(345);
				objAttr();
				}
				break;
			case J_ID_LSB:
				{
				setState(346);
				dictKey();
				}
				break;
			case J_COND_PRIM_AND:
			case J_COND_PRIM_OR:
			case J_COND_PRIM_COMP_OPTOR:
			case J_CONDITION_END:
			case J_FUNC_RPAREN:
			case J_ID_COMMA:
			case J_COND_ID_IS:
			case J_COND_ID_AND:
			case J_COND_ID_OR:
			case J_COND_ID_COMP_OPTOR:
			case J_ID_EXPR_END:
			case J_ID_END:
			case J_FUNC_PARAMLESS_RPAREN:
			case J_FUNC_PARAM_ALIAS:
			case J_FUNC_PARAM_ID:
			case J_FUNC_PARAM_STRING:
				break;
			default:
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
	public static class ObjAttrContext extends ParserRuleContext {
		public TerminalNode J_ID_DOT() { return getToken(templateParser.J_ID_DOT, 0); }
		public TerminalNode J_VAR_ATTR() { return getToken(templateParser.J_VAR_ATTR, 0); }
		public ObjAttrContext objAttr() {
			return getRuleContext(ObjAttrContext.class,0);
		}
		public DictKeyContext dictKey() {
			return getRuleContext(DictKeyContext.class,0);
		}
		public FuncParamListContext funcParamList() {
			return getRuleContext(FuncParamListContext.class,0);
		}
		public ObjAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterObjAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitObjAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitObjAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjAttrContext objAttr() throws RecognitionException {
		ObjAttrContext _localctx = new ObjAttrContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_objAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(J_ID_DOT);
			setState(350);
			match(J_VAR_ATTR);
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_DOT:
				{
				setState(351);
				objAttr();
				}
				break;
			case J_ID_LSB:
				{
				setState(352);
				dictKey();
				}
				break;
			case J_FUNC_LPAREN:
				{
				setState(353);
				funcParamList();
				}
				break;
			case J_COND_PRIM_AND:
			case J_COND_PRIM_OR:
			case J_COND_PRIM_COMP_OPTOR:
			case J_CONDITION_END:
			case J_FUNC_RPAREN:
			case J_ID_COMMA:
			case J_COND_ID_IS:
			case J_COND_ID_AND:
			case J_COND_ID_OR:
			case J_COND_ID_COMP_OPTOR:
			case J_ID_EXPR_END:
			case J_ID_END:
			case J_FUNC_PARAMLESS_RPAREN:
			case J_FUNC_PARAM_ALIAS:
			case J_FUNC_PARAM_ID:
			case J_FUNC_PARAM_STRING:
				break;
			default:
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
	public static class FuncParamListContext extends ParserRuleContext {
		public TerminalNode J_FUNC_LPAREN() { return getToken(templateParser.J_FUNC_LPAREN, 0); }
		public TerminalNode J_FUNC_RPAREN() { return getToken(templateParser.J_FUNC_RPAREN, 0); }
		public TerminalNode J_FUNC_PARAMLESS_RPAREN() { return getToken(templateParser.J_FUNC_PARAMLESS_RPAREN, 0); }
		public List<FuncParamContext> funcParam() {
			return getRuleContexts(FuncParamContext.class);
		}
		public FuncParamContext funcParam(int i) {
			return getRuleContext(FuncParamContext.class,i);
		}
		public List<TerminalNode> J_ID_COMMA() { return getTokens(templateParser.J_ID_COMMA); }
		public TerminalNode J_ID_COMMA(int i) {
			return getToken(templateParser.J_ID_COMMA, i);
		}
		public FuncParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterFuncParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitFuncParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitFuncParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamListContext funcParamList() throws RecognitionException {
		FuncParamListContext _localctx = new FuncParamListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_funcParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(J_FUNC_LPAREN);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 114689L) != 0)) {
				{
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case J_FUNC_PARAM_ALIAS:
				case J_FUNC_PARAM_ID:
				case J_FUNC_PARAM_STRING:
					{
					setState(357);
					funcParam();
					}
					break;
				case J_ID_COMMA:
					{
					{
					setState(358);
					match(J_ID_COMMA);
					setState(359);
					funcParam();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==J_FUNC_RPAREN || _la==J_FUNC_PARAMLESS_RPAREN) ) {
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
	public static class FuncParamIdContext extends ParserRuleContext {
		public TerminalNode J_FUNC_PARAM_ID() { return getToken(templateParser.J_FUNC_PARAM_ID, 0); }
		public TerminalNode J_FUNC_PARAM_ALIAS() { return getToken(templateParser.J_FUNC_PARAM_ALIAS, 0); }
		public ObjAttrContext objAttr() {
			return getRuleContext(ObjAttrContext.class,0);
		}
		public DictKeyContext dictKey() {
			return getRuleContext(DictKeyContext.class,0);
		}
		public FuncParamIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParamId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterFuncParamId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitFuncParamId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitFuncParamId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamIdContext funcParamId() throws RecognitionException {
		FuncParamIdContext _localctx = new FuncParamIdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_funcParamId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_FUNC_PARAM_ALIAS) {
				{
				setState(367);
				match(J_FUNC_PARAM_ALIAS);
				}
			}

			setState(370);
			match(J_FUNC_PARAM_ID);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_DOT:
				{
				setState(371);
				objAttr();
				}
				break;
			case J_ID_LSB:
				{
				setState(372);
				dictKey();
				}
				break;
			case J_FUNC_RPAREN:
			case J_ID_COMMA:
			case J_FUNC_PARAMLESS_RPAREN:
			case J_FUNC_PARAM_ALIAS:
			case J_FUNC_PARAM_ID:
			case J_FUNC_PARAM_STRING:
				break;
			default:
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
	public static class FuncParamContext extends ParserRuleContext {
		public FuncParamIdContext funcParamId() {
			return getRuleContext(FuncParamIdContext.class,0);
		}
		public TerminalNode J_FUNC_PARAM_STRING() { return getToken(templateParser.J_FUNC_PARAM_STRING, 0); }
		public FuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterFuncParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitFuncParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitFuncParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamContext funcParam() throws RecognitionException {
		FuncParamContext _localctx = new FuncParamContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_funcParam);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_FUNC_PARAM_ALIAS:
			case J_FUNC_PARAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				funcParamId();
				}
				break;
			case J_FUNC_PARAM_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(J_FUNC_PARAM_STRING);
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
		enterRule(_localctx, 82, RULE_htmlElement);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				htmlRegularElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
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
		enterRule(_localctx, 84, RULE_htmlRegularElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			htmlStartTag();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 646L) != 0) || _la==INSIDE_START_TAG_J_EXPR_OPEN) {
				{
				setState(384);
				htmlElementBody();
				}
			}

			setState(387);
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
		enterRule(_localctx, 86, RULE_htmlStartTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(START_TAG_OPEN);
			setState(390);
			match(START_TAG_NAME);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 11L) != 0)) {
				{
				setState(393);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STYLE_ATTR:
				case ATTR_NAME:
					{
					setState(391);
					htmlTagAttr();
					}
					break;
				case J_EXPR_START:
				case INSIDE_START_TAG_J_EXPR_OPEN:
					{
					setState(392);
					jinjaExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
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
		enterRule(_localctx, 88, RULE_htmlElementBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(400);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(401);
					htmlStyleElem();
					}
					break;
				case 3:
					{
					setState(402);
					jinjaExpression();
					}
					break;
				case 4:
					{
					setState(403);
					jinjaBlock();
					}
					break;
				case 5:
					{
					setState(404);
					templateText();
					}
					break;
				}
				}
				setState(407); 
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
		enterRule(_localctx, 90, RULE_htmlEndTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(CLOSE_TAG_START);
			setState(410);
			match(END_TAG_NAME);
			setState(411);
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
		enterRule(_localctx, 92, RULE_htmlSelfClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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
		enterRule(_localctx, 94, RULE_htmlSelfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(START_TAG_OPEN);
			setState(416);
			match(START_TAG_NAME);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 11L) != 0)) {
				{
				setState(419);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STYLE_ATTR:
				case ATTR_NAME:
					{
					setState(417);
					htmlTagAttr();
					}
					break;
				case J_EXPR_START:
				case INSIDE_START_TAG_J_EXPR_OPEN:
					{
					setState(418);
					jinjaExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
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
		enterRule(_localctx, 96, RULE_htmlTagAttr);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				styleAttr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				booleanAttr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				attrWithQuotedVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
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
		enterRule(_localctx, 98, RULE_booleanAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		enterRule(_localctx, 100, RULE_attrWithUnquotedVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(ATTR_NAME);
			setState(435);
			match(ATTR_EQ);
			setState(436);
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
		enterRule(_localctx, 102, RULE_attrWithQuotedVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ATTR_NAME);
			setState(439);
			match(ATTR_EQ);
			setState(440);
			match(ATTR_DQUOTE_START);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(443);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ATTR_VAL_TEXT:
					{
					setState(441);
					match(ATTR_VAL_TEXT);
					}
					break;
				case ATTR_VAL_J_EXPR_START:
					{
					setState(442);
					jinjaAttrVal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTR_VAL_J_EXPR_START || _la==ATTR_VAL_TEXT );
			setState(447);
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
		public JinjaExprBodyContext jinjaExprBody() {
			return getRuleContext(JinjaExprBodyContext.class,0);
		}
		public TerminalNode J_ID_EXPR_END() { return getToken(templateParser.J_ID_EXPR_END, 0); }
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
		enterRule(_localctx, 104, RULE_jinjaAttrVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(ATTR_VAL_J_EXPR_START);
			setState(450);
			jinjaExprBody();
			setState(451);
			match(J_ID_EXPR_END);
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
		enterRule(_localctx, 106, RULE_styleAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(STYLE_ATTR);
			setState(454);
			match(CSS_INLINE_EQ);
			setState(455);
			match(CSS_INLINE_DQUOT_START);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_INLINE_PROP_NAME) {
				{
				{
				setState(456);
				inlineStyleProp();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
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
		enterRule(_localctx, 108, RULE_inlineStyleProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(CSS_INLINE_PROP_NAME);
			setState(465);
			match(CSS_INLINE_PROP_COLON);
			setState(467); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466);
				match(CSS_PROP_VAL);
				}
				}
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(471);
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
		enterRule(_localctx, 110, RULE_htmlStyleElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			htmlStyleElemOpenTag();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 7L) != 0)) {
				{
				{
				setState(474);
				cssBlockDecl();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
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
		enterRule(_localctx, 112, RULE_htmlStyleElemOpenTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(START_TAG_OPEN);
			setState(483);
			match(STYLE_TAG_START_NAME);
			setState(484);
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
		enterRule(_localctx, 114, RULE_htmlStyleElemCloseTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(CLOSE_STYLE_START);
			setState(487);
			match(STYLE_END_TAG_NAME);
			setState(488);
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
		enterRule(_localctx, 116, RULE_cssBlockDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			cssSelectors();
			setState(491);
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
		enterRule(_localctx, 118, RULE_cssSel);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new CSS_SEL_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(CSS_SEL_ID);
				}
				break;
			case 2:
				_localctx = new CSS_SEL_CLASSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(CSS_SEL_CLASS);
				}
				break;
			case 3:
				_localctx = new CSS_SEL_ELEMContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(CSS_SEL_ELEM);
				}
				break;
			case 4:
				_localctx = new CSS_SEL_PSEUDO_CLASSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
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
		enterRule(_localctx, 120, RULE_cssSelWithState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(500);
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
		enterRule(_localctx, 122, RULE_cssSelectors);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new CSS_SEL_SINGLEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				cssSel();
				}
				break;
			case 2:
				_localctx = new CSS_SEL_DESCENDENTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(504); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(503);
					cssSel();
					}
					}
					setState(506); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 7L) != 0) );
				}
				break;
			case 3:
				_localctx = new CSS_SEL_GROUPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				cssSel();
				setState(511); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(509);
					match(CSS_SEL_COMMA);
					setState(510);
					cssSel();
					}
					}
					setState(513); 
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
		enterRule(_localctx, 124, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(CSS_LBRACE);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLK_PROP_NAME) {
				{
				{
				setState(518);
				cssPropDecl();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
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
		enterRule(_localctx, 126, RULE_cssPropDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(BLK_PROP_NAME);
			setState(527);
			match(BLK_COLON);
			setState(528);
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
		enterRule(_localctx, 128, RULE_cssBlockPropVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(530);
				match(CSS_PROP_VAL);
				}
				}
				setState(533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(535);
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
		"\u0004\u0001x\u021a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0001"+
		"\u0000\u0003\u0000\u0084\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0088"+
		"\b\u0000\n\u0000\f\u0000\u008b\t\u0000\u0003\u0000\u008d\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0094"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u009a"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u00a9\b\u0005\u000b\u0005\f\u0005\u00aa"+
		"\u0001\u0005\u0003\u0005\u00ae\b\u0005\u0001\u0005\u0003\u0005\u00b1\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bc\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c2\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0004\t\u00c9\b\t\u000b\t\f\t\u00ca\u0001\n\u0001\n\u0003\n"+
		"\u00cf\b\n\u0001\u000b\u0003\u000b\u00d2\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d9\b\u000b\u0001\f"+
		"\u0003\f\u00dc\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00e2\b\f\u000b"+
		"\f\f\f\u00e3\u0001\r\u0001\r\u0001\r\u0003\r\u00e9\b\r\u0001\r\u0003\r"+
		"\u00ec\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00f7\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0107\b\u0014\n\u0014\f\u0014\u010a"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010f\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u011a\b\u0017\u000b\u0017"+
		"\f\u0017\u011b\u0001\u0017\u0003\u0017\u011f\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0128\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0004"+
		"\u001c\u013a\b\u001c\u000b\u001c\f\u001c\u013b\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0003 \u0147\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0151\b\"\u0001#\u0001#\u0003#\u0155\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u015c\b$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u0163\b%\u0001&\u0001&\u0001&\u0001&\u0005&\u0169\b&\n&\f&\u016c"+
		"\t&\u0001&\u0001&\u0001\'\u0003\'\u0171\b\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u0176\b\'\u0001(\u0001(\u0003(\u017a\b(\u0001)\u0001)\u0003)\u017e"+
		"\b)\u0001*\u0001*\u0003*\u0182\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u018a\b+\n+\f+\u018d\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0004,\u0196\b,\u000b,\f,\u0197\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0005/\u01a4\b/\n/\f/\u01a7\t/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00030\u01af\b0\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00043\u01bc"+
		"\b3\u000b3\f3\u01bd\u00013\u00013\u00014\u00014\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00055\u01ca\b5\n5\f5\u01cd\t5\u00015\u00015\u00016\u0001"+
		"6\u00016\u00046\u01d4\b6\u000b6\f6\u01d5\u00016\u00016\u00017\u00017\u0005"+
		"7\u01dc\b7\n7\f7\u01df\t7\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		";\u0003;\u01f2\b;\u0001<\u0001<\u0001<\u0001=\u0001=\u0004=\u01f9\b=\u000b"+
		"=\f=\u01fa\u0001=\u0001=\u0001=\u0004=\u0200\b=\u000b=\f=\u0201\u0003"+
		"=\u0204\b=\u0001>\u0001>\u0005>\u0208\b>\n>\f>\u020b\t>\u0001>\u0001>"+
		"\u0001?\u0001?\u0001?\u0001?\u0001@\u0004@\u0214\b@\u000b@\f@\u0215\u0001"+
		"@\u0001@\u0001@\u0000\u0000A\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0000\u0006\u0002\u0000\u001c\u001c==\u0002"+
		"\u0000\u0018\u00199:\u0002\u0000\u001a\u001a;;\u0002\u0000\u0001\u0001"+
		"WW\u0002\u000066DD\u0001\u0000ce\u0231\u0000\u0083\u0001\u0000\u0000\u0000"+
		"\u0002\u0093\u0001\u0000\u0000\u0000\u0004\u0095\u0001\u0000\u0000\u0000"+
		"\u0006\u0097\u0001\u0000\u0000\u0000\b\u009d\u0001\u0000\u0000\u0000\n"+
		"\u00b0\u0001\u0000\u0000\u0000\f\u00b2\u0001\u0000\u0000\u0000\u000e\u00b6"+
		"\u0001\u0000\u0000\u0000\u0010\u00bd\u0001\u0000\u0000\u0000\u0012\u00c8"+
		"\u0001\u0000\u0000\u0000\u0014\u00ce\u0001\u0000\u0000\u0000\u0016\u00d1"+
		"\u0001\u0000\u0000\u0000\u0018\u00db\u0001\u0000\u0000\u0000\u001a\u00eb"+
		"\u0001\u0000\u0000\u0000\u001c\u00ed\u0001\u0000\u0000\u0000\u001e\u00f0"+
		"\u0001\u0000\u0000\u0000 \u00f2\u0001\u0000\u0000\u0000\"\u00f4\u0001"+
		"\u0000\u0000\u0000$\u00fa\u0001\u0000\u0000\u0000&\u00ff\u0001\u0000\u0000"+
		"\u0000(\u0103\u0001\u0000\u0000\u0000*\u010b\u0001\u0000\u0000\u0000,"+
		"\u0110\u0001\u0000\u0000\u0000.\u0119\u0001\u0000\u0000\u00000\u0120\u0001"+
		"\u0000\u0000\u00002\u0125\u0001\u0000\u0000\u00004\u012b\u0001\u0000\u0000"+
		"\u00006\u0130\u0001\u0000\u0000\u00008\u0139\u0001\u0000\u0000\u0000:"+
		"\u013d\u0001\u0000\u0000\u0000<\u0141\u0001\u0000\u0000\u0000>\u0143\u0001"+
		"\u0000\u0000\u0000@\u0146\u0001\u0000\u0000\u0000B\u014a\u0001\u0000\u0000"+
		"\u0000D\u014d\u0001\u0000\u0000\u0000F\u0154\u0001\u0000\u0000\u0000H"+
		"\u0156\u0001\u0000\u0000\u0000J\u015d\u0001\u0000\u0000\u0000L\u0164\u0001"+
		"\u0000\u0000\u0000N\u0170\u0001\u0000\u0000\u0000P\u0179\u0001\u0000\u0000"+
		"\u0000R\u017d\u0001\u0000\u0000\u0000T\u017f\u0001\u0000\u0000\u0000V"+
		"\u0185\u0001\u0000\u0000\u0000X\u0195\u0001\u0000\u0000\u0000Z\u0199\u0001"+
		"\u0000\u0000\u0000\\\u019d\u0001\u0000\u0000\u0000^\u019f\u0001\u0000"+
		"\u0000\u0000`\u01ae\u0001\u0000\u0000\u0000b\u01b0\u0001\u0000\u0000\u0000"+
		"d\u01b2\u0001\u0000\u0000\u0000f\u01b6\u0001\u0000\u0000\u0000h\u01c1"+
		"\u0001\u0000\u0000\u0000j\u01c5\u0001\u0000\u0000\u0000l\u01d0\u0001\u0000"+
		"\u0000\u0000n\u01d9\u0001\u0000\u0000\u0000p\u01e2\u0001\u0000\u0000\u0000"+
		"r\u01e6\u0001\u0000\u0000\u0000t\u01ea\u0001\u0000\u0000\u0000v\u01f1"+
		"\u0001\u0000\u0000\u0000x\u01f3\u0001\u0000\u0000\u0000z\u0203\u0001\u0000"+
		"\u0000\u0000|\u0205\u0001\u0000\u0000\u0000~\u020e\u0001\u0000\u0000\u0000"+
		"\u0080\u0213\u0001\u0000\u0000\u0000\u0082\u0084\u00030\u0018\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u008c\u0001\u0000\u0000\u0000\u0085\u008d\u0003R)\u0000\u0086\u0088\u0003"+
		"\u0002\u0001\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u0085\u0001\u0000\u0000\u0000\u008c\u0089\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u0000\u0000\u0001\u008f\u0001\u0001\u0000\u0000\u0000\u0090\u0094\u0003"+
		"2\u0019\u0000\u0091\u0094\u0003\u0006\u0003\u0000\u0092\u0094\u0003\""+
		"\u0011\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0003\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\t\u0000\u0000\u0096\u0005\u0001\u0000\u0000"+
		"\u0000\u0097\u0099\u0003\b\u0004\u0000\u0098\u009a\u0003\n\u0005\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0003\f\u0006\u0000\u009c"+
		"\u0007\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0002\u0000\u0000\u009e"+
		"\u009f\u0005\n\u0000\u0000\u009f\u00a0\u0003\u0014\n\u0000\u00a0\u00a1"+
		"\u0007\u0000\u0000\u0000\u00a1\t\u0001\u0000\u0000\u0000\u00a2\u00a9\u0003"+
		"\u0006\u0003\u0000\u00a3\u00a9\u0003\u000e\u0007\u0000\u00a4\u00a9\u0003"+
		"\"\u0011\u0000\u00a5\u00a9\u0003:\u001d\u0000\u00a6\u00a9\u0003R)\u0000"+
		"\u00a7\u00a9\u0003\u0004\u0002\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003\u0010\b\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b1\u0001\u0000\u0000\u0000\u00af\u00b1\u0003\u0010\b\u0000\u00b0\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u000b"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0002\u0000\u0000\u00b3\u00b4"+
		"\u0005\r\u0000\u0000\u00b4\u00b5\u0005\u0013\u0000\u0000\u00b5\r\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u00b8\u0005"+
		"\u000b\u0000\u0000\u00b8\u00b9\u0003\u0014\n\u0000\u00b9\u00bb\u0005="+
		"\u0000\u0000\u00ba\u00bc\u0003\u0012\t\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u000f\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005\u0002\u0000\u0000\u00be\u00bf\u0005\f\u0000\u0000"+
		"\u00bf\u00c1\u0005\u001e\u0000\u0000\u00c0\u00c2\u0003\u0012\t\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u0011\u0001\u0000\u0000\u0000\u00c3\u00c9\u0003\u0006\u0003\u0000\u00c4"+
		"\u00c9\u0003\"\u0011\u0000\u00c5\u00c9\u0003:\u001d\u0000\u00c6\u00c9"+
		"\u0003R)\u0000\u00c7\u00c9\u0003\u0004\u0002\u0000\u00c8\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u0013\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0003\u0018\f\u0000\u00cd\u00cf\u0003\u0016\u000b"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u0015\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\u0015\u0000"+
		"\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d8\u0003\u001a\r\u0000"+
		"\u00d4\u00d5\u0003 \u0010\u0000\u00d5\u00d6\u0003\u001a\r\u0000\u00d6"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d9\u0003\u001c\u000e\u0000\u00d8"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u0017\u0001\u0000\u0000\u0000\u00da"+
		"\u00dc\u0005\u0015\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e1\u0003\u0016\u000b\u0000\u00de\u00df\u0003\u001e\u000f\u0000\u00df"+
		"\u00e0\u0003\u0016\u000b\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1"+
		"\u00de\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u0019\u0001\u0000\u0000\u0000\u00e5\u00e8\u0005\u0016\u0000\u0000\u00e6"+
		"\u00e9\u0003F#\u0000\u00e7\u00e9\u0003L&\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005\u0017"+
		"\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u001b\u0001\u0000\u0000\u0000\u00ed\u00ee\u00058\u0000"+
		"\u0000\u00ee\u00ef\u0005 \u0000\u0000\u00ef\u001d\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0007\u0001\u0000\u0000\u00f1\u001f\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0007\u0002\u0000\u0000\u00f3!\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f6\u0003$\u0012\u0000\u00f5\u00f7\u0003.\u0017\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0003,\u0016\u0000\u00f9#\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u0002\u0000\u0000\u00fb\u00fc\u0005\u000e\u0000"+
		"\u0000\u00fc\u00fd\u0003&\u0013\u0000\u00fd\u00fe\u0005=\u0000\u0000\u00fe"+
		"%\u0001\u0000\u0000\u0000\u00ff\u0100\u0003(\u0014\u0000\u0100\u0101\u0005"+
		"%\u0000\u0000\u0101\u0102\u0003*\u0015\u0000\u0102\'\u0001\u0000\u0000"+
		"\u0000\u0103\u0108\u0005\'\u0000\u0000\u0104\u0105\u0005&\u0000\u0000"+
		"\u0105\u0107\u0005\'\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107"+
		"\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109)\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0005#\u0000\u0000\u010c\u010f\u0003"+
		"F#\u0000\u010d\u010f\u0003L&\u0000\u010e\u010c\u0001\u0000\u0000\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f+\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0002\u0000\u0000\u0111"+
		"\u0112\u0005\u000f\u0000\u0000\u0112\u0113\u0005\u0013\u0000\u0000\u0113"+
		"-\u0001\u0000\u0000\u0000\u0114\u011a\u0003\u0006\u0003\u0000\u0115\u011a"+
		"\u0003\"\u0011\u0000\u0116\u011a\u0003:\u001d\u0000\u0117\u011a\u0003"+
		"R)\u0000\u0118\u011a\u0003\u0004\u0002\u0000\u0119\u0114\u0001\u0000\u0000"+
		"\u0000\u0119\u0115\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000"+
		"\u0000\u011d\u011f\u0003\u0010\b\u0000\u011e\u011d\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f/\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0005\u0002\u0000\u0000\u0121\u0122\u0005\u0010\u0000\u0000\u0122"+
		"\u0123\u0005)\u0000\u0000\u0123\u0124\u0005*\u0000\u0000\u01241\u0001"+
		"\u0000\u0000\u0000\u0125\u0127\u00034\u001a\u0000\u0126\u0128\u00038\u001c"+
		"\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u00036\u001b\u0000"+
		"\u012a3\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0002\u0000\u0000\u012c"+
		"\u012d\u0005\u0011\u0000\u0000\u012d\u012e\u0005,\u0000\u0000\u012e\u012f"+
		"\u0005\u0013\u0000\u0000\u012f5\u0001\u0000\u0000\u0000\u0130\u0131\u0005"+
		"\u0002\u0000\u0000\u0131\u0132\u0005\u0012\u0000\u0000\u0132\u0133\u0005"+
		"\u0013\u0000\u0000\u01337\u0001\u0000\u0000\u0000\u0134\u013a\u0003\u0006"+
		"\u0003\u0000\u0135\u013a\u0003\"\u0011\u0000\u0136\u013a\u0003:\u001d"+
		"\u0000\u0137\u013a\u0003R)\u0000\u0138\u013a\u0003\u0004\u0002\u0000\u0139"+
		"\u0134\u0001\u0000\u0000\u0000\u0139\u0135\u0001\u0000\u0000\u0000\u0139"+
		"\u0136\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"9\u0001\u0000\u0000\u0000\u013d\u013e\u0003<\u001e\u0000\u013e\u013f\u0003"+
		"@ \u0000\u013f\u0140\u0003>\u001f\u0000\u0140;\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0007\u0003\u0000\u0000\u0142=\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0005<\u0000\u0000\u0144?\u0001\u0000\u0000\u0000\u0145\u0147\u0003"+
		"B!\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0003D\"\u0000"+
		"\u0149A\u0001\u0000\u0000\u0000\u014a\u014b\u0005/\u0000\u0000\u014b\u014c"+
		"\u00050\u0000\u0000\u014cC\u0001\u0000\u0000\u0000\u014d\u0150\u00051"+
		"\u0000\u0000\u014e\u0151\u0003F#\u0000\u014f\u0151\u0003L&\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0001\u0000\u0000\u0000\u0151E\u0001\u0000\u0000\u0000\u0152\u0155"+
		"\u0003H$\u0000\u0153\u0155\u0003J%\u0000\u0154\u0152\u0001\u0000\u0000"+
		"\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155G\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u00054\u0000\u0000\u0157\u0158\u0005@\u0000\u0000\u0158\u015b"+
		"\u0005?\u0000\u0000\u0159\u015c\u0003J%\u0000\u015a\u015c\u0003H$\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015cI\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u00053\u0000\u0000\u015e\u0162\u0005B\u0000\u0000\u015f\u0163\u0003"+
		"J%\u0000\u0160\u0163\u0003H$\u0000\u0161\u0163\u0003L&\u0000\u0162\u015f"+
		"\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0161"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163K\u0001"+
		"\u0000\u0000\u0000\u0164\u016a\u00055\u0000\u0000\u0165\u0169\u0003P("+
		"\u0000\u0166\u0167\u00057\u0000\u0000\u0167\u0169\u0003P(\u0000\u0168"+
		"\u0165\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169"+
		"\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0007\u0004\u0000\u0000\u016e"+
		"M\u0001\u0000\u0000\u0000\u016f\u0171\u0005E\u0000\u0000\u0170\u016f\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0001"+
		"\u0000\u0000\u0000\u0172\u0175\u0005F\u0000\u0000\u0173\u0176\u0003J%"+
		"\u0000\u0174\u0176\u0003H$\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175"+
		"\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"O\u0001\u0000\u0000\u0000\u0177\u017a\u0003N\'\u0000\u0178\u017a\u0005"+
		"G\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u017aQ\u0001\u0000\u0000\u0000\u017b\u017e\u0003T*\u0000"+
		"\u017c\u017e\u0003\\.\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d"+
		"\u017c\u0001\u0000\u0000\u0000\u017eS\u0001\u0000\u0000\u0000\u017f\u0181"+
		"\u0003V+\u0000\u0180\u0182\u0003X,\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0003Z-\u0000\u0184U\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u0005\u0007\u0000\u0000\u0186\u018b\u0005J\u0000\u0000\u0187\u018a"+
		"\u0003`0\u0000\u0188\u018a\u0003:\u001d\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000"+
		"\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000"+
		"\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0005X\u0000\u0000\u018fW\u0001\u0000\u0000\u0000"+
		"\u0190\u0196\u0003R)\u0000\u0191\u0196\u0003n7\u0000\u0192\u0196\u0003"+
		":\u001d\u0000\u0193\u0196\u0003\u0002\u0001\u0000\u0194\u0196\u0003\u0004"+
		"\u0002\u0000\u0195\u0190\u0001\u0000\u0000\u0000\u0195\u0191\u0001\u0000"+
		"\u0000\u0000\u0195\u0192\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000"+
		"\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000"+
		"\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198Y\u0001\u0000\u0000\u0000\u0199\u019a\u0005\u0004\u0000"+
		"\u0000\u019a\u019b\u0005L\u0000\u0000\u019b\u019c\u0005M\u0000\u0000\u019c"+
		"[\u0001\u0000\u0000\u0000\u019d\u019e\u0003^/\u0000\u019e]\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0005\u0007\u0000\u0000\u01a0\u01a5\u0005J\u0000"+
		"\u0000\u01a1\u01a4\u0003`0\u0000\u01a2\u01a4\u0003:\u001d\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005Y\u0000\u0000\u01a9_\u0001"+
		"\u0000\u0000\u0000\u01aa\u01af\u0003j5\u0000\u01ab\u01af\u0003b1\u0000"+
		"\u01ac\u01af\u0003f3\u0000\u01ad\u01af\u0003d2\u0000\u01ae\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01afa\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0005U\u0000\u0000\u01b1c\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0005U\u0000\u0000\u01b3\u01b4\u0005V\u0000\u0000\u01b4\u01b5"+
		"\u0005\\\u0000\u0000\u01b5e\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005"+
		"U\u0000\u0000\u01b7\u01b8\u0005V\u0000\u0000\u01b8\u01bb\u0005[\u0000"+
		"\u0000\u01b9\u01bc\u0005_\u0000\u0000\u01ba\u01bc\u0003h4\u0000\u01bb"+
		"\u01b9\u0001\u0000\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0005`\u0000\u0000\u01c0g\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005"+
		"^\u0000\u0000\u01c2\u01c3\u0003@ \u0000\u01c3\u01c4\u0005<\u0000\u0000"+
		"\u01c4i\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005T\u0000\u0000\u01c6\u01c7"+
		"\u0005k\u0000\u0000\u01c7\u01cb\u0005l\u0000\u0000\u01c8\u01ca\u0003l"+
		"6\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0005t\u0000\u0000\u01cfk\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0005r\u0000\u0000\u01d1\u01d3\u0005s\u0000\u0000\u01d2\u01d4\u0005"+
		"v\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005w\u0000"+
		"\u0000\u01d8m\u0001\u0000\u0000\u0000\u01d9\u01dd\u0003p8\u0000\u01da"+
		"\u01dc\u0003t:\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dc\u01df\u0001"+
		"\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001"+
		"\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01dd\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e1\u0003r9\u0000\u01e1o\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0005\u0007\u0000\u0000\u01e3\u01e4\u0005I\u0000\u0000"+
		"\u01e4\u01e5\u0005O\u0000\u0000\u01e5q\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0005b\u0000\u0000\u01e7\u01e8\u0005Q\u0000\u0000\u01e8\u01e9\u0005R"+
		"\u0000\u0000\u01e9s\u0001\u0000\u0000\u0000\u01ea\u01eb\u0003z=\u0000"+
		"\u01eb\u01ec\u0003|>\u0000\u01ecu\u0001\u0000\u0000\u0000\u01ed\u01f2"+
		"\u0005c\u0000\u0000\u01ee\u01f2\u0005d\u0000\u0000\u01ef\u01f2\u0005e"+
		"\u0000\u0000\u01f0\u01f2\u0003x<\u0000\u01f1\u01ed\u0001\u0000\u0000\u0000"+
		"\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2w\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0007\u0005\u0000\u0000\u01f4\u01f5\u0005f\u0000\u0000\u01f5y\u0001"+
		"\u0000\u0000\u0000\u01f6\u0204\u0003v;\u0000\u01f7\u01f9\u0003v;\u0000"+
		"\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fb\u0204\u0001\u0000\u0000\u0000\u01fc\u01ff\u0003v;\u0000\u01fd\u01fe"+
		"\u0005g\u0000\u0000\u01fe\u0200\u0003v;\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0204\u0001\u0000"+
		"\u0000\u0000\u0203\u01f6\u0001\u0000\u0000\u0000\u0203\u01f8\u0001\u0000"+
		"\u0000\u0000\u0203\u01fc\u0001\u0000\u0000\u0000\u0204{\u0001\u0000\u0000"+
		"\u0000\u0205\u0209\u0005h\u0000\u0000\u0206\u0208\u0003~?\u0000\u0207"+
		"\u0206\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209"+
		"\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a"+
		"\u020c\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c"+
		"\u020d\u0005p\u0000\u0000\u020d}\u0001\u0000\u0000\u0000\u020e\u020f\u0005"+
		"n\u0000\u0000\u020f\u0210\u0005o\u0000\u0000\u0210\u0211\u0003\u0080@"+
		"\u0000\u0211\u007f\u0001\u0000\u0000\u0000\u0212\u0214\u0005v\u0000\u0000"+
		"\u0213\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000"+
		"\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0005w\u0000\u0000\u0218"+
		"\u0081\u0001\u0000\u0000\u0000;\u0083\u0089\u008c\u0093\u0099\u00a8\u00aa"+
		"\u00ad\u00b0\u00bb\u00c1\u00c8\u00ca\u00ce\u00d1\u00d8\u00db\u00e3\u00e8"+
		"\u00eb\u00f6\u0108\u010e\u0119\u011b\u011e\u0127\u0139\u013b\u0146\u0150"+
		"\u0154\u015b\u0162\u0168\u016a\u0170\u0175\u0179\u017d\u0181\u0189\u018b"+
		"\u0195\u0197\u01a3\u01a5\u01ae\u01bb\u01bd\u01cb\u01d5\u01dd\u01f1\u01fa"+
		"\u0201\u0203\u0209\u0215";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}