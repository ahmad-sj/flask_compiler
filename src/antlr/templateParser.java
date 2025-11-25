// Generated from C:/Users/Admin/Desktop/New folder (2)/flask_compiler/grammars/templateParser.g4 by ANTLR 4.13.2
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
		HTML_TEXT=1, CLOSE_TAG_START=2, COMMENT=3, OPEN_TAG_START=4, WS=5, OPEN_STYLE=6, 
		OPEN_TAG_NAME=7, OPEN_TAG_WS=8, CLOSE_TAG_NAME=9, CLOSE_TAG_END=10, CLOSE_TAG_WS=11, 
		OPEN_STYLE_END=12, OPEN_STYLE_TAG_WS=13, CLOSE_STYLE=14, CLOSE_STYLE_END=15, 
		CLOSE_STYLE_TAG_WS=16, STYLE_ATTR=17, ATTR_NAME=18, ATTR_EQ=19, SELF_CLOSING_TAG_END=20, 
		OPEN_TAG_END=21, ATTR_WS=22, STRING_DQUOTE=23, STRING_SQUOTE=24, ATTR_VALUE_UNQUOTED=25, 
		ATTR_VAL_WS=26, CLOSE_STYLE_START=27, CSS_SELECTOR_ID=28, CSS_SELECTOR_CLASS=29, 
		CSS_SELECTOR_ELEMENT=30, CSS_LBRACE=31, STYLE_EXIT_RAB=32, CSS_WS=33, 
		CSS_INLINE_EQ=34, CSS_INLINE_DQUOT_START=35, CSS_INLINE_WS=36, BLK_PROP_NAME=37, 
		BLK_COLON=38, BLK_RBRACE=39, BLK_WS=40, CSS_INLINE_PROP_NAME=41, CSS_INLINE_PROP_COLON=42, 
		CSS_INLINE_PROP_DQUOT_END=43, CSS_INLINE_PROP_WS=44, CSS_PROP_VAL=45, 
		CSS_PROP_SEMICOLON=46, CSS_PROP_VALUES_WS=47;
	public static final int
		RULE_document = 0, RULE_element = 1, RULE_content = 2, RULE_openTag = 3, 
		RULE_closeTag = 4, RULE_selfClosingTag = 5, RULE_atrribute = 6, RULE_attrValue = 7, 
		RULE_htmlStyleAttr = 8, RULE_inlineStyleProp = 9, RULE_inlineStylePropValues = 10, 
		RULE_styleElement = 11, RULE_openStyleTag = 12, RULE_closeStyleTag = 13, 
		RULE_cssBlockDecl = 14, RULE_selector = 15, RULE_cssBlock = 16, RULE_declaration = 17, 
		RULE_blkPropVal = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element", "content", "openTag", "closeTag", "selfClosingTag", 
			"atrribute", "attrValue", "htmlStyleAttr", "inlineStyleProp", "inlineStylePropValues", 
			"styleElement", "openStyleTag", "closeStyleTag", "cssBlockDecl", "selector", 
			"cssBlock", "declaration", "blkPropVal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_TEXT", "CLOSE_TAG_START", "COMMENT", "OPEN_TAG_START", "WS", 
			"OPEN_STYLE", "OPEN_TAG_NAME", "OPEN_TAG_WS", "CLOSE_TAG_NAME", "CLOSE_TAG_END", 
			"CLOSE_TAG_WS", "OPEN_STYLE_END", "OPEN_STYLE_TAG_WS", "CLOSE_STYLE", 
			"CLOSE_STYLE_END", "CLOSE_STYLE_TAG_WS", "STYLE_ATTR", "ATTR_NAME", "ATTR_EQ", 
			"SELF_CLOSING_TAG_END", "OPEN_TAG_END", "ATTR_WS", "STRING_DQUOTE", "STRING_SQUOTE", 
			"ATTR_VALUE_UNQUOTED", "ATTR_VAL_WS", "CLOSE_STYLE_START", "CSS_SELECTOR_ID", 
			"CSS_SELECTOR_CLASS", "CSS_SELECTOR_ELEMENT", "CSS_LBRACE", "STYLE_EXIT_RAB", 
			"CSS_WS", "CSS_INLINE_EQ", "CSS_INLINE_DQUOT_START", "CSS_INLINE_WS", 
			"BLK_PROP_NAME", "BLK_COLON", "BLK_RBRACE", "BLK_WS", "CSS_INLINE_PROP_NAME", 
			"CSS_INLINE_PROP_COLON", "CSS_INLINE_PROP_DQUOT_END", "CSS_INLINE_PROP_WS", 
			"CSS_PROP_VAL", "CSS_PROP_SEMICOLON", "CSS_PROP_VALUES_WS"
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
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(templateParser.EOF, 0); }
		public List<TerminalNode> HTML_TEXT() { return getTokens(templateParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(templateParser.HTML_TEXT, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(templateParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(templateParser.COMMENT, i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0)) {
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_TEXT:
					{
					setState(38);
					match(HTML_TEXT);
					}
					break;
				case COMMENT:
					{
					setState(39);
					match(COMMENT);
					}
					break;
				case OPEN_TAG_START:
					{
					setState(40);
					element();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
	public static class ElementContext extends ParserRuleContext {
		public StyleElementContext styleElement() {
			return getRuleContext(StyleElementContext.class,0);
		}
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				styleElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				openTag();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0)) {
					{
					{
					setState(50);
					content();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				closeTag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				selfClosingTag();
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
	public static class ContentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode HTML_TEXT() { return getToken(templateParser.HTML_TEXT, 0); }
		public TerminalNode COMMENT() { return getToken(templateParser.COMMENT, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				element();
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(HTML_TEXT);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(COMMENT);
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
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_START() { return getToken(templateParser.OPEN_TAG_START, 0); }
		public TerminalNode OPEN_TAG_NAME() { return getToken(templateParser.OPEN_TAG_NAME, 0); }
		public TerminalNode OPEN_TAG_END() { return getToken(templateParser.OPEN_TAG_END, 0); }
		public List<AtrributeContext> atrribute() {
			return getRuleContexts(AtrributeContext.class);
		}
		public AtrributeContext atrribute(int i) {
			return getRuleContext(AtrributeContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(OPEN_TAG_START);
			setState(67);
			match(OPEN_TAG_NAME);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE_ATTR || _la==ATTR_NAME) {
				{
				{
				setState(68);
				atrribute();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(OPEN_TAG_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode CLOSE_TAG_START() { return getToken(templateParser.CLOSE_TAG_START, 0); }
		public TerminalNode CLOSE_TAG_NAME() { return getToken(templateParser.CLOSE_TAG_NAME, 0); }
		public TerminalNode CLOSE_TAG_END() { return getToken(templateParser.CLOSE_TAG_END, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CLOSE_TAG_START);
			setState(77);
			match(CLOSE_TAG_NAME);
			setState(78);
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
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_START() { return getToken(templateParser.OPEN_TAG_START, 0); }
		public TerminalNode OPEN_TAG_NAME() { return getToken(templateParser.OPEN_TAG_NAME, 0); }
		public TerminalNode SELF_CLOSING_TAG_END() { return getToken(templateParser.SELF_CLOSING_TAG_END, 0); }
		public List<AtrributeContext> atrribute() {
			return getRuleContexts(AtrributeContext.class);
		}
		public AtrributeContext atrribute(int i) {
			return getRuleContext(AtrributeContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(OPEN_TAG_START);
			setState(81);
			match(OPEN_TAG_NAME);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE_ATTR || _la==ATTR_NAME) {
				{
				{
				setState(82);
				atrribute();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(88);
			match(SELF_CLOSING_TAG_END);
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
	public static class AtrributeContext extends ParserRuleContext {
		public HtmlStyleAttrContext htmlStyleAttr() {
			return getRuleContext(HtmlStyleAttrContext.class,0);
		}
		public TerminalNode ATTR_NAME() { return getToken(templateParser.ATTR_NAME, 0); }
		public TerminalNode ATTR_EQ() { return getToken(templateParser.ATTR_EQ, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public AtrributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterAtrribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitAtrribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitAtrribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrributeContext atrribute() throws RecognitionException {
		AtrributeContext _localctx = new AtrributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atrribute);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				htmlStyleAttr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(ATTR_NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(ATTR_NAME);
				setState(93);
				match(ATTR_EQ);
				setState(94);
				attrValue();
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
	public static class AttrValueContext extends ParserRuleContext {
		public TerminalNode STRING_DQUOTE() { return getToken(templateParser.STRING_DQUOTE, 0); }
		public TerminalNode STRING_SQUOTE() { return getToken(templateParser.STRING_SQUOTE, 0); }
		public TerminalNode ATTR_VALUE_UNQUOTED() { return getToken(templateParser.ATTR_VALUE_UNQUOTED, 0); }
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
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
	public static class HtmlStyleAttrContext extends ParserRuleContext {
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
		public HtmlStyleAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlStyleAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterHtmlStyleAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitHtmlStyleAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitHtmlStyleAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlStyleAttrContext htmlStyleAttr() throws RecognitionException {
		HtmlStyleAttrContext _localctx = new HtmlStyleAttrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlStyleAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(STYLE_ATTR);
			setState(100);
			match(CSS_INLINE_EQ);
			setState(101);
			match(CSS_INLINE_DQUOT_START);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_INLINE_PROP_NAME) {
				{
				{
				setState(102);
				inlineStyleProp();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		enterRule(_localctx, 18, RULE_inlineStyleProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(CSS_INLINE_PROP_NAME);
			setState(111);
			match(CSS_INLINE_PROP_COLON);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				inlineStylePropValues();
				}
				}
				setState(115); 
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
		enterRule(_localctx, 20, RULE_inlineStylePropValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				match(CSS_PROP_VAL);
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(122);
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
	public static class StyleElementContext extends ParserRuleContext {
		public OpenStyleTagContext openStyleTag() {
			return getRuleContext(OpenStyleTagContext.class,0);
		}
		public CloseStyleTagContext closeStyleTag() {
			return getRuleContext(CloseStyleTagContext.class,0);
		}
		public List<CssBlockDeclContext> cssBlockDecl() {
			return getRuleContexts(CssBlockDeclContext.class);
		}
		public CssBlockDeclContext cssBlockDecl(int i) {
			return getRuleContext(CssBlockDeclContext.class,i);
		}
		public StyleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementContext styleElement() throws RecognitionException {
		StyleElementContext _localctx = new StyleElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_styleElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			openStyleTag();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) {
				{
				{
				setState(125);
				cssBlockDecl();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			closeStyleTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenStyleTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_START() { return getToken(templateParser.OPEN_TAG_START, 0); }
		public TerminalNode OPEN_STYLE() { return getToken(templateParser.OPEN_STYLE, 0); }
		public TerminalNode OPEN_STYLE_END() { return getToken(templateParser.OPEN_STYLE_END, 0); }
		public OpenStyleTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openStyleTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterOpenStyleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitOpenStyleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitOpenStyleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenStyleTagContext openStyleTag() throws RecognitionException {
		OpenStyleTagContext _localctx = new OpenStyleTagContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_openStyleTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(OPEN_TAG_START);
			setState(134);
			match(OPEN_STYLE);
			setState(135);
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
	public static class CloseStyleTagContext extends ParserRuleContext {
		public TerminalNode CLOSE_STYLE_START() { return getToken(templateParser.CLOSE_STYLE_START, 0); }
		public TerminalNode CLOSE_STYLE() { return getToken(templateParser.CLOSE_STYLE, 0); }
		public TerminalNode CLOSE_STYLE_END() { return getToken(templateParser.CLOSE_STYLE_END, 0); }
		public CloseStyleTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeStyleTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCloseStyleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCloseStyleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCloseStyleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseStyleTagContext closeStyleTag() throws RecognitionException {
		CloseStyleTagContext _localctx = new CloseStyleTagContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_closeStyleTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(CLOSE_STYLE_START);
			setState(138);
			match(CLOSE_STYLE);
			setState(139);
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
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
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
		enterRule(_localctx, 28, RULE_cssBlockDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			selector();
			setState(142);
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
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SELECTOR_IDContext extends SelectorContext {
		public TerminalNode CSS_SELECTOR_ID() { return getToken(templateParser.CSS_SELECTOR_ID, 0); }
		public CSS_SELECTOR_IDContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SELECTOR_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SELECTOR_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SELECTOR_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SELECTOR_ELEMENTContext extends SelectorContext {
		public TerminalNode CSS_SELECTOR_ELEMENT() { return getToken(templateParser.CSS_SELECTOR_ELEMENT, 0); }
		public CSS_SELECTOR_ELEMENTContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SELECTOR_ELEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SELECTOR_ELEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SELECTOR_ELEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSS_SELECTOR_CLASSContext extends SelectorContext {
		public TerminalNode CSS_SELECTOR_CLASS() { return getToken(templateParser.CSS_SELECTOR_CLASS, 0); }
		public CSS_SELECTOR_CLASSContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterCSS_SELECTOR_CLASS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitCSS_SELECTOR_CLASS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitCSS_SELECTOR_CLASS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selector);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_SELECTOR_ID:
				_localctx = new CSS_SELECTOR_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(CSS_SELECTOR_ID);
				}
				break;
			case CSS_SELECTOR_CLASS:
				_localctx = new CSS_SELECTOR_CLASSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(CSS_SELECTOR_CLASS);
				}
				break;
			case CSS_SELECTOR_ELEMENT:
				_localctx = new CSS_SELECTOR_ELEMENTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(CSS_SELECTOR_ELEMENT);
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
	public static class CssBlockContext extends ParserRuleContext {
		public TerminalNode CSS_LBRACE() { return getToken(templateParser.CSS_LBRACE, 0); }
		public TerminalNode BLK_RBRACE() { return getToken(templateParser.BLK_RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
		enterRule(_localctx, 32, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CSS_LBRACE);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLK_PROP_NAME) {
				{
				{
				setState(150);
				declaration();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode BLK_PROP_NAME() { return getToken(templateParser.BLK_PROP_NAME, 0); }
		public TerminalNode BLK_COLON() { return getToken(templateParser.BLK_COLON, 0); }
		public BlkPropValContext blkPropVal() {
			return getRuleContext(BlkPropValContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(BLK_PROP_NAME);
			setState(159);
			match(BLK_COLON);
			setState(160);
			blkPropVal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlkPropValContext extends ParserRuleContext {
		public TerminalNode CSS_PROP_SEMICOLON() { return getToken(templateParser.CSS_PROP_SEMICOLON, 0); }
		public List<TerminalNode> CSS_PROP_VAL() { return getTokens(templateParser.CSS_PROP_VAL); }
		public TerminalNode CSS_PROP_VAL(int i) {
			return getToken(templateParser.CSS_PROP_VAL, i);
		}
		public BlkPropValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blkPropVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).enterBlkPropVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof templateParserListener ) ((templateParserListener)listener).exitBlkPropVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof templateParserVisitor ) return ((templateParserVisitor<? extends T>)visitor).visitBlkPropVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlkPropValContext blkPropVal() throws RecognitionException {
		BlkPropValContext _localctx = new BlkPropValContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blkPropVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				match(CSS_PROP_VAL);
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_PROP_VAL );
			setState(167);
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
		"\u0004\u0001/\u00aa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005T\b\u0005\n\u0005\f\u0005W\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"`\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\bh\b\b\n\b\f\bk\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0004\tr"+
		"\b\t\u000b\t\f\ts\u0001\n\u0004\nw\b\n\u000b\n\f\nx\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u007f\b\u000b\n\u000b\f\u000b\u0082\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0094\b\u000f\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0098\b\u0010\n\u0010\f\u0010\u009b\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012"+
		"\u00a4\b\u0012\u000b\u0012\f\u0012\u00a5\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0001\u0001\u0000\u0017"+
		"\u0019\u00aa\u0000+\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000"+
		"\u0004@\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bL\u0001"+
		"\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000"+
		"\u000ea\u0001\u0000\u0000\u0000\u0010c\u0001\u0000\u0000\u0000\u0012n"+
		"\u0001\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000\u0016|\u0001\u0000"+
		"\u0000\u0000\u0018\u0085\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000"+
		"\u0000\u0000\u001c\u008d\u0001\u0000\u0000\u0000\u001e\u0093\u0001\u0000"+
		"\u0000\u0000 \u0095\u0001\u0000\u0000\u0000\"\u009e\u0001\u0000\u0000"+
		"\u0000$\u00a3\u0001\u0000\u0000\u0000&*\u0005\u0001\u0000\u0000\'*\u0005"+
		"\u0003\u0000\u0000(*\u0003\u0002\u0001\u0000)&\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000\u0000\u0001/\u0001"+
		"\u0001\u0000\u0000\u00000<\u0003\u0016\u000b\u000015\u0003\u0006\u0003"+
		"\u000024\u0003\u0004\u0002\u000032\u0001\u0000\u0000\u000047\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0003\b\u0004\u00009<\u0001"+
		"\u0000\u0000\u0000:<\u0003\n\u0005\u0000;0\u0001\u0000\u0000\u0000;1\u0001"+
		"\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0003\u0001\u0000\u0000"+
		"\u0000=A\u0003\u0002\u0001\u0000>A\u0005\u0001\u0000\u0000?A\u0005\u0003"+
		"\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u0004\u0000"+
		"\u0000CG\u0005\u0007\u0000\u0000DF\u0003\f\u0006\u0000ED\u0001\u0000\u0000"+
		"\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0015\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005\u0002\u0000"+
		"\u0000MN\u0005\t\u0000\u0000NO\u0005\n\u0000\u0000O\t\u0001\u0000\u0000"+
		"\u0000PQ\u0005\u0004\u0000\u0000QU\u0005\u0007\u0000\u0000RT\u0003\f\u0006"+
		"\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000XY\u0005\u0014\u0000\u0000Y\u000b\u0001\u0000\u0000"+
		"\u0000Z`\u0003\u0010\b\u0000[`\u0005\u0012\u0000\u0000\\]\u0005\u0012"+
		"\u0000\u0000]^\u0005\u0013\u0000\u0000^`\u0003\u000e\u0007\u0000_Z\u0001"+
		"\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000"+
		"`\r\u0001\u0000\u0000\u0000ab\u0007\u0000\u0000\u0000b\u000f\u0001\u0000"+
		"\u0000\u0000cd\u0005\u0011\u0000\u0000de\u0005\"\u0000\u0000ei\u0005#"+
		"\u0000\u0000fh\u0003\u0012\t\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005+\u0000\u0000m\u0011"+
		"\u0001\u0000\u0000\u0000no\u0005)\u0000\u0000oq\u0005*\u0000\u0000pr\u0003"+
		"\u0014\n\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0013\u0001\u0000\u0000"+
		"\u0000uw\u0005-\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0005.\u0000\u0000{\u0015\u0001\u0000\u0000\u0000|\u0080"+
		"\u0003\u0018\f\u0000}\u007f\u0003\u001c\u000e\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0003\u001a\r\u0000\u0084"+
		"\u0017\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0004\u0000\u0000\u0086"+
		"\u0087\u0005\u0006\u0000\u0000\u0087\u0088\u0005\f\u0000\u0000\u0088\u0019"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u001b\u0000\u0000\u008a\u008b"+
		"\u0005\u000e\u0000\u0000\u008b\u008c\u0005\u000f\u0000\u0000\u008c\u001b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u001e\u000f\u0000\u008e\u008f"+
		"\u0003 \u0010\u0000\u008f\u001d\u0001\u0000\u0000\u0000\u0090\u0094\u0005"+
		"\u001c\u0000\u0000\u0091\u0094\u0005\u001d\u0000\u0000\u0092\u0094\u0005"+
		"\u001e\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u001f\u0001"+
		"\u0000\u0000\u0000\u0095\u0099\u0005\u001f\u0000\u0000\u0096\u0098\u0003"+
		"\"\u0011\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\'\u0000\u0000\u009d!\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005%\u0000\u0000\u009f\u00a0\u0005&\u0000\u0000\u00a0"+
		"\u00a1\u0003$\u0012\u0000\u00a1#\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005"+
		"-\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005.\u0000"+
		"\u0000\u00a8%\u0001\u0000\u0000\u0000\u000f)+5;@GU_isx\u0080\u0093\u0099"+
		"\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}