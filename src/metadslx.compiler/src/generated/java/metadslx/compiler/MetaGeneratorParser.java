// Generated from MetaGeneratorParser.g4 by ANTLR 4.5.1
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
public class MetaGeneratorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KNamespace=1, KGenerator=2, KUsing=3, KConfiguration=4, KProperties=5, 
		KTemplate=6, KFunction=7, KReturn=8, KSwitch=9, KCase=10, KType=11, KVoid=12, 
		KEnd=13, KFor=14, KForEach=15, KIn=16, KIf=17, KElse=18, KLoop=19, KHasLoop=20, 
		KWhere=21, KOrderBy=22, KDescending=23, KNull=24, KTrue=25, KFalse=26, 
		KBool=27, KByte=28, KChar=29, KDecimal=30, KDouble=31, KFloat=32, KInt=33, 
		KLong=34, KObject=35, KSByte=36, KShort=37, KString=38, KUInt=39, KULong=40, 
		KUShort=41, KThis=42, KNew=43, KIs=44, KAs=45, KTypeof=46, KDefault=47, 
		TSemicolon=48, TColon=49, TDot=50, TComma=51, TAssign=52, TAssignPlus=53, 
		TAssignMinus=54, TAssignAsterisk=55, TAssignSlash=56, TAssignPercent=57, 
		TAssignAmp=58, TAssignPipe=59, TAssignHat=60, TAssignLeftShift=61, TAssignRightShift=62, 
		TOpenParenthesis=63, TCloseParenthesis=64, TOpenBracket=65, TCloseBracket=66, 
		TOpenBrace=67, TCloseBrace=68, TEquals=69, TNotEquals=70, TArrow=71, TSingleArrow=72, 
		TLessThan=73, TGreaterThan=74, TLessThanOrEquals=75, TGreaterThanOrEquals=76, 
		TQuestion=77, TPlus=78, TMinus=79, TExclamation=80, TTilde=81, TAsterisk=82, 
		TSlash=83, TPercent=84, TPlusPlus=85, TMinusMinus=86, TColonColon=87, 
		TAmp=88, THat=89, TPipe=90, TAnd=91, TXor=92, TOr=93, TQuestionQuestion=94, 
		IdentifierNormal=95, IntegerLiteral=96, DecimalLiteral=97, ScientificLiteral=98, 
		DateTimeOffsetLiteral=99, DateTimeLiteral=100, DateLiteral=101, TimeLiteral=102, 
		CharLiteral=103, RegularStringLiteral=104, GuidLiteral=105, UTF8BOM=106, 
		WHITESPACE=107, CRLF=108, LINEBREAK=109, LINE_COMMENT=110, COMMENT=111, 
		DoubleQuoteVerbatimStringLiteral=112, TH_CRLF=113, TH_LINEBREAK=114, TH_TOpenParenthesis=115, 
		TH_TCloseParenthesis=116, KEndTemplate=117, TemplateLineControl=118, TemplateOutput=119, 
		TemplateCrLf=120, TemplateLineBreak=121, TemplateStatementStart=122, TemplateStatementEnd=123, 
		TS_TOpenBracket=124, TS_TCloseBracket=125, DoubleQuoteVerbatimStringLiteralStart=126;
	public static final int
		RULE_main = 0, RULE_namespaceDeclaration = 1, RULE_generatorDeclaration = 2, 
		RULE_usingDeclaration = 3, RULE_configDeclaration = 4, RULE_configProperty = 5, 
		RULE_methodDeclaration = 6, RULE_functionDeclaration = 7, RULE_functionSignature = 8, 
		RULE_paramList = 9, RULE_parameter = 10, RULE_body = 11, RULE_statement = 12, 
		RULE_variableDeclarationStatement = 13, RULE_returnStatement = 14, RULE_expressionStatement = 15, 
		RULE_ifStatement = 16, RULE_ifStatementBegin = 17, RULE_elseIfStatement = 18, 
		RULE_ifStatementElse = 19, RULE_ifStatementEnd = 20, RULE_loopStatement = 21, 
		RULE_loopStatementBegin = 22, RULE_loopStatementEnd = 23, RULE_loopChain = 24, 
		RULE_loopChainItem = 25, RULE_loopChainExpression = 26, RULE_loopWhereExpression = 27, 
		RULE_loopRunExpression = 28, RULE_loopRunList = 29, RULE_loopRun = 30, 
		RULE_switchStatement = 31, RULE_switchStatementBegin = 32, RULE_switchStatementEnd = 33, 
		RULE_switchBranchStatement = 34, RULE_switchBranchHeadStatement = 35, 
		RULE_switchCaseOrTypeIsHeadStatement = 36, RULE_switchCaseHeadStatement = 37, 
		RULE_switchTypeIsHeadStatement = 38, RULE_switchTypeAsHeadStatement = 39, 
		RULE_switchDefaultStatement = 40, RULE_switchDefaultHeadStatement = 41, 
		RULE_templateDeclaration = 42, RULE_templateSignature = 43, RULE_templateBody = 44, 
		RULE_templateContentLine = 45, RULE_templateOutput = 46, RULE_templateLineEnd = 47, 
		RULE_templateStatementStartEnd = 48, RULE_templateStatement = 49, RULE_typeArgumentList = 50, 
		RULE_predefinedType = 51, RULE_typeReferenceList = 52, RULE_typeReference = 53, 
		RULE_arrayType = 54, RULE_nullableType = 55, RULE_genericType = 56, RULE_simpleType = 57, 
		RULE_voidType = 58, RULE_returnType = 59, RULE_expressionList = 60, RULE_variableReference = 61, 
		RULE_rankSpecifiers = 62, RULE_rankSpecifier = 63, RULE_unboundTypeName = 64, 
		RULE_genericDimensionSpecifier = 65, RULE_anonymousFunctionSignature = 66, 
		RULE_explicitParameter = 67, RULE_implicitParameter = 68, RULE_expression = 69, 
		RULE_qualifiedName = 70, RULE_identifierList = 71, RULE_identifier = 72, 
		RULE_literal = 73, RULE_nullLiteral = 74, RULE_booleanLiteral = 75, RULE_numberLiteral = 76, 
		RULE_integerLiteral = 77, RULE_decimalLiteral = 78, RULE_scientificLiteral = 79, 
		RULE_dateOrTimeLiteral = 80, RULE_dateTimeOffsetLiteral = 81, RULE_dateTimeLiteral = 82, 
		RULE_dateLiteral = 83, RULE_timeLiteral = 84, RULE_charLiteral = 85, RULE_stringLiteral = 86, 
		RULE_guidLiteral = 87;
	public static final String[] ruleNames = {
		"main", "namespaceDeclaration", "generatorDeclaration", "usingDeclaration", 
		"configDeclaration", "configProperty", "methodDeclaration", "functionDeclaration", 
		"functionSignature", "paramList", "parameter", "body", "statement", "variableDeclarationStatement", 
		"returnStatement", "expressionStatement", "ifStatement", "ifStatementBegin", 
		"elseIfStatement", "ifStatementElse", "ifStatementEnd", "loopStatement", 
		"loopStatementBegin", "loopStatementEnd", "loopChain", "loopChainItem", 
		"loopChainExpression", "loopWhereExpression", "loopRunExpression", "loopRunList", 
		"loopRun", "switchStatement", "switchStatementBegin", "switchStatementEnd", 
		"switchBranchStatement", "switchBranchHeadStatement", "switchCaseOrTypeIsHeadStatement", 
		"switchCaseHeadStatement", "switchTypeIsHeadStatement", "switchTypeAsHeadStatement", 
		"switchDefaultStatement", "switchDefaultHeadStatement", "templateDeclaration", 
		"templateSignature", "templateBody", "templateContentLine", "templateOutput", 
		"templateLineEnd", "templateStatementStartEnd", "templateStatement", "typeArgumentList", 
		"predefinedType", "typeReferenceList", "typeReference", "arrayType", "nullableType", 
		"genericType", "simpleType", "voidType", "returnType", "expressionList", 
		"variableReference", "rankSpecifiers", "rankSpecifier", "unboundTypeName", 
		"genericDimensionSpecifier", "anonymousFunctionSignature", "explicitParameter", 
		"implicitParameter", "expression", "qualifiedName", "identifierList", 
		"identifier", "literal", "nullLiteral", "booleanLiteral", "numberLiteral", 
		"integerLiteral", "decimalLiteral", "scientificLiteral", "dateOrTimeLiteral", 
		"dateTimeOffsetLiteral", "dateTimeLiteral", "dateLiteral", "timeLiteral", 
		"charLiteral", "stringLiteral", "guidLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'namespace'", "'generator'", "'using'", "'configuration'", "'properties'", 
		"'template'", "'function'", "'return'", "'switch'", "'case'", "'type'", 
		"'void'", "'end'", "'for'", "'foreach'", "'in'", "'if'", "'else'", "'loop'", 
		"'hasloop'", "'where'", "'orderby'", "'descending'", "'null'", "'true'", 
		"'false'", null, "'byte'", "'char'", "'decimal'", "'double'", "'float'", 
		"'int'", "'long'", "'object'", "'sbyte'", "'short'", "'string'", "'uint'", 
		"'ulong'", "'ushort'", "'this'", "'new'", "'is'", "'as'", "'typeof'", 
		"'default'", "';'", "':'", "'.'", "','", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'('", "')'", 
		null, "']'", "'{'", "'}'", "'=='", "'!='", "'=>'", "'->'", "'<'", "'>'", 
		"'<='", "'>='", "'?'", "'+'", "'-'", "'!'", "'~'", null, "'/'", "'%'", 
		"'++'", "'--'", "'::'", "'&'", "'^'", "'|'", "'&&'", "'^^'", "'||'", "'??'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'\"'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'@\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KNamespace", "KGenerator", "KUsing", "KConfiguration", "KProperties", 
		"KTemplate", "KFunction", "KReturn", "KSwitch", "KCase", "KType", "KVoid", 
		"KEnd", "KFor", "KForEach", "KIn", "KIf", "KElse", "KLoop", "KHasLoop", 
		"KWhere", "KOrderBy", "KDescending", "KNull", "KTrue", "KFalse", "KBool", 
		"KByte", "KChar", "KDecimal", "KDouble", "KFloat", "KInt", "KLong", "KObject", 
		"KSByte", "KShort", "KString", "KUInt", "KULong", "KUShort", "KThis", 
		"KNew", "KIs", "KAs", "KTypeof", "KDefault", "TSemicolon", "TColon", "TDot", 
		"TComma", "TAssign", "TAssignPlus", "TAssignMinus", "TAssignAsterisk", 
		"TAssignSlash", "TAssignPercent", "TAssignAmp", "TAssignPipe", "TAssignHat", 
		"TAssignLeftShift", "TAssignRightShift", "TOpenParenthesis", "TCloseParenthesis", 
		"TOpenBracket", "TCloseBracket", "TOpenBrace", "TCloseBrace", "TEquals", 
		"TNotEquals", "TArrow", "TSingleArrow", "TLessThan", "TGreaterThan", "TLessThanOrEquals", 
		"TGreaterThanOrEquals", "TQuestion", "TPlus", "TMinus", "TExclamation", 
		"TTilde", "TAsterisk", "TSlash", "TPercent", "TPlusPlus", "TMinusMinus", 
		"TColonColon", "TAmp", "THat", "TPipe", "TAnd", "TXor", "TOr", "TQuestionQuestion", 
		"IdentifierNormal", "IntegerLiteral", "DecimalLiteral", "ScientificLiteral", 
		"DateTimeOffsetLiteral", "DateTimeLiteral", "DateLiteral", "TimeLiteral", 
		"CharLiteral", "RegularStringLiteral", "GuidLiteral", "UTF8BOM", "WHITESPACE", 
		"CRLF", "LINEBREAK", "LINE_COMMENT", "COMMENT", "DoubleQuoteVerbatimStringLiteral", 
		"TH_CRLF", "TH_LINEBREAK", "TH_TOpenParenthesis", "TH_TCloseParenthesis", 
		"KEndTemplate", "TemplateLineControl", "TemplateOutput", "TemplateCrLf", 
		"TemplateLineBreak", "TemplateStatementStart", "TemplateStatementEnd", 
		"TS_TOpenBracket", "TS_TCloseBracket", "DoubleQuoteVerbatimStringLiteralStart"
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
	public String getGrammarFileName() { return "MetaGeneratorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MetaGeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public GeneratorDeclarationContext generatorDeclaration() {
			return getRuleContext(GeneratorDeclarationContext.class,0);
		}
		public List<UsingDeclarationContext> usingDeclaration() {
			return getRuleContexts(UsingDeclarationContext.class);
		}
		public UsingDeclarationContext usingDeclaration(int i) {
			return getRuleContext(UsingDeclarationContext.class,i);
		}
		public ConfigDeclarationContext configDeclaration() {
			return getRuleContext(ConfigDeclarationContext.class,0);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			namespaceDeclaration();
			setState(177);
			generatorDeclaration();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KUsing) {
				{
				{
				setState(178);
				usingDeclaration();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			_la = _input.LA(1);
			if (_la==KProperties) {
				{
				setState(184);
				configDeclaration();
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KTemplate || _la==KFunction) {
				{
				{
				setState(187);
				methodDeclaration();
				}
				}
				setState(192);
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

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode KNamespace() { return getToken(MetaGeneratorParser.KNamespace, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaGeneratorParser.TSemicolon, 0); }
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(KNamespace);
			setState(194);
			qualifiedName();
			setState(195);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorDeclarationContext extends ParserRuleContext {
		public TerminalNode KGenerator() { return getToken(MetaGeneratorParser.KGenerator, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaGeneratorParser.TSemicolon, 0); }
		public TerminalNode KFor() { return getToken(MetaGeneratorParser.KFor, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public GeneratorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterGeneratorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitGeneratorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitGeneratorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratorDeclarationContext generatorDeclaration() throws RecognitionException {
		GeneratorDeclarationContext _localctx = new GeneratorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_generatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(KGenerator);
			setState(198);
			identifier();
			{
			setState(199);
			match(KFor);
			setState(200);
			typeReference();
			}
			setState(202);
			match(TSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingDeclarationContext extends ParserRuleContext {
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
	 
		public UsingDeclarationContext() { }
		public void copyFrom(UsingDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsingNamespaceDeclarationContext extends UsingDeclarationContext {
		public TerminalNode KUsing() { return getToken(MetaGeneratorParser.KUsing, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaGeneratorParser.TSemicolon, 0); }
		public UsingNamespaceDeclarationContext(UsingDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterUsingNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitUsingNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitUsingNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UsingGeneratorDeclarationContext extends UsingDeclarationContext {
		public TerminalNode KUsing() { return getToken(MetaGeneratorParser.KUsing, 0); }
		public TerminalNode KGenerator() { return getToken(MetaGeneratorParser.KGenerator, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaGeneratorParser.TSemicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UsingGeneratorDeclarationContext(UsingDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterUsingGeneratorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitUsingGeneratorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitUsingGeneratorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_usingDeclaration);
		int _la;
		try {
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new UsingNamespaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(KUsing);
				setState(205);
				qualifiedName();
				setState(206);
				match(TSemicolon);
				}
				break;
			case 2:
				_localctx = new UsingGeneratorDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(KUsing);
				setState(209);
				match(KGenerator);
				setState(210);
				qualifiedName();
				setState(212);
				_la = _input.LA(1);
				if (_la==IdentifierNormal) {
					{
					setState(211);
					identifier();
					}
				}

				setState(214);
				match(TSemicolon);
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

	public static class ConfigDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> KProperties() { return getTokens(MetaGeneratorParser.KProperties); }
		public TerminalNode KProperties(int i) {
			return getToken(MetaGeneratorParser.KProperties, i);
		}
		public TerminalNode KEnd() { return getToken(MetaGeneratorParser.KEnd, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ConfigPropertyContext> configProperty() {
			return getRuleContexts(ConfigPropertyContext.class);
		}
		public ConfigPropertyContext configProperty(int i) {
			return getRuleContext(ConfigPropertyContext.class,i);
		}
		public ConfigDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterConfigDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitConfigDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitConfigDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigDeclarationContext configDeclaration() throws RecognitionException {
		ConfigDeclarationContext _localctx = new ConfigDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_configDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(KProperties);
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(219);
				identifier();
				}
				break;
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KProperties) | (1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort))) != 0) || _la==IdentifierNormal) {
				{
				{
				setState(222);
				configProperty();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(KEnd);
			setState(229);
			match(KProperties);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigPropertyContext extends ParserRuleContext {
		public ConfigPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configProperty; }
	 
		public ConfigPropertyContext() { }
		public void copyFrom(ConfigPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConfigPropertyGroupDeclarationContext extends ConfigPropertyContext {
		public List<TerminalNode> KProperties() { return getTokens(MetaGeneratorParser.KProperties); }
		public TerminalNode KProperties(int i) {
			return getToken(MetaGeneratorParser.KProperties, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KEnd() { return getToken(MetaGeneratorParser.KEnd, 0); }
		public List<ConfigPropertyContext> configProperty() {
			return getRuleContexts(ConfigPropertyContext.class);
		}
		public ConfigPropertyContext configProperty(int i) {
			return getRuleContext(ConfigPropertyContext.class,i);
		}
		public ConfigPropertyGroupDeclarationContext(ConfigPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterConfigPropertyGroupDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitConfigPropertyGroupDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitConfigPropertyGroupDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConfigPropertyDeclarationContext extends ConfigPropertyContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaGeneratorParser.TSemicolon, 0); }
		public TerminalNode TAssign() { return getToken(MetaGeneratorParser.TAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConfigPropertyDeclarationContext(ConfigPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterConfigPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitConfigPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitConfigPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigPropertyContext configProperty() throws RecognitionException {
		ConfigPropertyContext _localctx = new ConfigPropertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_configProperty);
		int _la;
		try {
			setState(250);
			switch (_input.LA(1)) {
			case KBool:
			case KByte:
			case KChar:
			case KDecimal:
			case KDouble:
			case KFloat:
			case KInt:
			case KLong:
			case KObject:
			case KSByte:
			case KShort:
			case KString:
			case KUInt:
			case KULong:
			case KUShort:
			case IdentifierNormal:
				_localctx = new ConfigPropertyDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				typeReference();
				setState(232);
				identifier();
				setState(235);
				_la = _input.LA(1);
				if (_la==TAssign) {
					{
					setState(233);
					match(TAssign);
					setState(234);
					expression(0);
					}
				}

				setState(237);
				match(TSemicolon);
				}
				break;
			case KProperties:
				_localctx = new ConfigPropertyGroupDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(KProperties);
				setState(240);
				identifier();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KProperties) | (1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort))) != 0) || _la==IdentifierNormal) {
					{
					{
					setState(241);
					configProperty();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(KEnd);
				setState(248);
				match(KProperties);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case KFunction:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				functionDeclaration();
				}
				break;
			case KTemplate:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				templateDeclaration();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KEnd() { return getToken(MetaGeneratorParser.KEnd, 0); }
		public TerminalNode KFunction() { return getToken(MetaGeneratorParser.KFunction, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			functionSignature();
			setState(257);
			body();
			setState(258);
			match(KEnd);
			setState(259);
			match(KFunction);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSignatureContext extends ParserRuleContext {
		public TerminalNode KFunction() { return getToken(MetaGeneratorParser.KFunction, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(KFunction);
			setState(262);
			returnType();
			setState(263);
			identifier();
			setState(264);
			match(TOpenParenthesis);
			setState(266);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort))) != 0) || _la==IdentifierNormal) {
				{
				setState(265);
				paramList();
				}
			}

			setState(268);
			match(TCloseParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaGeneratorParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaGeneratorParser.TComma, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			parameter();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(271);
				match(TComma);
				setState(272);
				parameter();
				}
				}
				setState(277);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TAssign() { return getToken(MetaGeneratorParser.TAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			typeReference();
			setState(279);
			identifier();
			setState(282);
			_la = _input.LA(1);
			if (_la==TAssign) {
				{
				setState(280);
				match(TAssign);
				setState(281);
				expression(0);
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

	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284);
					statement();
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaGeneratorParser.TSemicolon, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				variableDeclarationStatement();
				setState(291);
				match(TSemicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				returnStatement();
				setState(294);
				match(TSemicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				expressionStatement();
				setState(297);
				match(TSemicolon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				switchStatement();
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

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TAssign() { return getToken(MetaGeneratorParser.TAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			typeReference();
			setState(305);
			identifier();
			setState(308);
			_la = _input.LA(1);
			if (_la==TAssign) {
				{
				setState(306);
				match(TAssign);
				setState(307);
				expression(0);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode KReturn() { return getToken(MetaGeneratorParser.KReturn, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(KReturn);
			setState(311);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementBeginContext ifStatementBegin() {
			return getRuleContext(IfStatementBeginContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public IfStatementEndContext ifStatementEnd() {
			return getRuleContext(IfStatementEndContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public IfStatementElseContext ifStatementElse() {
			return getRuleContext(IfStatementElseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			ifStatementBegin();
			setState(316);
			body();
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					elseIfStatement();
					setState(318);
					body();
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(328);
			_la = _input.LA(1);
			if (_la==KElse) {
				{
				setState(325);
				ifStatementElse();
				setState(326);
				body();
				}
			}

			setState(330);
			ifStatementEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementBeginContext extends ParserRuleContext {
		public TerminalNode KIf() { return getToken(MetaGeneratorParser.KIf, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public IfStatementBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterIfStatementBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitIfStatementBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitIfStatementBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementBeginContext ifStatementBegin() throws RecognitionException {
		IfStatementBeginContext _localctx = new IfStatementBeginContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatementBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(KIf);
			setState(333);
			match(TOpenParenthesis);
			setState(334);
			expression(0);
			setState(335);
			match(TCloseParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode KElse() { return getToken(MetaGeneratorParser.KElse, 0); }
		public TerminalNode KIf() { return getToken(MetaGeneratorParser.KIf, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(KElse);
			setState(338);
			match(KIf);
			setState(339);
			match(TOpenParenthesis);
			setState(340);
			expression(0);
			setState(341);
			match(TCloseParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementElseContext extends ParserRuleContext {
		public TerminalNode KElse() { return getToken(MetaGeneratorParser.KElse, 0); }
		public IfStatementElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterIfStatementElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitIfStatementElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitIfStatementElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementElseContext ifStatementElse() throws RecognitionException {
		IfStatementElseContext _localctx = new IfStatementElseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatementElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(KElse);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementEndContext extends ParserRuleContext {
		public TerminalNode KEnd() { return getToken(MetaGeneratorParser.KEnd, 0); }
		public TerminalNode KIf() { return getToken(MetaGeneratorParser.KIf, 0); }
		public IfStatementEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterIfStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitIfStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitIfStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementEndContext ifStatementEnd() throws RecognitionException {
		IfStatementEndContext _localctx = new IfStatementEndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatementEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(KEnd);
			setState(346);
			match(KIf);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStatementBeginContext loopStatementBegin() {
			return getRuleContext(LoopStatementBeginContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LoopStatementEndContext loopStatementEnd() {
			return getRuleContext(LoopStatementEndContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			loopStatementBegin();
			setState(349);
			body();
			setState(350);
			loopStatementEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementBeginContext extends ParserRuleContext {
		public TerminalNode KLoop() { return getToken(MetaGeneratorParser.KLoop, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public LoopChainContext loopChain() {
			return getRuleContext(LoopChainContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public LoopWhereExpressionContext loopWhereExpression() {
			return getRuleContext(LoopWhereExpressionContext.class,0);
		}
		public LoopRunExpressionContext loopRunExpression() {
			return getRuleContext(LoopRunExpressionContext.class,0);
		}
		public LoopStatementBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatementBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopStatementBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopStatementBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopStatementBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementBeginContext loopStatementBegin() throws RecognitionException {
		LoopStatementBeginContext _localctx = new LoopStatementBeginContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loopStatementBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(KLoop);
			setState(353);
			match(TOpenParenthesis);
			setState(354);
			loopChain();
			setState(356);
			_la = _input.LA(1);
			if (_la==KWhere) {
				{
				setState(355);
				loopWhereExpression();
				}
			}

			setState(359);
			_la = _input.LA(1);
			if (_la==TSemicolon) {
				{
				setState(358);
				loopRunExpression();
				}
			}

			setState(361);
			match(TCloseParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementEndContext extends ParserRuleContext {
		public TerminalNode KEnd() { return getToken(MetaGeneratorParser.KEnd, 0); }
		public TerminalNode KLoop() { return getToken(MetaGeneratorParser.KLoop, 0); }
		public LoopStatementEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatementEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementEndContext loopStatementEnd() throws RecognitionException {
		LoopStatementEndContext _localctx = new LoopStatementEndContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loopStatementEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(KEnd);
			setState(364);
			match(KLoop);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopChainContext extends ParserRuleContext {
		public List<LoopChainItemContext> loopChainItem() {
			return getRuleContexts(LoopChainItemContext.class);
		}
		public LoopChainItemContext loopChainItem(int i) {
			return getRuleContext(LoopChainItemContext.class,i);
		}
		public List<TerminalNode> TSingleArrow() { return getTokens(MetaGeneratorParser.TSingleArrow); }
		public TerminalNode TSingleArrow(int i) {
			return getToken(MetaGeneratorParser.TSingleArrow, i);
		}
		public LoopChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopChainContext loopChain() throws RecognitionException {
		LoopChainContext _localctx = new LoopChainContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loopChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			loopChainItem();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TSingleArrow) {
				{
				{
				setState(367);
				match(TSingleArrow);
				setState(368);
				loopChainItem();
				}
				}
				setState(373);
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

	public static class LoopChainItemContext extends ParserRuleContext {
		public LoopChainExpressionContext loopChainExpression() {
			return getRuleContext(LoopChainExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TColon() { return getToken(MetaGeneratorParser.TColon, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public LoopChainItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopChainItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopChainItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopChainItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopChainItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopChainItemContext loopChainItem() throws RecognitionException {
		LoopChainItemContext _localctx = new LoopChainItemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopChainItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(375);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(374);
					typeReference();
					}
					break;
				}
				setState(377);
				identifier();
				setState(378);
				match(TColon);
				}
				break;
			}
			setState(382);
			loopChainExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopChainExpressionContext extends ParserRuleContext {
		public LoopChainExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopChainExpression; }
	 
		public LoopChainExpressionContext() { }
		public void copyFrom(LoopChainExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopChainMemberAccessExpressionContext extends LoopChainExpressionContext {
		public LoopChainExpressionContext loopChainExpression() {
			return getRuleContext(LoopChainExpressionContext.class,0);
		}
		public TerminalNode TDot() { return getToken(MetaGeneratorParser.TDot, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public LoopChainMemberAccessExpressionContext(LoopChainExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopChainMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopChainMemberAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopChainMemberAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopChainMethodCallExpressionContext extends LoopChainExpressionContext {
		public LoopChainExpressionContext loopChainExpression() {
			return getRuleContext(LoopChainExpressionContext.class,0);
		}
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LoopChainMethodCallExpressionContext(LoopChainExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopChainMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopChainMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopChainMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopChainIdentifierExpressionContext extends LoopChainExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public LoopChainIdentifierExpressionContext(LoopChainExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopChainIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopChainIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopChainIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopChainTypeofExpressionContext extends LoopChainExpressionContext {
		public TerminalNode KTypeof() { return getToken(MetaGeneratorParser.KTypeof, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public LoopChainTypeofExpressionContext(LoopChainExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopChainTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopChainTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopChainTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopChainExpressionContext loopChainExpression() throws RecognitionException {
		return loopChainExpression(0);
	}

	private LoopChainExpressionContext loopChainExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LoopChainExpressionContext _localctx = new LoopChainExpressionContext(_ctx, _parentState);
		LoopChainExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_loopChainExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			switch (_input.LA(1)) {
			case KTypeof:
				{
				_localctx = new LoopChainTypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(385);
				match(KTypeof);
				setState(386);
				match(TOpenParenthesis);
				setState(387);
				typeReference();
				setState(388);
				match(TCloseParenthesis);
				}
				break;
			case IdentifierNormal:
				{
				_localctx = new LoopChainIdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(390);
				identifier();
				setState(392);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(391);
					typeArgumentList();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(408);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new LoopChainMemberAccessExpressionContext(new LoopChainExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_loopChainExpression);
						setState(396);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(397);
						match(TDot);
						setState(398);
						identifier();
						setState(400);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(399);
							typeArgumentList();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new LoopChainMethodCallExpressionContext(new LoopChainExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_loopChainExpression);
						setState(402);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(403);
						match(TOpenParenthesis);
						setState(405);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KHasLoop) | (1L << KNull) | (1L << KTrue) | (1L << KFalse) | (1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort) | (1L << KThis) | (1L << KNew) | (1L << KTypeof) | (1L << KDefault) | (1L << TOpenParenthesis))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (TPlus - 78)) | (1L << (TMinus - 78)) | (1L << (TExclamation - 78)) | (1L << (TTilde - 78)) | (1L << (TPlusPlus - 78)) | (1L << (TMinusMinus - 78)) | (1L << (IdentifierNormal - 78)) | (1L << (IntegerLiteral - 78)) | (1L << (DecimalLiteral - 78)) | (1L << (ScientificLiteral - 78)) | (1L << (DateTimeOffsetLiteral - 78)) | (1L << (DateTimeLiteral - 78)) | (1L << (DateLiteral - 78)) | (1L << (TimeLiteral - 78)) | (1L << (CharLiteral - 78)) | (1L << (RegularStringLiteral - 78)) | (1L << (GuidLiteral - 78)) | (1L << (DoubleQuoteVerbatimStringLiteral - 78)))) != 0)) {
							{
							setState(404);
							expressionList();
							}
						}

						setState(407);
						match(TCloseParenthesis);
						}
						break;
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LoopWhereExpressionContext extends ParserRuleContext {
		public TerminalNode KWhere() { return getToken(MetaGeneratorParser.KWhere, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopWhereExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopWhereExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopWhereExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopWhereExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopWhereExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopWhereExpressionContext loopWhereExpression() throws RecognitionException {
		LoopWhereExpressionContext _localctx = new LoopWhereExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_loopWhereExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(KWhere);
			setState(414);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopRunExpressionContext extends ParserRuleContext {
		public List<TerminalNode> TSemicolon() { return getTokens(MetaGeneratorParser.TSemicolon); }
		public TerminalNode TSemicolon(int i) {
			return getToken(MetaGeneratorParser.TSemicolon, i);
		}
		public List<LoopRunListContext> loopRunList() {
			return getRuleContexts(LoopRunListContext.class);
		}
		public LoopRunListContext loopRunList(int i) {
			return getRuleContext(LoopRunListContext.class,i);
		}
		public LoopRunExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopRunExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopRunExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopRunExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopRunExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopRunExpressionContext loopRunExpression() throws RecognitionException {
		LoopRunExpressionContext _localctx = new LoopRunExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_loopRunExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(416);
				match(TSemicolon);
				setState(417);
				loopRunList();
				}
				}
				setState(420); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TSemicolon );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopRunListContext extends ParserRuleContext {
		public List<LoopRunContext> loopRun() {
			return getRuleContexts(LoopRunContext.class);
		}
		public LoopRunContext loopRun(int i) {
			return getRuleContext(LoopRunContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaGeneratorParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaGeneratorParser.TComma, i);
		}
		public LoopRunListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopRunList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopRunList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopRunList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopRunList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopRunListContext loopRunList() throws RecognitionException {
		LoopRunListContext _localctx = new LoopRunListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loopRunList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			loopRun();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(423);
				match(TComma);
				setState(424);
				loopRun();
				}
				}
				setState(429);
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

	public static class LoopRunContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public LoopRunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopRun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLoopRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLoopRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLoopRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopRunContext loopRun() throws RecognitionException {
		LoopRunContext _localctx = new LoopRunContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loopRun);
		try {
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				variableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				expressionStatement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchStatementBeginContext switchStatementBegin() {
			return getRuleContext(SwitchStatementBeginContext.class,0);
		}
		public SwitchStatementEndContext switchStatementEnd() {
			return getRuleContext(SwitchStatementEndContext.class,0);
		}
		public List<SwitchBranchStatementContext> switchBranchStatement() {
			return getRuleContexts(SwitchBranchStatementContext.class);
		}
		public SwitchBranchStatementContext switchBranchStatement(int i) {
			return getRuleContext(SwitchBranchStatementContext.class,i);
		}
		public SwitchDefaultStatementContext switchDefaultStatement() {
			return getRuleContext(SwitchDefaultStatementContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			switchStatementBegin();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KCase || _la==KType) {
				{
				{
				setState(435);
				switchBranchStatement();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			_la = _input.LA(1);
			if (_la==KDefault) {
				{
				setState(441);
				switchDefaultStatement();
				}
			}

			setState(444);
			switchStatementEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementBeginContext extends ParserRuleContext {
		public TerminalNode KSwitch() { return getToken(MetaGeneratorParser.KSwitch, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public SwitchStatementBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatementBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchStatementBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchStatementBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchStatementBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementBeginContext switchStatementBegin() throws RecognitionException {
		SwitchStatementBeginContext _localctx = new SwitchStatementBeginContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchStatementBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(KSwitch);
			setState(447);
			match(TOpenParenthesis);
			setState(448);
			expression(0);
			setState(449);
			match(TCloseParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementEndContext extends ParserRuleContext {
		public TerminalNode KEnd() { return getToken(MetaGeneratorParser.KEnd, 0); }
		public TerminalNode KSwitch() { return getToken(MetaGeneratorParser.KSwitch, 0); }
		public SwitchStatementEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatementEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementEndContext switchStatementEnd() throws RecognitionException {
		SwitchStatementEndContext _localctx = new SwitchStatementEndContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switchStatementEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(KEnd);
			setState(452);
			match(KSwitch);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBranchStatementContext extends ParserRuleContext {
		public SwitchBranchHeadStatementContext switchBranchHeadStatement() {
			return getRuleContext(SwitchBranchHeadStatementContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public SwitchBranchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBranchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchBranchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchBranchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchBranchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBranchStatementContext switchBranchStatement() throws RecognitionException {
		SwitchBranchStatementContext _localctx = new SwitchBranchStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switchBranchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			switchBranchHeadStatement();
			setState(455);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBranchHeadStatementContext extends ParserRuleContext {
		public List<SwitchCaseOrTypeIsHeadStatementContext> switchCaseOrTypeIsHeadStatement() {
			return getRuleContexts(SwitchCaseOrTypeIsHeadStatementContext.class);
		}
		public SwitchCaseOrTypeIsHeadStatementContext switchCaseOrTypeIsHeadStatement(int i) {
			return getRuleContext(SwitchCaseOrTypeIsHeadStatementContext.class,i);
		}
		public SwitchTypeAsHeadStatementContext switchTypeAsHeadStatement() {
			return getRuleContext(SwitchTypeAsHeadStatementContext.class,0);
		}
		public SwitchBranchHeadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBranchHeadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchBranchHeadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchBranchHeadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchBranchHeadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBranchHeadStatementContext switchBranchHeadStatement() throws RecognitionException {
		SwitchBranchHeadStatementContext _localctx = new SwitchBranchHeadStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_switchBranchHeadStatement);
		try {
			int _alt;
			setState(463);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(457);
						switchCaseOrTypeIsHeadStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(460); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				switchTypeAsHeadStatement();
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

	public static class SwitchCaseOrTypeIsHeadStatementContext extends ParserRuleContext {
		public SwitchCaseHeadStatementContext switchCaseHeadStatement() {
			return getRuleContext(SwitchCaseHeadStatementContext.class,0);
		}
		public SwitchTypeIsHeadStatementContext switchTypeIsHeadStatement() {
			return getRuleContext(SwitchTypeIsHeadStatementContext.class,0);
		}
		public SwitchCaseOrTypeIsHeadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseOrTypeIsHeadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchCaseOrTypeIsHeadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchCaseOrTypeIsHeadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchCaseOrTypeIsHeadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseOrTypeIsHeadStatementContext switchCaseOrTypeIsHeadStatement() throws RecognitionException {
		SwitchCaseOrTypeIsHeadStatementContext _localctx = new SwitchCaseOrTypeIsHeadStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchCaseOrTypeIsHeadStatement);
		try {
			setState(467);
			switch (_input.LA(1)) {
			case KCase:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				switchCaseHeadStatement();
				}
				break;
			case KType:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				switchTypeIsHeadStatement();
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

	public static class SwitchCaseHeadStatementContext extends ParserRuleContext {
		public TerminalNode KCase() { return getToken(MetaGeneratorParser.KCase, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode TColon() { return getToken(MetaGeneratorParser.TColon, 0); }
		public SwitchCaseHeadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseHeadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchCaseHeadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchCaseHeadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchCaseHeadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseHeadStatementContext switchCaseHeadStatement() throws RecognitionException {
		SwitchCaseHeadStatementContext _localctx = new SwitchCaseHeadStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_switchCaseHeadStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(KCase);
			setState(470);
			expressionList();
			setState(471);
			match(TColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchTypeIsHeadStatementContext extends ParserRuleContext {
		public TerminalNode KType() { return getToken(MetaGeneratorParser.KType, 0); }
		public TerminalNode KIs() { return getToken(MetaGeneratorParser.KIs, 0); }
		public TypeReferenceListContext typeReferenceList() {
			return getRuleContext(TypeReferenceListContext.class,0);
		}
		public TerminalNode TColon() { return getToken(MetaGeneratorParser.TColon, 0); }
		public SwitchTypeIsHeadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchTypeIsHeadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchTypeIsHeadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchTypeIsHeadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchTypeIsHeadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchTypeIsHeadStatementContext switchTypeIsHeadStatement() throws RecognitionException {
		SwitchTypeIsHeadStatementContext _localctx = new SwitchTypeIsHeadStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switchTypeIsHeadStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(KType);
			setState(474);
			match(KIs);
			setState(475);
			typeReferenceList();
			setState(476);
			match(TColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchTypeAsHeadStatementContext extends ParserRuleContext {
		public TerminalNode KType() { return getToken(MetaGeneratorParser.KType, 0); }
		public TerminalNode KAs() { return getToken(MetaGeneratorParser.KAs, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode TColon() { return getToken(MetaGeneratorParser.TColon, 0); }
		public SwitchTypeAsHeadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchTypeAsHeadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchTypeAsHeadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchTypeAsHeadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchTypeAsHeadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchTypeAsHeadStatementContext switchTypeAsHeadStatement() throws RecognitionException {
		SwitchTypeAsHeadStatementContext _localctx = new SwitchTypeAsHeadStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switchTypeAsHeadStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(KType);
			setState(479);
			match(KAs);
			setState(480);
			typeReference();
			setState(481);
			match(TColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchDefaultStatementContext extends ParserRuleContext {
		public SwitchDefaultHeadStatementContext switchDefaultHeadStatement() {
			return getRuleContext(SwitchDefaultHeadStatementContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public SwitchDefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchDefaultStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchDefaultStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchDefaultStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchDefaultStatementContext switchDefaultStatement() throws RecognitionException {
		SwitchDefaultStatementContext _localctx = new SwitchDefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switchDefaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			switchDefaultHeadStatement();
			setState(484);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchDefaultHeadStatementContext extends ParserRuleContext {
		public TerminalNode KDefault() { return getToken(MetaGeneratorParser.KDefault, 0); }
		public TerminalNode TColon() { return getToken(MetaGeneratorParser.TColon, 0); }
		public SwitchDefaultHeadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchDefaultHeadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSwitchDefaultHeadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSwitchDefaultHeadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSwitchDefaultHeadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchDefaultHeadStatementContext switchDefaultHeadStatement() throws RecognitionException {
		SwitchDefaultHeadStatementContext _localctx = new SwitchDefaultHeadStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_switchDefaultHeadStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(KDefault);
			setState(487);
			match(TColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TerminalNode KEndTemplate() { return getToken(MetaGeneratorParser.KEndTemplate, 0); }
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			templateSignature();
			setState(490);
			templateBody();
			setState(491);
			match(KEndTemplate);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateSignatureContext extends ParserRuleContext {
		public TerminalNode KTemplate() { return getToken(MetaGeneratorParser.KTemplate, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TemplateSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTemplateSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTemplateSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTemplateSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateSignatureContext templateSignature() throws RecognitionException {
		TemplateSignatureContext _localctx = new TemplateSignatureContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_templateSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(KTemplate);
			setState(494);
			identifier();
			setState(495);
			match(TOpenParenthesis);
			setState(497);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort))) != 0) || _la==IdentifierNormal) {
				{
				setState(496);
				paramList();
				}
			}

			setState(499);
			match(TCloseParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBodyContext extends ParserRuleContext {
		public List<TemplateContentLineContext> templateContentLine() {
			return getRuleContexts(TemplateContentLineContext.class);
		}
		public TemplateContentLineContext templateContentLine(int i) {
			return getRuleContext(TemplateContentLineContext.class,i);
		}
		public TemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTemplateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTemplateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTemplateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBodyContext templateBody() throws RecognitionException {
		TemplateBodyContext _localctx = new TemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_templateBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (TemplateLineControl - 118)) | (1L << (TemplateOutput - 118)) | (1L << (TemplateCrLf - 118)) | (1L << (TemplateLineBreak - 118)) | (1L << (TemplateStatementStart - 118)))) != 0)) {
				{
				{
				setState(501);
				templateContentLine();
				}
				}
				setState(506);
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

	public static class TemplateContentLineContext extends ParserRuleContext {
		public TemplateLineEndContext templateLineEnd() {
			return getRuleContext(TemplateLineEndContext.class,0);
		}
		public List<TemplateOutputContext> templateOutput() {
			return getRuleContexts(TemplateOutputContext.class);
		}
		public TemplateOutputContext templateOutput(int i) {
			return getRuleContext(TemplateOutputContext.class,i);
		}
		public List<TemplateStatementStartEndContext> templateStatementStartEnd() {
			return getRuleContexts(TemplateStatementStartEndContext.class);
		}
		public TemplateStatementStartEndContext templateStatementStartEnd(int i) {
			return getRuleContext(TemplateStatementStartEndContext.class,i);
		}
		public TemplateContentLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContentLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTemplateContentLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTemplateContentLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTemplateContentLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContentLineContext templateContentLine() throws RecognitionException {
		TemplateContentLineContext _localctx = new TemplateContentLineContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_templateContentLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateOutput || _la==TemplateStatementStart) {
				{
				setState(509);
				switch (_input.LA(1)) {
				case TemplateOutput:
					{
					setState(507);
					templateOutput();
					}
					break;
				case TemplateStatementStart:
					{
					setState(508);
					templateStatementStartEnd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
			templateLineEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateOutputContext extends ParserRuleContext {
		public TerminalNode TemplateOutput() { return getToken(MetaGeneratorParser.TemplateOutput, 0); }
		public TemplateOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTemplateOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTemplateOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTemplateOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateOutputContext templateOutput() throws RecognitionException {
		TemplateOutputContext _localctx = new TemplateOutputContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_templateOutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(TemplateOutput);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateLineEndContext extends ParserRuleContext {
		public TerminalNode TemplateCrLf() { return getToken(MetaGeneratorParser.TemplateCrLf, 0); }
		public TerminalNode TemplateLineBreak() { return getToken(MetaGeneratorParser.TemplateLineBreak, 0); }
		public TerminalNode TemplateLineControl() { return getToken(MetaGeneratorParser.TemplateLineControl, 0); }
		public TemplateLineEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateLineEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTemplateLineEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTemplateLineEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTemplateLineEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateLineEndContext templateLineEnd() throws RecognitionException {
		TemplateLineEndContext _localctx = new TemplateLineEndContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_templateLineEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (TemplateLineControl - 118)) | (1L << (TemplateCrLf - 118)) | (1L << (TemplateLineBreak - 118)))) != 0)) ) {
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

	public static class TemplateStatementStartEndContext extends ParserRuleContext {
		public TerminalNode TemplateStatementStart() { return getToken(MetaGeneratorParser.TemplateStatementStart, 0); }
		public TerminalNode TemplateStatementEnd() { return getToken(MetaGeneratorParser.TemplateStatementEnd, 0); }
		public TemplateStatementContext templateStatement() {
			return getRuleContext(TemplateStatementContext.class,0);
		}
		public TemplateStatementStartEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStatementStartEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTemplateStatementStartEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTemplateStatementStartEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTemplateStatementStartEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStatementStartEndContext templateStatementStartEnd() throws RecognitionException {
		TemplateStatementStartEndContext _localctx = new TemplateStatementStartEndContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_templateStatementStartEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(TemplateStatementStart);
			setState(522);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KSwitch) | (1L << KCase) | (1L << KType) | (1L << KEnd) | (1L << KIf) | (1L << KElse) | (1L << KLoop) | (1L << KHasLoop) | (1L << KNull) | (1L << KTrue) | (1L << KFalse) | (1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort) | (1L << KThis) | (1L << KNew) | (1L << KTypeof) | (1L << KDefault) | (1L << TOpenParenthesis))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (TPlus - 78)) | (1L << (TMinus - 78)) | (1L << (TExclamation - 78)) | (1L << (TTilde - 78)) | (1L << (TPlusPlus - 78)) | (1L << (TMinusMinus - 78)) | (1L << (IdentifierNormal - 78)) | (1L << (IntegerLiteral - 78)) | (1L << (DecimalLiteral - 78)) | (1L << (ScientificLiteral - 78)) | (1L << (DateTimeOffsetLiteral - 78)) | (1L << (DateTimeLiteral - 78)) | (1L << (DateLiteral - 78)) | (1L << (TimeLiteral - 78)) | (1L << (CharLiteral - 78)) | (1L << (RegularStringLiteral - 78)) | (1L << (GuidLiteral - 78)) | (1L << (DoubleQuoteVerbatimStringLiteral - 78)))) != 0)) {
				{
				setState(521);
				templateStatement();
				}
			}

			setState(524);
			match(TemplateStatementEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementBeginContext ifStatementBegin() {
			return getRuleContext(IfStatementBeginContext.class,0);
		}
		public ElseIfStatementContext elseIfStatement() {
			return getRuleContext(ElseIfStatementContext.class,0);
		}
		public IfStatementElseContext ifStatementElse() {
			return getRuleContext(IfStatementElseContext.class,0);
		}
		public IfStatementEndContext ifStatementEnd() {
			return getRuleContext(IfStatementEndContext.class,0);
		}
		public LoopStatementBeginContext loopStatementBegin() {
			return getRuleContext(LoopStatementBeginContext.class,0);
		}
		public LoopStatementEndContext loopStatementEnd() {
			return getRuleContext(LoopStatementEndContext.class,0);
		}
		public SwitchStatementBeginContext switchStatementBegin() {
			return getRuleContext(SwitchStatementBeginContext.class,0);
		}
		public SwitchStatementEndContext switchStatementEnd() {
			return getRuleContext(SwitchStatementEndContext.class,0);
		}
		public SwitchBranchHeadStatementContext switchBranchHeadStatement() {
			return getRuleContext(SwitchBranchHeadStatementContext.class,0);
		}
		public SwitchDefaultHeadStatementContext switchDefaultHeadStatement() {
			return getRuleContext(SwitchDefaultHeadStatementContext.class,0);
		}
		public TemplateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTemplateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTemplateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTemplateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStatementContext templateStatement() throws RecognitionException {
		TemplateStatementContext _localctx = new TemplateStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_templateStatement);
		try {
			setState(538);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				variableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				ifStatementBegin();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				elseIfStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(530);
				ifStatementElse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(531);
				ifStatementEnd();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(532);
				loopStatementBegin();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(533);
				loopStatementEnd();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(534);
				switchStatementBegin();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(535);
				switchStatementEnd();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(536);
				switchBranchHeadStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(537);
				switchDefaultHeadStatement();
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public TerminalNode TLessThan() { return getToken(MetaGeneratorParser.TLessThan, 0); }
		public TypeReferenceListContext typeReferenceList() {
			return getRuleContext(TypeReferenceListContext.class,0);
		}
		public TerminalNode TGreaterThan() { return getToken(MetaGeneratorParser.TGreaterThan, 0); }
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeArgumentList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(TLessThan);
			setState(541);
			typeReferenceList();
			setState(542);
			match(TGreaterThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredefinedTypeContext extends ParserRuleContext {
		public TerminalNode KBool() { return getToken(MetaGeneratorParser.KBool, 0); }
		public TerminalNode KByte() { return getToken(MetaGeneratorParser.KByte, 0); }
		public TerminalNode KChar() { return getToken(MetaGeneratorParser.KChar, 0); }
		public TerminalNode KDecimal() { return getToken(MetaGeneratorParser.KDecimal, 0); }
		public TerminalNode KDouble() { return getToken(MetaGeneratorParser.KDouble, 0); }
		public TerminalNode KFloat() { return getToken(MetaGeneratorParser.KFloat, 0); }
		public TerminalNode KInt() { return getToken(MetaGeneratorParser.KInt, 0); }
		public TerminalNode KLong() { return getToken(MetaGeneratorParser.KLong, 0); }
		public TerminalNode KObject() { return getToken(MetaGeneratorParser.KObject, 0); }
		public TerminalNode KSByte() { return getToken(MetaGeneratorParser.KSByte, 0); }
		public TerminalNode KShort() { return getToken(MetaGeneratorParser.KShort, 0); }
		public TerminalNode KString() { return getToken(MetaGeneratorParser.KString, 0); }
		public TerminalNode KUInt() { return getToken(MetaGeneratorParser.KUInt, 0); }
		public TerminalNode KULong() { return getToken(MetaGeneratorParser.KULong, 0); }
		public TerminalNode KUShort() { return getToken(MetaGeneratorParser.KUShort, 0); }
		public PredefinedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefinedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterPredefinedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitPredefinedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitPredefinedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredefinedTypeContext predefinedType() throws RecognitionException {
		PredefinedTypeContext _localctx = new PredefinedTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_predefinedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort))) != 0)) ) {
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

	public static class TypeReferenceListContext extends ParserRuleContext {
		public List<TypeReferenceContext> typeReference() {
			return getRuleContexts(TypeReferenceContext.class);
		}
		public TypeReferenceContext typeReference(int i) {
			return getRuleContext(TypeReferenceContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaGeneratorParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaGeneratorParser.TComma, i);
		}
		public TypeReferenceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReferenceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTypeReferenceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTypeReferenceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTypeReferenceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeReferenceListContext typeReferenceList() throws RecognitionException {
		TypeReferenceListContext _localctx = new TypeReferenceListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeReferenceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			typeReference();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(547);
				match(TComma);
				setState(548);
				typeReference();
				}
				}
				setState(553);
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

	public static class TypeReferenceContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTypeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTypeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeReference);
		try {
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				nullableType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				genericType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				simpleType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public RankSpecifiersContext rankSpecifiers() {
			return getRuleContext(RankSpecifiersContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(560);
				nullableType();
				}
				break;
			case 2:
				{
				setState(561);
				genericType();
				}
				break;
			case 3:
				{
				setState(562);
				simpleType();
				}
				break;
			}
			setState(565);
			rankSpecifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullableTypeContext extends ParserRuleContext {
		public TerminalNode TQuestion() { return getToken(MetaGeneratorParser.TQuestion, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public NullableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterNullableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitNullableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitNullableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullableTypeContext nullableType() throws RecognitionException {
		NullableTypeContext _localctx = new NullableTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_nullableType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(567);
				genericType();
				}
				break;
			case 2:
				{
				setState(568);
				simpleType();
				}
				break;
			}
			setState(571);
			match(TQuestion);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_genericType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			qualifiedName();
			setState(574);
			typeArgumentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PredefinedTypeContext predefinedType() {
			return getRuleContext(PredefinedTypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_simpleType);
		try {
			setState(578);
			switch (_input.LA(1)) {
			case IdentifierNormal:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				qualifiedName();
				}
				break;
			case KBool:
			case KByte:
			case KChar:
			case KDecimal:
			case KDouble:
			case KFloat:
			case KInt:
			case KLong:
			case KObject:
			case KSByte:
			case KShort:
			case KString:
			case KUInt:
			case KULong:
			case KUShort:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				predefinedType();
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

	public static class VoidTypeContext extends ParserRuleContext {
		public TerminalNode KVoid() { return getToken(MetaGeneratorParser.KVoid, 0); }
		public VoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(KVoid);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_returnType);
		try {
			setState(584);
			switch (_input.LA(1)) {
			case KBool:
			case KByte:
			case KChar:
			case KDecimal:
			case KDouble:
			case KFloat:
			case KInt:
			case KLong:
			case KObject:
			case KSByte:
			case KShort:
			case KString:
			case KUInt:
			case KULong:
			case KUShort:
			case IdentifierNormal:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				typeReference();
				}
				break;
			case KVoid:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				voidType();
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaGeneratorParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaGeneratorParser.TComma, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			expression(0);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(587);
				match(TComma);
				setState(588);
				expression(0);
				}
				}
				setState(593);
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RankSpecifiersContext extends ParserRuleContext {
		public List<RankSpecifierContext> rankSpecifier() {
			return getRuleContexts(RankSpecifierContext.class);
		}
		public RankSpecifierContext rankSpecifier(int i) {
			return getRuleContext(RankSpecifierContext.class,i);
		}
		public RankSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rankSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterRankSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitRankSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitRankSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RankSpecifiersContext rankSpecifiers() throws RecognitionException {
		RankSpecifiersContext _localctx = new RankSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_rankSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(596);
					rankSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(599); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class RankSpecifierContext extends ParserRuleContext {
		public TerminalNode TOpenBracket() { return getToken(MetaGeneratorParser.TOpenBracket, 0); }
		public TerminalNode TCloseBracket() { return getToken(MetaGeneratorParser.TCloseBracket, 0); }
		public List<TerminalNode> TComma() { return getTokens(MetaGeneratorParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaGeneratorParser.TComma, i);
		}
		public RankSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rankSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterRankSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitRankSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitRankSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RankSpecifierContext rankSpecifier() throws RecognitionException {
		RankSpecifierContext _localctx = new RankSpecifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_rankSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(TOpenBracket);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(602);
				match(TComma);
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608);
			match(TCloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnboundTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<GenericDimensionSpecifierContext> genericDimensionSpecifier() {
			return getRuleContexts(GenericDimensionSpecifierContext.class);
		}
		public GenericDimensionSpecifierContext genericDimensionSpecifier(int i) {
			return getRuleContext(GenericDimensionSpecifierContext.class,i);
		}
		public List<TerminalNode> TDot() { return getTokens(MetaGeneratorParser.TDot); }
		public TerminalNode TDot(int i) {
			return getToken(MetaGeneratorParser.TDot, i);
		}
		public UnboundTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unboundTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterUnboundTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitUnboundTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitUnboundTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnboundTypeNameContext unboundTypeName() throws RecognitionException {
		UnboundTypeNameContext _localctx = new UnboundTypeNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unboundTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			identifier();
			setState(612);
			_la = _input.LA(1);
			if (_la==TLessThan) {
				{
				setState(611);
				genericDimensionSpecifier();
				}
			}

			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TDot) {
				{
				{
				setState(614);
				match(TDot);
				setState(615);
				identifier();
				setState(617);
				_la = _input.LA(1);
				if (_la==TLessThan) {
					{
					setState(616);
					genericDimensionSpecifier();
					}
				}

				}
				}
				setState(623);
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

	public static class GenericDimensionSpecifierContext extends ParserRuleContext {
		public TerminalNode TLessThan() { return getToken(MetaGeneratorParser.TLessThan, 0); }
		public TerminalNode TGreaterThan() { return getToken(MetaGeneratorParser.TGreaterThan, 0); }
		public List<TerminalNode> TComma() { return getTokens(MetaGeneratorParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaGeneratorParser.TComma, i);
		}
		public GenericDimensionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDimensionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterGenericDimensionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitGenericDimensionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitGenericDimensionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDimensionSpecifierContext genericDimensionSpecifier() throws RecognitionException {
		GenericDimensionSpecifierContext _localctx = new GenericDimensionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_genericDimensionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(TLessThan);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(625);
				match(TComma);
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631);
			match(TGreaterThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousFunctionSignatureContext extends ParserRuleContext {
		public AnonymousFunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunctionSignature; }
	 
		public AnonymousFunctionSignatureContext() { }
		public void copyFrom(AnonymousFunctionSignatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleParamAnonymousFunctionSignatureContext extends AnonymousFunctionSignatureContext {
		public ImplicitParameterContext implicitParameter() {
			return getRuleContext(ImplicitParameterContext.class,0);
		}
		public SingleParamAnonymousFunctionSignatureContext(AnonymousFunctionSignatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterSingleParamAnonymousFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitSingleParamAnonymousFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitSingleParamAnonymousFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplicitAnonymousFunctionSignatureContext extends AnonymousFunctionSignatureContext {
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public List<ImplicitParameterContext> implicitParameter() {
			return getRuleContexts(ImplicitParameterContext.class);
		}
		public ImplicitParameterContext implicitParameter(int i) {
			return getRuleContext(ImplicitParameterContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaGeneratorParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaGeneratorParser.TComma, i);
		}
		public ImplicitAnonymousFunctionSignatureContext(AnonymousFunctionSignatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterImplicitAnonymousFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitImplicitAnonymousFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitImplicitAnonymousFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplicitAnonymousFunctionSignatureContext extends AnonymousFunctionSignatureContext {
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public List<ExplicitParameterContext> explicitParameter() {
			return getRuleContexts(ExplicitParameterContext.class);
		}
		public ExplicitParameterContext explicitParameter(int i) {
			return getRuleContext(ExplicitParameterContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaGeneratorParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaGeneratorParser.TComma, i);
		}
		public ExplicitAnonymousFunctionSignatureContext(AnonymousFunctionSignatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterExplicitAnonymousFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitExplicitAnonymousFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitExplicitAnonymousFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionSignatureContext anonymousFunctionSignature() throws RecognitionException {
		AnonymousFunctionSignatureContext _localctx = new AnonymousFunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_anonymousFunctionSignature);
		int _la;
		try {
			setState(658);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new ExplicitAnonymousFunctionSignatureContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				match(TOpenParenthesis);
				setState(642);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort))) != 0) || _la==IdentifierNormal) {
					{
					setState(634);
					explicitParameter();
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TComma) {
						{
						{
						setState(635);
						match(TComma);
						setState(636);
						explicitParameter();
						}
						}
						setState(641);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(644);
				match(TCloseParenthesis);
				}
				break;
			case 2:
				_localctx = new ImplicitAnonymousFunctionSignatureContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				match(TOpenParenthesis);
				setState(654);
				_la = _input.LA(1);
				if (_la==IdentifierNormal) {
					{
					setState(646);
					implicitParameter();
					setState(651);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TComma) {
						{
						{
						setState(647);
						match(TComma);
						setState(648);
						implicitParameter();
						}
						}
						setState(653);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(656);
				match(TCloseParenthesis);
				}
				break;
			case 3:
				_localctx = new SingleParamAnonymousFunctionSignatureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				implicitParameter();
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

	public static class ExplicitParameterContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExplicitParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterExplicitParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitExplicitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitExplicitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitParameterContext explicitParameter() throws RecognitionException {
		ExplicitParameterContext _localctx = new ExplicitParameterContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_explicitParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			typeReference();
			setState(661);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImplicitParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterImplicitParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitImplicitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitImplicitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicitParameterContext implicitParameter() throws RecognitionException {
		ImplicitParameterContext _localctx = new ImplicitParameterContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_implicitParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			identifier();
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeofUnboundTypeExpressionContext extends ExpressionContext {
		public TerminalNode KTypeof() { return getToken(MetaGeneratorParser.KTypeof, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public UnboundTypeNameContext unboundTypeName() {
			return getRuleContext(UnboundTypeNameContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public TypeofUnboundTypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTypeofUnboundTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTypeofUnboundTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTypeofUnboundTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TPlus() { return getToken(MetaGeneratorParser.TPlus, 0); }
		public TerminalNode TMinus() { return getToken(MetaGeneratorParser.TMinus, 0); }
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypecheckExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode KIs() { return getToken(MetaGeneratorParser.KIs, 0); }
		public TerminalNode KAs() { return getToken(MetaGeneratorParser.KAs, 0); }
		public TypecheckExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTypecheckExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTypecheckExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTypecheckExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TLessThan() { return getToken(MetaGeneratorParser.TLessThan, 0); }
		public TerminalNode TGreaterThan() { return getToken(MetaGeneratorParser.TGreaterThan, 0); }
		public TerminalNode TLessThanOrEquals() { return getToken(MetaGeneratorParser.TLessThanOrEquals, 0); }
		public TerminalNode TGreaterThanOrEquals() { return getToken(MetaGeneratorParser.TGreaterThanOrEquals, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TPlusPlus() { return getToken(MetaGeneratorParser.TPlusPlus, 0); }
		public TerminalNode TMinusMinus() { return getToken(MetaGeneratorParser.TMinusMinus, 0); }
		public PostExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterPostExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitPostExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitPostExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeofVoidExpressionContext extends ExpressionContext {
		public TerminalNode KTypeof() { return getToken(MetaGeneratorParser.KTypeof, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TerminalNode KVoid() { return getToken(MetaGeneratorParser.KVoid, 0); }
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public TypeofVoidExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTypeofVoidExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTypeofVoidExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTypeofVoidExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseAndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TAmp() { return getToken(MetaGeneratorParser.TAmp, 0); }
		public BitwiseAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterBitwiseAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitBitwiseAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TAnd() { return getToken(MetaGeneratorParser.TAnd, 0); }
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TDot() { return getToken(MetaGeneratorParser.TDot, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public MemberAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitMemberAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitMemberAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TPlus() { return getToken(MetaGeneratorParser.TPlus, 0); }
		public TerminalNode TMinus() { return getToken(MetaGeneratorParser.TMinus, 0); }
		public TerminalNode TExclamation() { return getToken(MetaGeneratorParser.TExclamation, 0); }
		public TerminalNode TTilde() { return getToken(MetaGeneratorParser.TTilde, 0); }
		public TerminalNode TPlusPlus() { return getToken(MetaGeneratorParser.TPlusPlus, 0); }
		public TerminalNode TMinusMinus() { return getToken(MetaGeneratorParser.TMinusMinus, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypecastExpressionContext extends ExpressionContext {
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypecastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTypecastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTypecastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTypecastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalXorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TXor() { return getToken(MetaGeneratorParser.TXor, 0); }
		public LogicalXorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLogicalXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLogicalXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLogicalXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredefinedTypeMemberAccessExpressionContext extends ExpressionContext {
		public PredefinedTypeContext predefinedType() {
			return getRuleContext(PredefinedTypeContext.class,0);
		}
		public TerminalNode TDot() { return getToken(MetaGeneratorParser.TDot, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public PredefinedTypeMemberAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterPredefinedTypeMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitPredefinedTypeMemberAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitPredefinedTypeMemberAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseXorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THat() { return getToken(MetaGeneratorParser.THat, 0); }
		public BitwiseXorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterBitwiseXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitBitwiseXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitBitwiseXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExpressionContext extends ExpressionContext {
		public AnonymousFunctionSignatureContext anonymousFunctionSignature() {
			return getRuleContext(AnonymousFunctionSignatureContext.class,0);
		}
		public TerminalNode TArrow() { return getToken(MetaGeneratorParser.TArrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefaultValueExpressionContext extends ExpressionContext {
		public TerminalNode KDefault() { return getToken(MetaGeneratorParser.KDefault, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public DefaultValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterDefaultValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitDefaultValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitDefaultValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TQuestion() { return getToken(MetaGeneratorParser.TQuestion, 0); }
		public TerminalNode TColon() { return getToken(MetaGeneratorParser.TColon, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TAssign() { return getToken(MetaGeneratorParser.TAssign, 0); }
		public TerminalNode TAssignPlus() { return getToken(MetaGeneratorParser.TAssignPlus, 0); }
		public TerminalNode TAssignMinus() { return getToken(MetaGeneratorParser.TAssignMinus, 0); }
		public TerminalNode TAssignAsterisk() { return getToken(MetaGeneratorParser.TAssignAsterisk, 0); }
		public TerminalNode TAssignSlash() { return getToken(MetaGeneratorParser.TAssignSlash, 0); }
		public TerminalNode TAssignPercent() { return getToken(MetaGeneratorParser.TAssignPercent, 0); }
		public TerminalNode TAssignAmp() { return getToken(MetaGeneratorParser.TAssignAmp, 0); }
		public TerminalNode TAssignPipe() { return getToken(MetaGeneratorParser.TAssignPipe, 0); }
		public TerminalNode TAssignHat() { return getToken(MetaGeneratorParser.TAssignHat, 0); }
		public TerminalNode TAssignLeftShift() { return getToken(MetaGeneratorParser.TAssignLeftShift, 0); }
		public TerminalNode TAssignRightShift() { return getToken(MetaGeneratorParser.TAssignRightShift, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TAsterisk() { return getToken(MetaGeneratorParser.TAsterisk, 0); }
		public TerminalNode TSlash() { return getToken(MetaGeneratorParser.TSlash, 0); }
		public TerminalNode TPercent() { return getToken(MetaGeneratorParser.TPercent, 0); }
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitMultiplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewObjectOrCollectionWithConstructorExpressionContext extends ExpressionContext {
		public TerminalNode KNew() { return getToken(MetaGeneratorParser.KNew, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NewObjectOrCollectionWithConstructorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterNewObjectOrCollectionWithConstructorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitNewObjectOrCollectionWithConstructorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitNewObjectOrCollectionWithConstructorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TOr() { return getToken(MetaGeneratorParser.TOr, 0); }
		public LogicalOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TPipe() { return getToken(MetaGeneratorParser.TPipe, 0); }
		public BitwiseOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterBitwiseOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitBitwiseOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HasLoopExpressionContext extends ExpressionContext {
		public TerminalNode KHasLoop() { return getToken(MetaGeneratorParser.KHasLoop, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public LoopChainContext loopChain() {
			return getRuleContext(LoopChainContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public LoopWhereExpressionContext loopWhereExpression() {
			return getRuleContext(LoopWhereExpressionContext.class,0);
		}
		public HasLoopExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterHasLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitHasLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitHasLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode KThis() { return getToken(MetaGeneratorParser.KThis, 0); }
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElementAccessExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOpenBracket() { return getToken(MetaGeneratorParser.TOpenBracket, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode TCloseBracket() { return getToken(MetaGeneratorParser.TCloseBracket, 0); }
		public ElementAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterElementAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitElementAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitElementAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeofTypeExpressionContext extends ExpressionContext {
		public TerminalNode KTypeof() { return getToken(MetaGeneratorParser.KTypeof, 0); }
		public TerminalNode TOpenParenthesis() { return getToken(MetaGeneratorParser.TOpenParenthesis, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode TCloseParenthesis() { return getToken(MetaGeneratorParser.TCloseParenthesis, 0); }
		public TypeofTypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTypeofTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTypeofTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTypeofTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TEquals() { return getToken(MetaGeneratorParser.TEquals, 0); }
		public TerminalNode TNotEquals() { return getToken(MetaGeneratorParser.TNotEquals, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				_localctx = new TypecastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(666);
				match(TOpenParenthesis);
				setState(667);
				typeReference();
				setState(668);
				match(TCloseParenthesis);
				setState(669);
				expression(17);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(671);
				_la = _input.LA(1);
				if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (TPlus - 78)) | (1L << (TMinus - 78)) | (1L << (TExclamation - 78)) | (1L << (TTilde - 78)) | (1L << (TPlusPlus - 78)) | (1L << (TMinusMinus - 78)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(672);
				expression(16);
				}
				break;
			case 3:
				{
				_localctx = new LambdaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(673);
				anonymousFunctionSignature();
				setState(674);
				match(TArrow);
				setState(675);
				expression(1);
				}
				break;
			case 4:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(677);
				match(KThis);
				}
				break;
			case 5:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(678);
				literal();
				}
				break;
			case 6:
				{
				_localctx = new TypeofVoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(679);
				match(KTypeof);
				setState(680);
				match(TOpenParenthesis);
				setState(681);
				match(KVoid);
				setState(682);
				match(TCloseParenthesis);
				}
				break;
			case 7:
				{
				_localctx = new TypeofUnboundTypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(683);
				match(KTypeof);
				setState(684);
				match(TOpenParenthesis);
				setState(685);
				unboundTypeName();
				setState(686);
				match(TCloseParenthesis);
				}
				break;
			case 8:
				{
				_localctx = new TypeofTypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(688);
				match(KTypeof);
				setState(689);
				match(TOpenParenthesis);
				setState(690);
				typeReference();
				setState(691);
				match(TCloseParenthesis);
				}
				break;
			case 9:
				{
				_localctx = new DefaultValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(693);
				match(KDefault);
				setState(694);
				match(TOpenParenthesis);
				setState(695);
				typeReference();
				setState(696);
				match(TCloseParenthesis);
				}
				break;
			case 10:
				{
				_localctx = new NewObjectOrCollectionWithConstructorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(698);
				match(KNew);
				setState(699);
				typeReference();
				setState(700);
				match(TOpenParenthesis);
				setState(702);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KHasLoop) | (1L << KNull) | (1L << KTrue) | (1L << KFalse) | (1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort) | (1L << KThis) | (1L << KNew) | (1L << KTypeof) | (1L << KDefault) | (1L << TOpenParenthesis))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (TPlus - 78)) | (1L << (TMinus - 78)) | (1L << (TExclamation - 78)) | (1L << (TTilde - 78)) | (1L << (TPlusPlus - 78)) | (1L << (TMinusMinus - 78)) | (1L << (IdentifierNormal - 78)) | (1L << (IntegerLiteral - 78)) | (1L << (DecimalLiteral - 78)) | (1L << (ScientificLiteral - 78)) | (1L << (DateTimeOffsetLiteral - 78)) | (1L << (DateTimeLiteral - 78)) | (1L << (DateLiteral - 78)) | (1L << (TimeLiteral - 78)) | (1L << (CharLiteral - 78)) | (1L << (RegularStringLiteral - 78)) | (1L << (GuidLiteral - 78)) | (1L << (DoubleQuoteVerbatimStringLiteral - 78)))) != 0)) {
					{
					setState(701);
					expressionList();
					}
				}

				setState(704);
				match(TCloseParenthesis);
				}
				break;
			case 11:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(706);
				identifier();
				setState(708);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(707);
					typeArgumentList();
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new HasLoopExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(710);
				match(KHasLoop);
				setState(711);
				match(TOpenParenthesis);
				setState(712);
				loopChain();
				setState(714);
				_la = _input.LA(1);
				if (_la==KWhere) {
					{
					setState(713);
					loopWhereExpression();
					}
				}

				setState(716);
				match(TCloseParenthesis);
				}
				break;
			case 13:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(718);
				match(TOpenParenthesis);
				setState(719);
				expression(0);
				setState(720);
				match(TCloseParenthesis);
				}
				break;
			case 14:
				{
				_localctx = new PredefinedTypeMemberAccessExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(722);
				predefinedType();
				setState(723);
				match(TDot);
				setState(724);
				identifier();
				setState(726);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(725);
					typeArgumentList();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(791);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(730);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(731);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (TAsterisk - 82)) | (1L << (TSlash - 82)) | (1L << (TPercent - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(732);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(733);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(734);
						_la = _input.LA(1);
						if ( !(_la==TPlus || _la==TMinus) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(735);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(736);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(737);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (TLessThan - 73)) | (1L << (TGreaterThan - 73)) | (1L << (TLessThanOrEquals - 73)) | (1L << (TGreaterThanOrEquals - 73)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(738);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(739);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(740);
						_la = _input.LA(1);
						if ( !(_la==TEquals || _la==TNotEquals) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(741);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(742);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(743);
						match(TAmp);
						setState(744);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new BitwiseXorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(746);
						match(THat);
						setState(747);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(749);
						match(TPipe);
						setState(750);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(751);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(752);
						match(TAnd);
						setState(753);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new LogicalXorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(755);
						match(TXor);
						setState(756);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(757);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(758);
						match(TOr);
						setState(759);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(761);
						match(TQuestion);
						setState(762);
						expression(0);
						setState(763);
						match(TColon);
						setState(764);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(766);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(767);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAssign) | (1L << TAssignPlus) | (1L << TAssignMinus) | (1L << TAssignAsterisk) | (1L << TAssignSlash) | (1L << TAssignPercent) | (1L << TAssignAmp) | (1L << TAssignPipe) | (1L << TAssignHat) | (1L << TAssignLeftShift) | (1L << TAssignRightShift))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(768);
						expression(3);
						}
						break;
					case 13:
						{
						_localctx = new ElementAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(769);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(770);
						match(TOpenBracket);
						setState(771);
						expressionList();
						setState(772);
						match(TCloseBracket);
						}
						break;
					case 14:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(774);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(775);
						match(TOpenParenthesis);
						setState(777);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KHasLoop) | (1L << KNull) | (1L << KTrue) | (1L << KFalse) | (1L << KBool) | (1L << KByte) | (1L << KChar) | (1L << KDecimal) | (1L << KDouble) | (1L << KFloat) | (1L << KInt) | (1L << KLong) | (1L << KObject) | (1L << KSByte) | (1L << KShort) | (1L << KString) | (1L << KUInt) | (1L << KULong) | (1L << KUShort) | (1L << KThis) | (1L << KNew) | (1L << KTypeof) | (1L << KDefault) | (1L << TOpenParenthesis))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (TPlus - 78)) | (1L << (TMinus - 78)) | (1L << (TExclamation - 78)) | (1L << (TTilde - 78)) | (1L << (TPlusPlus - 78)) | (1L << (TMinusMinus - 78)) | (1L << (IdentifierNormal - 78)) | (1L << (IntegerLiteral - 78)) | (1L << (DecimalLiteral - 78)) | (1L << (ScientificLiteral - 78)) | (1L << (DateTimeOffsetLiteral - 78)) | (1L << (DateTimeLiteral - 78)) | (1L << (DateLiteral - 78)) | (1L << (TimeLiteral - 78)) | (1L << (CharLiteral - 78)) | (1L << (RegularStringLiteral - 78)) | (1L << (GuidLiteral - 78)) | (1L << (DoubleQuoteVerbatimStringLiteral - 78)))) != 0)) {
							{
							setState(776);
							expressionList();
							}
						}

						setState(779);
						match(TCloseParenthesis);
						}
						break;
					case 15:
						{
						_localctx = new MemberAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(780);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(781);
						match(TDot);
						setState(782);
						identifier();
						setState(784);
						switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
						case 1:
							{
							setState(783);
							typeArgumentList();
							}
							break;
						}
						}
						break;
					case 16:
						{
						_localctx = new PostExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(786);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(787);
						_la = _input.LA(1);
						if ( !(_la==TPlusPlus || _la==TMinusMinus) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					case 17:
						{
						_localctx = new TypecheckExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(788);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(789);
						_la = _input.LA(1);
						if ( !(_la==KIs || _la==KAs) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(790);
						typeReference();
						}
						break;
					}
					} 
				}
				setState(795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		public List<TerminalNode> TDot() { return getTokens(MetaGeneratorParser.TDot); }
		public TerminalNode TDot(int i) {
			return getToken(MetaGeneratorParser.TDot, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			identifier();
			setState(801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(797);
					match(TDot);
					setState(798);
					identifier();
					}
					} 
				}
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaGeneratorParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaGeneratorParser.TComma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			identifier();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(805);
				match(TComma);
				setState(806);
				identifier();
				}
				}
				setState(811);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IdentifierNormal() { return getToken(MetaGeneratorParser.IdentifierNormal, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(IdentifierNormal);
			}
		}
		catch (RecognitionException re) {
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
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public DateOrTimeLiteralContext dateOrTimeLiteral() {
			return getRuleContext(DateOrTimeLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public GuidLiteralContext guidLiteral() {
			return getRuleContext(GuidLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_literal);
		try {
			setState(821);
			switch (_input.LA(1)) {
			case KNull:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				nullLiteral();
				}
				break;
			case KTrue:
			case KFalse:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				booleanLiteral();
				}
				break;
			case IntegerLiteral:
			case DecimalLiteral:
			case ScientificLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				numberLiteral();
				}
				break;
			case DateTimeOffsetLiteral:
			case DateTimeLiteral:
			case DateLiteral:
			case TimeLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(817);
				dateOrTimeLiteral();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(818);
				charLiteral();
				}
				break;
			case RegularStringLiteral:
			case DoubleQuoteVerbatimStringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(819);
				stringLiteral();
				}
				break;
			case GuidLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(820);
				guidLiteral();
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

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode KNull() { return getToken(MetaGeneratorParser.KNull, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(KNull);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode KTrue() { return getToken(MetaGeneratorParser.KTrue, 0); }
		public TerminalNode KFalse() { return getToken(MetaGeneratorParser.KFalse, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_la = _input.LA(1);
			if ( !(_la==KTrue || _la==KFalse) ) {
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public ScientificLiteralContext scientificLiteral() {
			return getRuleContext(ScientificLiteralContext.class,0);
		}
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_numberLiteral);
		try {
			setState(830);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				integerLiteral();
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				decimalLiteral();
				}
				break;
			case ScientificLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(829);
				scientificLiteral();
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(MetaGeneratorParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(MetaGeneratorParser.DecimalLiteral, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScientificLiteralContext extends ParserRuleContext {
		public TerminalNode ScientificLiteral() { return getToken(MetaGeneratorParser.ScientificLiteral, 0); }
		public ScientificLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientificLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterScientificLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitScientificLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitScientificLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificLiteralContext scientificLiteral() throws RecognitionException {
		ScientificLiteralContext _localctx = new ScientificLiteralContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_scientificLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(ScientificLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateOrTimeLiteralContext extends ParserRuleContext {
		public DateTimeLiteralContext dateTimeLiteral() {
			return getRuleContext(DateTimeLiteralContext.class,0);
		}
		public DateTimeOffsetLiteralContext dateTimeOffsetLiteral() {
			return getRuleContext(DateTimeOffsetLiteralContext.class,0);
		}
		public DateLiteralContext dateLiteral() {
			return getRuleContext(DateLiteralContext.class,0);
		}
		public TimeLiteralContext timeLiteral() {
			return getRuleContext(TimeLiteralContext.class,0);
		}
		public DateOrTimeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateOrTimeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterDateOrTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitDateOrTimeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitDateOrTimeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateOrTimeLiteralContext dateOrTimeLiteral() throws RecognitionException {
		DateOrTimeLiteralContext _localctx = new DateOrTimeLiteralContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_dateOrTimeLiteral);
		try {
			setState(842);
			switch (_input.LA(1)) {
			case DateTimeLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				dateTimeLiteral();
				}
				break;
			case DateTimeOffsetLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				dateTimeOffsetLiteral();
				}
				break;
			case DateLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				dateLiteral();
				}
				break;
			case TimeLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(841);
				timeLiteral();
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

	public static class DateTimeOffsetLiteralContext extends ParserRuleContext {
		public TerminalNode DateTimeOffsetLiteral() { return getToken(MetaGeneratorParser.DateTimeOffsetLiteral, 0); }
		public DateTimeOffsetLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeOffsetLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterDateTimeOffsetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitDateTimeOffsetLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitDateTimeOffsetLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeOffsetLiteralContext dateTimeOffsetLiteral() throws RecognitionException {
		DateTimeOffsetLiteralContext _localctx = new DateTimeOffsetLiteralContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_dateTimeOffsetLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(DateTimeOffsetLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateTimeLiteralContext extends ParserRuleContext {
		public TerminalNode DateTimeLiteral() { return getToken(MetaGeneratorParser.DateTimeLiteral, 0); }
		public DateTimeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterDateTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitDateTimeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitDateTimeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeLiteralContext dateTimeLiteral() throws RecognitionException {
		DateTimeLiteralContext _localctx = new DateTimeLiteralContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_dateTimeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(DateTimeLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateLiteralContext extends ParserRuleContext {
		public TerminalNode DateLiteral() { return getToken(MetaGeneratorParser.DateLiteral, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitDateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(DateLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeLiteralContext extends ParserRuleContext {
		public TerminalNode TimeLiteral() { return getToken(MetaGeneratorParser.TimeLiteral, 0); }
		public TimeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitTimeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitTimeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeLiteralContext timeLiteral() throws RecognitionException {
		TimeLiteralContext _localctx = new TimeLiteralContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_timeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(TimeLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharLiteralContext extends ParserRuleContext {
		public TerminalNode CharLiteral() { return getToken(MetaGeneratorParser.CharLiteral, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(CharLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode RegularStringLiteral() { return getToken(MetaGeneratorParser.RegularStringLiteral, 0); }
		public TerminalNode DoubleQuoteVerbatimStringLiteral() { return getToken(MetaGeneratorParser.DoubleQuoteVerbatimStringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_la = _input.LA(1);
			if ( !(_la==RegularStringLiteral || _la==DoubleQuoteVerbatimStringLiteral) ) {
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

	public static class GuidLiteralContext extends ParserRuleContext {
		public TerminalNode GuidLiteral() { return getToken(MetaGeneratorParser.GuidLiteral, 0); }
		public GuidLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guidLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).enterGuidLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGeneratorParserListener ) ((MetaGeneratorParserListener)listener).exitGuidLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGeneratorParserVisitor ) return ((MetaGeneratorParserVisitor<? extends T>)visitor).visitGuidLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuidLiteralContext guidLiteral() throws RecognitionException {
		GuidLiteralContext _localctx = new GuidLiteralContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_guidLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(GuidLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return loopChainExpression_sempred((LoopChainExpressionContext)_localctx, predIndex);
		case 69:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean loopChainExpression_sempred(LoopChainExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 20);
		case 16:
			return precpred(_ctx, 18);
		case 17:
			return precpred(_ctx, 15);
		case 18:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0080\u035d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\7\2\u00b6\n\2\f\2\16\2\u00b9"+
		"\13\2\3\2\5\2\u00bc\n\2\3\2\7\2\u00bf\n\2\f\2\16\2\u00c2\13\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u00d7\n\5\3\5\3\5\5\5\u00db\n\5\3\6\3\6\5\6\u00df\n\6\3\6\7\6\u00e2"+
		"\n\6\f\6\16\6\u00e5\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00ee\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00f5\n\7\f\7\16\7\u00f8\13\7\3\7\3\7\3\7\5\7\u00fd"+
		"\n\7\3\b\3\b\5\b\u0101\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u010d\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u0114\n\13\f\13\16\13\u0117\13"+
		"\13\3\f\3\f\3\f\3\f\5\f\u011d\n\f\3\r\7\r\u0120\n\r\f\r\16\r\u0123\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0131"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u0137\n\17\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0143\n\22\f\22\16\22\u0146\13\22\3\22\3\22"+
		"\3\22\5\22\u014b\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\5\30\u0167\n\30\3\30\5\30\u016a\n\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\7\32\u0174\n\32\f\32\16\32\u0177\13\32\3\33\5\33\u017a"+
		"\n\33\3\33\3\33\3\33\5\33\u017f\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u018b\n\34\5\34\u018d\n\34\3\34\3\34\3\34\3\34\5"+
		"\34\u0193\n\34\3\34\3\34\3\34\5\34\u0198\n\34\3\34\7\34\u019b\n\34\f\34"+
		"\16\34\u019e\13\34\3\35\3\35\3\35\3\36\3\36\6\36\u01a5\n\36\r\36\16\36"+
		"\u01a6\3\37\3\37\3\37\7\37\u01ac\n\37\f\37\16\37\u01af\13\37\3 \3 \5 "+
		"\u01b3\n \3!\3!\7!\u01b7\n!\f!\16!\u01ba\13!\3!\5!\u01bd\n!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\6%\u01cd\n%\r%\16%\u01ce\3%\5%\u01d2"+
		"\n%\3&\3&\5&\u01d6\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\5-\u01f4\n-\3-\3-\3.\7.\u01f9"+
		"\n.\f.\16.\u01fc\13.\3/\3/\7/\u0200\n/\f/\16/\u0203\13/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\5\62\u020d\n\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u021d\n\63\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\66\7\66\u0228\n\66\f\66\16\66\u022b\13\66\3\67"+
		"\3\67\3\67\3\67\5\67\u0231\n\67\38\38\38\58\u0236\n8\38\38\39\39\59\u023c"+
		"\n9\39\39\3:\3:\3:\3;\3;\5;\u0245\n;\3<\3<\3=\3=\5=\u024b\n=\3>\3>\3>"+
		"\7>\u0250\n>\f>\16>\u0253\13>\3?\3?\3@\6@\u0258\n@\r@\16@\u0259\3A\3A"+
		"\7A\u025e\nA\fA\16A\u0261\13A\3A\3A\3B\3B\5B\u0267\nB\3B\3B\3B\5B\u026c"+
		"\nB\7B\u026e\nB\fB\16B\u0271\13B\3C\3C\7C\u0275\nC\fC\16C\u0278\13C\3"+
		"C\3C\3D\3D\3D\3D\7D\u0280\nD\fD\16D\u0283\13D\5D\u0285\nD\3D\3D\3D\3D"+
		"\3D\7D\u028c\nD\fD\16D\u028f\13D\5D\u0291\nD\3D\3D\5D\u0295\nD\3E\3E\3"+
		"E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u02c1\nG\3G\3G\3"+
		"G\3G\5G\u02c7\nG\3G\3G\3G\3G\5G\u02cd\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\5G\u02d9\nG\5G\u02db\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u030c\nG\3G\3G\3G\3G\3G\5G\u0313\nG\3"+
		"G\3G\3G\3G\3G\7G\u031a\nG\fG\16G\u031d\13G\3H\3H\3H\7H\u0322\nH\fH\16"+
		"H\u0325\13H\3I\3I\3I\7I\u032a\nI\fI\16I\u032d\13I\3J\3J\3K\3K\3K\3K\3"+
		"K\3K\3K\5K\u0338\nK\3L\3L\3M\3M\3N\3N\3N\5N\u0341\nN\3O\3O\3P\3P\3Q\3"+
		"Q\3R\3R\3R\3R\5R\u034d\nR\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3"+
		"Y\2\4\66\u008cZ\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\2\16\4\2xxz{\3\2\35+"+
		"\4\2PSWX\3\2TV\3\2PQ\3\2KN\3\2GH\3\2\66@\3\2WX\3\2./\3\2\33\34\4\2jjr"+
		"r\u0385\2\u00b2\3\2\2\2\4\u00c3\3\2\2\2\6\u00c7\3\2\2\2\b\u00da\3\2\2"+
		"\2\n\u00dc\3\2\2\2\f\u00fc\3\2\2\2\16\u0100\3\2\2\2\20\u0102\3\2\2\2\22"+
		"\u0107\3\2\2\2\24\u0110\3\2\2\2\26\u0118\3\2\2\2\30\u0121\3\2\2\2\32\u0130"+
		"\3\2\2\2\34\u0132\3\2\2\2\36\u0138\3\2\2\2 \u013b\3\2\2\2\"\u013d\3\2"+
		"\2\2$\u014e\3\2\2\2&\u0153\3\2\2\2(\u0159\3\2\2\2*\u015b\3\2\2\2,\u015e"+
		"\3\2\2\2.\u0162\3\2\2\2\60\u016d\3\2\2\2\62\u0170\3\2\2\2\64\u017e\3\2"+
		"\2\2\66\u018c\3\2\2\28\u019f\3\2\2\2:\u01a4\3\2\2\2<\u01a8\3\2\2\2>\u01b2"+
		"\3\2\2\2@\u01b4\3\2\2\2B\u01c0\3\2\2\2D\u01c5\3\2\2\2F\u01c8\3\2\2\2H"+
		"\u01d1\3\2\2\2J\u01d5\3\2\2\2L\u01d7\3\2\2\2N\u01db\3\2\2\2P\u01e0\3\2"+
		"\2\2R\u01e5\3\2\2\2T\u01e8\3\2\2\2V\u01eb\3\2\2\2X\u01ef\3\2\2\2Z\u01fa"+
		"\3\2\2\2\\\u0201\3\2\2\2^\u0206\3\2\2\2`\u0208\3\2\2\2b\u020a\3\2\2\2"+
		"d\u021c\3\2\2\2f\u021e\3\2\2\2h\u0222\3\2\2\2j\u0224\3\2\2\2l\u0230\3"+
		"\2\2\2n\u0235\3\2\2\2p\u023b\3\2\2\2r\u023f\3\2\2\2t\u0244\3\2\2\2v\u0246"+
		"\3\2\2\2x\u024a\3\2\2\2z\u024c\3\2\2\2|\u0254\3\2\2\2~\u0257\3\2\2\2\u0080"+
		"\u025b\3\2\2\2\u0082\u0264\3\2\2\2\u0084\u0272\3\2\2\2\u0086\u0294\3\2"+
		"\2\2\u0088\u0296\3\2\2\2\u008a\u0299\3\2\2\2\u008c\u02da\3\2\2\2\u008e"+
		"\u031e\3\2\2\2\u0090\u0326\3\2\2\2\u0092\u032e\3\2\2\2\u0094\u0337\3\2"+
		"\2\2\u0096\u0339\3\2\2\2\u0098\u033b\3\2\2\2\u009a\u0340\3\2\2\2\u009c"+
		"\u0342\3\2\2\2\u009e\u0344\3\2\2\2\u00a0\u0346\3\2\2\2\u00a2\u034c\3\2"+
		"\2\2\u00a4\u034e\3\2\2\2\u00a6\u0350\3\2\2\2\u00a8\u0352\3\2\2\2\u00aa"+
		"\u0354\3\2\2\2\u00ac\u0356\3\2\2\2\u00ae\u0358\3\2\2\2\u00b0\u035a\3\2"+
		"\2\2\u00b2\u00b3\5\4\3\2\u00b3\u00b7\5\6\4\2\u00b4\u00b6\5\b\5\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\5\n\6\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\5\16"+
		"\b\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\3\2\2"+
		"\u00c4\u00c5\5\u008eH\2\u00c5\u00c6\7\62\2\2\u00c6\5\3\2\2\2\u00c7\u00c8"+
		"\7\4\2\2\u00c8\u00c9\5\u0092J\2\u00c9\u00ca\7\20\2\2\u00ca\u00cb\5l\67"+
		"\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\62\2\2\u00cd\7\3\2\2\2\u00ce\u00cf"+
		"\7\5\2\2\u00cf\u00d0\5\u008eH\2\u00d0\u00d1\7\62\2\2\u00d1\u00db\3\2\2"+
		"\2\u00d2\u00d3\7\5\2\2\u00d3\u00d4\7\4\2\2\u00d4\u00d6\5\u008eH\2\u00d5"+
		"\u00d7\5\u0092J\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\7\62\2\2\u00d9\u00db\3\2\2\2\u00da\u00ce\3\2\2\2"+
		"\u00da\u00d2\3\2\2\2\u00db\t\3\2\2\2\u00dc\u00de\7\7\2\2\u00dd\u00df\5"+
		"\u0092J\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2\2\2"+
		"\u00e0\u00e2\5\f\7\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7\17\2\2\u00e7\u00e8\7\7\2\2\u00e8\13\3\2\2\2\u00e9\u00ea\5l\67"+
		"\2\u00ea\u00ed\5\u0092J\2\u00eb\u00ec\7\66\2\2\u00ec\u00ee\5\u008cG\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0"+
		"\7\62\2\2\u00f0\u00fd\3\2\2\2\u00f1\u00f2\7\7\2\2\u00f2\u00f6\5\u0092"+
		"J\2\u00f3\u00f5\5\f\7\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fa\7\17\2\2\u00fa\u00fb\7\7\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00e9\3\2\2\2\u00fc\u00f1\3\2\2\2\u00fd\r\3\2\2\2\u00fe\u0101\5\20\t"+
		"\2\u00ff\u0101\5V,\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\17"+
		"\3\2\2\2\u0102\u0103\5\22\n\2\u0103\u0104\5\30\r\2\u0104\u0105\7\17\2"+
		"\2\u0105\u0106\7\t\2\2\u0106\21\3\2\2\2\u0107\u0108\7\t\2\2\u0108\u0109"+
		"\5x=\2\u0109\u010a\5\u0092J\2\u010a\u010c\7A\2\2\u010b\u010d\5\24\13\2"+
		"\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\7B\2\2\u010f\23\3\2\2\2\u0110\u0115\5\26\f\2\u0111\u0112\7\65\2\2\u0112"+
		"\u0114\5\26\f\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\25\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u0119\5l\67\2\u0119\u011c\5\u0092J\2\u011a\u011b\7\66\2\2\u011b\u011d"+
		"\5\u008cG\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\27\3\2\2\2\u011e"+
		"\u0120\5\32\16\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\31\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\5\34\17\2\u0125\u0126\7\62\2\2\u0126\u0131\3\2\2\2\u0127\u0128"+
		"\5\36\20\2\u0128\u0129\7\62\2\2\u0129\u0131\3\2\2\2\u012a\u012b\5 \21"+
		"\2\u012b\u012c\7\62\2\2\u012c\u0131\3\2\2\2\u012d\u0131\5\"\22\2\u012e"+
		"\u0131\5,\27\2\u012f\u0131\5@!\2\u0130\u0124\3\2\2\2\u0130\u0127\3\2\2"+
		"\2\u0130\u012a\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f"+
		"\3\2\2\2\u0131\33\3\2\2\2\u0132\u0133\5l\67\2\u0133\u0136\5\u0092J\2\u0134"+
		"\u0135\7\66\2\2\u0135\u0137\5\u008cG\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\35\3\2\2\2\u0138\u0139\7\n\2\2\u0139\u013a\5\u008cG\2\u013a"+
		"\37\3\2\2\2\u013b\u013c\5\u008cG\2\u013c!\3\2\2\2\u013d\u013e\5$\23\2"+
		"\u013e\u0144\5\30\r\2\u013f\u0140\5&\24\2\u0140\u0141\5\30\r\2\u0141\u0143"+
		"\3\2\2\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u014a\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\5("+
		"\25\2\u0148\u0149\5\30\r\2\u0149\u014b\3\2\2\2\u014a\u0147\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\5*\26\2\u014d#\3\2\2\2"+
		"\u014e\u014f\7\23\2\2\u014f\u0150\7A\2\2\u0150\u0151\5\u008cG\2\u0151"+
		"\u0152\7B\2\2\u0152%\3\2\2\2\u0153\u0154\7\24\2\2\u0154\u0155\7\23\2\2"+
		"\u0155\u0156\7A\2\2\u0156\u0157\5\u008cG\2\u0157\u0158\7B\2\2\u0158\'"+
		"\3\2\2\2\u0159\u015a\7\24\2\2\u015a)\3\2\2\2\u015b\u015c\7\17\2\2\u015c"+
		"\u015d\7\23\2\2\u015d+\3\2\2\2\u015e\u015f\5.\30\2\u015f\u0160\5\30\r"+
		"\2\u0160\u0161\5\60\31\2\u0161-\3\2\2\2\u0162\u0163\7\25\2\2\u0163\u0164"+
		"\7A\2\2\u0164\u0166\5\62\32\2\u0165\u0167\58\35\2\u0166\u0165\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u016a\5:\36\2\u0169\u0168"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7B\2\2\u016c"+
		"/\3\2\2\2\u016d\u016e\7\17\2\2\u016e\u016f\7\25\2\2\u016f\61\3\2\2\2\u0170"+
		"\u0175\5\64\33\2\u0171\u0172\7J\2\2\u0172\u0174\5\64\33\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\63\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\5l\67\2\u0179\u0178\3\2\2"+
		"\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\5\u0092J\2\u017c"+
		"\u017d\7\63\2\2\u017d\u017f\3\2\2\2\u017e\u0179\3\2\2\2\u017e\u017f\3"+
		"\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\5\66\34\2\u0181\65\3\2\2\2\u0182"+
		"\u0183\b\34\1\2\u0183\u0184\7\60\2\2\u0184\u0185\7A\2\2\u0185\u0186\5"+
		"l\67\2\u0186\u0187\7B\2\2\u0187\u018d\3\2\2\2\u0188\u018a\5\u0092J\2\u0189"+
		"\u018b\5f\64\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2"+
		"\2\2\u018c\u0182\3\2\2\2\u018c\u0188\3\2\2\2\u018d\u019c\3\2\2\2\u018e"+
		"\u018f\f\4\2\2\u018f\u0190\7\64\2\2\u0190\u0192\5\u0092J\2\u0191\u0193"+
		"\5f\64\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u019b\3\2\2\2\u0194"+
		"\u0195\f\3\2\2\u0195\u0197\7A\2\2\u0196\u0198\5z>\2\u0197\u0196\3\2\2"+
		"\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\7B\2\2\u019a\u018e"+
		"\3\2\2\2\u019a\u0194\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\67\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7\27\2"+
		"\2\u01a0\u01a1\5\u008cG\2\u01a19\3\2\2\2\u01a2\u01a3\7\62\2\2\u01a3\u01a5"+
		"\5<\37\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7;\3\2\2\2\u01a8\u01ad\5> \2\u01a9\u01aa\7\65\2\2\u01aa"+
		"\u01ac\5> \2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2"+
		"\2\u01ad\u01ae\3\2\2\2\u01ae=\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b3"+
		"\5\34\17\2\u01b1\u01b3\5 \21\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2"+
		"\u01b3?\3\2\2\2\u01b4\u01b8\5B\"\2\u01b5\u01b7\5F$\2\u01b6\u01b5\3\2\2"+
		"\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\5R*\2\u01bc\u01bb\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5D#\2\u01bfA\3\2\2\2\u01c0"+
		"\u01c1\7\13\2\2\u01c1\u01c2\7A\2\2\u01c2\u01c3\5\u008cG\2\u01c3\u01c4"+
		"\7B\2\2\u01c4C\3\2\2\2\u01c5\u01c6\7\17\2\2\u01c6\u01c7\7\13\2\2\u01c7"+
		"E\3\2\2\2\u01c8\u01c9\5H%\2\u01c9\u01ca\5\30\r\2\u01caG\3\2\2\2\u01cb"+
		"\u01cd\5J&\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2\2"+
		"\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d2\5P)\2\u01d1\u01cc"+
		"\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2I\3\2\2\2\u01d3\u01d6\5L\'\2\u01d4\u01d6"+
		"\5N(\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6K\3\2\2\2\u01d7\u01d8"+
		"\7\f\2\2\u01d8\u01d9\5z>\2\u01d9\u01da\7\63\2\2\u01daM\3\2\2\2\u01db\u01dc"+
		"\7\r\2\2\u01dc\u01dd\7.\2\2\u01dd\u01de\5j\66\2\u01de\u01df\7\63\2\2\u01df"+
		"O\3\2\2\2\u01e0\u01e1\7\r\2\2\u01e1\u01e2\7/\2\2\u01e2\u01e3\5l\67\2\u01e3"+
		"\u01e4\7\63\2\2\u01e4Q\3\2\2\2\u01e5\u01e6\5T+\2\u01e6\u01e7\5\30\r\2"+
		"\u01e7S\3\2\2\2\u01e8\u01e9\7\61\2\2\u01e9\u01ea\7\63\2\2\u01eaU\3\2\2"+
		"\2\u01eb\u01ec\5X-\2\u01ec\u01ed\5Z.\2\u01ed\u01ee\7w\2\2\u01eeW\3\2\2"+
		"\2\u01ef\u01f0\7\b\2\2\u01f0\u01f1\5\u0092J\2\u01f1\u01f3\7A\2\2\u01f2"+
		"\u01f4\5\24\13\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3"+
		"\2\2\2\u01f5\u01f6\7B\2\2\u01f6Y\3\2\2\2\u01f7\u01f9\5\\/\2\u01f8\u01f7"+
		"\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"[\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\5^\60\2\u01fe\u0200\5b\62\2"+
		"\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0205\5`\61\2\u0205]\3\2\2\2\u0206\u0207\7y\2\2\u0207_\3\2\2\2\u0208"+
		"\u0209\t\2\2\2\u0209a\3\2\2\2\u020a\u020c\7|\2\2\u020b\u020d\5d\63\2\u020c"+
		"\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\7}"+
		"\2\2\u020fc\3\2\2\2\u0210\u021d\5\34\17\2\u0211\u021d\5 \21\2\u0212\u021d"+
		"\5$\23\2\u0213\u021d\5&\24\2\u0214\u021d\5(\25\2\u0215\u021d\5*\26\2\u0216"+
		"\u021d\5.\30\2\u0217\u021d\5\60\31\2\u0218\u021d\5B\"\2\u0219\u021d\5"+
		"D#\2\u021a\u021d\5H%\2\u021b\u021d\5T+\2\u021c\u0210\3\2\2\2\u021c\u0211"+
		"\3\2\2\2\u021c\u0212\3\2\2\2\u021c\u0213\3\2\2\2\u021c\u0214\3\2\2\2\u021c"+
		"\u0215\3\2\2\2\u021c\u0216\3\2\2\2\u021c\u0217\3\2\2\2\u021c\u0218\3\2"+
		"\2\2\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d"+
		"e\3\2\2\2\u021e\u021f\7K\2\2\u021f\u0220\5j\66\2\u0220\u0221\7L\2\2\u0221"+
		"g\3\2\2\2\u0222\u0223\t\3\2\2\u0223i\3\2\2\2\u0224\u0229\5l\67\2\u0225"+
		"\u0226\7\65\2\2\u0226\u0228\5l\67\2\u0227\u0225\3\2\2\2\u0228\u022b\3"+
		"\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022ak\3\2\2\2\u022b\u0229"+
		"\3\2\2\2\u022c\u0231\5n8\2\u022d\u0231\5p9\2\u022e\u0231\5r:\2\u022f\u0231"+
		"\5t;\2\u0230\u022c\3\2\2\2\u0230\u022d\3\2\2\2\u0230\u022e\3\2\2\2\u0230"+
		"\u022f\3\2\2\2\u0231m\3\2\2\2\u0232\u0236\5p9\2\u0233\u0236\5r:\2\u0234"+
		"\u0236\5t;\2\u0235\u0232\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2"+
		"\2\u0236\u0237\3\2\2\2\u0237\u0238\5~@\2\u0238o\3\2\2\2\u0239\u023c\5"+
		"r:\2\u023a\u023c\5t;\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023e\7O\2\2\u023eq\3\2\2\2\u023f\u0240\5\u008eH\2\u0240"+
		"\u0241\5f\64\2\u0241s\3\2\2\2\u0242\u0245\5\u008eH\2\u0243\u0245\5h\65"+
		"\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245u\3\2\2\2\u0246\u0247"+
		"\7\16\2\2\u0247w\3\2\2\2\u0248\u024b\5l\67\2\u0249\u024b\5v<\2\u024a\u0248"+
		"\3\2\2\2\u024a\u0249\3\2\2\2\u024by\3\2\2\2\u024c\u0251\5\u008cG\2\u024d"+
		"\u024e\7\65\2\2\u024e\u0250\5\u008cG\2\u024f\u024d\3\2\2\2\u0250\u0253"+
		"\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252{\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0255\5\u008cG\2\u0255}\3\2\2\2\u0256\u0258\5\u0080"+
		"A\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\177\3\2\2\2\u025b\u025f\7C\2\2\u025c\u025e\7\65\2"+
		"\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\7D\2\2\u0263"+
		"\u0081\3\2\2\2\u0264\u0266\5\u0092J\2\u0265\u0267\5\u0084C\2\u0266\u0265"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026f\3\2\2\2\u0268\u0269\7\64\2\2"+
		"\u0269\u026b\5\u0092J\2\u026a\u026c\5\u0084C\2\u026b\u026a\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u0268\3\2\2\2\u026e\u0271\3\2"+
		"\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0083\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272\u0276\7K\2\2\u0273\u0275\7\65\2\2\u0274\u0273\3\2"+
		"\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0279\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\7L\2\2\u027a\u0085\3\2"+
		"\2\2\u027b\u0284\7A\2\2\u027c\u0281\5\u0088E\2\u027d\u027e\7\65\2\2\u027e"+
		"\u0280\5\u0088E\2\u027f\u027d\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f"+
		"\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0284"+
		"\u027c\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0295\7B"+
		"\2\2\u0287\u0290\7A\2\2\u0288\u028d\5\u008aF\2\u0289\u028a\7\65\2\2\u028a"+
		"\u028c\5\u008aF\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u0290"+
		"\u0288\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0295\7B"+
		"\2\2\u0293\u0295\5\u008aF\2\u0294\u027b\3\2\2\2\u0294\u0287\3\2\2\2\u0294"+
		"\u0293\3\2\2\2\u0295\u0087\3\2\2\2\u0296\u0297\5l\67\2\u0297\u0298\5\u0092"+
		"J\2\u0298\u0089\3\2\2\2\u0299\u029a\5\u0092J\2\u029a\u008b\3\2\2\2\u029b"+
		"\u029c\bG\1\2\u029c\u029d\7A\2\2\u029d\u029e\5l\67\2\u029e\u029f\7B\2"+
		"\2\u029f\u02a0\5\u008cG\23\u02a0\u02db\3\2\2\2\u02a1\u02a2\t\4\2\2\u02a2"+
		"\u02db\5\u008cG\22\u02a3\u02a4\5\u0086D\2\u02a4\u02a5\7I\2\2\u02a5\u02a6"+
		"\5\u008cG\3\u02a6\u02db\3\2\2\2\u02a7\u02db\7,\2\2\u02a8\u02db\5\u0094"+
		"K\2\u02a9\u02aa\7\60\2\2\u02aa\u02ab\7A\2\2\u02ab\u02ac\7\16\2\2\u02ac"+
		"\u02db\7B\2\2\u02ad\u02ae\7\60\2\2\u02ae\u02af\7A\2\2\u02af\u02b0\5\u0082"+
		"B\2\u02b0\u02b1\7B\2\2\u02b1\u02db\3\2\2\2\u02b2\u02b3\7\60\2\2\u02b3"+
		"\u02b4\7A\2\2\u02b4\u02b5\5l\67\2\u02b5\u02b6\7B\2\2\u02b6\u02db\3\2\2"+
		"\2\u02b7\u02b8\7\61\2\2\u02b8\u02b9\7A\2\2\u02b9\u02ba\5l\67\2\u02ba\u02bb"+
		"\7B\2\2\u02bb\u02db\3\2\2\2\u02bc\u02bd\7-\2\2\u02bd\u02be\5l\67\2\u02be"+
		"\u02c0\7A\2\2\u02bf\u02c1\5z>\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2"+
		"\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\7B\2\2\u02c3\u02db\3\2\2\2\u02c4\u02c6"+
		"\5\u0092J\2\u02c5\u02c7\5f\64\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2"+
		"\2\u02c7\u02db\3\2\2\2\u02c8\u02c9\7\26\2\2\u02c9\u02ca\7A\2\2\u02ca\u02cc"+
		"\5\62\32\2\u02cb\u02cd\58\35\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2"+
		"\u02cd\u02ce\3\2\2\2\u02ce\u02cf\7B\2\2\u02cf\u02db\3\2\2\2\u02d0\u02d1"+
		"\7A\2\2\u02d1\u02d2\5\u008cG\2\u02d2\u02d3\7B\2\2\u02d3\u02db\3\2\2\2"+
		"\u02d4\u02d5\5h\65\2\u02d5\u02d6\7\64\2\2\u02d6\u02d8\5\u0092J\2\u02d7"+
		"\u02d9\5f\64\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2"+
		"\2\2\u02da\u029b\3\2\2\2\u02da\u02a1\3\2\2\2\u02da\u02a3\3\2\2\2\u02da"+
		"\u02a7\3\2\2\2\u02da\u02a8\3\2\2\2\u02da\u02a9\3\2\2\2\u02da\u02ad\3\2"+
		"\2\2\u02da\u02b2\3\2\2\2\u02da\u02b7\3\2\2\2\u02da\u02bc\3\2\2\2\u02da"+
		"\u02c4\3\2\2\2\u02da\u02c8\3\2\2\2\u02da\u02d0\3\2\2\2\u02da\u02d4\3\2"+
		"\2\2\u02db\u031b\3\2\2\2\u02dc\u02dd\f\20\2\2\u02dd\u02de\t\5\2\2\u02de"+
		"\u031a\5\u008cG\21\u02df\u02e0\f\17\2\2\u02e0\u02e1\t\6\2\2\u02e1\u031a"+
		"\5\u008cG\20\u02e2\u02e3\f\16\2\2\u02e3\u02e4\t\7\2\2\u02e4\u031a\5\u008c"+
		"G\17\u02e5\u02e6\f\f\2\2\u02e6\u02e7\t\b\2\2\u02e7\u031a\5\u008cG\r\u02e8"+
		"\u02e9\f\13\2\2\u02e9\u02ea\7Z\2\2\u02ea\u031a\5\u008cG\f\u02eb\u02ec"+
		"\f\n\2\2\u02ec\u02ed\7[\2\2\u02ed\u031a\5\u008cG\13\u02ee\u02ef\f\t\2"+
		"\2\u02ef\u02f0\7\\\2\2\u02f0\u031a\5\u008cG\n\u02f1\u02f2\f\b\2\2\u02f2"+
		"\u02f3\7]\2\2\u02f3\u031a\5\u008cG\t\u02f4\u02f5\f\7\2\2\u02f5\u02f6\7"+
		"^\2\2\u02f6\u031a\5\u008cG\b\u02f7\u02f8\f\6\2\2\u02f8\u02f9\7_\2\2\u02f9"+
		"\u031a\5\u008cG\7\u02fa\u02fb\f\5\2\2\u02fb\u02fc\7O\2\2\u02fc\u02fd\5"+
		"\u008cG\2\u02fd\u02fe\7\63\2\2\u02fe\u02ff\5\u008cG\6\u02ff\u031a\3\2"+
		"\2\2\u0300\u0301\f\4\2\2\u0301\u0302\t\t\2\2\u0302\u031a\5\u008cG\5\u0303"+
		"\u0304\f\27\2\2\u0304\u0305\7C\2\2\u0305\u0306\5z>\2\u0306\u0307\7D\2"+
		"\2\u0307\u031a\3\2\2\2\u0308\u0309\f\26\2\2\u0309\u030b\7A\2\2\u030a\u030c"+
		"\5z>\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u031a\7B\2\2\u030e\u030f\f\24\2\2\u030f\u0310\7\64\2\2\u0310\u0312\5"+
		"\u0092J\2\u0311\u0313\5f\64\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2"+
		"\u0313\u031a\3\2\2\2\u0314\u0315\f\21\2\2\u0315\u031a\t\n\2\2\u0316\u0317"+
		"\f\r\2\2\u0317\u0318\t\13\2\2\u0318\u031a\5l\67\2\u0319\u02dc\3\2\2\2"+
		"\u0319\u02df\3\2\2\2\u0319\u02e2\3\2\2\2\u0319\u02e5\3\2\2\2\u0319\u02e8"+
		"\3\2\2\2\u0319\u02eb\3\2\2\2\u0319\u02ee\3\2\2\2\u0319\u02f1\3\2\2\2\u0319"+
		"\u02f4\3\2\2\2\u0319\u02f7\3\2\2\2\u0319\u02fa\3\2\2\2\u0319\u0300\3\2"+
		"\2\2\u0319\u0303\3\2\2\2\u0319\u0308\3\2\2\2\u0319\u030e\3\2\2\2\u0319"+
		"\u0314\3\2\2\2\u0319\u0316\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2"+
		"\2\2\u031b\u031c\3\2\2\2\u031c\u008d\3\2\2\2\u031d\u031b\3\2\2\2\u031e"+
		"\u0323\5\u0092J\2\u031f\u0320\7\64\2\2\u0320\u0322\5\u0092J\2\u0321\u031f"+
		"\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u008f\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u032b\5\u0092J\2\u0327\u0328"+
		"\7\65\2\2\u0328\u032a\5\u0092J\2\u0329\u0327\3\2\2\2\u032a\u032d\3\2\2"+
		"\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0091\3\2\2\2\u032d\u032b"+
		"\3\2\2\2\u032e\u032f\7a\2\2\u032f\u0093\3\2\2\2\u0330\u0338\5\u0096L\2"+
		"\u0331\u0338\5\u0098M\2\u0332\u0338\5\u009aN\2\u0333\u0338\5\u00a2R\2"+
		"\u0334\u0338\5\u00acW\2\u0335\u0338\5\u00aeX\2\u0336\u0338\5\u00b0Y\2"+
		"\u0337\u0330\3\2\2\2\u0337\u0331\3\2\2\2\u0337\u0332\3\2\2\2\u0337\u0333"+
		"\3\2\2\2\u0337\u0334\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0336\3\2\2\2\u0338"+
		"\u0095\3\2\2\2\u0339\u033a\7\32\2\2\u033a\u0097\3\2\2\2\u033b\u033c\t"+
		"\f\2\2\u033c\u0099\3\2\2\2\u033d\u0341\5\u009cO\2\u033e\u0341\5\u009e"+
		"P\2\u033f\u0341\5\u00a0Q\2\u0340\u033d\3\2\2\2\u0340\u033e\3\2\2\2\u0340"+
		"\u033f\3\2\2\2\u0341\u009b\3\2\2\2\u0342\u0343\7b\2\2\u0343\u009d\3\2"+
		"\2\2\u0344\u0345\7c\2\2\u0345\u009f\3\2\2\2\u0346\u0347\7d\2\2\u0347\u00a1"+
		"\3\2\2\2\u0348\u034d\5\u00a6T\2\u0349\u034d\5\u00a4S\2\u034a\u034d\5\u00a8"+
		"U\2\u034b\u034d\5\u00aaV\2\u034c\u0348\3\2\2\2\u034c\u0349\3\2\2\2\u034c"+
		"\u034a\3\2\2\2\u034c\u034b\3\2\2\2\u034d\u00a3\3\2\2\2\u034e\u034f\7e"+
		"\2\2\u034f\u00a5\3\2\2\2\u0350\u0351\7f\2\2\u0351\u00a7\3\2\2\2\u0352"+
		"\u0353\7g\2\2\u0353\u00a9\3\2\2\2\u0354\u0355\7h\2\2\u0355\u00ab\3\2\2"+
		"\2\u0356\u0357\7i\2\2\u0357\u00ad\3\2\2\2\u0358\u0359\t\r\2\2\u0359\u00af"+
		"\3\2\2\2\u035a\u035b\7k\2\2\u035b\u00b1\3\2\2\2N\u00b7\u00bb\u00c0\u00d6"+
		"\u00da\u00de\u00e3\u00ed\u00f6\u00fc\u0100\u010c\u0115\u011c\u0121\u0130"+
		"\u0136\u0144\u014a\u0166\u0169\u0175\u0179\u017e\u018a\u018c\u0192\u0197"+
		"\u019a\u019c\u01a6\u01ad\u01b2\u01b8\u01bc\u01ce\u01d1\u01d5\u01f3\u01fa"+
		"\u01ff\u0201\u020c\u021c\u0229\u0230\u0235\u023b\u0244\u024a\u0251\u0259"+
		"\u025f\u0266\u026b\u026f\u0276\u0281\u0284\u028d\u0290\u0294\u02c0\u02c6"+
		"\u02cc\u02d8\u02da\u030b\u0312\u0319\u031b\u0323\u032b\u0337\u0340\u034c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}