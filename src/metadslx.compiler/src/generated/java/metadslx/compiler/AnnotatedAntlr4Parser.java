// Generated from AnnotatedAntlr4Parser.g4 by ANTLR 4.5.1
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
public class AnnotatedAntlr4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, LINE_COMMENT=4, BEGIN_ARG_ACTION=5, 
		OPTIONS=6, TOKENS=7, IMPORT=8, FRAGMENT=9, LEXER=10, PARSER=11, GRAMMAR=12, 
		PROTECTED=13, PUBLIC=14, PRIVATE=15, RETURNS=16, LOCALS=17, THROWS=18, 
		CATCH=19, FINALLY=20, MODE=21, TRUE=22, FALSE=23, NULL=24, COLON=25, COLONCOLON=26, 
		COMMA=27, SEMI=28, LPAREN=29, RPAREN=30, RARROW=31, DRARROW=32, LT=33, 
		GT=34, ASSIGN=35, QUESTION=36, STAR=37, PLUS=38, PLUS_ASSIGN=39, OR=40, 
		DOLLAR=41, DOT=42, RANGE=43, AT=44, POUND=45, NOT=46, LBRACE=47, RBRACE=48, 
		LBRACKET=49, RBRACKET=50, ID=51, INTEGER_LITERAL=52, DECIMAL_LITERAL=53, 
		SCIENTIFIC_LITERAL=54, STRING_LITERAL=55, UNTERMINATED_STRING_LITERAL=56, 
		WS=57, ACTION=58, ERRCHAR=59, ARG_ACTION=60, UNTERMINATED_ARG_ACTION=61, 
		UNTERMINATED_CHAR_SET=62, DOC_COMMENT=63, BLOCK_COMMENT=64;
	public static final int
		RULE_grammarSpec = 0, RULE_grammarType = 1, RULE_prequelConstruct = 2, 
		RULE_optionsSpec = 3, RULE_option = 4, RULE_optionValue = 5, RULE_delegateGrammars = 6, 
		RULE_delegateGrammar = 7, RULE_tokensSpec = 8, RULE_annotatedId = 9, RULE_action = 10, 
		RULE_actionScopeName = 11, RULE_modeSpec = 12, RULE_rules = 13, RULE_ruleSpec = 14, 
		RULE_parserRuleSpec = 15, RULE_exceptionGroup = 16, RULE_exceptionHandler = 17, 
		RULE_finallyClause = 18, RULE_rulePrequel = 19, RULE_ruleReturns = 20, 
		RULE_throwsSpec = 21, RULE_localsSpec = 22, RULE_ruleAction = 23, RULE_ruleModifiers = 24, 
		RULE_ruleModifier = 25, RULE_ruleBlock = 26, RULE_ruleAltList = 27, RULE_labeledAlt = 28, 
		RULE_propertiesBlock = 29, RULE_lexerRule = 30, RULE_lexerRuleBlock = 31, 
		RULE_lexerAltList = 32, RULE_lexerAlt = 33, RULE_lexerElements = 34, RULE_lexerElement = 35, 
		RULE_labeledLexerElement = 36, RULE_lexerBlock = 37, RULE_lexerCommands = 38, 
		RULE_lexerCommand = 39, RULE_lexerCommandName = 40, RULE_lexerCommandExpr = 41, 
		RULE_altList = 42, RULE_alternative = 43, RULE_element = 44, RULE_labeledElement = 45, 
		RULE_ebnf = 46, RULE_blockSuffix = 47, RULE_ebnfSuffix = 48, RULE_lexerAtom = 49, 
		RULE_atom = 50, RULE_notSet = 51, RULE_blockSet = 52, RULE_setElement = 53, 
		RULE_block = 54, RULE_ruleref = 55, RULE_range = 56, RULE_terminal = 57, 
		RULE_elementOptions = 58, RULE_elementOption = 59, RULE_id = 60, RULE_annotation = 61, 
		RULE_annotationBody = 62, RULE_annotationAttributeList = 63, RULE_annotationAttribute = 64, 
		RULE_expressionList = 65, RULE_qualifiedName = 66, RULE_expression = 67, 
		RULE_literal = 68, RULE_identifier = 69, RULE_boolLiteral = 70, RULE_nullLiteral = 71;
	public static final String[] ruleNames = {
		"grammarSpec", "grammarType", "prequelConstruct", "optionsSpec", "option", 
		"optionValue", "delegateGrammars", "delegateGrammar", "tokensSpec", "annotatedId", 
		"action", "actionScopeName", "modeSpec", "rules", "ruleSpec", "parserRuleSpec", 
		"exceptionGroup", "exceptionHandler", "finallyClause", "rulePrequel", 
		"ruleReturns", "throwsSpec", "localsSpec", "ruleAction", "ruleModifiers", 
		"ruleModifier", "ruleBlock", "ruleAltList", "labeledAlt", "propertiesBlock", 
		"lexerRule", "lexerRuleBlock", "lexerAltList", "lexerAlt", "lexerElements", 
		"lexerElement", "labeledLexerElement", "lexerBlock", "lexerCommands", 
		"lexerCommand", "lexerCommandName", "lexerCommandExpr", "altList", "alternative", 
		"element", "labeledElement", "ebnf", "blockSuffix", "ebnfSuffix", "lexerAtom", 
		"atom", "notSet", "blockSet", "setElement", "block", "ruleref", "range", 
		"terminal", "elementOptions", "elementOption", "id", "annotation", "annotationBody", 
		"annotationAttributeList", "annotationAttribute", "expressionList", "qualifiedName", 
		"expression", "literal", "identifier", "boolLiteral", "nullLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'import'", "'fragment'", 
		"'lexer'", "'parser'", "'grammar'", "'protected'", "'public'", "'private'", 
		"'returns'", "'locals'", "'throws'", "'catch'", "'finally'", "'mode'", 
		"'true'", "'false'", "'null'", "':'", "'::'", "','", "';'", "'('", "')'", 
		"'->'", "'=>'", "'<'", "'>'", "'='", "'?'", null, "'+'", "'+='", "'|'", 
		"'$'", "'.'", "'..'", "'@'", "'#'", "'~'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "LINE_COMMENT", "BEGIN_ARG_ACTION", 
		"OPTIONS", "TOKENS", "IMPORT", "FRAGMENT", "LEXER", "PARSER", "GRAMMAR", 
		"PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", "LOCALS", "THROWS", "CATCH", 
		"FINALLY", "MODE", "TRUE", "FALSE", "NULL", "COLON", "COLONCOLON", "COMMA", 
		"SEMI", "LPAREN", "RPAREN", "RARROW", "DRARROW", "LT", "GT", "ASSIGN", 
		"QUESTION", "STAR", "PLUS", "PLUS_ASSIGN", "OR", "DOLLAR", "DOT", "RANGE", 
		"AT", "POUND", "NOT", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "ID", 
		"INTEGER_LITERAL", "DECIMAL_LITERAL", "SCIENTIFIC_LITERAL", "STRING_LITERAL", 
		"UNTERMINATED_STRING_LITERAL", "WS", "ACTION", "ERRCHAR", "ARG_ACTION", 
		"UNTERMINATED_ARG_ACTION", "UNTERMINATED_CHAR_SET", "DOC_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "AnnotatedAntlr4Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AnnotatedAntlr4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarSpecContext extends ParserRuleContext {
		public GrammarTypeContext grammarType() {
			return getRuleContext(GrammarTypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AnnotatedAntlr4Parser.SEMI, 0); }
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AnnotatedAntlr4Parser.EOF, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(AnnotatedAntlr4Parser.DOC_COMMENT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<PrequelConstructContext> prequelConstruct() {
			return getRuleContexts(PrequelConstructContext.class);
		}
		public PrequelConstructContext prequelConstruct(int i) {
			return getRuleContext(PrequelConstructContext.class,i);
		}
		public List<ModeSpecContext> modeSpec() {
			return getRuleContexts(ModeSpecContext.class);
		}
		public ModeSpecContext modeSpec(int i) {
			return getRuleContext(ModeSpecContext.class,i);
		}
		public GrammarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterGrammarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitGrammarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitGrammarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarSpecContext grammarSpec() throws RecognitionException {
		GrammarSpecContext _localctx = new GrammarSpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(144);
				match(DOC_COMMENT);
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOLLAR) {
				{
				{
				setState(147);
				annotation();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			grammarType();
			setState(154);
			id();
			setState(155);
			match(SEMI);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << TOKENS) | (1L << IMPORT) | (1L << AT))) != 0)) {
				{
				{
				setState(156);
				prequelConstruct();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			rules();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODE || _la==DOLLAR) {
				{
				{
				setState(163);
				modeSpec();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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

	public static class GrammarTypeContext extends ParserRuleContext {
		public TerminalNode LEXER() { return getToken(AnnotatedAntlr4Parser.LEXER, 0); }
		public TerminalNode GRAMMAR() { return getToken(AnnotatedAntlr4Parser.GRAMMAR, 0); }
		public TerminalNode PARSER() { return getToken(AnnotatedAntlr4Parser.PARSER, 0); }
		public GrammarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterGrammarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitGrammarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitGrammarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarTypeContext grammarType() throws RecognitionException {
		GrammarTypeContext _localctx = new GrammarTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			switch (_input.LA(1)) {
			case LEXER:
				{
				setState(171);
				match(LEXER);
				setState(172);
				match(GRAMMAR);
				}
				break;
			case PARSER:
				{
				setState(173);
				match(PARSER);
				setState(174);
				match(GRAMMAR);
				}
				break;
			case GRAMMAR:
				{
				setState(175);
				match(GRAMMAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrequelConstructContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public DelegateGrammarsContext delegateGrammars() {
			return getRuleContext(DelegateGrammarsContext.class,0);
		}
		public TokensSpecContext tokensSpec() {
			return getRuleContext(TokensSpecContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public PrequelConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prequelConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterPrequelConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitPrequelConstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitPrequelConstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrequelConstructContext prequelConstruct() throws RecognitionException {
		PrequelConstructContext _localctx = new PrequelConstructContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prequelConstruct);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				optionsSpec();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				delegateGrammars();
				}
				break;
			case TOKENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				tokensSpec();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				action();
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

	public static class OptionsSpecContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(AnnotatedAntlr4Parser.OPTIONS, 0); }
		public TerminalNode RBRACE() { return getToken(AnnotatedAntlr4Parser.RBRACE, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public OptionsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterOptionsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitOptionsSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitOptionsSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsSpecContext optionsSpec() throws RecognitionException {
		OptionsSpecContext _localctx = new OptionsSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_optionsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(OPTIONS);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_REF || _la==RULE_REF) {
				{
				{
				setState(185);
				option();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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

	public static class OptionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AnnotatedAntlr4Parser.ASSIGN, 0); }
		public OptionValueContext optionValue() {
			return getRuleContext(OptionValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AnnotatedAntlr4Parser.SEMI, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			id();
			setState(194);
			match(ASSIGN);
			setState(195);
			optionValue();
			setState(196);
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

	public static class OptionValueContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AnnotatedAntlr4Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AnnotatedAntlr4Parser.DOT, i);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(AnnotatedAntlr4Parser.STRING_LITERAL, 0); }
		public TerminalNode ACTION() { return getToken(AnnotatedAntlr4Parser.ACTION, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(AnnotatedAntlr4Parser.INTEGER_LITERAL, 0); }
		public OptionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterOptionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitOptionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitOptionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionValueContext optionValue() throws RecognitionException {
		OptionValueContext _localctx = new OptionValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optionValue);
		int _la;
		try {
			setState(211);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				id();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(199);
					match(DOT);
					setState(200);
					id();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				boolLiteral();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				nullLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(STRING_LITERAL);
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(ACTION);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(INTEGER_LITERAL);
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

	public static class DelegateGrammarsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AnnotatedAntlr4Parser.IMPORT, 0); }
		public List<DelegateGrammarContext> delegateGrammar() {
			return getRuleContexts(DelegateGrammarContext.class);
		}
		public DelegateGrammarContext delegateGrammar(int i) {
			return getRuleContext(DelegateGrammarContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(AnnotatedAntlr4Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AnnotatedAntlr4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnnotatedAntlr4Parser.COMMA, i);
		}
		public DelegateGrammarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterDelegateGrammars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitDelegateGrammars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitDelegateGrammars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegateGrammarsContext delegateGrammars() throws RecognitionException {
		DelegateGrammarsContext _localctx = new DelegateGrammarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delegateGrammars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IMPORT);
			setState(214);
			delegateGrammar();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				delegateGrammar();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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

	public static class DelegateGrammarContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(AnnotatedAntlr4Parser.ASSIGN, 0); }
		public DelegateGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterDelegateGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitDelegateGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitDelegateGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegateGrammarContext delegateGrammar() throws RecognitionException {
		DelegateGrammarContext _localctx = new DelegateGrammarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delegateGrammar);
		try {
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				id();
				setState(225);
				match(ASSIGN);
				setState(226);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				id();
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

	public static class TokensSpecContext extends ParserRuleContext {
		public TerminalNode TOKENS() { return getToken(AnnotatedAntlr4Parser.TOKENS, 0); }
		public List<AnnotatedIdContext> annotatedId() {
			return getRuleContexts(AnnotatedIdContext.class);
		}
		public AnnotatedIdContext annotatedId(int i) {
			return getRuleContext(AnnotatedIdContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AnnotatedAntlr4Parser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AnnotatedAntlr4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnnotatedAntlr4Parser.COMMA, i);
		}
		public TokensSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokensSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterTokensSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitTokensSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitTokensSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokensSpecContext tokensSpec() throws RecognitionException {
		TokensSpecContext _localctx = new TokensSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tokensSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(TOKENS);
			setState(232);
			annotatedId();
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(COMMA);
					setState(234);
					annotatedId();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(241);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(240);
				match(COMMA);
				}
			}

			setState(243);
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

	public static class AnnotatedIdContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotatedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterAnnotatedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitAnnotatedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitAnnotatedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedIdContext annotatedId() throws RecognitionException {
		AnnotatedIdContext _localctx = new AnnotatedIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_annotatedId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOLLAR) {
				{
				{
				setState(245);
				annotation();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AnnotatedAntlr4Parser.AT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(AnnotatedAntlr4Parser.ACTION, 0); }
		public ActionScopeNameContext actionScopeName() {
			return getRuleContext(ActionScopeNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(AnnotatedAntlr4Parser.COLONCOLON, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(AT);
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(254);
				actionScopeName();
				setState(255);
				match(COLONCOLON);
				}
				break;
			}
			setState(259);
			id();
			setState(260);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionScopeNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEXER() { return getToken(AnnotatedAntlr4Parser.LEXER, 0); }
		public TerminalNode PARSER() { return getToken(AnnotatedAntlr4Parser.PARSER, 0); }
		public ActionScopeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionScopeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterActionScopeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitActionScopeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitActionScopeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionScopeNameContext actionScopeName() throws RecognitionException {
		ActionScopeNameContext _localctx = new ActionScopeNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_actionScopeName);
		try {
			setState(265);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				id();
				}
				break;
			case LEXER:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(LEXER);
				}
				break;
			case PARSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(PARSER);
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

	public static class ModeSpecContext extends ParserRuleContext {
		public TerminalNode MODE() { return getToken(AnnotatedAntlr4Parser.MODE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AnnotatedAntlr4Parser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<LexerRuleContext> lexerRule() {
			return getRuleContexts(LexerRuleContext.class);
		}
		public LexerRuleContext lexerRule(int i) {
			return getRuleContext(LexerRuleContext.class,i);
		}
		public ModeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterModeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitModeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitModeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeSpecContext modeSpec() throws RecognitionException {
		ModeSpecContext _localctx = new ModeSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_modeSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOLLAR) {
				{
				{
				setState(267);
				annotation();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(MODE);
			setState(274);
			id();
			setState(275);
			match(SEMI);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					lexerRule();
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class RulesContext extends ParserRuleContext {
		public List<RuleSpecContext> ruleSpec() {
			return getRuleContexts(RuleSpecContext.class);
		}
		public RuleSpecContext ruleSpec(int i) {
			return getRuleContext(RuleSpecContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rules);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					ruleSpec();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class RuleSpecContext extends ParserRuleContext {
		public ParserRuleSpecContext parserRuleSpec() {
			return getRuleContext(ParserRuleSpecContext.class,0);
		}
		public LexerRuleContext lexerRule() {
			return getRuleContext(LexerRuleContext.class,0);
		}
		public RuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRuleSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRuleSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSpecContext ruleSpec() throws RecognitionException {
		RuleSpecContext _localctx = new RuleSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ruleSpec);
		try {
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				parserRuleSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				lexerRule();
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

	public static class ParserRuleSpecContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(AnnotatedAntlr4Parser.RULE_REF, 0); }
		public TerminalNode COLON() { return getToken(AnnotatedAntlr4Parser.COLON, 0); }
		public RuleBlockContext ruleBlock() {
			return getRuleContext(RuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AnnotatedAntlr4Parser.SEMI, 0); }
		public ExceptionGroupContext exceptionGroup() {
			return getRuleContext(ExceptionGroupContext.class,0);
		}
		public TerminalNode DOC_COMMENT() { return getToken(AnnotatedAntlr4Parser.DOC_COMMENT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public RuleModifiersContext ruleModifiers() {
			return getRuleContext(RuleModifiersContext.class,0);
		}
		public TerminalNode ARG_ACTION() { return getToken(AnnotatedAntlr4Parser.ARG_ACTION, 0); }
		public RuleReturnsContext ruleReturns() {
			return getRuleContext(RuleReturnsContext.class,0);
		}
		public ThrowsSpecContext throwsSpec() {
			return getRuleContext(ThrowsSpecContext.class,0);
		}
		public LocalsSpecContext localsSpec() {
			return getRuleContext(LocalsSpecContext.class,0);
		}
		public List<RulePrequelContext> rulePrequel() {
			return getRuleContexts(RulePrequelContext.class);
		}
		public RulePrequelContext rulePrequel(int i) {
			return getRuleContext(RulePrequelContext.class,i);
		}
		public ParserRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterParserRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitParserRuleSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitParserRuleSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserRuleSpecContext parserRuleSpec() throws RecognitionException {
		ParserRuleSpecContext _localctx = new ParserRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parserRuleSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(292);
				match(DOC_COMMENT);
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOLLAR) {
				{
				{
				setState(295);
				annotation();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				setState(301);
				ruleModifiers();
				}
			}

			setState(304);
			match(RULE_REF);
			setState(306);
			_la = _input.LA(1);
			if (_la==ARG_ACTION) {
				{
				setState(305);
				match(ARG_ACTION);
				}
			}

			setState(309);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(308);
				ruleReturns();
				}
			}

			setState(312);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(311);
				throwsSpec();
				}
			}

			setState(315);
			_la = _input.LA(1);
			if (_la==LOCALS) {
				{
				setState(314);
				localsSpec();
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPTIONS || _la==AT) {
				{
				{
				setState(317);
				rulePrequel();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(COLON);
			setState(324);
			ruleBlock();
			setState(325);
			match(SEMI);
			setState(326);
			exceptionGroup();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionGroupContext extends ParserRuleContext {
		public List<ExceptionHandlerContext> exceptionHandler() {
			return getRuleContexts(ExceptionHandlerContext.class);
		}
		public ExceptionHandlerContext exceptionHandler(int i) {
			return getRuleContext(ExceptionHandlerContext.class,i);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public ExceptionGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterExceptionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitExceptionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitExceptionGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionGroupContext exceptionGroup() throws RecognitionException {
		ExceptionGroupContext _localctx = new ExceptionGroupContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exceptionGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(328);
				exceptionHandler();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(334);
				finallyClause();
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

	public static class ExceptionHandlerContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(AnnotatedAntlr4Parser.CATCH, 0); }
		public TerminalNode ARG_ACTION() { return getToken(AnnotatedAntlr4Parser.ARG_ACTION, 0); }
		public TerminalNode ACTION() { return getToken(AnnotatedAntlr4Parser.ACTION, 0); }
		public ExceptionHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterExceptionHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitExceptionHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitExceptionHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionHandlerContext exceptionHandler() throws RecognitionException {
		ExceptionHandlerContext _localctx = new ExceptionHandlerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(CATCH);
			setState(338);
			match(ARG_ACTION);
			setState(339);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(AnnotatedAntlr4Parser.FINALLY, 0); }
		public TerminalNode ACTION() { return getToken(AnnotatedAntlr4Parser.ACTION, 0); }
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitFinallyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitFinallyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(FINALLY);
			setState(342);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulePrequelContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public RuleActionContext ruleAction() {
			return getRuleContext(RuleActionContext.class,0);
		}
		public RulePrequelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePrequel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRulePrequel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRulePrequel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRulePrequel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulePrequelContext rulePrequel() throws RecognitionException {
		RulePrequelContext _localctx = new RulePrequelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rulePrequel);
		try {
			setState(346);
			switch (_input.LA(1)) {
			case OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				optionsSpec();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				ruleAction();
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

	public static class RuleReturnsContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(AnnotatedAntlr4Parser.RETURNS, 0); }
		public TerminalNode ARG_ACTION() { return getToken(AnnotatedAntlr4Parser.ARG_ACTION, 0); }
		public RuleReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRuleReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRuleReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRuleReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleReturnsContext ruleReturns() throws RecognitionException {
		RuleReturnsContext _localctx = new RuleReturnsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ruleReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(RETURNS);
			setState(349);
			match(ARG_ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowsSpecContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(AnnotatedAntlr4Parser.THROWS, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AnnotatedAntlr4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnnotatedAntlr4Parser.COMMA, i);
		}
		public ThrowsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterThrowsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitThrowsSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitThrowsSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowsSpecContext throwsSpec() throws RecognitionException {
		ThrowsSpecContext _localctx = new ThrowsSpecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_throwsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(THROWS);
			setState(352);
			id();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353);
				match(COMMA);
				setState(354);
				id();
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

	public static class LocalsSpecContext extends ParserRuleContext {
		public TerminalNode LOCALS() { return getToken(AnnotatedAntlr4Parser.LOCALS, 0); }
		public TerminalNode ARG_ACTION() { return getToken(AnnotatedAntlr4Parser.ARG_ACTION, 0); }
		public LocalsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLocalsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLocalsSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLocalsSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalsSpecContext localsSpec() throws RecognitionException {
		LocalsSpecContext _localctx = new LocalsSpecContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_localsSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LOCALS);
			setState(361);
			match(ARG_ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AnnotatedAntlr4Parser.AT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(AnnotatedAntlr4Parser.ACTION, 0); }
		public RuleActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRuleAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRuleAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRuleAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleActionContext ruleAction() throws RecognitionException {
		RuleActionContext _localctx = new RuleActionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ruleAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(AT);
			setState(364);
			id();
			setState(365);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleModifiersContext extends ParserRuleContext {
		public List<RuleModifierContext> ruleModifier() {
			return getRuleContexts(RuleModifierContext.class);
		}
		public RuleModifierContext ruleModifier(int i) {
			return getRuleContext(RuleModifierContext.class,i);
		}
		public RuleModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRuleModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRuleModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRuleModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleModifiersContext ruleModifiers() throws RecognitionException {
		RuleModifiersContext _localctx = new RuleModifiersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ruleModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(367);
				ruleModifier();
				}
				}
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AnnotatedAntlr4Parser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AnnotatedAntlr4Parser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AnnotatedAntlr4Parser.PROTECTED, 0); }
		public TerminalNode FRAGMENT() { return getToken(AnnotatedAntlr4Parser.FRAGMENT, 0); }
		public RuleModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRuleModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRuleModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRuleModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleModifierContext ruleModifier() throws RecognitionException {
		RuleModifierContext _localctx = new RuleModifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ruleModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) ) {
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

	public static class RuleBlockContext extends ParserRuleContext {
		public RuleAltListContext ruleAltList() {
			return getRuleContext(RuleAltListContext.class,0);
		}
		public RuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRuleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRuleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleBlockContext ruleBlock() throws RecognitionException {
		RuleBlockContext _localctx = new RuleBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ruleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			ruleAltList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleAltListContext extends ParserRuleContext {
		public List<LabeledAltContext> labeledAlt() {
			return getRuleContexts(LabeledAltContext.class);
		}
		public LabeledAltContext labeledAlt(int i) {
			return getRuleContext(LabeledAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AnnotatedAntlr4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AnnotatedAntlr4Parser.OR, i);
		}
		public RuleAltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAltList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRuleAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRuleAltList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRuleAltList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleAltListContext ruleAltList() throws RecognitionException {
		RuleAltListContext _localctx = new RuleAltListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ruleAltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			labeledAlt();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(377);
				match(OR);
				setState(378);
				labeledAlt();
				}
				}
				setState(383);
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

	public static class LabeledAltContext extends ParserRuleContext {
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public TerminalNode POUND() { return getToken(AnnotatedAntlr4Parser.POUND, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PropertiesBlockContext propertiesBlock() {
			return getRuleContext(PropertiesBlockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LabeledAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLabeledAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLabeledAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLabeledAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledAltContext labeledAlt() throws RecognitionException {
		LabeledAltContext _localctx = new LabeledAltContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_labeledAlt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			alternative();
			setState(393);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(385);
				match(POUND);
				setState(386);
				id();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOLLAR) {
					{
					{
					setState(387);
					annotation();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(396);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(395);
				propertiesBlock();
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

	public static class PropertiesBlockContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(AnnotatedAntlr4Parser.RARROW, 0); }
		public TerminalNode ACTION() { return getToken(AnnotatedAntlr4Parser.ACTION, 0); }
		public PropertiesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterPropertiesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitPropertiesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitPropertiesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesBlockContext propertiesBlock() throws RecognitionException {
		PropertiesBlockContext _localctx = new PropertiesBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_propertiesBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(RARROW);
			setState(399);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(AnnotatedAntlr4Parser.TOKEN_REF, 0); }
		public TerminalNode COLON() { return getToken(AnnotatedAntlr4Parser.COLON, 0); }
		public LexerRuleBlockContext lexerRuleBlock() {
			return getRuleContext(LexerRuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AnnotatedAntlr4Parser.SEMI, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(AnnotatedAntlr4Parser.DOC_COMMENT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode FRAGMENT() { return getToken(AnnotatedAntlr4Parser.FRAGMENT, 0); }
		public LexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerRuleContext lexerRule() throws RecognitionException {
		LexerRuleContext _localctx = new LexerRuleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lexerRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(401);
				match(DOC_COMMENT);
				}
			}

			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOLLAR) {
				{
				{
				setState(404);
				annotation();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			_la = _input.LA(1);
			if (_la==FRAGMENT) {
				{
				setState(410);
				match(FRAGMENT);
				}
			}

			setState(413);
			match(TOKEN_REF);
			setState(414);
			match(COLON);
			setState(415);
			lexerRuleBlock();
			setState(416);
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

	public static class LexerRuleBlockContext extends ParserRuleContext {
		public LexerAltListContext lexerAltList() {
			return getRuleContext(LexerAltListContext.class,0);
		}
		public LexerRuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerRuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerRuleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerRuleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerRuleBlockContext lexerRuleBlock() throws RecognitionException {
		LexerRuleBlockContext _localctx = new LexerRuleBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lexerRuleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			lexerAltList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAltListContext extends ParserRuleContext {
		public List<LexerAltContext> lexerAlt() {
			return getRuleContexts(LexerAltContext.class);
		}
		public LexerAltContext lexerAlt(int i) {
			return getRuleContext(LexerAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AnnotatedAntlr4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AnnotatedAntlr4Parser.OR, i);
		}
		public LexerAltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAltList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerAltList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerAltList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerAltListContext lexerAltList() throws RecognitionException {
		LexerAltListContext _localctx = new LexerAltListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lexerAltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			lexerAlt();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(421);
				match(OR);
				setState(422);
				lexerAlt();
				}
				}
				setState(427);
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

	public static class LexerAltContext extends ParserRuleContext {
		public LexerElementsContext lexerElements() {
			return getRuleContext(LexerElementsContext.class,0);
		}
		public LexerCommandsContext lexerCommands() {
			return getRuleContext(LexerCommandsContext.class,0);
		}
		public LexerAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerAltContext lexerAlt() throws RecognitionException {
		LexerAltContext _localctx = new LexerAltContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lexerAlt);
		int _la;
		try {
			setState(433);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case LEXER_CHAR_SET:
			case LPAREN:
			case DOT:
			case NOT:
			case STRING_LITERAL:
			case ACTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				lexerElements();
				setState(430);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(429);
					lexerCommands();
					}
				}

				}
				break;
			case SEMI:
			case RPAREN:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LexerElementsContext extends ParserRuleContext {
		public List<LexerElementContext> lexerElement() {
			return getRuleContexts(LexerElementContext.class);
		}
		public LexerElementContext lexerElement(int i) {
			return getRuleContext(LexerElementContext.class,i);
		}
		public LexerElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerElementsContext lexerElements() throws RecognitionException {
		LexerElementsContext _localctx = new LexerElementsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lexerElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(435);
				lexerElement();
				}
				}
				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LEXER_CHAR_SET) | (1L << LPAREN) | (1L << DOT) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << ACTION))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerElementContext extends ParserRuleContext {
		public LabeledLexerElementContext labeledLexerElement() {
			return getRuleContext(LabeledLexerElementContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public LexerAtomContext lexerAtom() {
			return getRuleContext(LexerAtomContext.class,0);
		}
		public LexerBlockContext lexerBlock() {
			return getRuleContext(LexerBlockContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(AnnotatedAntlr4Parser.ACTION, 0); }
		public TerminalNode QUESTION() { return getToken(AnnotatedAntlr4Parser.QUESTION, 0); }
		public LexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerElementContext lexerElement() throws RecognitionException {
		LexerElementContext _localctx = new LexerElementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lexerElement);
		int _la;
		try {
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				labeledLexerElement();
				setState(442);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(441);
					ebnfSuffix();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				lexerAtom();
				setState(446);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(445);
					ebnfSuffix();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				lexerBlock();
				setState(450);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(449);
					ebnfSuffix();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				match(ACTION);
				setState(454);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(453);
					match(QUESTION);
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

	public static class LabeledLexerElementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AnnotatedAntlr4Parser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(AnnotatedAntlr4Parser.PLUS_ASSIGN, 0); }
		public LexerAtomContext lexerAtom() {
			return getRuleContext(LexerAtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabeledLexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledLexerElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLabeledLexerElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLabeledLexerElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLabeledLexerElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledLexerElementContext labeledLexerElement() throws RecognitionException {
		LabeledLexerElementContext _localctx = new LabeledLexerElementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_labeledLexerElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			id();
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==PLUS_ASSIGN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(462);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case LEXER_CHAR_SET:
			case DOT:
			case NOT:
			case STRING_LITERAL:
				{
				setState(460);
				lexerAtom();
				}
				break;
			case LPAREN:
				{
				setState(461);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LexerBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AnnotatedAntlr4Parser.LPAREN, 0); }
		public LexerAltListContext lexerAltList() {
			return getRuleContext(LexerAltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AnnotatedAntlr4Parser.RPAREN, 0); }
		public LexerBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerBlockContext lexerBlock() throws RecognitionException {
		LexerBlockContext _localctx = new LexerBlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lexerBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(LPAREN);
			setState(465);
			lexerAltList();
			setState(466);
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

	public static class LexerCommandsContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(AnnotatedAntlr4Parser.RARROW, 0); }
		public List<LexerCommandContext> lexerCommand() {
			return getRuleContexts(LexerCommandContext.class);
		}
		public LexerCommandContext lexerCommand(int i) {
			return getRuleContext(LexerCommandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AnnotatedAntlr4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnnotatedAntlr4Parser.COMMA, i);
		}
		public LexerCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerCommandsContext lexerCommands() throws RecognitionException {
		LexerCommandsContext _localctx = new LexerCommandsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lexerCommands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(RARROW);
			setState(469);
			lexerCommand();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(470);
				match(COMMA);
				setState(471);
				lexerCommand();
				}
				}
				setState(476);
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

	public static class LexerCommandContext extends ParserRuleContext {
		public LexerCommandNameContext lexerCommandName() {
			return getRuleContext(LexerCommandNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AnnotatedAntlr4Parser.LPAREN, 0); }
		public LexerCommandExprContext lexerCommandExpr() {
			return getRuleContext(LexerCommandExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AnnotatedAntlr4Parser.RPAREN, 0); }
		public LexerCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerCommandContext lexerCommand() throws RecognitionException {
		LexerCommandContext _localctx = new LexerCommandContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lexerCommand);
		try {
			setState(483);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				lexerCommandName();
				setState(478);
				match(LPAREN);
				setState(479);
				lexerCommandExpr();
				setState(480);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				lexerCommandName();
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

	public static class LexerCommandNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MODE() { return getToken(AnnotatedAntlr4Parser.MODE, 0); }
		public LexerCommandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerCommandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerCommandName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerCommandName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerCommandNameContext lexerCommandName() throws RecognitionException {
		LexerCommandNameContext _localctx = new LexerCommandNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lexerCommandName);
		try {
			setState(487);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				id();
				}
				break;
			case MODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(MODE);
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

	public static class LexerCommandExprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(AnnotatedAntlr4Parser.INTEGER_LITERAL, 0); }
		public LexerCommandExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerCommandExprContext lexerCommandExpr() throws RecognitionException {
		LexerCommandExprContext _localctx = new LexerCommandExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lexerCommandExpr);
		try {
			setState(491);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				id();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(INTEGER_LITERAL);
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

	public static class AltListContext extends ParserRuleContext {
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AnnotatedAntlr4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AnnotatedAntlr4Parser.OR, i);
		}
		public AltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitAltList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitAltList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltListContext altList() throws RecognitionException {
		AltListContext _localctx = new AltListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_altList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			alternative();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(494);
				match(OR);
				setState(495);
				alternative();
				}
				}
				setState(500);
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

	public static class AlternativeContext extends ParserRuleContext {
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(501);
				elementOptions();
				}
			}

			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LPAREN) | (1L << DOLLAR) | (1L << DOT) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << ACTION))) != 0)) {
				{
				{
				setState(504);
				element();
				}
				}
				setState(509);
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

	public static class ElementContext extends ParserRuleContext {
		public LabeledElementContext labeledElement() {
			return getRuleContext(LabeledElementContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public EbnfContext ebnf() {
			return getRuleContext(EbnfContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(AnnotatedAntlr4Parser.ACTION, 0); }
		public TerminalNode QUESTION() { return getToken(AnnotatedAntlr4Parser.QUESTION, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_element);
		int _la;
		try {
			setState(537);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOLLAR) {
					{
					{
					setState(510);
					annotation();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(516);
				labeledElement();
				setState(519);
				switch (_input.LA(1)) {
				case QUESTION:
				case STAR:
				case PLUS:
					{
					setState(517);
					ebnfSuffix();
					}
					break;
				case TOKEN_REF:
				case RULE_REF:
				case SEMI:
				case LPAREN:
				case RPAREN:
				case RARROW:
				case OR:
				case DOLLAR:
				case DOT:
				case POUND:
				case NOT:
				case STRING_LITERAL:
				case ACTION:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOLLAR) {
					{
					{
					setState(521);
					annotation();
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(527);
				atom();
				setState(530);
				switch (_input.LA(1)) {
				case QUESTION:
				case STAR:
				case PLUS:
					{
					setState(528);
					ebnfSuffix();
					}
					break;
				case TOKEN_REF:
				case RULE_REF:
				case SEMI:
				case LPAREN:
				case RPAREN:
				case RARROW:
				case OR:
				case DOLLAR:
				case DOT:
				case POUND:
				case NOT:
				case STRING_LITERAL:
				case ACTION:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				ebnf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				match(ACTION);
				setState(535);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(534);
					match(QUESTION);
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

	public static class LabeledElementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AnnotatedAntlr4Parser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(AnnotatedAntlr4Parser.PLUS_ASSIGN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabeledElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLabeledElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLabeledElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLabeledElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledElementContext labeledElement() throws RecognitionException {
		LabeledElementContext _localctx = new LabeledElementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_labeledElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			id();
			setState(540);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==PLUS_ASSIGN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(543);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case DOT:
			case NOT:
			case STRING_LITERAL:
				{
				setState(541);
				atom();
				}
				break;
			case LPAREN:
				{
				setState(542);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EbnfContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockSuffixContext blockSuffix() {
			return getRuleContext(BlockSuffixContext.class,0);
		}
		public EbnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterEbnf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitEbnf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitEbnf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EbnfContext ebnf() throws RecognitionException {
		EbnfContext _localctx = new EbnfContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ebnf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			block();
			setState(547);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
				{
				setState(546);
				blockSuffix();
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

	public static class BlockSuffixContext extends ParserRuleContext {
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public BlockSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterBlockSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitBlockSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitBlockSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockSuffixContext blockSuffix() throws RecognitionException {
		BlockSuffixContext _localctx = new BlockSuffixContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_blockSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			ebnfSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EbnfSuffixContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION() { return getTokens(AnnotatedAntlr4Parser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(AnnotatedAntlr4Parser.QUESTION, i);
		}
		public TerminalNode STAR() { return getToken(AnnotatedAntlr4Parser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(AnnotatedAntlr4Parser.PLUS, 0); }
		public EbnfSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnfSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterEbnfSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitEbnfSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitEbnfSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EbnfSuffixContext ebnfSuffix() throws RecognitionException {
		EbnfSuffixContext _localctx = new EbnfSuffixContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ebnfSuffix);
		int _la;
		try {
			setState(563);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(QUESTION);
				setState(553);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(552);
					match(QUESTION);
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(STAR);
				setState(557);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(556);
					match(QUESTION);
					}
				}

				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				match(PLUS);
				setState(561);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(560);
					match(QUESTION);
					}
				}

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

	public static class LexerAtomContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode RULE_REF() { return getToken(AnnotatedAntlr4Parser.RULE_REF, 0); }
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(AnnotatedAntlr4Parser.LEXER_CHAR_SET, 0); }
		public TerminalNode DOT() { return getToken(AnnotatedAntlr4Parser.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public LexerAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLexerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLexerAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLexerAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerAtomContext lexerAtom() throws RecognitionException {
		LexerAtomContext _localctx = new LexerAtomContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lexerAtom);
		int _la;
		try {
			setState(574);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				terminal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				match(RULE_REF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				notSet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(569);
				match(LEXER_CHAR_SET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(570);
				match(DOT);
				setState(572);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(571);
					elementOptions();
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

	public static class AtomContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public RulerefContext ruleref() {
			return getRuleContext(RulerefContext.class,0);
		}
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AnnotatedAntlr4Parser.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_atom);
		int _la;
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				terminal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				ruleref();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				notSet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(580);
				match(DOT);
				setState(582);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(581);
					elementOptions();
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

	public static class NotSetContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(AnnotatedAntlr4Parser.NOT, 0); }
		public SetElementContext setElement() {
			return getRuleContext(SetElementContext.class,0);
		}
		public BlockSetContext blockSet() {
			return getRuleContext(BlockSetContext.class,0);
		}
		public NotSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterNotSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitNotSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitNotSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotSetContext notSet() throws RecognitionException {
		NotSetContext _localctx = new NotSetContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_notSet);
		try {
			setState(590);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(NOT);
				setState(587);
				setElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(NOT);
				setState(589);
				blockSet();
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

	public static class BlockSetContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AnnotatedAntlr4Parser.LPAREN, 0); }
		public List<SetElementContext> setElement() {
			return getRuleContexts(SetElementContext.class);
		}
		public SetElementContext setElement(int i) {
			return getRuleContext(SetElementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AnnotatedAntlr4Parser.RPAREN, 0); }
		public List<TerminalNode> OR() { return getTokens(AnnotatedAntlr4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AnnotatedAntlr4Parser.OR, i);
		}
		public BlockSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterBlockSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitBlockSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitBlockSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockSetContext blockSet() throws RecognitionException {
		BlockSetContext _localctx = new BlockSetContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_blockSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(LPAREN);
			setState(593);
			setElement();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(594);
				match(OR);
				setState(595);
				setElement();
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
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

	public static class SetElementContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(AnnotatedAntlr4Parser.TOKEN_REF, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(AnnotatedAntlr4Parser.STRING_LITERAL, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(AnnotatedAntlr4Parser.LEXER_CHAR_SET, 0); }
		public SetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterSetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitSetElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitSetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_setElement);
		int _la;
		try {
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(TOKEN_REF);
				setState(605);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(604);
					elementOptions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(STRING_LITERAL);
				setState(609);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(608);
					elementOptions();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				range();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(612);
				match(LEXER_CHAR_SET);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AnnotatedAntlr4Parser.LPAREN, 0); }
		public AltListContext altList() {
			return getRuleContext(AltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AnnotatedAntlr4Parser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(AnnotatedAntlr4Parser.COLON, 0); }
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public List<RuleActionContext> ruleAction() {
			return getRuleContexts(RuleActionContext.class);
		}
		public RuleActionContext ruleAction(int i) {
			return getRuleContext(RuleActionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(LPAREN);
			setState(626);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << COLON) | (1L << AT))) != 0)) {
				{
				setState(617);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(616);
					optionsSpec();
					}
				}

				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(619);
					ruleAction();
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(625);
				match(COLON);
				}
			}

			setState(628);
			altList();
			setState(629);
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

	public static class RulerefContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(AnnotatedAntlr4Parser.RULE_REF, 0); }
		public TerminalNode ARG_ACTION() { return getToken(AnnotatedAntlr4Parser.ARG_ACTION, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public RulerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRuleref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRuleref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRuleref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulerefContext ruleref() throws RecognitionException {
		RulerefContext _localctx = new RulerefContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ruleref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(RULE_REF);
			setState(633);
			_la = _input.LA(1);
			if (_la==ARG_ACTION) {
				{
				setState(632);
				match(ARG_ACTION);
				}
			}

			setState(636);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(635);
				elementOptions();
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

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(AnnotatedAntlr4Parser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(AnnotatedAntlr4Parser.STRING_LITERAL, i);
		}
		public TerminalNode RANGE() { return getToken(AnnotatedAntlr4Parser.RANGE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(STRING_LITERAL);
			setState(639);
			match(RANGE);
			setState(640);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(AnnotatedAntlr4Parser.TOKEN_REF, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(AnnotatedAntlr4Parser.STRING_LITERAL, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_terminal);
		int _la;
		try {
			setState(650);
			switch (_input.LA(1)) {
			case TOKEN_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(TOKEN_REF);
				setState(644);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(643);
					elementOptions();
					}
				}

				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(STRING_LITERAL);
				setState(648);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(647);
					elementOptions();
					}
				}

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

	public static class ElementOptionsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AnnotatedAntlr4Parser.LT, 0); }
		public List<ElementOptionContext> elementOption() {
			return getRuleContexts(ElementOptionContext.class);
		}
		public ElementOptionContext elementOption(int i) {
			return getRuleContext(ElementOptionContext.class,i);
		}
		public TerminalNode GT() { return getToken(AnnotatedAntlr4Parser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AnnotatedAntlr4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnnotatedAntlr4Parser.COMMA, i);
		}
		public ElementOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterElementOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitElementOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitElementOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOptionsContext elementOptions() throws RecognitionException {
		ElementOptionsContext _localctx = new ElementOptionsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(LT);
			setState(653);
			elementOption();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(654);
				match(COMMA);
				setState(655);
				elementOption();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(661);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOptionContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(AnnotatedAntlr4Parser.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AnnotatedAntlr4Parser.STRING_LITERAL, 0); }
		public ElementOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterElementOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitElementOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitElementOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOptionContext elementOption() throws RecognitionException {
		ElementOptionContext _localctx = new ElementOptionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementOption);
		try {
			setState(670);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				id();
				setState(665);
				match(ASSIGN);
				setState(668);
				switch (_input.LA(1)) {
				case TOKEN_REF:
				case RULE_REF:
					{
					setState(666);
					id();
					}
					break;
				case STRING_LITERAL:
					{
					setState(667);
					match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(AnnotatedAntlr4Parser.RULE_REF, 0); }
		public TerminalNode TOKEN_REF() { return getToken(AnnotatedAntlr4Parser.TOKEN_REF, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_REF || _la==RULE_REF) ) {
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(AnnotatedAntlr4Parser.DOLLAR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationBodyContext annotationBody() {
			return getRuleContext(AnnotationBodyContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(DOLLAR);
			setState(675);
			qualifiedName();
			setState(677);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(676);
				annotationBody();
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

	public static class AnnotationBodyContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AnnotatedAntlr4Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AnnotatedAntlr4Parser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public AnnotationAttributeListContext annotationAttributeList() {
			return getRuleContext(AnnotationAttributeListContext.class,0);
		}
		public AnnotationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterAnnotationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitAnnotationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitAnnotationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationBodyContext annotationBody() throws RecognitionException {
		AnnotationBodyContext _localctx = new AnnotationBodyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(LPAREN);
			setState(683);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(680);
				expression();
				}
				break;
			case 2:
				{
				setState(681);
				expressionList();
				}
				break;
			case 3:
				{
				setState(682);
				annotationAttributeList();
				}
				break;
			}
			setState(685);
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

	public static class AnnotationAttributeListContext extends ParserRuleContext {
		public List<AnnotationAttributeContext> annotationAttribute() {
			return getRuleContexts(AnnotationAttributeContext.class);
		}
		public AnnotationAttributeContext annotationAttribute(int i) {
			return getRuleContext(AnnotationAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AnnotatedAntlr4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnnotatedAntlr4Parser.COMMA, i);
		}
		public AnnotationAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterAnnotationAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitAnnotationAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitAnnotationAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationAttributeListContext annotationAttributeList() throws RecognitionException {
		AnnotationAttributeListContext _localctx = new AnnotationAttributeListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			annotationAttribute();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(688);
				match(COMMA);
				setState(689);
				annotationAttribute();
				}
				}
				setState(694);
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

	public static class AnnotationAttributeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AnnotatedAntlr4Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public AnnotationAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterAnnotationAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitAnnotationAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitAnnotationAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationAttributeContext annotationAttribute() throws RecognitionException {
		AnnotationAttributeContext _localctx = new AnnotationAttributeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			identifier();
			setState(696);
			match(ASSIGN);
			setState(699);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case TRUE:
			case FALSE:
			case NULL:
			case ID:
			case INTEGER_LITERAL:
			case SCIENTIFIC_LITERAL:
			case STRING_LITERAL:
				{
				setState(697);
				expression();
				}
				break;
			case LPAREN:
				{
				setState(698);
				expressionList();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode LPAREN() { return getToken(AnnotatedAntlr4Parser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AnnotatedAntlr4Parser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AnnotatedAntlr4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnnotatedAntlr4Parser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(LPAREN);
			setState(702);
			expression();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(703);
				match(COMMA);
				setState(704);
				expression();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AnnotatedAntlr4Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AnnotatedAntlr4Parser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			identifier();
			setState(717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(713);
					match(DOT);
					setState(714);
					identifier();
					}
					} 
				}
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expression);
		try {
			setState(722);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NULL:
			case INTEGER_LITERAL:
			case SCIENTIFIC_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				literal();
				}
				break;
			case TOKEN_REF:
			case RULE_REF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				qualifiedName();
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

	public static class LiteralContext extends ParserRuleContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(AnnotatedAntlr4Parser.INTEGER_LITERAL, 0); }
		public TerminalNode SCIENTIFIC_LITERAL() { return getToken(AnnotatedAntlr4Parser.SCIENTIFIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AnnotatedAntlr4Parser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_literal);
		try {
			setState(729);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				nullLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				boolLiteral();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				match(INTEGER_LITERAL);
				}
				break;
			case SCIENTIFIC_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				match(SCIENTIFIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
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
		public TerminalNode TOKEN_REF() { return getToken(AnnotatedAntlr4Parser.TOKEN_REF, 0); }
		public TerminalNode RULE_REF() { return getToken(AnnotatedAntlr4Parser.RULE_REF, 0); }
		public TerminalNode ID() { return getToken(AnnotatedAntlr4Parser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << ID))) != 0)) ) {
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AnnotatedAntlr4Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AnnotatedAntlr4Parser.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
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
		public TerminalNode NULL() { return getToken(AnnotatedAntlr4Parser.NULL, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnnotatedAntlr4ParserListener ) ((AnnotatedAntlr4ParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnnotatedAntlr4ParserVisitor ) return ((AnnotatedAntlr4ParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u02e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\5\2\u0094\n\2\3\2\7\2\u0097\n\2\f\2\16\2\u009a\13\2\3\2\3\2\3"+
		"\2\3\2\7\2\u00a0\n\2\f\2\16\2\u00a3\13\2\3\2\3\2\7\2\u00a7\n\2\f\2\16"+
		"\2\u00aa\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00b3\n\3\3\4\3\4\3\4\3"+
		"\4\5\4\u00b9\n\4\3\5\3\5\7\5\u00bd\n\5\f\5\16\5\u00c0\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u00cc\n\7\f\7\16\7\u00cf\13\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u00d6\n\7\3\b\3\b\3\b\3\b\7\b\u00dc\n\b\f\b\16\b\u00df"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00e8\n\t\3\n\3\n\3\n\3\n\7\n\u00ee"+
		"\n\n\f\n\16\n\u00f1\13\n\3\n\5\n\u00f4\n\n\3\n\3\n\3\13\7\13\u00f9\n\13"+
		"\f\13\16\13\u00fc\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0104\n\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\5\r\u010c\n\r\3\16\7\16\u010f\n\16\f\16\16\16\u0112"+
		"\13\16\3\16\3\16\3\16\3\16\7\16\u0118\n\16\f\16\16\16\u011b\13\16\3\17"+
		"\7\17\u011e\n\17\f\17\16\17\u0121\13\17\3\20\3\20\5\20\u0125\n\20\3\21"+
		"\5\21\u0128\n\21\3\21\7\21\u012b\n\21\f\21\16\21\u012e\13\21\3\21\5\21"+
		"\u0131\n\21\3\21\3\21\5\21\u0135\n\21\3\21\5\21\u0138\n\21\3\21\5\21\u013b"+
		"\n\21\3\21\5\21\u013e\n\21\3\21\7\21\u0141\n\21\f\21\16\21\u0144\13\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\7\22\u014c\n\22\f\22\16\22\u014f\13\22"+
		"\3\22\5\22\u0152\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\5\25"+
		"\u015d\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0166\n\27\f\27\16"+
		"\27\u0169\13\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\6\32\u0173\n\32"+
		"\r\32\16\32\u0174\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u017e\n\35\f"+
		"\35\16\35\u0181\13\35\3\36\3\36\3\36\3\36\7\36\u0187\n\36\f\36\16\36\u018a"+
		"\13\36\5\36\u018c\n\36\3\36\5\36\u018f\n\36\3\37\3\37\3\37\3 \5 \u0195"+
		"\n \3 \7 \u0198\n \f \16 \u019b\13 \3 \5 \u019e\n \3 \3 \3 \3 \3 \3!\3"+
		"!\3\"\3\"\3\"\7\"\u01aa\n\"\f\"\16\"\u01ad\13\"\3#\3#\5#\u01b1\n#\3#\5"+
		"#\u01b4\n#\3$\6$\u01b7\n$\r$\16$\u01b8\3%\3%\5%\u01bd\n%\3%\3%\5%\u01c1"+
		"\n%\3%\3%\5%\u01c5\n%\3%\3%\5%\u01c9\n%\5%\u01cb\n%\3&\3&\3&\3&\5&\u01d1"+
		"\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u01db\n(\f(\16(\u01de\13(\3)\3)\3)"+
		"\3)\3)\3)\5)\u01e6\n)\3*\3*\5*\u01ea\n*\3+\3+\5+\u01ee\n+\3,\3,\3,\7,"+
		"\u01f3\n,\f,\16,\u01f6\13,\3-\5-\u01f9\n-\3-\7-\u01fc\n-\f-\16-\u01ff"+
		"\13-\3.\7.\u0202\n.\f.\16.\u0205\13.\3.\3.\3.\5.\u020a\n.\3.\7.\u020d"+
		"\n.\f.\16.\u0210\13.\3.\3.\3.\5.\u0215\n.\3.\3.\3.\5.\u021a\n.\5.\u021c"+
		"\n.\3/\3/\3/\3/\5/\u0222\n/\3\60\3\60\5\60\u0226\n\60\3\61\3\61\3\62\3"+
		"\62\5\62\u022c\n\62\3\62\3\62\5\62\u0230\n\62\3\62\3\62\5\62\u0234\n\62"+
		"\5\62\u0236\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u023f\n\63\5"+
		"\63\u0241\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0249\n\64\5\64\u024b"+
		"\n\64\3\65\3\65\3\65\3\65\5\65\u0251\n\65\3\66\3\66\3\66\3\66\7\66\u0257"+
		"\n\66\f\66\16\66\u025a\13\66\3\66\3\66\3\67\3\67\5\67\u0260\n\67\3\67"+
		"\3\67\5\67\u0264\n\67\3\67\3\67\5\67\u0268\n\67\38\38\58\u026c\n8\38\7"+
		"8\u026f\n8\f8\168\u0272\138\38\58\u0275\n8\38\38\38\39\39\59\u027c\n9"+
		"\39\59\u027f\n9\3:\3:\3:\3:\3;\3;\5;\u0287\n;\3;\3;\5;\u028b\n;\5;\u028d"+
		"\n;\3<\3<\3<\3<\7<\u0293\n<\f<\16<\u0296\13<\3<\3<\3=\3=\3=\3=\3=\5=\u029f"+
		"\n=\5=\u02a1\n=\3>\3>\3?\3?\3?\5?\u02a8\n?\3@\3@\3@\3@\5@\u02ae\n@\3@"+
		"\3@\3A\3A\3A\7A\u02b5\nA\fA\16A\u02b8\13A\3B\3B\3B\3B\5B\u02be\nB\3C\3"+
		"C\3C\3C\7C\u02c4\nC\fC\16C\u02c7\13C\3C\3C\3D\3D\3D\7D\u02ce\nD\fD\16"+
		"D\u02d1\13D\3E\3E\5E\u02d5\nE\3F\3F\3F\3F\3F\5F\u02dc\nF\3G\3G\3H\3H\3"+
		"I\3I\3I\2\2J\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\2\7\4\2\13\13\17\21\4\2%%))\3\2\3\4\4\2\3\4\65"+
		"\65\3\2\30\31\u0316\2\u0093\3\2\2\2\4\u00b2\3\2\2\2\6\u00b8\3\2\2\2\b"+
		"\u00ba\3\2\2\2\n\u00c3\3\2\2\2\f\u00d5\3\2\2\2\16\u00d7\3\2\2\2\20\u00e7"+
		"\3\2\2\2\22\u00e9\3\2\2\2\24\u00fa\3\2\2\2\26\u00ff\3\2\2\2\30\u010b\3"+
		"\2\2\2\32\u0110\3\2\2\2\34\u011f\3\2\2\2\36\u0124\3\2\2\2 \u0127\3\2\2"+
		"\2\"\u014d\3\2\2\2$\u0153\3\2\2\2&\u0157\3\2\2\2(\u015c\3\2\2\2*\u015e"+
		"\3\2\2\2,\u0161\3\2\2\2.\u016a\3\2\2\2\60\u016d\3\2\2\2\62\u0172\3\2\2"+
		"\2\64\u0176\3\2\2\2\66\u0178\3\2\2\28\u017a\3\2\2\2:\u0182\3\2\2\2<\u0190"+
		"\3\2\2\2>\u0194\3\2\2\2@\u01a4\3\2\2\2B\u01a6\3\2\2\2D\u01b3\3\2\2\2F"+
		"\u01b6\3\2\2\2H\u01ca\3\2\2\2J\u01cc\3\2\2\2L\u01d2\3\2\2\2N\u01d6\3\2"+
		"\2\2P\u01e5\3\2\2\2R\u01e9\3\2\2\2T\u01ed\3\2\2\2V\u01ef\3\2\2\2X\u01f8"+
		"\3\2\2\2Z\u021b\3\2\2\2\\\u021d\3\2\2\2^\u0223\3\2\2\2`\u0227\3\2\2\2"+
		"b\u0235\3\2\2\2d\u0240\3\2\2\2f\u024a\3\2\2\2h\u0250\3\2\2\2j\u0252\3"+
		"\2\2\2l\u0267\3\2\2\2n\u0269\3\2\2\2p\u0279\3\2\2\2r\u0280\3\2\2\2t\u028c"+
		"\3\2\2\2v\u028e\3\2\2\2x\u02a0\3\2\2\2z\u02a2\3\2\2\2|\u02a4\3\2\2\2~"+
		"\u02a9\3\2\2\2\u0080\u02b1\3\2\2\2\u0082\u02b9\3\2\2\2\u0084\u02bf\3\2"+
		"\2\2\u0086\u02ca\3\2\2\2\u0088\u02d4\3\2\2\2\u008a\u02db\3\2\2\2\u008c"+
		"\u02dd\3\2\2\2\u008e\u02df\3\2\2\2\u0090\u02e1\3\2\2\2\u0092\u0094\7A"+
		"\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098\3\2\2\2\u0095"+
		"\u0097\5|?\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c"+
		"\5\4\3\2\u009c\u009d\5z>\2\u009d\u00a1\7\36\2\2\u009e\u00a0\5\6\4\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a8\5\34\17\2\u00a5"+
		"\u00a7\5\32\16\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7\2\2\3\u00ac\3\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00b3\7\16\2"+
		"\2\u00af\u00b0\7\r\2\2\u00b0\u00b3\7\16\2\2\u00b1\u00b3\7\16\2\2\u00b2"+
		"\u00ad\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\5\3\2\2\2"+
		"\u00b4\u00b9\5\b\5\2\u00b5\u00b9\5\16\b\2\u00b6\u00b9\5\22\n\2\u00b7\u00b9"+
		"\5\26\f\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b9\7\3\2\2\2\u00ba\u00be\7\b\2\2\u00bb\u00bd\5"+
		"\n\6\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\62"+
		"\2\2\u00c2\t\3\2\2\2\u00c3\u00c4\5z>\2\u00c4\u00c5\7%\2\2\u00c5\u00c6"+
		"\5\f\7\2\u00c6\u00c7\7\36\2\2\u00c7\13\3\2\2\2\u00c8\u00cd\5z>\2\u00c9"+
		"\u00ca\7,\2\2\u00ca\u00cc\5z>\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d6\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d6\5\u008eH\2\u00d1\u00d6\5\u0090I\2\u00d2\u00d6\79"+
		"\2\2\u00d3\u00d6\7<\2\2\u00d4\u00d6\7\66\2\2\u00d5\u00c8\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d4\3\2\2\2\u00d6\r\3\2\2\2\u00d7\u00d8\7\n\2\2\u00d8\u00dd"+
		"\5\20\t\2\u00d9\u00da\7\35\2\2\u00da\u00dc\5\20\t\2\u00db\u00d9\3\2\2"+
		"\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\36\2\2\u00e1\17\3\2\2\2\u00e2"+
		"\u00e3\5z>\2\u00e3\u00e4\7%\2\2\u00e4\u00e5\5z>\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e8\5z>\2\u00e7\u00e2\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\21\3"+
		"\2\2\2\u00e9\u00ea\7\t\2\2\u00ea\u00ef\5\24\13\2\u00eb\u00ec\7\35\2\2"+
		"\u00ec\u00ee\5\24\13\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f4\7\35\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f6\7\62\2\2\u00f6\23\3\2\2\2\u00f7\u00f9\5|?\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5z>\2\u00fe\25\3\2\2\2"+
		"\u00ff\u0103\7.\2\2\u0100\u0101\5\30\r\2\u0101\u0102\7\34\2\2\u0102\u0104"+
		"\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\5z>\2\u0106\u0107\7<\2\2\u0107\27\3\2\2\2\u0108\u010c\5z>\2\u0109"+
		"\u010c\7\f\2\2\u010a\u010c\7\r\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010a\3\2\2\2\u010c\31\3\2\2\2\u010d\u010f\5|?\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\27\2\2\u0114\u0115\5"+
		"z>\2\u0115\u0119\7\36\2\2\u0116\u0118\5> \2\u0117\u0116\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\33\3\2\2"+
		"\2\u011b\u0119\3\2\2\2\u011c\u011e\5\36\20\2\u011d\u011c\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\35\3\2\2"+
		"\2\u0121\u011f\3\2\2\2\u0122\u0125\5 \21\2\u0123\u0125\5> \2\u0124\u0122"+
		"\3\2\2\2\u0124\u0123\3\2\2\2\u0125\37\3\2\2\2\u0126\u0128\7A\2\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012c\3\2\2\2\u0129\u012b\5|"+
		"?\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\5\62"+
		"\32\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\7\4\2\2\u0133\u0135\7>\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0137\3\2\2\2\u0136\u0138\5*\26\2\u0137\u0136\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\5,\27\2\u013a\u0139\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013e\5.\30\2\u013d"+
		"\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0142\3\2\2\2\u013f\u0141\5("+
		"\25\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\33"+
		"\2\2\u0146\u0147\5\66\34\2\u0147\u0148\7\36\2\2\u0148\u0149\5\"\22\2\u0149"+
		"!\3\2\2\2\u014a\u014c\5$\23\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2"+
		"\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0152\5&\24\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"#\3\2\2\2\u0153\u0154\7\25\2\2\u0154\u0155\7>\2\2\u0155\u0156\7<\2\2\u0156"+
		"%\3\2\2\2\u0157\u0158\7\26\2\2\u0158\u0159\7<\2\2\u0159\'\3\2\2\2\u015a"+
		"\u015d\5\b\5\2\u015b\u015d\5\60\31\2\u015c\u015a\3\2\2\2\u015c\u015b\3"+
		"\2\2\2\u015d)\3\2\2\2\u015e\u015f\7\22\2\2\u015f\u0160\7>\2\2\u0160+\3"+
		"\2\2\2\u0161\u0162\7\24\2\2\u0162\u0167\5z>\2\u0163\u0164\7\35\2\2\u0164"+
		"\u0166\5z>\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2"+
		"\2\u0167\u0168\3\2\2\2\u0168-\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b"+
		"\7\23\2\2\u016b\u016c\7>\2\2\u016c/\3\2\2\2\u016d\u016e\7.\2\2\u016e\u016f"+
		"\5z>\2\u016f\u0170\7<\2\2\u0170\61\3\2\2\2\u0171\u0173\5\64\33\2\u0172"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\63\3\2\2\2\u0176\u0177\t\2\2\2\u0177\65\3\2\2\2\u0178\u0179"+
		"\58\35\2\u0179\67\3\2\2\2\u017a\u017f\5:\36\2\u017b\u017c\7*\2\2\u017c"+
		"\u017e\5:\36\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u01809\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u018b"+
		"\5X-\2\u0183\u0184\7/\2\2\u0184\u0188\5z>\2\u0185\u0187\5|?\2\u0186\u0185"+
		"\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0183\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018e\3\2\2\2\u018d\u018f\5<\37\2\u018e\u018d\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f;\3\2\2\2\u0190\u0191\7!\2\2\u0191\u0192\7<\2\2\u0192"+
		"=\3\2\2\2\u0193\u0195\7A\2\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0199\3\2\2\2\u0196\u0198\5|?\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2"+
		"\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u019e\7\13\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2"+
		"\u019e\u019f\3\2\2\2\u019f\u01a0\7\3\2\2\u01a0\u01a1\7\33\2\2\u01a1\u01a2"+
		"\5@!\2\u01a2\u01a3\7\36\2\2\u01a3?\3\2\2\2\u01a4\u01a5\5B\"\2\u01a5A\3"+
		"\2\2\2\u01a6\u01ab\5D#\2\u01a7\u01a8\7*\2\2\u01a8\u01aa\5D#\2\u01a9\u01a7"+
		"\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"C\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b0\5F$\2\u01af\u01b1\5N(\2\u01b0"+
		"\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b4\3\2"+
		"\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4E\3\2\2\2\u01b5\u01b7"+
		"\5H%\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9G\3\2\2\2\u01ba\u01bc\5J&\2\u01bb\u01bd\5b\62\2\u01bc"+
		"\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01cb\3\2\2\2\u01be\u01c0\5d"+
		"\63\2\u01bf\u01c1\5b\62\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01cb\3\2\2\2\u01c2\u01c4\5L\'\2\u01c3\u01c5\5b\62\2\u01c4\u01c3\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01cb\3\2\2\2\u01c6\u01c8\7<\2\2\u01c7"+
		"\u01c9\7&\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01ba\3\2\2\2\u01ca\u01be\3\2\2\2\u01ca\u01c2\3\2\2\2\u01ca"+
		"\u01c6\3\2\2\2\u01cbI\3\2\2\2\u01cc\u01cd\5z>\2\u01cd\u01d0\t\3\2\2\u01ce"+
		"\u01d1\5d\63\2\u01cf\u01d1\5n8\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2"+
		"\2\u01d1K\3\2\2\2\u01d2\u01d3\7\37\2\2\u01d3\u01d4\5B\"\2\u01d4\u01d5"+
		"\7 \2\2\u01d5M\3\2\2\2\u01d6\u01d7\7!\2\2\u01d7\u01dc\5P)\2\u01d8\u01d9"+
		"\7\35\2\2\u01d9\u01db\5P)\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01ddO\3\2\2\2\u01de\u01dc\3\2\2\2"+
		"\u01df\u01e0\5R*\2\u01e0\u01e1\7\37\2\2\u01e1\u01e2\5T+\2\u01e2\u01e3"+
		"\7 \2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e6\5R*\2\u01e5\u01df\3\2\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6Q\3\2\2\2\u01e7\u01ea\5z>\2\u01e8\u01ea\7\27\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01eaS\3\2\2\2\u01eb\u01ee\5z>\2\u01ec"+
		"\u01ee\7\66\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01eeU\3\2\2\2"+
		"\u01ef\u01f4\5X-\2\u01f0\u01f1\7*\2\2\u01f1\u01f3\5X-\2\u01f2\u01f0\3"+
		"\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"W\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\5v<\2\u01f8\u01f7\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fd\3\2\2\2\u01fa\u01fc\5Z.\2\u01fb\u01fa\3\2\2"+
		"\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01feY"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\5|?\2\u0201\u0200\3\2\2\2\u0202"+
		"\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206\u0209\5\\/\2\u0207\u020a\5b\62\2\u0208"+
		"\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u021c\3\2"+
		"\2\2\u020b\u020d\5|?\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0214\5f\64\2\u0212\u0215\5b\62\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0213\3\2\2\2\u0215\u021c\3\2\2\2\u0216\u021c\5^\60\2\u0217"+
		"\u0219\7<\2\2\u0218\u021a\7&\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2"+
		"\2\u021a\u021c\3\2\2\2\u021b\u0203\3\2\2\2\u021b\u020e\3\2\2\2\u021b\u0216"+
		"\3\2\2\2\u021b\u0217\3\2\2\2\u021c[\3\2\2\2\u021d\u021e\5z>\2\u021e\u0221"+
		"\t\3\2\2\u021f\u0222\5f\64\2\u0220\u0222\5n8\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0220\3\2\2\2\u0222]\3\2\2\2\u0223\u0225\5n8\2\u0224\u0226\5`\61\2\u0225"+
		"\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226_\3\2\2\2\u0227\u0228\5b\62\2"+
		"\u0228a\3\2\2\2\u0229\u022b\7&\2\2\u022a\u022c\7&\2\2\u022b\u022a\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022c\u0236\3\2\2\2\u022d\u022f\7\'\2\2\u022e"+
		"\u0230\7&\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0236\3\2"+
		"\2\2\u0231\u0233\7(\2\2\u0232\u0234\7&\2\2\u0233\u0232\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0229\3\2\2\2\u0235\u022d\3\2\2\2\u0235"+
		"\u0231\3\2\2\2\u0236c\3\2\2\2\u0237\u0241\5r:\2\u0238\u0241\5t;\2\u0239"+
		"\u0241\7\4\2\2\u023a\u0241\5h\65\2\u023b\u0241\7\5\2\2\u023c\u023e\7,"+
		"\2\2\u023d\u023f\5v<\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241"+
		"\3\2\2\2\u0240\u0237\3\2\2\2\u0240\u0238\3\2\2\2\u0240\u0239\3\2\2\2\u0240"+
		"\u023a\3\2\2\2\u0240\u023b\3\2\2\2\u0240\u023c\3\2\2\2\u0241e\3\2\2\2"+
		"\u0242\u024b\5r:\2\u0243\u024b\5t;\2\u0244\u024b\5p9\2\u0245\u024b\5h"+
		"\65\2\u0246\u0248\7,\2\2\u0247\u0249\5v<\2\u0248\u0247\3\2\2\2\u0248\u0249"+
		"\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0242\3\2\2\2\u024a\u0243\3\2\2\2\u024a"+
		"\u0244\3\2\2\2\u024a\u0245\3\2\2\2\u024a\u0246\3\2\2\2\u024bg\3\2\2\2"+
		"\u024c\u024d\7\60\2\2\u024d\u0251\5l\67\2\u024e\u024f\7\60\2\2\u024f\u0251"+
		"\5j\66\2\u0250\u024c\3\2\2\2\u0250\u024e\3\2\2\2\u0251i\3\2\2\2\u0252"+
		"\u0253\7\37\2\2\u0253\u0258\5l\67\2\u0254\u0255\7*\2\2\u0255\u0257\5l"+
		"\67\2\u0256\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\7 "+
		"\2\2\u025ck\3\2\2\2\u025d\u025f\7\3\2\2\u025e\u0260\5v<\2\u025f\u025e"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0268\3\2\2\2\u0261\u0263\79\2\2\u0262"+
		"\u0264\5v<\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0268\3\2\2"+
		"\2\u0265\u0268\5r:\2\u0266\u0268\7\5\2\2\u0267\u025d\3\2\2\2\u0267\u0261"+
		"\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268m\3\2\2\2\u0269"+
		"\u0274\7\37\2\2\u026a\u026c\5\b\5\2\u026b\u026a\3\2\2\2\u026b\u026c\3"+
		"\2\2\2\u026c\u0270\3\2\2\2\u026d\u026f\5\60\31\2\u026e\u026d\3\2\2\2\u026f"+
		"\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2"+
		"\2\2\u0272\u0270\3\2\2\2\u0273\u0275\7\33\2\2\u0274\u026b\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\5V,\2\u0277\u0278\7 \2"+
		"\2\u0278o\3\2\2\2\u0279\u027b\7\4\2\2\u027a\u027c\7>\2\2\u027b\u027a\3"+
		"\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f\5v<\2\u027e"+
		"\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027fq\3\2\2\2\u0280\u0281\79\2\2\u0281"+
		"\u0282\7-\2\2\u0282\u0283\79\2\2\u0283s\3\2\2\2\u0284\u0286\7\3\2\2\u0285"+
		"\u0287\5v<\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028d\3\2\2"+
		"\2\u0288\u028a\79\2\2\u0289\u028b\5v<\2\u028a\u0289\3\2\2\2\u028a\u028b"+
		"\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u0284\3\2\2\2\u028c\u0288\3\2\2\2\u028d"+
		"u\3\2\2\2\u028e\u028f\7#\2\2\u028f\u0294\5x=\2\u0290\u0291\7\35\2\2\u0291"+
		"\u0293\5x=\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2"+
		"\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298"+
		"\7$\2\2\u0298w\3\2\2\2\u0299\u02a1\5z>\2\u029a\u029b\5z>\2\u029b\u029e"+
		"\7%\2\2\u029c\u029f\5z>\2\u029d\u029f\79\2\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029d\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u0299\3\2\2\2\u02a0\u029a\3\2"+
		"\2\2\u02a1y\3\2\2\2\u02a2\u02a3\t\4\2\2\u02a3{\3\2\2\2\u02a4\u02a5\7+"+
		"\2\2\u02a5\u02a7\5\u0086D\2\u02a6\u02a8\5~@\2\u02a7\u02a6\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8}\3\2\2\2\u02a9\u02ad\7\37\2\2\u02aa\u02ae\5\u0088"+
		"E\2\u02ab\u02ae\5\u0084C\2\u02ac\u02ae\5\u0080A\2\u02ad\u02aa\3\2\2\2"+
		"\u02ad\u02ab\3\2\2\2\u02ad\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0"+
		"\7 \2\2\u02b0\177\3\2\2\2\u02b1\u02b6\5\u0082B\2\u02b2\u02b3\7\35\2\2"+
		"\u02b3\u02b5\5\u0082B\2\u02b4\u02b2\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u0081\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b9\u02ba\5\u008cG\2\u02ba\u02bd\7%\2\2\u02bb\u02be\5\u0088E\2"+
		"\u02bc\u02be\5\u0084C\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be"+
		"\u0083\3\2\2\2\u02bf\u02c0\7\37\2\2\u02c0\u02c5\5\u0088E\2\u02c1\u02c2"+
		"\7\35\2\2\u02c2\u02c4\5\u0088E\2\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2\2"+
		"\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5"+
		"\3\2\2\2\u02c8\u02c9\7 \2\2\u02c9\u0085\3\2\2\2\u02ca\u02cf\5\u008cG\2"+
		"\u02cb\u02cc\7,\2\2\u02cc\u02ce\5\u008cG\2\u02cd\u02cb\3\2\2\2\u02ce\u02d1"+
		"\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u0087\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d2\u02d5\5\u008aF\2\u02d3\u02d5\5\u0086D\2\u02d4\u02d2"+
		"\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5\u0089\3\2\2\2\u02d6\u02dc\5\u0090I"+
		"\2\u02d7\u02dc\5\u008eH\2\u02d8\u02dc\7\66\2\2\u02d9\u02dc\78\2\2\u02da"+
		"\u02dc\79\2\2\u02db\u02d6\3\2\2\2\u02db\u02d7\3\2\2\2\u02db\u02d8\3\2"+
		"\2\2\u02db\u02d9\3\2\2\2\u02db\u02da\3\2\2\2\u02dc\u008b\3\2\2\2\u02dd"+
		"\u02de\t\5\2\2\u02de\u008d\3\2\2\2\u02df\u02e0\t\6\2\2\u02e0\u008f\3\2"+
		"\2\2\u02e1\u02e2\7\32\2\2\u02e2\u0091\3\2\2\2c\u0093\u0098\u00a1\u00a8"+
		"\u00b2\u00b8\u00be\u00cd\u00d5\u00dd\u00e7\u00ef\u00f3\u00fa\u0103\u010b"+
		"\u0110\u0119\u011f\u0124\u0127\u012c\u0130\u0134\u0137\u013a\u013d\u0142"+
		"\u014d\u0151\u015c\u0167\u0174\u017f\u0188\u018b\u018e\u0194\u0199\u019d"+
		"\u01ab\u01b0\u01b3\u01b8\u01bc\u01c0\u01c4\u01c8\u01ca\u01d0\u01dc\u01e5"+
		"\u01e9\u01ed\u01f4\u01f8\u01fd\u0203\u0209\u020e\u0214\u0219\u021b\u0221"+
		"\u0225\u022b\u022f\u0233\u0235\u023e\u0240\u0248\u024a\u0250\u0258\u025f"+
		"\u0263\u0267\u026b\u0270\u0274\u027b\u027e\u0286\u028a\u028c\u0294\u029e"+
		"\u02a0\u02a7\u02ad\u02b6\u02bd\u02c5\u02cf\u02d4\u02db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}