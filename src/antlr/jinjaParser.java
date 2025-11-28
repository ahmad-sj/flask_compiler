// Generated from C:/Users/Admin/Desktop/flask_compiler/grammars/jinjaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class jinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		J_EXPR_START=1, J_STMNT_START=2, J_COMMENT=3, J_TEXT=4, J_WS=5, J_STMNT_IF=6, 
		J_STMNT_ELIF=7, J_STMNT_ELSE=8, J_STMNT_ENDIF=9, J_STMNT_FOR=10, J_STMNT_ENDFOR=11, 
		J_STMNT_END=12, J_STMNT_WS=13, J_CONDITION_AND=14, J_CONDITION_OR=15, 
		J_CONDITION_NOT=16, J_CONDITION_IS=17, J_CONDITION_COMPARISION_OPERATOR=18, 
		J_CONDITION_SUBSTATEMENT_START=19, J_CONDITION_DECL_END=20, J_CONDITION_VALUE=21, 
		J_CONDITION_WS=22, J_CONDITION_ELSE_END=23, J_CONDITION_ELSE_WS=24, J_TEST_VALUE=25, 
		J_TEST_WS=26, J_LOOP_END=27, J_LOOP_ITERABLE=28, J_FOR_WS=29, J_LOOP_KEYWORD=30, 
		J_VARIABLES_COMMA=31, J_LOOP_VARIABLE=32, J_LOOP_VARIABLES_WS=33;
	public static final int
		RULE_start = 0, RULE_jinjaBlock = 1, RULE_ifBlock = 2, RULE_ifStatmentStart = 3, 
		RULE_ifBody = 4, RULE_ifStatmentEnd = 5, RULE_elifBlock = 6, RULE_elseBlock = 7, 
		RULE_subconitionBody = 8, RULE_condition = 9, RULE_singleClauseCondition = 10, 
		RULE_multiClauseCondition = 11, RULE_conditionOperand = 12, RULE_conditionOperandTest = 13, 
		RULE_binaryLogicalOperator = 14, RULE_conditionComparisionOperator = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "jinjaBlock", "ifBlock", "ifStatmentStart", "ifBody", "ifStatmentEnd", 
			"elifBlock", "elseBlock", "subconitionBody", "condition", "singleClauseCondition", 
			"multiClauseCondition", "conditionOperand", "conditionOperandTest", "binaryLogicalOperator", 
			"conditionComparisionOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", null, null, null, null, "'if'", "'elif'", "'else'", "'endif'", 
			"'for'", "'endfor'", null, null, "'and'", "'or'", "'not'", "'is'", null, 
			null, null, null, null, null, null, null, null, null, null, null, "'in'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "J_EXPR_START", "J_STMNT_START", "J_COMMENT", "J_TEXT", "J_WS", 
			"J_STMNT_IF", "J_STMNT_ELIF", "J_STMNT_ELSE", "J_STMNT_ENDIF", "J_STMNT_FOR", 
			"J_STMNT_ENDFOR", "J_STMNT_END", "J_STMNT_WS", "J_CONDITION_AND", "J_CONDITION_OR", 
			"J_CONDITION_NOT", "J_CONDITION_IS", "J_CONDITION_COMPARISION_OPERATOR", 
			"J_CONDITION_SUBSTATEMENT_START", "J_CONDITION_DECL_END", "J_CONDITION_VALUE", 
			"J_CONDITION_WS", "J_CONDITION_ELSE_END", "J_CONDITION_ELSE_WS", "J_TEST_VALUE", 
			"J_TEST_WS", "J_LOOP_END", "J_LOOP_ITERABLE", "J_FOR_WS", "J_LOOP_KEYWORD", 
			"J_VARIABLES_COMMA", "J_LOOP_VARIABLE", "J_LOOP_VARIABLES_WS"
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
	public String getGrammarFileName() { return "jinjaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(jinjaParser.EOF, 0); }
		public List<JinjaBlockContext> jinjaBlock() {
			return getRuleContexts(JinjaBlockContext.class);
		}
		public JinjaBlockContext jinjaBlock(int i) {
			return getRuleContext(JinjaBlockContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				jinjaBlock();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==J_STMNT_START || _la==J_TEXT );
			setState(37);
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
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<TerminalNode> J_TEXT() { return getTokens(jinjaParser.J_TEXT); }
		public TerminalNode J_TEXT(int i) {
			return getToken(jinjaParser.J_TEXT, i);
		}
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jinjaBlock);
		try {
			int _alt;
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_STMNT_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				ifBlock();
				}
				break;
			case J_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(40);
						match(J_TEXT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(43); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			ifStatmentStart();
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(48);
				ifBody();
				}
				break;
			}
			setState(51);
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
		public TerminalNode J_STMNT_START() { return getToken(jinjaParser.J_STMNT_START, 0); }
		public TerminalNode J_STMNT_IF() { return getToken(jinjaParser.J_STMNT_IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode J_CONDITION_DECL_END() { return getToken(jinjaParser.J_CONDITION_DECL_END, 0); }
		public IfStatmentStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatmentStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterIfStatmentStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitIfStatmentStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitIfStatmentStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatmentStartContext ifStatmentStart() throws RecognitionException {
		IfStatmentStartContext _localctx = new IfStatmentStartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatmentStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(J_STMNT_START);
			setState(54);
			match(J_STMNT_IF);
			setState(55);
			condition();
			setState(56);
			match(J_CONDITION_DECL_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<TerminalNode> J_TEXT() { return getTokens(jinjaParser.J_TEXT); }
		public TerminalNode J_TEXT(int i) {
			return getToken(jinjaParser.J_TEXT, i);
		}
		public List<ElifBlockContext> elifBlock() {
			return getRuleContexts(ElifBlockContext.class);
		}
		public ElifBlockContext elifBlock(int i) {
			return getRuleContext(ElifBlockContext.class,i);
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
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifBody);
		int _la;
		try {
			int _alt;
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J_TEXT) {
					{
					{
					setState(58);
					match(J_TEXT);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65);
					match(J_TEXT);
					}
					}
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==J_TEXT );
				setState(71); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(70);
						elifBlock();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(73); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(75);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					match(J_TEXT);
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==J_TEXT );
				setState(83);
				elseBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					match(J_TEXT);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==J_TEXT );
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
		public TerminalNode J_STMNT_START() { return getToken(jinjaParser.J_STMNT_START, 0); }
		public TerminalNode J_STMNT_ENDIF() { return getToken(jinjaParser.J_STMNT_ENDIF, 0); }
		public TerminalNode J_STMNT_END() { return getToken(jinjaParser.J_STMNT_END, 0); }
		public IfStatmentEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatmentEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterIfStatmentEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitIfStatmentEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitIfStatmentEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatmentEndContext ifStatmentEnd() throws RecognitionException {
		IfStatmentEndContext _localctx = new IfStatmentEndContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatmentEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(J_STMNT_START);
			setState(92);
			match(J_STMNT_ENDIF);
			setState(93);
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
		public TerminalNode J_STMNT_START() { return getToken(jinjaParser.J_STMNT_START, 0); }
		public TerminalNode J_STMNT_ELIF() { return getToken(jinjaParser.J_STMNT_ELIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode J_CONDITION_DECL_END() { return getToken(jinjaParser.J_CONDITION_DECL_END, 0); }
		public SubconitionBodyContext subconitionBody() {
			return getRuleContext(SubconitionBodyContext.class,0);
		}
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterElifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitElifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitElifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(J_STMNT_START);
			setState(96);
			match(J_STMNT_ELIF);
			setState(97);
			condition();
			setState(98);
			match(J_CONDITION_DECL_END);
			setState(99);
			subconitionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode J_STMNT_START() { return getToken(jinjaParser.J_STMNT_START, 0); }
		public TerminalNode J_STMNT_ELSE() { return getToken(jinjaParser.J_STMNT_ELSE, 0); }
		public TerminalNode J_CONDITION_ELSE_END() { return getToken(jinjaParser.J_CONDITION_ELSE_END, 0); }
		public SubconitionBodyContext subconitionBody() {
			return getRuleContext(SubconitionBodyContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(J_STMNT_START);
			setState(102);
			match(J_STMNT_ELSE);
			setState(103);
			match(J_CONDITION_ELSE_END);
			setState(104);
			subconitionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<TerminalNode> J_TEXT() { return getTokens(jinjaParser.J_TEXT); }
		public TerminalNode J_TEXT(int i) {
			return getToken(jinjaParser.J_TEXT, i);
		}
		public SubconitionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subconitionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterSubconitionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitSubconitionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitSubconitionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubconitionBodyContext subconitionBody() throws RecognitionException {
		SubconitionBodyContext _localctx = new SubconitionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subconitionBody);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J_TEXT) {
					{
					{
					setState(106);
					match(J_TEXT);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					match(J_TEXT);
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==J_TEXT );
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
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				multiClauseCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
		public TerminalNode J_CONDITION_NOT() { return getToken(jinjaParser.J_CONDITION_NOT, 0); }
		public ConditionComparisionOperatorContext conditionComparisionOperator() {
			return getRuleContext(ConditionComparisionOperatorContext.class,0);
		}
		public SingleClauseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleClauseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterSingleClauseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitSingleClauseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitSingleClauseCondition(this);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_CONDITION_NOT) {
				{
				setState(124);
				match(J_CONDITION_NOT);
				}
			}

			setState(127);
			conditionOperand();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_CONDITION_COMPARISION_OPERATOR) {
				{
				setState(128);
				conditionComparisionOperator();
				setState(129);
				conditionOperand();
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
	public static class MultiClauseConditionContext extends ParserRuleContext {
		public List<SingleClauseConditionContext> singleClauseCondition() {
			return getRuleContexts(SingleClauseConditionContext.class);
		}
		public SingleClauseConditionContext singleClauseCondition(int i) {
			return getRuleContext(SingleClauseConditionContext.class,i);
		}
		public BinaryLogicalOperatorContext binaryLogicalOperator() {
			return getRuleContext(BinaryLogicalOperatorContext.class,0);
		}
		public TerminalNode J_CONDITION_NOT() { return getToken(jinjaParser.J_CONDITION_NOT, 0); }
		public MultiClauseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiClauseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterMultiClauseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitMultiClauseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitMultiClauseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiClauseConditionContext multiClauseCondition() throws RecognitionException {
		MultiClauseConditionContext _localctx = new MultiClauseConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiClauseCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(133);
				match(J_CONDITION_NOT);
				}
				break;
			}
			setState(136);
			singleClauseCondition();
			setState(137);
			binaryLogicalOperator();
			setState(138);
			singleClauseCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode J_CONDITION_VALUE() { return getToken(jinjaParser.J_CONDITION_VALUE, 0); }
		public ConditionOperandTestContext conditionOperandTest() {
			return getRuleContext(ConditionOperandTestContext.class,0);
		}
		public ConditionOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterConditionOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitConditionOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitConditionOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionOperandContext conditionOperand() throws RecognitionException {
		ConditionOperandContext _localctx = new ConditionOperandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionOperand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(J_CONDITION_VALUE);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_CONDITION_IS) {
				{
				setState(141);
				conditionOperandTest();
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
	public static class ConditionOperandTestContext extends ParserRuleContext {
		public TerminalNode J_CONDITION_IS() { return getToken(jinjaParser.J_CONDITION_IS, 0); }
		public TerminalNode J_TEST_VALUE() { return getToken(jinjaParser.J_TEST_VALUE, 0); }
		public ConditionOperandTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOperandTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterConditionOperandTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitConditionOperandTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitConditionOperandTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionOperandTestContext conditionOperandTest() throws RecognitionException {
		ConditionOperandTestContext _localctx = new ConditionOperandTestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionOperandTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(J_CONDITION_IS);
			setState(145);
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
		public TerminalNode J_CONDITION_AND() { return getToken(jinjaParser.J_CONDITION_AND, 0); }
		public TerminalNode J_CONDITION_OR() { return getToken(jinjaParser.J_CONDITION_OR, 0); }
		public BinaryLogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLogicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterBinaryLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitBinaryLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitBinaryLogicalOperator(this);
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
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==J_CONDITION_AND || _la==J_CONDITION_OR) ) {
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
		public TerminalNode J_CONDITION_COMPARISION_OPERATOR() { return getToken(jinjaParser.J_CONDITION_COMPARISION_OPERATOR, 0); }
		public ConditionComparisionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionComparisionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterConditionComparisionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitConditionComparisionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitConditionComparisionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionComparisionOperatorContext conditionComparisionOperator() throws RecognitionException {
		ConditionComparisionOperatorContext _localctx = new ConditionComparisionOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditionComparisionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(J_CONDITION_COMPARISION_OPERATOR);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001!\u0098\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0004\u0001*\b\u0001\u000b\u0001\f\u0001"+
		"+\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0005\u0004<\b\u0004\n\u0004\f\u0004?\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004C\b\u0004\u000b\u0004\f\u0004D\u0001\u0004"+
		"\u0004\u0004H\b\u0004\u000b\u0004\f\u0004I\u0001\u0004\u0003\u0004M\b"+
		"\u0004\u0001\u0004\u0004\u0004P\b\u0004\u000b\u0004\f\u0004Q\u0001\u0004"+
		"\u0001\u0004\u0004\u0004V\b\u0004\u000b\u0004\f\u0004W\u0003\u0004Z\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0005\bl\b\b\n\b\f"+
		"\bo\t\b\u0001\b\u0001\b\u0004\bs\b\b\u000b\b\f\bt\u0003\bw\b\b\u0001\t"+
		"\u0001\t\u0003\t{\b\t\u0001\n\u0003\n~\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0084\b\n\u0001\u000b\u0003\u000b\u0087\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u008f\b\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0001\u0001\u0000\u000e"+
		"\u000f\u009c\u0000!\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000"+
		"\u0004/\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\bY\u0001"+
		"\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000"+
		"\u000ee\u0001\u0000\u0000\u0000\u0010v\u0001\u0000\u0000\u0000\u0012z"+
		"\u0001\u0000\u0000\u0000\u0014}\u0001\u0000\u0000\u0000\u0016\u0086\u0001"+
		"\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a\u0090\u0001"+
		"\u0000\u0000\u0000\u001c\u0093\u0001\u0000\u0000\u0000\u001e\u0095\u0001"+
		"\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001"+
		"\u0000\u0000\u0000\'.\u0003\u0004\u0002\u0000(*\u0005\u0004\u0000\u0000"+
		")(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-\'\u0001\u0000"+
		"\u0000\u0000-)\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000\u0000"+
		"/1\u0003\u0006\u0003\u000002\u0003\b\u0004\u000010\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0003\n\u0005\u0000"+
		"4\u0005\u0001\u0000\u0000\u000056\u0005\u0002\u0000\u000067\u0005\u0006"+
		"\u0000\u000078\u0003\u0012\t\u000089\u0005\u0014\u0000\u00009\u0007\u0001"+
		"\u0000\u0000\u0000:<\u0005\u0004\u0000\u0000;:\u0001\u0000\u0000\u0000"+
		"<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@Z\u0003\u0004"+
		"\u0002\u0000AC\u0005\u0004\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EG\u0001\u0000\u0000\u0000FH\u0003\f\u0006\u0000GF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000KM\u0003\u000e\u0007\u0000LK\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MZ\u0001\u0000\u0000\u0000NP\u0005"+
		"\u0004\u0000\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SZ\u0003\u000e\u0007\u0000TV\u0005\u0004\u0000\u0000UT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000Y=\u0001\u0000\u0000\u0000"+
		"YB\u0001\u0000\u0000\u0000YO\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000"+
		"\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005\u0002\u0000\u0000\\]\u0005"+
		"\t\u0000\u0000]^\u0005\f\u0000\u0000^\u000b\u0001\u0000\u0000\u0000_`"+
		"\u0005\u0002\u0000\u0000`a\u0005\u0007\u0000\u0000ab\u0003\u0012\t\u0000"+
		"bc\u0005\u0014\u0000\u0000cd\u0003\u0010\b\u0000d\r\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0002\u0000\u0000fg\u0005\b\u0000\u0000gh\u0005\u0017\u0000"+
		"\u0000hi\u0003\u0010\b\u0000i\u000f\u0001\u0000\u0000\u0000jl\u0005\u0004"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pw\u0003\u0004\u0002\u0000qs\u0005\u0004\u0000"+
		"\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vm\u0001"+
		"\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000w\u0011\u0001\u0000\u0000"+
		"\u0000x{\u0003\u0016\u000b\u0000y{\u0003\u0014\n\u0000zx\u0001\u0000\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{\u0013\u0001\u0000\u0000\u0000|~\u0005"+
		"\u0010\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0083\u0003\u0018\f\u0000\u0080"+
		"\u0081\u0003\u001e\u000f\u0000\u0081\u0082\u0003\u0018\f\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0005\u0010\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0003\u0014\n\u0000\u0089\u008a\u0003\u001c\u000e\u0000\u008a\u008b\u0003"+
		"\u0014\n\u0000\u008b\u0017\u0001\u0000\u0000\u0000\u008c\u008e\u0005\u0015"+
		"\u0000\u0000\u008d\u008f\u0003\u001a\r\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0019\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u0011\u0000\u0000\u0091\u0092\u0005\u0019\u0000"+
		"\u0000\u0092\u001b\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0000\u0000"+
		"\u0000\u0094\u001d\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0012\u0000"+
		"\u0000\u0096\u001f\u0001\u0000\u0000\u0000\u0013#+-1=DILQWYmtvz}\u0083"+
		"\u0086\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}