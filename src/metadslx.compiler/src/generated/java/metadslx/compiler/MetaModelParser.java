// Generated from MetaModelParser.g4 by ANTLR 4.5.1
package metadslx.compiler;

import metadslx.core.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetaModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KNamespace=1, KUsing=2, KMetamodel=3, KExtern=4, KTypeDef=5, KAbstract=6, 
		KClass=7, KEnum=8, KAssociation=9, KContainment=10, KWith=11, KNew=12, 
		KNull=13, KTrue=14, KFalse=15, KVoid=16, KObject=17, KString=18, KInt=19, 
		KLong=20, KFloat=21, KDouble=22, KByte=23, KBool=24, KList=25, KAny=26, 
		KNone=27, KError=28, KSet=29, KMultiList=30, KMultiSet=31, KThis=32, KTypeof=33, 
		KAs=34, KIs=35, KBase=36, KConst=37, KRedefines=38, KSubsets=39, KReadonly=40, 
		KLazy=41, KSynthetized=42, KInherited=43, KDerived=44, KStatic=45, TSemicolon=46, 
		TColon=47, TDot=48, TComma=49, TAssign=50, TOpenParen=51, TCloseParen=52, 
		TOpenBracket=53, TCloseBracket=54, TOpenBrace=55, TCloseBrace=56, TLessThan=57, 
		TGreaterThan=58, TQuestion=59, TQuestionQuestion=60, TAmpersand=61, THat=62, 
		TBar=63, TAndAlso=64, TOrElse=65, TPlusPlus=66, TMinusMinus=67, TPlus=68, 
		TMinus=69, TTilde=70, TExclamation=71, TSlash=72, TAsterisk=73, TPercent=74, 
		TLessThanOrEqual=75, TGreaterThanOrEqual=76, TEqual=77, TNotEqual=78, 
		TAsteriskAssign=79, TSlashAssign=80, TPercentAssign=81, TPlusAssign=82, 
		TMinusAssign=83, TLeftShiftAssign=84, TRightShiftAssign=85, TAmpersandAssign=86, 
		THatAssign=87, TBarAssign=88, IdentifierNormal=89, IdentifierVerbatim=90, 
		IntegerLiteral=91, DecimalLiteral=92, ScientificLiteral=93, DateTimeOffsetLiteral=94, 
		DateTimeLiteral=95, DateLiteral=96, TimeLiteral=97, RegularStringLiteral=98, 
		GuidLiteral=99, UTF8BOM=100, WHITESPACE=101, CRLF=102, LINEBREAK=103, 
		LINE_COMMENT=104, COMMENT=105;
	public static final int
		RULE_main = 0, RULE_qualifiedName = 1, RULE_identifierList = 2, RULE_qualifiedNameList = 3, 
		RULE_annotation = 4, RULE_annotationParams = 5, RULE_annotationParamList = 6, 
		RULE_annotationParam = 7, RULE_namespaceDeclaration = 8, RULE_metamodelDeclaration = 9, 
		RULE_metamodelPropertyList = 10, RULE_metamodelProperty = 11, RULE_declaration = 12, 
		RULE_enumDeclaration = 13, RULE_enumValues = 14, RULE_enumValue = 15, 
		RULE_enumMemberDeclaration = 16, RULE_classDeclaration = 17, RULE_classAncestors = 18, 
		RULE_classAncestor = 19, RULE_classMemberDeclaration = 20, RULE_fieldDeclaration = 21, 
		RULE_fieldModifier = 22, RULE_redefinitions = 23, RULE_subsettings = 24, 
		RULE_nameUseList = 25, RULE_constDeclaration = 26, RULE_functionDeclaration = 27, 
		RULE_returnType = 28, RULE_typeOfReference = 29, RULE_typeReference = 30, 
		RULE_simpleType = 31, RULE_classType = 32, RULE_objectType = 33, RULE_primitiveType = 34, 
		RULE_voidType = 35, RULE_invisibleType = 36, RULE_nullableType = 37, RULE_collectionType = 38, 
		RULE_collectionKind = 39, RULE_operationDeclaration = 40, RULE_parameterList = 41, 
		RULE_parameter = 42, RULE_constructorDeclaration = 43, RULE_initializerDeclaration = 44, 
		RULE_synthetizedPropertyInitializer = 45, RULE_inheritedPropertyInitializer = 46, 
		RULE_expressionList = 47, RULE_expressionOrNewExpressionList = 48, RULE_expressionOrNewExpression = 49, 
		RULE_expression = 50, RULE_literalExpression = 51, RULE_newExpression = 52, 
		RULE_newPropertyInitList = 53, RULE_newPropertyInit = 54, RULE_postOperator = 55, 
		RULE_preOperator = 56, RULE_unaryOperator = 57, RULE_multiplicativeOperator = 58, 
		RULE_additiveOperator = 59, RULE_shiftOperator = 60, RULE_comparisonOperator = 61, 
		RULE_equalityOperator = 62, RULE_assignmentOperator = 63, RULE_associationDeclaration = 64, 
		RULE_identifier = 65, RULE_literal = 66, RULE_nullLiteral = 67, RULE_booleanLiteral = 68, 
		RULE_integerLiteral = 69, RULE_decimalLiteral = 70, RULE_scientificLiteral = 71, 
		RULE_stringLiteral = 72;
	public static final String[] ruleNames = {
		"main", "qualifiedName", "identifierList", "qualifiedNameList", "annotation", 
		"annotationParams", "annotationParamList", "annotationParam", "namespaceDeclaration", 
		"metamodelDeclaration", "metamodelPropertyList", "metamodelProperty", 
		"declaration", "enumDeclaration", "enumValues", "enumValue", "enumMemberDeclaration", 
		"classDeclaration", "classAncestors", "classAncestor", "classMemberDeclaration", 
		"fieldDeclaration", "fieldModifier", "redefinitions", "subsettings", "nameUseList", 
		"constDeclaration", "functionDeclaration", "returnType", "typeOfReference", 
		"typeReference", "simpleType", "classType", "objectType", "primitiveType", 
		"voidType", "invisibleType", "nullableType", "collectionType", "collectionKind", 
		"operationDeclaration", "parameterList", "parameter", "constructorDeclaration", 
		"initializerDeclaration", "synthetizedPropertyInitializer", "inheritedPropertyInitializer", 
		"expressionList", "expressionOrNewExpressionList", "expressionOrNewExpression", 
		"expression", "literalExpression", "newExpression", "newPropertyInitList", 
		"newPropertyInit", "postOperator", "preOperator", "unaryOperator", "multiplicativeOperator", 
		"additiveOperator", "shiftOperator", "comparisonOperator", "equalityOperator", 
		"assignmentOperator", "associationDeclaration", "identifier", "literal", 
		"nullLiteral", "booleanLiteral", "integerLiteral", "decimalLiteral", "scientificLiteral", 
		"stringLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'namespace'", "'using'", "'metamodel'", "'extern'", "'typedef'", 
		"'abstract'", "'class'", "'enum'", "'association'", "'containment'", "'with'", 
		"'new'", "'null'", "'true'", "'false'", "'void'", "'object'", "'string'", 
		"'int'", "'long'", "'float'", "'double'", "'byte'", "'bool'", "'list'", 
		"'any'", "'none'", "'error'", "'set'", "'multi_list'", "'multi_set'", 
		"'this'", "'typeof'", "'as'", "'is'", "'base'", "'const'", "'redefines'", 
		"'subsets'", "'readonly'", "'lazy'", "'synthetized'", "'inherited'", "'derived'", 
		"'static'", "';'", "':'", "'.'", "','", "'='", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'<'", "'>'", "'?'", "'??'", "'&'", "'^'", "'|'", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'/'", null, "'%'", 
		"'<='", "'>='", "'=='", "'!='", "'*='", "'/='", "'%='", "'+='", "'-='", 
		"'<<='", "'>>='", "'&='", "'^='", "'|='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KNamespace", "KUsing", "KMetamodel", "KExtern", "KTypeDef", "KAbstract", 
		"KClass", "KEnum", "KAssociation", "KContainment", "KWith", "KNew", "KNull", 
		"KTrue", "KFalse", "KVoid", "KObject", "KString", "KInt", "KLong", "KFloat", 
		"KDouble", "KByte", "KBool", "KList", "KAny", "KNone", "KError", "KSet", 
		"KMultiList", "KMultiSet", "KThis", "KTypeof", "KAs", "KIs", "KBase", 
		"KConst", "KRedefines", "KSubsets", "KReadonly", "KLazy", "KSynthetized", 
		"KInherited", "KDerived", "KStatic", "TSemicolon", "TColon", "TDot", "TComma", 
		"TAssign", "TOpenParen", "TCloseParen", "TOpenBracket", "TCloseBracket", 
		"TOpenBrace", "TCloseBrace", "TLessThan", "TGreaterThan", "TQuestion", 
		"TQuestionQuestion", "TAmpersand", "THat", "TBar", "TAndAlso", "TOrElse", 
		"TPlusPlus", "TMinusMinus", "TPlus", "TMinus", "TTilde", "TExclamation", 
		"TSlash", "TAsterisk", "TPercent", "TLessThanOrEqual", "TGreaterThanOrEqual", 
		"TEqual", "TNotEqual", "TAsteriskAssign", "TSlashAssign", "TPercentAssign", 
		"TPlusAssign", "TMinusAssign", "TLeftShiftAssign", "TRightShiftAssign", 
		"TAmpersandAssign", "THatAssign", "TBarAssign", "IdentifierNormal", "IdentifierVerbatim", 
		"IntegerLiteral", "DecimalLiteral", "ScientificLiteral", "DateTimeOffsetLiteral", 
		"DateTimeLiteral", "DateLiteral", "TimeLiteral", "RegularStringLiteral", 
		"GuidLiteral", "UTF8BOM", "WHITESPACE", "CRLF", "LINEBREAK", "LINE_COMMENT", 
		"COMMENT"
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
	public String getGrammarFileName() { return "MetaModelParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MetaModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			namespaceDeclaration();
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> TDot() { return getTokens(MetaModelParser.TDot); }
		public TerminalNode TDot(int i) {
			return getToken(MetaModelParser.TDot, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			identifier();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					match(TDot);
					setState(150);
					identifier();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		public List<TerminalNode> TComma() { return getTokens(MetaModelParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaModelParser.TComma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			identifier();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(157);
				match(TComma);
				setState(158);
				identifier();
				}
				}
				setState(163);
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaModelParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaModelParser.TComma, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			qualifiedName();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(165);
				match(TComma);
				setState(166);
				qualifiedName();
				}
				}
				setState(171);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode TOpenBracket() { return getToken(MetaModelParser.TOpenBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TCloseBracket() { return getToken(MetaModelParser.TCloseBracket, 0); }
		public AnnotationParamsContext annotationParams() {
			return getRuleContext(AnnotationParamsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(TOpenBracket);
			setState(173);
			identifier();
			setState(175);
			_la = _input.LA(1);
			if (_la==TOpenParen) {
				{
				setState(174);
				annotationParams();
				}
			}

			setState(177);
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

	public static class AnnotationParamsContext extends ParserRuleContext {
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public AnnotationParamListContext annotationParamList() {
			return getRuleContext(AnnotationParamListContext.class,0);
		}
		public AnnotationParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterAnnotationParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitAnnotationParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitAnnotationParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationParamsContext annotationParams() throws RecognitionException {
		AnnotationParamsContext _localctx = new AnnotationParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_annotationParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(TOpenParen);
			setState(181);
			_la = _input.LA(1);
			if (_la==IdentifierNormal || _la==IdentifierVerbatim) {
				{
				setState(180);
				annotationParamList();
				}
			}

			setState(183);
			match(TCloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationParamListContext extends ParserRuleContext {
		public List<AnnotationParamContext> annotationParam() {
			return getRuleContexts(AnnotationParamContext.class);
		}
		public AnnotationParamContext annotationParam(int i) {
			return getRuleContext(AnnotationParamContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaModelParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaModelParser.TComma, i);
		}
		public AnnotationParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterAnnotationParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitAnnotationParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitAnnotationParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationParamListContext annotationParamList() throws RecognitionException {
		AnnotationParamListContext _localctx = new AnnotationParamListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_annotationParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			annotationParam();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(186);
				match(TComma);
				setState(187);
				annotationParam();
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

	public static class AnnotationParamContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TAssign() { return getToken(MetaModelParser.TAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterAnnotationParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitAnnotationParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitAnnotationParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationParamContext annotationParam() throws RecognitionException {
		AnnotationParamContext _localctx = new AnnotationParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_annotationParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			identifier();
			setState(194);
			match(TAssign);
			setState(195);
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

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode KNamespace() { return getToken(MetaModelParser.KNamespace, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(MetaModelParser.TOpenBrace, 0); }
		public MetamodelDeclarationContext metamodelDeclaration() {
			return getRuleContext(MetamodelDeclarationContext.class,0);
		}
		public TerminalNode TCloseBrace() { return getToken(MetaModelParser.TCloseBrace, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(197);
				annotation();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(KNamespace);
			setState(204);
			qualifiedName();
			setState(205);
			match(TOpenBrace);
			setState(206);
			metamodelDeclaration();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KExtern) | (1L << KAbstract) | (1L << KClass) | (1L << KEnum) | (1L << KAssociation) | (1L << KConst) | (1L << TOpenBracket))) != 0)) {
				{
				{
				setState(207);
				declaration();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetamodelDeclarationContext extends ParserRuleContext {
		public TerminalNode KMetamodel() { return getToken(MetaModelParser.KMetamodel, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaModelParser.TSemicolon, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public MetamodelPropertyListContext metamodelPropertyList() {
			return getRuleContext(MetamodelPropertyListContext.class,0);
		}
		public MetamodelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metamodelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterMetamodelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitMetamodelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitMetamodelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetamodelDeclarationContext metamodelDeclaration() throws RecognitionException {
		MetamodelDeclarationContext _localctx = new MetamodelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_metamodelDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(215);
				annotation();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(KMetamodel);
			setState(222);
			identifier();
			setState(228);
			_la = _input.LA(1);
			if (_la==TOpenParen) {
				{
				setState(223);
				match(TOpenParen);
				setState(225);
				_la = _input.LA(1);
				if (_la==IdentifierNormal || _la==IdentifierVerbatim) {
					{
					setState(224);
					metamodelPropertyList();
					}
				}

				setState(227);
				match(TCloseParen);
				}
			}

			setState(230);
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

	public static class MetamodelPropertyListContext extends ParserRuleContext {
		public List<MetamodelPropertyContext> metamodelProperty() {
			return getRuleContexts(MetamodelPropertyContext.class);
		}
		public MetamodelPropertyContext metamodelProperty(int i) {
			return getRuleContext(MetamodelPropertyContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaModelParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaModelParser.TComma, i);
		}
		public MetamodelPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metamodelPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterMetamodelPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitMetamodelPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitMetamodelPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetamodelPropertyListContext metamodelPropertyList() throws RecognitionException {
		MetamodelPropertyListContext _localctx = new MetamodelPropertyListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_metamodelPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			metamodelProperty();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(233);
				match(TComma);
				setState(234);
				metamodelProperty();
				}
				}
				setState(239);
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

	public static class MetamodelPropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TAssign() { return getToken(MetaModelParser.TAssign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public MetamodelPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metamodelProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterMetamodelProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitMetamodelProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitMetamodelProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetamodelPropertyContext metamodelProperty() throws RecognitionException {
		MetamodelPropertyContext _localctx = new MetamodelPropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_metamodelProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			identifier();
			setState(241);
			match(TAssign);
			setState(242);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AssociationDeclarationContext associationDeclaration() {
			return getRuleContext(AssociationDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				enumDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				associationDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				constDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				functionDeclaration();
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode KEnum() { return getToken(MetaModelParser.KEnum, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(MetaModelParser.TOpenBrace, 0); }
		public EnumValuesContext enumValues() {
			return getRuleContext(EnumValuesContext.class,0);
		}
		public TerminalNode TCloseBrace() { return getToken(MetaModelParser.TCloseBrace, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode TSemicolon() { return getToken(MetaModelParser.TSemicolon, 0); }
		public List<EnumMemberDeclarationContext> enumMemberDeclaration() {
			return getRuleContexts(EnumMemberDeclarationContext.class);
		}
		public EnumMemberDeclarationContext enumMemberDeclaration(int i) {
			return getRuleContext(EnumMemberDeclarationContext.class,i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(251);
				annotation();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(KEnum);
			setState(258);
			identifier();
			setState(259);
			match(TOpenBrace);
			setState(260);
			enumValues();
			setState(268);
			_la = _input.LA(1);
			if (_la==TSemicolon) {
				{
				setState(261);
				match(TSemicolon);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KVoid) | (1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool) | (1L << KList) | (1L << KSet) | (1L << KMultiList) | (1L << KMultiSet) | (1L << KStatic) | (1L << TOpenBracket))) != 0) || _la==IdentifierNormal || _la==IdentifierVerbatim) {
					{
					{
					setState(262);
					enumMemberDeclaration();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(270);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValuesContext extends ParserRuleContext {
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaModelParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaModelParser.TComma, i);
		}
		public EnumValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterEnumValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitEnumValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitEnumValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValuesContext enumValues() throws RecognitionException {
		EnumValuesContext _localctx = new EnumValuesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			enumValue();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(273);
				match(TComma);
				setState(274);
				enumValue();
				}
				}
				setState(279);
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

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(280);
				annotation();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
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

	public static class EnumMemberDeclarationContext extends ParserRuleContext {
		public OperationDeclarationContext operationDeclaration() {
			return getRuleContext(OperationDeclarationContext.class,0);
		}
		public EnumMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterEnumMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitEnumMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitEnumMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumMemberDeclarationContext enumMemberDeclaration() throws RecognitionException {
		EnumMemberDeclarationContext _localctx = new EnumMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			operationDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode KClass() { return getToken(MetaModelParser.KClass, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenBrace() { return getToken(MetaModelParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(MetaModelParser.TCloseBrace, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode KAbstract() { return getToken(MetaModelParser.KAbstract, 0); }
		public TerminalNode TColon() { return getToken(MetaModelParser.TColon, 0); }
		public ClassAncestorsContext classAncestors() {
			return getRuleContext(ClassAncestorsContext.class,0);
		}
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(290);
				annotation();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			_la = _input.LA(1);
			if (_la==KAbstract) {
				{
				setState(296);
				match(KAbstract);
				}
			}

			setState(299);
			match(KClass);
			setState(300);
			identifier();
			setState(303);
			_la = _input.LA(1);
			if (_la==TColon) {
				{
				setState(301);
				match(TColon);
				setState(302);
				classAncestors();
				}
			}

			setState(305);
			match(TOpenBrace);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KContainment) | (1L << KVoid) | (1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool) | (1L << KList) | (1L << KSet) | (1L << KMultiList) | (1L << KMultiSet) | (1L << KReadonly) | (1L << KLazy) | (1L << KSynthetized) | (1L << KInherited) | (1L << KDerived) | (1L << KStatic) | (1L << TOpenBracket))) != 0) || _la==IdentifierNormal || _la==IdentifierVerbatim) {
				{
				{
				setState(306);
				classMemberDeclaration();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassAncestorsContext extends ParserRuleContext {
		public List<ClassAncestorContext> classAncestor() {
			return getRuleContexts(ClassAncestorContext.class);
		}
		public ClassAncestorContext classAncestor(int i) {
			return getRuleContext(ClassAncestorContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaModelParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaModelParser.TComma, i);
		}
		public ClassAncestorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAncestors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterClassAncestors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitClassAncestors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitClassAncestors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAncestorsContext classAncestors() throws RecognitionException {
		ClassAncestorsContext _localctx = new ClassAncestorsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classAncestors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			classAncestor();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(315);
				match(TComma);
				setState(316);
				classAncestor();
				}
				}
				setState(321);
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

	public static class ClassAncestorContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassAncestorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAncestor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterClassAncestor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitClassAncestor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitClassAncestor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAncestorContext classAncestor() throws RecognitionException {
		ClassAncestorContext _localctx = new ClassAncestorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classAncestor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public OperationDeclarationContext operationDeclaration() {
			return getRuleContext(OperationDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classMemberDeclaration);
		try {
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				operationDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				constructorDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaModelParser.TSemicolon, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FieldModifierContext fieldModifier() {
			return getRuleContext(FieldModifierContext.class,0);
		}
		public RedefinitionsContext redefinitions() {
			return getRuleContext(RedefinitionsContext.class,0);
		}
		public SubsettingsContext subsettings() {
			return getRuleContext(SubsettingsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(329);
				annotation();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KContainment) | (1L << KReadonly) | (1L << KLazy) | (1L << KSynthetized) | (1L << KInherited) | (1L << KDerived))) != 0)) {
				{
				setState(335);
				fieldModifier();
				}
			}

			setState(338);
			typeReference();
			setState(339);
			identifier();
			setState(342);
			switch (_input.LA(1)) {
			case KRedefines:
				{
				setState(340);
				redefinitions();
				}
				break;
			case KSubsets:
				{
				setState(341);
				subsettings();
				}
				break;
			case TSemicolon:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(344);
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

	public static class FieldModifierContext extends ParserRuleContext {
		public TerminalNode KContainment() { return getToken(MetaModelParser.KContainment, 0); }
		public TerminalNode KReadonly() { return getToken(MetaModelParser.KReadonly, 0); }
		public TerminalNode KLazy() { return getToken(MetaModelParser.KLazy, 0); }
		public TerminalNode KDerived() { return getToken(MetaModelParser.KDerived, 0); }
		public TerminalNode KSynthetized() { return getToken(MetaModelParser.KSynthetized, 0); }
		public TerminalNode KInherited() { return getToken(MetaModelParser.KInherited, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KContainment) | (1L << KReadonly) | (1L << KLazy) | (1L << KSynthetized) | (1L << KInherited) | (1L << KDerived))) != 0)) ) {
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

	public static class RedefinitionsContext extends ParserRuleContext {
		public TerminalNode KRedefines() { return getToken(MetaModelParser.KRedefines, 0); }
		public NameUseListContext nameUseList() {
			return getRuleContext(NameUseListContext.class,0);
		}
		public RedefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterRedefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitRedefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitRedefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedefinitionsContext redefinitions() throws RecognitionException {
		RedefinitionsContext _localctx = new RedefinitionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_redefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(KRedefines);
			setState(350);
			_la = _input.LA(1);
			if (_la==IdentifierNormal || _la==IdentifierVerbatim) {
				{
				setState(349);
				nameUseList();
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

	public static class SubsettingsContext extends ParserRuleContext {
		public TerminalNode KSubsets() { return getToken(MetaModelParser.KSubsets, 0); }
		public NameUseListContext nameUseList() {
			return getRuleContext(NameUseListContext.class,0);
		}
		public SubsettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsettings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterSubsettings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitSubsettings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitSubsettings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubsettingsContext subsettings() throws RecognitionException {
		SubsettingsContext _localctx = new SubsettingsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subsettings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(KSubsets);
			setState(354);
			_la = _input.LA(1);
			if (_la==IdentifierNormal || _la==IdentifierVerbatim) {
				{
				setState(353);
				nameUseList();
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

	public static class NameUseListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaModelParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaModelParser.TComma, i);
		}
		public NameUseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameUseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterNameUseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitNameUseList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitNameUseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameUseListContext nameUseList() throws RecognitionException {
		NameUseListContext _localctx = new NameUseListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nameUseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			qualifiedName();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(357);
				match(TComma);
				setState(358);
				qualifiedName();
				}
				}
				setState(363);
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode KConst() { return getToken(MetaModelParser.KConst, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaModelParser.TSemicolon, 0); }
		public TerminalNode TAssign() { return getToken(MetaModelParser.TAssign, 0); }
		public ExpressionOrNewExpressionContext expressionOrNewExpression() {
			return getRuleContext(ExpressionOrNewExpressionContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(KConst);
			setState(365);
			typeReference();
			setState(366);
			identifier();
			setState(369);
			_la = _input.LA(1);
			if (_la==TAssign) {
				{
				setState(367);
				match(TAssign);
				setState(368);
				expressionOrNewExpression();
				}
			}

			setState(371);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode KExtern() { return getToken(MetaModelParser.KExtern, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public TerminalNode TSemicolon() { return getToken(MetaModelParser.TSemicolon, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(373);
				annotation();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(KExtern);
			setState(380);
			returnType();
			setState(381);
			identifier();
			setState(382);
			match(TOpenParen);
			setState(384);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool) | (1L << KList) | (1L << KSet) | (1L << KMultiList) | (1L << KMultiSet) | (1L << TOpenBracket))) != 0) || _la==IdentifierNormal || _la==IdentifierVerbatim) {
				{
				setState(383);
				parameterList();
				}
			}

			setState(386);
			match(TCloseParen);
			setState(387);
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
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnType);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case KObject:
			case KString:
			case KInt:
			case KLong:
			case KFloat:
			case KDouble:
			case KByte:
			case KBool:
			case KList:
			case KSet:
			case KMultiList:
			case KMultiSet:
			case IdentifierNormal:
			case IdentifierVerbatim:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				typeReference();
				}
				break;
			case KVoid:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
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

	public static class TypeOfReferenceContext extends ParserRuleContext {
		public InvisibleTypeContext invisibleType() {
			return getRuleContext(InvisibleTypeContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TypeOfReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOfReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterTypeOfReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitTypeOfReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitTypeOfReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOfReferenceContext typeOfReference() throws RecognitionException {
		TypeOfReferenceContext _localctx = new TypeOfReferenceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeOfReference);
		try {
			setState(395);
			switch (_input.LA(1)) {
			case KAny:
			case KNone:
			case KError:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				invisibleType();
				}
				break;
			case KObject:
			case KString:
			case KInt:
			case KLong:
			case KFloat:
			case KDouble:
			case KByte:
			case KBool:
			case KList:
			case KSet:
			case KMultiList:
			case KMultiSet:
			case IdentifierNormal:
			case IdentifierVerbatim:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				typeReference();
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

	public static class TypeReferenceContext extends ParserRuleContext {
		public CollectionTypeContext collectionType() {
			return getRuleContext(CollectionTypeContext.class,0);
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
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitTypeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitTypeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeReference);
		try {
			setState(399);
			switch (_input.LA(1)) {
			case KList:
			case KSet:
			case KMultiList:
			case KMultiSet:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				collectionType();
				}
				break;
			case KObject:
			case KString:
			case KInt:
			case KLong:
			case KFloat:
			case KDouble:
			case KByte:
			case KBool:
			case IdentifierNormal:
			case IdentifierVerbatim:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				simpleType();
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simpleType);
		try {
			setState(405);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				objectType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				nullableType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				qualifiedName();
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

	public static class ClassTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode KObject() { return getToken(MetaModelParser.KObject, 0); }
		public TerminalNode KString() { return getToken(MetaModelParser.KString, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if ( !(_la==KObject || _la==KString) ) {
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode KInt() { return getToken(MetaModelParser.KInt, 0); }
		public TerminalNode KLong() { return getToken(MetaModelParser.KLong, 0); }
		public TerminalNode KFloat() { return getToken(MetaModelParser.KFloat, 0); }
		public TerminalNode KDouble() { return getToken(MetaModelParser.KDouble, 0); }
		public TerminalNode KByte() { return getToken(MetaModelParser.KByte, 0); }
		public TerminalNode KBool() { return getToken(MetaModelParser.KBool, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool))) != 0)) ) {
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

	public static class VoidTypeContext extends ParserRuleContext {
		public TerminalNode KVoid() { return getToken(MetaModelParser.KVoid, 0); }
		public VoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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

	public static class InvisibleTypeContext extends ParserRuleContext {
		public TerminalNode KAny() { return getToken(MetaModelParser.KAny, 0); }
		public TerminalNode KNone() { return getToken(MetaModelParser.KNone, 0); }
		public TerminalNode KError() { return getToken(MetaModelParser.KError, 0); }
		public InvisibleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invisibleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterInvisibleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitInvisibleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitInvisibleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvisibleTypeContext invisibleType() throws RecognitionException {
		InvisibleTypeContext _localctx = new InvisibleTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_invisibleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KAny) | (1L << KNone) | (1L << KError))) != 0)) ) {
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

	public static class NullableTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode TQuestion() { return getToken(MetaModelParser.TQuestion, 0); }
		public NullableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterNullableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitNullableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitNullableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullableTypeContext nullableType() throws RecognitionException {
		NullableTypeContext _localctx = new NullableTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nullableType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			primitiveType();
			setState(418);
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

	public static class CollectionTypeContext extends ParserRuleContext {
		public CollectionKindContext collectionKind() {
			return getRuleContext(CollectionKindContext.class,0);
		}
		public TerminalNode TLessThan() { return getToken(MetaModelParser.TLessThan, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode TGreaterThan() { return getToken(MetaModelParser.TGreaterThan, 0); }
		public CollectionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterCollectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitCollectionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitCollectionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionTypeContext collectionType() throws RecognitionException {
		CollectionTypeContext _localctx = new CollectionTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_collectionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			collectionKind();
			setState(421);
			match(TLessThan);
			setState(422);
			simpleType();
			setState(423);
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

	public static class CollectionKindContext extends ParserRuleContext {
		public TerminalNode KSet() { return getToken(MetaModelParser.KSet, 0); }
		public TerminalNode KList() { return getToken(MetaModelParser.KList, 0); }
		public TerminalNode KMultiSet() { return getToken(MetaModelParser.KMultiSet, 0); }
		public TerminalNode KMultiList() { return getToken(MetaModelParser.KMultiList, 0); }
		public CollectionKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterCollectionKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitCollectionKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitCollectionKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionKindContext collectionKind() throws RecognitionException {
		CollectionKindContext _localctx = new CollectionKindContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_collectionKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KList) | (1L << KSet) | (1L << KMultiList) | (1L << KMultiSet))) != 0)) ) {
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

	public static class OperationDeclarationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public TerminalNode TSemicolon() { return getToken(MetaModelParser.TSemicolon, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode KStatic() { return getToken(MetaModelParser.KStatic, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public OperationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterOperationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitOperationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitOperationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationDeclarationContext operationDeclaration() throws RecognitionException {
		OperationDeclarationContext _localctx = new OperationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(427);
				annotation();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			_la = _input.LA(1);
			if (_la==KStatic) {
				{
				setState(433);
				match(KStatic);
				}
			}

			setState(436);
			returnType();
			setState(437);
			identifier();
			setState(438);
			match(TOpenParen);
			setState(440);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KObject) | (1L << KString) | (1L << KInt) | (1L << KLong) | (1L << KFloat) | (1L << KDouble) | (1L << KByte) | (1L << KBool) | (1L << KList) | (1L << KSet) | (1L << KMultiList) | (1L << KMultiSet) | (1L << TOpenBracket))) != 0) || _la==IdentifierNormal || _la==IdentifierVerbatim) {
				{
				setState(439);
				parameterList();
				}
			}

			setState(442);
			match(TCloseParen);
			setState(443);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaModelParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaModelParser.TComma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			parameter();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(446);
				match(TComma);
				setState(447);
				parameter();
				}
				}
				setState(452);
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(453);
				annotation();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			typeReference();
			setState(460);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public TerminalNode TOpenBrace() { return getToken(MetaModelParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(MetaModelParser.TCloseBrace, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<InitializerDeclarationContext> initializerDeclaration() {
			return getRuleContexts(InitializerDeclarationContext.class);
		}
		public InitializerDeclarationContext initializerDeclaration(int i) {
			return getRuleContext(InitializerDeclarationContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(462);
				annotation();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			identifier();
			setState(469);
			match(TOpenParen);
			setState(470);
			match(TCloseParen);
			setState(471);
			match(TOpenBrace);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (KThis - 32)) | (1L << (TOpenBracket - 32)) | (1L << (IdentifierNormal - 32)) | (1L << (IdentifierVerbatim - 32)))) != 0)) {
				{
				{
				setState(472);
				initializerDeclaration();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(TCloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerDeclarationContext extends ParserRuleContext {
		public SynthetizedPropertyInitializerContext synthetizedPropertyInitializer() {
			return getRuleContext(SynthetizedPropertyInitializerContext.class,0);
		}
		public InheritedPropertyInitializerContext inheritedPropertyInitializer() {
			return getRuleContext(InheritedPropertyInitializerContext.class,0);
		}
		public InitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterInitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitInitializerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitInitializerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerDeclarationContext initializerDeclaration() throws RecognitionException {
		InitializerDeclarationContext _localctx = new InitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_initializerDeclaration);
		try {
			setState(482);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				synthetizedPropertyInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				inheritedPropertyInitializer();
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

	public static class SynthetizedPropertyInitializerContext extends ParserRuleContext {
		public IdentifierContext property;
		public TerminalNode TAssign() { return getToken(MetaModelParser.TAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaModelParser.TSemicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KThis() { return getToken(MetaModelParser.KThis, 0); }
		public TerminalNode TDot() { return getToken(MetaModelParser.TDot, 0); }
		public TerminalNode TOpenBracket() { return getToken(MetaModelParser.TOpenBracket, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TCloseBracket() { return getToken(MetaModelParser.TCloseBracket, 0); }
		public SynthetizedPropertyInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthetizedPropertyInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterSynthetizedPropertyInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitSynthetizedPropertyInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitSynthetizedPropertyInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthetizedPropertyInitializerContext synthetizedPropertyInitializer() throws RecognitionException {
		SynthetizedPropertyInitializerContext _localctx = new SynthetizedPropertyInitializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_synthetizedPropertyInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if (_la==KThis) {
				{
				setState(484);
				match(KThis);
				setState(485);
				match(TDot);
				}
			}

			setState(492);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(488);
				match(TOpenBracket);
				setState(489);
				qualifiedName();
				setState(490);
				match(TCloseBracket);
				}
			}

			setState(494);
			((SynthetizedPropertyInitializerContext)_localctx).property = identifier();
			setState(495);
			match(TAssign);
			setState(496);
			expression(0);
			setState(497);
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

	public static class InheritedPropertyInitializerContext extends ParserRuleContext {
		public IdentifierContext object;
		public IdentifierContext property;
		public List<TerminalNode> TDot() { return getTokens(MetaModelParser.TDot); }
		public TerminalNode TDot(int i) {
			return getToken(MetaModelParser.TDot, i);
		}
		public TerminalNode TAssign() { return getToken(MetaModelParser.TAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TSemicolon() { return getToken(MetaModelParser.TSemicolon, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode KThis() { return getToken(MetaModelParser.KThis, 0); }
		public TerminalNode TOpenBracket() { return getToken(MetaModelParser.TOpenBracket, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TCloseBracket() { return getToken(MetaModelParser.TCloseBracket, 0); }
		public InheritedPropertyInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritedPropertyInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterInheritedPropertyInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitInheritedPropertyInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitInheritedPropertyInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritedPropertyInitializerContext inheritedPropertyInitializer() throws RecognitionException {
		InheritedPropertyInitializerContext _localctx = new InheritedPropertyInitializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_inheritedPropertyInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if (_la==KThis) {
				{
				setState(499);
				match(KThis);
				setState(500);
				match(TDot);
				}
			}

			setState(503);
			((InheritedPropertyInitializerContext)_localctx).object = identifier();
			setState(504);
			match(TDot);
			setState(509);
			_la = _input.LA(1);
			if (_la==TOpenBracket) {
				{
				setState(505);
				match(TOpenBracket);
				setState(506);
				qualifiedName();
				setState(507);
				match(TCloseBracket);
				}
			}

			setState(511);
			((InheritedPropertyInitializerContext)_localctx).property = identifier();
			setState(512);
			match(TAssign);
			setState(513);
			expression(0);
			setState(514);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			expression(0);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(517);
				match(TComma);
				setState(518);
				expression(0);
				}
				}
				setState(523);
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

	public static class ExpressionOrNewExpressionListContext extends ParserRuleContext {
		public List<ExpressionOrNewExpressionContext> expressionOrNewExpression() {
			return getRuleContexts(ExpressionOrNewExpressionContext.class);
		}
		public ExpressionOrNewExpressionContext expressionOrNewExpression(int i) {
			return getRuleContext(ExpressionOrNewExpressionContext.class,i);
		}
		public ExpressionOrNewExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrNewExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterExpressionOrNewExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitExpressionOrNewExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitExpressionOrNewExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrNewExpressionListContext expressionOrNewExpressionList() throws RecognitionException {
		ExpressionOrNewExpressionListContext _localctx = new ExpressionOrNewExpressionListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionOrNewExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			expressionOrNewExpression();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TComma) {
				{
				{
				setState(525);
				match(TComma);
				setState(526);
				expressionOrNewExpression();
				}
				}
				setState(531);
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

	public static class ExpressionOrNewExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public ExpressionOrNewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrNewExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterExpressionOrNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitExpressionOrNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitExpressionOrNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrNewExpressionContext expressionOrNewExpression() throws RecognitionException {
		ExpressionOrNewExpressionContext _localctx = new ExpressionOrNewExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionOrNewExpression);
		try {
			setState(534);
			switch (_input.LA(1)) {
			case KNull:
			case KTrue:
			case KFalse:
			case KThis:
			case KTypeof:
			case TOpenParen:
			case TPlusPlus:
			case TMinusMinus:
			case TPlus:
			case TMinus:
			case TTilde:
			case TExclamation:
			case IdentifierNormal:
			case IdentifierVerbatim:
			case IntegerLiteral:
			case DecimalLiteral:
			case ScientificLiteral:
			case RegularStringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				expression(0);
				}
				break;
			case KNew:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				newExpression();
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
	public static class IndexerExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOpenBracket() { return getToken(MetaModelParser.TOpenBracket, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode TCloseBracket() { return getToken(MetaModelParser.TCloseBracket, 0); }
		public IndexerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterIndexerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitIndexerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitIndexerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public AdditiveOperatorContext kind;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ComparisonOperatorContext kind;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostExpressionContext extends ExpressionContext {
		public PostOperatorContext kind;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostOperatorContext postOperator() {
			return getRuleContext(PostOperatorContext.class,0);
		}
		public PostExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterPostExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitPostExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitPostExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketExpressionContext extends ExpressionContext {
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseAndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TAmpersand() { return getToken(MetaModelParser.TAmpersand, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitwiseAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterBitwiseAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitBitwiseAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TAndAlso() { return getToken(MetaModelParser.TAndAlso, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessExpressionContext extends ExpressionContext {
		public IdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TDot() { return getToken(MetaModelParser.TDot, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitMemberAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitMemberAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConversionExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KAs() { return getToken(MetaModelParser.KAs, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TypeConversionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterTypeConversionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitTypeConversionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitTypeConversionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public UnaryOperatorContext kind;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseXorExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode THat() { return getToken(MetaModelParser.THat, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitwiseXorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterBitwiseXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitBitwiseXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitBitwiseXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExpressionContext extends ExpressionContext {
		public LiteralExpressionContext value;
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public ConstantExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ShiftOperatorContext kind;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ShiftOperatorContext shiftOperator() {
			return getRuleContext(ShiftOperatorContext.class,0);
		}
		public ShiftExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ExpressionContext condition;
		public ExpressionContext thenExpr;
		public ExpressionContext elseExpr;
		public TerminalNode TQuestion() { return getToken(MetaModelParser.TQuestion, 0); }
		public TerminalNode TColon() { return getToken(MetaModelParser.TColon, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public AssignmentOperatorContext operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public MultiplicativeOperatorContext kind;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TOrElse() { return getToken(MetaModelParser.TOrElse, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreExpressionContext extends ExpressionContext {
		public PreOperatorContext kind;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreOperatorContext preOperator() {
			return getRuleContext(PreOperatorContext.class,0);
		}
		public PreExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitPreExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitPreExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseOrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TBar() { return getToken(MetaModelParser.TBar, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitwiseOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterBitwiseOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitBitwiseOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeofExpressionContext extends ExpressionContext {
		public TerminalNode KTypeof() { return getToken(MetaModelParser.KTypeof, 0); }
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TypeOfReferenceContext typeOfReference() {
			return getRuleContext(TypeOfReferenceContext.class,0);
		}
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public TypeofExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeCheckExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KIs() { return getToken(MetaModelParser.KIs, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TypeCheckExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterTypeCheckExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitTypeCheckExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitTypeCheckExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode KThis() { return getToken(MetaModelParser.KThis, 0); }
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public EqualityOperatorContext kind;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullCoalescingExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TQuestionQuestion() { return getToken(MetaModelParser.TQuestionQuestion, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NullCoalescingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterNullCoalescingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitNullCoalescingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitNullCoalescingExpression(this);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(537);
				match(TOpenParen);
				setState(538);
				typeReference();
				setState(539);
				match(TCloseParen);
				setState(540);
				expression(27);
				}
				break;
			case 2:
				{
				_localctx = new PreExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(542);
				((PreExpressionContext)_localctx).kind = preOperator();
				setState(543);
				expression(17);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(545);
				((UnaryExpressionContext)_localctx).kind = unaryOperator();
				setState(546);
				expression(16);
				}
				break;
			case 4:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(548);
				match(KTypeof);
				setState(549);
				match(TOpenParen);
				setState(550);
				typeOfReference();
				setState(551);
				match(TCloseParen);
				}
				break;
			case 5:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(553);
				match(TOpenParen);
				setState(554);
				expression(0);
				setState(555);
				match(TCloseParen);
				}
				break;
			case 6:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(557);
				match(KThis);
				}
				break;
			case 7:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(558);
				((ConstantExpressionContext)_localctx).value = literalExpression();
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(559);
				((IdentifierExpressionContext)_localctx).name = identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(632);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicativeExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(562);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(563);
						((MultiplicativeExpressionContext)_localctx).kind = multiplicativeOperator();
						setState(564);
						((MultiplicativeExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(566);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(567);
						((AdditiveExpressionContext)_localctx).kind = additiveOperator();
						setState(568);
						((AdditiveExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(570);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(571);
						((ShiftExpressionContext)_localctx).kind = shiftOperator();
						setState(572);
						((ShiftExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ComparisonExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(574);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(575);
						((ComparisonExpressionContext)_localctx).kind = comparisonOperator();
						setState(576);
						((ComparisonExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(578);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(579);
						((EqualityExpressionContext)_localctx).kind = equalityOperator();
						setState(580);
						((EqualityExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 6:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseAndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(582);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(583);
						match(TAmpersand);
						setState(584);
						((BitwiseAndExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseXorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseXorExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(585);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(586);
						match(THat);
						setState(587);
						((BitwiseXorExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(588);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(589);
						match(TBar);
						setState(590);
						((BitwiseOrExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 9:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalAndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(591);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(592);
						match(TAndAlso);
						setState(593);
						((LogicalAndExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 10:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(594);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(595);
						match(TOrElse);
						setState(596);
						((LogicalOrExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 11:
						{
						_localctx = new NullCoalescingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NullCoalescingExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(597);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(598);
						match(TQuestionQuestion);
						setState(599);
						((NullCoalescingExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(600);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(601);
						match(TQuestion);
						setState(602);
						((ConditionalExpressionContext)_localctx).thenExpr = expression(0);
						setState(603);
						match(TColon);
						setState(604);
						((ConditionalExpressionContext)_localctx).elseExpr = expression(3);
						}
						break;
					case 13:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AssignmentExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(606);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(607);
						((AssignmentExpressionContext)_localctx).operator = assignmentOperator();
						setState(608);
						((AssignmentExpressionContext)_localctx).right = expression(2);
						}
						break;
					case 14:
						{
						_localctx = new IndexerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(610);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(611);
						match(TOpenBracket);
						setState(612);
						expressionList();
						setState(613);
						match(TCloseBracket);
						}
						break;
					case 15:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(615);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(616);
						match(TOpenParen);
						setState(618);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KNull) | (1L << KTrue) | (1L << KFalse) | (1L << KThis) | (1L << KTypeof) | (1L << TOpenParen))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TPlusPlus - 66)) | (1L << (TMinusMinus - 66)) | (1L << (TPlus - 66)) | (1L << (TMinus - 66)) | (1L << (TTilde - 66)) | (1L << (TExclamation - 66)) | (1L << (IdentifierNormal - 66)) | (1L << (IdentifierVerbatim - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (ScientificLiteral - 66)) | (1L << (RegularStringLiteral - 66)))) != 0)) {
							{
							setState(617);
							expressionList();
							}
						}

						setState(620);
						match(TCloseParen);
						}
						break;
					case 16:
						{
						_localctx = new MemberAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(621);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(622);
						match(TDot);
						setState(623);
						((MemberAccessExpressionContext)_localctx).name = identifier();
						}
						break;
					case 17:
						{
						_localctx = new PostExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(624);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(625);
						((PostExpressionContext)_localctx).kind = postOperator();
						}
						break;
					case 18:
						{
						_localctx = new TypeConversionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(626);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(627);
						match(KAs);
						setState(628);
						typeReference();
						}
						break;
					case 19:
						{
						_localctx = new TypeCheckExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(629);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(630);
						match(KIs);
						setState(631);
						typeReference();
						}
						break;
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class LiteralExpressionContext extends ParserRuleContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public ScientificLiteralContext scientificLiteral() {
			return getRuleContext(ScientificLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literalExpression);
		try {
			setState(643);
			switch (_input.LA(1)) {
			case KNull:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				nullLiteral();
				}
				break;
			case KTrue:
			case KFalse:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				booleanLiteral();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				integerLiteral();
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				decimalLiteral();
				}
				break;
			case ScientificLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(641);
				scientificLiteral();
				}
				break;
			case RegularStringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(642);
				stringLiteral();
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

	public static class NewExpressionContext extends ParserRuleContext {
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
	 
		public NewExpressionContext() { }
		public void copyFrom(NewExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewObjectExpressionContext extends NewExpressionContext {
		public TerminalNode KNew() { return getToken(MetaModelParser.KNew, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public TerminalNode TOpenBrace() { return getToken(MetaModelParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(MetaModelParser.TCloseBrace, 0); }
		public NewPropertyInitListContext newPropertyInitList() {
			return getRuleContext(NewPropertyInitListContext.class,0);
		}
		public NewObjectExpressionContext(NewExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterNewObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitNewObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitNewObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewCollectionExpressionContext extends NewExpressionContext {
		public TerminalNode KNew() { return getToken(MetaModelParser.KNew, 0); }
		public CollectionTypeContext collectionType() {
			return getRuleContext(CollectionTypeContext.class,0);
		}
		public TerminalNode TOpenParen() { return getToken(MetaModelParser.TOpenParen, 0); }
		public TerminalNode TCloseParen() { return getToken(MetaModelParser.TCloseParen, 0); }
		public TerminalNode TOpenBrace() { return getToken(MetaModelParser.TOpenBrace, 0); }
		public TerminalNode TCloseBrace() { return getToken(MetaModelParser.TCloseBrace, 0); }
		public ExpressionOrNewExpressionContext expressionOrNewExpression() {
			return getRuleContext(ExpressionOrNewExpressionContext.class,0);
		}
		public NewCollectionExpressionContext(NewExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterNewCollectionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitNewCollectionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitNewCollectionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_newExpression);
		int _la;
		try {
			setState(667);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new NewObjectExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(KNew);
				setState(646);
				classType();
				setState(647);
				match(TOpenParen);
				setState(648);
				match(TCloseParen);
				setState(654);
				_la = _input.LA(1);
				if (_la==TOpenBrace) {
					{
					setState(649);
					match(TOpenBrace);
					setState(651);
					_la = _input.LA(1);
					if (_la==IdentifierNormal || _la==IdentifierVerbatim) {
						{
						setState(650);
						newPropertyInitList();
						}
					}

					setState(653);
					match(TCloseBrace);
					}
				}

				}
				break;
			case 2:
				_localctx = new NewCollectionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(KNew);
				setState(657);
				collectionType();
				setState(658);
				match(TOpenParen);
				setState(659);
				match(TCloseParen);
				setState(665);
				_la = _input.LA(1);
				if (_la==TOpenBrace) {
					{
					setState(660);
					match(TOpenBrace);
					setState(662);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KNew) | (1L << KNull) | (1L << KTrue) | (1L << KFalse) | (1L << KThis) | (1L << KTypeof) | (1L << TOpenParen))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TPlusPlus - 66)) | (1L << (TMinusMinus - 66)) | (1L << (TPlus - 66)) | (1L << (TMinus - 66)) | (1L << (TTilde - 66)) | (1L << (TExclamation - 66)) | (1L << (IdentifierNormal - 66)) | (1L << (IdentifierVerbatim - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (ScientificLiteral - 66)) | (1L << (RegularStringLiteral - 66)))) != 0)) {
						{
						setState(661);
						expressionOrNewExpression();
						}
					}

					setState(664);
					match(TCloseBrace);
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

	public static class NewPropertyInitListContext extends ParserRuleContext {
		public List<NewPropertyInitContext> newPropertyInit() {
			return getRuleContexts(NewPropertyInitContext.class);
		}
		public NewPropertyInitContext newPropertyInit(int i) {
			return getRuleContext(NewPropertyInitContext.class,i);
		}
		public List<TerminalNode> TComma() { return getTokens(MetaModelParser.TComma); }
		public TerminalNode TComma(int i) {
			return getToken(MetaModelParser.TComma, i);
		}
		public NewPropertyInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPropertyInitList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterNewPropertyInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitNewPropertyInitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitNewPropertyInitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewPropertyInitListContext newPropertyInitList() throws RecognitionException {
		NewPropertyInitListContext _localctx = new NewPropertyInitListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_newPropertyInitList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			newPropertyInit();
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(670);
					match(TComma);
					setState(671);
					newPropertyInit();
					}
					} 
				}
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(678);
			_la = _input.LA(1);
			if (_la==TComma) {
				{
				setState(677);
				match(TComma);
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

	public static class NewPropertyInitContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TAssign() { return getToken(MetaModelParser.TAssign, 0); }
		public ExpressionOrNewExpressionContext expressionOrNewExpression() {
			return getRuleContext(ExpressionOrNewExpressionContext.class,0);
		}
		public NewPropertyInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPropertyInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterNewPropertyInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitNewPropertyInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitNewPropertyInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewPropertyInitContext newPropertyInit() throws RecognitionException {
		NewPropertyInitContext _localctx = new NewPropertyInitContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_newPropertyInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			identifier();
			setState(681);
			match(TAssign);
			setState(682);
			expressionOrNewExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostOperatorContext extends ParserRuleContext {
		public TerminalNode TPlusPlus() { return getToken(MetaModelParser.TPlusPlus, 0); }
		public TerminalNode TMinusMinus() { return getToken(MetaModelParser.TMinusMinus, 0); }
		public PostOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterPostOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitPostOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitPostOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostOperatorContext postOperator() throws RecognitionException {
		PostOperatorContext _localctx = new PostOperatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_postOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ( !(_la==TPlusPlus || _la==TMinusMinus) ) {
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

	public static class PreOperatorContext extends ParserRuleContext {
		public TerminalNode TPlusPlus() { return getToken(MetaModelParser.TPlusPlus, 0); }
		public TerminalNode TMinusMinus() { return getToken(MetaModelParser.TMinusMinus, 0); }
		public PreOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterPreOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitPreOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitPreOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreOperatorContext preOperator() throws RecognitionException {
		PreOperatorContext _localctx = new PreOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_preOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_la = _input.LA(1);
			if ( !(_la==TPlusPlus || _la==TMinusMinus) ) {
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode TPlus() { return getToken(MetaModelParser.TPlus, 0); }
		public TerminalNode TMinus() { return getToken(MetaModelParser.TMinus, 0); }
		public TerminalNode TTilde() { return getToken(MetaModelParser.TTilde, 0); }
		public TerminalNode TExclamation() { return getToken(MetaModelParser.TExclamation, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TPlus - 68)) | (1L << (TMinus - 68)) | (1L << (TTilde - 68)) | (1L << (TExclamation - 68)))) != 0)) ) {
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

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode TAsterisk() { return getToken(MetaModelParser.TAsterisk, 0); }
		public TerminalNode TSlash() { return getToken(MetaModelParser.TSlash, 0); }
		public TerminalNode TPercent() { return getToken(MetaModelParser.TPercent, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TSlash - 72)) | (1L << (TAsterisk - 72)) | (1L << (TPercent - 72)))) != 0)) ) {
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode TPlus() { return getToken(MetaModelParser.TPlus, 0); }
		public TerminalNode TMinus() { return getToken(MetaModelParser.TMinus, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_la = _input.LA(1);
			if ( !(_la==TPlus || _la==TMinus) ) {
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

	public static class ShiftOperatorContext extends ParserRuleContext {
		public List<TerminalNode> TLessThan() { return getTokens(MetaModelParser.TLessThan); }
		public TerminalNode TLessThan(int i) {
			return getToken(MetaModelParser.TLessThan, i);
		}
		public List<TerminalNode> TGreaterThan() { return getTokens(MetaModelParser.TGreaterThan); }
		public TerminalNode TGreaterThan(int i) {
			return getToken(MetaModelParser.TGreaterThan, i);
		}
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_shiftOperator);
		try {
			setState(698);
			switch (_input.LA(1)) {
			case TLessThan:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(TLessThan);
				setState(695);
				match(TLessThan);
				}
				break;
			case TGreaterThan:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(TGreaterThan);
				setState(697);
				match(TGreaterThan);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode TLessThan() { return getToken(MetaModelParser.TLessThan, 0); }
		public TerminalNode TGreaterThan() { return getToken(MetaModelParser.TGreaterThan, 0); }
		public TerminalNode TLessThanOrEqual() { return getToken(MetaModelParser.TLessThanOrEqual, 0); }
		public TerminalNode TGreaterThanOrEqual() { return getToken(MetaModelParser.TGreaterThanOrEqual, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (TLessThan - 57)) | (1L << (TGreaterThan - 57)) | (1L << (TLessThanOrEqual - 57)) | (1L << (TGreaterThanOrEqual - 57)))) != 0)) ) {
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

	public static class EqualityOperatorContext extends ParserRuleContext {
		public TerminalNode TEqual() { return getToken(MetaModelParser.TEqual, 0); }
		public TerminalNode TNotEqual() { return getToken(MetaModelParser.TNotEqual, 0); }
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitEqualityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_la = _input.LA(1);
			if ( !(_la==TEqual || _la==TNotEqual) ) {
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode TAssign() { return getToken(MetaModelParser.TAssign, 0); }
		public TerminalNode TAsteriskAssign() { return getToken(MetaModelParser.TAsteriskAssign, 0); }
		public TerminalNode TSlashAssign() { return getToken(MetaModelParser.TSlashAssign, 0); }
		public TerminalNode TPercentAssign() { return getToken(MetaModelParser.TPercentAssign, 0); }
		public TerminalNode TPlusAssign() { return getToken(MetaModelParser.TPlusAssign, 0); }
		public TerminalNode TMinusAssign() { return getToken(MetaModelParser.TMinusAssign, 0); }
		public TerminalNode TLeftShiftAssign() { return getToken(MetaModelParser.TLeftShiftAssign, 0); }
		public TerminalNode TRightShiftAssign() { return getToken(MetaModelParser.TRightShiftAssign, 0); }
		public TerminalNode TAmpersandAssign() { return getToken(MetaModelParser.TAmpersandAssign, 0); }
		public TerminalNode THatAssign() { return getToken(MetaModelParser.THatAssign, 0); }
		public TerminalNode TBarAssign() { return getToken(MetaModelParser.TBarAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (TAssign - 50)) | (1L << (TAsteriskAssign - 50)) | (1L << (TSlashAssign - 50)) | (1L << (TPercentAssign - 50)) | (1L << (TPlusAssign - 50)) | (1L << (TMinusAssign - 50)) | (1L << (TLeftShiftAssign - 50)) | (1L << (TRightShiftAssign - 50)) | (1L << (TAmpersandAssign - 50)) | (1L << (THatAssign - 50)) | (1L << (TBarAssign - 50)))) != 0)) ) {
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

	public static class AssociationDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext source;
		public QualifiedNameContext target;
		public TerminalNode KAssociation() { return getToken(MetaModelParser.KAssociation, 0); }
		public TerminalNode KWith() { return getToken(MetaModelParser.KWith, 0); }
		public TerminalNode TSemicolon() { return getToken(MetaModelParser.TSemicolon, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AssociationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterAssociationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitAssociationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitAssociationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociationDeclarationContext associationDeclaration() throws RecognitionException {
		AssociationDeclarationContext _localctx = new AssociationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_associationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOpenBracket) {
				{
				{
				setState(706);
				annotation();
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(712);
			match(KAssociation);
			setState(713);
			((AssociationDeclarationContext)_localctx).source = qualifiedName();
			setState(714);
			match(KWith);
			setState(715);
			((AssociationDeclarationContext)_localctx).target = qualifiedName();
			setState(716);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IdentifierNormal() { return getToken(MetaModelParser.IdentifierNormal, 0); }
		public TerminalNode IdentifierVerbatim() { return getToken(MetaModelParser.IdentifierVerbatim, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_la = _input.LA(1);
			if ( !(_la==IdentifierNormal || _la==IdentifierVerbatim) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public ScientificLiteralContext scientificLiteral() {
			return getRuleContext(ScientificLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_literal);
		try {
			setState(726);
			switch (_input.LA(1)) {
			case KNull:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				nullLiteral();
				}
				break;
			case KTrue:
			case KFalse:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				booleanLiteral();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				integerLiteral();
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(723);
				decimalLiteral();
				}
				break;
			case ScientificLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(724);
				scientificLiteral();
				}
				break;
			case RegularStringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(725);
				stringLiteral();
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
		public TerminalNode KNull() { return getToken(MetaModelParser.KNull, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
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
		public TerminalNode KTrue() { return getToken(MetaModelParser.KTrue, 0); }
		public TerminalNode KFalse() { return getToken(MetaModelParser.KFalse, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(MetaModelParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
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
		public TerminalNode DecimalLiteral() { return getToken(MetaModelParser.DecimalLiteral, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
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
		public TerminalNode ScientificLiteral() { return getToken(MetaModelParser.ScientificLiteral, 0); }
		public ScientificLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientificLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterScientificLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitScientificLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitScientificLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificLiteralContext scientificLiteral() throws RecognitionException {
		ScientificLiteralContext _localctx = new ScientificLiteralContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_scientificLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode RegularStringLiteral() { return getToken(MetaModelParser.RegularStringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaModelParserListener ) ((MetaModelParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaModelParserVisitor ) return ((MetaModelParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(RegularStringLiteral);
			}
		}
		catch (RecognitionException re) {
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
		case 50:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		case 13:
			return precpred(_ctx, 21);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 19);
		case 16:
			return precpred(_ctx, 18);
		case 17:
			return precpred(_ctx, 15);
		case 18:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3k\u02e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\3\3\3\3\3\7\3\u009a\n\3\f\3\16\3\u009d\13\3\3\4\3"+
		"\4\3\4\7\4\u00a2\n\4\f\4\16\4\u00a5\13\4\3\5\3\5\3\5\7\5\u00aa\n\5\f\5"+
		"\16\5\u00ad\13\5\3\6\3\6\3\6\5\6\u00b2\n\6\3\6\3\6\3\7\3\7\5\7\u00b8\n"+
		"\7\3\7\3\7\3\b\3\b\3\b\7\b\u00bf\n\b\f\b\16\b\u00c2\13\b\3\t\3\t\3\t\3"+
		"\t\3\n\7\n\u00c9\n\n\f\n\16\n\u00cc\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d3"+
		"\n\n\f\n\16\n\u00d6\13\n\3\n\3\n\3\13\7\13\u00db\n\13\f\13\16\13\u00de"+
		"\13\13\3\13\3\13\3\13\3\13\5\13\u00e4\n\13\3\13\5\13\u00e7\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\7\f\u00ee\n\f\f\f\16\f\u00f1\13\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00fc\n\16\3\17\7\17\u00ff\n\17\f\17\16\17\u0102"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u010a\n\17\f\17\16\17\u010d"+
		"\13\17\5\17\u010f\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u0116\n\20\f\20\16"+
		"\20\u0119\13\20\3\21\7\21\u011c\n\21\f\21\16\21\u011f\13\21\3\21\3\21"+
		"\3\22\3\22\3\23\7\23\u0126\n\23\f\23\16\23\u0129\13\23\3\23\5\23\u012c"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u0132\n\23\3\23\3\23\7\23\u0136\n\23\f"+
		"\23\16\23\u0139\13\23\3\23\3\23\3\24\3\24\3\24\7\24\u0140\n\24\f\24\16"+
		"\24\u0143\13\24\3\25\3\25\3\26\3\26\3\26\5\26\u014a\n\26\3\27\7\27\u014d"+
		"\n\27\f\27\16\27\u0150\13\27\3\27\5\27\u0153\n\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0159\n\27\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u0161\n\31\3\32\3"+
		"\32\5\32\u0165\n\32\3\33\3\33\3\33\7\33\u016a\n\33\f\33\16\33\u016d\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\5\34\u0174\n\34\3\34\3\34\3\35\7\35\u0179"+
		"\n\35\f\35\16\35\u017c\13\35\3\35\3\35\3\35\3\35\3\35\5\35\u0183\n\35"+
		"\3\35\3\35\3\35\3\36\3\36\5\36\u018a\n\36\3\37\3\37\5\37\u018e\n\37\3"+
		" \3 \5 \u0192\n \3!\3!\3!\3!\5!\u0198\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\7*\u01af\n*\f*\16*\u01b2\13*\3"+
		"*\5*\u01b5\n*\3*\3*\3*\3*\5*\u01bb\n*\3*\3*\3*\3+\3+\3+\7+\u01c3\n+\f"+
		"+\16+\u01c6\13+\3,\7,\u01c9\n,\f,\16,\u01cc\13,\3,\3,\3,\3-\7-\u01d2\n"+
		"-\f-\16-\u01d5\13-\3-\3-\3-\3-\3-\7-\u01dc\n-\f-\16-\u01df\13-\3-\3-\3"+
		".\3.\5.\u01e5\n.\3/\3/\5/\u01e9\n/\3/\3/\3/\3/\5/\u01ef\n/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\5\60\u01f8\n\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0200"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\7\61\u020a\n\61\f\61\16"+
		"\61\u020d\13\61\3\62\3\62\3\62\7\62\u0212\n\62\f\62\16\62\u0215\13\62"+
		"\3\63\3\63\5\63\u0219\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0233\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u026d\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\7\64\u027b\n\64\f\64\16\64\u027e\13\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u0286\n\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u028e\n\66\3\66\5\66\u0291\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5"+
		"\66\u0299\n\66\3\66\5\66\u029c\n\66\5\66\u029e\n\66\3\67\3\67\3\67\7\67"+
		"\u02a3\n\67\f\67\16\67\u02a6\13\67\3\67\5\67\u02a9\n\67\38\38\38\38\3"+
		"9\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\5>\u02bd\n>\3?\3?\3@\3@\3A\3"+
		"A\3B\7B\u02c6\nB\fB\16B\u02c9\13B\3B\3B\3B\3B\3B\3B\3C\3C\3D\3D\3D\3D"+
		"\3D\3D\5D\u02d9\nD\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\2\3fK\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\2\20\4\2\f\f*.\3\2\23\24\3\2\25\32\3\2\34\36\4\2\33\33\37"+
		"!\3\2DE\3\2FI\3\2JL\3\2FG\4\2;<MN\3\2OP\4\2\64\64QZ\3\2[\\\3\2\20\21\u0306"+
		"\2\u0094\3\2\2\2\4\u0096\3\2\2\2\6\u009e\3\2\2\2\b\u00a6\3\2\2\2\n\u00ae"+
		"\3\2\2\2\f\u00b5\3\2\2\2\16\u00bb\3\2\2\2\20\u00c3\3\2\2\2\22\u00ca\3"+
		"\2\2\2\24\u00dc\3\2\2\2\26\u00ea\3\2\2\2\30\u00f2\3\2\2\2\32\u00fb\3\2"+
		"\2\2\34\u0100\3\2\2\2\36\u0112\3\2\2\2 \u011d\3\2\2\2\"\u0122\3\2\2\2"+
		"$\u0127\3\2\2\2&\u013c\3\2\2\2(\u0144\3\2\2\2*\u0149\3\2\2\2,\u014e\3"+
		"\2\2\2.\u015c\3\2\2\2\60\u015e\3\2\2\2\62\u0162\3\2\2\2\64\u0166\3\2\2"+
		"\2\66\u016e\3\2\2\28\u017a\3\2\2\2:\u0189\3\2\2\2<\u018d\3\2\2\2>\u0191"+
		"\3\2\2\2@\u0197\3\2\2\2B\u0199\3\2\2\2D\u019b\3\2\2\2F\u019d\3\2\2\2H"+
		"\u019f\3\2\2\2J\u01a1\3\2\2\2L\u01a3\3\2\2\2N\u01a6\3\2\2\2P\u01ab\3\2"+
		"\2\2R\u01b0\3\2\2\2T\u01bf\3\2\2\2V\u01ca\3\2\2\2X\u01d3\3\2\2\2Z\u01e4"+
		"\3\2\2\2\\\u01e8\3\2\2\2^\u01f7\3\2\2\2`\u0206\3\2\2\2b\u020e\3\2\2\2"+
		"d\u0218\3\2\2\2f\u0232\3\2\2\2h\u0285\3\2\2\2j\u029d\3\2\2\2l\u029f\3"+
		"\2\2\2n\u02aa\3\2\2\2p\u02ae\3\2\2\2r\u02b0\3\2\2\2t\u02b2\3\2\2\2v\u02b4"+
		"\3\2\2\2x\u02b6\3\2\2\2z\u02bc\3\2\2\2|\u02be\3\2\2\2~\u02c0\3\2\2\2\u0080"+
		"\u02c2\3\2\2\2\u0082\u02c7\3\2\2\2\u0084\u02d0\3\2\2\2\u0086\u02d8\3\2"+
		"\2\2\u0088\u02da\3\2\2\2\u008a\u02dc\3\2\2\2\u008c\u02de\3\2\2\2\u008e"+
		"\u02e0\3\2\2\2\u0090\u02e2\3\2\2\2\u0092\u02e4\3\2\2\2\u0094\u0095\5\22"+
		"\n\2\u0095\3\3\2\2\2\u0096\u009b\5\u0084C\2\u0097\u0098\7\62\2\2\u0098"+
		"\u009a\5\u0084C\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\5\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a3\5\u0084C\2\u009f\u00a0\7\63\2\2\u00a0\u00a2\5\u0084C\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ab\5\4\3\2\u00a7\u00a8\7\63\2"+
		"\2\u00a8\u00aa\5\4\3\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\t\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7\67\2\2\u00af\u00b1\5\u0084C\2\u00b0\u00b2\5\f\7\2\u00b1\u00b0"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\78\2\2\u00b4"+
		"\13\3\2\2\2\u00b5\u00b7\7\65\2\2\u00b6\u00b8\5\16\b\2\u00b7\u00b6\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\66\2\2\u00ba"+
		"\r\3\2\2\2\u00bb\u00c0\5\20\t\2\u00bc\u00bd\7\63\2\2\u00bd\u00bf\5\20"+
		"\t\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\17\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\5\u0084"+
		"C\2\u00c4\u00c5\7\64\2\2\u00c5\u00c6\5f\64\2\u00c6\21\3\2\2\2\u00c7\u00c9"+
		"\5\n\6\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\3"+
		"\2\2\u00ce\u00cf\5\4\3\2\u00cf\u00d0\79\2\2\u00d0\u00d4\5\24\13\2\u00d1"+
		"\u00d3\5\32\16\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d8\7:\2\2\u00d8\23\3\2\2\2\u00d9\u00db\5\n\6\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\5\2\2\u00e0\u00e6\5\u0084C"+
		"\2\u00e1\u00e3\7\65\2\2\u00e2\u00e4\5\26\f\2\u00e3\u00e2\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7\66\2\2\u00e6\u00e1\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\60\2\2\u00e9"+
		"\25\3\2\2\2\u00ea\u00ef\5\30\r\2\u00eb\u00ec\7\63\2\2\u00ec\u00ee\5\30"+
		"\r\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\27\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5\u0084"+
		"C\2\u00f3\u00f4\7\64\2\2\u00f4\u00f5\5\u0092J\2\u00f5\31\3\2\2\2\u00f6"+
		"\u00fc\5\34\17\2\u00f7\u00fc\5$\23\2\u00f8\u00fc\5\u0082B\2\u00f9\u00fc"+
		"\5\66\34\2\u00fa\u00fc\58\35\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2"+
		"\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\33"+
		"\3\2\2\2\u00fd\u00ff\5\n\6\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u0104\7\n\2\2\u0104\u0105\5\u0084C\2\u0105\u0106\79\2\2\u0106"+
		"\u010e\5\36\20\2\u0107\u010b\7\60\2\2\u0108\u010a\5\"\22\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7:\2\2\u0111\35\3\2\2\2\u0112\u0117"+
		"\5 \21\2\u0113\u0114\7\63\2\2\u0114\u0116\5 \21\2\u0115\u0113\3\2\2\2"+
		"\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\37"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\5\n\6\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u0120\u0121\5\u0084C\2\u0121!\3\2\2\2\u0122\u0123"+
		"\5R*\2\u0123#\3\2\2\2\u0124\u0126\5\n\6\2\u0125\u0124\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012c\7\b\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\t\2\2\u012e\u0131\5\u0084C\2\u012f"+
		"\u0130\7\61\2\2\u0130\u0132\5&\24\2\u0131\u012f\3\2\2\2\u0131\u0132\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\79\2\2\u0134\u0136\5*\26\2\u0135"+
		"\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7:\2\2\u013b"+
		"%\3\2\2\2\u013c\u0141\5(\25\2\u013d\u013e\7\63\2\2\u013e\u0140\5(\25\2"+
		"\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\'\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\5\4\3\2\u0145"+
		")\3\2\2\2\u0146\u014a\5,\27\2\u0147\u014a\5R*\2\u0148\u014a\5X-\2\u0149"+
		"\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a+\3\2\2\2"+
		"\u014b\u014d\5\n\6\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0153\5.\30\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\5> \2\u0155\u0158\5\u0084C\2\u0156\u0159\5\60\31\2\u0157"+
		"\u0159\5\62\32\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\60\2\2\u015b-\3\2\2\2\u015c\u015d"+
		"\t\2\2\2\u015d/\3\2\2\2\u015e\u0160\7(\2\2\u015f\u0161\5\64\33\2\u0160"+
		"\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\61\3\2\2\2\u0162\u0164\7)\2\2"+
		"\u0163\u0165\5\64\33\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\63"+
		"\3\2\2\2\u0166\u016b\5\4\3\2\u0167\u0168\7\63\2\2\u0168\u016a\5\4\3\2"+
		"\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\65\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7\'\2\2\u016f"+
		"\u0170\5> \2\u0170\u0173\5\u0084C\2\u0171\u0172\7\64\2\2\u0172\u0174\5"+
		"d\63\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\7\60\2\2\u0176\67\3\2\2\2\u0177\u0179\5\n\6\2\u0178\u0177\3\2\2"+
		"\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\6\2\2\u017e\u017f\5:\36\2\u017f"+
		"\u0180\5\u0084C\2\u0180\u0182\7\65\2\2\u0181\u0183\5T+\2\u0182\u0181\3"+
		"\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\66\2\2\u0185"+
		"\u0186\7\60\2\2\u01869\3\2\2\2\u0187\u018a\5> \2\u0188\u018a\5H%\2\u0189"+
		"\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a;\3\2\2\2\u018b\u018e\5J&\2\u018c"+
		"\u018e\5> \2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e=\3\2\2\2\u018f"+
		"\u0192\5N(\2\u0190\u0192\5@!\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2"+
		"\u0192?\3\2\2\2\u0193\u0198\5F$\2\u0194\u0198\5D#\2\u0195\u0198\5L\'\2"+
		"\u0196\u0198\5\4\3\2\u0197\u0193\3\2\2\2\u0197\u0194\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0196\3\2\2\2\u0198A\3\2\2\2\u0199\u019a\5\4\3\2\u019a"+
		"C\3\2\2\2\u019b\u019c\t\3\2\2\u019cE\3\2\2\2\u019d\u019e\t\4\2\2\u019e"+
		"G\3\2\2\2\u019f\u01a0\7\22\2\2\u01a0I\3\2\2\2\u01a1\u01a2\t\5\2\2\u01a2"+
		"K\3\2\2\2\u01a3\u01a4\5F$\2\u01a4\u01a5\7=\2\2\u01a5M\3\2\2\2\u01a6\u01a7"+
		"\5P)\2\u01a7\u01a8\7;\2\2\u01a8\u01a9\5@!\2\u01a9\u01aa\7<\2\2\u01aaO"+
		"\3\2\2\2\u01ab\u01ac\t\6\2\2\u01acQ\3\2\2\2\u01ad\u01af\5\n\6\2\u01ae"+
		"\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\7/\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\5:"+
		"\36\2\u01b7\u01b8\5\u0084C\2\u01b8\u01ba\7\65\2\2\u01b9\u01bb\5T+\2\u01ba"+
		"\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7\66"+
		"\2\2\u01bd\u01be\7\60\2\2\u01beS\3\2\2\2\u01bf\u01c4\5V,\2\u01c0\u01c1"+
		"\7\63\2\2\u01c1\u01c3\5V,\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5U\3\2\2\2\u01c6\u01c4\3\2\2\2"+
		"\u01c7\u01c9\5\n\6\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01ce\5> \2\u01ce\u01cf\5\u0084C\2\u01cfW\3\2\2\2\u01d0\u01d2\5\n\6\2"+
		"\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\5\u0084C"+
		"\2\u01d7\u01d8\7\65\2\2\u01d8\u01d9\7\66\2\2\u01d9\u01dd\79\2\2\u01da"+
		"\u01dc\5Z.\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2"+
		"\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1"+
		"\7:\2\2\u01e1Y\3\2\2\2\u01e2\u01e5\5\\/\2\u01e3\u01e5\5^\60\2\u01e4\u01e2"+
		"\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5[\3\2\2\2\u01e6\u01e7\7\"\2\2\u01e7"+
		"\u01e9\7\62\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ee\3"+
		"\2\2\2\u01ea\u01eb\7\67\2\2\u01eb\u01ec\5\4\3\2\u01ec\u01ed\78\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f1\5\u0084C\2\u01f1\u01f2\7\64\2\2\u01f2\u01f3\5f\64\2\u01f3"+
		"\u01f4\7\60\2\2\u01f4]\3\2\2\2\u01f5\u01f6\7\"\2\2\u01f6\u01f8\7\62\2"+
		"\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa"+
		"\5\u0084C\2\u01fa\u01ff\7\62\2\2\u01fb\u01fc\7\67\2\2\u01fc\u01fd\5\4"+
		"\3\2\u01fd\u01fe\78\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fb\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\5\u0084C\2\u0202\u0203"+
		"\7\64\2\2\u0203\u0204\5f\64\2\u0204\u0205\7\60\2\2\u0205_\3\2\2\2\u0206"+
		"\u020b\5f\64\2\u0207\u0208\7\63\2\2\u0208\u020a\5f\64\2\u0209\u0207\3"+
		"\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"a\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0213\5d\63\2\u020f\u0210\7\63\2\2"+
		"\u0210\u0212\5d\63\2\u0211\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214c\3\2\2\2\u0215\u0213\3\2\2\2\u0216"+
		"\u0219\5f\64\2\u0217\u0219\5j\66\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2"+
		"\2\2\u0219e\3\2\2\2\u021a\u021b\b\64\1\2\u021b\u021c\7\65\2\2\u021c\u021d"+
		"\5> \2\u021d\u021e\7\66\2\2\u021e\u021f\5f\64\35\u021f\u0233\3\2\2\2\u0220"+
		"\u0221\5r:\2\u0221\u0222\5f\64\23\u0222\u0233\3\2\2\2\u0223\u0224\5t;"+
		"\2\u0224\u0225\5f\64\22\u0225\u0233\3\2\2\2\u0226\u0227\7#\2\2\u0227\u0228"+
		"\7\65\2\2\u0228\u0229\5<\37\2\u0229\u022a\7\66\2\2\u022a\u0233\3\2\2\2"+
		"\u022b\u022c\7\65\2\2\u022c\u022d\5f\64\2\u022d\u022e\7\66\2\2\u022e\u0233"+
		"\3\2\2\2\u022f\u0233\7\"\2\2\u0230\u0233\5h\65\2\u0231\u0233\5\u0084C"+
		"\2\u0232\u021a\3\2\2\2\u0232\u0220\3\2\2\2\u0232\u0223\3\2\2\2\u0232\u0226"+
		"\3\2\2\2\u0232\u022b\3\2\2\2\u0232\u022f\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0231\3\2\2\2\u0233\u027c\3\2\2\2\u0234\u0235\f\17\2\2\u0235\u0236\5"+
		"v<\2\u0236\u0237\5f\64\20\u0237\u027b\3\2\2\2\u0238\u0239\f\16\2\2\u0239"+
		"\u023a\5x=\2\u023a\u023b\5f\64\17\u023b\u027b\3\2\2\2\u023c\u023d\f\r"+
		"\2\2\u023d\u023e\5z>\2\u023e\u023f\5f\64\16\u023f\u027b\3\2\2\2\u0240"+
		"\u0241\f\f\2\2\u0241\u0242\5|?\2\u0242\u0243\5f\64\r\u0243\u027b\3\2\2"+
		"\2\u0244\u0245\f\13\2\2\u0245\u0246\5~@\2\u0246\u0247\5f\64\f\u0247\u027b"+
		"\3\2\2\2\u0248\u0249\f\n\2\2\u0249\u024a\7?\2\2\u024a\u027b\5f\64\13\u024b"+
		"\u024c\f\t\2\2\u024c\u024d\7@\2\2\u024d\u027b\5f\64\n\u024e\u024f\f\b"+
		"\2\2\u024f\u0250\7A\2\2\u0250\u027b\5f\64\t\u0251\u0252\f\7\2\2\u0252"+
		"\u0253\7B\2\2\u0253\u027b\5f\64\b\u0254\u0255\f\6\2\2\u0255\u0256\7C\2"+
		"\2\u0256\u027b\5f\64\7\u0257\u0258\f\5\2\2\u0258\u0259\7>\2\2\u0259\u027b"+
		"\5f\64\6\u025a\u025b\f\4\2\2\u025b\u025c\7=\2\2\u025c\u025d\5f\64\2\u025d"+
		"\u025e\7\61\2\2\u025e\u025f\5f\64\5\u025f\u027b\3\2\2\2\u0260\u0261\f"+
		"\3\2\2\u0261\u0262\5\u0080A\2\u0262\u0263\5f\64\4\u0263\u027b\3\2\2\2"+
		"\u0264\u0265\f\27\2\2\u0265\u0266\7\67\2\2\u0266\u0267\5`\61\2\u0267\u0268"+
		"\78\2\2\u0268\u027b\3\2\2\2\u0269\u026a\f\26\2\2\u026a\u026c\7\65\2\2"+
		"\u026b\u026d\5`\61\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e\u027b\7\66\2\2\u026f\u0270\f\25\2\2\u0270\u0271\7\62\2"+
		"\2\u0271\u027b\5\u0084C\2\u0272\u0273\f\24\2\2\u0273\u027b\5p9\2\u0274"+
		"\u0275\f\21\2\2\u0275\u0276\7$\2\2\u0276\u027b\5> \2\u0277\u0278\f\20"+
		"\2\2\u0278\u0279\7%\2\2\u0279\u027b\5> \2\u027a\u0234\3\2\2\2\u027a\u0238"+
		"\3\2\2\2\u027a\u023c\3\2\2\2\u027a\u0240\3\2\2\2\u027a\u0244\3\2\2\2\u027a"+
		"\u0248\3\2\2\2\u027a\u024b\3\2\2\2\u027a\u024e\3\2\2\2\u027a\u0251\3\2"+
		"\2\2\u027a\u0254\3\2\2\2\u027a\u0257\3\2\2\2\u027a\u025a\3\2\2\2\u027a"+
		"\u0260\3\2\2\2\u027a\u0264\3\2\2\2\u027a\u0269\3\2\2\2\u027a\u026f\3\2"+
		"\2\2\u027a\u0272\3\2\2\2\u027a\u0274\3\2\2\2\u027a\u0277\3\2\2\2\u027b"+
		"\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027dg\3\2\2\2"+
		"\u027e\u027c\3\2\2\2\u027f\u0286\5\u0088E\2\u0280\u0286\5\u008aF\2\u0281"+
		"\u0286\5\u008cG\2\u0282\u0286\5\u008eH\2\u0283\u0286\5\u0090I\2\u0284"+
		"\u0286\5\u0092J\2\u0285\u027f\3\2\2\2\u0285\u0280\3\2\2\2\u0285\u0281"+
		"\3\2\2\2\u0285\u0282\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286"+
		"i\3\2\2\2\u0287\u0288\7\16\2\2\u0288\u0289\5B\"\2\u0289\u028a\7\65\2\2"+
		"\u028a\u0290\7\66\2\2\u028b\u028d\79\2\2\u028c\u028e\5l\67\2\u028d\u028c"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\7:\2\2\u0290"+
		"\u028b\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u029e\3\2\2\2\u0292\u0293\7\16"+
		"\2\2\u0293\u0294\5N(\2\u0294\u0295\7\65\2\2\u0295\u029b\7\66\2\2\u0296"+
		"\u0298\79\2\2\u0297\u0299\5d\63\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299\u029a\3\2\2\2\u029a\u029c\7:\2\2\u029b\u0296\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u0287\3\2\2\2\u029d\u0292\3\2"+
		"\2\2\u029ek\3\2\2\2\u029f\u02a4\5n8\2\u02a0\u02a1\7\63\2\2\u02a1\u02a3"+
		"\5n8\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a9\7\63"+
		"\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9m\3\2\2\2\u02aa\u02ab"+
		"\5\u0084C\2\u02ab\u02ac\7\64\2\2\u02ac\u02ad\5d\63\2\u02ado\3\2\2\2\u02ae"+
		"\u02af\t\7\2\2\u02afq\3\2\2\2\u02b0\u02b1\t\7\2\2\u02b1s\3\2\2\2\u02b2"+
		"\u02b3\t\b\2\2\u02b3u\3\2\2\2\u02b4\u02b5\t\t\2\2\u02b5w\3\2\2\2\u02b6"+
		"\u02b7\t\n\2\2\u02b7y\3\2\2\2\u02b8\u02b9\7;\2\2\u02b9\u02bd\7;\2\2\u02ba"+
		"\u02bb\7<\2\2\u02bb\u02bd\7<\2\2\u02bc\u02b8\3\2\2\2\u02bc\u02ba\3\2\2"+
		"\2\u02bd{\3\2\2\2\u02be\u02bf\t\13\2\2\u02bf}\3\2\2\2\u02c0\u02c1\t\f"+
		"\2\2\u02c1\177\3\2\2\2\u02c2\u02c3\t\r\2\2\u02c3\u0081\3\2\2\2\u02c4\u02c6"+
		"\5\n\6\2\u02c5\u02c4\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7\13"+
		"\2\2\u02cb\u02cc\5\4\3\2\u02cc\u02cd\7\r\2\2\u02cd\u02ce\5\4\3\2\u02ce"+
		"\u02cf\7\60\2\2\u02cf\u0083\3\2\2\2\u02d0\u02d1\t\16\2\2\u02d1\u0085\3"+
		"\2\2\2\u02d2\u02d9\5\u0088E\2\u02d3\u02d9\5\u008aF\2\u02d4\u02d9\5\u008c"+
		"G\2\u02d5\u02d9\5\u008eH\2\u02d6\u02d9\5\u0090I\2\u02d7\u02d9\5\u0092"+
		"J\2\u02d8\u02d2\3\2\2\2\u02d8\u02d3\3\2\2\2\u02d8\u02d4\3\2\2\2\u02d8"+
		"\u02d5\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u0087\3\2"+
		"\2\2\u02da\u02db\7\17\2\2\u02db\u0089\3\2\2\2\u02dc\u02dd\t\17\2\2\u02dd"+
		"\u008b\3\2\2\2\u02de\u02df\7]\2\2\u02df\u008d\3\2\2\2\u02e0\u02e1\7^\2"+
		"\2\u02e1\u008f\3\2\2\2\u02e2\u02e3\7_\2\2\u02e3\u0091\3\2\2\2\u02e4\u02e5"+
		"\7d\2\2\u02e5\u0093\3\2\2\2E\u009b\u00a3\u00ab\u00b1\u00b7\u00c0\u00ca"+
		"\u00d4\u00dc\u00e3\u00e6\u00ef\u00fb\u0100\u010b\u010e\u0117\u011d\u0127"+
		"\u012b\u0131\u0137\u0141\u0149\u014e\u0152\u0158\u0160\u0164\u016b\u0173"+
		"\u017a\u0182\u0189\u018d\u0191\u0197\u01b0\u01b4\u01ba\u01c4\u01ca\u01d3"+
		"\u01dd\u01e4\u01e8\u01ee\u01f7\u01ff\u020b\u0213\u0218\u0232\u026c\u027a"+
		"\u027c\u0285\u028d\u0290\u0298\u029b\u029d\u02a4\u02a8\u02bc\u02c7\u02d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}