// Generated from CPrep.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPrepParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IncludeBlock=15, DefineStart=16, 
		WS=17, EscapedNewline=18, Auto=19, Break=20, Case=21, Char=22, Const=23, 
		Continue=24, Default=25, Do=26, Double=27, Else=28, Enum=29, Extern=30, 
		Float=31, For=32, Goto=33, If=34, Inline=35, Int=36, Long=37, Register=38, 
		Restrict=39, Return=40, Short=41, Signed=42, Sizeof=43, Static=44, Struct=45, 
		Switch=46, Typedef=47, Union=48, Unsigned=49, Void=50, Volatile=51, While=52, 
		Alignas=53, Alignof=54, Atomic=55, Bool=56, Complex=57, Generic=58, Imaginary=59, 
		Noreturn=60, StaticAssert=61, ThreadLocal=62, LeftParen=63, RightParen=64, 
		LeftBracket=65, RightBracket=66, LeftBrace=67, RightBrace=68, Less=69, 
		LessEqual=70, Greater=71, GreaterEqual=72, LeftShift=73, RightShift=74, 
		Plus=75, PlusPlus=76, Minus=77, MinusMinus=78, Star=79, Div=80, Mod=81, 
		And=82, Or=83, AndAnd=84, OrOr=85, Caret=86, Not=87, Tilde=88, Question=89, 
		Colon=90, Semi=91, Comma=92, Assign=93, StarAssign=94, DivAssign=95, ModAssign=96, 
		PlusAssign=97, MinusAssign=98, LeftShiftAssign=99, RightShiftAssign=100, 
		AndAssign=101, XorAssign=102, OrAssign=103, Equal=104, NotEqual=105, Arrow=106, 
		Dot=107, Ellipsis=108, Identifier=109, Constant=110, DigitSequence=111, 
		StringLiteral=112, ComplexDefine=113, IncludeDirective=114, AsmBlock=115, 
		LineAfterPreprocessing=116, LineDirective=117, PragmaDirective=118, Whitespace=119, 
		Newline=120, BlockComment=121, LineComment=122;
	public static final int
		RULE_root = 0, RULE_defineDeclaration = 1, RULE_defineBlock = 2, RULE_preprocessorDeclaration = 3, 
		RULE_includeDeclaration = 4, RULE_pragmaDeclaration = 5, RULE_primaryExpression = 6, 
		RULE_genericSelection = 7, RULE_genericAssocList = 8, RULE_genericAssociation = 9, 
		RULE_postfixExpression = 10, RULE_argumentExpressionList = 11, RULE_unaryExpression = 12, 
		RULE_unaryOperator = 13, RULE_castExpression = 14, RULE_multiplicativeExpression = 15, 
		RULE_additiveExpression = 16, RULE_shiftExpression = 17, RULE_relationalExpression = 18, 
		RULE_equalityExpression = 19, RULE_andExpression = 20, RULE_exclusiveOrExpression = 21, 
		RULE_inclusiveOrExpression = 22, RULE_logicalAndExpression = 23, RULE_logicalOrExpression = 24, 
		RULE_conditionalExpression = 25, RULE_assignmentExpression = 26, RULE_assignmentOperator = 27, 
		RULE_expression = 28, RULE_constantExpression = 29, RULE_declaration = 30, 
		RULE_declarationSpecifiers = 31, RULE_declarationSpecifiers2 = 32, RULE_declarationSpecifier = 33, 
		RULE_initDeclaratorList = 34, RULE_initDeclarator = 35, RULE_storageClassSpecifier = 36, 
		RULE_typeSpecifier = 37, RULE_structOrUnionSpecifier = 38, RULE_structOrUnion = 39, 
		RULE_structDeclarationList = 40, RULE_structDeclaration = 41, RULE_specifierQualifierList = 42, 
		RULE_structDeclaratorList = 43, RULE_structDeclarator = 44, RULE_enumSpecifier = 45, 
		RULE_enumeratorList = 46, RULE_enumerator = 47, RULE_enumerationConstant = 48, 
		RULE_atomicTypeSpecifier = 49, RULE_typeQualifier = 50, RULE_functionSpecifier = 51, 
		RULE_alignmentSpecifier = 52, RULE_declarator = 53, RULE_directDeclarator = 54, 
		RULE_gccDeclaratorExtension = 55, RULE_gccAttributeSpecifier = 56, RULE_gccAttributeList = 57, 
		RULE_gccAttribute = 58, RULE_nestedParenthesesBlock = 59, RULE_pointer = 60, 
		RULE_typeQualifierList = 61, RULE_parameterTypeList = 62, RULE_parameterList = 63, 
		RULE_parameterDeclaration = 64, RULE_identifierList = 65, RULE_typeName = 66, 
		RULE_abstractDeclarator = 67, RULE_directAbstractDeclarator = 68, RULE_typedefName = 69, 
		RULE_initializer = 70, RULE_initializerList = 71, RULE_designation = 72, 
		RULE_designatorList = 73, RULE_designator = 74, RULE_staticAssertDeclaration = 75, 
		RULE_statement = 76, RULE_labeledStatement = 77, RULE_compoundStatement = 78, 
		RULE_blockItemList = 79, RULE_blockItem = 80, RULE_expressionStatement = 81, 
		RULE_selectionStatement = 82, RULE_iterationStatement = 83, RULE_forCondition = 84, 
		RULE_forDeclaration = 85, RULE_forExpression = 86, RULE_jumpStatement = 87, 
		RULE_compilationUnit = 88, RULE_translationUnit = 89, RULE_externalDeclaration = 90, 
		RULE_functionDefinition = 91, RULE_declarationList = 92;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "defineDeclaration", "defineBlock", "preprocessorDeclaration", 
			"includeDeclaration", "pragmaDeclaration", "primaryExpression", "genericSelection", 
			"genericAssocList", "genericAssociation", "postfixExpression", "argumentExpressionList", 
			"unaryExpression", "unaryOperator", "castExpression", "multiplicativeExpression", 
			"additiveExpression", "shiftExpression", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "declaration", 
			"declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
			"initDeclaratorList", "initDeclarator", "storageClassSpecifier", "typeSpecifier", 
			"structOrUnionSpecifier", "structOrUnion", "structDeclarationList", "structDeclaration", 
			"specifierQualifierList", "structDeclaratorList", "structDeclarator", 
			"enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant", 
			"atomicTypeSpecifier", "typeQualifier", "functionSpecifier", "alignmentSpecifier", 
			"declarator", "directDeclarator", "gccDeclaratorExtension", "gccAttributeSpecifier", 
			"gccAttributeList", "gccAttribute", "nestedParenthesesBlock", "pointer", 
			"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
			"identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator", 
			"typedefName", "initializer", "initializerList", "designation", "designatorList", 
			"designator", "staticAssertDeclaration", "statement", "labeledStatement", 
			"compoundStatement", "blockItemList", "blockItem", "expressionStatement", 
			"selectionStatement", "iterationStatement", "forCondition", "forDeclaration", 
			"forExpression", "jumpStatement", "compilationUnit", "translationUnit", 
			"externalDeclaration", "functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
			"'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", "'__inline__'", 
			"'__stdcall'", "'__declspec'", "'__asm'", "'__attribute__'", "'__asm__'", 
			"'__volatile__'", null, null, null, null, "'auto'", "'break'", "'case'", 
			"'char'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
			"'enum'", "'extern'", "'float'", "'for'", "'goto'", "'if'", "'inline'", 
			"'int'", "'long'", "'register'", "'restrict'", "'return'", "'short'", 
			"'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", 
			"'union'", "'unsigned'", "'void'", "'volatile'", "'while'", "'_Alignas'", 
			"'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", 
			"'_Noreturn'", "'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", 
			"'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", 
			"'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", 
			"'!='", "'->'", "'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IncludeBlock", "DefineStart", "WS", "EscapedNewline", 
			"Auto", "Break", "Case", "Char", "Const", "Continue", "Default", "Do", 
			"Double", "Else", "Enum", "Extern", "Float", "For", "Goto", "If", "Inline", 
			"Int", "Long", "Register", "Restrict", "Return", "Short", "Signed", "Sizeof", 
			"Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", "Void", 
			"Volatile", "While", "Alignas", "Alignof", "Atomic", "Bool", "Complex", 
			"Generic", "Imaginary", "Noreturn", "StaticAssert", "ThreadLocal", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
			"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
			"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", "Colon", 
			"Semi", "Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", 
			"OrAssign", "Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier", 
			"Constant", "DigitSequence", "StringLiteral", "ComplexDefine", "IncludeDirective", 
			"AsmBlock", "LineAfterPreprocessing", "LineDirective", "PragmaDirective", 
			"Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "CPrep.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPrepParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPrepParser.EOF, 0); }
		public List<DefineDeclarationContext> defineDeclaration() {
			return getRuleContexts(DefineDeclarationContext.class);
		}
		public DefineDeclarationContext defineDeclaration(int i) {
			return getRuleContext(DefineDeclarationContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				defineDeclaration();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DefineStart );
			setState(191);
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

	public static class DefineDeclarationContext extends ParserRuleContext {
		public DefineBlockContext defineBlock() {
			return getRuleContext(DefineBlockContext.class,0);
		}
		public DefineDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDefineDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDefineDeclaration(this);
		}
	}

	public final DefineDeclarationContext defineDeclaration() throws RecognitionException {
		DefineDeclarationContext _localctx = new DefineDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defineDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			defineBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineBlockContext extends ParserRuleContext {
		public TerminalNode DefineStart() { return getToken(CPrepParser.DefineStart, 0); }
		public List<TerminalNode> Whitespace() { return getTokens(CPrepParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(CPrepParser.Whitespace, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CPrepParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CPrepParser.Identifier, i);
		}
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public List<TerminalNode> LeftBrace() { return getTokens(CPrepParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(CPrepParser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(CPrepParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(CPrepParser.RightBrace, i);
		}
		public List<TerminalNode> WS() { return getTokens(CPrepParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CPrepParser.WS, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public DefineBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDefineBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDefineBlock(this);
		}
	}

	public final DefineBlockContext defineBlock() throws RecognitionException {
		DefineBlockContext _localctx = new DefineBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defineBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(DefineStart);
			setState(196);
			match(Whitespace);
			setState(197);
			match(Identifier);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(198);
				match(WS);
				}
			}

			setState(201);
			match(LeftParen);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==Identifier) {
				{
				{
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(202);
					match(WS);
					}
				}

				setState(205);
				match(Identifier);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(206);
					match(Comma);
					}
				}

				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(209);
					match(WS);
					}
					break;
				}
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(RightParen);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Whitespace) {
				{
				setState(218);
				match(Whitespace);
				}
			}

			setState(221);
			match(LeftBrace);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(222);
				match(WS);
				}
				break;
			}
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(225);
				match(WS);
				}
			}

			setState(228);
			match(LeftBrace);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==Identifier) {
				{
				{
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(229);
					match(WS);
					}
				}

				setState(232);
				match(Identifier);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(233);
					match(Comma);
					}
				}

				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(236);
					match(WS);
					}
					break;
				}
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(RightBrace);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(245);
				match(Comma);
				}
			}

			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(248);
				match(WS);
				}
				break;
			}
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(251);
				match(WS);
				}
			}

			setState(254);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreprocessorDeclarationContext extends ParserRuleContext {
		public IncludeDeclarationContext includeDeclaration() {
			return getRuleContext(IncludeDeclarationContext.class,0);
		}
		public DefineDeclarationContext defineDeclaration() {
			return getRuleContext(DefineDeclarationContext.class,0);
		}
		public PragmaDeclarationContext pragmaDeclaration() {
			return getRuleContext(PragmaDeclarationContext.class,0);
		}
		public PreprocessorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterPreprocessorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitPreprocessorDeclaration(this);
		}
	}

	public final PreprocessorDeclarationContext preprocessorDeclaration() throws RecognitionException {
		PreprocessorDeclarationContext _localctx = new PreprocessorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_preprocessorDeclaration);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncludeBlock:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				includeDeclaration();
				}
				break;
			case DefineStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				defineDeclaration();
				}
				break;
			case PragmaDirective:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				pragmaDeclaration();
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

	public static class IncludeDeclarationContext extends ParserRuleContext {
		public TerminalNode IncludeBlock() { return getToken(CPrepParser.IncludeBlock, 0); }
		public IncludeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterIncludeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitIncludeDeclaration(this);
		}
	}

	public final IncludeDeclarationContext includeDeclaration() throws RecognitionException {
		IncludeDeclarationContext _localctx = new IncludeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_includeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IncludeBlock);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaDeclarationContext extends ParserRuleContext {
		public TerminalNode PragmaDirective() { return getToken(CPrepParser.PragmaDirective, 0); }
		public PragmaDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterPragmaDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitPragmaDeclaration(this);
		}
	}

	public final PragmaDeclarationContext pragmaDeclaration() throws RecognitionException {
		PragmaDeclarationContext _localctx = new PragmaDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pragmaDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(PragmaDirective);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CPrepParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CPrepParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CPrepParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPrepParser.Comma, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PreprocessorDeclarationContext preprocessorDeclaration() {
			return getRuleContext(PreprocessorDeclarationContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primaryExpression);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(Constant);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(267);
					match(StringLiteral);
					}
					}
					setState(270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(LeftParen);
				setState(273);
				expression();
				setState(274);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(277);
					match(T__0);
					}
				}

				setState(280);
				match(LeftParen);
				setState(281);
				compoundStatement();
				setState(282);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				match(T__1);
				setState(285);
				match(LeftParen);
				setState(286);
				unaryExpression();
				setState(287);
				match(Comma);
				setState(288);
				typeName();
				setState(289);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(291);
				match(T__2);
				setState(292);
				match(LeftParen);
				setState(293);
				typeName();
				setState(294);
				match(Comma);
				setState(295);
				unaryExpression();
				setState(296);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(298);
				preprocessorDeclaration();
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

	public static class GenericSelectionContext extends ParserRuleContext {
		public TerminalNode Generic() { return getToken(CPrepParser.Generic, 0); }
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPrepParser.Comma, 0); }
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterGenericSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitGenericSelection(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(Generic);
			setState(302);
			match(LeftParen);
			setState(303);
			assignmentExpression();
			setState(304);
			match(Comma);
			setState(305);
			genericAssocList();
			setState(306);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericAssocListContext extends ParserRuleContext {
		public List<GenericAssociationContext> genericAssociation() {
			return getRuleContexts(GenericAssociationContext.class);
		}
		public GenericAssociationContext genericAssociation(int i) {
			return getRuleContext(GenericAssociationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterGenericAssocList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitGenericAssocList(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_genericAssocList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			genericAssociation();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(309);
				match(Comma);
				setState(310);
				genericAssociation();
				}
				}
				setState(315);
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

	public static class GenericAssociationContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPrepParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPrepParser.Default, 0); }
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterGenericAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitGenericAssociation(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_genericAssociation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				{
				setState(316);
				typeName();
				}
				break;
			case Default:
				{
				setState(317);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(320);
			match(Colon);
			setState(321);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(CPrepParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CPrepParser.LeftParen, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CPrepParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CPrepParser.RightParen, i);
		}
		public TerminalNode LeftBrace() { return getToken(CPrepParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPrepParser.RightBrace, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(CPrepParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPrepParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPrepParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPrepParser.RightBracket, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CPrepParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CPrepParser.Identifier, i);
		}
		public List<TerminalNode> Dot() { return getTokens(CPrepParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(CPrepParser.Dot, i);
		}
		public List<TerminalNode> Arrow() { return getTokens(CPrepParser.Arrow); }
		public TerminalNode Arrow(int i) {
			return getToken(CPrepParser.Arrow, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(CPrepParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(CPrepParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(CPrepParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(CPrepParser.MinusMinus, i);
		}
		public TerminalNode Comma() { return getToken(CPrepParser.Comma, 0); }
		public List<ArgumentExpressionListContext> argumentExpressionList() {
			return getRuleContexts(ArgumentExpressionListContext.class);
		}
		public ArgumentExpressionListContext argumentExpressionList(int i) {
			return getRuleContext(ArgumentExpressionListContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(323);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(324);
					match(T__0);
					}
				}

				setState(327);
				match(LeftParen);
				setState(328);
				typeName();
				setState(329);
				match(RightParen);
				setState(330);
				match(LeftBrace);
				setState(331);
				initializerList();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(332);
					match(Comma);
					}
				}

				setState(335);
				match(RightBrace);
				}
				break;
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (LeftBracket - 63)) | (1L << (PlusPlus - 63)) | (1L << (MinusMinus - 63)) | (1L << (Arrow - 63)) | (1L << (Dot - 63)))) != 0)) {
				{
				setState(351);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBracket:
					{
					setState(339);
					match(LeftBracket);
					setState(340);
					expression();
					setState(341);
					match(RightBracket);
					}
					break;
				case LeftParen:
					{
					setState(343);
					match(LeftParen);
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
						{
						setState(344);
						argumentExpressionList();
						}
					}

					setState(347);
					match(RightParen);
					}
					break;
				case Arrow:
				case Dot:
					{
					setState(348);
					_la = _input.LA(1);
					if ( !(_la==Arrow || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(349);
					match(Identifier);
					}
					break;
				case PlusPlus:
				case MinusMinus:
					{
					setState(350);
					_la = _input.LA(1);
					if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(355);
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitArgumentExpressionList(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			assignmentExpression();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(357);
				match(Comma);
				setState(358);
				assignmentExpression();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public TerminalNode AndAnd() { return getToken(CPrepParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public List<TerminalNode> Sizeof() { return getTokens(CPrepParser.Sizeof); }
		public TerminalNode Sizeof(int i) {
			return getToken(CPrepParser.Sizeof, i);
		}
		public TerminalNode Alignof() { return getToken(CPrepParser.Alignof, 0); }
		public List<TerminalNode> PlusPlus() { return getTokens(CPrepParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(CPrepParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(CPrepParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(CPrepParser.MinusMinus, i);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(364);
					_la = _input.LA(1);
					if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (Sizeof - 43)) | (1L << (PlusPlus - 43)) | (1L << (MinusMinus - 43)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case IncludeBlock:
			case DefineStart:
			case Generic:
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
			case PragmaDirective:
				{
				setState(370);
				postfixExpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
				{
				setState(371);
				unaryOperator();
				setState(372);
				castExpression();
				}
				break;
			case Sizeof:
			case Alignof:
				{
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==Sizeof || _la==Alignof) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(375);
				match(LeftParen);
				setState(376);
				typeName();
				setState(377);
				match(RightParen);
				}
				break;
			case AndAnd:
				{
				setState(379);
				match(AndAnd);
				setState(380);
				match(Identifier);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPrepParser.And, 0); }
		public TerminalNode Star() { return getToken(CPrepParser.Star, 0); }
		public TerminalNode Plus() { return getToken(CPrepParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CPrepParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(CPrepParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CPrepParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (Minus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)))) != 0)) ) {
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CPrepParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_castExpression);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(385);
					match(T__0);
					}
				}

				setState(388);
				match(LeftParen);
				setState(389);
				typeName();
				setState(390);
				match(RightParen);
				setState(391);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(DigitSequence);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(CPrepParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(CPrepParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(CPrepParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(CPrepParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(CPrepParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(CPrepParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			castExpression();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Star - 79)) | (1L << (Div - 79)) | (1L << (Mod - 79)))) != 0)) {
				{
				{
				setState(398);
				_la = _input.LA(1);
				if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Star - 79)) | (1L << (Div - 79)) | (1L << (Mod - 79)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(399);
				castExpression();
				}
				}
				setState(404);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(CPrepParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(CPrepParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(CPrepParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(CPrepParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			multiplicativeExpression();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(407);
				multiplicativeExpression();
				}
				}
				setState(412);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LeftShift() { return getTokens(CPrepParser.LeftShift); }
		public TerminalNode LeftShift(int i) {
			return getToken(CPrepParser.LeftShift, i);
		}
		public List<TerminalNode> RightShift() { return getTokens(CPrepParser.RightShift); }
		public TerminalNode RightShift(int i) {
			return getToken(CPrepParser.RightShift, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			additiveExpression();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftShift || _la==RightShift) {
				{
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==LeftShift || _la==RightShift) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(415);
				additiveExpression();
				}
				}
				setState(420);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(CPrepParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(CPrepParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(CPrepParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPrepParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(CPrepParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(CPrepParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(CPrepParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(CPrepParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			shiftExpression();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Less - 69)) | (1L << (LessEqual - 69)) | (1L << (Greater - 69)) | (1L << (GreaterEqual - 69)))) != 0)) {
				{
				{
				setState(422);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Less - 69)) | (1L << (LessEqual - 69)) | (1L << (Greater - 69)) | (1L << (GreaterEqual - 69)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(423);
				shiftExpression();
				}
				}
				setState(428);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(CPrepParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(CPrepParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(CPrepParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(CPrepParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			relationalExpression();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(430);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(431);
				relationalExpression();
				}
				}
				setState(436);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(CPrepParser.And); }
		public TerminalNode And(int i) {
			return getToken(CPrepParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			equalityExpression();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(438);
				match(And);
				setState(439);
				equalityExpression();
				}
				}
				setState(444);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(CPrepParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(CPrepParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			andExpression();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(446);
				match(Caret);
				setState(447);
				andExpression();
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(CPrepParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(CPrepParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			exclusiveOrExpression();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(454);
				match(Or);
				setState(455);
				exclusiveOrExpression();
				}
				}
				setState(460);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(CPrepParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(CPrepParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			inclusiveOrExpression();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(462);
				match(AndAnd);
				setState(463);
				inclusiveOrExpression();
				}
				}
				setState(468);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(CPrepParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(CPrepParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			logicalAndExpression();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(470);
				match(OrOr);
				setState(471);
				logicalAndExpression();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CPrepParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPrepParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			logicalOrExpression();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(478);
				match(Question);
				setState(479);
				expression();
				setState(480);
				match(Colon);
				setState(481);
				conditionalExpression();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CPrepParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignmentExpression);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				unaryExpression();
				setState(487);
				assignmentOperator();
				setState(488);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(DigitSequence);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CPrepParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CPrepParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CPrepParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CPrepParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CPrepParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CPrepParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPrepParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPrepParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CPrepParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CPrepParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CPrepParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Assign - 93)) | (1L << (StarAssign - 93)) | (1L << (DivAssign - 93)) | (1L << (ModAssign - 93)) | (1L << (PlusAssign - 93)) | (1L << (MinusAssign - 93)) | (1L << (LeftShiftAssign - 93)) | (1L << (RightShiftAssign - 93)) | (1L << (AndAssign - 93)) | (1L << (XorAssign - 93)) | (1L << (OrAssign - 93)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			assignmentExpression();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(496);
				match(Comma);
				setState(497);
				assignmentExpression();
				}
				}
				setState(502);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
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
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPrepParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declaration);
		int _la;
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__11:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case ThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				declarationSpecifiers();
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (Star - 63)) | (1L << (Caret - 63)) | (1L << (Identifier - 63)))) != 0)) {
					{
					setState(506);
					initDeclaratorList();
					}
				}

				setState(509);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				staticAssertDeclaration();
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDeclarationSpecifiers(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(514);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(517); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDeclarationSpecifiers2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDeclarationSpecifiers2(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(519);
				declarationSpecifier();
				}
				}
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDeclarationSpecifier(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declarationSpecifier);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				typeSpecifier(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(527);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				alignmentSpecifier();
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			initDeclarator();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(532);
				match(Comma);
				setState(533);
				initDeclarator();
				}
				}
				setState(538);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPrepParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			declarator();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(540);
				match(Assign);
				setState(541);
				initializer();
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(CPrepParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(CPrepParser.Extern, 0); }
		public TerminalNode Static() { return getToken(CPrepParser.Static, 0); }
		public TerminalNode ThreadLocal() { return getToken(CPrepParser.ThreadLocal, 0); }
		public TerminalNode Auto() { return getToken(CPrepParser.Auto, 0); }
		public TerminalNode Register() { return getToken(CPrepParser.Register, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitStorageClassSpecifier(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(CPrepParser.Void, 0); }
		public TerminalNode Char() { return getToken(CPrepParser.Char, 0); }
		public TerminalNode Short() { return getToken(CPrepParser.Short, 0); }
		public TerminalNode Int() { return getToken(CPrepParser.Int, 0); }
		public TerminalNode Long() { return getToken(CPrepParser.Long, 0); }
		public TerminalNode Float() { return getToken(CPrepParser.Float, 0); }
		public TerminalNode Double() { return getToken(CPrepParser.Double, 0); }
		public TerminalNode Signed() { return getToken(CPrepParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CPrepParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(CPrepParser.Bool, 0); }
		public TerminalNode Complex() { return getToken(CPrepParser.Complex, 0); }
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				{
				setState(547);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__0:
				{
				setState(548);
				match(T__0);
				setState(549);
				match(LeftParen);
				setState(550);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(551);
				match(RightParen);
				}
				break;
			case Atomic:
				{
				setState(552);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				{
				setState(553);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				setState(554);
				enumSpecifier();
				}
				break;
			case Identifier:
				{
				setState(555);
				typedefName();
				}
				break;
			case T__6:
				{
				setState(556);
				match(T__6);
				setState(557);
				match(LeftParen);
				setState(558);
				constantExpression();
				setState(559);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(563);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(564);
					pointer();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPrepParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPrepParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitStructOrUnionSpecifier(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				structOrUnion();
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(571);
					match(Identifier);
					}
				}

				setState(574);
				match(LeftBrace);
				setState(575);
				structDeclarationList();
				setState(576);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				structOrUnion();
				setState(579);
				match(Identifier);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(CPrepParser.Struct, 0); }
		public TerminalNode Union() { return getToken(CPrepParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterStructOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitStructOrUnion(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitStructDeclarationList(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(585);
				structDeclaration();
				}
				}
				setState(588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << StaticAssert))) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPrepParser.Semi, 0); }
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_structDeclaration);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				specifierQualifierList();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (Star - 63)) | (1L << (Caret - 63)) | (1L << (Colon - 63)) | (1L << (Identifier - 63)))) != 0)) {
					{
					setState(591);
					structDeclaratorList();
					}
				}

				setState(594);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				staticAssertDeclaration();
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitSpecifierQualifierList(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(599);
				typeSpecifier(0);
				}
				break;
			case 2:
				{
				setState(600);
				typeQualifier();
				}
				break;
			}
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(603);
				specifierQualifierList();
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitStructDeclaratorList(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			structDeclarator();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(607);
				match(Comma);
				setState(608);
				structDeclarator();
				}
				}
				setState(613);
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPrepParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitStructDeclarator(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_structDeclarator);
		int _la;
		try {
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (Star - 63)) | (1L << (Caret - 63)) | (1L << (Identifier - 63)))) != 0)) {
					{
					setState(615);
					declarator();
					}
				}

				setState(618);
				match(Colon);
				setState(619);
				constantExpression();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPrepParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(CPrepParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPrepParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(CPrepParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitEnumSpecifier(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_enumSpecifier);
		int _la;
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(Enum);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(623);
					match(Identifier);
					}
				}

				setState(626);
				match(LeftBrace);
				setState(627);
				enumeratorList();
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(628);
					match(Comma);
					}
				}

				setState(631);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(Enum);
				setState(634);
				match(Identifier);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitEnumeratorList(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			enumerator();
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(638);
					match(Comma);
					setState(639);
					enumerator();
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPrepParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			enumerationConstant();
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(646);
				match(Assign);
				setState(647);
				constantExpression();
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitEnumerationConstant(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(CPrepParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterAtomicTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitAtomicTypeSpecifier(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(Atomic);
			setState(653);
			match(LeftParen);
			setState(654);
			typeName();
			setState(655);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CPrepParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(CPrepParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(CPrepParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(CPrepParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitTypeQualifier(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CPrepParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(CPrepParser.Noreturn, 0); }
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitFunctionSpecifier(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_functionSpecifier);
		int _la;
		try {
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				gccAttributeSpecifier();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				match(T__9);
				setState(662);
				match(LeftParen);
				setState(663);
				match(Identifier);
				setState(664);
				match(RightParen);
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

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CPrepParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterAlignmentSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitAlignmentSpecifier(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_alignmentSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(Alignas);
			setState(668);
			match(LeftParen);
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(669);
				typeName();
				}
				break;
			case 2:
				{
				setState(670);
				constantExpression();
				}
				break;
			}
			setState(673);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(675);
				pointer();
				}
			}

			setState(678);
			directDeclarator(0);
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(679);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(CPrepParser.Colon, 0); }
		public TerminalNode DigitSequence() { return getToken(CPrepParser.DigitSequence, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPrepParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPrepParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CPrepParser.Static, 0); }
		public TerminalNode Star() { return getToken(CPrepParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDirectDeclarator(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(686);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(687);
				match(LeftParen);
				setState(688);
				declarator();
				setState(689);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(691);
				match(Identifier);
				setState(692);
				match(Colon);
				setState(693);
				match(DigitSequence);
				}
				break;
			case 4:
				{
				setState(694);
				match(LeftParen);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Char) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
					{
					setState(695);
					typeSpecifier(0);
					}
				}

				setState(698);
				pointer();
				setState(699);
				directDeclarator(0);
				setState(700);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(747);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(704);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(705);
						match(LeftBracket);
						setState(707);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(706);
							typeQualifierList();
							}
						}

						setState(710);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
							{
							setState(709);
							assignmentExpression();
							}
						}

						setState(712);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(713);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(714);
						match(LeftBracket);
						setState(715);
						match(Static);
						setState(717);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(716);
							typeQualifierList();
							}
						}

						setState(719);
						assignmentExpression();
						setState(720);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(722);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(723);
						match(LeftBracket);
						setState(724);
						typeQualifierList();
						setState(725);
						match(Static);
						setState(726);
						assignmentExpression();
						setState(727);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(729);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(730);
						match(LeftBracket);
						setState(732);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(731);
							typeQualifierList();
							}
						}

						setState(734);
						match(Star);
						setState(735);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(736);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(737);
						match(LeftParen);
						setState(738);
						parameterTypeList();
						setState(739);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(741);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(742);
						match(LeftParen);
						setState(744);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(743);
							identifierList();
							}
						}

						setState(746);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CPrepParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CPrepParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterGccDeclaratorExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitGccDeclaratorExtension(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				match(T__10);
				setState(753);
				match(LeftParen);
				setState(755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(754);
					match(StringLiteral);
					}
					}
					setState(757); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(759);
				match(RightParen);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				gccAttributeSpecifier();
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

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CPrepParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CPrepParser.LeftParen, i);
		}
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CPrepParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CPrepParser.RightParen, i);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterGccAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitGccAttributeSpecifier(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(T__11);
			setState(764);
			match(LeftParen);
			setState(765);
			match(LeftParen);
			setState(766);
			gccAttributeList();
			setState(767);
			match(RightParen);
			setState(768);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterGccAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitGccAttributeList(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_gccAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << WS) | (1L << EscapedNewline) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (RightBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (RightBrace - 65)) | (1L << (Less - 65)) | (1L << (LessEqual - 65)) | (1L << (Greater - 65)) | (1L << (GreaterEqual - 65)) | (1L << (LeftShift - 65)) | (1L << (RightShift - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (Div - 65)) | (1L << (Mod - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (AndAnd - 65)) | (1L << (OrOr - 65)) | (1L << (Caret - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Question - 65)) | (1L << (Colon - 65)) | (1L << (Semi - 65)) | (1L << (Assign - 65)) | (1L << (StarAssign - 65)) | (1L << (DivAssign - 65)) | (1L << (ModAssign - 65)) | (1L << (PlusAssign - 65)) | (1L << (MinusAssign - 65)) | (1L << (LeftShiftAssign - 65)) | (1L << (RightShiftAssign - 65)) | (1L << (AndAssign - 65)) | (1L << (XorAssign - 65)) | (1L << (OrAssign - 65)) | (1L << (Equal - 65)) | (1L << (NotEqual - 65)) | (1L << (Arrow - 65)) | (1L << (Dot - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)) | (1L << (ComplexDefine - 65)) | (1L << (IncludeDirective - 65)) | (1L << (AsmBlock - 65)) | (1L << (LineAfterPreprocessing - 65)) | (1L << (LineDirective - 65)) | (1L << (PragmaDirective - 65)) | (1L << (Whitespace - 65)) | (1L << (Newline - 65)) | (1L << (BlockComment - 65)) | (1L << (LineComment - 65)))) != 0)) {
				{
				setState(770);
				gccAttribute();
				}
			}

			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(773);
				match(Comma);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << WS) | (1L << EscapedNewline) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (RightBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (RightBrace - 65)) | (1L << (Less - 65)) | (1L << (LessEqual - 65)) | (1L << (Greater - 65)) | (1L << (GreaterEqual - 65)) | (1L << (LeftShift - 65)) | (1L << (RightShift - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (Div - 65)) | (1L << (Mod - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (AndAnd - 65)) | (1L << (OrOr - 65)) | (1L << (Caret - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Question - 65)) | (1L << (Colon - 65)) | (1L << (Semi - 65)) | (1L << (Assign - 65)) | (1L << (StarAssign - 65)) | (1L << (DivAssign - 65)) | (1L << (ModAssign - 65)) | (1L << (PlusAssign - 65)) | (1L << (MinusAssign - 65)) | (1L << (LeftShiftAssign - 65)) | (1L << (RightShiftAssign - 65)) | (1L << (AndAssign - 65)) | (1L << (XorAssign - 65)) | (1L << (OrAssign - 65)) | (1L << (Equal - 65)) | (1L << (NotEqual - 65)) | (1L << (Arrow - 65)) | (1L << (Dot - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)) | (1L << (ComplexDefine - 65)) | (1L << (IncludeDirective - 65)) | (1L << (AsmBlock - 65)) | (1L << (LineAfterPreprocessing - 65)) | (1L << (LineDirective - 65)) | (1L << (PragmaDirective - 65)) | (1L << (Whitespace - 65)) | (1L << (Newline - 65)) | (1L << (BlockComment - 65)) | (1L << (LineComment - 65)))) != 0)) {
					{
					setState(774);
					gccAttribute();
					}
				}

				}
				}
				setState(781);
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

	public static class GccAttributeContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(CPrepParser.Comma, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(CPrepParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CPrepParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CPrepParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CPrepParser.RightParen, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterGccAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitGccAttribute(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_gccAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (RightParen - 63)) | (1L << (Comma - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(783);
				match(LeftParen);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
					{
					setState(784);
					argumentExpressionList();
					}
				}

				setState(787);
				match(RightParen);
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

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CPrepParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CPrepParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CPrepParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CPrepParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitNestedParenthesesBlock(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << WS) | (1L << EscapedNewline) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (RightBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (RightBrace - 65)) | (1L << (Less - 65)) | (1L << (LessEqual - 65)) | (1L << (Greater - 65)) | (1L << (GreaterEqual - 65)) | (1L << (LeftShift - 65)) | (1L << (RightShift - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (Div - 65)) | (1L << (Mod - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (AndAnd - 65)) | (1L << (OrOr - 65)) | (1L << (Caret - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Question - 65)) | (1L << (Colon - 65)) | (1L << (Semi - 65)) | (1L << (Comma - 65)) | (1L << (Assign - 65)) | (1L << (StarAssign - 65)) | (1L << (DivAssign - 65)) | (1L << (ModAssign - 65)) | (1L << (PlusAssign - 65)) | (1L << (MinusAssign - 65)) | (1L << (LeftShiftAssign - 65)) | (1L << (RightShiftAssign - 65)) | (1L << (AndAssign - 65)) | (1L << (XorAssign - 65)) | (1L << (OrAssign - 65)) | (1L << (Equal - 65)) | (1L << (NotEqual - 65)) | (1L << (Arrow - 65)) | (1L << (Dot - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)) | (1L << (ComplexDefine - 65)) | (1L << (IncludeDirective - 65)) | (1L << (AsmBlock - 65)) | (1L << (LineAfterPreprocessing - 65)) | (1L << (LineDirective - 65)) | (1L << (PragmaDirective - 65)) | (1L << (Whitespace - 65)) | (1L << (Newline - 65)) | (1L << (BlockComment - 65)) | (1L << (LineComment - 65)))) != 0)) {
				{
				setState(795);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case IncludeBlock:
				case DefineStart:
				case WS:
				case EscapedNewline:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case ComplexDefine:
				case IncludeDirective:
				case AsmBlock:
				case LineAfterPreprocessing:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(790);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(791);
					match(LeftParen);
					setState(792);
					nestedParenthesesBlock();
					setState(793);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(799);
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

	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> Star() { return getTokens(CPrepParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(CPrepParser.Star, i);
		}
		public List<TerminalNode> Caret() { return getTokens(CPrepParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(CPrepParser.Caret, i);
		}
		public List<TypeQualifierListContext> typeQualifierList() {
			return getRuleContexts(TypeQualifierListContext.class);
		}
		public TypeQualifierListContext typeQualifierList(int i) {
			return getRuleContext(TypeQualifierListContext.class,i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_pointer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(800);
					_la = _input.LA(1);
					if ( !(_la==Star || _la==Caret) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(802);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(801);
						typeQualifierList();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(806); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitTypeQualifierList(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_typeQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(809); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(808);
					typeQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(811); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPrepParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(CPrepParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitParameterTypeList(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			parameterList();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(814);
				match(Comma);
				setState(815);
				match(Ellipsis);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			parameterDeclaration();
			setState(823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(819);
					match(Comma);
					setState(820);
					parameterDeclaration();
					}
					} 
				}
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_parameterDeclaration);
		int _la;
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				declarationSpecifiers();
				setState(827);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				declarationSpecifiers2();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (LeftBracket - 63)) | (1L << (Star - 63)) | (1L << (Caret - 63)))) != 0)) {
					{
					setState(830);
					abstractDeclarator();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(CPrepParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CPrepParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(Identifier);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(836);
				match(Comma);
				setState(837);
				match(Identifier);
				}
				}
				setState(842);
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

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			specifierQualifierList();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (LeftBracket - 63)) | (1L << (Star - 63)) | (1L << (Caret - 63)))) != 0)) {
				{
				setState(844);
				abstractDeclarator();
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitAbstractDeclarator(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_abstractDeclarator);
		int _la;
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(848);
					pointer();
					}
				}

				setState(851);
				directAbstractDeclarator(0);
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10 || _la==T__11) {
					{
					{
					setState(852);
					gccDeclaratorExtension();
					}
					}
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public TerminalNode LeftBracket() { return getToken(CPrepParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPrepParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CPrepParser.Static, 0); }
		public TerminalNode Star() { return getToken(CPrepParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDirectAbstractDeclarator(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(861);
				match(LeftParen);
				setState(862);
				abstractDeclarator();
				setState(863);
				match(RightParen);
				setState(867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(864);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(869);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(870);
				match(LeftBracket);
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(871);
					typeQualifierList();
					}
				}

				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
					{
					setState(874);
					assignmentExpression();
					}
				}

				setState(877);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(878);
				match(LeftBracket);
				setState(879);
				match(Static);
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(880);
					typeQualifierList();
					}
				}

				setState(883);
				assignmentExpression();
				setState(884);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(886);
				match(LeftBracket);
				setState(887);
				typeQualifierList();
				setState(888);
				match(Static);
				setState(889);
				assignmentExpression();
				setState(890);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(892);
				match(LeftBracket);
				setState(893);
				match(Star);
				setState(894);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(895);
				match(LeftParen);
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
					{
					setState(896);
					parameterTypeList();
					}
				}

				setState(899);
				match(RightParen);
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(900);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(905);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(951);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(949);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(908);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(909);
						match(LeftBracket);
						setState(911);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(910);
							typeQualifierList();
							}
						}

						setState(914);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
							{
							setState(913);
							assignmentExpression();
							}
						}

						setState(916);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(917);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(918);
						match(LeftBracket);
						setState(919);
						match(Static);
						setState(921);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(920);
							typeQualifierList();
							}
						}

						setState(923);
						assignmentExpression();
						setState(924);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(926);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(927);
						match(LeftBracket);
						setState(928);
						typeQualifierList();
						setState(929);
						match(Static);
						setState(930);
						assignmentExpression();
						setState(931);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(933);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(934);
						match(LeftBracket);
						setState(935);
						match(Star);
						setState(936);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(937);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(938);
						match(LeftParen);
						setState(940);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(939);
							parameterTypeList();
							}
						}

						setState(942);
						match(RightParen);
						setState(946);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(943);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(948);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(953);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitTypedefName(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPrepParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPrepParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CPrepParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_initializer);
		int _la;
		try {
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case IncludeBlock:
			case DefineStart:
			case Sizeof:
			case Alignof:
			case Generic:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case AndAnd:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
			case PragmaDirective:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				match(LeftBrace);
				setState(958);
				initializerList();
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(959);
					match(Comma);
					}
				}

				setState(962);
				match(RightBrace);
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

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitInitializerList(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(966);
				designation();
				}
			}

			setState(969);
			initializer();
			setState(977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(970);
					match(Comma);
					setState(972);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(971);
						designation();
						}
					}

					setState(974);
					initializer();
					}
					} 
				}
				setState(979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPrepParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDesignation(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			designatorList();
			setState(981);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorListContext extends ParserRuleContext {
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDesignatorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDesignatorList(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(983);
				designator();
				}
				}
				setState(986); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket || _la==Dot );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CPrepParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CPrepParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CPrepParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_designator);
		try {
			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				match(LeftBracket);
				setState(989);
				constantExpression();
				setState(990);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				match(Dot);
				setState(993);
				match(Identifier);
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

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(CPrepParser.StaticAssert, 0); }
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPrepParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CPrepParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CPrepParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CPrepParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitStaticAssertDeclaration(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(StaticAssert);
			setState(997);
			match(LeftParen);
			setState(998);
			constantExpression();
			setState(999);
			match(Comma);
			setState(1001); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1000);
				match(StringLiteral);
				}
				}
				setState(1003); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1005);
			match(RightParen);
			setState(1006);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
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
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CPrepParser.Semi, 0); }
		public TerminalNode Volatile() { return getToken(CPrepParser.Volatile, 0); }
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(CPrepParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(CPrepParser.Colon, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_statement);
		int _la;
		try {
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1011);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1012);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1013);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1014);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1015);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1016);
				match(LeftParen);
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
					{
					setState(1017);
					logicalOrExpression();
					setState(1022);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1018);
						match(Comma);
						setState(1019);
						logicalOrExpression();
						}
						}
						setState(1024);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1027);
					match(Colon);
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
						{
						setState(1028);
						logicalOrExpression();
						setState(1033);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1029);
							match(Comma);
							setState(1030);
							logicalOrExpression();
							}
							}
							setState(1035);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1042);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1043);
				match(RightParen);
				setState(1044);
				match(Semi);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CPrepParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(CPrepParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPrepParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_labeledStatement);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				match(Identifier);
				setState(1048);
				match(Colon);
				setState(1049);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				match(Case);
				setState(1051);
				constantExpression();
				setState(1052);
				match(Colon);
				setState(1053);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				match(Default);
				setState(1056);
				match(Colon);
				setState(1057);
				statement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CPrepParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPrepParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(LeftBrace);
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Semi - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)) | (1L << (PragmaDirective - 67)))) != 0)) {
				{
				setState(1061);
				blockItemList();
				}
			}

			setState(1064);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitBlockItemList(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1066);
				blockItem();
				}
				}
				setState(1069); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (AndAnd - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Semi - 67)) | (1L << (Identifier - 67)) | (1L << (Constant - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)) | (1L << (PragmaDirective - 67)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitBlockItem(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_blockItem);
		try {
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				declaration();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPrepParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
				{
				setState(1075);
				expression();
				}
			}

			setState(1078);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CPrepParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CPrepParser.Else, 0); }
		public TerminalNode Switch() { return getToken(CPrepParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_selectionStatement);
		try {
			setState(1095);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				match(If);
				setState(1081);
				match(LeftParen);
				setState(1082);
				expression();
				setState(1083);
				match(RightParen);
				setState(1084);
				statement();
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1085);
					match(Else);
					setState(1086);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				match(Switch);
				setState(1090);
				match(LeftParen);
				setState(1091);
				expression();
				setState(1092);
				match(RightParen);
				setState(1093);
				statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPrepParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CPrepParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPrepParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CPrepParser.Do, 0); }
		public TerminalNode Semi() { return getToken(CPrepParser.Semi, 0); }
		public TerminalNode For() { return getToken(CPrepParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_iterationStatement);
		try {
			setState(1117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				match(While);
				setState(1098);
				match(LeftParen);
				setState(1099);
				expression();
				setState(1100);
				match(RightParen);
				setState(1101);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				match(Do);
				setState(1104);
				statement();
				setState(1105);
				match(While);
				setState(1106);
				match(LeftParen);
				setState(1107);
				expression();
				setState(1108);
				match(RightParen);
				setState(1109);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1111);
				match(For);
				setState(1112);
				match(LeftParen);
				setState(1113);
				forCondition();
				setState(1114);
				match(RightParen);
				setState(1115);
				statement();
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

	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(CPrepParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CPrepParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitForCondition(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1119);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
					{
					setState(1120);
					expression();
					}
				}

				}
				break;
			}
			setState(1125);
			match(Semi);
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
				{
				setState(1126);
				forExpression();
				}
			}

			setState(1129);
			match(Semi);
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
				{
				setState(1130);
				forExpression();
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

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitForDeclaration(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			declarationSpecifiers();
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftParen - 63)) | (1L << (Star - 63)) | (1L << (Caret - 63)) | (1L << (Identifier - 63)))) != 0)) {
				{
				setState(1134);
				initDeclaratorList();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CPrepParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CPrepParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitForExpression(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			assignmentExpression();
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1138);
				match(Comma);
				setState(1139);
				assignmentExpression();
				}
				}
				setState(1144);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPrepParser.Semi, 0); }
		public TerminalNode Goto() { return getToken(CPrepParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CPrepParser.Identifier, 0); }
		public TerminalNode Return() { return getToken(CPrepParser.Return, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Continue() { return getToken(CPrepParser.Continue, 0); }
		public TerminalNode Break() { return getToken(CPrepParser.Break, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1145);
				match(Goto);
				setState(1146);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1147);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(1148);
				match(Return);
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << IncludeBlock) | (1L << DefineStart) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (PlusPlus - 75)) | (1L << (Minus - 75)) | (1L << (MinusMinus - 75)) | (1L << (Star - 75)) | (1L << (And - 75)) | (1L << (AndAnd - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)) | (1L << (Identifier - 75)) | (1L << (Constant - 75)) | (1L << (DigitSequence - 75)) | (1L << (StringLiteral - 75)) | (1L << (PragmaDirective - 75)))) != 0)) {
					{
					setState(1149);
					expression();
					}
				}

				}
				break;
			case 4:
				{
				setState(1152);
				match(Goto);
				setState(1153);
				unaryExpression();
				}
				break;
			}
			setState(1156);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPrepParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Star - 79)) | (1L << (Caret - 79)) | (1L << (Semi - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(1158);
				translationUnit();
				}
			}

			setState(1161);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1163);
				externalDeclaration();
				}
				}
				setState(1166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Star - 79)) | (1L << (Caret - 79)) | (1L << (Semi - 79)) | (1L << (Identifier - 79)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPrepParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitExternalDeclaration(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_externalDeclaration);
		try {
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1170);
				match(Semi);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1173);
				declarationSpecifiers();
				}
				break;
			}
			setState(1176);
			declarator();
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1177);
				declarationList();
				}
			}

			setState(1180);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPrepListener ) ((CPrepListener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1182);
				declaration();
				}
				}
				setState(1185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
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
		case 37:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 54:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 68:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3|\u04a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\6\2"+
		"\u00be\n\2\r\2\16\2\u00bf\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u00ca\n"+
		"\4\3\4\3\4\5\4\u00ce\n\4\3\4\3\4\5\4\u00d2\n\4\3\4\5\4\u00d5\n\4\7\4\u00d7"+
		"\n\4\f\4\16\4\u00da\13\4\3\4\3\4\5\4\u00de\n\4\3\4\3\4\5\4\u00e2\n\4\3"+
		"\4\5\4\u00e5\n\4\3\4\3\4\5\4\u00e9\n\4\3\4\3\4\5\4\u00ed\n\4\3\4\5\4\u00f0"+
		"\n\4\7\4\u00f2\n\4\f\4\16\4\u00f5\13\4\3\4\3\4\5\4\u00f9\n\4\3\4\5\4\u00fc"+
		"\n\4\3\4\5\4\u00ff\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u0106\n\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\6\b\u010f\n\b\r\b\16\b\u0110\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0119\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u012e\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\7\n\u013a\n\n\f\n\16\n\u013d\13\n\3\13\3\13\5\13\u0141\n\13\3\13\3"+
		"\13\3\13\3\f\3\f\5\f\u0148\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0150\n\f\3"+
		"\f\3\f\5\f\u0154\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u015c\n\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0162\n\f\f\f\16\f\u0165\13\f\3\r\3\r\3\r\7\r\u016a\n\r\f\r\16"+
		"\r\u016d\13\r\3\16\7\16\u0170\n\16\f\16\16\16\u0173\13\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0180\n\16\3\17\3\17"+
		"\3\20\5\20\u0185\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u018e\n"+
		"\20\3\21\3\21\3\21\7\21\u0193\n\21\f\21\16\21\u0196\13\21\3\22\3\22\3"+
		"\22\7\22\u019b\n\22\f\22\16\22\u019e\13\22\3\23\3\23\3\23\7\23\u01a3\n"+
		"\23\f\23\16\23\u01a6\13\23\3\24\3\24\3\24\7\24\u01ab\n\24\f\24\16\24\u01ae"+
		"\13\24\3\25\3\25\3\25\7\25\u01b3\n\25\f\25\16\25\u01b6\13\25\3\26\3\26"+
		"\3\26\7\26\u01bb\n\26\f\26\16\26\u01be\13\26\3\27\3\27\3\27\7\27\u01c3"+
		"\n\27\f\27\16\27\u01c6\13\27\3\30\3\30\3\30\7\30\u01cb\n\30\f\30\16\30"+
		"\u01ce\13\30\3\31\3\31\3\31\7\31\u01d3\n\31\f\31\16\31\u01d6\13\31\3\32"+
		"\3\32\3\32\7\32\u01db\n\32\f\32\16\32\u01de\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u01e6\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01ee\n"+
		"\34\3\35\3\35\3\36\3\36\3\36\7\36\u01f5\n\36\f\36\16\36\u01f8\13\36\3"+
		"\37\3\37\3 \3 \5 \u01fe\n \3 \3 \3 \5 \u0203\n \3!\6!\u0206\n!\r!\16!"+
		"\u0207\3\"\6\"\u020b\n\"\r\"\16\"\u020c\3#\3#\3#\3#\3#\5#\u0214\n#\3$"+
		"\3$\3$\7$\u0219\n$\f$\16$\u021c\13$\3%\3%\3%\5%\u0221\n%\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0234\n\'\3\'"+
		"\3\'\7\'\u0238\n\'\f\'\16\'\u023b\13\'\3(\3(\5(\u023f\n(\3(\3(\3(\3(\3"+
		"(\3(\3(\5(\u0248\n(\3)\3)\3*\6*\u024d\n*\r*\16*\u024e\3+\3+\5+\u0253\n"+
		"+\3+\3+\3+\5+\u0258\n+\3,\3,\5,\u025c\n,\3,\5,\u025f\n,\3-\3-\3-\7-\u0264"+
		"\n-\f-\16-\u0267\13-\3.\3.\5.\u026b\n.\3.\3.\5.\u026f\n.\3/\3/\5/\u0273"+
		"\n/\3/\3/\3/\5/\u0278\n/\3/\3/\3/\3/\5/\u027e\n/\3\60\3\60\3\60\7\60\u0283"+
		"\n\60\f\60\16\60\u0286\13\60\3\61\3\61\3\61\5\61\u028b\n\61\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u029c\n\65\3\66\3\66\3\66\3\66\5\66\u02a2\n\66\3\66\3\66\3\67\5\67\u02a7"+
		"\n\67\3\67\3\67\7\67\u02ab\n\67\f\67\16\67\u02ae\13\67\38\38\38\38\38"+
		"\38\38\38\38\38\38\58\u02bb\n8\38\38\38\38\58\u02c1\n8\38\38\38\58\u02c6"+
		"\n8\38\58\u02c9\n8\38\38\38\38\38\58\u02d0\n8\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\58\u02df\n8\38\38\38\38\38\38\38\38\38\38\58\u02eb\n8"+
		"\38\78\u02ee\n8\f8\168\u02f1\138\39\39\39\69\u02f6\n9\r9\169\u02f7\39"+
		"\39\59\u02fc\n9\3:\3:\3:\3:\3:\3:\3:\3;\5;\u0306\n;\3;\3;\5;\u030a\n;"+
		"\7;\u030c\n;\f;\16;\u030f\13;\3<\3<\3<\5<\u0314\n<\3<\5<\u0317\n<\3=\3"+
		"=\3=\3=\3=\7=\u031e\n=\f=\16=\u0321\13=\3>\3>\5>\u0325\n>\6>\u0327\n>"+
		"\r>\16>\u0328\3?\6?\u032c\n?\r?\16?\u032d\3@\3@\3@\5@\u0333\n@\3A\3A\3"+
		"A\7A\u0338\nA\fA\16A\u033b\13A\3B\3B\3B\3B\3B\5B\u0342\nB\5B\u0344\nB"+
		"\3C\3C\3C\7C\u0349\nC\fC\16C\u034c\13C\3D\3D\5D\u0350\nD\3E\3E\5E\u0354"+
		"\nE\3E\3E\7E\u0358\nE\fE\16E\u035b\13E\5E\u035d\nE\3F\3F\3F\3F\3F\7F\u0364"+
		"\nF\fF\16F\u0367\13F\3F\3F\5F\u036b\nF\3F\5F\u036e\nF\3F\3F\3F\3F\5F\u0374"+
		"\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0384\nF\3F\3F\7F\u0388"+
		"\nF\fF\16F\u038b\13F\5F\u038d\nF\3F\3F\3F\5F\u0392\nF\3F\5F\u0395\nF\3"+
		"F\3F\3F\3F\3F\5F\u039c\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\5F\u03af\nF\3F\3F\7F\u03b3\nF\fF\16F\u03b6\13F\7F\u03b8\nF\fF"+
		"\16F\u03bb\13F\3G\3G\3H\3H\3H\3H\5H\u03c3\nH\3H\3H\5H\u03c7\nH\3I\5I\u03ca"+
		"\nI\3I\3I\3I\5I\u03cf\nI\3I\7I\u03d2\nI\fI\16I\u03d5\13I\3J\3J\3J\3K\6"+
		"K\u03db\nK\rK\16K\u03dc\3L\3L\3L\3L\3L\3L\5L\u03e5\nL\3M\3M\3M\3M\3M\6"+
		"M\u03ec\nM\rM\16M\u03ed\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7"+
		"N\u03ff\nN\fN\16N\u0402\13N\5N\u0404\nN\3N\3N\3N\3N\7N\u040a\nN\fN\16"+
		"N\u040d\13N\5N\u040f\nN\7N\u0411\nN\fN\16N\u0414\13N\3N\3N\5N\u0418\n"+
		"N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0425\nO\3P\3P\5P\u0429\nP\3P\3"+
		"P\3Q\6Q\u042e\nQ\rQ\16Q\u042f\3R\3R\5R\u0434\nR\3S\5S\u0437\nS\3S\3S\3"+
		"T\3T\3T\3T\3T\3T\3T\5T\u0442\nT\3T\3T\3T\3T\3T\3T\5T\u044a\nT\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0460\nU\3V\3"+
		"V\5V\u0464\nV\5V\u0466\nV\3V\3V\5V\u046a\nV\3V\3V\5V\u046e\nV\3W\3W\5"+
		"W\u0472\nW\3X\3X\3X\7X\u0477\nX\fX\16X\u047a\13X\3Y\3Y\3Y\3Y\3Y\5Y\u0481"+
		"\nY\3Y\3Y\5Y\u0485\nY\3Y\3Y\3Z\5Z\u048a\nZ\3Z\3Z\3[\6[\u048f\n[\r[\16"+
		"[\u0490\3\\\3\\\3\\\5\\\u0496\n\\\3]\5]\u0499\n]\3]\3]\5]\u049d\n]\3]"+
		"\3]\3^\6^\u04a2\n^\r^\16^\u04a3\3^\2\5Ln\u008a_\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\2\31\3\2lm\4\2NNPP\5\2--NN"+
		"PP\4\2--88\7\2MMOOQQTTYZ\3\2QS\4\2MMOO\3\2KL\3\2GJ\3\2jk\3\2_i\b\2\25"+
		"\25  ((..\61\61@@\n\2\6\b\30\30\35\35!!&\'+,\63\64:;\3\2\6\b\4\2//\62"+
		"\62\6\2\31\31))\65\6599\5\2\n\13%%>>\4\2AB^^\3\2AB\4\2QQXX\4\2\r\r\17"+
		"\17\4\2\20\20\65\65\4\2\26\26\32\32\2\u0510\2\u00bd\3\2\2\2\4\u00c3\3"+
		"\2\2\2\6\u00c5\3\2\2\2\b\u0105\3\2\2\2\n\u0107\3\2\2\2\f\u0109\3\2\2\2"+
		"\16\u012d\3\2\2\2\20\u012f\3\2\2\2\22\u0136\3\2\2\2\24\u0140\3\2\2\2\26"+
		"\u0153\3\2\2\2\30\u0166\3\2\2\2\32\u0171\3\2\2\2\34\u0181\3\2\2\2\36\u018d"+
		"\3\2\2\2 \u018f\3\2\2\2\"\u0197\3\2\2\2$\u019f\3\2\2\2&\u01a7\3\2\2\2"+
		"(\u01af\3\2\2\2*\u01b7\3\2\2\2,\u01bf\3\2\2\2.\u01c7\3\2\2\2\60\u01cf"+
		"\3\2\2\2\62\u01d7\3\2\2\2\64\u01df\3\2\2\2\66\u01ed\3\2\2\28\u01ef\3\2"+
		"\2\2:\u01f1\3\2\2\2<\u01f9\3\2\2\2>\u0202\3\2\2\2@\u0205\3\2\2\2B\u020a"+
		"\3\2\2\2D\u0213\3\2\2\2F\u0215\3\2\2\2H\u021d\3\2\2\2J\u0222\3\2\2\2L"+
		"\u0233\3\2\2\2N\u0247\3\2\2\2P\u0249\3\2\2\2R\u024c\3\2\2\2T\u0257\3\2"+
		"\2\2V\u025b\3\2\2\2X\u0260\3\2\2\2Z\u026e\3\2\2\2\\\u027d\3\2\2\2^\u027f"+
		"\3\2\2\2`\u0287\3\2\2\2b\u028c\3\2\2\2d\u028e\3\2\2\2f\u0293\3\2\2\2h"+
		"\u029b\3\2\2\2j\u029d\3\2\2\2l\u02a6\3\2\2\2n\u02c0\3\2\2\2p\u02fb\3\2"+
		"\2\2r\u02fd\3\2\2\2t\u0305\3\2\2\2v\u0310\3\2\2\2x\u031f\3\2\2\2z\u0326"+
		"\3\2\2\2|\u032b\3\2\2\2~\u032f\3\2\2\2\u0080\u0334\3\2\2\2\u0082\u0343"+
		"\3\2\2\2\u0084\u0345\3\2\2\2\u0086\u034d\3\2\2\2\u0088\u035c\3\2\2\2\u008a"+
		"\u038c\3\2\2\2\u008c\u03bc\3\2\2\2\u008e\u03c6\3\2\2\2\u0090\u03c9\3\2"+
		"\2\2\u0092\u03d6\3\2\2\2\u0094\u03da\3\2\2\2\u0096\u03e4\3\2\2\2\u0098"+
		"\u03e6\3\2\2\2\u009a\u0417\3\2\2\2\u009c\u0424\3\2\2\2\u009e\u0426\3\2"+
		"\2\2\u00a0\u042d\3\2\2\2\u00a2\u0433\3\2\2\2\u00a4\u0436\3\2\2\2\u00a6"+
		"\u0449\3\2\2\2\u00a8\u045f\3\2\2\2\u00aa\u0465\3\2\2\2\u00ac\u046f\3\2"+
		"\2\2\u00ae\u0473\3\2\2\2\u00b0\u0484\3\2\2\2\u00b2\u0489\3\2\2\2\u00b4"+
		"\u048e\3\2\2\2\u00b6\u0495\3\2\2\2\u00b8\u0498\3\2\2\2\u00ba\u04a1\3\2"+
		"\2\2\u00bc\u00be\5\4\3\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\2"+
		"\2\3\u00c2\3\3\2\2\2\u00c3\u00c4\5\6\4\2\u00c4\5\3\2\2\2\u00c5\u00c6\7"+
		"\22\2\2\u00c6\u00c7\7y\2\2\u00c7\u00c9\7o\2\2\u00c8\u00ca\7\23\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d8\7A"+
		"\2\2\u00cc\u00ce\7\23\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\7o\2\2\u00d0\u00d2\7^\2\2\u00d1\u00d0\3\2\2"+
		"\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\7\23\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00cd\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\7B\2\2\u00dc\u00de\7y\2"+
		"\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1"+
		"\7E\2\2\u00e0\u00e2\7\23\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e5\7\23\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00f3\7E\2\2\u00e7\u00e9\7\23\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\7o"+
		"\2\2\u00eb\u00ed\7^\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00f0\7\23\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3"+
		"\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f8\7F\2\2\u00f7\u00f9\7^\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00fc\7\23\2\2\u00fb\u00fa\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\7\23\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7F\2\2\u0101"+
		"\7\3\2\2\2\u0102\u0106\5\n\6\2\u0103\u0106\5\4\3\2\u0104\u0106\5\f\7\2"+
		"\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\t\3"+
		"\2\2\2\u0107\u0108\7\21\2\2\u0108\13\3\2\2\2\u0109\u010a\7x\2\2\u010a"+
		"\r\3\2\2\2\u010b\u012e\7o\2\2\u010c\u012e\7p\2\2\u010d\u010f\7r\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u012e\3\2\2\2\u0112\u0113\7A\2\2\u0113\u0114\5:\36\2\u0114"+
		"\u0115\7B\2\2\u0115\u012e\3\2\2\2\u0116\u012e\5\20\t\2\u0117\u0119\7\3"+
		"\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\7A\2\2\u011b\u011c\5\u009eP\2\u011c\u011d\7B\2\2\u011d\u012e\3"+
		"\2\2\2\u011e\u011f\7\4\2\2\u011f\u0120\7A\2\2\u0120\u0121\5\32\16\2\u0121"+
		"\u0122\7^\2\2\u0122\u0123\5\u0086D\2\u0123\u0124\7B\2\2\u0124\u012e\3"+
		"\2\2\2\u0125\u0126\7\5\2\2\u0126\u0127\7A\2\2\u0127\u0128\5\u0086D\2\u0128"+
		"\u0129\7^\2\2\u0129\u012a\5\32\16\2\u012a\u012b\7B\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012e\5\b\5\2\u012d\u010b\3\2\2\2\u012d\u010c\3\2\2\2\u012d"+
		"\u010e\3\2\2\2\u012d\u0112\3\2\2\2\u012d\u0116\3\2\2\2\u012d\u0118\3\2"+
		"\2\2\u012d\u011e\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\17\3\2\2\2\u012f\u0130\7<\2\2\u0130\u0131\7A\2\2\u0131\u0132\5\66\34"+
		"\2\u0132\u0133\7^\2\2\u0133\u0134\5\22\n\2\u0134\u0135\7B\2\2\u0135\21"+
		"\3\2\2\2\u0136\u013b\5\24\13\2\u0137\u0138\7^\2\2\u0138\u013a\5\24\13"+
		"\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\23\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0141\5\u0086D\2\u013f"+
		"\u0141\7\33\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3"+
		"\2\2\2\u0142\u0143\7\\\2\2\u0143\u0144\5\66\34\2\u0144\25\3\2\2\2\u0145"+
		"\u0154\5\16\b\2\u0146\u0148\7\3\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7A\2\2\u014a\u014b\5\u0086D\2\u014b"+
		"\u014c\7B\2\2\u014c\u014d\7E\2\2\u014d\u014f\5\u0090I\2\u014e\u0150\7"+
		"^\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\7F\2\2\u0152\u0154\3\2\2\2\u0153\u0145\3\2\2\2\u0153\u0147\3\2"+
		"\2\2\u0154\u0163\3\2\2\2\u0155\u0156\7C\2\2\u0156\u0157\5:\36\2\u0157"+
		"\u0158\7D\2\2\u0158\u0162\3\2\2\2\u0159\u015b\7A\2\2\u015a\u015c\5\30"+
		"\r\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0162\7B\2\2\u015e\u015f\t\2\2\2\u015f\u0162\7o\2\2\u0160\u0162\t\3\2"+
		"\2\u0161\u0155\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u0160"+
		"\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\27\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016b\5\66\34\2\u0167\u0168\7^\2"+
		"\2\u0168\u016a\5\66\34\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\31\3\2\2\2\u016d\u016b\3\2\2"+
		"\2\u016e\u0170\t\4\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u017f\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0180\5\26\f\2\u0175\u0176\5\34\17\2\u0176\u0177\5\36\20\2\u0177\u0180"+
		"\3\2\2\2\u0178\u0179\t\5\2\2\u0179\u017a\7A\2\2\u017a\u017b\5\u0086D\2"+
		"\u017b\u017c\7B\2\2\u017c\u0180\3\2\2\2\u017d\u017e\7V\2\2\u017e\u0180"+
		"\7o\2\2\u017f\u0174\3\2\2\2\u017f\u0175\3\2\2\2\u017f\u0178\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\33\3\2\2\2\u0181\u0182\t\6\2\2\u0182\35\3\2\2\2\u0183"+
		"\u0185\7\3\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0187\7A\2\2\u0187\u0188\5\u0086D\2\u0188\u0189\7B\2\2\u0189"+
		"\u018a\5\36\20\2\u018a\u018e\3\2\2\2\u018b\u018e\5\32\16\2\u018c\u018e"+
		"\7q\2\2\u018d\u0184\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\37\3\2\2\2\u018f\u0194\5\36\20\2\u0190\u0191\t\7\2\2\u0191\u0193\5\36"+
		"\20\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195!\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019c\5 \21\2"+
		"\u0198\u0199\t\b\2\2\u0199\u019b\5 \21\2\u019a\u0198\3\2\2\2\u019b\u019e"+
		"\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d#\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f\u01a4\5\"\22\2\u01a0\u01a1\t\t\2\2\u01a1\u01a3\5"+
		"\"\22\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5%\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01ac\5$\23\2"+
		"\u01a8\u01a9\t\n\2\2\u01a9\u01ab\5$\23\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae"+
		"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\'\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b4\5&\24\2\u01b0\u01b1\t\13\2\2\u01b1\u01b3\5"+
		"&\24\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5)\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01bc\5(\25\2"+
		"\u01b8\u01b9\7T\2\2\u01b9\u01bb\5(\25\2\u01ba\u01b8\3\2\2\2\u01bb\u01be"+
		"\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd+\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c4\5*\26\2\u01c0\u01c1\7X\2\2\u01c1\u01c3\5*\26"+
		"\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5-\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cc\5,\27\2\u01c8"+
		"\u01c9\7U\2\2\u01c9\u01cb\5,\27\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd/\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01cf\u01d4\5.\30\2\u01d0\u01d1\7V\2\2\u01d1\u01d3\5.\30\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\61\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01dc\5\60\31\2\u01d8"+
		"\u01d9\7W\2\2\u01d9\u01db\5\60\31\2\u01da\u01d8\3\2\2\2\u01db\u01de\3"+
		"\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\63\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e5\5\62\32\2\u01e0\u01e1\7[\2\2\u01e1\u01e2\5"+
		":\36\2\u01e2\u01e3\7\\\2\2\u01e3\u01e4\5\64\33\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01e0\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\65\3\2\2\2\u01e7\u01ee\5\64\33"+
		"\2\u01e8\u01e9\5\32\16\2\u01e9\u01ea\58\35\2\u01ea\u01eb\5\66\34\2\u01eb"+
		"\u01ee\3\2\2\2\u01ec\u01ee\7q\2\2\u01ed\u01e7\3\2\2\2\u01ed\u01e8\3\2"+
		"\2\2\u01ed\u01ec\3\2\2\2\u01ee\67\3\2\2\2\u01ef\u01f0\t\f\2\2\u01f09\3"+
		"\2\2\2\u01f1\u01f6\5\66\34\2\u01f2\u01f3\7^\2\2\u01f3\u01f5\5\66\34\2"+
		"\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7;\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\5\64\33\2\u01fa"+
		"=\3\2\2\2\u01fb\u01fd\5@!\2\u01fc\u01fe\5F$\2\u01fd\u01fc\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7]\2\2\u0200\u0203\3\2"+
		"\2\2\u0201\u0203\5\u0098M\2\u0202\u01fb\3\2\2\2\u0202\u0201\3\2\2\2\u0203"+
		"?\3\2\2\2\u0204\u0206\5D#\2\u0205\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208A\3\2\2\2\u0209\u020b\5D#\2\u020a"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020dC\3\2\2\2\u020e\u0214\5J&\2\u020f\u0214\5L\'\2\u0210\u0214\5"+
		"f\64\2\u0211\u0214\5h\65\2\u0212\u0214\5j\66\2\u0213\u020e\3\2\2\2\u0213"+
		"\u020f\3\2\2\2\u0213\u0210\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2"+
		"\2\2\u0214E\3\2\2\2\u0215\u021a\5H%\2\u0216\u0217\7^\2\2\u0217\u0219\5"+
		"H%\2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021bG\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0220\5l\67\2"+
		"\u021e\u021f\7_\2\2\u021f\u0221\5\u008eH\2\u0220\u021e\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221I\3\2\2\2\u0222\u0223\t\r\2\2\u0223K\3\2\2\2\u0224\u0225"+
		"\b\'\1\2\u0225\u0234\t\16\2\2\u0226\u0227\7\3\2\2\u0227\u0228\7A\2\2\u0228"+
		"\u0229\t\17\2\2\u0229\u0234\7B\2\2\u022a\u0234\5d\63\2\u022b\u0234\5N"+
		"(\2\u022c\u0234\5\\/\2\u022d\u0234\5\u008cG\2\u022e\u022f\7\t\2\2\u022f"+
		"\u0230\7A\2\2\u0230\u0231\5<\37\2\u0231\u0232\7B\2\2\u0232\u0234\3\2\2"+
		"\2\u0233\u0224\3\2\2\2\u0233\u0226\3\2\2\2\u0233\u022a\3\2\2\2\u0233\u022b"+
		"\3\2\2\2\u0233\u022c\3\2\2\2\u0233\u022d\3\2\2\2\u0233\u022e\3\2\2\2\u0234"+
		"\u0239\3\2\2\2\u0235\u0236\f\3\2\2\u0236\u0238\5z>\2\u0237\u0235\3\2\2"+
		"\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023aM"+
		"\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023e\5P)\2\u023d\u023f\7o\2\2\u023e"+
		"\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7E"+
		"\2\2\u0241\u0242\5R*\2\u0242\u0243\7F\2\2\u0243\u0248\3\2\2\2\u0244\u0245"+
		"\5P)\2\u0245\u0246\7o\2\2\u0246\u0248\3\2\2\2\u0247\u023c\3\2\2\2\u0247"+
		"\u0244\3\2\2\2\u0248O\3\2\2\2\u0249\u024a\t\20\2\2\u024aQ\3\2\2\2\u024b"+
		"\u024d\5T+\2\u024c\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024c\3\2\2"+
		"\2\u024e\u024f\3\2\2\2\u024fS\3\2\2\2\u0250\u0252\5V,\2\u0251\u0253\5"+
		"X-\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0255\7]\2\2\u0255\u0258\3\2\2\2\u0256\u0258\5\u0098M\2\u0257\u0250\3"+
		"\2\2\2\u0257\u0256\3\2\2\2\u0258U\3\2\2\2\u0259\u025c\5L\'\2\u025a\u025c"+
		"\5f\64\2\u025b\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025c\u025e\3\2\2\2\u025d"+
		"\u025f\5V,\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025fW\3\2\2\2\u0260"+
		"\u0265\5Z.\2\u0261\u0262\7^\2\2\u0262\u0264\5Z.\2\u0263\u0261\3\2\2\2"+
		"\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266Y\3"+
		"\2\2\2\u0267\u0265\3\2\2\2\u0268\u026f\5l\67\2\u0269\u026b\5l\67\2\u026a"+
		"\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\7\\"+
		"\2\2\u026d\u026f\5<\37\2\u026e\u0268\3\2\2\2\u026e\u026a\3\2\2\2\u026f"+
		"[\3\2\2\2\u0270\u0272\7\37\2\2\u0271\u0273\7o\2\2\u0272\u0271\3\2\2\2"+
		"\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\7E\2\2\u0275\u0277"+
		"\5^\60\2\u0276\u0278\7^\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027a\7F\2\2\u027a\u027e\3\2\2\2\u027b\u027c\7\37"+
		"\2\2\u027c\u027e\7o\2\2\u027d\u0270\3\2\2\2\u027d\u027b\3\2\2\2\u027e"+
		"]\3\2\2\2\u027f\u0284\5`\61\2\u0280\u0281\7^\2\2\u0281\u0283\5`\61\2\u0282"+
		"\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2"+
		"\2\2\u0285_\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u028a\5b\62\2\u0288\u0289"+
		"\7_\2\2\u0289\u028b\5<\37\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"a\3\2\2\2\u028c\u028d\7o\2\2\u028dc\3\2\2\2\u028e\u028f\79\2\2\u028f\u0290"+
		"\7A\2\2\u0290\u0291\5\u0086D\2\u0291\u0292\7B\2\2\u0292e\3\2\2\2\u0293"+
		"\u0294\t\21\2\2\u0294g\3\2\2\2\u0295\u029c\t\22\2\2\u0296\u029c\5r:\2"+
		"\u0297\u0298\7\f\2\2\u0298\u0299\7A\2\2\u0299\u029a\7o\2\2\u029a\u029c"+
		"\7B\2\2\u029b\u0295\3\2\2\2\u029b\u0296\3\2\2\2\u029b\u0297\3\2\2\2\u029c"+
		"i\3\2\2\2\u029d\u029e\7\67\2\2\u029e\u02a1\7A\2\2\u029f\u02a2\5\u0086"+
		"D\2\u02a0\u02a2\5<\37\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a4\7B\2\2\u02a4k\3\2\2\2\u02a5\u02a7\5z>\2\u02a6"+
		"\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02ac\5n"+
		"8\2\u02a9\u02ab\5p9\2\u02aa\u02a9\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa"+
		"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02adm\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af"+
		"\u02b0\b8\1\2\u02b0\u02c1\7o\2\2\u02b1\u02b2\7A\2\2\u02b2\u02b3\5l\67"+
		"\2\u02b3\u02b4\7B\2\2\u02b4\u02c1\3\2\2\2\u02b5\u02b6\7o\2\2\u02b6\u02b7"+
		"\7\\\2\2\u02b7\u02c1\7q\2\2\u02b8\u02ba\7A\2\2\u02b9\u02bb\5L\'\2\u02ba"+
		"\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\5z"+
		">\2\u02bd\u02be\5n8\2\u02be\u02bf\7B\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02af"+
		"\3\2\2\2\u02c0\u02b1\3\2\2\2\u02c0\u02b5\3\2\2\2\u02c0\u02b8\3\2\2\2\u02c1"+
		"\u02ef\3\2\2\2\u02c2\u02c3\f\n\2\2\u02c3\u02c5\7C\2\2\u02c4\u02c6\5|?"+
		"\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c9"+
		"\5\66\34\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2"+
		"\u02ca\u02ee\7D\2\2\u02cb\u02cc\f\t\2\2\u02cc\u02cd\7C\2\2\u02cd\u02cf"+
		"\7.\2\2\u02ce\u02d0\5|?\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1\u02d2\5\66\34\2\u02d2\u02d3\7D\2\2\u02d3\u02ee\3"+
		"\2\2\2\u02d4\u02d5\f\b\2\2\u02d5\u02d6\7C\2\2\u02d6\u02d7\5|?\2\u02d7"+
		"\u02d8\7.\2\2\u02d8\u02d9\5\66\34\2\u02d9\u02da\7D\2\2\u02da\u02ee\3\2"+
		"\2\2\u02db\u02dc\f\7\2\2\u02dc\u02de\7C\2\2\u02dd\u02df\5|?\2\u02de\u02dd"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\7Q\2\2\u02e1"+
		"\u02ee\7D\2\2\u02e2\u02e3\f\6\2\2\u02e3\u02e4\7A\2\2\u02e4\u02e5\5~@\2"+
		"\u02e5\u02e6\7B\2\2\u02e6\u02ee\3\2\2\2\u02e7\u02e8\f\5\2\2\u02e8\u02ea"+
		"\7A\2\2\u02e9\u02eb\5\u0084C\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2"+
		"\u02eb\u02ec\3\2\2\2\u02ec\u02ee\7B\2\2\u02ed\u02c2\3\2\2\2\u02ed\u02cb"+
		"\3\2\2\2\u02ed\u02d4\3\2\2\2\u02ed\u02db\3\2\2\2\u02ed\u02e2\3\2\2\2\u02ed"+
		"\u02e7\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0o\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7\r\2\2\u02f3\u02f5"+
		"\7A\2\2\u02f4\u02f6\7r\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fc\7B"+
		"\2\2\u02fa\u02fc\5r:\2\u02fb\u02f2\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fcq"+
		"\3\2\2\2\u02fd\u02fe\7\16\2\2\u02fe\u02ff\7A\2\2\u02ff\u0300\7A\2\2\u0300"+
		"\u0301\5t;\2\u0301\u0302\7B\2\2\u0302\u0303\7B\2\2\u0303s\3\2\2\2\u0304"+
		"\u0306\5v<\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u030d\3\2\2"+
		"\2\u0307\u0309\7^\2\2\u0308\u030a\5v<\2\u0309\u0308\3\2\2\2\u0309\u030a"+
		"\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0307\3\2\2\2\u030c\u030f\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030eu\3\2\2\2\u030f\u030d\3\2\2\2"+
		"\u0310\u0316\n\23\2\2\u0311\u0313\7A\2\2\u0312\u0314\5\30\r\2\u0313\u0312"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\7B\2\2\u0316"+
		"\u0311\3\2\2\2\u0316\u0317\3\2\2\2\u0317w\3\2\2\2\u0318\u031e\n\24\2\2"+
		"\u0319\u031a\7A\2\2\u031a\u031b\5x=\2\u031b\u031c\7B\2\2\u031c\u031e\3"+
		"\2\2\2\u031d\u0318\3\2\2\2\u031d\u0319\3\2\2\2\u031e\u0321\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320y\3\2\2\2\u0321\u031f\3\2\2\2"+
		"\u0322\u0324\t\25\2\2\u0323\u0325\5|?\2\u0324\u0323\3\2\2\2\u0324\u0325"+
		"\3\2\2\2\u0325\u0327\3\2\2\2\u0326\u0322\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329{\3\2\2\2\u032a\u032c\5f\64\2"+
		"\u032b\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e}\3\2\2\2\u032f\u0332\5\u0080A\2\u0330\u0331\7^\2\2\u0331"+
		"\u0333\7n\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\177\3\2\2"+
		"\2\u0334\u0339\5\u0082B\2\u0335\u0336\7^\2\2\u0336\u0338\5\u0082B\2\u0337"+
		"\u0335\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2"+
		"\2\2\u033a\u0081\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033d\5@!\2\u033d\u033e"+
		"\5l\67\2\u033e\u0344\3\2\2\2\u033f\u0341\5B\"\2\u0340\u0342\5\u0088E\2"+
		"\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u033c"+
		"\3\2\2\2\u0343\u033f\3\2\2\2\u0344\u0083\3\2\2\2\u0345\u034a\7o\2\2\u0346"+
		"\u0347\7^\2\2\u0347\u0349\7o\2\2\u0348\u0346\3\2\2\2\u0349\u034c\3\2\2"+
		"\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0085\3\2\2\2\u034c\u034a"+
		"\3\2\2\2\u034d\u034f\5V,\2\u034e\u0350\5\u0088E\2\u034f\u034e\3\2\2\2"+
		"\u034f\u0350\3\2\2\2\u0350\u0087\3\2\2\2\u0351\u035d\5z>\2\u0352\u0354"+
		"\5z>\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0359\5\u008aF\2\u0356\u0358\5p9\2\u0357\u0356\3\2\2\2\u0358\u035b\3"+
		"\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035d\3\2\2\2\u035b"+
		"\u0359\3\2\2\2\u035c\u0351\3\2\2\2\u035c\u0353\3\2\2\2\u035d\u0089\3\2"+
		"\2\2\u035e\u035f\bF\1\2\u035f\u0360\7A\2\2\u0360\u0361\5\u0088E\2\u0361"+
		"\u0365\7B\2\2\u0362\u0364\5p9\2\u0363\u0362\3\2\2\2\u0364\u0367\3\2\2"+
		"\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u038d\3\2\2\2\u0367\u0365"+
		"\3\2\2\2\u0368\u036a\7C\2\2\u0369\u036b\5|?\2\u036a\u0369\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u036d\3\2\2\2\u036c\u036e\5\66\34\2\u036d\u036c\3"+
		"\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u038d\7D\2\2\u0370"+
		"\u0371\7C\2\2\u0371\u0373\7.\2\2\u0372\u0374\5|?\2\u0373\u0372\3\2\2\2"+
		"\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\5\66\34\2\u0376\u0377"+
		"\7D\2\2\u0377\u038d\3\2\2\2\u0378\u0379\7C\2\2\u0379\u037a\5|?\2\u037a"+
		"\u037b\7.\2\2\u037b\u037c\5\66\34\2\u037c\u037d\7D\2\2\u037d\u038d\3\2"+
		"\2\2\u037e\u037f\7C\2\2\u037f\u0380\7Q\2\2\u0380\u038d\7D\2\2\u0381\u0383"+
		"\7A\2\2\u0382\u0384\5~@\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0389\7B\2\2\u0386\u0388\5p9\2\u0387\u0386\3\2\2"+
		"\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038d"+
		"\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u035e\3\2\2\2\u038c\u0368\3\2\2\2\u038c"+
		"\u0370\3\2\2\2\u038c\u0378\3\2\2\2\u038c\u037e\3\2\2\2\u038c\u0381\3\2"+
		"\2\2\u038d\u03b9\3\2\2\2\u038e\u038f\f\7\2\2\u038f\u0391\7C\2\2\u0390"+
		"\u0392\5|?\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\3\2\2"+
		"\2\u0393\u0395\5\66\34\2\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0396\3\2\2\2\u0396\u03b8\7D\2\2\u0397\u0398\f\6\2\2\u0398\u0399\7C\2"+
		"\2\u0399\u039b\7.\2\2\u039a\u039c\5|?\2\u039b\u039a\3\2\2\2\u039b\u039c"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\5\66\34\2\u039e\u039f\7D\2\2"+
		"\u039f\u03b8\3\2\2\2\u03a0\u03a1\f\5\2\2\u03a1\u03a2\7C\2\2\u03a2\u03a3"+
		"\5|?\2\u03a3\u03a4\7.\2\2\u03a4\u03a5\5\66\34\2\u03a5\u03a6\7D\2\2\u03a6"+
		"\u03b8\3\2\2\2\u03a7\u03a8\f\4\2\2\u03a8\u03a9\7C\2\2\u03a9\u03aa\7Q\2"+
		"\2\u03aa\u03b8\7D\2\2\u03ab\u03ac\f\3\2\2\u03ac\u03ae\7A\2\2\u03ad\u03af"+
		"\5~@\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0"+
		"\u03b4\7B\2\2\u03b1\u03b3\5p9\2\u03b2\u03b1\3\2\2\2\u03b3\u03b6\3\2\2"+
		"\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4"+
		"\3\2\2\2\u03b7\u038e\3\2\2\2\u03b7\u0397\3\2\2\2\u03b7\u03a0\3\2\2\2\u03b7"+
		"\u03a7\3\2\2\2\u03b7\u03ab\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba\u008b\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc"+
		"\u03bd\7o\2\2\u03bd\u008d\3\2\2\2\u03be\u03c7\5\66\34\2\u03bf\u03c0\7"+
		"E\2\2\u03c0\u03c2\5\u0090I\2\u03c1\u03c3\7^\2\2\u03c2\u03c1\3\2\2\2\u03c2"+
		"\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\7F\2\2\u03c5\u03c7\3\2"+
		"\2\2\u03c6\u03be\3\2\2\2\u03c6\u03bf\3\2\2\2\u03c7\u008f\3\2\2\2\u03c8"+
		"\u03ca\5\u0092J\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb"+
		"\3\2\2\2\u03cb\u03d3\5\u008eH\2\u03cc\u03ce\7^\2\2\u03cd\u03cf\5\u0092"+
		"J\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0"+
		"\u03d2\5\u008eH\2\u03d1\u03cc\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1"+
		"\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u0091\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6"+
		"\u03d7\5\u0094K\2\u03d7\u03d8\7_\2\2\u03d8\u0093\3\2\2\2\u03d9\u03db\5"+
		"\u0096L\2\u03da\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03da\3\2\2\2"+
		"\u03dc\u03dd\3\2\2\2\u03dd\u0095\3\2\2\2\u03de\u03df\7C\2\2\u03df\u03e0"+
		"\5<\37\2\u03e0\u03e1\7D\2\2\u03e1\u03e5\3\2\2\2\u03e2\u03e3\7m\2\2\u03e3"+
		"\u03e5\7o\2\2\u03e4\u03de\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5\u0097\3\2"+
		"\2\2\u03e6\u03e7\7?\2\2\u03e7\u03e8\7A\2\2\u03e8\u03e9\5<\37\2\u03e9\u03eb"+
		"\7^\2\2\u03ea\u03ec\7r\2\2\u03eb\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\7B"+
		"\2\2\u03f0\u03f1\7]\2\2\u03f1\u0099\3\2\2\2\u03f2\u0418\5\u009cO\2\u03f3"+
		"\u0418\5\u009eP\2\u03f4\u0418\5\u00a4S\2\u03f5\u0418\5\u00a6T\2\u03f6"+
		"\u0418\5\u00a8U\2\u03f7\u0418\5\u00b0Y\2\u03f8\u03f9\t\26\2\2\u03f9\u03fa"+
		"\t\27\2\2\u03fa\u0403\7A\2\2\u03fb\u0400\5\62\32\2\u03fc\u03fd\7^\2\2"+
		"\u03fd\u03ff\5\62\32\2\u03fe\u03fc\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe"+
		"\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0403"+
		"\u03fb\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0412\3\2\2\2\u0405\u040e\7\\"+
		"\2\2\u0406\u040b\5\62\32\2\u0407\u0408\7^\2\2\u0408\u040a\5\62\32\2\u0409"+
		"\u0407\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2"+
		"\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0406\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0411\3\2\2\2\u0410\u0405\3\2\2\2\u0411\u0414\3\2"+
		"\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\3\2\2\2\u0414"+
		"\u0412\3\2\2\2\u0415\u0416\7B\2\2\u0416\u0418\7]\2\2\u0417\u03f2\3\2\2"+
		"\2\u0417\u03f3\3\2\2\2\u0417\u03f4\3\2\2\2\u0417\u03f5\3\2\2\2\u0417\u03f6"+
		"\3\2\2\2\u0417\u03f7\3\2\2\2\u0417\u03f8\3\2\2\2\u0418\u009b\3\2\2\2\u0419"+
		"\u041a\7o\2\2\u041a\u041b\7\\\2\2\u041b\u0425\5\u009aN\2\u041c\u041d\7"+
		"\27\2\2\u041d\u041e\5<\37\2\u041e\u041f\7\\\2\2\u041f\u0420\5\u009aN\2"+
		"\u0420\u0425\3\2\2\2\u0421\u0422\7\33\2\2\u0422\u0423\7\\\2\2\u0423\u0425"+
		"\5\u009aN\2\u0424\u0419\3\2\2\2\u0424\u041c\3\2\2\2\u0424\u0421\3\2\2"+
		"\2\u0425\u009d\3\2\2\2\u0426\u0428\7E\2\2\u0427\u0429\5\u00a0Q\2\u0428"+
		"\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\7F"+
		"\2\2\u042b\u009f\3\2\2\2\u042c\u042e\5\u00a2R\2\u042d\u042c\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u00a1\3\2"+
		"\2\2\u0431\u0434\5\u009aN\2\u0432\u0434\5> \2\u0433\u0431\3\2\2\2\u0433"+
		"\u0432\3\2\2\2\u0434\u00a3\3\2\2\2\u0435\u0437\5:\36\2\u0436\u0435\3\2"+
		"\2\2\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\7]\2\2\u0439"+
		"\u00a5\3\2\2\2\u043a\u043b\7$\2\2\u043b\u043c\7A\2\2\u043c\u043d\5:\36"+
		"\2\u043d\u043e\7B\2\2\u043e\u0441\5\u009aN\2\u043f\u0440\7\36\2\2\u0440"+
		"\u0442\5\u009aN\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u044a"+
		"\3\2\2\2\u0443\u0444\7\60\2\2\u0444\u0445\7A\2\2\u0445\u0446\5:\36\2\u0446"+
		"\u0447\7B\2\2\u0447\u0448\5\u009aN\2\u0448\u044a\3\2\2\2\u0449\u043a\3"+
		"\2\2\2\u0449\u0443\3\2\2\2\u044a\u00a7\3\2\2\2\u044b\u044c\7\66\2\2\u044c"+
		"\u044d\7A\2\2\u044d\u044e\5:\36\2\u044e\u044f\7B\2\2\u044f\u0450\5\u009a"+
		"N\2\u0450\u0460\3\2\2\2\u0451\u0452\7\34\2\2\u0452\u0453\5\u009aN\2\u0453"+
		"\u0454\7\66\2\2\u0454\u0455\7A\2\2\u0455\u0456\5:\36\2\u0456\u0457\7B"+
		"\2\2\u0457\u0458\7]\2\2\u0458\u0460\3\2\2\2\u0459\u045a\7\"\2\2\u045a"+
		"\u045b\7A\2\2\u045b\u045c\5\u00aaV\2\u045c\u045d\7B\2\2\u045d\u045e\5"+
		"\u009aN\2\u045e\u0460\3\2\2\2\u045f\u044b\3\2\2\2\u045f\u0451\3\2\2\2"+
		"\u045f\u0459\3\2\2\2\u0460\u00a9\3\2\2\2\u0461\u0466\5\u00acW\2\u0462"+
		"\u0464\5:\36\2\u0463\u0462\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466\3\2"+
		"\2\2\u0465\u0461\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u0469\7]\2\2\u0468\u046a\5\u00aeX\2\u0469\u0468\3\2\2\2\u0469\u046a\3"+
		"\2\2\2\u046a\u046b\3\2\2\2\u046b\u046d\7]\2\2\u046c\u046e\5\u00aeX\2\u046d"+
		"\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u00ab\3\2\2\2\u046f\u0471\5@"+
		"!\2\u0470\u0472\5F$\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u00ad"+
		"\3\2\2\2\u0473\u0478\5\66\34\2\u0474\u0475\7^\2\2\u0475\u0477\5\66\34"+
		"\2\u0476\u0474\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479"+
		"\3\2\2\2\u0479\u00af\3\2\2\2\u047a\u0478\3\2\2\2\u047b\u047c\7#\2\2\u047c"+
		"\u0485\7o\2\2\u047d\u0485\t\30\2\2\u047e\u0480\7*\2\2\u047f\u0481\5:\36"+
		"\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0485\3\2\2\2\u0482\u0483"+
		"\7#\2\2\u0483\u0485\5\32\16\2\u0484\u047b\3\2\2\2\u0484\u047d\3\2\2\2"+
		"\u0484\u047e\3\2\2\2\u0484\u0482\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487"+
		"\7]\2\2\u0487\u00b1\3\2\2\2\u0488\u048a\5\u00b4[\2\u0489\u0488\3\2\2\2"+
		"\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\7\2\2\3\u048c\u00b3"+
		"\3\2\2\2\u048d\u048f\5\u00b6\\\2\u048e\u048d\3\2\2\2\u048f\u0490\3\2\2"+
		"\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u00b5\3\2\2\2\u0492\u0496"+
		"\5\u00b8]\2\u0493\u0496\5> \2\u0494\u0496\7]\2\2\u0495\u0492\3\2\2\2\u0495"+
		"\u0493\3\2\2\2\u0495\u0494\3\2\2\2\u0496\u00b7\3\2\2\2\u0497\u0499\5@"+
		"!\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a"+
		"\u049c\5l\67\2\u049b\u049d\5\u00ba^\2\u049c\u049b\3\2\2\2\u049c\u049d"+
		"\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\5\u009eP\2\u049f\u00b9\3\2\2"+
		"\2\u04a0\u04a2\5> \2\u04a1\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a1"+
		"\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u00bb\3\2\2\2\u009c\u00bf\u00c9\u00cd"+
		"\u00d1\u00d4\u00d8\u00dd\u00e1\u00e4\u00e8\u00ec\u00ef\u00f3\u00f8\u00fb"+
		"\u00fe\u0105\u0110\u0118\u012d\u013b\u0140\u0147\u014f\u0153\u015b\u0161"+
		"\u0163\u016b\u0171\u017f\u0184\u018d\u0194\u019c\u01a4\u01ac\u01b4\u01bc"+
		"\u01c4\u01cc\u01d4\u01dc\u01e5\u01ed\u01f6\u01fd\u0202\u0207\u020c\u0213"+
		"\u021a\u0220\u0233\u0239\u023e\u0247\u024e\u0252\u0257\u025b\u025e\u0265"+
		"\u026a\u026e\u0272\u0277\u027d\u0284\u028a\u029b\u02a1\u02a6\u02ac\u02ba"+
		"\u02c0\u02c5\u02c8\u02cf\u02de\u02ea\u02ed\u02ef\u02f7\u02fb\u0305\u0309"+
		"\u030d\u0313\u0316\u031d\u031f\u0324\u0328\u032d\u0332\u0339\u0341\u0343"+
		"\u034a\u034f\u0353\u0359\u035c\u0365\u036a\u036d\u0373\u0383\u0389\u038c"+
		"\u0391\u0394\u039b\u03ae\u03b4\u03b7\u03b9\u03c2\u03c6\u03c9\u03ce\u03d3"+
		"\u03dc\u03e4\u03ed\u0400\u0403\u040b\u040e\u0412\u0417\u0424\u0428\u042f"+
		"\u0433\u0436\u0441\u0449\u045f\u0463\u0465\u0469\u046d\u0471\u0478\u0480"+
		"\u0484\u0489\u0490\u0495\u0498\u049c\u04a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}