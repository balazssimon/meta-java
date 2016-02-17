// Generated from AnnotatedAntlr4PropertiesLexer.g4 by ANTLR 4.5.1
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
public class AnnotatedAntlr4PropertiesLexer extends Lexer {
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
	public static final int DOC_COMMENT_MODE = 1;
	public static final int BLOCK_COMMENT_MODE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "DOC_COMMENT_MODE", "BLOCK_COMMENT_MODE"
	};

	public static final String[] ruleNames = {
		"DOC_COMMENT_START", "COMMENT_START", "LINE_COMMENT", "TRUE", "FALSE", 
		"NULL", "COLON", "COLONCOLON", "COMMA", "SEMI", "LPAREN", "RPAREN", "LT", 
		"GT", "ASSIGN", "QUESTION", "STAR", "PLUS", "OR", "DOLLAR", "DOT", "AT", 
		"POUND", "NOT", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "ID", "NameChar", 
		"NameStartChar", "INTEGER_LITERAL", "DECIMAL_LITERAL", "SCIENTIFIC_LITERAL", 
		"DecimalDigits", "DecimalDigit", "Sign", "Hexadecimal", "HexDigit", "STRING_LITERAL", 
		"UNTERMINATED_STRING_LITERAL", "ESC_SEQ", "UNICODE_ESC", "HEX_DIGIT", 
		"WS", "ERRCHAR", "DOC_COMMENT_CRLF", "DOC_COMMENT_LINEBREAK", "DOC_COMMENT_TEXT", 
		"DOC_COMMENT", "DOC_COMMENT_STAR", "BLOCK_COMMENT_CRLF", "BLOCK_COMMENT_LINEBREAK", 
		"BLOCK_COMMENT_TEXT", "BLOCK_COMMENT", "BLOCK_COMMENT_STAR"
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


	public AnnotatedAntlr4PropertiesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AnnotatedAntlr4PropertiesLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u017c\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0089\n"+
		"\4\f\4\16\4\u008c\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\7\36\u00cf\n\36\f\36\16\36\u00d2"+
		"\13\36\3\37\3\37\5\37\u00d6\n\37\3 \3 \3!\3!\5!\u00dc\n!\3\"\6\"\u00df"+
		"\n\"\r\"\16\"\u00e0\3\"\3\"\6\"\u00e5\n\"\r\"\16\"\u00e6\3#\3#\3#\5#\u00ec"+
		"\n#\3#\6#\u00ef\n#\r#\16#\u00f0\3$\6$\u00f4\n$\r$\16$\u00f5\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\3\'\5\'\u0100\n\'\3\'\7\'\u0103\n\'\f\'\16\'\u0106\13\'"+
		"\3(\3(\3)\3)\3)\7)\u010d\n)\f)\16)\u0110\13)\3)\3)\3*\3*\3*\7*\u0117\n"+
		"*\f*\16*\u011a\13*\3+\3+\3+\3+\3+\5+\u0121\n+\3,\3,\3,\3,\3,\5,\u0128"+
		"\n,\5,\u012a\n,\5,\u012c\n,\5,\u012e\n,\3-\3-\3.\6.\u0133\n.\r.\16.\u0134"+
		"\3.\3.\3/\3/\3/\3/\3\60\5\60\u013e\n\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\6\62\u014b\n\62\r\62\16\62\u014c\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\5\65\u015e"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\6\67\u016b"+
		"\n\67\r\67\16\67\u016c\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\3"+
		"9\2\2:\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37"+
		"\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34="+
		"\35?\2A\2C\36E\37G I\2K\2M\2O\2Q\2S!U\"W\2Y\2[\2]#_$a\2c\2e\2g%i\2k\2"+
		"m\2o\2q&s\2\5\2\3\4\16\4\2\f\f\17\17\7\2\62;aa\u00b9\u00b9\u0302\u0371"+
		"\u2041\u2042\20\2C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f"+
		"\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1"+
		"\ufdf2\uffff\4\2GGgg\3\2\62;\4\2--//\5\2\62;CHch\6\2\f\f\17\17))^^\n\2"+
		"$$))^^ddhhppttvv\5\2\13\f\16\17\"\"\4\2\u0087\u0087\u202a\u202b\b\2\f"+
		"\f\17\17,,^^\u0087\u0087\u202a\u202b\u018a\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\3c\3"+
		"\2\2\2\3e\3\2\2\2\3g\3\2\2\2\3i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o\3\2\2"+
		"\2\4q\3\2\2\2\4s\3\2\2\2\5u\3\2\2\2\7}\3\2\2\2\t\u0084\3\2\2\2\13\u008f"+
		"\3\2\2\2\r\u0094\3\2\2\2\17\u009a\3\2\2\2\21\u009f\3\2\2\2\23\u00a1\3"+
		"\2\2\2\25\u00a4\3\2\2\2\27\u00a6\3\2\2\2\31\u00a8\3\2\2\2\33\u00aa\3\2"+
		"\2\2\35\u00ac\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2%"+
		"\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3"+
		"\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c4\3\2\2"+
		"\2\67\u00c6\3\2\2\29\u00c8\3\2\2\2;\u00ca\3\2\2\2=\u00cc\3\2\2\2?\u00d5"+
		"\3\2\2\2A\u00d7\3\2\2\2C\u00db\3\2\2\2E\u00de\3\2\2\2G\u00e8\3\2\2\2I"+
		"\u00f3\3\2\2\2K\u00f7\3\2\2\2M\u00f9\3\2\2\2O\u00ff\3\2\2\2Q\u0107\3\2"+
		"\2\2S\u0109\3\2\2\2U\u0113\3\2\2\2W\u011b\3\2\2\2Y\u0122\3\2\2\2[\u012f"+
		"\3\2\2\2]\u0132\3\2\2\2_\u0138\3\2\2\2a\u013d\3\2\2\2c\u0144\3\2\2\2e"+
		"\u014a\3\2\2\2g\u0151\3\2\2\2i\u0157\3\2\2\2k\u015d\3\2\2\2m\u0164\3\2"+
		"\2\2o\u016a\3\2\2\2q\u0171\3\2\2\2s\u0177\3\2\2\2uv\7\61\2\2vw\7,\2\2"+
		"wx\7,\2\2xy\3\2\2\2yz\b\2\2\2z{\b\2\3\2{|\b\2\4\2|\6\3\2\2\2}~\7\61\2"+
		"\2~\177\7,\2\2\177\u0080\3\2\2\2\u0080\u0081\b\3\2\2\u0081\u0082\b\3\5"+
		"\2\u0082\u0083\b\3\4\2\u0083\b\3\2\2\2\u0084\u0085\7\61\2\2\u0085\u0086"+
		"\7\61\2\2\u0086\u008a\3\2\2\2\u0087\u0089\n\2\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\4\4\2\u008e\n\3\2\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0093\7g\2\2"+
		"\u0093\f\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n"+
		"\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\16\3\2\2\2\u009a\u009b"+
		"\7p\2\2\u009b\u009c\7w\2\2\u009c\u009d\7n\2\2\u009d\u009e\7n\2\2\u009e"+
		"\20\3\2\2\2\u009f\u00a0\7<\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7<\2\2\u00a2"+
		"\u00a3\7<\2\2\u00a3\24\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5\26\3\2\2\2\u00a6"+
		"\u00a7\7=\2\2\u00a7\30\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9\32\3\2\2\2\u00aa"+
		"\u00ab\7+\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\36\3\2\2\2\u00ae"+
		"\u00af\7@\2\2\u00af \3\2\2\2\u00b0\u00b1\7?\2\2\u00b1\"\3\2\2\2\u00b2"+
		"\u00b3\7A\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5&\3\2\2\2\u00b6\u00b7"+
		"\7-\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7~\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7"+
		"&\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd.\3\2\2\2\u00be\u00bf\7"+
		"B\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7%\2\2\u00c1\62\3\2\2\2\u00c2\u00c3"+
		"\7\u0080\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7}\2\2\u00c5\66\3\2\2\2\u00c6"+
		"\u00c7\7\177\2\2\u00c78\3\2\2\2\u00c8\u00c9\7]\2\2\u00c9:\3\2\2\2\u00ca"+
		"\u00cb\7_\2\2\u00cb<\3\2\2\2\u00cc\u00d0\5A \2\u00cd\u00cf\5?\37\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1>\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\5A \2\u00d4\u00d6"+
		"\t\3\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6@\3\2\2\2\u00d7"+
		"\u00d8\t\4\2\2\u00d8B\3\2\2\2\u00d9\u00dc\5I$\2\u00da\u00dc\5O\'\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dcD\3\2\2\2\u00dd\u00df\5K%\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\7\60\2\2\u00e3\u00e5\5K%\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7F\3\2\2\2\u00e8\u00e9\5E\"\2\u00e9\u00eb\t\5\2\2\u00ea\u00ec"+
		"\5M&\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00ef\5K%\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2"+
		"\2\u00f0\u00f1\3\2\2\2\u00f1H\3\2\2\2\u00f2\u00f4\5K%\2\u00f3\u00f2\3"+
		"\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"J\3\2\2\2\u00f7\u00f8\t\6\2\2\u00f8L\3\2\2\2\u00f9\u00fa\t\7\2\2\u00fa"+
		"N\3\2\2\2\u00fb\u00fc\7\62\2\2\u00fc\u0100\7z\2\2\u00fd\u00fe\7\62\2\2"+
		"\u00fe\u0100\7Z\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0104"+
		"\3\2\2\2\u0101\u0103\5Q(\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105P\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\u0107\u0108\t\b\2\2\u0108R\3\2\2\2\u0109\u010e\7)\2\2\u010a\u010d\5W"+
		"+\2\u010b\u010d\n\t\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7)\2\2\u0112T\3\2\2\2\u0113\u0118"+
		"\7)\2\2\u0114\u0117\5W+\2\u0115\u0117\n\t\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119V\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0120\7^\2\2\u011c\u0121"+
		"\t\n\2\2\u011d\u0121\5Y,\2\u011e\u0121\13\2\2\2\u011f\u0121\7\2\2\3\u0120"+
		"\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2"+
		"\2\2\u0121X\3\2\2\2\u0122\u012d\7w\2\2\u0123\u012b\5[-\2\u0124\u0129\5"+
		"[-\2\u0125\u0127\5[-\2\u0126\u0128\5[-\2\u0127\u0126\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0124\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u0123\3\2\2\2\u012d\u012e\3\2\2\2\u012eZ\3\2\2\2\u012f\u0130"+
		"\t\b\2\2\u0130\\\3\2\2\2\u0131\u0133\t\13\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\b.\4\2\u0137^\3\2\2\2\u0138\u0139\13\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013b\b/\4\2\u013b`\3\2\2\2\u013c\u013e\7\17\2\2\u013d"+
		"\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\f"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b\60\2\2\u0142\u0143\b\60\4\2\u0143"+
		"b\3\2\2\2\u0144\u0145\t\f\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b\61\2\2"+
		"\u0147\u0148\b\61\4\2\u0148d\3\2\2\2\u0149\u014b\n\r\2\2\u014a\u0149\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\b\62\2\2\u014f\u0150\b\62\4\2\u0150f\3\2\2"+
		"\2\u0151\u0152\7,\2\2\u0152\u0153\7\61\2\2\u0153\u0154\3\2\2\2\u0154\u0155"+
		"\b\63\6\2\u0155\u0156\b\63\4\2\u0156h\3\2\2\2\u0157\u0158\7,\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\b\64\2\2\u015a\u015b\b\64\4\2\u015bj\3\2\2"+
		"\2\u015c\u015e\7\17\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\7\f\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b\65"+
		"\2\2\u0162\u0163\b\65\4\2\u0163l\3\2\2\2\u0164\u0165\t\f\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\b\66\2\2\u0167\u0168\b\66\4\2\u0168n\3\2\2\2\u0169"+
		"\u016b\n\r\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b\67\2\2\u016f"+
		"\u0170\b\67\4\2\u0170p\3\2\2\2\u0171\u0172\7,\2\2\u0172\u0173\7\61\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0175\b8\6\2\u0175\u0176\b8\4\2\u0176r\3\2"+
		"\2\2\u0177\u0178\7,\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b9\2\2\u017a\u017b"+
		"\b9\4\2\u017bt\3\2\2\2\36\2\3\4\u008a\u00d0\u00d5\u00db\u00e0\u00e6\u00eb"+
		"\u00f0\u00f5\u00ff\u0104\u010c\u010e\u0116\u0118\u0120\u0127\u0129\u012b"+
		"\u012d\u0134\u013d\u014c\u015d\u016c\7\5\2\2\4\3\2\2\3\2\4\4\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}