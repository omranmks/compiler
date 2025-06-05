// Generated from C:/Users/Omran/Documents/IntelliJ/Compiler/OmranProject/src/Angular/gen/AngularParser.g4 by ANTLR 4.13.2
package Angular.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TypeScriptComment=1, StartTypeScriptComment=2, AngularDecorator=3, Import=4, 
		From=5, Export=6, Class=7, Let=8, Const=9, Var=10, Return=11, Private=12, 
		Public=13, Protected=14, Constructor=15, Function=16, This=17, If=18, 
		Else=19, For=20, While=21, Of=22, MathOperator=23, Sign=24, Increment=25, 
		Decrement=26, PlusEqual=27, MinusEqual=28, Arrow=29, GreaterThan=30, GreaterOrEqual=31, 
		LessThan=32, LessOrEqual=33, ConditionalEqual=34, ConditionalNotEqual=35, 
		StrongConditionalEqual=36, StrongConditionalNotEqual=37, AndOperator=38, 
		OrOperator=39, String=40, Number=41, Boolean=42, Any=43, Void=44, True=45, 
		False=46, MultiLinesString=47, DoubleQuotationString=48, SingleQuotationString=49, 
		NUMBER=50, DIGIT=51, IDENTIFIER=52, WORD=53, Slash=54, BackSlash=55, Equal=56, 
		Star=57, Dash=58, Plus=59, Backtick=60, Dot=61, Comma=62, Colon=63, SemiColon=64, 
		AtSign=65, Ampersand=66, Pipe=67, ExclamationMark=68, QuestionMark=69, 
		LeftAngleBracket=70, RightAngleBracket=71, LeftParenthesis=72, RightParenthesis=73, 
		LeftCurlyBrace=74, RightCurlyBrace=75, LeftSquareBracket=76, RightSquareBracket=77, 
		SingleQuotation=78, DoubleQuotation=79, WhiteSpace=80, NewLine=81, SINGLE_QUOTATION_STRING_CONTENT=82, 
		DOUBLE_QUOTATION_STRING_CONTENT=83, MULTI_LINES_STRING_CONTENT=84, COMMENT_CONTENT=85;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_importLibs = 2, RULE_component = 3, 
		RULE_componentMetaData = 4, RULE_componentMetaDataKey = 5, RULE_componentMetaDataValue = 6, 
		RULE_exportClass = 7, RULE_class = 8, RULE_export = 9, RULE_classBody = 10, 
		RULE_classAttribute = 11, RULE_classMethod = 12, RULE_block = 13, RULE_blockContent = 14, 
		RULE_variable = 15, RULE_variableDeclaration = 16, RULE_variableAccessing = 17, 
		RULE_variableChaining = 18, RULE_variableAssigning = 19, RULE_propertyAccessing = 20, 
		RULE_arrayElementAccessing = 21, RULE_function = 22, RULE_functionDeclaration = 23, 
		RULE_functionAccessing = 24, RULE_functionCall = 25, RULE_ifElseBlock = 26, 
		RULE_ifStatement = 27, RULE_ifElseStatement = 28, RULE_elseStatement = 29, 
		RULE_forBlock = 30, RULE_forStatment = 31, RULE_whileBlock = 32, RULE_whileStatement = 33, 
		RULE_conditions = 34, RULE_condition = 35, RULE_statement = 36, RULE_combiningOperator = 37, 
		RULE_conditionalOperator = 38, RULE_assigningOperator = 39, RULE_chainingOperator = 40, 
		RULE_arguments = 41, RULE_argument = 42, RULE_parameters = 43, RULE_parameter = 44, 
		RULE_declaration = 45, RULE_accessModifiers = 46, RULE_type = 47, RULE_identifier = 48, 
		RULE_objectType = 49, RULE_propertyType = 50, RULE_return = 51, RULE_value = 52, 
		RULE_string = 53, RULE_number = 54, RULE_boolean = 55, RULE_array = 56, 
		RULE_element = 57, RULE_object = 58, RULE_property = 59, RULE_anonymousFunction = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importLibs", "component", "componentMetaData", 
			"componentMetaDataKey", "componentMetaDataValue", "exportClass", "class", 
			"export", "classBody", "classAttribute", "classMethod", "block", "blockContent", 
			"variable", "variableDeclaration", "variableAccessing", "variableChaining", 
			"variableAssigning", "propertyAccessing", "arrayElementAccessing", "function", 
			"functionDeclaration", "functionAccessing", "functionCall", "ifElseBlock", 
			"ifStatement", "ifElseStatement", "elseStatement", "forBlock", "forStatment", 
			"whileBlock", "whileStatement", "conditions", "condition", "statement", 
			"combiningOperator", "conditionalOperator", "assigningOperator", "chainingOperator", 
			"arguments", "argument", "parameters", "parameter", "declaration", "accessModifiers", 
			"type", "identifier", "objectType", "propertyType", "return", "value", 
			"string", "number", "boolean", "array", "element", "object", "property", 
			"anonymousFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'import'", "'from'", "'export'", "'class'", 
			"'let'", "'const'", "'var'", "'return'", "'private'", "'public'", "'protected'", 
			"'constructor'", "'function'", "'this'", "'if'", "'else'", "'for'", "'while'", 
			"'of'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'string'", "'number'", "'boolean'", 
			"'any'", "'void'", "'true'", "'false'", null, null, null, null, null, 
			null, null, "'/'", "'\\'", "'='", "'*'", "'-'", "'+'", "'`'", "'.'", 
			"','", "':'", "';'", "'@'", "'&'", "'|'", "'!'", "'?'", "'<'", "'>'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TypeScriptComment", "StartTypeScriptComment", "AngularDecorator", 
			"Import", "From", "Export", "Class", "Let", "Const", "Var", "Return", 
			"Private", "Public", "Protected", "Constructor", "Function", "This", 
			"If", "Else", "For", "While", "Of", "MathOperator", "Sign", "Increment", 
			"Decrement", "PlusEqual", "MinusEqual", "Arrow", "GreaterThan", "GreaterOrEqual", 
			"LessThan", "LessOrEqual", "ConditionalEqual", "ConditionalNotEqual", 
			"StrongConditionalEqual", "StrongConditionalNotEqual", "AndOperator", 
			"OrOperator", "String", "Number", "Boolean", "Any", "Void", "True", "False", 
			"MultiLinesString", "DoubleQuotationString", "SingleQuotationString", 
			"NUMBER", "DIGIT", "IDENTIFIER", "WORD", "Slash", "BackSlash", "Equal", 
			"Star", "Dash", "Plus", "Backtick", "Dot", "Comma", "Colon", "SemiColon", 
			"AtSign", "Ampersand", "Pipe", "ExclamationMark", "QuestionMark", "LeftAngleBracket", 
			"RightAngleBracket", "LeftParenthesis", "RightParenthesis", "LeftCurlyBrace", 
			"RightCurlyBrace", "LeftSquareBracket", "RightSquareBracket", "SingleQuotation", 
			"DoubleQuotation", "WhiteSpace", "NewLine", "SINGLE_QUOTATION_STRING_CONTENT", 
			"DOUBLE_QUOTATION_STRING_CONTENT", "MULTI_LINES_STRING_CONTENT", "COMMENT_CONTENT"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ExportClassContext exportClass() {
			return getRuleContext(ExportClassContext.class,0);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(122);
				importStatement();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AngularDecorator) {
				{
				{
				setState(128);
				component();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Export:
				{
				setState(134);
				exportClass();
				}
				break;
			case Class:
				{
				{
				setState(135);
				class_();
				setState(136);
				export();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<ImportLibsContext> importLibs() {
			return getRuleContexts(ImportLibsContext.class);
		}
		public ImportLibsContext importLibs(int i) {
			return getRuleContext(ImportLibsContext.class,i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(Import);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				importLibs();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftCurlyBrace );
			setState(146);
			match(From);
			setState(147);
			string();
			setState(148);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
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
	public static class ImportLibsContext extends ParserRuleContext {
		public TerminalNode LeftCurlyBrace() { return getToken(AngularParser.LeftCurlyBrace, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RightCurlyBrace() { return getToken(AngularParser.RightCurlyBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ImportLibsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importLibs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportLibs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportLibs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportLibs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportLibsContext importLibs() throws RecognitionException {
		ImportLibsContext _localctx = new ImportLibsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importLibs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(LeftCurlyBrace);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					identifier();
					setState(152);
					match(Comma);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(159);
			identifier();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(160);
				match(Comma);
				}
			}

			setState(163);
			match(RightCurlyBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode AngularDecorator() { return getToken(AngularParser.AngularDecorator, 0); }
		public TerminalNode LeftParenthesis() { return getToken(AngularParser.LeftParenthesis, 0); }
		public TerminalNode LeftCurlyBrace() { return getToken(AngularParser.LeftCurlyBrace, 0); }
		public TerminalNode RightCurlyBrace() { return getToken(AngularParser.RightCurlyBrace, 0); }
		public TerminalNode RightParenthesis() { return getToken(AngularParser.RightParenthesis, 0); }
		public List<ComponentMetaDataContext> componentMetaData() {
			return getRuleContexts(ComponentMetaDataContext.class);
		}
		public ComponentMetaDataContext componentMetaData(int i) {
			return getRuleContext(ComponentMetaDataContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_component);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(AngularDecorator);
			setState(166);
			match(LeftParenthesis);
			setState(167);
			match(LeftCurlyBrace);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					componentMetaData();
					setState(169);
					match(Comma);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(176);
				componentMetaData();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(177);
					match(Comma);
					}
				}

				}
			}

			setState(182);
			match(RightCurlyBrace);
			setState(183);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
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
	public static class ComponentMetaDataContext extends ParserRuleContext {
		public ComponentMetaDataKeyContext componentMetaDataKey() {
			return getRuleContext(ComponentMetaDataKeyContext.class,0);
		}
		public ComponentMetaDataValueContext componentMetaDataValue() {
			return getRuleContext(ComponentMetaDataValueContext.class,0);
		}
		public ComponentMetaDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetaData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentMetaData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentMetaData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentMetaData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetaDataContext componentMetaData() throws RecognitionException {
		ComponentMetaDataContext _localctx = new ComponentMetaDataContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentMetaData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			componentMetaDataKey();
			setState(186);
			componentMetaDataValue();
			}
		}
		catch (RecognitionException re) {
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
	public static class ComponentMetaDataKeyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ComponentMetaDataKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetaDataKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentMetaDataKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentMetaDataKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentMetaDataKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetaDataKeyContext componentMetaDataKey() throws RecognitionException {
		ComponentMetaDataKeyContext _localctx = new ComponentMetaDataKeyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentMetaDataKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			identifier();
			setState(189);
			match(Colon);
			}
		}
		catch (RecognitionException re) {
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
	public static class ComponentMetaDataValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableAccessingContext variableAccessing() {
			return getRuleContext(VariableAccessingContext.class,0);
		}
		public ComponentMetaDataValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetaDataValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentMetaDataValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentMetaDataValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentMetaDataValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetaDataValueContext componentMetaDataValue() throws RecognitionException {
		ComponentMetaDataValueContext _localctx = new ComponentMetaDataValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentMetaDataValue);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
			case MultiLinesString:
			case DoubleQuotationString:
			case SingleQuotationString:
			case NUMBER:
			case LeftParenthesis:
			case LeftCurlyBrace:
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				value();
				}
				break;
			case This:
			case Increment:
			case Decrement:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				variableAccessing();
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
	public static class ExportClassContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public ExportClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportClassContext exportClass() throws RecognitionException {
		ExportClassContext _localctx = new ExportClassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exportClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(Export);
			setState(196);
			class_();
			}
		}
		catch (RecognitionException re) {
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(Class);
			setState(199);
			identifier();
			setState(200);
			classBody();
			}
		}
		catch (RecognitionException re) {
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
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode LeftCurlyBrace() { return getToken(AngularParser.LeftCurlyBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RightCurlyBrace() { return getToken(AngularParser.RightCurlyBrace, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Export);
			setState(203);
			match(LeftCurlyBrace);
			setState(204);
			identifier();
			setState(205);
			match(RightCurlyBrace);
			setState(206);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
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
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LeftCurlyBrace() { return getToken(AngularParser.LeftCurlyBrace, 0); }
		public TerminalNode RightCurlyBrace() { return getToken(AngularParser.RightCurlyBrace, 0); }
		public List<ClassAttributeContext> classAttribute() {
			return getRuleContexts(ClassAttributeContext.class);
		}
		public ClassAttributeContext classAttribute(int i) {
			return getRuleContext(ClassAttributeContext.class,i);
		}
		public List<ClassMethodContext> classMethod() {
			return getRuleContexts(ClassMethodContext.class);
		}
		public ClassMethodContext classMethod(int i) {
			return getRuleContext(ClassMethodContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LeftCurlyBrace);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599627431936L) != 0)) {
				{
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(209);
					classAttribute();
					}
					break;
				case 2:
					{
					setState(210);
					classMethod();
					}
					break;
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RightCurlyBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class ClassAttributeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssigningOperatorContext assigningOperator() {
			return getRuleContext(AssigningOperatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ClassAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAttributeContext classAttribute() throws RecognitionException {
		ClassAttributeContext _localctx = new ClassAttributeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) {
				{
				setState(218);
				accessModifiers();
				}
			}

			setState(221);
			identifier();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Void || _la==Colon) {
				{
				setState(222);
				type();
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594440581120L) != 0)) {
				{
				setState(225);
				assigningOperator();
				setState(226);
				value();
				}
			}

			setState(230);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
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
	public static class ClassMethodContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Constructor() { return getToken(AngularParser.Constructor, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public ClassMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodContext classMethod() throws RecognitionException {
		ClassMethodContext _localctx = new ClassMethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Constructor:
				{
				setState(232);
				match(Constructor);
				}
				break;
			case Private:
			case Public:
			case Protected:
			case IDENTIFIER:
				{
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) {
					{
					setState(233);
					accessModifiers();
					}
				}

				setState(236);
				identifier();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
			arguments();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Void || _la==Colon) {
				{
				setState(240);
				type();
				}
			}

			setState(243);
			block();
			}
		}
		catch (RecognitionException re) {
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LeftCurlyBrace() { return getToken(AngularParser.LeftCurlyBrace, 0); }
		public TerminalNode RightCurlyBrace() { return getToken(AngularParser.RightCurlyBrace, 0); }
		public List<BlockContentContext> blockContent() {
			return getRuleContexts(BlockContentContext.class);
		}
		public BlockContentContext blockContent(int i) {
			return getRuleContext(BlockContentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LeftCurlyBrace);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599731642112L) != 0)) {
				{
				{
				setState(246);
				blockContent();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(RightCurlyBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class BlockContentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IfElseBlockContext ifElseBlock() {
			return getRuleContext(IfElseBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public BlockContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContentContext blockContent() throws RecognitionException {
		BlockContentContext _localctx = new BlockContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockContent);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				ifElseBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				forBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				whileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				return_();
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAccessingContext variableAccessing() {
			return getRuleContext(VariableAccessingContext.class,0);
		}
		public VariableAssigningContext variableAssigning() {
			return getRuleContext(VariableAssigningContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(262);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(263);
				variableAccessing();
				}
				break;
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594440581120L) != 0)) {
				{
				setState(266);
				variableAssigning();
				}
			}

			setState(269);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) {
				{
				setState(271);
				declaration();
				}
			}

			setState(274);
			identifier();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Void || _la==Colon) {
				{
				setState(275);
				type();
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
	public static class VariableAccessingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ChainingOperatorContext> chainingOperator() {
			return getRuleContexts(ChainingOperatorContext.class);
		}
		public ChainingOperatorContext chainingOperator(int i) {
			return getRuleContext(ChainingOperatorContext.class,i);
		}
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public List<VariableChainingContext> variableChaining() {
			return getRuleContexts(VariableChainingContext.class);
		}
		public VariableChainingContext variableChaining(int i) {
			return getRuleContext(VariableChainingContext.class,i);
		}
		public VariableAccessingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccessing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableAccessing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableAccessing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableAccessing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAccessingContext variableAccessing() throws RecognitionException {
		VariableAccessingContext _localctx = new VariableAccessingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableAccessing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Increment || _la==Decrement) {
				{
				setState(278);
				chainingOperator();
				}
			}

			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==This) {
				{
				setState(281);
				match(This);
				setState(282);
				match(Dot);
				}
			}

			setState(285);
			identifier();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==LeftSquareBracket) {
				{
				{
				setState(286);
				variableChaining();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Increment || _la==Decrement) {
				{
				setState(292);
				chainingOperator();
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
	public static class VariableChainingContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public PropertyAccessingContext propertyAccessing() {
			return getRuleContext(PropertyAccessingContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayElementAccessingContext arrayElementAccessing() {
			return getRuleContext(ArrayElementAccessingContext.class,0);
		}
		public VariableChainingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableChaining; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableChaining(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableChaining(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableChaining(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableChainingContext variableChaining() throws RecognitionException {
		VariableChainingContext _localctx = new VariableChainingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableChaining);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(295);
				match(Dot);
				setState(296);
				propertyAccessing();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(297);
				match(Dot);
				setState(298);
				functionCall();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				arrayElementAccessing();
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
	public static class VariableAssigningContext extends ParserRuleContext {
		public AssigningOperatorContext assigningOperator() {
			return getRuleContext(AssigningOperatorContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> MathOperator() { return getTokens(AngularParser.MathOperator); }
		public TerminalNode MathOperator(int i) {
			return getToken(AngularParser.MathOperator, i);
		}
		public VariableAssigningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssigning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableAssigning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableAssigning(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableAssigning(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssigningContext variableAssigning() throws RecognitionException {
		VariableAssigningContext _localctx = new VariableAssigningContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableAssigning);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			assigningOperator();
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					statement();
					setState(304);
					match(MathOperator);
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(311);
			statement();
			}
		}
		catch (RecognitionException re) {
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
	public static class PropertyAccessingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertyAccessingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccessing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAccessing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAccessing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAccessing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessingContext propertyAccessing() throws RecognitionException {
		PropertyAccessingContext _localctx = new PropertyAccessingContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_propertyAccessing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementAccessingContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracket() { return getToken(AngularParser.LeftSquareBracket, 0); }
		public TerminalNode RightSquareBracket() { return getToken(AngularParser.RightSquareBracket, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ArrayElementAccessingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElementAccessing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayElementAccessing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayElementAccessing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayElementAccessing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementAccessingContext arrayElementAccessing() throws RecognitionException {
		ArrayElementAccessingContext _localctx = new ArrayElementAccessingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayElementAccessing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(LeftSquareBracket);
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MultiLinesString:
			case DoubleQuotationString:
			case SingleQuotationString:
				{
				setState(316);
				string();
				}
				break;
			case NUMBER:
				{
				setState(317);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(320);
			match(RightSquareBracket);
			}
		}
		catch (RecognitionException re) {
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
	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionAccessingContext functionAccessing() {
			return getRuleContext(FunctionAccessingContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				functionDeclaration();
				}
				break;
			case This:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(323);
				functionAccessing();
				setState(324);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(AngularParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Function);
			setState(329);
			identifier();
			setState(330);
			arguments();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Void || _la==Colon) {
				{
				setState(331);
				type();
				}
			}

			setState(334);
			block();
			}
		}
		catch (RecognitionException re) {
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
	public static class FunctionAccessingContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public List<VariableChainingContext> variableChaining() {
			return getRuleContexts(VariableChainingContext.class);
		}
		public VariableChainingContext variableChaining(int i) {
			return getRuleContext(VariableChainingContext.class,i);
		}
		public FunctionAccessingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAccessing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionAccessing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionAccessing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionAccessing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAccessingContext functionAccessing() throws RecognitionException {
		FunctionAccessingContext _localctx = new FunctionAccessingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionAccessing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==This) {
				{
				setState(336);
				match(This);
				setState(337);
				match(Dot);
				}
			}

			setState(340);
			functionCall();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==LeftSquareBracket) {
				{
				{
				setState(341);
				variableChaining();
				}
				}
				setState(346);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(AngularParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(AngularParser.RightParenthesis, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			identifier();
			setState(348);
			match(LeftParenthesis);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 2818572351L) != 0)) {
				{
				setState(349);
				parameters();
				}
			}

			setState(352);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
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
	public static class IfElseBlockContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<IfElseStatementContext> ifElseStatement() {
			return getRuleContexts(IfElseStatementContext.class);
		}
		public IfElseStatementContext ifElseStatement(int i) {
			return getRuleContext(IfElseStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseBlockContext ifElseBlock() throws RecognitionException {
		IfElseBlockContext _localctx = new IfElseBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifElseBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			ifStatement();
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					ifElseStatement();
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(361);
				elseStatement();
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode LeftParenthesis() { return getToken(AngularParser.LeftParenthesis, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(AngularParser.RightParenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(If);
			setState(365);
			match(LeftParenthesis);
			setState(366);
			conditions();
			setState(367);
			match(RightParenthesis);
			setState(368);
			block();
			}
		}
		catch (RecognitionException re) {
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
	public static class IfElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode LeftParenthesis() { return getToken(AngularParser.LeftParenthesis, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(AngularParser.RightParenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(Else);
			setState(371);
			match(If);
			setState(372);
			match(LeftParenthesis);
			setState(373);
			conditions();
			setState(374);
			match(RightParenthesis);
			setState(375);
			block();
			}
		}
		catch (RecognitionException re) {
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
	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(Else);
			setState(378);
			block();
			}
		}
		catch (RecognitionException re) {
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
		public ForStatmentContext forStatment() {
			return getRuleContext(ForStatmentContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			forStatment();
			setState(381);
			block();
			}
		}
		catch (RecognitionException re) {
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
	public static class ForStatmentContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(AngularParser.For, 0); }
		public TerminalNode LeftParenthesis() { return getToken(AngularParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(AngularParser.RightParenthesis, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public VariableAccessingContext variableAccessing() {
			return getRuleContext(VariableAccessingContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode Of() { return getToken(AngularParser.Of, 0); }
		public ForStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatmentContext forStatment() throws RecognitionException {
		ForStatmentContext _localctx = new ForStatmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(For);
			setState(384);
			match(LeftParenthesis);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				{
				setState(385);
				variable();
				setState(386);
				conditions();
				setState(387);
				match(SemiColon);
				setState(388);
				variableAccessing();
				}
				}
				break;
			case 2:
				{
				{
				setState(390);
				variableDeclaration();
				setState(391);
				match(Of);
				setState(392);
				variableAccessing();
				}
				}
				break;
			}
			setState(396);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
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
	public static class WhileBlockContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			whileStatement();
			setState(399);
			block();
			}
		}
		catch (RecognitionException re) {
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(AngularParser.While, 0); }
		public TerminalNode LeftParenthesis() { return getToken(AngularParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(AngularParser.RightParenthesis, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(While);
			setState(402);
			match(LeftParenthesis);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 756604788669416193L) != 0)) {
				{
				setState(403);
				conditions();
				}
			}

			setState(406);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
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
	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<CombiningOperatorContext> combiningOperator() {
			return getRuleContexts(CombiningOperatorContext.class);
		}
		public CombiningOperatorContext combiningOperator(int i) {
			return getRuleContext(CombiningOperatorContext.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408);
					condition();
					setState(409);
					combiningOperator();
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(416);
			condition();
			}
		}
		catch (RecognitionException re) {
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionalOperatorContext conditionalOperator() {
			return getRuleContext(ConditionalOperatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			statement();
			setState(419);
			conditionalOperator();
			setState(420);
			statement();
			}
		}
		catch (RecognitionException re) {
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
	public static class StatementContext extends ParserRuleContext {
		public VariableAccessingContext variableAccessing() {
			return getRuleContext(VariableAccessingContext.class,0);
		}
		public FunctionAccessingContext functionAccessing() {
			return getRuleContext(FunctionAccessingContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statement);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				variableAccessing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				functionAccessing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				value();
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
	public static class CombiningOperatorContext extends ParserRuleContext {
		public TerminalNode AndOperator() { return getToken(AngularParser.AndOperator, 0); }
		public TerminalNode OrOperator() { return getToken(AngularParser.OrOperator, 0); }
		public CombiningOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combiningOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCombiningOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCombiningOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCombiningOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombiningOperatorContext combiningOperator() throws RecognitionException {
		CombiningOperatorContext _localctx = new CombiningOperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_combiningOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(_la==AndOperator || _la==OrOperator) ) {
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
	public static class ConditionalOperatorContext extends ParserRuleContext {
		public TerminalNode StrongConditionalEqual() { return getToken(AngularParser.StrongConditionalEqual, 0); }
		public TerminalNode StrongConditionalNotEqual() { return getToken(AngularParser.StrongConditionalNotEqual, 0); }
		public TerminalNode ConditionalEqual() { return getToken(AngularParser.ConditionalEqual, 0); }
		public TerminalNode ConditionalNotEqual() { return getToken(AngularParser.ConditionalNotEqual, 0); }
		public TerminalNode GreaterThan() { return getToken(AngularParser.GreaterThan, 0); }
		public TerminalNode GreaterOrEqual() { return getToken(AngularParser.GreaterOrEqual, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode LessOrEqual() { return getToken(AngularParser.LessOrEqual, 0); }
		public ConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConditionalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConditionalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 273804165120L) != 0)) ) {
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
	public static class AssigningOperatorContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(AngularParser.Equal, 0); }
		public TerminalNode PlusEqual() { return getToken(AngularParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(AngularParser.MinusEqual, 0); }
		public AssigningOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigningOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssigningOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssigningOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssigningOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigningOperatorContext assigningOperator() throws RecognitionException {
		AssigningOperatorContext _localctx = new AssigningOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_assigningOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594440581120L) != 0)) ) {
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
	public static class ChainingOperatorContext extends ParserRuleContext {
		public TerminalNode Increment() { return getToken(AngularParser.Increment, 0); }
		public TerminalNode Decrement() { return getToken(AngularParser.Decrement, 0); }
		public ChainingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterChainingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitChainingOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitChainingOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainingOperatorContext chainingOperator() throws RecognitionException {
		ChainingOperatorContext _localctx = new ChainingOperatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_chainingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !(_la==Increment || _la==Decrement) ) {
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
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(AngularParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(AngularParser.RightParenthesis, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(LeftParenthesis);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					argument();
					setState(437);
					match(Comma);
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599627399168L) != 0)) {
				{
				setState(444);
				argument();
				}
			}

			setState(447);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
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
	public static class ArgumentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(AngularParser.QuestionMark, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) {
				{
				setState(449);
				accessModifiers();
				}
			}

			setState(452);
			identifier();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(453);
				match(QuestionMark);
				}
			}

			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Void || _la==Colon) {
				{
				setState(456);
				type();
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
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(459);
					parameter();
					setState(460);
					match(Comma);
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(467);
			parameter();
			}
		}
		catch (RecognitionException re) {
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
	public static class ParameterContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			value();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
		public TerminalNode Var() { return getToken(AngularParser.Var, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
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
	public static class AccessModifiersContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(AngularParser.Private, 0); }
		public TerminalNode Public() { return getToken(AngularParser.Public, 0); }
		public TerminalNode Protected() { return getToken(AngularParser.Protected, 0); }
		public AccessModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccessModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccessModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccessModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifiersContext accessModifiers() throws RecognitionException {
		AccessModifiersContext _localctx = new AccessModifiersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_accessModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode Number() { return getToken(AngularParser.Number, 0); }
		public TerminalNode Boolean() { return getToken(AngularParser.Boolean, 0); }
		public TerminalNode Any() { return getToken(AngularParser.Any, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TerminalNode LeftSquareBracket() { return getToken(AngularParser.LeftSquareBracket, 0); }
		public TerminalNode RightSquareBracket() { return getToken(AngularParser.RightSquareBracket, 0); }
		public TerminalNode Void() { return getToken(AngularParser.Void, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_type);
		int _la;
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(Colon);
				{
				setState(482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String:
					{
					setState(476);
					match(String);
					}
					break;
				case Number:
					{
					setState(477);
					match(Number);
					}
					break;
				case Boolean:
					{
					setState(478);
					match(Boolean);
					}
					break;
				case Any:
					{
					setState(479);
					match(Any);
					}
					break;
				case IDENTIFIER:
					{
					setState(480);
					identifier();
					}
					break;
				case LeftCurlyBrace:
					{
					setState(481);
					objectType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftSquareBracket) {
					{
					setState(484);
					match(LeftSquareBracket);
					setState(485);
					match(RightSquareBracket);
					}
				}

				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(Void);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode LeftCurlyBrace() { return getToken(AngularParser.LeftCurlyBrace, 0); }
		public List<PropertyTypeContext> propertyType() {
			return getRuleContexts(PropertyTypeContext.class);
		}
		public PropertyTypeContext propertyType(int i) {
			return getRuleContext(PropertyTypeContext.class,i);
		}
		public TerminalNode RightCurlyBrace() { return getToken(AngularParser.RightCurlyBrace, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(AngularParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(AngularParser.SemiColon, i);
		}
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_objectType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(LeftCurlyBrace);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					propertyType();
					setState(495);
					match(SemiColon);
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(502);
			propertyType();
			setState(503);
			match(RightCurlyBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class PropertyTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PropertyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyTypeContext propertyType() throws RecognitionException {
		PropertyTypeContext _localctx = new PropertyTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_propertyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			identifier();
			setState(506);
			type();
			}
		}
		catch (RecognitionException re) {
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(Return);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 756604788669416193L) != 0)) {
				{
				setState(509);
				statement();
				}
			}

			setState(512);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
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
	public static class ValueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_value);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MultiLinesString:
			case DoubleQuotationString:
			case SingleQuotationString:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				string();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				number();
				}
				break;
			case True:
			case False:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				boolean_();
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				array();
				}
				break;
			case LeftCurlyBrace:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				object();
				}
				break;
			case LeftParenthesis:
				enterOuterAlt(_localctx, 6);
				{
				setState(519);
				anonymousFunction();
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode SingleQuotationString() { return getToken(AngularParser.SingleQuotationString, 0); }
		public TerminalNode DoubleQuotationString() { return getToken(AngularParser.DoubleQuotationString, 0); }
		public TerminalNode MultiLinesString() { return getToken(AngularParser.MultiLinesString, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
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
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(AngularParser.True, 0); }
		public TerminalNode False() { return getToken(AngularParser.False, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracket() { return getToken(AngularParser.LeftSquareBracket, 0); }
		public TerminalNode RightSquareBracket() { return getToken(AngularParser.RightSquareBracket, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(LeftSquareBracket);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(529);
					element();
					setState(530);
					match(Comma);
					}
					} 
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 756604788669416193L) != 0)) {
				{
				setState(537);
				element();
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(538);
					match(Comma);
					}
				}

				}
			}

			setState(543);
			match(RightSquareBracket);
			}
		}
		catch (RecognitionException re) {
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableAccessingContext variableAccessing() {
			return getRuleContext(VariableAccessingContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_element);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
			case MultiLinesString:
			case DoubleQuotationString:
			case SingleQuotationString:
			case NUMBER:
			case LeftParenthesis:
			case LeftCurlyBrace:
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				value();
				}
				break;
			case This:
			case Increment:
			case Decrement:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				variableAccessing();
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LeftCurlyBrace() { return getToken(AngularParser.LeftCurlyBrace, 0); }
		public TerminalNode RightCurlyBrace() { return getToken(AngularParser.RightCurlyBrace, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_object);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(LeftCurlyBrace);
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(550);
					property();
					setState(551);
					match(Comma);
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(558);
				property();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(559);
					match(Comma);
					}
				}

				}
			}

			setState(564);
			match(RightCurlyBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			identifier();
			setState(567);
			match(Colon);
			setState(568);
			value();
			}
		}
		catch (RecognitionException re) {
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
	public static class AnonymousFunctionContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(AngularParser.Arrow, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			arguments();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Void || _la==Colon) {
				{
				setState(571);
				type();
				}
			}

			setState(574);
			match(Arrow);
			setState(575);
			block();
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001U\u0242\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0001\u0000\u0005\u0000|\b\u0000\n\u0000\f\u0000\u007f\t\u0000"+
		"\u0001\u0000\u0005\u0000\u0082\b\u0000\n\u0000\f\u0000\u0085\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u008b\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0004\u0001\u008f\b\u0001\u000b\u0001\f\u0001\u0090"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u009b\b\u0002\n\u0002\f\u0002\u009e"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a2\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00ac\b\u0003\n\u0003\f\u0003\u00af\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00b3\b\u0003\u0003\u0003\u00b5\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00c2\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00d4\b\n\n\n\f\n\u00d7\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0003\u000b\u00dc\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e0\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e5\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00eb\b\f\u0001\f\u0003\f\u00ee"+
		"\b\f\u0001\f\u0001\f\u0003\f\u00f2\b\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0005\r\u00f8\b\r\n\r\f\r\u00fb\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0105"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u0109\b\u000f\u0001\u000f"+
		"\u0003\u000f\u010c\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010"+
		"\u0111\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0115\b\u0010\u0001"+
		"\u0011\u0003\u0011\u0118\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u011c"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0120\b\u0011\n\u0011\f\u0011"+
		"\u0123\t\u0011\u0001\u0011\u0003\u0011\u0126\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u012d\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0133\b\u0013\n"+
		"\u0013\f\u0013\u0136\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u013f\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0147\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u014d\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0153\b\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0157\b\u0018"+
		"\n\u0018\f\u0018\u015a\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u015f\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0165\b\u001a\n\u001a\f\u001a\u0168\t\u001a\u0001\u001a\u0003\u001a"+
		"\u016b\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u018b\b\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u0195\b!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u019c\b\"\n\"\f\"\u019f\t\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u01aa\b$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0005)\u01b8\b)\n)\f)\u01bb\t)\u0001)\u0003)\u01be\b)\u0001)"+
		"\u0001)\u0001*\u0003*\u01c3\b*\u0001*\u0001*\u0003*\u01c7\b*\u0001*\u0003"+
		"*\u01ca\b*\u0001+\u0001+\u0001+\u0005+\u01cf\b+\n+\f+\u01d2\t+\u0001+"+
		"\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u01e3\b/\u0001/\u0001/\u0003/\u01e7"+
		"\b/\u0001/\u0003/\u01ea\b/\u00010\u00010\u00011\u00011\u00011\u00011\u0005"+
		"1\u01f2\b1\n1\f1\u01f5\t1\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"3\u00013\u00033\u01ff\b3\u00013\u00013\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00034\u0209\b4\u00015\u00015\u00016\u00016\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00058\u0215\b8\n8\f8\u0218\t8\u00018\u00018\u0003"+
		"8\u021c\b8\u00038\u021e\b8\u00018\u00018\u00019\u00019\u00039\u0224\b"+
		"9\u0001:\u0001:\u0001:\u0001:\u0005:\u022a\b:\n:\f:\u022d\t:\u0001:\u0001"+
		":\u0003:\u0231\b:\u0003:\u0233\b:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		";\u0001<\u0001<\u0003<\u023d\b<\u0001<\u0001<\u0001<\u0001<\u0000\u0000"+
		"=\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\u0000\b\u0001"+
		"\u0000&\'\u0001\u0000\u001e%\u0002\u0000\u001b\u001c88\u0001\u0000\u0019"+
		"\u001a\u0001\u0000\b\n\u0001\u0000\f\u000e\u0001\u0000/1\u0001\u0000-"+
		".\u0250\u0000}\u0001\u0000\u0000\u0000\u0002\u008c\u0001\u0000\u0000\u0000"+
		"\u0004\u0096\u0001\u0000\u0000\u0000\u0006\u00a5\u0001\u0000\u0000\u0000"+
		"\b\u00b9\u0001\u0000\u0000\u0000\n\u00bc\u0001\u0000\u0000\u0000\f\u00c1"+
		"\u0001\u0000\u0000\u0000\u000e\u00c3\u0001\u0000\u0000\u0000\u0010\u00c6"+
		"\u0001\u0000\u0000\u0000\u0012\u00ca\u0001\u0000\u0000\u0000\u0014\u00d0"+
		"\u0001\u0000\u0000\u0000\u0016\u00db\u0001\u0000\u0000\u0000\u0018\u00ed"+
		"\u0001\u0000\u0000\u0000\u001a\u00f5\u0001\u0000\u0000\u0000\u001c\u0104"+
		"\u0001\u0000\u0000\u0000\u001e\u0108\u0001\u0000\u0000\u0000 \u0110\u0001"+
		"\u0000\u0000\u0000\"\u0117\u0001\u0000\u0000\u0000$\u012c\u0001\u0000"+
		"\u0000\u0000&\u012e\u0001\u0000\u0000\u0000(\u0139\u0001\u0000\u0000\u0000"+
		"*\u013b\u0001\u0000\u0000\u0000,\u0146\u0001\u0000\u0000\u0000.\u0148"+
		"\u0001\u0000\u0000\u00000\u0152\u0001\u0000\u0000\u00002\u015b\u0001\u0000"+
		"\u0000\u00004\u0162\u0001\u0000\u0000\u00006\u016c\u0001\u0000\u0000\u0000"+
		"8\u0172\u0001\u0000\u0000\u0000:\u0179\u0001\u0000\u0000\u0000<\u017c"+
		"\u0001\u0000\u0000\u0000>\u017f\u0001\u0000\u0000\u0000@\u018e\u0001\u0000"+
		"\u0000\u0000B\u0191\u0001\u0000\u0000\u0000D\u019d\u0001\u0000\u0000\u0000"+
		"F\u01a2\u0001\u0000\u0000\u0000H\u01a9\u0001\u0000\u0000\u0000J\u01ab"+
		"\u0001\u0000\u0000\u0000L\u01ad\u0001\u0000\u0000\u0000N\u01af\u0001\u0000"+
		"\u0000\u0000P\u01b1\u0001\u0000\u0000\u0000R\u01b3\u0001\u0000\u0000\u0000"+
		"T\u01c2\u0001\u0000\u0000\u0000V\u01d0\u0001\u0000\u0000\u0000X\u01d5"+
		"\u0001\u0000\u0000\u0000Z\u01d7\u0001\u0000\u0000\u0000\\\u01d9\u0001"+
		"\u0000\u0000\u0000^\u01e9\u0001\u0000\u0000\u0000`\u01eb\u0001\u0000\u0000"+
		"\u0000b\u01ed\u0001\u0000\u0000\u0000d\u01f9\u0001\u0000\u0000\u0000f"+
		"\u01fc\u0001\u0000\u0000\u0000h\u0208\u0001\u0000\u0000\u0000j\u020a\u0001"+
		"\u0000\u0000\u0000l\u020c\u0001\u0000\u0000\u0000n\u020e\u0001\u0000\u0000"+
		"\u0000p\u0210\u0001\u0000\u0000\u0000r\u0223\u0001\u0000\u0000\u0000t"+
		"\u0225\u0001\u0000\u0000\u0000v\u0236\u0001\u0000\u0000\u0000x\u023a\u0001"+
		"\u0000\u0000\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0083\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u0003\u0006\u0003\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u008a\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u008b\u0003\u000e\u0007\u0000"+
		"\u0087\u0088\u0003\u0010\b\u0000\u0088\u0089\u0003\u0012\t\u0000\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008a"+
		"\u0087\u0001\u0000\u0000\u0000\u008b\u0001\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0005\u0004\u0000\u0000\u008d\u008f\u0003\u0004\u0002\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0005\u0000\u0000\u0093"+
		"\u0094\u0003j5\u0000\u0094\u0095\u0005@\u0000\u0000\u0095\u0003\u0001"+
		"\u0000\u0000\u0000\u0096\u009c\u0005J\u0000\u0000\u0097\u0098\u0003`0"+
		"\u0000\u0098\u0099\u0005>\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0003`0\u0000\u00a0\u00a2\u0005>\u0000\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005K\u0000\u0000\u00a4\u0005\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u0003\u0000\u0000\u00a6\u00a7\u0005"+
		"H\u0000\u0000\u00a7\u00ad\u0005J\u0000\u0000\u00a8\u00a9\u0003\b\u0004"+
		"\u0000\u00a9\u00aa\u0005>\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b4\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0003\b\u0004\u0000\u00b1\u00b3\u0005>\u0000\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005K\u0000\u0000\u00b7\u00b8\u0005I\u0000\u0000\u00b8\u0007\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0003\n\u0005\u0000\u00ba\u00bb\u0003\f"+
		"\u0006\u0000\u00bb\t\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003`0\u0000"+
		"\u00bd\u00be\u0005?\u0000\u0000\u00be\u000b\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c2\u0003h4\u0000\u00c0\u00c2\u0003\"\u0011\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\r\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u00c5\u0003\u0010"+
		"\b\u0000\u00c5\u000f\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0007\u0000"+
		"\u0000\u00c7\u00c8\u0003`0\u0000\u00c8\u00c9\u0003\u0014\n\u0000\u00c9"+
		"\u0011\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0006\u0000\u0000\u00cb"+
		"\u00cc\u0005J\u0000\u0000\u00cc\u00cd\u0003`0\u0000\u00cd\u00ce\u0005"+
		"K\u0000\u0000\u00ce\u00cf\u0005@\u0000\u0000\u00cf\u0013\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d5\u0005J\u0000\u0000\u00d1\u00d4\u0003\u0016\u000b\u0000"+
		"\u00d2\u00d4\u0003\u0018\f\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0005K\u0000\u0000\u00d9\u0015\u0001\u0000\u0000\u0000\u00da\u00dc"+
		"\u0003\\.\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0003"+
		"`0\u0000\u00de\u00e0\u0003^/\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0003N\'\u0000\u00e2\u00e3\u0003h4\u0000\u00e3\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"@\u0000\u0000\u00e7\u0017\u0001\u0000\u0000\u0000\u00e8\u00ee\u0005\u000f"+
		"\u0000\u0000\u00e9\u00eb\u0003\\.\u0000\u00ea\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ee\u0003`0\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u0003R)\u0000\u00f0\u00f2\u0003^/\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0003\u001a\r\u0000\u00f4\u0019\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f9\u0005J\u0000\u0000\u00f6\u00f8\u0003\u001c\u000e\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005K\u0000\u0000\u00fd\u001b\u0001\u0000\u0000\u0000\u00fe"+
		"\u0105\u0003\u001e\u000f\u0000\u00ff\u0105\u0003,\u0016\u0000\u0100\u0105"+
		"\u00034\u001a\u0000\u0101\u0105\u0003<\u001e\u0000\u0102\u0105\u0003@"+
		" \u0000\u0103\u0105\u0003f3\u0000\u0104\u00fe\u0001\u0000\u0000\u0000"+
		"\u0104\u00ff\u0001\u0000\u0000\u0000\u0104\u0100\u0001\u0000\u0000\u0000"+
		"\u0104\u0101\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u001d\u0001\u0000\u0000\u0000"+
		"\u0106\u0109\u0003 \u0010\u0000\u0107\u0109\u0003\"\u0011\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109"+
		"\u010b\u0001\u0000\u0000\u0000\u010a\u010c\u0003&\u0013\u0000\u010b\u010a"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0005@\u0000\u0000\u010e\u001f\u0001"+
		"\u0000\u0000\u0000\u010f\u0111\u0003Z-\u0000\u0110\u010f\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u0114\u0003`0\u0000\u0113\u0115\u0003^/\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115!\u0001"+
		"\u0000\u0000\u0000\u0116\u0118\u0003P(\u0000\u0117\u0116\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005\u0011\u0000\u0000\u011a\u011c\u0005=\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0121\u0003`0\u0000\u011e\u0120"+
		"\u0003$\u0012\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0124\u0126\u0003P(\u0000\u0125\u0124\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126#\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0005=\u0000\u0000\u0128\u012d\u0003(\u0014\u0000\u0129\u012a"+
		"\u0005=\u0000\u0000\u012a\u012d\u00032\u0019\u0000\u012b\u012d\u0003*"+
		"\u0015\u0000\u012c\u0127\u0001\u0000\u0000\u0000\u012c\u0129\u0001\u0000"+
		"\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d%\u0001\u0000\u0000"+
		"\u0000\u012e\u0134\u0003N\'\u0000\u012f\u0130\u0003H$\u0000\u0130\u0131"+
		"\u0005\u0017\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u012f"+
		"\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0137"+
		"\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0003H$\u0000\u0138\'\u0001\u0000\u0000\u0000\u0139\u013a\u0003`0\u0000"+
		"\u013a)\u0001\u0000\u0000\u0000\u013b\u013e\u0005L\u0000\u0000\u013c\u013f"+
		"\u0003j5\u0000\u013d\u013f\u0003l6\u0000\u013e\u013c\u0001\u0000\u0000"+
		"\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0005M\u0000\u0000\u0141+\u0001\u0000\u0000\u0000\u0142"+
		"\u0147\u0003.\u0017\u0000\u0143\u0144\u00030\u0018\u0000\u0144\u0145\u0005"+
		"@\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0142\u0001\u0000"+
		"\u0000\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0147-\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0005\u0010\u0000\u0000\u0149\u014a\u0003`0\u0000\u014a"+
		"\u014c\u0003R)\u0000\u014b\u014d\u0003^/\u0000\u014c\u014b\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0003\u001a\r\u0000\u014f/\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005\u0011\u0000\u0000\u0151\u0153\u0005=\u0000\u0000"+
		"\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0158\u00032\u0019\u0000\u0155"+
		"\u0157\u0003$\u0012\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u01591\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0003`0\u0000\u015c\u015e\u0005H\u0000"+
		"\u0000\u015d\u015f\u0003V+\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0005I\u0000\u0000\u01613\u0001\u0000\u0000\u0000\u0162\u0166\u0003"+
		"6\u001b\u0000\u0163\u0165\u00038\u001c\u0000\u0164\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000"+
		"\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016b\u0003:\u001d\u0000"+
		"\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b5\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u0012\u0000\u0000\u016d"+
		"\u016e\u0005H\u0000\u0000\u016e\u016f\u0003D\"\u0000\u016f\u0170\u0005"+
		"I\u0000\u0000\u0170\u0171\u0003\u001a\r\u0000\u01717\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0005\u0013\u0000\u0000\u0173\u0174\u0005\u0012\u0000"+
		"\u0000\u0174\u0175\u0005H\u0000\u0000\u0175\u0176\u0003D\"\u0000\u0176"+
		"\u0177\u0005I\u0000\u0000\u0177\u0178\u0003\u001a\r\u0000\u01789\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005\u0013\u0000\u0000\u017a\u017b\u0003"+
		"\u001a\r\u0000\u017b;\u0001\u0000\u0000\u0000\u017c\u017d\u0003>\u001f"+
		"\u0000\u017d\u017e\u0003\u001a\r\u0000\u017e=\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005\u0014\u0000\u0000\u0180\u018a\u0005H\u0000\u0000\u0181"+
		"\u0182\u0003\u001e\u000f\u0000\u0182\u0183\u0003D\"\u0000\u0183\u0184"+
		"\u0005@\u0000\u0000\u0184\u0185\u0003\"\u0011\u0000\u0185\u018b\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0003 \u0010\u0000\u0187\u0188\u0005\u0016"+
		"\u0000\u0000\u0188\u0189\u0003\"\u0011\u0000\u0189\u018b\u0001\u0000\u0000"+
		"\u0000\u018a\u0181\u0001\u0000\u0000\u0000\u018a\u0186\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0005I\u0000\u0000"+
		"\u018d?\u0001\u0000\u0000\u0000\u018e\u018f\u0003B!\u0000\u018f\u0190"+
		"\u0003\u001a\r\u0000\u0190A\u0001\u0000\u0000\u0000\u0191\u0192\u0005"+
		"\u0015\u0000\u0000\u0192\u0194\u0005H\u0000\u0000\u0193\u0195\u0003D\""+
		"\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0005I\u0000\u0000"+
		"\u0197C\u0001\u0000\u0000\u0000\u0198\u0199\u0003F#\u0000\u0199\u019a"+
		"\u0003J%\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0198\u0001\u0000"+
		"\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0003F#\u0000"+
		"\u01a1E\u0001\u0000\u0000\u0000\u01a2\u01a3\u0003H$\u0000\u01a3\u01a4"+
		"\u0003L&\u0000\u01a4\u01a5\u0003H$\u0000\u01a5G\u0001\u0000\u0000\u0000"+
		"\u01a6\u01aa\u0003\"\u0011\u0000\u01a7\u01aa\u00030\u0018\u0000\u01a8"+
		"\u01aa\u0003h4\u0000\u01a9\u01a6\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aaI\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0007\u0000\u0000\u0000\u01acK\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0007\u0001\u0000\u0000\u01aeM\u0001\u0000\u0000\u0000"+
		"\u01af\u01b0\u0007\u0002\u0000\u0000\u01b0O\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0007\u0003\u0000\u0000\u01b2Q\u0001\u0000\u0000\u0000\u01b3\u01b9"+
		"\u0005H\u0000\u0000\u01b4\u01b5\u0003T*\u0000\u01b5\u01b6\u0005>\u0000"+
		"\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01be\u0003T*\u0000\u01bd"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005I\u0000\u0000\u01c0S\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c3\u0003\\.\u0000\u01c2\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c6\u0003`0\u0000\u01c5\u01c7\u0005E\u0000\u0000"+
		"\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01ca\u0003^/\u0000\u01c9\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01caU\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cc\u0003X,\u0000\u01cc\u01cd\u0005>\u0000"+
		"\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003X,\u0000\u01d4"+
		"W\u0001\u0000\u0000\u0000\u01d5\u01d6\u0003h4\u0000\u01d6Y\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0007\u0004\u0000\u0000\u01d8[\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0007\u0005\u0000\u0000\u01da]\u0001\u0000\u0000\u0000"+
		"\u01db\u01e2\u0005?\u0000\u0000\u01dc\u01e3\u0005(\u0000\u0000\u01dd\u01e3"+
		"\u0005)\u0000\u0000\u01de\u01e3\u0005*\u0000\u0000\u01df\u01e3\u0005+"+
		"\u0000\u0000\u01e0\u01e3\u0003`0\u0000\u01e1\u01e3\u0003b1\u0000\u01e2"+
		"\u01dc\u0001\u0000\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2"+
		"\u01de\u0001\u0000\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005L\u0000\u0000\u01e5\u01e7"+
		"\u0005M\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01ea\u0005"+
		",\u0000\u0000\u01e9\u01db\u0001\u0000\u0000\u0000\u01e9\u01e8\u0001\u0000"+
		"\u0000\u0000\u01ea_\u0001\u0000\u0000\u0000\u01eb\u01ec\u00054\u0000\u0000"+
		"\u01eca\u0001\u0000\u0000\u0000\u01ed\u01f3\u0005J\u0000\u0000\u01ee\u01ef"+
		"\u0003d2\u0000\u01ef\u01f0\u0005@\u0000\u0000\u01f0\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0003d2\u0000\u01f7\u01f8\u0005K\u0000\u0000"+
		"\u01f8c\u0001\u0000\u0000\u0000\u01f9\u01fa\u0003`0\u0000\u01fa\u01fb"+
		"\u0003^/\u0000\u01fbe\u0001\u0000\u0000\u0000\u01fc\u01fe\u0005\u000b"+
		"\u0000\u0000\u01fd\u01ff\u0003H$\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0005@\u0000\u0000\u0201g\u0001\u0000\u0000\u0000\u0202\u0209"+
		"\u0003j5\u0000\u0203\u0209\u0003l6\u0000\u0204\u0209\u0003n7\u0000\u0205"+
		"\u0209\u0003p8\u0000\u0206\u0209\u0003t:\u0000\u0207\u0209\u0003x<\u0000"+
		"\u0208\u0202\u0001\u0000\u0000\u0000\u0208\u0203\u0001\u0000\u0000\u0000"+
		"\u0208\u0204\u0001\u0000\u0000\u0000\u0208\u0205\u0001\u0000\u0000\u0000"+
		"\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000"+
		"\u0209i\u0001\u0000\u0000\u0000\u020a\u020b\u0007\u0006\u0000\u0000\u020b"+
		"k\u0001\u0000\u0000\u0000\u020c\u020d\u00052\u0000\u0000\u020dm\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u0007\u0007\u0000\u0000\u020fo\u0001\u0000"+
		"\u0000\u0000\u0210\u0216\u0005L\u0000\u0000\u0211\u0212\u0003r9\u0000"+
		"\u0212\u0213\u0005>\u0000\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214"+
		"\u0211\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216"+
		"\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"\u021d\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219"+
		"\u021b\u0003r9\u0000\u021a\u021c\u0005>\u0000\u0000\u021b\u021a\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021e\u0001"+
		"\u0000\u0000\u0000\u021d\u0219\u0001\u0000\u0000\u0000\u021d\u021e\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0005"+
		"M\u0000\u0000\u0220q\u0001\u0000\u0000\u0000\u0221\u0224\u0003h4\u0000"+
		"\u0222\u0224\u0003\"\u0011\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223"+
		"\u0222\u0001\u0000\u0000\u0000\u0224s\u0001\u0000\u0000\u0000\u0225\u022b"+
		"\u0005J\u0000\u0000\u0226\u0227\u0003v;\u0000\u0227\u0228\u0005>\u0000"+
		"\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0226\u0001\u0000\u0000"+
		"\u0000\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000"+
		"\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u0232\u0001\u0000\u0000"+
		"\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0230\u0003v;\u0000\u022f"+
		"\u0231\u0005>\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u022e"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234"+
		"\u0001\u0000\u0000\u0000\u0234\u0235\u0005K\u0000\u0000\u0235u\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0003`0\u0000\u0237\u0238\u0005?\u0000\u0000"+
		"\u0238\u0239\u0003h4\u0000\u0239w\u0001\u0000\u0000\u0000\u023a\u023c"+
		"\u0003R)\u0000\u023b\u023d\u0003^/\u0000\u023c\u023b\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0005\u001d\u0000\u0000\u023f\u0240\u0003\u001a\r\u0000"+
		"\u0240y\u0001\u0000\u0000\u0000>}\u0083\u008a\u0090\u009c\u00a1\u00ad"+
		"\u00b2\u00b4\u00c1\u00d3\u00d5\u00db\u00df\u00e4\u00ea\u00ed\u00f1\u00f9"+
		"\u0104\u0108\u010b\u0110\u0114\u0117\u011b\u0121\u0125\u012c\u0134\u013e"+
		"\u0146\u014c\u0152\u0158\u015e\u0166\u016a\u018a\u0194\u019d\u01a9\u01b9"+
		"\u01bd\u01c2\u01c6\u01c9\u01d0\u01e2\u01e6\u01e9\u01f3\u01fe\u0208\u0216"+
		"\u021b\u021d\u0223\u022b\u0230\u0232\u023c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}