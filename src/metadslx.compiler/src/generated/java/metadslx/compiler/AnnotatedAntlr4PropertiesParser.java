// Generated from AnnotatedAntlr4PropertiesParser.g4 by ANTLR 4.5.1
package metadslx.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnnotatedAntlr4PropertiesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, TRUE=2, FALSE=3, NULL=4, COLON=5, COLONCOLON=6, COMMA=7, 
		SEMI=8, LPAREN=9, RPAREN=10, LT=11, GT=12, ASSIGN=13, QUESTION=14, STAR=15, 
		PLUS=16, OR=17, DOLLAR=18, DOT=19, AT=20, POUND=21, NOT=22, LBRACE=23, 
		RBRACE=24, LBRACKET=25, RBRACKET=26, ID=27, INTEGER_LITERAL=28, DECIMAL_LITERAL=29, 
		SCIENTIFIC_LITERAL=30, STRING_LITERAL=31, UNTERMINATED_STRING_LITERAL=32, 
		WS=33, ERRCHAR=34, DOC_COMMENT=35, BLOCK_COMMENT=36;
	public static final int
		RULE_propertiesBlock = 0, RULE_propertyAssignment = 1, RULE_qualifiedProperty = 2, 
		RULE_propertySelector = 3, RULE_expressionList = 4, RULE_expression = 5, 
		RULE_functionCall = 6, RULE_literal = 7, RULE_identifier = 8, RULE_booleanLiteral = 9, 
		RULE_nullLiteral = 10;
	public static final String[] ruleNames = {
		"propertiesBlock", "propertyAssignment", "qualifiedProperty", "propertySelector", 
		"expressionList", "expression", "functionCall", "literal", "identifier", 
		"booleanLiteral", "nullLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'true'", "'false'", "'null'", "':'", "'::'", "','", "';'", 
		"'('", "')'", "'<'", "'>'", "'='", "'?'", null, "'+'", "'|'", "'$'", "'.'", 
		"'@'", "'#'", "'~'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LINE_COMMENT", "TRUE", "FALSE", "NULL", "COLON", "COLONCOLON", 
		"COMMA", "SEMI", "LPAREN", "RPAREN", "LT", "GT", "ASSIGN", "QUESTION", 
		"STAR", "PLUS", "OR", "DOLLAR", "DOT", "AT", "POUND", "NOT", "LBRACE", 
		"RBRACE", "LBRACKET", "RBRACKET", "ID", "INTEGER_LITERAL", "DECIMAL_LITERAL", 
		"SCIENTIFIC_LITERAL", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
		"WS", "ERRCHAR", "DOC_COMMENT", "BLOCK_COMMENT"
	};
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
	public String getGrammarFileName() { return "AnnotatedAntlr4PropertiesParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AnnotatedAntlr4PropertiesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PropertiesBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AnnotatedAntlr4PropertiesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AnnotatedAntlr4PropertiesParser.RBRACE, 0); }
		public TerminalNode EOF() { return getToken(AnnotatedAntlr4PropertiesParser.EOF, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public PropertiesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterPropertiesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitPropertiesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitPropertiesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesBlockContext propertiesBlock() throws RecognitionException {
		PropertiesBlockContext _localctx = new PropertiesBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_propertiesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(LBRACE);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(23);
				propertyAssignment();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(RBRACE);
			setState(30);
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public QualifiedPropertyContext qualifiedProperty() {
			return getRuleContext(QualifiedPropertyContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AnnotatedAntlr4PropertiesParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AnnotatedAntlr4PropertiesParser.SEMI, 0); }
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			qualifiedProperty();
			setState(33);
			match(ASSIGN);
			setState(34);
			expression();
			setState(35);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedPropertyContext extends ParserRuleContext {
		public IdentifierContext scope;
		public List<PropertySelectorContext> propertySelector() {
			return getRuleContexts(PropertySelectorContext.class);
		}
		public PropertySelectorContext propertySelector(int i) {
			return getRuleContext(PropertySelectorContext.class,i);
		}
		public TerminalNode COLONCOLON() { return getToken(AnnotatedAntlr4PropertiesParser.COLONCOLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(AnnotatedAntlr4PropertiesParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AnnotatedAntlr4PropertiesParser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterQualifiedProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitQualifiedProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitQualifiedProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPropertyContext qualifiedProperty() throws RecognitionException {
		QualifiedPropertyContext _localctx = new QualifiedPropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qualifiedProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				((QualifiedPropertyContext)_localctx).scope = identifier();
				setState(38);
				match(COLONCOLON);
				}
				break;
			}
			setState(42);
			propertySelector();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(43);
				match(DOT);
				setState(44);
				propertySelector();
				}
				}
				setState(49);
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

	public static class PropertySelectorContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext selector;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(AnnotatedAntlr4PropertiesParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(AnnotatedAntlr4PropertiesParser.RBRACKET, 0); }
		public PropertySelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterPropertySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitPropertySelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitPropertySelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySelectorContext propertySelector() throws RecognitionException {
		PropertySelectorContext _localctx = new PropertySelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_propertySelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((PropertySelectorContext)_localctx).name = identifier();
			setState(55);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(51);
				match(LBRACKET);
				setState(52);
				((PropertySelectorContext)_localctx).selector = identifier();
				setState(53);
				match(RBRACKET);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AnnotatedAntlr4PropertiesParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AnnotatedAntlr4PropertiesParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AnnotatedAntlr4PropertiesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnnotatedAntlr4PropertiesParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LPAREN);
			setState(58);
			expression();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);
				setState(60);
				expression();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public QualifiedPropertyContext qualifiedProperty() {
			return getRuleContext(QualifiedPropertyContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				qualifiedProperty();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				functionCall();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			identifier();
			setState(74);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(AnnotatedAntlr4PropertiesParser.INTEGER_LITERAL, 0); }
		public TerminalNode SCIENTIFIC_LITERAL() { return getToken(AnnotatedAntlr4PropertiesParser.SCIENTIFIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AnnotatedAntlr4PropertiesParser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_literal);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				nullLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				booleanLiteral();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(INTEGER_LITERAL);
				}
				break;
			case SCIENTIFIC_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(SCIENTIFIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(STRING_LITERAL);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AnnotatedAntlr4PropertiesParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AnnotatedAntlr4PropertiesParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AnnotatedAntlr4PropertiesParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(AnnotatedAntlr4PropertiesParser.NULL, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4PropertiesParserListener ) ((AnnotatedAntlr4PropertiesParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4PropertiesParserVisitor ) return ((AnnotatedAntlr4PropertiesParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\\\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4\3\5"+
		"\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\5\7J\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tT\n\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\4"+
		"\5[\2\30\3\2\2\2\4\"\3\2\2\2\6*\3\2\2\2\b\64\3\2\2\2\n;\3\2\2\2\fI\3\2"+
		"\2\2\16K\3\2\2\2\20S\3\2\2\2\22U\3\2\2\2\24W\3\2\2\2\26Y\3\2\2\2\30\34"+
		"\7\31\2\2\31\33\5\4\3\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\32\2\2 !\7\2\2\3!\3\3\2\2\2"+
		"\"#\5\6\4\2#$\7\17\2\2$%\5\f\7\2%&\7\n\2\2&\5\3\2\2\2\'(\5\22\n\2()\7"+
		"\b\2\2)+\3\2\2\2*\'\3\2\2\2*+\3\2\2\2+,\3\2\2\2,\61\5\b\5\2-.\7\25\2\2"+
		".\60\5\b\5\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\7\3"+
		"\2\2\2\63\61\3\2\2\2\649\5\22\n\2\65\66\7\33\2\2\66\67\5\22\n\2\678\7"+
		"\34\2\28:\3\2\2\29\65\3\2\2\29:\3\2\2\2:\t\3\2\2\2;<\7\13\2\2<A\5\f\7"+
		"\2=>\7\t\2\2>@\5\f\7\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2"+
		"\2CA\3\2\2\2DE\7\f\2\2E\13\3\2\2\2FJ\5\20\t\2GJ\5\6\4\2HJ\5\16\b\2IF\3"+
		"\2\2\2IG\3\2\2\2IH\3\2\2\2J\r\3\2\2\2KL\5\22\n\2LM\5\n\6\2M\17\3\2\2\2"+
		"NT\5\26\f\2OT\5\24\13\2PT\7\36\2\2QT\7 \2\2RT\7!\2\2SN\3\2\2\2SO\3\2\2"+
		"\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\21\3\2\2\2UV\7\35\2\2V\23\3\2\2\2WX"+
		"\t\2\2\2X\25\3\2\2\2YZ\7\6\2\2Z\27\3\2\2\2\t\34*\619AIS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}