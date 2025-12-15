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
		DOCTYPE=6, OPEN_TAG_START=7, WS=8, NORMAL_TEXT=9, J_STMNT_IF=10, J_STMNT_ELIF=11, 
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
		J_FUNC_PARAM_ID=70, J_FUNC_PARAM_STRING=71, J_FUNC_MODE_WS=72, OPEN_STYLE=73, 
		OPEN_TAG_NAME=74, OPEN_TAG_WS=75, CLOSE_TAG_NAME=76, CLOSE_TAG_END=77, 
		CLOSE_TAG_WS=78, OPEN_STYLE_END=79, OPEN_STYLE_TAG_WS=80, CLOSE_STYLE=81, 
		CLOSE_STYLE_END=82, CLOSE_STYLE_TAG_WS=83, STYLE_ATTR=84, ATTR_NAME=85, 
		INSIDE_TAG_J_EXPR_START=86, INSIDE_TAG_CLOSE=87, SELF_CLOSING_TAG_END=88, 
		INSIDE_TAG_WS=89, ATTR_EQ=90, BOOL_ATTR_TAG_END=91, BOOL_ATTR_SELF_CLOSING_TAG_END=92, 
		ATTR_WS=93, ATTR_DQUOTE_START=94, ATTR_VALUE_UNQUOTED=95, ATTR_VAL_WS=96, 
		ATTR_VAL_J_EXPR_START=97, ATTR_VAL_TEXT=98, ATTR_DQUOTE_END=99, ATTR_VAL_QOUTED_WS=100, 
		CLOSE_STYLE_START=101, CSS_SEL_ID=102, CSS_SEL_CLASS=103, CSS_SEL_ELEM=104, 
		CSS_SEL_STATE=105, CSS_SEL_COMMA=106, CSS_LBRACE=107, STYLE_EXIT_RAB=108, 
		CSS_WS=109, CSS_INLINE_EQ=110, CSS_INLINE_DQUOT_START=111, CSS_INLINE_WS=112, 
		BLK_PROP_NAME=113, BLK_COLON=114, BLK_RBRACE=115, BLK_WS=116, CSS_INLINE_PROP_NAME=117, 
		CSS_INLINE_PROP_COLON=118, CSS_INLINE_PROP_DQUOT_END=119, CSS_INLINE_PROP_WS=120, 
		CSS_PROP_VAL=121, CSS_PROP_SEMICOLON=122, CSS_PROP_VALUES_WS=123;
	public static final int
		RULE_template = 0, RULE_jinjaBlock = 1, RULE_ifBlock = 2, RULE_ifStatmentStart = 3, 
		RULE_ifBody = 4, RULE_ifStatmentEnd = 5, RULE_elifBlock = 6, RULE_elseBlock = 7, 
		RULE_subconitionBody = 8, RULE_condition = 9, RULE_singleClauseCondition = 10, 
		RULE_multiClauseCondition = 11, RULE_conditionOperand = 12, RULE_conditionOperandTest = 13, 
		RULE_binaryLogicalOperator = 14, RULE_conditionComparisionOperator = 15, 
		RULE_forBlock = 16, RULE_forStatementStart = 17, RULE_iterationStatement = 18, 
		RULE_loopVariables = 19, RULE_iterable = 20, RULE_forStatementEnd = 21, 
		RULE_forBody = 22, RULE_extendsBlock = 23, RULE_inheritBlock = 24, RULE_inheritBlockStart = 25, 
		RULE_inheritBlockEnd = 26, RULE_inheritBlockBody = 27, RULE_jinjaExpression = 28, 
		RULE_jinjaExprStart = 29, RULE_jinjaExprEnd = 30, RULE_jinjaExprBody = 31, 
		RULE_jinjaFilter = 32, RULE_jinjaId = 33, RULE_idMember = 34, RULE_dictKey = 35, 
		RULE_objAttr = 36, RULE_funcParamList = 37, RULE_funcParamId = 38, RULE_funcParam = 39, 
		RULE_htmlElem = 40, RULE_htmlElemBody = 41, RULE_htmlOpenTag = 42, RULE_htmlCloseTag = 43, 
		RULE_htmlSelfClosingTag = 44, RULE_htmlTagAttr = 45, RULE_booleanAttr = 46, 
		RULE_attrWithUnquotedVal = 47, RULE_attrWithQuotedVal = 48, RULE_jinjaAttrVal = 49, 
		RULE_styleAttr = 50, RULE_inlineStyleProp = 51, RULE_inlineStylePropValues = 52, 
		RULE_htmlStyleElem = 53, RULE_htmlStyleElemOpenTag = 54, RULE_htmlStyleElemCloseTag = 55, 
		RULE_cssBlockDecl = 56, RULE_cssSel = 57, RULE_cssSelWithState = 58, RULE_cssSelectors = 59, 
		RULE_cssBlock = 60, RULE_cssPropDecl = 61, RULE_cssBlockPropVal = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "jinjaBlock", "ifBlock", "ifStatmentStart", "ifBody", "ifStatmentEnd", 
			"elifBlock", "elseBlock", "subconitionBody", "condition", "singleClauseCondition", 
			"multiClauseCondition", "conditionOperand", "conditionOperandTest", "binaryLogicalOperator", 
			"conditionComparisionOperator", "forBlock", "forStatementStart", "iterationStatement", 
			"loopVariables", "iterable", "forStatementEnd", "forBody", "extendsBlock", 
			"inheritBlock", "inheritBlockStart", "inheritBlockEnd", "inheritBlockBody", 
			"jinjaExpression", "jinjaExprStart", "jinjaExprEnd", "jinjaExprBody", 
			"jinjaFilter", "jinjaId", "idMember", "dictKey", "objAttr", "funcParamList", 
			"funcParamId", "funcParam", "htmlElem", "htmlElemBody", "htmlOpenTag", 
			"htmlCloseTag", "htmlSelfClosingTag", "htmlTagAttr", "booleanAttr", "attrWithUnquotedVal", 
			"attrWithQuotedVal", "jinjaAttrVal", "styleAttr", "inlineStyleProp", 
			"inlineStylePropValues", "htmlStyleElem", "htmlStyleElemOpenTag", "htmlStyleElemCloseTag", 
			"cssBlockDecl", "cssSel", "cssSelWithState", "cssSelectors", "cssBlock", 
			"cssPropDecl", "cssBlockPropVal"
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
			null, null, "'>'", "'/>'", null, null, null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "J_EXPR_START", "J_STMNT_START", "J_COMMENT", "CLOSE_TAG_START", 
			"HTML_COMMENT", "DOCTYPE", "OPEN_TAG_START", "WS", "NORMAL_TEXT", "J_STMNT_IF", 
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
			"J_FUNC_MODE_WS", "OPEN_STYLE", "OPEN_TAG_NAME", "OPEN_TAG_WS", "CLOSE_TAG_NAME", 
			"CLOSE_TAG_END", "CLOSE_TAG_WS", "OPEN_STYLE_END", "OPEN_STYLE_TAG_WS", 
			"CLOSE_STYLE", "CLOSE_STYLE_END", "CLOSE_STYLE_TAG_WS", "STYLE_ATTR", 
			"ATTR_NAME", "INSIDE_TAG_J_EXPR_START", "INSIDE_TAG_CLOSE", "SELF_CLOSING_TAG_END", 
			"INSIDE_TAG_WS", "ATTR_EQ", "BOOL_ATTR_TAG_END", "BOOL_ATTR_SELF_CLOSING_TAG_END", 
			"ATTR_WS", "ATTR_DQUOTE_START", "ATTR_VALUE_UNQUOTED", "ATTR_VAL_WS", 
			"ATTR_VAL_J_EXPR_START", "ATTR_VAL_TEXT", "ATTR_DQUOTE_END", "ATTR_VAL_QOUTED_WS", 
			"CLOSE_STYLE_START", "CSS_SEL_ID", "CSS_SEL_CLASS", "CSS_SEL_ELEM", "CSS_SEL_STATE", 
			"CSS_SEL_COMMA", "CSS_LBRACE", "STYLE_EXIT_RAB", "CSS_WS", "CSS_INLINE_EQ", 
			"CSS_INLINE_DQUOT_START", "CSS_INLINE_WS", "BLK_PROP_NAME", "BLK_COLON", 
			"BLK_RBRACE", "BLK_WS", "CSS_INLINE_PROP_NAME", "CSS_INLINE_PROP_COLON", 
			"CSS_INLINE_PROP_DQUOT_END", "CSS_INLINE_PROP_WS", "CSS_PROP_VAL", "CSS_PROP_SEMICOLON", 
			"CSS_PROP_VALUES_WS"
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
		public HtmlElemContext htmlElem() {
			return getRuleContext(HtmlElemContext.class,0);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(126);
				extendsBlock();
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG_START:
				{
				setState(129);
				htmlElem();
				}
				break;
			case EOF:
			case J_STMNT_START:
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J_STMNT_START) {
					{
					{
					setState(130);
					jinjaBlock();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
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
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				inheritBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
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
		enterRule(_localctx, 4, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			ifStatmentStart();
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(146);
				ifBody();
				}
				break;
			}
			setState(149);
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
		enterRule(_localctx, 6, RULE_ifStatmentStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(J_STMNT_START);
			setState(152);
			match(J_STMNT_IF);
			setState(153);
			condition();
			setState(154);
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
		public List<HtmlElemContext> htmlElem() {
			return getRuleContexts(HtmlElemContext.class);
		}
		public HtmlElemContext htmlElem(int i) {
			return getRuleContext(HtmlElemContext.class,i);
		}
		public List<TerminalNode> NORMAL_TEXT() { return getTokens(templateParser.NORMAL_TEXT); }
		public TerminalNode NORMAL_TEXT(int i) {
			return getToken(templateParser.NORMAL_TEXT, i);
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
		enterRule(_localctx, 8, RULE_ifBody);
		try {
			int _alt;
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(162);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(156);
							ifBlock();
							}
							break;
						case 2:
							{
							setState(157);
							elifBlock();
							}
							break;
						case 3:
							{
							setState(158);
							forBlock();
							}
							break;
						case 4:
							{
							setState(159);
							jinjaExpression();
							}
							break;
						case 5:
							{
							setState(160);
							htmlElem();
							}
							break;
						case 6:
							{
							setState(161);
							match(NORMAL_TEXT);
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(164); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(166);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
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
		enterRule(_localctx, 10, RULE_ifStatmentEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(J_STMNT_START);
			setState(173);
			match(J_STMNT_ENDIF);
			setState(174);
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
		enterRule(_localctx, 12, RULE_elifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(J_STMNT_START);
			setState(177);
			match(J_STMNT_ELIF);
			setState(178);
			condition();
			setState(179);
			match(J_ID_END);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(180);
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
		enterRule(_localctx, 14, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(J_STMNT_START);
			setState(184);
			match(J_STMNT_ELSE);
			setState(185);
			match(J_CONDITION_ELSE_END);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
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
		public List<HtmlElemContext> htmlElem() {
			return getRuleContexts(HtmlElemContext.class);
		}
		public HtmlElemContext htmlElem(int i) {
			return getRuleContext(HtmlElemContext.class,i);
		}
		public List<TerminalNode> NORMAL_TEXT() { return getTokens(templateParser.NORMAL_TEXT); }
		public TerminalNode NORMAL_TEXT(int i) {
			return getToken(templateParser.NORMAL_TEXT, i);
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
		enterRule(_localctx, 16, RULE_subconitionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(189);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(190);
						forBlock();
						}
						break;
					case 3:
						{
						setState(191);
						jinjaExpression();
						}
						break;
					case 4:
						{
						setState(192);
						htmlElem();
						}
						break;
					case 5:
						{
						setState(193);
						match(NORMAL_TEXT);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196); 
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
		enterRule(_localctx, 18, RULE_condition);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				multiClauseCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
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
		enterRule(_localctx, 20, RULE_singleClauseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_CONDITION_NOT) {
				{
				setState(202);
				match(J_CONDITION_NOT);
				}
			}

			setState(205);
			conditionOperand();
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_COND_PRIM_COMP_OPTOR:
			case J_COND_ID_COMP_OPTOR:
				{
				setState(206);
				conditionComparisionOperator();
				setState(207);
				conditionOperand();
				}
				break;
			case J_COND_ID_IS:
				{
				setState(209);
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
		enterRule(_localctx, 22, RULE_multiClauseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(212);
				match(J_CONDITION_NOT);
				}
				break;
			}
			setState(215);
			singleClauseCondition();
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				binaryLogicalOperator();
				setState(217);
				singleClauseCondition();
				}
				}
				setState(221); 
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
		public IdMemberContext idMember() {
			return getRuleContext(IdMemberContext.class,0);
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
		enterRule(_localctx, 24, RULE_conditionOperand);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_CONDITION_VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(J_CONDITION_VAR_NAME);
				setState(226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case J_ID_DOT:
				case J_ID_LSB:
					{
					setState(224);
					idMember();
					}
					break;
				case J_FUNC_LPAREN:
					{
					setState(225);
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
				setState(228);
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
		enterRule(_localctx, 26, RULE_conditionOperandTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(J_COND_ID_IS);
			setState(232);
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
		enterRule(_localctx, 28, RULE_binaryLogicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 30, RULE_conditionComparisionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 32, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			forStatementStart();
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(239);
				forBody();
				}
				break;
			}
			setState(242);
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
		enterRule(_localctx, 34, RULE_forStatementStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(J_STMNT_START);
			setState(245);
			match(J_STMNT_FOR);
			setState(246);
			iterationStatement();
			setState(247);
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
		enterRule(_localctx, 36, RULE_iterationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			loopVariables();
			setState(250);
			match(J_LOOP_KEYWORD);
			setState(251);
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
		enterRule(_localctx, 38, RULE_loopVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(J_LOOP_VARIABLE);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_VARIABLES_COMMA) {
				{
				{
				setState(254);
				match(J_VARIABLES_COMMA);
				setState(255);
				match(J_LOOP_VARIABLE);
				}
				}
				setState(260);
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
		public IdMemberContext idMember() {
			return getRuleContext(IdMemberContext.class,0);
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
		enterRule(_localctx, 40, RULE_iterable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(J_LOOP_ITERABLE);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_DOT:
			case J_ID_LSB:
				{
				setState(262);
				idMember();
				}
				break;
			case J_FUNC_LPAREN:
				{
				setState(263);
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
		enterRule(_localctx, 42, RULE_forStatementEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(J_STMNT_START);
			setState(267);
			match(J_STMNT_ENDFOR);
			setState(268);
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
		public List<HtmlElemContext> htmlElem() {
			return getRuleContexts(HtmlElemContext.class);
		}
		public HtmlElemContext htmlElem(int i) {
			return getRuleContext(HtmlElemContext.class,i);
		}
		public List<TerminalNode> NORMAL_TEXT() { return getTokens(templateParser.NORMAL_TEXT); }
		public TerminalNode NORMAL_TEXT(int i) {
			return getToken(templateParser.NORMAL_TEXT, i);
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
		enterRule(_localctx, 44, RULE_forBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(270);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(271);
						forBlock();
						}
						break;
					case 3:
						{
						setState(272);
						jinjaExpression();
						}
						break;
					case 4:
						{
						setState(273);
						htmlElem();
						}
						break;
					case 5:
						{
						setState(274);
						match(NORMAL_TEXT);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(279);
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
		enterRule(_localctx, 46, RULE_extendsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(J_STMNT_START);
			setState(283);
			match(J_STMNT_EXTENDS);
			setState(284);
			match(J_EXTENDS_STRING);
			setState(285);
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
		enterRule(_localctx, 48, RULE_inheritBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			inheritBlockStart();
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(288);
				inheritBlockBody();
				}
				break;
			}
			setState(291);
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
		enterRule(_localctx, 50, RULE_inheritBlockStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(J_STMNT_START);
			setState(294);
			match(J_STMNT_BLOCK);
			setState(295);
			match(J_INHERIT_BLOCK_NAME);
			setState(296);
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
		enterRule(_localctx, 52, RULE_inheritBlockEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(J_STMNT_START);
			setState(299);
			match(J_STMNT_ENDBLOCK);
			setState(300);
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
		public List<HtmlElemContext> htmlElem() {
			return getRuleContexts(HtmlElemContext.class);
		}
		public HtmlElemContext htmlElem(int i) {
			return getRuleContext(HtmlElemContext.class,i);
		}
		public List<TerminalNode> NORMAL_TEXT() { return getTokens(templateParser.NORMAL_TEXT); }
		public TerminalNode NORMAL_TEXT(int i) {
			return getToken(templateParser.NORMAL_TEXT, i);
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
		enterRule(_localctx, 54, RULE_inheritBlockBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(302);
						ifBlock();
						}
						break;
					case 2:
						{
						setState(303);
						forBlock();
						}
						break;
					case 3:
						{
						setState(304);
						jinjaExpression();
						}
						break;
					case 4:
						{
						setState(305);
						htmlElem();
						}
						break;
					case 5:
						{
						setState(306);
						match(NORMAL_TEXT);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(309); 
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
		enterRule(_localctx, 56, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			jinjaExprStart();
			setState(312);
			jinjaExprBody();
			setState(313);
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
		public TerminalNode INSIDE_TAG_J_EXPR_START() { return getToken(templateParser.INSIDE_TAG_J_EXPR_START, 0); }
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
		enterRule(_localctx, 58, RULE_jinjaExprStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==J_EXPR_START || _la==INSIDE_TAG_J_EXPR_START) ) {
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
		enterRule(_localctx, 60, RULE_jinjaExprEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		enterRule(_localctx, 62, RULE_jinjaExprBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_FORMAT_STRING) {
				{
				setState(319);
				jinjaFilter();
				}
			}

			setState(322);
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
		enterRule(_localctx, 64, RULE_jinjaFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(J_FORMAT_STRING);
			setState(325);
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
		public IdMemberContext idMember() {
			return getRuleContext(IdMemberContext.class,0);
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
		enterRule(_localctx, 66, RULE_jinjaId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(J_EXPR_ID);
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_DOT:
			case J_ID_LSB:
				{
				setState(328);
				idMember();
				}
				break;
			case J_FUNC_LPAREN:
				{
				setState(329);
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
	public static class IdMemberContext extends ParserRuleContext {
		public DictKeyContext dictKey() {
			return getRuleContext(DictKeyContext.class,0);
		}
		public ObjAttrContext objAttr() {
			return getRuleContext(ObjAttrContext.class,0);
		}
		public IdMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterIdMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitIdMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitIdMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdMemberContext idMember() throws RecognitionException {
		IdMemberContext _localctx = new IdMemberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_idMember);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_LSB:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				dictKey();
				}
				break;
			case J_ID_DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
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
		enterRule(_localctx, 70, RULE_dictKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(J_ID_LSB);
			setState(337);
			match(J_DICT_KEY);
			setState(338);
			match(J_DICT_VAR_RSB);
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_DOT:
				{
				setState(339);
				objAttr();
				}
				break;
			case J_ID_LSB:
				{
				setState(340);
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
		enterRule(_localctx, 72, RULE_objAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(J_ID_DOT);
			setState(344);
			match(J_VAR_ATTR);
			setState(348);
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
			case J_FUNC_LPAREN:
				{
				setState(347);
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
		enterRule(_localctx, 74, RULE_funcParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(J_FUNC_LPAREN);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 114689L) != 0)) {
				{
				setState(354);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case J_FUNC_PARAM_ALIAS:
				case J_FUNC_PARAM_ID:
				case J_FUNC_PARAM_STRING:
					{
					setState(351);
					funcParam();
					}
					break;
				case J_ID_COMMA:
					{
					{
					setState(352);
					match(J_ID_COMMA);
					setState(353);
					funcParam();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
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
		enterRule(_localctx, 76, RULE_funcParamId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_FUNC_PARAM_ALIAS) {
				{
				setState(361);
				match(J_FUNC_PARAM_ALIAS);
				}
			}

			setState(364);
			match(J_FUNC_PARAM_ID);
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_ID_DOT:
				{
				setState(365);
				objAttr();
				}
				break;
			case J_ID_LSB:
				{
				setState(366);
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
		enterRule(_localctx, 78, RULE_funcParam);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_FUNC_PARAM_ALIAS:
			case J_FUNC_PARAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				funcParamId();
				}
				break;
			case J_FUNC_PARAM_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
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
	public static class HtmlElemContext extends ParserRuleContext {
		public HtmlOpenTagContext htmlOpenTag() {
			return getRuleContext(HtmlOpenTagContext.class,0);
		}
		public HtmlCloseTagContext htmlCloseTag() {
			return getRuleContext(HtmlCloseTagContext.class,0);
		}
		public HtmlElemBodyContext htmlElemBody() {
			return getRuleContext(HtmlElemBodyContext.class,0);
		}
		public HtmlSelfClosingTagContext htmlSelfClosingTag() {
			return getRuleContext(HtmlSelfClosingTagContext.class,0);
		}
		public HtmlElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElemContext htmlElem() throws RecognitionException {
		HtmlElemContext _localctx = new HtmlElemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_htmlElem);
		int _la;
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				htmlOpenTag();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 646L) != 0) || _la==INSIDE_TAG_J_EXPR_START) {
					{
					setState(374);
					htmlElemBody();
					}
				}

				setState(377);
				htmlCloseTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				htmlSelfClosingTag();
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
	public static class HtmlElemBodyContext extends ParserRuleContext {
		public List<HtmlElemContext> htmlElem() {
			return getRuleContexts(HtmlElemContext.class);
		}
		public HtmlElemContext htmlElem(int i) {
			return getRuleContext(HtmlElemContext.class,i);
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
		public List<TerminalNode> NORMAL_TEXT() { return getTokens(templateParser.NORMAL_TEXT); }
		public TerminalNode NORMAL_TEXT(int i) {
			return getToken(templateParser.NORMAL_TEXT, i);
		}
		public HtmlElemBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElemBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlElemBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlElemBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlElemBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElemBodyContext htmlElemBody() throws RecognitionException {
		HtmlElemBodyContext _localctx = new HtmlElemBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_htmlElemBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(382);
					htmlElem();
					}
					break;
				case 2:
					{
					setState(383);
					htmlStyleElem();
					}
					break;
				case 3:
					{
					setState(384);
					jinjaExpression();
					}
					break;
				case 4:
					{
					setState(385);
					jinjaBlock();
					}
					break;
				case 5:
					{
					setState(386);
					match(NORMAL_TEXT);
					}
					break;
				}
				}
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 646L) != 0) || _la==INSIDE_TAG_J_EXPR_START );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpenTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_START() { return getToken(templateParser.OPEN_TAG_START, 0); }
		public TerminalNode OPEN_TAG_NAME() { return getToken(templateParser.OPEN_TAG_NAME, 0); }
		public TerminalNode BOOL_ATTR_TAG_END() { return getToken(templateParser.BOOL_ATTR_TAG_END, 0); }
		public TerminalNode INSIDE_TAG_CLOSE() { return getToken(templateParser.INSIDE_TAG_CLOSE, 0); }
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
		public HtmlOpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlOpenTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlOpenTagContext htmlOpenTag() throws RecognitionException {
		HtmlOpenTagContext _localctx = new HtmlOpenTagContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_htmlOpenTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(OPEN_TAG_START);
			setState(392);
			match(OPEN_TAG_NAME);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2055L) != 0)) {
				{
				setState(395);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STYLE_ATTR:
				case ATTR_NAME:
				case ATTR_VALUE_UNQUOTED:
					{
					setState(393);
					htmlTagAttr();
					}
					break;
				case J_EXPR_START:
				case INSIDE_TAG_J_EXPR_START:
					{
					setState(394);
					jinjaExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			_la = _input.LA(1);
			if ( !(_la==INSIDE_TAG_CLOSE || _la==BOOL_ATTR_TAG_END) ) {
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
	public static class HtmlCloseTagContext extends ParserRuleContext {
		public TerminalNode CLOSE_TAG_START() { return getToken(templateParser.CLOSE_TAG_START, 0); }
		public TerminalNode CLOSE_TAG_NAME() { return getToken(templateParser.CLOSE_TAG_NAME, 0); }
		public TerminalNode CLOSE_TAG_END() { return getToken(templateParser.CLOSE_TAG_END, 0); }
		public HtmlCloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlCloseTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCloseTagContext htmlCloseTag() throws RecognitionException {
		HtmlCloseTagContext _localctx = new HtmlCloseTagContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_htmlCloseTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(CLOSE_TAG_START);
			setState(403);
			match(CLOSE_TAG_NAME);
			setState(404);
			match(CLOSE_TAG_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode OPEN_TAG_START() { return getToken(templateParser.OPEN_TAG_START, 0); }
		public TerminalNode OPEN_TAG_NAME() { return getToken(templateParser.OPEN_TAG_NAME, 0); }
		public TerminalNode SELF_CLOSING_TAG_END() { return getToken(templateParser.SELF_CLOSING_TAG_END, 0); }
		public TerminalNode BOOL_ATTR_SELF_CLOSING_TAG_END() { return getToken(templateParser.BOOL_ATTR_SELF_CLOSING_TAG_END, 0); }
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
		enterRule(_localctx, 88, RULE_htmlSelfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(OPEN_TAG_START);
			setState(407);
			match(OPEN_TAG_NAME);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_EXPR_START || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2055L) != 0)) {
				{
				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STYLE_ATTR:
				case ATTR_NAME:
				case ATTR_VALUE_UNQUOTED:
					{
					setState(408);
					htmlTagAttr();
					}
					break;
				case J_EXPR_START:
				case INSIDE_TAG_J_EXPR_START:
					{
					setState(409);
					jinjaExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			_la = _input.LA(1);
			if ( !(_la==SELF_CLOSING_TAG_END || _la==BOOL_ATTR_SELF_CLOSING_TAG_END) ) {
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
		enterRule(_localctx, 90, RULE_htmlTagAttr);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				styleAttr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				booleanAttr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				attrWithQuotedVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
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
		enterRule(_localctx, 92, RULE_booleanAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
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
		enterRule(_localctx, 94, RULE_attrWithUnquotedVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		enterRule(_localctx, 96, RULE_attrWithQuotedVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(ATTR_NAME);
			setState(428);
			match(ATTR_EQ);
			setState(429);
			match(ATTR_DQUOTE_START);
			setState(432); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(432);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ATTR_VAL_TEXT:
					{
					setState(430);
					match(ATTR_VAL_TEXT);
					}
					break;
				case ATTR_VAL_J_EXPR_START:
					{
					setState(431);
					jinjaAttrVal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTR_VAL_J_EXPR_START || _la==ATTR_VAL_TEXT );
			setState(436);
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
		enterRule(_localctx, 98, RULE_jinjaAttrVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ATTR_VAL_J_EXPR_START);
			setState(439);
			jinjaExprBody();
			setState(440);
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
		enterRule(_localctx, 100, RULE_styleAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(STYLE_ATTR);
			setState(443);
			match(CSS_INLINE_EQ);
			setState(444);
			match(CSS_INLINE_DQUOT_START);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_INLINE_PROP_NAME) {
				{
				{
				setState(445);
				inlineStyleProp();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
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
		public List<InlineStylePropValuesContext> inlineStylePropValues() {
			return getRuleContexts(InlineStylePropValuesContext.class);
		}
		public InlineStylePropValuesContext inlineStylePropValues(int i) {
			return getRuleContext(InlineStylePropValuesContext.class,i);
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
		enterRule(_localctx, 102, RULE_inlineStyleProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(CSS_INLINE_PROP_NAME);
			setState(454);
			match(CSS_INLINE_PROP_COLON);
			setState(456); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(455);
				inlineStylePropValues();
				}
				}
				setState(458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineStylePropValuesContext extends ParserRuleContext {
		public TerminalNode CSS_PROP_SEMICOLON() { return getToken(templateParser.CSS_PROP_SEMICOLON, 0); }
		public List<TerminalNode> CSS_PROP_VAL() { return getTokens(templateParser.CSS_PROP_VAL); }
		public TerminalNode CSS_PROP_VAL(int i) {
			return getToken(templateParser.CSS_PROP_VAL, i);
		}
		public InlineStylePropValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineStylePropValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterInlineStylePropValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitInlineStylePropValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitInlineStylePropValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineStylePropValuesContext inlineStylePropValues() throws RecognitionException {
		InlineStylePropValuesContext _localctx = new InlineStylePropValuesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_inlineStylePropValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(460);
				match(CSS_PROP_VAL);
				}
				}
				setState(463); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(465);
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
		enterRule(_localctx, 106, RULE_htmlStyleElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			htmlStyleElemOpenTag();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 7L) != 0)) {
				{
				{
				setState(468);
				cssBlockDecl();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
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
		public TerminalNode OPEN_TAG_START() { return getToken(templateParser.OPEN_TAG_START, 0); }
		public TerminalNode OPEN_STYLE() { return getToken(templateParser.OPEN_STYLE, 0); }
		public TerminalNode OPEN_STYLE_END() { return getToken(templateParser.OPEN_STYLE_END, 0); }
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
		enterRule(_localctx, 108, RULE_htmlStyleElemOpenTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(OPEN_TAG_START);
			setState(477);
			match(OPEN_STYLE);
			setState(478);
			match(OPEN_STYLE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode CLOSE_STYLE() { return getToken(templateParser.CLOSE_STYLE, 0); }
		public TerminalNode CLOSE_STYLE_END() { return getToken(templateParser.CLOSE_STYLE_END, 0); }
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
		enterRule(_localctx, 110, RULE_htmlStyleElemCloseTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(CLOSE_STYLE_START);
			setState(481);
			match(CLOSE_STYLE);
			setState(482);
			match(CLOSE_STYLE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 112, RULE_cssBlockDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			cssSelectors();
			setState(485);
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
		enterRule(_localctx, 114, RULE_cssSel);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new CSS_SEL_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(CSS_SEL_ID);
				}
				break;
			case 2:
				_localctx = new CSS_SEL_CLASSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(CSS_SEL_CLASS);
				}
				break;
			case 3:
				_localctx = new CSS_SEL_ELEMContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(CSS_SEL_ELEM);
				}
				break;
			case 4:
				_localctx = new CSS_SEL_PSEUDO_CLASSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
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
		enterRule(_localctx, 116, RULE_cssSelWithState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(494);
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
		enterRule(_localctx, 118, RULE_cssSelectors);
		int _la;
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new CSS_SEL_SINGLEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				cssSel();
				}
				break;
			case 2:
				_localctx = new CSS_SEL_DESCENDENTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(498); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(497);
					cssSel();
					}
					}
					setState(500); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 7L) != 0) );
				}
				break;
			case 3:
				_localctx = new CSS_SEL_GROUPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				cssSel();
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(503);
					match(CSS_SEL_COMMA);
					setState(504);
					cssSel();
					}
					}
					setState(507); 
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
		enterRule(_localctx, 120, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(CSS_LBRACE);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLK_PROP_NAME) {
				{
				{
				setState(512);
				cssPropDecl();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
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
		enterRule(_localctx, 122, RULE_cssPropDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(BLK_PROP_NAME);
			setState(521);
			match(BLK_COLON);
			setState(522);
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
		enterRule(_localctx, 124, RULE_cssBlockPropVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(524);
				match(CSS_PROP_VAL);
				}
				}
				setState(527); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(529);
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
		"\u0004\u0001{\u0214\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000\u0003\u0000\u0080\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0084\b\u0000\n\u0000\f\u0000\u0087"+
		"\t\u0000\u0003\u0000\u0089\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0090\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0094\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00a3\b\u0004\u000b\u0004"+
		"\f\u0004\u00a4\u0001\u0004\u0003\u0004\u00a8\b\u0004\u0001\u0004\u0003"+
		"\u0004\u00ab\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b6"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bc"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00c3\b\b\u000b"+
		"\b\f\b\u00c4\u0001\t\u0001\t\u0003\t\u00c9\b\t\u0001\n\u0003\n\u00cc\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d3\b\n\u0001\u000b"+
		"\u0003\u000b\u00d6\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u00dc\b\u000b\u000b\u000b\f\u000b\u00dd\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00e3\b\f\u0001\f\u0003\f\u00e6\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00f1\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0101\b\u0013"+
		"\n\u0013\f\u0013\u0104\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0109\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u0114"+
		"\b\u0016\u000b\u0016\f\u0016\u0115\u0001\u0016\u0003\u0016\u0119\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0122\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0004\u001b\u0134\b\u001b\u000b\u001b\f\u001b\u0135\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0003\u001f\u0141\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u014b\b!\u0001"+
		"\"\u0001\"\u0003\"\u014f\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0156\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u015d\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0005%\u0163\b%\n%\f%\u0166\t%\u0001%\u0001%\u0001&\u0003"+
		"&\u016b\b&\u0001&\u0001&\u0001&\u0003&\u0170\b&\u0001\'\u0001\'\u0003"+
		"\'\u0174\b\'\u0001(\u0001(\u0003(\u0178\b(\u0001(\u0001(\u0001(\u0003"+
		"(\u017d\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0004)\u0184\b)\u000b)\f"+
		")\u0185\u0001*\u0001*\u0001*\u0001*\u0005*\u018c\b*\n*\f*\u018f\t*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u019b\b,\n,\f,\u019e\t,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u01a6\b-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00040\u01b1\b0\u000b0\f0\u01b2\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00052\u01bf\b2\n2\f2\u01c2\t2\u00012\u0001"+
		"2\u00013\u00013\u00013\u00043\u01c9\b3\u000b3\f3\u01ca\u00014\u00044\u01ce"+
		"\b4\u000b4\f4\u01cf\u00014\u00014\u00015\u00015\u00055\u01d6\b5\n5\f5"+
		"\u01d9\t5\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00039\u01ec"+
		"\b9\u0001:\u0001:\u0001:\u0001;\u0001;\u0004;\u01f3\b;\u000b;\f;\u01f4"+
		"\u0001;\u0001;\u0001;\u0004;\u01fa\b;\u000b;\f;\u01fb\u0003;\u01fe\b;"+
		"\u0001<\u0001<\u0005<\u0202\b<\n<\f<\u0205\t<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001>\u0004>\u020e\b>\u000b>\f>\u020f\u0001>\u0001>\u0001"+
		">\u0000\u0000?\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|\u0000\b\u0002\u0000\u001c\u001c==\u0002\u0000\u0018\u00199:\u0002"+
		"\u0000\u001a\u001a;;\u0002\u0000\u0001\u0001VV\u0002\u000066DD\u0002\u0000"+
		"WW[[\u0002\u0000XX\\\\\u0001\u0000fh\u022e\u0000\u007f\u0001\u0000\u0000"+
		"\u0000\u0002\u008f\u0001\u0000\u0000\u0000\u0004\u0091\u0001\u0000\u0000"+
		"\u0000\u0006\u0097\u0001\u0000\u0000\u0000\b\u00aa\u0001\u0000\u0000\u0000"+
		"\n\u00ac\u0001\u0000\u0000\u0000\f\u00b0\u0001\u0000\u0000\u0000\u000e"+
		"\u00b7\u0001\u0000\u0000\u0000\u0010\u00c2\u0001\u0000\u0000\u0000\u0012"+
		"\u00c8\u0001\u0000\u0000\u0000\u0014\u00cb\u0001\u0000\u0000\u0000\u0016"+
		"\u00d5\u0001\u0000\u0000\u0000\u0018\u00e5\u0001\u0000\u0000\u0000\u001a"+
		"\u00e7\u0001\u0000\u0000\u0000\u001c\u00ea\u0001\u0000\u0000\u0000\u001e"+
		"\u00ec\u0001\u0000\u0000\u0000 \u00ee\u0001\u0000\u0000\u0000\"\u00f4"+
		"\u0001\u0000\u0000\u0000$\u00f9\u0001\u0000\u0000\u0000&\u00fd\u0001\u0000"+
		"\u0000\u0000(\u0105\u0001\u0000\u0000\u0000*\u010a\u0001\u0000\u0000\u0000"+
		",\u0113\u0001\u0000\u0000\u0000.\u011a\u0001\u0000\u0000\u00000\u011f"+
		"\u0001\u0000\u0000\u00002\u0125\u0001\u0000\u0000\u00004\u012a\u0001\u0000"+
		"\u0000\u00006\u0133\u0001\u0000\u0000\u00008\u0137\u0001\u0000\u0000\u0000"+
		":\u013b\u0001\u0000\u0000\u0000<\u013d\u0001\u0000\u0000\u0000>\u0140"+
		"\u0001\u0000\u0000\u0000@\u0144\u0001\u0000\u0000\u0000B\u0147\u0001\u0000"+
		"\u0000\u0000D\u014e\u0001\u0000\u0000\u0000F\u0150\u0001\u0000\u0000\u0000"+
		"H\u0157\u0001\u0000\u0000\u0000J\u015e\u0001\u0000\u0000\u0000L\u016a"+
		"\u0001\u0000\u0000\u0000N\u0173\u0001\u0000\u0000\u0000P\u017c\u0001\u0000"+
		"\u0000\u0000R\u0183\u0001\u0000\u0000\u0000T\u0187\u0001\u0000\u0000\u0000"+
		"V\u0192\u0001\u0000\u0000\u0000X\u0196\u0001\u0000\u0000\u0000Z\u01a5"+
		"\u0001\u0000\u0000\u0000\\\u01a7\u0001\u0000\u0000\u0000^\u01a9\u0001"+
		"\u0000\u0000\u0000`\u01ab\u0001\u0000\u0000\u0000b\u01b6\u0001\u0000\u0000"+
		"\u0000d\u01ba\u0001\u0000\u0000\u0000f\u01c5\u0001\u0000\u0000\u0000h"+
		"\u01cd\u0001\u0000\u0000\u0000j\u01d3\u0001\u0000\u0000\u0000l\u01dc\u0001"+
		"\u0000\u0000\u0000n\u01e0\u0001\u0000\u0000\u0000p\u01e4\u0001\u0000\u0000"+
		"\u0000r\u01eb\u0001\u0000\u0000\u0000t\u01ed\u0001\u0000\u0000\u0000v"+
		"\u01fd\u0001\u0000\u0000\u0000x\u01ff\u0001\u0000\u0000\u0000z\u0208\u0001"+
		"\u0000\u0000\u0000|\u020d\u0001\u0000\u0000\u0000~\u0080\u0003.\u0017"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0088\u0001\u0000\u0000\u0000\u0081\u0089\u0003P(\u0000\u0082\u0084"+
		"\u0003\u0002\u0001\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0081\u0001\u0000\u0000\u0000\u0088\u0085"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\u0000\u0000\u0001\u008b\u0001\u0001\u0000\u0000\u0000\u008c\u0090"+
		"\u00030\u0018\u0000\u008d\u0090\u0003\u0004\u0002\u0000\u008e\u0090\u0003"+
		" \u0010\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0003\u0001\u0000"+
		"\u0000\u0000\u0091\u0093\u0003\u0006\u0003\u0000\u0092\u0094\u0003\b\u0004"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0003\n\u0005\u0000"+
		"\u0096\u0005\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0002\u0000\u0000"+
		"\u0098\u0099\u0005\n\u0000\u0000\u0099\u009a\u0003\u0012\t\u0000\u009a"+
		"\u009b\u0007\u0000\u0000\u0000\u009b\u0007\u0001\u0000\u0000\u0000\u009c"+
		"\u00a3\u0003\u0004\u0002\u0000\u009d\u00a3\u0003\f\u0006\u0000\u009e\u00a3"+
		"\u0003 \u0010\u0000\u009f\u00a3\u00038\u001c\u0000\u00a0\u00a3\u0003P"+
		"(\u0000\u00a1\u00a3\u0005\t\u0000\u0000\u00a2\u009c\u0001\u0000\u0000"+
		"\u0000\u00a2\u009d\u0001\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000"+
		"\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003\u000e\u0007"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\u000e\u0007"+
		"\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\t\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0002\u0000\u0000"+
		"\u00ad\u00ae\u0005\r\u0000\u0000\u00ae\u00af\u0005\u0013\u0000\u0000\u00af"+
		"\u000b\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0002\u0000\u0000\u00b1"+
		"\u00b2\u0005\u000b\u0000\u0000\u00b2\u00b3\u0003\u0012\t\u0000\u00b3\u00b5"+
		"\u0005=\u0000\u0000\u00b4\u00b6\u0003\u0010\b\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\r\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8\u00b9\u0005\f\u0000"+
		"\u0000\u00b9\u00bb\u0005\u001e\u0000\u0000\u00ba\u00bc\u0003\u0010\b\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u000f\u0001\u0000\u0000\u0000\u00bd\u00c3\u0003\u0004\u0002\u0000"+
		"\u00be\u00c3\u0003 \u0010\u0000\u00bf\u00c3\u00038\u001c\u0000\u00c0\u00c3"+
		"\u0003P(\u0000\u00c1\u00c3\u0005\t\u0000\u0000\u00c2\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u0011\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0003\u0016\u000b\u0000\u00c7\u00c9\u0003\u0014"+
		"\n\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u0013\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\u0015\u0000"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d2\u0003\u0018\f\u0000"+
		"\u00ce\u00cf\u0003\u001e\u000f\u0000\u00cf\u00d0\u0003\u0018\f\u0000\u00d0"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003\u001a\r\u0000\u00d2\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u0015\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0005\u0015\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00db"+
		"\u0003\u0014\n\u0000\u00d8\u00d9\u0003\u001c\u000e\u0000\u00d9\u00da\u0003"+
		"\u0014\n\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u0017\u0001\u0000"+
		"\u0000\u0000\u00df\u00e2\u0005\u0016\u0000\u0000\u00e0\u00e3\u0003D\""+
		"\u0000\u00e1\u00e3\u0003J%\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005\u0017\u0000\u0000\u00e5"+
		"\u00df\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u0019\u0001\u0000\u0000\u0000\u00e7\u00e8\u00058\u0000\u0000\u00e8\u00e9"+
		"\u0005 \u0000\u0000\u00e9\u001b\u0001\u0000\u0000\u0000\u00ea\u00eb\u0007"+
		"\u0001\u0000\u0000\u00eb\u001d\u0001\u0000\u0000\u0000\u00ec\u00ed\u0007"+
		"\u0002\u0000\u0000\u00ed\u001f\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003"+
		"\"\u0011\u0000\u00ef\u00f1\u0003,\u0016\u0000\u00f0\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0003*\u0015\u0000\u00f3!\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005\u0002\u0000\u0000\u00f5\u00f6\u0005\u000e\u0000\u0000"+
		"\u00f6\u00f7\u0003$\u0012\u0000\u00f7\u00f8\u0005=\u0000\u0000\u00f8#"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003&\u0013\u0000\u00fa\u00fb\u0005"+
		"%\u0000\u0000\u00fb\u00fc\u0003(\u0014\u0000\u00fc%\u0001\u0000\u0000"+
		"\u0000\u00fd\u0102\u0005\'\u0000\u0000\u00fe\u00ff\u0005&\u0000\u0000"+
		"\u00ff\u0101\u0005\'\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101"+
		"\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\'\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0105\u0108\u0005#\u0000\u0000\u0106\u0109\u0003"+
		"D\"\u0000\u0107\u0109\u0003J%\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109)\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0002\u0000\u0000\u010b"+
		"\u010c\u0005\u000f\u0000\u0000\u010c\u010d\u0005\u0013\u0000\u0000\u010d"+
		"+\u0001\u0000\u0000\u0000\u010e\u0114\u0003\u0004\u0002\u0000\u010f\u0114"+
		"\u0003 \u0010\u0000\u0110\u0114\u00038\u001c\u0000\u0111\u0114\u0003P"+
		"(\u0000\u0112\u0114\u0005\t\u0000\u0000\u0113\u010e\u0001\u0000\u0000"+
		"\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000"+
		"\u0000\u0117\u0119\u0003\u000e\u0007\u0000\u0118\u0117\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119-\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\u0002\u0000\u0000\u011b\u011c\u0005\u0010\u0000\u0000"+
		"\u011c\u011d\u0005)\u0000\u0000\u011d\u011e\u0005*\u0000\u0000\u011e/"+
		"\u0001\u0000\u0000\u0000\u011f\u0121\u00032\u0019\u0000\u0120\u0122\u0003"+
		"6\u001b\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u00034\u001a"+
		"\u0000\u01241\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0002\u0000\u0000"+
		"\u0126\u0127\u0005\u0011\u0000\u0000\u0127\u0128\u0005,\u0000\u0000\u0128"+
		"\u0129\u0005\u0013\u0000\u0000\u01293\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005\u0002\u0000\u0000\u012b\u012c\u0005\u0012\u0000\u0000\u012c\u012d"+
		"\u0005\u0013\u0000\u0000\u012d5\u0001\u0000\u0000\u0000\u012e\u0134\u0003"+
		"\u0004\u0002\u0000\u012f\u0134\u0003 \u0010\u0000\u0130\u0134\u00038\u001c"+
		"\u0000\u0131\u0134\u0003P(\u0000\u0132\u0134\u0005\t\u0000\u0000\u0133"+
		"\u012e\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u0133"+
		"\u0130\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133"+
		"\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"7\u0001\u0000\u0000\u0000\u0137\u0138\u0003:\u001d\u0000\u0138\u0139\u0003"+
		">\u001f\u0000\u0139\u013a\u0003<\u001e\u0000\u013a9\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0007\u0003\u0000\u0000\u013c;\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0005<\u0000\u0000\u013e=\u0001\u0000\u0000\u0000\u013f\u0141"+
		"\u0003@ \u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0003B!\u0000"+
		"\u0143?\u0001\u0000\u0000\u0000\u0144\u0145\u0005/\u0000\u0000\u0145\u0146"+
		"\u00050\u0000\u0000\u0146A\u0001\u0000\u0000\u0000\u0147\u014a\u00051"+
		"\u0000\u0000\u0148\u014b\u0003D\"\u0000\u0149\u014b\u0003J%\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014bC\u0001\u0000\u0000\u0000\u014c\u014f"+
		"\u0003F#\u0000\u014d\u014f\u0003H$\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014fE\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u00054\u0000\u0000\u0151\u0152\u0005@\u0000\u0000\u0152\u0155"+
		"\u0005?\u0000\u0000\u0153\u0156\u0003H$\u0000\u0154\u0156\u0003F#\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156G\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u00053\u0000\u0000\u0158\u015c\u0005B\u0000\u0000\u0159\u015d\u0003"+
		"H$\u0000\u015a\u015d\u0003F#\u0000\u015b\u015d\u0003J%\u0000\u015c\u0159"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015b"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015dI\u0001"+
		"\u0000\u0000\u0000\u015e\u0164\u00055\u0000\u0000\u015f\u0163\u0003N\'"+
		"\u0000\u0160\u0161\u00057\u0000\u0000\u0161\u0163\u0003N\'\u0000\u0162"+
		"\u015f\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163"+
		"\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166"+
		"\u0164\u0001\u0000\u0000\u0000\u0167\u0168\u0007\u0004\u0000\u0000\u0168"+
		"K\u0001\u0000\u0000\u0000\u0169\u016b\u0005E\u0000\u0000\u016a\u0169\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016c\u016f\u0005F\u0000\u0000\u016d\u0170\u0003H$"+
		"\u0000\u016e\u0170\u0003F#\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"M\u0001\u0000\u0000\u0000\u0171\u0174\u0003L&\u0000\u0172\u0174\u0005"+
		"G\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0172\u0001\u0000"+
		"\u0000\u0000\u0174O\u0001\u0000\u0000\u0000\u0175\u0177\u0003T*\u0000"+
		"\u0176\u0178\u0003R)\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0003V+\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u017d\u0003X"+
		",\u0000\u017c\u0175\u0001\u0000\u0000\u0000\u017c\u017b\u0001\u0000\u0000"+
		"\u0000\u017dQ\u0001\u0000\u0000\u0000\u017e\u0184\u0003P(\u0000\u017f"+
		"\u0184\u0003j5\u0000\u0180\u0184\u00038\u001c\u0000\u0181\u0184\u0003"+
		"\u0002\u0001\u0000\u0182\u0184\u0005\t\u0000\u0000\u0183\u017e\u0001\u0000"+
		"\u0000\u0000\u0183\u017f\u0001\u0000\u0000\u0000\u0183\u0180\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186S\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0005\u0007\u0000\u0000\u0188\u018d\u0005J\u0000\u0000"+
		"\u0189\u018c\u0003Z-\u0000\u018a\u018c\u00038\u001c\u0000\u018b\u0189"+
		"\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018f"+
		"\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0001\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0007\u0005\u0000\u0000\u0191U\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0005\u0004\u0000\u0000\u0193\u0194\u0005"+
		"L\u0000\u0000\u0194\u0195\u0005M\u0000\u0000\u0195W\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0005\u0007\u0000\u0000\u0197\u019c\u0005J\u0000\u0000"+
		"\u0198\u019b\u0003Z-\u0000\u0199\u019b\u00038\u001c\u0000\u019a\u0198"+
		"\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019e"+
		"\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0007\u0006\u0000\u0000\u01a0Y\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a6\u0003d2\u0000\u01a2\u01a6\u0003\\.\u0000"+
		"\u01a3\u01a6\u0003`0\u0000\u01a4\u01a6\u0003^/\u0000\u01a5\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6[\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0005U\u0000\u0000\u01a8]\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0005_\u0000\u0000\u01aa_\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0005U\u0000\u0000\u01ac\u01ad\u0005Z\u0000\u0000\u01ad\u01b0\u0005^"+
		"\u0000\u0000\u01ae\u01b1\u0005b\u0000\u0000\u01af\u01b1\u0003b1\u0000"+
		"\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0005c\u0000\u0000\u01b5a\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0005a\u0000\u0000\u01b7\u01b8\u0003>\u001f\u0000\u01b8\u01b9\u0005<"+
		"\u0000\u0000\u01b9c\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005T\u0000\u0000"+
		"\u01bb\u01bc\u0005n\u0000\u0000\u01bc\u01c0\u0005o\u0000\u0000\u01bd\u01bf"+
		"\u0003f3\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0005w\u0000\u0000\u01c4e\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0005u\u0000\u0000\u01c6\u01c8\u0005v\u0000\u0000\u01c7\u01c9"+
		"\u0003h4\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cbg\u0001\u0000\u0000\u0000\u01cc\u01ce\u0005y\u0000\u0000"+
		"\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005z\u0000\u0000\u01d2"+
		"i\u0001\u0000\u0000\u0000\u01d3\u01d7\u0003l6\u0000\u01d4\u01d6\u0003"+
		"p8\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0003n7\u0000\u01dbk\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0005\u0007\u0000\u0000\u01dd\u01de\u0005I\u0000\u0000\u01de\u01df"+
		"\u0005O\u0000\u0000\u01dfm\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005e"+
		"\u0000\u0000\u01e1\u01e2\u0005Q\u0000\u0000\u01e2\u01e3\u0005R\u0000\u0000"+
		"\u01e3o\u0001\u0000\u0000\u0000\u01e4\u01e5\u0003v;\u0000\u01e5\u01e6"+
		"\u0003x<\u0000\u01e6q\u0001\u0000\u0000\u0000\u01e7\u01ec\u0005f\u0000"+
		"\u0000\u01e8\u01ec\u0005g\u0000\u0000\u01e9\u01ec\u0005h\u0000\u0000\u01ea"+
		"\u01ec\u0003t:\u0000\u01eb\u01e7\u0001\u0000\u0000\u0000\u01eb\u01e8\u0001"+
		"\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ecs\u0001\u0000\u0000\u0000\u01ed\u01ee\u0007\u0007"+
		"\u0000\u0000\u01ee\u01ef\u0005i\u0000\u0000\u01efu\u0001\u0000\u0000\u0000"+
		"\u01f0\u01fe\u0003r9\u0000\u01f1\u01f3\u0003r9\u0000\u01f2\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01fe\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f9\u0003r9\u0000\u01f7\u01f8\u0005j\u0000"+
		"\u0000\u01f8\u01fa\u0003r9\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd"+
		"\u01f0\u0001\u0000\u0000\u0000\u01fd\u01f2\u0001\u0000\u0000\u0000\u01fd"+
		"\u01f6\u0001\u0000\u0000\u0000\u01few\u0001\u0000\u0000\u0000\u01ff\u0203"+
		"\u0005k\u0000\u0000\u0200\u0202\u0003z=\u0000\u0201\u0200\u0001\u0000"+
		"\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0206\u0001\u0000"+
		"\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0207\u0005s\u0000"+
		"\u0000\u0207y\u0001\u0000\u0000\u0000\u0208\u0209\u0005q\u0000\u0000\u0209"+
		"\u020a\u0005r\u0000\u0000\u020a\u020b\u0003|>\u0000\u020b{\u0001\u0000"+
		"\u0000\u0000\u020c\u020e\u0005y\u0000\u0000\u020d\u020c\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0005z\u0000\u0000\u0212}\u0001\u0000\u0000\u0000<"+
		"\u007f\u0085\u0088\u008f\u0093\u00a2\u00a4\u00a7\u00aa\u00b5\u00bb\u00c2"+
		"\u00c4\u00c8\u00cb\u00d2\u00d5\u00dd\u00e2\u00e5\u00f0\u0102\u0108\u0113"+
		"\u0115\u0118\u0121\u0133\u0135\u0140\u014a\u014e\u0155\u015c\u0162\u0164"+
		"\u016a\u016f\u0173\u0177\u017c\u0183\u0185\u018b\u018d\u019a\u019c\u01a5"+
		"\u01b0\u01b2\u01c0\u01ca\u01cf\u01d7\u01eb\u01f4\u01fb\u01fd\u0203\u020f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}