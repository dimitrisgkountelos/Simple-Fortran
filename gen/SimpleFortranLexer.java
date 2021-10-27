// Generated from /home/dimitris/IdeaProjects/Project/src/SimpleFortran.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleFortranLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_FUNCTION=1, T_SUBROUTINE=2, T_END=3, T_COMMON=4, T_INTEGER=5, T_REAL=6, 
		T_COMPLEX=7, T_LOGICAL=8, T_CHARACTER=9, T_STRING=10, T_LIST=11, T_DATA=12, 
		T_CONTINUE=13, T_GOTO=14, T_CALL=15, T_READ=16, T_WRITE=17, T_LENGTH=18, 
		T_NEW=19, T_IF=20, T_THEN=21, T_ELSE=22, T_ENDIF=23, T_DO=24, T_ENDDO=25, 
		T_STOP=26, T_RETURN=27, ID=28, A=29, B=30, C=31, D=32, E=33, F=34, G=35, 
		H=36, I=37, J=38, K=39, L=40, M=41, N=42, O=43, P=44, Q=45, R=46, S=47, 
		T=48, U=49, Y=50, V=51, X=52, W=53, Z=54, L_PAREN=55, R_PAREN=56, COMMA=57, 
		ASSIGN=58, COLON=59, L_BRACK=60, R_BRACK=61, OROP=62, ANDOP=63, NOTOP=64, 
		RELOP=65, ADDOP=66, MULOP=67, DIVOP=68, POWEROP=69, LF=70, FF=71, HT=72, 
		CR=73, BS=74, VT=75, ICONST=76, RCONST=77, LCONST=78, CCONST=79, SCONST=80, 
		LISTFUNC=81, WS=82, COMMENTS=83, END_EOF=84;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T_FUNCTION", "T_SUBROUTINE", "T_END", "T_COMMON", "T_INTEGER", "T_REAL", 
			"T_COMPLEX", "T_LOGICAL", "T_CHARACTER", "T_STRING", "T_LIST", "T_DATA", 
			"T_CONTINUE", "T_GOTO", "T_CALL", "T_READ", "T_WRITE", "T_LENGTH", "T_NEW", 
			"T_IF", "T_THEN", "T_ELSE", "T_ENDIF", "T_DO", "T_ENDDO", "T_STOP", "T_RETURN", 
			"ID", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "Y", "V", "X", "W", "Z", "L_PAREN", 
			"R_PAREN", "COMMA", "ASSIGN", "COLON", "L_BRACK", "R_BRACK", "OROP", 
			"ANDOP", "NOTOP", "RELOP", "ADDOP", "MULOP", "DIVOP", "POWEROP", "LF", 
			"FF", "HT", "CR", "BS", "VT", "ICONST", "RCONST", "LCONST", "CCONST", 
			"SCONST", "LISTFUNC", "WS", "COMMENTS", "END_EOF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'('", "')'", "','", "'='", 
			"':'", "'['", "']'", null, null, null, null, null, "'*'", "'/'", "'**'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_FUNCTION", "T_SUBROUTINE", "T_END", "T_COMMON", "T_INTEGER", 
			"T_REAL", "T_COMPLEX", "T_LOGICAL", "T_CHARACTER", "T_STRING", "T_LIST", 
			"T_DATA", "T_CONTINUE", "T_GOTO", "T_CALL", "T_READ", "T_WRITE", "T_LENGTH", 
			"T_NEW", "T_IF", "T_THEN", "T_ELSE", "T_ENDIF", "T_DO", "T_ENDDO", "T_STOP", 
			"T_RETURN", "ID", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "Y", "V", "X", "W", 
			"Z", "L_PAREN", "R_PAREN", "COMMA", "ASSIGN", "COLON", "L_BRACK", "R_BRACK", 
			"OROP", "ANDOP", "NOTOP", "RELOP", "ADDOP", "MULOP", "DIVOP", "POWEROP", 
			"LF", "FF", "HT", "CR", "BS", "VT", "ICONST", "RCONST", "LCONST", "CCONST", 
			"SCONST", "LISTFUNC", "WS", "COMMENTS", "END_EOF"
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


	public SimpleFortranLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleFortran.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u0368\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\6\35\u0155\n\35\r\35\16\35\u0156\3\35\7\35\u015a\n\35\f\35\16\35\u015d"+
		"\13\35\3\35\3\35\7\35\u0161\n\35\f\35\16\35\u0164\13\35\3\35\6\35\u0167"+
		"\n\35\r\35\16\35\u0168\3\35\6\35\u016c\n\35\r\35\16\35\u016d\3\35\3\35"+
		"\6\35\u0172\n\35\r\35\16\35\u0173\5\35\u0176\n\35\7\35\u0178\n\35\f\35"+
		"\16\35\u017b\13\35\3\35\5\35\u017e\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\5B\u01f1\nB\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H"+
		"\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M"+
		"\3M\6M\u021c\nM\rM\16M\u021d\3M\7M\u0221\nM\fM\16M\u0224\13M\3M\3M\3M"+
		"\3M\5M\u022a\nM\3M\6M\u022d\nM\rM\16M\u022e\3M\7M\u0232\nM\fM\16M\u0235"+
		"\13M\3M\3M\3M\3M\5M\u023b\nM\3M\6M\u023e\nM\rM\16M\u023f\3M\7M\u0243\n"+
		"M\fM\16M\u0246\13M\3M\3M\3M\3M\5M\u024c\nM\3M\6M\u024f\nM\rM\16M\u0250"+
		"\3M\7M\u0254\nM\fM\16M\u0257\13M\5M\u0259\nM\3N\7N\u025c\nN\fN\16N\u025f"+
		"\13N\3N\3N\6N\u0263\nN\rN\16N\u0264\3N\3N\5N\u0269\nN\3N\6N\u026c\nN\r"+
		"N\16N\u026d\5N\u0270\nN\3N\6N\u0273\nN\rN\16N\u0274\3N\3N\7N\u0279\nN"+
		"\fN\16N\u027c\13N\3N\3N\5N\u0280\nN\3N\6N\u0283\nN\rN\16N\u0284\5N\u0287"+
		"\nN\3N\3N\7N\u028b\nN\fN\16N\u028e\13N\3N\7N\u0291\nN\fN\16N\u0294\13"+
		"N\3N\7N\u0297\nN\fN\16N\u029a\13N\3N\3N\5N\u029e\nN\3N\6N\u02a1\nN\rN"+
		"\16N\u02a2\5N\u02a5\nN\3N\3N\3N\3N\5N\u02ab\nN\3N\6N\u02ae\nN\rN\16N\u02af"+
		"\3N\7N\u02b3\nN\fN\16N\u02b6\13N\3N\3N\7N\u02ba\nN\fN\16N\u02bd\13N\3"+
		"N\3N\7N\u02c1\nN\fN\16N\u02c4\13N\3N\3N\3N\3N\5N\u02ca\nN\3N\7N\u02cd"+
		"\nN\fN\16N\u02d0\13N\3N\3N\7N\u02d4\nN\fN\16N\u02d7\13N\3N\3N\7N\u02db"+
		"\nN\fN\16N\u02de\13N\3N\3N\3N\3N\5N\u02e4\nN\3N\7N\u02e7\nN\fN\16N\u02ea"+
		"\13N\3N\3N\7N\u02ee\nN\fN\16N\u02f1\13N\3N\3N\7N\u02f5\nN\fN\16N\u02f8"+
		"\13N\5N\u02fa\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0316\nO\3P\3P\6P\u031a\nP\rP\16P\u031b\3"+
		"P\3P\3P\3P\3P\3P\3P\5P\u0325\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\7Q\u0338\nQ\fQ\16Q\u033b\13Q\3Q\3Q\3R\3R\3R\7R\u0342\nR"+
		"\fR\16R\u0345\13R\3R\6R\u0348\nR\rR\16R\u0349\5R\u034c\nR\3R\3R\3S\6S"+
		"\u0351\nS\rS\16S\u0352\3S\3S\3T\3T\7T\u0359\nT\fT\16T\u035c\13T\3T\6T"+
		"\u035f\nT\rT\16T\u0360\3T\3T\3U\3U\3U\3U\2\2V\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\3\2*\4\2C\\c|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HH"+
		"hh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2"+
		"QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2[[{{\4\2XXxx\4"+
		"\2ZZzz\4\2YYyy\4\2\\\\||\4\2--//\3\2\63;\5\2\63;CHch\5\2\62;CHch\3\2\63"+
		"9\3\2\629\3\2\63\63\3\2\62\63\3\2\62\62\3\2\"\u0080\4\2\"#%\u0080\5\2"+
		"\13\f\17\17\"\"\2\u03bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2\2\5\u00b4\3\2\2\2\7\u00bf"+
		"\3\2\2\2\t\u00c3\3\2\2\2\13\u00ca\3\2\2\2\r\u00d2\3\2\2\2\17\u00d7\3\2"+
		"\2\2\21\u00df\3\2\2\2\23\u00e7\3\2\2\2\25\u00f1\3\2\2\2\27\u00f8\3\2\2"+
		"\2\31\u00fd\3\2\2\2\33\u0102\3\2\2\2\35\u010b\3\2\2\2\37\u0110\3\2\2\2"+
		"!\u0115\3\2\2\2#\u011a\3\2\2\2%\u0120\3\2\2\2\'\u0127\3\2\2\2)\u012b\3"+
		"\2\2\2+\u012e\3\2\2\2-\u0133\3\2\2\2/\u0138\3\2\2\2\61\u013e\3\2\2\2\63"+
		"\u0141\3\2\2\2\65\u0147\3\2\2\2\67\u014c\3\2\2\29\u0154\3\2\2\2;\u017f"+
		"\3\2\2\2=\u0181\3\2\2\2?\u0183\3\2\2\2A\u0185\3\2\2\2C\u0187\3\2\2\2E"+
		"\u0189\3\2\2\2G\u018b\3\2\2\2I\u018d\3\2\2\2K\u018f\3\2\2\2M\u0191\3\2"+
		"\2\2O\u0193\3\2\2\2Q\u0195\3\2\2\2S\u0197\3\2\2\2U\u0199\3\2\2\2W\u019b"+
		"\3\2\2\2Y\u019d\3\2\2\2[\u019f\3\2\2\2]\u01a1\3\2\2\2_\u01a3\3\2\2\2a"+
		"\u01a5\3\2\2\2c\u01a7\3\2\2\2e\u01a9\3\2\2\2g\u01ab\3\2\2\2i\u01ad\3\2"+
		"\2\2k\u01af\3\2\2\2m\u01b1\3\2\2\2o\u01b3\3\2\2\2q\u01b5\3\2\2\2s\u01b7"+
		"\3\2\2\2u\u01b9\3\2\2\2w\u01bb\3\2\2\2y\u01bd\3\2\2\2{\u01bf\3\2\2\2}"+
		"\u01c1\3\2\2\2\177\u01c6\3\2\2\2\u0081\u01cc\3\2\2\2\u0083\u01f0\3\2\2"+
		"\2\u0085\u01f2\3\2\2\2\u0087\u01f4\3\2\2\2\u0089\u01f6\3\2\2\2\u008b\u01f8"+
		"\3\2\2\2\u008d\u01fb\3\2\2\2\u008f\u0200\3\2\2\2\u0091\u0205\3\2\2\2\u0093"+
		"\u020a\3\2\2\2\u0095\u020f\3\2\2\2\u0097\u0214\3\2\2\2\u0099\u0258\3\2"+
		"\2\2\u009b\u02f9\3\2\2\2\u009d\u0315\3\2\2\2\u009f\u0324\3\2\2\2\u00a1"+
		"\u0326\3\2\2\2\u00a3\u033e\3\2\2\2\u00a5\u0350\3\2\2\2\u00a7\u0356\3\2"+
		"\2\2\u00a9\u0364\3\2\2\2\u00ab\u00ac\5E#\2\u00ac\u00ad\5c\62\2\u00ad\u00ae"+
		"\5U+\2\u00ae\u00af\5? \2\u00af\u00b0\5a\61\2\u00b0\u00b1\5K&\2\u00b1\u00b2"+
		"\5W,\2\u00b2\u00b3\5U+\2\u00b3\4\3\2\2\2\u00b4\u00b5\5_\60\2\u00b5\u00b6"+
		"\5c\62\2\u00b6\u00b7\5=\37\2\u00b7\u00b8\5]/\2\u00b8\u00b9\5W,\2\u00b9"+
		"\u00ba\5c\62\2\u00ba\u00bb\5a\61\2\u00bb\u00bc\5K&\2\u00bc\u00bd\5U+\2"+
		"\u00bd\u00be\5C\"\2\u00be\6\3\2\2\2\u00bf\u00c0\5C\"\2\u00c0\u00c1\5U"+
		"+\2\u00c1\u00c2\5A!\2\u00c2\b\3\2\2\2\u00c3\u00c4\5? \2\u00c4\u00c5\5"+
		"W,\2\u00c5\u00c6\5S*\2\u00c6\u00c7\5S*\2\u00c7\u00c8\5W,\2\u00c8\u00c9"+
		"\5U+\2\u00c9\n\3\2\2\2\u00ca\u00cb\5K&\2\u00cb\u00cc\5U+\2\u00cc\u00cd"+
		"\5a\61\2\u00cd\u00ce\5C\"\2\u00ce\u00cf\5G$\2\u00cf\u00d0\5C\"\2\u00d0"+
		"\u00d1\5]/\2\u00d1\f\3\2\2\2\u00d2\u00d3\5]/\2\u00d3\u00d4\5C\"\2\u00d4"+
		"\u00d5\5;\36\2\u00d5\u00d6\5Q)\2\u00d6\16\3\2\2\2\u00d7\u00d8\5? \2\u00d8"+
		"\u00d9\5W,\2\u00d9\u00da\5S*\2\u00da\u00db\5Y-\2\u00db\u00dc\5Q)\2\u00dc"+
		"\u00dd\5C\"\2\u00dd\u00de\5i\65\2\u00de\20\3\2\2\2\u00df\u00e0\5Q)\2\u00e0"+
		"\u00e1\5W,\2\u00e1\u00e2\5G$\2\u00e2\u00e3\5K&\2\u00e3\u00e4\5? \2\u00e4"+
		"\u00e5\5;\36\2\u00e5\u00e6\5Q)\2\u00e6\22\3\2\2\2\u00e7\u00e8\5? \2\u00e8"+
		"\u00e9\5I%\2\u00e9\u00ea\5;\36\2\u00ea\u00eb\5]/\2\u00eb\u00ec\5;\36\2"+
		"\u00ec\u00ed\5? \2\u00ed\u00ee\5a\61\2\u00ee\u00ef\5C\"\2\u00ef\u00f0"+
		"\5]/\2\u00f0\24\3\2\2\2\u00f1\u00f2\5_\60\2\u00f2\u00f3\5a\61\2\u00f3"+
		"\u00f4\5]/\2\u00f4\u00f5\5K&\2\u00f5\u00f6\5U+\2\u00f6\u00f7\5G$\2\u00f7"+
		"\26\3\2\2\2\u00f8\u00f9\5Q)\2\u00f9\u00fa\5K&\2\u00fa\u00fb\5_\60\2\u00fb"+
		"\u00fc\5a\61\2\u00fc\30\3\2\2\2\u00fd\u00fe\5A!\2\u00fe\u00ff\5;\36\2"+
		"\u00ff\u0100\5a\61\2\u0100\u0101\5;\36\2\u0101\32\3\2\2\2\u0102\u0103"+
		"\5? \2\u0103\u0104\5W,\2\u0104\u0105\5U+\2\u0105\u0106\5a\61\2\u0106\u0107"+
		"\5K&\2\u0107\u0108\5U+\2\u0108\u0109\5c\62\2\u0109\u010a\5C\"\2\u010a"+
		"\34\3\2\2\2\u010b\u010c\5G$\2\u010c\u010d\5W,\2\u010d\u010e\5a\61\2\u010e"+
		"\u010f\5W,\2\u010f\36\3\2\2\2\u0110\u0111\5? \2\u0111\u0112\5;\36\2\u0112"+
		"\u0113\5Q)\2\u0113\u0114\5Q)\2\u0114 \3\2\2\2\u0115\u0116\5]/\2\u0116"+
		"\u0117\5C\"\2\u0117\u0118\5;\36\2\u0118\u0119\5A!\2\u0119\"\3\2\2\2\u011a"+
		"\u011b\5k\66\2\u011b\u011c\5]/\2\u011c\u011d\5K&\2\u011d\u011e\5a\61\2"+
		"\u011e\u011f\5C\"\2\u011f$\3\2\2\2\u0120\u0121\5Q)\2\u0121\u0122\5C\""+
		"\2\u0122\u0123\5U+\2\u0123\u0124\5G$\2\u0124\u0125\5a\61\2\u0125\u0126"+
		"\5I%\2\u0126&\3\2\2\2\u0127\u0128\5U+\2\u0128\u0129\5C\"\2\u0129\u012a"+
		"\5k\66\2\u012a(\3\2\2\2\u012b\u012c\5K&\2\u012c\u012d\5E#\2\u012d*\3\2"+
		"\2\2\u012e\u012f\5a\61\2\u012f\u0130\5I%\2\u0130\u0131\5C\"\2\u0131\u0132"+
		"\5U+\2\u0132,\3\2\2\2\u0133\u0134\5C\"\2\u0134\u0135\5Q)\2\u0135\u0136"+
		"\5_\60\2\u0136\u0137\5C\"\2\u0137.\3\2\2\2\u0138\u0139\5C\"\2\u0139\u013a"+
		"\5U+\2\u013a\u013b\5A!\2\u013b\u013c\5K&\2\u013c\u013d\5E#\2\u013d\60"+
		"\3\2\2\2\u013e\u013f\5A!\2\u013f\u0140\5W,\2\u0140\62\3\2\2\2\u0141\u0142"+
		"\5C\"\2\u0142\u0143\5U+\2\u0143\u0144\5A!\2\u0144\u0145\5A!\2\u0145\u0146"+
		"\5W,\2\u0146\64\3\2\2\2\u0147\u0148\5_\60\2\u0148\u0149\5a\61\2\u0149"+
		"\u014a\5W,\2\u014a\u014b\5Y-\2\u014b\66\3\2\2\2\u014c\u014d\5]/\2\u014d"+
		"\u014e\5C\"\2\u014e\u014f\5a\61\2\u014f\u0150\5c\62\2\u0150\u0151\5]/"+
		"\2\u0151\u0152\5U+\2\u01528\3\2\2\2\u0153\u0155\t\2\2\2\u0154\u0153\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u015b\3\2\2\2\u0158\u015a\t\3\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u017d\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0179\7a\2\2\u015f\u0161\t\3\2\2\u0160\u015f\3\2"+
		"\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0175\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\t\2\2\2\u0166\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u0176\3\2\2\2\u016a\u016c\t\2\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0171\7a\2\2\u0170\u0172\t\2\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0166\3\2\2\2\u0175\u016b\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0162\3\2"+
		"\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\7a\2\2\u017d\u015e\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e:\3\2\2\2\u017f\u0180\t\4\2\2\u0180<\3\2"+
		"\2\2\u0181\u0182\t\5\2\2\u0182>\3\2\2\2\u0183\u0184\t\6\2\2\u0184@\3\2"+
		"\2\2\u0185\u0186\t\7\2\2\u0186B\3\2\2\2\u0187\u0188\t\b\2\2\u0188D\3\2"+
		"\2\2\u0189\u018a\t\t\2\2\u018aF\3\2\2\2\u018b\u018c\t\n\2\2\u018cH\3\2"+
		"\2\2\u018d\u018e\t\13\2\2\u018eJ\3\2\2\2\u018f\u0190\t\f\2\2\u0190L\3"+
		"\2\2\2\u0191\u0192\t\r\2\2\u0192N\3\2\2\2\u0193\u0194\t\16\2\2\u0194P"+
		"\3\2\2\2\u0195\u0196\t\17\2\2\u0196R\3\2\2\2\u0197\u0198\t\20\2\2\u0198"+
		"T\3\2\2\2\u0199\u019a\t\21\2\2\u019aV\3\2\2\2\u019b\u019c\t\22\2\2\u019c"+
		"X\3\2\2\2\u019d\u019e\t\23\2\2\u019eZ\3\2\2\2\u019f\u01a0\t\24\2\2\u01a0"+
		"\\\3\2\2\2\u01a1\u01a2\t\25\2\2\u01a2^\3\2\2\2\u01a3\u01a4\t\26\2\2\u01a4"+
		"`\3\2\2\2\u01a5\u01a6\t\27\2\2\u01a6b\3\2\2\2\u01a7\u01a8\t\30\2\2\u01a8"+
		"d\3\2\2\2\u01a9\u01aa\t\31\2\2\u01aaf\3\2\2\2\u01ab\u01ac\t\32\2\2\u01ac"+
		"h\3\2\2\2\u01ad\u01ae\t\33\2\2\u01aej\3\2\2\2\u01af\u01b0\t\34\2\2\u01b0"+
		"l\3\2\2\2\u01b1\u01b2\t\35\2\2\u01b2n\3\2\2\2\u01b3\u01b4\7*\2\2\u01b4"+
		"p\3\2\2\2\u01b5\u01b6\7+\2\2\u01b6r\3\2\2\2\u01b7\u01b8\7.\2\2\u01b8t"+
		"\3\2\2\2\u01b9\u01ba\7?\2\2\u01bav\3\2\2\2\u01bb\u01bc\7<\2\2\u01bcx\3"+
		"\2\2\2\u01bd\u01be\7]\2\2\u01bez\3\2\2\2\u01bf\u01c0\7_\2\2\u01c0|\3\2"+
		"\2\2\u01c1\u01c2\7\60\2\2\u01c2\u01c3\5W,\2\u01c3\u01c4\5]/\2\u01c4\u01c5"+
		"\7\60\2\2\u01c5~\3\2\2\2\u01c6\u01c7\7\60\2\2\u01c7\u01c8\5;\36\2\u01c8"+
		"\u01c9\5U+\2\u01c9\u01ca\5A!\2\u01ca\u01cb\7\60\2\2\u01cb\u0080\3\2\2"+
		"\2\u01cc\u01cd\7\60\2\2\u01cd\u01ce\5U+\2\u01ce\u01cf\5W,\2\u01cf\u01d0"+
		"\5a\61\2\u01d0\u01d1\7\60\2\2\u01d1\u0082\3\2\2\2\u01d2\u01d3\7\60\2\2"+
		"\u01d3\u01d4\5G$\2\u01d4\u01d5\5a\61\2\u01d5\u01d6\7\60\2\2\u01d6\u01f1"+
		"\3\2\2\2\u01d7\u01d8\7\60\2\2\u01d8\u01d9\5G$\2\u01d9\u01da\5C\"\2\u01da"+
		"\u01db\7\60\2\2\u01db\u01f1\3\2\2\2\u01dc\u01dd\7\60\2\2\u01dd\u01de\5"+
		"Q)\2\u01de\u01df\5a\61\2\u01df\u01e0\7\60\2\2\u01e0\u01f1\3\2\2\2\u01e1"+
		"\u01e2\7\60\2\2\u01e2\u01e3\5Q)\2\u01e3\u01e4\5C\"\2\u01e4\u01e5\7\60"+
		"\2\2\u01e5\u01f1\3\2\2\2\u01e6\u01e7\7\60\2\2\u01e7\u01e8\5C\"\2\u01e8"+
		"\u01e9\5[.\2\u01e9\u01ea\7\60\2\2\u01ea\u01f1\3\2\2\2\u01eb\u01ec\7\60"+
		"\2\2\u01ec\u01ed\5U+\2\u01ed\u01ee\5C\"\2\u01ee\u01ef\7\60\2\2\u01ef\u01f1"+
		"\3\2\2\2\u01f0\u01d2\3\2\2\2\u01f0\u01d7\3\2\2\2\u01f0\u01dc\3\2\2\2\u01f0"+
		"\u01e1\3\2\2\2\u01f0\u01e6\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1\u0084\3\2"+
		"\2\2\u01f2\u01f3\t\36\2\2\u01f3\u0086\3\2\2\2\u01f4\u01f5\7,\2\2\u01f5"+
		"\u0088\3\2\2\2\u01f6\u01f7\7\61\2\2\u01f7\u008a\3\2\2\2\u01f8\u01f9\7"+
		",\2\2\u01f9\u01fa\7,\2\2\u01fa\u008c\3\2\2\2\u01fb\u01fc\7)\2\2\u01fc"+
		"\u01fd\7^\2\2\u01fd\u01fe\7p\2\2\u01fe\u01ff\7)\2\2\u01ff\u008e\3\2\2"+
		"\2\u0200\u0201\7)\2\2\u0201\u0202\7^\2\2\u0202\u0203\7h\2\2\u0203\u0204"+
		"\7)\2\2\u0204\u0090\3\2\2\2\u0205\u0206\7)\2\2\u0206\u0207\7^\2\2\u0207"+
		"\u0208\7v\2\2\u0208\u0209\7)\2\2\u0209\u0092\3\2\2\2\u020a\u020b\7)\2"+
		"\2\u020b\u020c\7^\2\2\u020c\u020d\7t\2\2\u020d\u020e\7)\2\2\u020e\u0094"+
		"\3\2\2\2\u020f\u0210\7)\2\2\u0210\u0211\7^\2\2\u0211\u0212\7d\2\2\u0212"+
		"\u0213\7)\2\2\u0213\u0096\3\2\2\2\u0214\u0215\7)\2\2\u0215\u0216\7^\2"+
		"\2\u0216\u0217\7x\2\2\u0217\u0218\7)\2\2\u0218\u0098\3\2\2\2\u0219\u0259"+
		"\7\62\2\2\u021a\u021c\t\37\2\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2\2\2"+
		"\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0222\3\2\2\2\u021f\u0221"+
		"\t\3\2\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0259\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\7\62"+
		"\2\2\u0226\u022a\7Z\2\2\u0227\u0228\7\62\2\2\u0228\u022a\7z\2\2\u0229"+
		"\u0225\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u022d\t "+
		"\2\2\u022c\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0233\3\2\2\2\u0230\u0232\t!\2\2\u0231\u0230\3\2"+
		"\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0259\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\7\62\2\2\u0237\u023b\7"+
		"Q\2\2\u0238\u0239\7\62\2\2\u0239\u023b\7q\2\2\u023a\u0236\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023e\t\"\2\2\u023d\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0244\3\2\2\2\u0241\u0243\t#\2\2\u0242\u0241\3\2\2\2\u0243\u0246\3\2"+
		"\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0259\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0247\u0248\7\62\2\2\u0248\u024c\7D\2\2\u0249\u024a\7\62"+
		"\2\2\u024a\u024c\7d\2\2\u024b\u0247\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u024f\t$\2\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0255\3\2\2\2\u0252"+
		"\u0254\t%\2\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0255\u0256\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0258"+
		"\u0219\3\2\2\2\u0258\u021b\3\2\2\2\u0258\u0229\3\2\2\2\u0258\u023a\3\2"+
		"\2\2\u0258\u024b\3\2\2\2\u0259\u009a\3\2\2\2\u025a\u025c\t\3\2\2\u025b"+
		"\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0262\7\60\2\2\u0261"+
		"\u0263\t\3\2\2\u0262\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265\u026f\3\2\2\2\u0266\u0268\t\b\2\2\u0267"+
		"\u0269\7/\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2"+
		"\2\2\u026a\u026c\t\3\2\2\u026b\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u0266\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270\u02fa\3\2\2\2\u0271\u0273\t\3\2\2\u0272"+
		"\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276\u027a\7\60\2\2\u0277\u0279\t\3\2\2\u0278"+
		"\u0277\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2"+
		"\2\2\u027b\u0286\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027f\t\b\2\2\u027e"+
		"\u0280\7/\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2"+
		"\2\2\u0281\u0283\t\3\2\2\u0282\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u027d\3\2"+
		"\2\2\u0286\u0287\3\2\2\2\u0287\u02fa\3\2\2\2\u0288\u028c\t\37\2\2\u0289"+
		"\u028b\t\3\2\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2"+
		"\2\2\u028c\u028d\3\2\2\2\u028d\u0292\3\2\2\2\u028e\u028c\3\2\2\2\u028f"+
		"\u0291\7\60\2\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3"+
		"\2\2\2\u0292\u0293\3\2\2\2\u0293\u0298\3\2\2\2\u0294\u0292\3\2\2\2\u0295"+
		"\u0297\t\3\2\2\u0296\u0295\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2"+
		"\2\2\u0298\u0299\3\2\2\2\u0299\u02a4\3\2\2\2\u029a\u0298\3\2\2\2\u029b"+
		"\u029d\t\b\2\2\u029c\u029e\7/\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2"+
		"\2\2\u029e\u02a0\3\2\2\2\u029f\u02a1\t\3\2\2\u02a0\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2"+
		"\2\2\u02a4\u029b\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02fa\3\2\2\2\u02a6"+
		"\u02a7\7\62\2\2\u02a7\u02ab\7Z\2\2\u02a8\u02a9\7\62\2\2\u02a9\u02ab\7"+
		"z\2\2\u02aa\u02a6\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac"+
		"\u02ae\t \2\2\u02ad\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02ad\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b4\3\2\2\2\u02b1\u02b3\t!\2\2\u02b2"+
		"\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02bb\7\60\2\2\u02b8"+
		"\u02ba\t!\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2"+
		"\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be"+
		"\u02c2\n&\2\2\u02bf\u02c1\t!\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2"+
		"\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02fa\3\2\2\2\u02c4\u02c2"+
		"\3\2\2\2\u02c5\u02c6\7\62\2\2\u02c6\u02ca\7Q\2\2\u02c7\u02c8\7\62\2\2"+
		"\u02c8\u02ca\7q\2\2\u02c9\u02c5\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02ce"+
		"\3\2\2\2\u02cb\u02cd\t#\2\2\u02cc\u02cb\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2"+
		"\2\2\u02d1\u02d5\7\60\2\2\u02d2\u02d4\t#\2\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2"+
		"\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02dc\t\"\2\2\u02d9\u02db\t#\2\2\u02da"+
		"\u02d9\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2"+
		"\2\2\u02dd\u02fa\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\7\62\2\2\u02e0"+
		"\u02e4\7D\2\2\u02e1\u02e2\7\62\2\2\u02e2\u02e4\7d\2\2\u02e3\u02df\3\2"+
		"\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e8\3\2\2\2\u02e5\u02e7\t%\2\2\u02e6"+
		"\u02e5\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2"+
		"\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ef\7\60\2\2\u02ec"+
		"\u02ee\t%\2\2\u02ed\u02ec\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2"+
		"\u02f6\t$\2\2\u02f3\u02f5\t%\2\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2"+
		"\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6"+
		"\3\2\2\2\u02f9\u025d\3\2\2\2\u02f9\u0272\3\2\2\2\u02f9\u0288\3\2\2\2\u02f9"+
		"\u02aa\3\2\2\2\u02f9\u02c9\3\2\2\2\u02f9\u02e3\3\2\2\2\u02fa\u009c\3\2"+
		"\2\2\u02fb\u02fc\7\60\2\2\u02fc\u02fd\7V\2\2\u02fd\u02fe\7T\2\2\u02fe"+
		"\u02ff\7W\2\2\u02ff\u0300\7G\2\2\u0300\u0316\7\60\2\2\u0301\u0302\7\60"+
		"\2\2\u0302\u0303\7v\2\2\u0303\u0304\7t\2\2\u0304\u0305\7w\2\2\u0305\u0306"+
		"\7g\2\2\u0306\u0316\7\60\2\2\u0307\u0308\7\60\2\2\u0308\u0309\7H\2\2\u0309"+
		"\u030a\7C\2\2\u030a\u030b\7N\2\2\u030b\u030c\7U\2\2\u030c\u030d\7G\2\2"+
		"\u030d\u0316\7\60\2\2\u030e\u030f\7\60\2\2\u030f\u0310\7h\2\2\u0310\u0311"+
		"\7c\2\2\u0311\u0312\7n\2\2\u0312\u0313\7u\2\2\u0313\u0314\7g\2\2\u0314"+
		"\u0316\7\60\2\2\u0315\u02fb\3\2\2\2\u0315\u0301\3\2\2\2\u0315\u0307\3"+
		"\2\2\2\u0315\u030e\3\2\2\2\u0316\u009e\3\2\2\2\u0317\u0319\7)\2\2\u0318"+
		"\u031a\t\'\2\2\u0319\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0319\3\2"+
		"\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0325\7)\2\2\u031e"+
		"\u0325\5\u008dG\2\u031f\u0325\5\u008fH\2\u0320\u0325\5\u0091I\2\u0321"+
		"\u0325\5\u0093J\2\u0322\u0325\5\u0095K\2\u0323\u0325\5\u0097L\2\u0324"+
		"\u0317\3\2\2\2\u0324\u031e\3\2\2\2\u0324\u031f\3\2\2\2\u0324\u0320\3\2"+
		"\2\2\u0324\u0321\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0323\3\2\2\2\u0325"+
		"\u00a0\3\2\2\2\u0326\u0339\7$\2\2\u0327\u0338\t(\2\2\u0328\u0329\7^\2"+
		"\2\u0329\u0338\7p\2\2\u032a\u032b\7^\2\2\u032b\u0338\7h\2\2\u032c\u032d"+
		"\7^\2\2\u032d\u0338\7v\2\2\u032e\u032f\7^\2\2\u032f\u0338\7t\2\2\u0330"+
		"\u0331\7^\2\2\u0331\u0338\7d\2\2\u0332\u0333\7^\2\2\u0333\u0338\7x\2\2"+
		"\u0334\u0338\7^\2\2\u0335\u0336\7^\2\2\u0336\u0338\7$\2\2\u0337\u0327"+
		"\3\2\2\2\u0337\u0328\3\2\2\2\u0337\u032a\3\2\2\2\u0337\u032c\3\2\2\2\u0337"+
		"\u032e\3\2\2\2\u0337\u0330\3\2\2\2\u0337\u0332\3\2\2\2\u0337\u0334\3\2"+
		"\2\2\u0337\u0335\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339"+
		"\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033d\7$"+
		"\2\2\u033d\u00a2\3\2\2\2\u033e\u034b\7E\2\2\u033f\u0343\7C\2\2\u0340\u0342"+
		"\7F\2\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u034c\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0348\7F"+
		"\2\2\u0347\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u0347\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u033f\3\2\2\2\u034b\u0347\3\2"+
		"\2\2\u034c\u034d\3\2\2\2\u034d\u034e\7T\2\2\u034e\u00a4\3\2\2\2\u034f"+
		"\u0351\t)\2\2\u0350\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0350\3\2"+
		"\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\bS\2\2\u0355"+
		"\u00a6\3\2\2\2\u0356\u035a\7&\2\2\u0357\u0359\t\'\2\2\u0358\u0357\3\2"+
		"\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u035f\t)\2\2\u035e\u035d\3\2"+
		"\2\2\u035f\u0360\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0362\3\2\2\2\u0362\u0363\bT\2\2\u0363\u00a8\3\2\2\2\u0364\u0365\7\2"+
		"\2\3\u0365\u0366\3\2\2\2\u0366\u0367\bU\3\2\u0367\u00aa\3\2\2\2H\2\u0156"+
		"\u015b\u0162\u0168\u016d\u0173\u0175\u0179\u017d\u01f0\u021d\u0222\u0229"+
		"\u022c\u022e\u0231\u0233\u023a\u023f\u0244\u024b\u0250\u0255\u0258\u025d"+
		"\u0264\u0268\u026d\u026f\u0274\u027a\u027f\u0284\u0286\u028c\u0292\u0298"+
		"\u029d\u02a2\u02a4\u02aa\u02ad\u02af\u02b2\u02b4\u02b9\u02bb\u02c0\u02c2"+
		"\u02c9\u02ce\u02d5\u02dc\u02e3\u02e8\u02ef\u02f6\u02f9\u0315\u031b\u0324"+
		"\u0337\u0339\u0343\u0349\u034b\u0352\u035a\u0360\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}