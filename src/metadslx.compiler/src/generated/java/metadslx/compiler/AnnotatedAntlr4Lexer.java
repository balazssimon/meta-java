// Generated from AnnotatedAntlr4Lexer.g4 by ANTLR 4.5.1
package metadslx.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnnotatedAntlr4Lexer extends Lexer {
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
	public static final int ArgAction = 1;
	public static final int LexerCharSet = 2;
	public static final int DOC_COMMENT_MODE = 3;
	public static final int BLOCK_COMMENT_MODE = 4;
	public static String[] modeNames = {
		"DEFAULT_MODE", "ArgAction", "LexerCharSet", "DOC_COMMENT_MODE", "BLOCK_COMMENT_MODE"
	};

	public static final String[] ruleNames = {
		"DOC_COMMENT_START", "COMMENT_START", "LINE_COMMENT", "BEGIN_ARG_ACTION", 
		"OPTIONS", "TOKENS", "IMPORT", "FRAGMENT", "LEXER", "PARSER", "GRAMMAR", 
		"PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", "LOCALS", "THROWS", "CATCH", 
		"FINALLY", "MODE", "TRUE", "FALSE", "NULL", "COLON", "COLONCOLON", "COMMA", 
		"SEMI", "LPAREN", "RPAREN", "RARROW", "DRARROW", "LT", "GT", "ASSIGN", 
		"QUESTION", "STAR", "PLUS", "PLUS_ASSIGN", "OR", "DOLLAR", "DOT", "RANGE", 
		"AT", "POUND", "NOT", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "ID", 
		"NameChar", "NameStartChar", "INTEGER_LITERAL", "DECIMAL_LITERAL", "SCIENTIFIC_LITERAL", 
		"DecimalDigits", "DecimalDigit", "Sign", "Hexadecimal", "HexDigit", "STRING_LITERAL", 
		"UNTERMINATED_STRING_LITERAL", "ESC_SEQ", "UNICODE_ESC", "HEX_DIGIT", 
		"WS", "ACTION", "ACTION_ESCAPE", "ACTION_STRING_LITERAL", "ACTION_CHAR_LITERAL", 
		"ERRCHAR", "NESTED_ARG_ACTION", "ARG_ACTION_ESCAPE", "ARG_ACTION_STRING_LITERAL", 
		"ARG_ACTION_CHAR_LITERAL", "ARG_ACTION", "UNTERMINATED_ARG_ACTION", "ARG_ACTION_CHAR", 
		"LEXER_CHAR_SET_BODY", "LEXER_CHAR_SET", "UNTERMINATED_CHAR_SET", "DOC_COMMENT_CRLF", 
		"DOC_COMMENT_LINEBREAK", "DOC_COMMENT_TEXT", "DOC_COMMENT", "DOC_COMMENT_STAR", 
		"BLOCK_COMMENT_CRLF", "BLOCK_COMMENT_LINEBREAK", "BLOCK_COMMENT_TEXT", 
		"BLOCK_COMMENT", "BLOCK_COMMENT_STAR"
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


		/** Track whether we are inside of a rule and whether it is lexical parser.
		 *  _currentRuleType==Token.INVALID_TYPE means that we are outside of a rule.
		 *  At the first sign of a rule name reference and _currentRuleType==invalid,
		 *  we can assume that we are starting a parser rule. Similarly, seeing
		 *  a token reference when not already in rule means starting a token
		 *  rule. The terminating ';' of a rule, flips this back to invalid type.
		 *
		 *  This is not perfect logic but works. For example, "grammar T;" means
		 *  that we start and stop a lexical rule for the "T;". Dangerous but works.
		 *
		 *  The whole point of this state information is to distinguish
		 *  between [..arg actions..] and [charsets]. Char sets can only occur in
		 *  lexical rules and arg actions cannot occur.
		 */
		private int _currentRuleType = Token.INVALID_TYPE;
		public int getCurrentRuleType() {
			return _currentRuleType;
		}

		public void setCurrentRuleType(int ruleType) {
			this._currentRuleType = ruleType;
		}

		protected void handleBeginArgAction() {
			if (inLexerRule()) {
				pushMode(LexerCharSet);
				more();
			}
			else {
				pushMode(ArgAction);
				more();
			}
		}

		@Override
		public Token emit() {
			if (_type == ID) {
				String firstChar = _input.getText(Interval.of(_tokenStartCharIndex, _tokenStartCharIndex));
				if (Character.isUpperCase(firstChar.charAt(0))) {
					_type = TOKEN_REF;
				} else {
					_type = RULE_REF;
				}

				if (_currentRuleType == Token.INVALID_TYPE) { // if outside of rule def
					_currentRuleType = _type;                 // set to inside lexer or parser rule
				}
			}
			else if (_type == SEMI) {                  // exit rule def
				_currentRuleType = Token.INVALID_TYPE;
			}

			return super.emit();
		}

		private boolean inLexerRule() {
			return _currentRuleType == TOKEN_REF;
		}
		private boolean inParserRule() { // not used, but added for clarity
			return _currentRuleType == RULE_REF;
		}


	public AnnotatedAntlr4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AnnotatedAntlr4Lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			BEGIN_ARG_ACTION_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BEGIN_ARG_ACTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			handleBeginArgAction();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2B\u02cf\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\7\4\u00d1\n\4\f\4\16\4\u00d4\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u00e4\n\6\f\6\16\6\u00e7\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00f3\n\7\f\7\16\7\u00f6\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\7\63\u01ac\n\63\f\63\16\63\u01af\13\63\3\64\3\64\5\64"+
		"\u01b3\n\64\3\65\3\65\3\66\3\66\5\66\u01b9\n\66\3\67\6\67\u01bc\n\67\r"+
		"\67\16\67\u01bd\3\67\3\67\6\67\u01c2\n\67\r\67\16\67\u01c3\38\38\38\5"+
		"8\u01c9\n8\38\68\u01cc\n8\r8\168\u01cd\39\69\u01d1\n9\r9\169\u01d2\3:"+
		"\3:\3;\3;\3<\3<\3<\3<\5<\u01dd\n<\3<\7<\u01e0\n<\f<\16<\u01e3\13<\3=\3"+
		"=\3>\3>\3>\7>\u01ea\n>\f>\16>\u01ed\13>\3>\3>\3?\3?\3?\7?\u01f4\n?\f?"+
		"\16?\u01f7\13?\3@\3@\3@\3@\3@\5@\u01fe\n@\3A\3A\3A\3A\3A\5A\u0205\nA\5"+
		"A\u0207\nA\5A\u0209\nA\5A\u020b\nA\3B\3B\3C\6C\u0210\nC\rC\16C\u0211\3"+
		"C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u021f\nD\fD\16D\u0222\13D\3D\3D\3D"+
		"\3D\3D\3D\7D\u022a\nD\fD\16D\u022d\13D\3D\7D\u0230\nD\fD\16D\u0233\13"+
		"D\3D\5D\u0236\nD\3E\3E\3E\3F\3F\3F\7F\u023e\nF\fF\16F\u0241\13F\3F\3F"+
		"\3G\3G\3G\7G\u0248\nG\fG\16G\u024b\13G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3"+
		"I\3J\3J\3J\3J\3J\3K\3K\3K\3K\7K\u0261\nK\fK\16K\u0264\13K\3K\3K\3K\3K"+
		"\3L\3L\3L\3L\3L\5L\u026f\nL\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3O"+
		"\3P\3P\3P\6P\u0282\nP\rP\16P\u0283\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\5"+
		"S\u0291\nS\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\6U\u029e\nU\rU\16U\u029f\3"+
		"U\3U\3U\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\5X\u02b1\nX\3X\3X\3X\3X\3"+
		"X\3Y\3Y\3Y\3Y\3Y\3Z\6Z\u02be\nZ\rZ\16Z\u02bf\3Z\3Z\3Z\3[\3[\3[\3[\3[\3"+
		"[\3\\\3\\\3\\\3\\\3\\\4\u0220\u0231\2]\7\2\t\2\13\6\r\7\17\b\21\t\23\n"+
		"\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61"+
		"\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60"+
		"a\61c\62e\63g\64i\65k\2m\2o\66q\67s8u\2w\2y\2{\2}\2\1779\u0081:\u0083"+
		"\2\u0085\2\u0087\2\u0089;\u008b<\u008d\2\u008f\2\u0091\2\u0093=\u0095"+
		"\2\u0097\2\u0099\2\u009b\2\u009d>\u009f?\u00a1\2\u00a3\2\u00a5\5\u00a7"+
		"@\u00a9\2\u00ab\2\u00ad\2\u00afA\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9"+
		"B\u00bb\2\7\2\3\4\5\6\22\4\2\f\f\17\17\5\2\13\f\16\17\"\"\7\2\62;aa\u00b9"+
		"\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003"+
		"\ud801\uf902\ufdd1\ufdf2\uffff\4\2GGgg\3\2\62;\4\2--//\5\2\62;CHch\6\2"+
		"\f\f\17\17))^^\n\2$$))^^ddhhppttvv\3\3\177\177\4\2$$^^\4\2))^^\3\2^_\4"+
		"\2\u0087\u0087\u202a\u202b\b\2\f\f\17\17,,^^\u0087\u0087\u202a\u202b\u02ec"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2\177\3\2"+
		"\2\2\2\u0081\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u0093\3\2\2\2\3"+
		"\u0095\3\2\2\2\3\u0097\3\2\2\2\3\u0099\3\2\2\2\3\u009b\3\2\2\2\3\u009d"+
		"\3\2\2\2\3\u009f\3\2\2\2\3\u00a1\3\2\2\2\4\u00a3\3\2\2\2\4\u00a5\3\2\2"+
		"\2\4\u00a7\3\2\2\2\5\u00a9\3\2\2\2\5\u00ab\3\2\2\2\5\u00ad\3\2\2\2\5\u00af"+
		"\3\2\2\2\5\u00b1\3\2\2\2\6\u00b3\3\2\2\2\6\u00b5\3\2\2\2\6\u00b7\3\2\2"+
		"\2\6\u00b9\3\2\2\2\6\u00bb\3\2\2\2\7\u00bd\3\2\2\2\t\u00c5\3\2\2\2\13"+
		"\u00cc\3\2\2\2\r\u00d7\3\2\2\2\17\u00da\3\2\2\2\21\u00ea\3\2\2\2\23\u00f9"+
		"\3\2\2\2\25\u0100\3\2\2\2\27\u0109\3\2\2\2\31\u010f\3\2\2\2\33\u0116\3"+
		"\2\2\2\35\u011e\3\2\2\2\37\u0128\3\2\2\2!\u012f\3\2\2\2#\u0137\3\2\2\2"+
		"%\u013f\3\2\2\2\'\u0146\3\2\2\2)\u014d\3\2\2\2+\u0153\3\2\2\2-\u015b\3"+
		"\2\2\2/\u0160\3\2\2\2\61\u0165\3\2\2\2\63\u016b\3\2\2\2\65\u0170\3\2\2"+
		"\2\67\u0172\3\2\2\29\u0175\3\2\2\2;\u0177\3\2\2\2=\u0179\3\2\2\2?\u017b"+
		"\3\2\2\2A\u017d\3\2\2\2C\u0180\3\2\2\2E\u0183\3\2\2\2G\u0185\3\2\2\2I"+
		"\u0187\3\2\2\2K\u0189\3\2\2\2M\u018b\3\2\2\2O\u018d\3\2\2\2Q\u018f\3\2"+
		"\2\2S\u0192\3\2\2\2U\u0194\3\2\2\2W\u0196\3\2\2\2Y\u0198\3\2\2\2[\u019b"+
		"\3\2\2\2]\u019d\3\2\2\2_\u019f\3\2\2\2a\u01a1\3\2\2\2c\u01a3\3\2\2\2e"+
		"\u01a5\3\2\2\2g\u01a7\3\2\2\2i\u01a9\3\2\2\2k\u01b2\3\2\2\2m\u01b4\3\2"+
		"\2\2o\u01b8\3\2\2\2q\u01bb\3\2\2\2s\u01c5\3\2\2\2u\u01d0\3\2\2\2w\u01d4"+
		"\3\2\2\2y\u01d6\3\2\2\2{\u01dc\3\2\2\2}\u01e4\3\2\2\2\177\u01e6\3\2\2"+
		"\2\u0081\u01f0\3\2\2\2\u0083\u01f8\3\2\2\2\u0085\u01ff\3\2\2\2\u0087\u020c"+
		"\3\2\2\2\u0089\u020f\3\2\2\2\u008b\u0215\3\2\2\2\u008d\u0237\3\2\2\2\u008f"+
		"\u023a\3\2\2\2\u0091\u0244\3\2\2\2\u0093\u024e\3\2\2\2\u0095\u0252\3\2"+
		"\2\2\u0097\u0257\3\2\2\2\u0099\u025c\3\2\2\2\u009b\u026e\3\2\2\2\u009d"+
		"\u0272\3\2\2\2\u009f\u0276\3\2\2\2\u00a1\u027a\3\2\2\2\u00a3\u0281\3\2"+
		"\2\2\u00a5\u0287\3\2\2\2\u00a7\u028b\3\2\2\2\u00a9\u0290\3\2\2\2\u00ab"+
		"\u0297\3\2\2\2\u00ad\u029d\3\2\2\2\u00af\u02a4\3\2\2\2\u00b1\u02aa\3\2"+
		"\2\2\u00b3\u02b0\3\2\2\2\u00b5\u02b7\3\2\2\2\u00b7\u02bd\3\2\2\2\u00b9"+
		"\u02c4\3\2\2\2\u00bb\u02ca\3\2\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf\7"+
		",\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\2\2\2\u00c2"+
		"\u00c3\b\2\3\2\u00c3\u00c4\b\2\4\2\u00c4\b\3\2\2\2\u00c5\u00c6\7\61\2"+
		"\2\u00c6\u00c7\7,\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\3\2\2\u00c9\u00ca"+
		"\b\3\5\2\u00ca\u00cb\b\3\4\2\u00cb\n\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd"+
		"\u00ce\7\61\2\2\u00ce\u00d2\3\2\2\2\u00cf\u00d1\n\2\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\b\4\4\2\u00d6\f\3\2\2\2"+
		"\u00d7\u00d8\7]\2\2\u00d8\u00d9\b\5\6\2\u00d9\16\3\2\2\2\u00da\u00db\7"+
		"q\2\2\u00db\u00dc\7r\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7k\2\2\u00de\u00df"+
		"\7q\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e5\3\2\2\2\u00e2"+
		"\u00e4\t\3\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\7}\2\2\u00e9\20\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"\u00ed\7m\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7u\2\2"+
		"\u00f0\u00f4\3\2\2\2\u00f1\u00f3\t\3\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f8\7}\2\2\u00f8\22\3\2\2\2\u00f9\u00fa\7k\2\2"+
		"\u00fa\u00fb\7o\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe"+
		"\7t\2\2\u00fe\u00ff\7v\2\2\u00ff\24\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102"+
		"\7t\2\2\u0102\u0103\7c\2\2\u0103\u0104\7i\2\2\u0104\u0105\7o\2\2\u0105"+
		"\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107\u0108\7v\2\2\u0108\26\3\2\2\2\u0109"+
		"\u010a\7n\2\2\u010a\u010b\7g\2\2\u010b\u010c\7z\2\2\u010c\u010d\7g\2\2"+
		"\u010d\u010e\7t\2\2\u010e\30\3\2\2\2\u010f\u0110\7r\2\2\u0110\u0111\7"+
		"c\2\2\u0111\u0112\7t\2\2\u0112\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114\u0115"+
		"\7t\2\2\u0115\32\3\2\2\2\u0116\u0117\7i\2\2\u0117\u0118\7t\2\2\u0118\u0119"+
		"\7c\2\2\u0119\u011a\7o\2\2\u011a\u011b\7o\2\2\u011b\u011c\7c\2\2\u011c"+
		"\u011d\7t\2\2\u011d\34\3\2\2\2\u011e\u011f\7r\2\2\u011f\u0120\7t\2\2\u0120"+
		"\u0121\7q\2\2\u0121\u0122\7v\2\2\u0122\u0123\7g\2\2\u0123\u0124\7e\2\2"+
		"\u0124\u0125\7v\2\2\u0125\u0126\7g\2\2\u0126\u0127\7f\2\2\u0127\36\3\2"+
		"\2\2\u0128\u0129\7r\2\2\u0129\u012a\7w\2\2\u012a\u012b\7d\2\2\u012b\u012c"+
		"\7n\2\2\u012c\u012d\7k\2\2\u012d\u012e\7e\2\2\u012e \3\2\2\2\u012f\u0130"+
		"\7r\2\2\u0130\u0131\7t\2\2\u0131\u0132\7k\2\2\u0132\u0133\7x\2\2\u0133"+
		"\u0134\7c\2\2\u0134\u0135\7v\2\2\u0135\u0136\7g\2\2\u0136\"\3\2\2\2\u0137"+
		"\u0138\7t\2\2\u0138\u0139\7g\2\2\u0139\u013a\7v\2\2\u013a\u013b\7w\2\2"+
		"\u013b\u013c\7t\2\2\u013c\u013d\7p\2\2\u013d\u013e\7u\2\2\u013e$\3\2\2"+
		"\2\u013f\u0140\7n\2\2\u0140\u0141\7q\2\2\u0141\u0142\7e\2\2\u0142\u0143"+
		"\7c\2\2\u0143\u0144\7n\2\2\u0144\u0145\7u\2\2\u0145&\3\2\2\2\u0146\u0147"+
		"\7v\2\2\u0147\u0148\7j\2\2\u0148\u0149\7t\2\2\u0149\u014a\7q\2\2\u014a"+
		"\u014b\7y\2\2\u014b\u014c\7u\2\2\u014c(\3\2\2\2\u014d\u014e\7e\2\2\u014e"+
		"\u014f\7c\2\2\u014f\u0150\7v\2\2\u0150\u0151\7e\2\2\u0151\u0152\7j\2\2"+
		"\u0152*\3\2\2\2\u0153\u0154\7h\2\2\u0154\u0155\7k\2\2\u0155\u0156\7p\2"+
		"\2\u0156\u0157\7c\2\2\u0157\u0158\7n\2\2\u0158\u0159\7n\2\2\u0159\u015a"+
		"\7{\2\2\u015a,\3\2\2\2\u015b\u015c\7o\2\2\u015c\u015d\7q\2\2\u015d\u015e"+
		"\7f\2\2\u015e\u015f\7g\2\2\u015f.\3\2\2\2\u0160\u0161\7v\2\2\u0161\u0162"+
		"\7t\2\2\u0162\u0163\7w\2\2\u0163\u0164\7g\2\2\u0164\60\3\2\2\2\u0165\u0166"+
		"\7h\2\2\u0166\u0167\7c\2\2\u0167\u0168\7n\2\2\u0168\u0169\7u\2\2\u0169"+
		"\u016a\7g\2\2\u016a\62\3\2\2\2\u016b\u016c\7p\2\2\u016c\u016d\7w\2\2\u016d"+
		"\u016e\7n\2\2\u016e\u016f\7n\2\2\u016f\64\3\2\2\2\u0170\u0171\7<\2\2\u0171"+
		"\66\3\2\2\2\u0172\u0173\7<\2\2\u0173\u0174\7<\2\2\u01748\3\2\2\2\u0175"+
		"\u0176\7.\2\2\u0176:\3\2\2\2\u0177\u0178\7=\2\2\u0178<\3\2\2\2\u0179\u017a"+
		"\7*\2\2\u017a>\3\2\2\2\u017b\u017c\7+\2\2\u017c@\3\2\2\2\u017d\u017e\7"+
		"/\2\2\u017e\u017f\7@\2\2\u017fB\3\2\2\2\u0180\u0181\7?\2\2\u0181\u0182"+
		"\7@\2\2\u0182D\3\2\2\2\u0183\u0184\7>\2\2\u0184F\3\2\2\2\u0185\u0186\7"+
		"@\2\2\u0186H\3\2\2\2\u0187\u0188\7?\2\2\u0188J\3\2\2\2\u0189\u018a\7A"+
		"\2\2\u018aL\3\2\2\2\u018b\u018c\7,\2\2\u018cN\3\2\2\2\u018d\u018e\7-\2"+
		"\2\u018eP\3\2\2\2\u018f\u0190\7-\2\2\u0190\u0191\7?\2\2\u0191R\3\2\2\2"+
		"\u0192\u0193\7~\2\2\u0193T\3\2\2\2\u0194\u0195\7&\2\2\u0195V\3\2\2\2\u0196"+
		"\u0197\7\60\2\2\u0197X\3\2\2\2\u0198\u0199\7\60\2\2\u0199\u019a\7\60\2"+
		"\2\u019aZ\3\2\2\2\u019b\u019c\7B\2\2\u019c\\\3\2\2\2\u019d\u019e\7%\2"+
		"\2\u019e^\3\2\2\2\u019f\u01a0\7\u0080\2\2\u01a0`\3\2\2\2\u01a1\u01a2\7"+
		"}\2\2\u01a2b\3\2\2\2\u01a3\u01a4\7\177\2\2\u01a4d\3\2\2\2\u01a5\u01a6"+
		"\7]\2\2\u01a6f\3\2\2\2\u01a7\u01a8\7_\2\2\u01a8h\3\2\2\2\u01a9\u01ad\5"+
		"m\65\2\u01aa\u01ac\5k\64\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01aej\3\2\2\2\u01af\u01ad\3\2\2\2"+
		"\u01b0\u01b3\5m\65\2\u01b1\u01b3\t\4\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1"+
		"\3\2\2\2\u01b3l\3\2\2\2\u01b4\u01b5\t\5\2\2\u01b5n\3\2\2\2\u01b6\u01b9"+
		"\5u9\2\u01b7\u01b9\5{<\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"p\3\2\2\2\u01ba\u01bc\5w:\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\7\60"+
		"\2\2\u01c0\u01c2\5w:\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4r\3\2\2\2\u01c5\u01c6\5q\67\2\u01c6"+
		"\u01c8\t\6\2\2\u01c7\u01c9\5y;\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2"+
		"\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc\5w:\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01cet\3\2\2\2\u01cf"+
		"\u01d1\5w:\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2"+
		"\2\u01d2\u01d3\3\2\2\2\u01d3v\3\2\2\2\u01d4\u01d5\t\7\2\2\u01d5x\3\2\2"+
		"\2\u01d6\u01d7\t\b\2\2\u01d7z\3\2\2\2\u01d8\u01d9\7\62\2\2\u01d9\u01dd"+
		"\7z\2\2\u01da\u01db\7\62\2\2\u01db\u01dd\7Z\2\2\u01dc\u01d8\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01e1\3\2\2\2\u01de\u01e0\5}=\2\u01df\u01de\3\2\2"+
		"\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2|"+
		"\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\t\t\2\2\u01e5~\3\2\2\2\u01e6"+
		"\u01eb\7)\2\2\u01e7\u01ea\5\u0083@\2\u01e8\u01ea\n\n\2\2\u01e9\u01e7\3"+
		"\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7)"+
		"\2\2\u01ef\u0080\3\2\2\2\u01f0\u01f5\7)\2\2\u01f1\u01f4\5\u0083@\2\u01f2"+
		"\u01f4\n\n\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0082\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f8\u01fd\7^\2\2\u01f9\u01fe\t\13\2\2\u01fa\u01fe\5\u0085"+
		"A\2\u01fb\u01fe\13\2\2\2\u01fc\u01fe\7\2\2\3\u01fd\u01f9\3\2\2\2\u01fd"+
		"\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0084\3\2"+
		"\2\2\u01ff\u020a\7w\2\2\u0200\u0208\5\u0087B\2\u0201\u0206\5\u0087B\2"+
		"\u0202\u0204\5\u0087B\2\u0203\u0205\5\u0087B\2\u0204\u0203\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0202\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0209\3\2\2\2\u0208\u0201\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u0200\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0086\3\2"+
		"\2\2\u020c\u020d\t\t\2\2\u020d\u0088\3\2\2\2\u020e\u0210\t\3\2\2\u020f"+
		"\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0214\bC\4\2\u0214\u008a\3\2\2\2\u0215"+
		"\u0231\7}\2\2\u0216\u0230\5\u008bD\2\u0217\u0230\5\u008dE\2\u0218\u0230"+
		"\5\u008fF\2\u0219\u0230\5\u0091G\2\u021a\u021b\7\61\2\2\u021b\u021c\7"+
		",\2\2\u021c\u0220\3\2\2\2\u021d\u021f\13\2\2\2\u021e\u021d\3\2\2\2\u021f"+
		"\u0222\3\2\2\2\u0220\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0223\3\2"+
		"\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7,\2\2\u0224\u0230\7\61\2\2\u0225"+
		"\u0226\7\61\2\2\u0226\u0227\7\61\2\2\u0227\u022b\3\2\2\2\u0228\u022a\n"+
		"\2\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u0230\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\13"+
		"\2\2\2\u022f\u0216\3\2\2\2\u022f\u0217\3\2\2\2\u022f\u0218\3\2\2\2\u022f"+
		"\u0219\3\2\2\2\u022f\u021a\3\2\2\2\u022f\u0225\3\2\2\2\u022f\u022e\3\2"+
		"\2\2\u0230\u0233\3\2\2\2\u0231\u0232\3\2\2\2\u0231\u022f\3\2\2\2\u0232"+
		"\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0236\t\f\2\2\u0235\u0234\3\2"+
		"\2\2\u0236\u008c\3\2\2\2\u0237\u0238\7^\2\2\u0238\u0239\13\2\2\2\u0239"+
		"\u008e\3\2\2\2\u023a\u023f\7$\2\2\u023b\u023e\5\u008dE\2\u023c\u023e\n"+
		"\r\2\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2"+
		"\2\2\u0242\u0243\7$\2\2\u0243\u0090\3\2\2\2\u0244\u0249\7)\2\2\u0245\u0248"+
		"\5\u008dE\2\u0246\u0248\n\16\2\2\u0247\u0245\3\2\2\2\u0247\u0246\3\2\2"+
		"\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c"+
		"\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7)\2\2\u024d\u0092\3\2\2\2\u024e"+
		"\u024f\13\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\bH\4\2\u0251\u0094\3\2"+
		"\2\2\u0252\u0253\7]\2\2\u0253\u0254\3\2\2\2\u0254\u0255\bI\2\2\u0255\u0256"+
		"\bI\7\2\u0256\u0096\3\2\2\2\u0257\u0258\7^\2\2\u0258\u0259\13\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025b\bJ\2\2\u025b\u0098\3\2\2\2\u025c\u0262\7$\2"+
		"\2\u025d\u025e\7^\2\2\u025e\u0261\13\2\2\2\u025f\u0261\n\r\2\2\u0260\u025d"+
		"\3\2\2\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266\7$"+
		"\2\2\u0266\u0267\3\2\2\2\u0267\u0268\bK\2\2\u0268\u009a\3\2\2\2\u0269"+
		"\u026a\7$\2\2\u026a\u026b\7^\2\2\u026b\u026f\13\2\2\2\u026c\u026d\n\r"+
		"\2\2\u026d\u026f\7$\2\2\u026e\u0269\3\2\2\2\u026e\u026c\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0271\bL\2\2\u0271\u009c\3\2\2\2\u0272\u0273\7_\2"+
		"\2\u0273\u0274\3\2\2\2\u0274\u0275\bM\b\2\u0275\u009e\3\2\2\2\u0276\u0277"+
		"\7\2\2\3\u0277\u0278\3\2\2\2\u0278\u0279\bN\b\2\u0279\u00a0\3\2\2\2\u027a"+
		"\u027b\13\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\bO\2\2\u027d\u00a2\3\2"+
		"\2\2\u027e\u0282\n\17\2\2\u027f\u0280\7^\2\2\u0280\u0282\13\2\2\2\u0281"+
		"\u027e\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0281\3\2"+
		"\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\bP\2\2\u0286"+
		"\u00a4\3\2\2\2\u0287\u0288\7_\2\2\u0288\u0289\3\2\2\2\u0289\u028a\bQ\b"+
		"\2\u028a\u00a6\3\2\2\2\u028b\u028c\7\2\2\3\u028c\u028d\3\2\2\2\u028d\u028e"+
		"\bR\b\2\u028e\u00a8\3\2\2\2\u028f\u0291\7\17\2\2\u0290\u028f\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\7\f\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0295\bS\2\2\u0295\u0296\bS\4\2\u0296\u00aa\3\2\2\2\u0297\u0298"+
		"\t\20\2\2\u0298\u0299\3\2\2\2\u0299\u029a\bT\2\2\u029a\u029b\bT\4\2\u029b"+
		"\u00ac\3\2\2\2\u029c\u029e\n\21\2\2\u029d\u029c\3\2\2\2\u029e\u029f\3"+
		"\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a2\bU\2\2\u02a2\u02a3\bU\4\2\u02a3\u00ae\3\2\2\2\u02a4\u02a5\7,\2"+
		"\2\u02a5\u02a6\7\61\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\bV\t\2\u02a8\u02a9"+
		"\bV\4\2\u02a9\u00b0\3\2\2\2\u02aa\u02ab\7,\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ad\bW\2\2\u02ad\u02ae\bW\4\2\u02ae\u00b2\3\2\2\2\u02af\u02b1\7\17"+
		"\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b3\7\f\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\bX\2\2\u02b5\u02b6\bX\4"+
		"\2\u02b6\u00b4\3\2\2\2\u02b7\u02b8\t\20\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02ba\bY\2\2\u02ba\u02bb\bY\4\2\u02bb\u00b6\3\2\2\2\u02bc\u02be\n\21"+
		"\2\2\u02bd\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\bZ\2\2\u02c2\u02c3\bZ\4"+
		"\2\u02c3\u00b8\3\2\2\2\u02c4\u02c5\7,\2\2\u02c5\u02c6\7\61\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02c8\b[\t\2\u02c8\u02c9\b[\4\2\u02c9\u00ba\3\2\2\2\u02ca"+
		"\u02cb\7,\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\b\\\2\2\u02cd\u02ce\b\\"+
		"\4\2\u02ce\u00bc\3\2\2\2\60\2\3\4\5\6\u00d2\u00e5\u00f4\u01ad\u01b2\u01b8"+
		"\u01bd\u01c3\u01c8\u01cd\u01d2\u01dc\u01e1\u01e9\u01eb\u01f3\u01f5\u01fd"+
		"\u0204\u0206\u0208\u020a\u0211\u0220\u022b\u022f\u0231\u0235\u023d\u023f"+
		"\u0247\u0249\u0260\u0262\u026e\u0281\u0283\u0290\u029f\u02b0\u02bf\n\5"+
		"\2\2\4\5\2\2\3\2\4\6\2\3\5\2\7\3\2\6\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}