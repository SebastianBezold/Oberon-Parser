// $ANTLR 3.5.1 /home/user/workspace/OberonParser/src/oberon/Oberon.g 2014-05-31 21:44:38
 package oberon; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OberonLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int CHARACTER=4;
	public static final int DIGIT=5;
	public static final int IDENTIFIER=6;
	public static final int INTEGER=7;
	public static final int LETTER=8;
	public static final int OTHER=9;
	public static final int REAL=10;
	public static final int SCALEFACTOR=11;
	public static final int WS=12;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public OberonLexer() {} 
	public OberonLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public OberonLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/user/workspace/OberonParser/src/oberon/Oberon.g"; }

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:9:7: ( '\"' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:9:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:10:7: ( '#' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:10:9: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:11:7: ( '&' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:11:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:12:7: ( '(' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:12:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:13:7: ( ')' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:13:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:14:7: ( '*' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:14:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:15:7: ( '+' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:15:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:16:7: ( ',' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:16:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:17:7: ( '-' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:17:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:18:7: ( '.' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:18:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:19:7: ( '..' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:19:9: '..'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:20:7: ( '/' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:20:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:21:7: ( ':' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:21:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:22:7: ( ':=' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:22:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:23:7: ( ';' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:23:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:24:7: ( '<' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:24:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:25:7: ( '<=' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:25:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:7: ( '=' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:27:7: ( '>' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:27:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:28:7: ( '>=' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:28:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:29:7: ( 'ARRAY' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:29:9: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:30:7: ( 'BEGIN' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:30:9: 'BEGIN'
			{
			match("BEGIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:31:7: ( 'CASE' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:31:9: 'CASE'
			{
			match("CASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:32:7: ( 'CONST' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:32:9: 'CONST'
			{
			match("CONST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:33:7: ( 'DIV' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:33:9: 'DIV'
			{
			match("DIV"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:34:7: ( 'DO' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:34:9: 'DO'
			{
			match("DO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:35:7: ( 'ELSE' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:35:9: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:7: ( 'ELSIF' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:9: 'ELSIF'
			{
			match("ELSIF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:37:7: ( 'END' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:37:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:38:7: ( 'EXIT' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:38:9: 'EXIT'
			{
			match("EXIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:39:7: ( 'IF' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:39:9: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:40:7: ( 'IMPORT' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:40:9: 'IMPORT'
			{
			match("IMPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:41:7: ( 'IN' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:41:9: 'IN'
			{
			match("IN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:42:7: ( 'IS' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:42:9: 'IS'
			{
			match("IS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:43:7: ( 'LOOP' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:43:9: 'LOOP'
			{
			match("LOOP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:44:7: ( 'MOD' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:44:9: 'MOD'
			{
			match("MOD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:45:7: ( 'MODULE' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:45:9: 'MODULE'
			{
			match("MODULE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:46:7: ( 'NIL' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:46:9: 'NIL'
			{
			match("NIL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:47:7: ( 'OF' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:47:9: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:48:7: ( 'OR' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:48:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:49:7: ( 'POINTER' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:49:9: 'POINTER'
			{
			match("POINTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:50:7: ( 'PROCEDURE' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:50:9: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:51:7: ( 'RECORD' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:51:9: 'RECORD'
			{
			match("RECORD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:7: ( 'REPEAT' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:9: 'REPEAT'
			{
			match("REPEAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:53:7: ( 'RETURN' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:53:9: 'RETURN'
			{
			match("RETURN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:54:7: ( 'THEN' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:54:9: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:55:7: ( 'TO' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:55:9: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:56:7: ( 'TYPE' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:56:9: 'TYPE'
			{
			match("TYPE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:57:7: ( 'UNTIL' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:57:9: 'UNTIL'
			{
			match("UNTIL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:58:7: ( 'VAR' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:58:9: 'VAR'
			{
			match("VAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:59:7: ( 'WHILE' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:59:9: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:60:7: ( 'WITH' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:60:9: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:61:7: ( 'X' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:61:9: 'X'
			{
			match('X'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:62:7: ( '[' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:62:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:63:7: ( '\\.\\.' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:63:9: '\\.\\.'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:64:7: ( ']' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:64:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:65:7: ( '^' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:65:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:66:7: ( '{' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:66:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:67:7: ( '|' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:67:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:68:7: ( '}' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:68:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:69:7: ( '~' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:69:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:11:3: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:11:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			{
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:11:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:13:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:14:15: ( '0' .. '9' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "OTHER"
	public final void mOTHER() throws RecognitionException {
		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:15:17: ( ' ' | '.' | ':' | '\\\\\"' )
			int alt2=4;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt2=1;
				}
				break;
			case '.':
				{
				alt2=2;
				}
				break;
			case ':':
				{
				alt2=3;
				}
				break;
			case '\\':
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:15:21: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:15:27: '.'
					{
					match('.'); 
					}
					break;
				case 3 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:15:33: ':'
					{
					match(':'); 
					}
					break;
				case 4 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:15:39: '\\\\\"'
					{
					match("\\\""); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OTHER"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:17:19: ( LETTER | DIGIT | OTHER )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				{
				alt3=1;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				alt3=2;
				}
				break;
			case ' ':
			case '.':
			case ':':
			case '\\':
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:17:21: LETTER
					{
					mLETTER(); 

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:17:30: DIGIT
					{
					mDIGIT(); 

					}
					break;
				case 3 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:17:38: OTHER
					{
					mOTHER(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:21:11: ( LETTER ( LETTER | DIGIT )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:21:13: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:21:20: ( LETTER | DIGIT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:41:8: ( DIGIT ( ( DIGIT )* | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )* 'H' ) )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:41:10: DIGIT ( ( DIGIT )* | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )* 'H' )
			{
			mDIGIT(); 

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:41:16: ( ( DIGIT )* | ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )* 'H' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= 'A' && LA7_0 <= 'F')||LA7_0=='H') ) {
				alt7=2;
			}

			else {
				alt7=1;
			}

			switch (alt7) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:41:17: ( DIGIT )*
					{
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:41:17: ( DIGIT )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:41:26: ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )* 'H'
					{
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:41:26: ( 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= 'A' && LA6_0 <= 'F')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
							{
							if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					match('H'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "REAL"
	public final void mREAL() throws RecognitionException {
		try {
			int _type = REAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:43:5: ( ( DIGIT )+ '.' ( DIGIT )* ( SCALEFACTOR )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:43:7: ( DIGIT )+ '.' ( DIGIT )* ( SCALEFACTOR )?
			{
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:43:7: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match('.'); 
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:43:18: ( DIGIT )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:43:25: ( SCALEFACTOR )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= 'D' && LA10_0 <= 'E')) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:43:25: SCALEFACTOR
					{
					mSCALEFACTOR(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL"

	// $ANTLR start "SCALEFACTOR"
	public final void mSCALEFACTOR() throws RecognitionException {
		try {
			int _type = SCALEFACTOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:45:12: ( ( 'E' | 'D' ) ( '+' | '-' )? DIGIT ( DIGIT )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:45:15: ( 'E' | 'D' ) ( '+' | '-' )? DIGIT ( DIGIT )*
			{
			if ( (input.LA(1) >= 'D' && input.LA(1) <= 'E') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:45:29: ( '+' | '-' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='+'||LA11_0=='-') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mDIGIT(); 

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:45:49: ( DIGIT )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCALEFACTOR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | WS | IDENTIFIER | INTEGER | REAL | SCALEFACTOR )
		int alt13=66;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:10: T__13
				{
				mT__13(); 

				}
				break;
			case 2 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:16: T__14
				{
				mT__14(); 

				}
				break;
			case 3 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:22: T__15
				{
				mT__15(); 

				}
				break;
			case 4 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:28: T__16
				{
				mT__16(); 

				}
				break;
			case 5 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:34: T__17
				{
				mT__17(); 

				}
				break;
			case 6 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:40: T__18
				{
				mT__18(); 

				}
				break;
			case 7 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:46: T__19
				{
				mT__19(); 

				}
				break;
			case 8 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:52: T__20
				{
				mT__20(); 

				}
				break;
			case 9 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:58: T__21
				{
				mT__21(); 

				}
				break;
			case 10 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:64: T__22
				{
				mT__22(); 

				}
				break;
			case 11 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:70: T__23
				{
				mT__23(); 

				}
				break;
			case 12 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:76: T__24
				{
				mT__24(); 

				}
				break;
			case 13 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:82: T__25
				{
				mT__25(); 

				}
				break;
			case 14 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:88: T__26
				{
				mT__26(); 

				}
				break;
			case 15 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:94: T__27
				{
				mT__27(); 

				}
				break;
			case 16 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:100: T__28
				{
				mT__28(); 

				}
				break;
			case 17 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:106: T__29
				{
				mT__29(); 

				}
				break;
			case 18 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:112: T__30
				{
				mT__30(); 

				}
				break;
			case 19 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:118: T__31
				{
				mT__31(); 

				}
				break;
			case 20 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:124: T__32
				{
				mT__32(); 

				}
				break;
			case 21 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:130: T__33
				{
				mT__33(); 

				}
				break;
			case 22 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:136: T__34
				{
				mT__34(); 

				}
				break;
			case 23 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:142: T__35
				{
				mT__35(); 

				}
				break;
			case 24 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:148: T__36
				{
				mT__36(); 

				}
				break;
			case 25 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:154: T__37
				{
				mT__37(); 

				}
				break;
			case 26 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:160: T__38
				{
				mT__38(); 

				}
				break;
			case 27 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:166: T__39
				{
				mT__39(); 

				}
				break;
			case 28 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:172: T__40
				{
				mT__40(); 

				}
				break;
			case 29 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:178: T__41
				{
				mT__41(); 

				}
				break;
			case 30 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:184: T__42
				{
				mT__42(); 

				}
				break;
			case 31 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:190: T__43
				{
				mT__43(); 

				}
				break;
			case 32 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:196: T__44
				{
				mT__44(); 

				}
				break;
			case 33 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:202: T__45
				{
				mT__45(); 

				}
				break;
			case 34 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:208: T__46
				{
				mT__46(); 

				}
				break;
			case 35 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:214: T__47
				{
				mT__47(); 

				}
				break;
			case 36 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:220: T__48
				{
				mT__48(); 

				}
				break;
			case 37 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:226: T__49
				{
				mT__49(); 

				}
				break;
			case 38 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:232: T__50
				{
				mT__50(); 

				}
				break;
			case 39 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:238: T__51
				{
				mT__51(); 

				}
				break;
			case 40 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:244: T__52
				{
				mT__52(); 

				}
				break;
			case 41 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:250: T__53
				{
				mT__53(); 

				}
				break;
			case 42 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:256: T__54
				{
				mT__54(); 

				}
				break;
			case 43 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:262: T__55
				{
				mT__55(); 

				}
				break;
			case 44 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:268: T__56
				{
				mT__56(); 

				}
				break;
			case 45 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:274: T__57
				{
				mT__57(); 

				}
				break;
			case 46 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:280: T__58
				{
				mT__58(); 

				}
				break;
			case 47 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:286: T__59
				{
				mT__59(); 

				}
				break;
			case 48 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:292: T__60
				{
				mT__60(); 

				}
				break;
			case 49 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:298: T__61
				{
				mT__61(); 

				}
				break;
			case 50 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:304: T__62
				{
				mT__62(); 

				}
				break;
			case 51 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:310: T__63
				{
				mT__63(); 

				}
				break;
			case 52 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:316: T__64
				{
				mT__64(); 

				}
				break;
			case 53 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:322: T__65
				{
				mT__65(); 

				}
				break;
			case 54 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:328: T__66
				{
				mT__66(); 

				}
				break;
			case 55 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:334: T__67
				{
				mT__67(); 

				}
				break;
			case 56 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:340: T__68
				{
				mT__68(); 

				}
				break;
			case 57 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:346: T__69
				{
				mT__69(); 

				}
				break;
			case 58 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:352: T__70
				{
				mT__70(); 

				}
				break;
			case 59 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:358: T__71
				{
				mT__71(); 

				}
				break;
			case 60 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:364: T__72
				{
				mT__72(); 

				}
				break;
			case 61 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:370: T__73
				{
				mT__73(); 

				}
				break;
			case 62 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:376: WS
				{
				mWS(); 

				}
				break;
			case 63 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:379: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 64 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:390: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 65 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:398: REAL
				{
				mREAL(); 

				}
				break;
			case 66 :
				// /home/user/workspace/OberonParser/src/oberon/Oberon.g:1:403: SCALEFACTOR
				{
				mSCALEFACTOR(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA13_eotS =
		"\12\uffff\1\56\1\uffff\1\60\1\uffff\1\62\1\uffff\1\64\20\53\1\123\12\uffff"+
		"\1\124\10\uffff\5\53\1\134\1\53\1\uffff\3\53\1\141\1\53\1\143\1\144\3"+
		"\53\1\150\1\151\4\53\1\160\5\53\2\uffff\1\124\1\uffff\4\53\1\172\1\uffff"+
		"\2\53\1\175\1\53\1\uffff\1\53\2\uffff\1\53\1\u0082\1\u0083\2\uffff\6\53"+
		"\1\uffff\2\53\1\u008c\4\53\1\u0091\1\53\1\uffff\1\u0093\1\53\1\uffff\1"+
		"\u0095\1\53\1\u0097\1\53\2\uffff\5\53\1\u009e\1\u009f\1\53\1\uffff\1\53"+
		"\1\u00a2\1\u00a3\1\u00a4\1\uffff\1\u00a5\1\uffff\1\u00a6\1\uffff\1\53"+
		"\1\uffff\6\53\2\uffff\1\u00ae\1\u00af\5\uffff\1\u00b0\1\u00b1\2\53\1\u00b4"+
		"\1\u00b5\1\u00b6\4\uffff\1\u00b7\1\53\4\uffff\1\53\1\u00ba\1\uffff";
	static final String DFA13_eofS =
		"\u00bb\uffff";
	static final String DFA13_minS =
		"\1\0\11\uffff\1\56\1\uffff\1\75\1\uffff\1\75\1\uffff\1\75\1\122\1\105"+
		"\1\101\2\53\1\106\2\117\1\111\1\106\1\117\1\105\1\110\1\116\1\101\1\110"+
		"\1\60\12\uffff\1\56\10\uffff\1\122\1\107\1\123\1\116\1\126\2\60\1\uffff"+
		"\1\123\1\104\1\111\1\60\1\120\2\60\1\117\1\104\1\114\2\60\1\111\1\117"+
		"\1\103\1\105\1\60\1\120\1\124\1\122\1\111\1\124\2\uffff\1\56\1\uffff\1"+
		"\101\1\111\1\105\1\123\1\60\1\uffff\1\60\1\105\1\60\1\124\1\uffff\1\117"+
		"\2\uffff\1\120\2\60\2\uffff\1\116\1\103\1\117\1\105\1\125\1\116\1\uffff"+
		"\1\105\1\111\1\60\1\114\1\110\1\131\1\116\1\60\1\124\1\uffff\1\60\1\106"+
		"\1\uffff\1\60\1\122\1\60\1\114\2\uffff\1\124\1\105\1\122\1\101\1\122\2"+
		"\60\1\114\1\uffff\1\105\3\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\124\1"+
		"\uffff\2\105\2\104\1\124\1\116\2\uffff\2\60\5\uffff\2\60\1\122\1\125\3"+
		"\60\4\uffff\1\60\1\122\4\uffff\1\105\1\60\1\uffff";
	static final String DFA13_maxS =
		"\1\176\11\uffff\1\56\1\uffff\1\75\1\uffff\1\75\1\uffff\1\75\1\122\1\105"+
		"\2\117\1\130\1\123\2\117\1\111\2\122\1\105\1\131\1\116\1\101\1\111\1\172"+
		"\12\uffff\1\71\10\uffff\1\122\1\107\1\123\1\116\1\126\1\172\1\71\1\uffff"+
		"\1\123\1\104\1\111\1\172\1\120\2\172\1\117\1\104\1\114\2\172\1\111\1\117"+
		"\1\124\1\105\1\172\1\120\1\124\1\122\1\111\1\124\2\uffff\1\71\1\uffff"+
		"\1\101\1\111\1\105\1\123\1\172\1\uffff\1\71\1\111\1\172\1\124\1\uffff"+
		"\1\117\2\uffff\1\120\2\172\2\uffff\1\116\1\103\1\117\1\105\1\125\1\116"+
		"\1\uffff\1\105\1\111\1\172\1\114\1\110\1\131\1\116\1\172\1\124\1\uffff"+
		"\1\172\1\106\1\uffff\1\172\1\122\1\172\1\114\2\uffff\1\124\1\105\1\122"+
		"\1\101\1\122\2\172\1\114\1\uffff\1\105\3\172\1\uffff\1\172\1\uffff\1\172"+
		"\1\uffff\1\124\1\uffff\2\105\2\104\1\124\1\116\2\uffff\2\172\5\uffff\2"+
		"\172\1\122\1\125\3\172\4\uffff\1\172\1\122\4\uffff\1\105\1\172\1\uffff";
	static final String DFA13_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\14\1\uffff\1"+
		"\17\1\uffff\1\22\22\uffff\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
		"\1\77\1\uffff\1\13\1\12\1\16\1\15\1\21\1\20\1\24\1\23\7\uffff\1\102\26"+
		"\uffff\1\65\1\100\1\uffff\1\101\5\uffff\1\32\4\uffff\1\37\1\uffff\1\41"+
		"\1\42\3\uffff\1\47\1\50\6\uffff\1\57\11\uffff\1\31\2\uffff\1\35\4\uffff"+
		"\1\44\1\46\10\uffff\1\62\4\uffff\1\27\1\uffff\1\33\1\uffff\1\36\1\uffff"+
		"\1\43\6\uffff\1\56\1\60\2\uffff\1\64\1\25\1\26\1\30\1\34\7\uffff\1\61"+
		"\1\63\1\40\1\45\2\uffff\1\53\1\54\1\55\1\51\2\uffff\1\52";
	static final String DFA13_specialS =
		"\u00bb\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\43\10\uffff\2\52\2\uffff\1\52\22\uffff\1\52\1\uffff\1\1\1\2\2\uffff"+
			"\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12\54\1\14\1\15\1\16"+
			"\1\17\1\20\2\uffff\1\21\1\22\1\23\1\24\1\25\3\53\1\26\2\53\1\27\1\30"+
			"\1\31\1\32\1\33\1\53\1\34\1\53\1\35\1\36\1\37\1\40\1\41\2\53\1\42\1\uffff"+
			"\1\44\1\45\2\uffff\32\53\1\46\1\47\1\50\1\51",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\55",
			"",
			"\1\57",
			"",
			"\1\61",
			"",
			"\1\63",
			"\1\65",
			"\1\66",
			"\1\67\15\uffff\1\70",
			"\1\74\1\uffff\1\74\2\uffff\12\73\17\uffff\1\71\5\uffff\1\72",
			"\1\74\1\uffff\1\74\2\uffff\12\73\22\uffff\1\75\1\uffff\1\76\11\uffff"+
			"\1\77",
			"\1\100\6\uffff\1\101\1\102\4\uffff\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107\13\uffff\1\110",
			"\1\111\2\uffff\1\112",
			"\1\113",
			"\1\114\6\uffff\1\115\11\uffff\1\116",
			"\1\117",
			"\1\120",
			"\1\121\1\122",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\126\1\uffff\12\125",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\135",
			"",
			"\1\136",
			"\1\137",
			"\1\140",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\142",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\145",
			"\1\146",
			"\1\147",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\152",
			"\1\153",
			"\1\154\14\uffff\1\155\3\uffff\1\156",
			"\1\157",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"",
			"",
			"\1\126\1\uffff\12\125",
			"",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\12\135",
			"\1\173\3\uffff\1\174",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\176",
			"",
			"\1\177",
			"",
			"",
			"\1\u0080",
			"\12\53\7\uffff\24\53\1\u0081\5\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"",
			"\1\u008a",
			"\1\u008b",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u0092",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u0094",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u0096",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u0098",
			"",
			"",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u00a0",
			"",
			"\1\u00a1",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\1\u00a7",
			"",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"",
			"",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u00b2",
			"\1\u00b3",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\u00b8",
			"",
			"",
			"",
			"",
			"\1\u00b9",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | WS | IDENTIFIER | INTEGER | REAL | SCALEFACTOR );";
		}
	}

}
