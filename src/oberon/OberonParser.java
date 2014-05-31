// $ANTLR 3.5.1 /home/user/workspace/OberonParser/src/oberon/Oberon.g 2014-05-31 21:44:38
 package oberon; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class OberonParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHARACTER", "DIGIT", "IDENTIFIER", 
		"INTEGER", "LETTER", "OTHER", "REAL", "SCALEFACTOR", "WS", "'\"'", "'#'", 
		"'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'..'", "'/'", 
		"':'", "':='", "';'", "'<'", "'<='", "'='", "'>'", "'>='", "'ARRAY'", 
		"'BEGIN'", "'CASE'", "'CONST'", "'DIV'", "'DO'", "'ELSE'", "'ELSIF'", 
		"'END'", "'EXIT'", "'IF'", "'IMPORT'", "'IN'", "'IS'", "'LOOP'", "'MOD'", 
		"'MODULE'", "'NIL'", "'OF'", "'OR'", "'POINTER'", "'PROCEDURE'", "'RECORD'", 
		"'REPEAT'", "'RETURN'", "'THEN'", "'TO'", "'TYPE'", "'UNTIL'", "'VAR'", 
		"'WHILE'", "'WITH'", "'X'", "'['", "'\\.\\.'", "']'", "'^'", "'{'", "'|'", 
		"'}'", "'~'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public OberonParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public OberonParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return OberonParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/user/workspace/OberonParser/src/oberon/Oberon.g"; }


	public static class module_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "module"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:19:1: module : 'MODULE' IDENTIFIER ';' ( importlist )? declarationsequence ( 'BEGIN' statementsequence )? 'END' IDENTIFIER '.' EOF ;
	public final OberonParser.module_return module() throws RecognitionException {
		OberonParser.module_return retval = new OberonParser.module_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token IDENTIFIER2=null;
		Token char_literal3=null;
		Token string_literal6=null;
		Token string_literal8=null;
		Token IDENTIFIER9=null;
		Token char_literal10=null;
		Token EOF11=null;
		ParserRuleReturnScope importlist4 =null;
		ParserRuleReturnScope declarationsequence5 =null;
		ParserRuleReturnScope statementsequence7 =null;

		Object string_literal1_tree=null;
		Object IDENTIFIER2_tree=null;
		Object char_literal3_tree=null;
		Object string_literal6_tree=null;
		Object string_literal8_tree=null;
		Object IDENTIFIER9_tree=null;
		Object char_literal10_tree=null;
		Object EOF11_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:19:7: ( 'MODULE' IDENTIFIER ';' ( importlist )? declarationsequence ( 'BEGIN' statementsequence )? 'END' IDENTIFIER '.' EOF )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:19:9: 'MODULE' IDENTIFIER ';' ( importlist )? declarationsequence ( 'BEGIN' statementsequence )? 'END' IDENTIFIER '.' EOF
			{
			root_0 = (Object)adaptor.nil();


			string_literal1=(Token)match(input,49,FOLLOW_49_in_module139); 
			string_literal1_tree = (Object)adaptor.create(string_literal1);
			adaptor.addChild(root_0, string_literal1_tree);

			IDENTIFIER2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module141); 
			IDENTIFIER2_tree = (Object)adaptor.create(IDENTIFIER2);
			adaptor.addChild(root_0, IDENTIFIER2_tree);

			char_literal3=(Token)match(input,27,FOLLOW_27_in_module143); 
			char_literal3_tree = (Object)adaptor.create(char_literal3);
			adaptor.addChild(root_0, char_literal3_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:19:33: ( importlist )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==44) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:19:33: importlist
					{
					pushFollow(FOLLOW_importlist_in_module145);
					importlist4=importlist();
					state._fsp--;

					adaptor.addChild(root_0, importlist4.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_declarationsequence_in_module148);
			declarationsequence5=declarationsequence();
			state._fsp--;

			adaptor.addChild(root_0, declarationsequence5.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:19:65: ( 'BEGIN' statementsequence )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==34) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:19:66: 'BEGIN' statementsequence
					{
					string_literal6=(Token)match(input,34,FOLLOW_34_in_module151); 
					string_literal6_tree = (Object)adaptor.create(string_literal6);
					adaptor.addChild(root_0, string_literal6_tree);

					pushFollow(FOLLOW_statementsequence_in_module153);
					statementsequence7=statementsequence();
					state._fsp--;

					adaptor.addChild(root_0, statementsequence7.getTree());

					}
					break;

			}

			string_literal8=(Token)match(input,41,FOLLOW_41_in_module157); 
			string_literal8_tree = (Object)adaptor.create(string_literal8);
			adaptor.addChild(root_0, string_literal8_tree);

			IDENTIFIER9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_module159); 
			IDENTIFIER9_tree = (Object)adaptor.create(IDENTIFIER9);
			adaptor.addChild(root_0, IDENTIFIER9_tree);

			char_literal10=(Token)match(input,22,FOLLOW_22_in_module161); 
			char_literal10_tree = (Object)adaptor.create(char_literal10);
			adaptor.addChild(root_0, char_literal10_tree);

			EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_module163); 
			EOF11_tree = (Object)adaptor.create(EOF11);
			adaptor.addChild(root_0, EOF11_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "module"


	public static class importlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "importlist"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:22:1: importlist : 'IMPORT' importo ( ',' importo )* ';' ;
	public final OberonParser.importlist_return importlist() throws RecognitionException {
		OberonParser.importlist_return retval = new OberonParser.importlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal12=null;
		Token char_literal14=null;
		Token char_literal16=null;
		ParserRuleReturnScope importo13 =null;
		ParserRuleReturnScope importo15 =null;

		Object string_literal12_tree=null;
		Object char_literal14_tree=null;
		Object char_literal16_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:22:11: ( 'IMPORT' importo ( ',' importo )* ';' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:22:13: 'IMPORT' importo ( ',' importo )* ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal12=(Token)match(input,44,FOLLOW_44_in_importlist183); 
			string_literal12_tree = (Object)adaptor.create(string_literal12);
			adaptor.addChild(root_0, string_literal12_tree);

			pushFollow(FOLLOW_importo_in_importlist185);
			importo13=importo();
			state._fsp--;

			adaptor.addChild(root_0, importo13.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:22:30: ( ',' importo )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==20) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:22:31: ',' importo
					{
					char_literal14=(Token)match(input,20,FOLLOW_20_in_importlist188); 
					char_literal14_tree = (Object)adaptor.create(char_literal14);
					adaptor.addChild(root_0, char_literal14_tree);

					pushFollow(FOLLOW_importo_in_importlist190);
					importo15=importo();
					state._fsp--;

					adaptor.addChild(root_0, importo15.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			char_literal16=(Token)match(input,27,FOLLOW_27_in_importlist194); 
			char_literal16_tree = (Object)adaptor.create(char_literal16);
			adaptor.addChild(root_0, char_literal16_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "importlist"


	public static class importo_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "importo"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:23:1: importo : IDENTIFIER ( ':=' IDENTIFIER )? ;
	public final OberonParser.importo_return importo() throws RecognitionException {
		OberonParser.importo_return retval = new OberonParser.importo_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER17=null;
		Token string_literal18=null;
		Token IDENTIFIER19=null;

		Object IDENTIFIER17_tree=null;
		Object string_literal18_tree=null;
		Object IDENTIFIER19_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:23:8: ( IDENTIFIER ( ':=' IDENTIFIER )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:23:10: IDENTIFIER ( ':=' IDENTIFIER )?
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importo200); 
			IDENTIFIER17_tree = (Object)adaptor.create(IDENTIFIER17);
			adaptor.addChild(root_0, IDENTIFIER17_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:23:21: ( ':=' IDENTIFIER )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==26) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:23:22: ':=' IDENTIFIER
					{
					string_literal18=(Token)match(input,26,FOLLOW_26_in_importo203); 
					string_literal18_tree = (Object)adaptor.create(string_literal18);
					adaptor.addChild(root_0, string_literal18_tree);

					IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importo205); 
					IDENTIFIER19_tree = (Object)adaptor.create(IDENTIFIER19);
					adaptor.addChild(root_0, IDENTIFIER19_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "importo"


	public static class declarationsequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declarationsequence"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:1: declarationsequence : ( 'CONST' ( constantdeclaration ';' )* | 'TYPE' ( typedeclaration ';' )* | 'VAR' ( variabledeclaration ';' )* )* ;
	public final OberonParser.declarationsequence_return declarationsequence() throws RecognitionException {
		OberonParser.declarationsequence_return retval = new OberonParser.declarationsequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal20=null;
		Token char_literal22=null;
		Token string_literal23=null;
		Token char_literal25=null;
		Token string_literal26=null;
		Token char_literal28=null;
		ParserRuleReturnScope constantdeclaration21 =null;
		ParserRuleReturnScope typedeclaration24 =null;
		ParserRuleReturnScope variabledeclaration27 =null;

		Object string_literal20_tree=null;
		Object char_literal22_tree=null;
		Object string_literal23_tree=null;
		Object char_literal25_tree=null;
		Object string_literal26_tree=null;
		Object char_literal28_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:20: ( ( 'CONST' ( constantdeclaration ';' )* | 'TYPE' ( typedeclaration ';' )* | 'VAR' ( variabledeclaration ';' )* )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:22: ( 'CONST' ( constantdeclaration ';' )* | 'TYPE' ( typedeclaration ';' )* | 'VAR' ( variabledeclaration ';' )* )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:22: ( 'CONST' ( constantdeclaration ';' )* | 'TYPE' ( typedeclaration ';' )* | 'VAR' ( variabledeclaration ';' )* )*
			loop8:
			while (true) {
				int alt8=4;
				switch ( input.LA(1) ) {
				case 36:
					{
					alt8=1;
					}
					break;
				case 60:
					{
					alt8=2;
					}
					break;
				case 62:
					{
					alt8=3;
					}
					break;
				}
				switch (alt8) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:24: 'CONST' ( constantdeclaration ';' )*
					{
					string_literal20=(Token)match(input,36,FOLLOW_36_in_declarationsequence217); 
					string_literal20_tree = (Object)adaptor.create(string_literal20);
					adaptor.addChild(root_0, string_literal20_tree);

					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:32: ( constantdeclaration ';' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==IDENTIFIER) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:33: constantdeclaration ';'
							{
							pushFollow(FOLLOW_constantdeclaration_in_declarationsequence220);
							constantdeclaration21=constantdeclaration();
							state._fsp--;

							adaptor.addChild(root_0, constantdeclaration21.getTree());

							char_literal22=(Token)match(input,27,FOLLOW_27_in_declarationsequence222); 
							char_literal22_tree = (Object)adaptor.create(char_literal22);
							adaptor.addChild(root_0, char_literal22_tree);

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:61: 'TYPE' ( typedeclaration ';' )*
					{
					string_literal23=(Token)match(input,60,FOLLOW_60_in_declarationsequence228); 
					string_literal23_tree = (Object)adaptor.create(string_literal23);
					adaptor.addChild(root_0, string_literal23_tree);

					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:68: ( typedeclaration ';' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==IDENTIFIER) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:69: typedeclaration ';'
							{
							pushFollow(FOLLOW_typedeclaration_in_declarationsequence231);
							typedeclaration24=typedeclaration();
							state._fsp--;

							adaptor.addChild(root_0, typedeclaration24.getTree());

							char_literal25=(Token)match(input,27,FOLLOW_27_in_declarationsequence233); 
							char_literal25_tree = (Object)adaptor.create(char_literal25);
							adaptor.addChild(root_0, char_literal25_tree);

							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;
				case 3 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:93: 'VAR' ( variabledeclaration ';' )*
					{
					string_literal26=(Token)match(input,62,FOLLOW_62_in_declarationsequence239); 
					string_literal26_tree = (Object)adaptor.create(string_literal26);
					adaptor.addChild(root_0, string_literal26_tree);

					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:99: ( variabledeclaration ';' )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==IDENTIFIER) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:26:100: variabledeclaration ';'
							{
							pushFollow(FOLLOW_variabledeclaration_in_declarationsequence242);
							variabledeclaration27=variabledeclaration();
							state._fsp--;

							adaptor.addChild(root_0, variabledeclaration27.getTree());

							char_literal28=(Token)match(input,27,FOLLOW_27_in_declarationsequence244); 
							char_literal28_tree = (Object)adaptor.create(char_literal28);
							adaptor.addChild(root_0, char_literal28_tree);

							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarationsequence"


	public static class constantdeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantdeclaration"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:28:1: constantdeclaration : identifierdefinition '=' constantexpression ;
	public final OberonParser.constantdeclaration_return constantdeclaration() throws RecognitionException {
		OberonParser.constantdeclaration_return retval = new OberonParser.constantdeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal30=null;
		ParserRuleReturnScope identifierdefinition29 =null;
		ParserRuleReturnScope constantexpression31 =null;

		Object char_literal30_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:28:20: ( identifierdefinition '=' constantexpression )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:28:22: identifierdefinition '=' constantexpression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identifierdefinition_in_constantdeclaration257);
			identifierdefinition29=identifierdefinition();
			state._fsp--;

			adaptor.addChild(root_0, identifierdefinition29.getTree());

			char_literal30=(Token)match(input,30,FOLLOW_30_in_constantdeclaration259); 
			char_literal30_tree = (Object)adaptor.create(char_literal30);
			adaptor.addChild(root_0, char_literal30_tree);

			pushFollow(FOLLOW_constantexpression_in_constantdeclaration261);
			constantexpression31=constantexpression();
			state._fsp--;

			adaptor.addChild(root_0, constantexpression31.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantdeclaration"


	public static class identifierdefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifierdefinition"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:29:1: identifierdefinition : IDENTIFIER ( '*' )? ;
	public final OberonParser.identifierdefinition_return identifierdefinition() throws RecognitionException {
		OberonParser.identifierdefinition_return retval = new OberonParser.identifierdefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER32=null;
		Token char_literal33=null;

		Object IDENTIFIER32_tree=null;
		Object char_literal33_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:29:21: ( IDENTIFIER ( '*' )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:29:23: IDENTIFIER ( '*' )?
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierdefinition267); 
			IDENTIFIER32_tree = (Object)adaptor.create(IDENTIFIER32);
			adaptor.addChild(root_0, IDENTIFIER32_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:29:34: ( '*' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==18) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:29:34: '*'
					{
					char_literal33=(Token)match(input,18,FOLLOW_18_in_identifierdefinition269); 
					char_literal33_tree = (Object)adaptor.create(char_literal33);
					adaptor.addChild(root_0, char_literal33_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifierdefinition"


	public static class constantexpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantexpression"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:31:1: constantexpression : expression ;
	public final OberonParser.constantexpression_return constantexpression() throws RecognitionException {
		OberonParser.constantexpression_return retval = new OberonParser.constantexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression34 =null;


		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:31:19: ( expression )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:31:21: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_constantexpression277);
			expression34=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression34.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantexpression"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:32:1: expression : simpleexpression ( relation simpleexpression )? ;
	public final OberonParser.expression_return expression() throws RecognitionException {
		OberonParser.expression_return retval = new OberonParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleexpression35 =null;
		ParserRuleReturnScope relation36 =null;
		ParserRuleReturnScope simpleexpression37 =null;


		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:32:11: ( simpleexpression ( relation simpleexpression )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:32:13: simpleexpression ( relation simpleexpression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_simpleexpression_in_expression283);
			simpleexpression35=simpleexpression();
			state._fsp--;

			adaptor.addChild(root_0, simpleexpression35.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:32:30: ( relation simpleexpression )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==14||(LA10_0 >= 28 && LA10_0 <= 32)||(LA10_0 >= 45 && LA10_0 <= 46)) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:32:31: relation simpleexpression
					{
					pushFollow(FOLLOW_relation_in_expression286);
					relation36=relation();
					state._fsp--;

					adaptor.addChild(root_0, relation36.getTree());

					pushFollow(FOLLOW_simpleexpression_in_expression288);
					simpleexpression37=simpleexpression();
					state._fsp--;

					adaptor.addChild(root_0, simpleexpression37.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class simpleexpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleexpression"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:34:1: simpleexpression : ( '+' | '-' )? term ( addoperator term )* ;
	public final OberonParser.simpleexpression_return simpleexpression() throws RecognitionException {
		OberonParser.simpleexpression_return retval = new OberonParser.simpleexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set38=null;
		ParserRuleReturnScope term39 =null;
		ParserRuleReturnScope addoperator40 =null;
		ParserRuleReturnScope term41 =null;

		Object set38_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:34:17: ( ( '+' | '-' )? term ( addoperator term )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:34:19: ( '+' | '-' )? term ( addoperator term )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:34:19: ( '+' | '-' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==19||LA11_0==21) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
					{
					set38=input.LT(1);
					if ( input.LA(1)==19||input.LA(1)==21 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set38));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_term_in_simpleexpression304);
			term39=term();
			state._fsp--;

			adaptor.addChild(root_0, term39.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:34:35: ( addoperator term )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==19||LA12_0==21||LA12_0==52) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:34:36: addoperator term
					{
					pushFollow(FOLLOW_addoperator_in_simpleexpression307);
					addoperator40=addoperator();
					state._fsp--;

					adaptor.addChild(root_0, addoperator40.getTree());

					pushFollow(FOLLOW_term_in_simpleexpression309);
					term41=term();
					state._fsp--;

					adaptor.addChild(root_0, term41.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleexpression"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:35:1: term : factor ( multoperator factor )* ;
	public final OberonParser.term_return term() throws RecognitionException {
		OberonParser.term_return retval = new OberonParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope factor42 =null;
		ParserRuleReturnScope multoperator43 =null;
		ParserRuleReturnScope factor44 =null;


		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:35:5: ( factor ( multoperator factor )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:35:7: factor ( multoperator factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term317);
			factor42=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor42.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:35:14: ( multoperator factor )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==15||LA13_0==18||LA13_0==24||LA13_0==37||LA13_0==48) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:35:15: multoperator factor
					{
					pushFollow(FOLLOW_multoperator_in_term320);
					multoperator43=multoperator();
					state._fsp--;

					adaptor.addChild(root_0, multoperator43.getTree());

					pushFollow(FOLLOW_factor_in_term322);
					factor44=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor44.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:1: factor : ( number | charconstant | string | 'NIL' | set | designator ( actualparameters )? | '(' expression ')' | '~' factor );
	public final OberonParser.factor_return factor() throws RecognitionException {
		OberonParser.factor_return retval = new OberonParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal48=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token char_literal55=null;
		ParserRuleReturnScope number45 =null;
		ParserRuleReturnScope charconstant46 =null;
		ParserRuleReturnScope string47 =null;
		ParserRuleReturnScope set49 =null;
		ParserRuleReturnScope designator50 =null;
		ParserRuleReturnScope actualparameters51 =null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope factor56 =null;

		Object string_literal48_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		Object char_literal55_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:7: ( number | charconstant | string | 'NIL' | set | designator ( actualparameters )? | '(' expression ')' | '~' factor )
			int alt15=8;
			switch ( input.LA(1) ) {
			case INTEGER:
			case REAL:
				{
				alt15=1;
				}
				break;
			case 13:
				{
				int LA15_2 = input.LA(2);
				if ( (LA15_2==CHARACTER) ) {
					int LA15_9 = input.LA(3);
					if ( (LA15_9==13) ) {
						alt15=2;
					}
					else if ( (LA15_9==CHARACTER) ) {
						alt15=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 15, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA15_2==13) ) {
					alt15=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DIGIT:
				{
				alt15=2;
				}
				break;
			case 50:
				{
				alt15=4;
				}
				break;
			case 70:
				{
				alt15=5;
				}
				break;
			case IDENTIFIER:
				{
				alt15=6;
				}
				break;
			case 16:
				{
				alt15=7;
				}
				break;
			case 73:
				{
				alt15=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:9: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_factor330);
					number45=number();
					state._fsp--;

					adaptor.addChild(root_0, number45.getTree());

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:18: charconstant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_charconstant_in_factor334);
					charconstant46=charconstant();
					state._fsp--;

					adaptor.addChild(root_0, charconstant46.getTree());

					}
					break;
				case 3 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:33: string
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_in_factor338);
					string47=string();
					state._fsp--;

					adaptor.addChild(root_0, string47.getTree());

					}
					break;
				case 4 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:42: 'NIL'
					{
					root_0 = (Object)adaptor.nil();


					string_literal48=(Token)match(input,50,FOLLOW_50_in_factor342); 
					string_literal48_tree = (Object)adaptor.create(string_literal48);
					adaptor.addChild(root_0, string_literal48_tree);

					}
					break;
				case 5 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:50: set
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_factor346);
					set49=set();
					state._fsp--;

					adaptor.addChild(root_0, set49.getTree());

					}
					break;
				case 6 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:56: designator ( actualparameters )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_designator_in_factor350);
					designator50=designator();
					state._fsp--;

					adaptor.addChild(root_0, designator50.getTree());

					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:67: ( actualparameters )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==16) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:67: actualparameters
							{
							pushFollow(FOLLOW_actualparameters_in_factor352);
							actualparameters51=actualparameters();
							state._fsp--;

							adaptor.addChild(root_0, actualparameters51.getTree());

							}
							break;

					}

					}
					break;
				case 7 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:87: '(' expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal52=(Token)match(input,16,FOLLOW_16_in_factor357); 
					char_literal52_tree = (Object)adaptor.create(char_literal52);
					adaptor.addChild(root_0, char_literal52_tree);

					pushFollow(FOLLOW_expression_in_factor359);
					expression53=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression53.getTree());

					char_literal54=(Token)match(input,17,FOLLOW_17_in_factor361); 
					char_literal54_tree = (Object)adaptor.create(char_literal54);
					adaptor.addChild(root_0, char_literal54_tree);

					}
					break;
				case 8 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:36:108: '~' factor
					{
					root_0 = (Object)adaptor.nil();


					char_literal55=(Token)match(input,73,FOLLOW_73_in_factor365); 
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);

					pushFollow(FOLLOW_factor_in_factor367);
					factor56=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor56.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class number_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "number"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:40:1: number : ( INTEGER | REAL );
	public final OberonParser.number_return number() throws RecognitionException {
		OberonParser.number_return retval = new OberonParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set57=null;

		Object set57_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:40:7: ( INTEGER | REAL )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set57=input.LT(1);
			if ( input.LA(1)==INTEGER||input.LA(1)==REAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set57));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number"


	public static class charconstant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "charconstant"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:47:1: charconstant : ( '\"' CHARACTER '\"' | DIGIT ( INTEGER )* 'X' );
	public final OberonParser.charconstant_return charconstant() throws RecognitionException {
		OberonParser.charconstant_return retval = new OberonParser.charconstant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal58=null;
		Token CHARACTER59=null;
		Token char_literal60=null;
		Token DIGIT61=null;
		Token INTEGER62=null;
		Token char_literal63=null;

		Object char_literal58_tree=null;
		Object CHARACTER59_tree=null;
		Object char_literal60_tree=null;
		Object DIGIT61_tree=null;
		Object INTEGER62_tree=null;
		Object char_literal63_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:47:13: ( '\"' CHARACTER '\"' | DIGIT ( INTEGER )* 'X' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==13) ) {
				alt17=1;
			}
			else if ( (LA17_0==DIGIT) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:47:15: '\"' CHARACTER '\"'
					{
					root_0 = (Object)adaptor.nil();


					char_literal58=(Token)match(input,13,FOLLOW_13_in_charconstant475); 
					char_literal58_tree = (Object)adaptor.create(char_literal58);
					adaptor.addChild(root_0, char_literal58_tree);

					CHARACTER59=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_charconstant477); 
					CHARACTER59_tree = (Object)adaptor.create(CHARACTER59);
					adaptor.addChild(root_0, CHARACTER59_tree);

					char_literal60=(Token)match(input,13,FOLLOW_13_in_charconstant479); 
					char_literal60_tree = (Object)adaptor.create(char_literal60);
					adaptor.addChild(root_0, char_literal60_tree);

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:47:35: DIGIT ( INTEGER )* 'X'
					{
					root_0 = (Object)adaptor.nil();


					DIGIT61=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_charconstant483); 
					DIGIT61_tree = (Object)adaptor.create(DIGIT61);
					adaptor.addChild(root_0, DIGIT61_tree);

					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:47:41: ( INTEGER )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==INTEGER) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:47:41: INTEGER
							{
							INTEGER62=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_charconstant485); 
							INTEGER62_tree = (Object)adaptor.create(INTEGER62);
							adaptor.addChild(root_0, INTEGER62_tree);

							}
							break;

						default :
							break loop16;
						}
					}

					char_literal63=(Token)match(input,65,FOLLOW_65_in_charconstant488); 
					char_literal63_tree = (Object)adaptor.create(char_literal63);
					adaptor.addChild(root_0, char_literal63_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "charconstant"


	public static class string_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:49:1: string : '\"' ( CHARACTER )* '\"' ;
	public final OberonParser.string_return string() throws RecognitionException {
		OberonParser.string_return retval = new OberonParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal64=null;
		Token CHARACTER65=null;
		Token char_literal66=null;

		Object char_literal64_tree=null;
		Object CHARACTER65_tree=null;
		Object char_literal66_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:49:7: ( '\"' ( CHARACTER )* '\"' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:49:9: '\"' ( CHARACTER )* '\"'
			{
			root_0 = (Object)adaptor.nil();


			char_literal64=(Token)match(input,13,FOLLOW_13_in_string495); 
			char_literal64_tree = (Object)adaptor.create(char_literal64);
			adaptor.addChild(root_0, char_literal64_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:49:13: ( CHARACTER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==CHARACTER) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:49:13: CHARACTER
					{
					CHARACTER65=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_string497); 
					CHARACTER65_tree = (Object)adaptor.create(CHARACTER65);
					adaptor.addChild(root_0, CHARACTER65_tree);

					}
					break;

				default :
					break loop18;
				}
			}

			char_literal66=(Token)match(input,13,FOLLOW_13_in_string500); 
			char_literal66_tree = (Object)adaptor.create(char_literal66);
			adaptor.addChild(root_0, char_literal66_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string"


	public static class set_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "set"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:50:1: set : '{' ( element ( ',' element )* )? '}' ;
	public final OberonParser.set_return set() throws RecognitionException {
		OberonParser.set_return retval = new OberonParser.set_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal67=null;
		Token char_literal69=null;
		Token char_literal71=null;
		ParserRuleReturnScope element68 =null;
		ParserRuleReturnScope element70 =null;

		Object char_literal67_tree=null;
		Object char_literal69_tree=null;
		Object char_literal71_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:50:4: ( '{' ( element ( ',' element )* )? '}' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:50:6: '{' ( element ( ',' element )* )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal67=(Token)match(input,70,FOLLOW_70_in_set506); 
			char_literal67_tree = (Object)adaptor.create(char_literal67);
			adaptor.addChild(root_0, char_literal67_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:50:10: ( element ( ',' element )* )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= DIGIT && LA20_0 <= INTEGER)||LA20_0==REAL||LA20_0==13||LA20_0==16||LA20_0==19||LA20_0==21||LA20_0==50||LA20_0==70||LA20_0==73) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:50:11: element ( ',' element )*
					{
					pushFollow(FOLLOW_element_in_set509);
					element68=element();
					state._fsp--;

					adaptor.addChild(root_0, element68.getTree());

					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:50:19: ( ',' element )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==20) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:50:20: ',' element
							{
							char_literal69=(Token)match(input,20,FOLLOW_20_in_set512); 
							char_literal69_tree = (Object)adaptor.create(char_literal69);
							adaptor.addChild(root_0, char_literal69_tree);

							pushFollow(FOLLOW_element_in_set514);
							element70=element();
							state._fsp--;

							adaptor.addChild(root_0, element70.getTree());

							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;

			}

			char_literal71=(Token)match(input,72,FOLLOW_72_in_set520); 
			char_literal71_tree = (Object)adaptor.create(char_literal71);
			adaptor.addChild(root_0, char_literal71_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set"


	public static class element_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "element"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:51:1: element : expression ( '..' expression )? ;
	public final OberonParser.element_return element() throws RecognitionException {
		OberonParser.element_return retval = new OberonParser.element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal73=null;
		ParserRuleReturnScope expression72 =null;
		ParserRuleReturnScope expression74 =null;

		Object string_literal73_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:51:8: ( expression ( '..' expression )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:51:10: expression ( '..' expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_element526);
			expression72=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression72.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:51:21: ( '..' expression )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==23) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:51:22: '..' expression
					{
					string_literal73=(Token)match(input,23,FOLLOW_23_in_element529); 
					string_literal73_tree = (Object)adaptor.create(string_literal73);
					adaptor.addChild(root_0, string_literal73_tree);

					pushFollow(FOLLOW_expression_in_element531);
					expression74=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression74.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "element"


	public static class designator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "designator"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:1: designator : qualifiedidentifier ( '.' IDENTIFIER | '[' expressionlist ']' | '(' qualifiedidentifier ')' | '^' )* ;
	public final OberonParser.designator_return designator() throws RecognitionException {
		OberonParser.designator_return retval = new OberonParser.designator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal76=null;
		Token IDENTIFIER77=null;
		Token char_literal78=null;
		Token char_literal80=null;
		Token char_literal81=null;
		Token char_literal83=null;
		Token char_literal84=null;
		ParserRuleReturnScope qualifiedidentifier75 =null;
		ParserRuleReturnScope expressionlist79 =null;
		ParserRuleReturnScope qualifiedidentifier82 =null;

		Object char_literal76_tree=null;
		Object IDENTIFIER77_tree=null;
		Object char_literal78_tree=null;
		Object char_literal80_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		Object char_literal84_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:11: ( qualifiedidentifier ( '.' IDENTIFIER | '[' expressionlist ']' | '(' qualifiedidentifier ')' | '^' )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:13: qualifiedidentifier ( '.' IDENTIFIER | '[' expressionlist ']' | '(' qualifiedidentifier ')' | '^' )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualifiedidentifier_in_designator539);
			qualifiedidentifier75=qualifiedidentifier();
			state._fsp--;

			adaptor.addChild(root_0, qualifiedidentifier75.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:33: ( '.' IDENTIFIER | '[' expressionlist ']' | '(' qualifiedidentifier ')' | '^' )*
			loop22:
			while (true) {
				int alt22=5;
				switch ( input.LA(1) ) {
				case 16:
					{
					int LA22_1 = input.LA(2);
					if ( (LA22_1==IDENTIFIER) ) {
						int LA22_6 = input.LA(3);
						if ( (LA22_6==22) ) {
							int LA22_7 = input.LA(4);
							if ( (LA22_7==IDENTIFIER) ) {
								int LA22_9 = input.LA(5);
								if ( (LA22_9==17) ) {
									alt22=3;
								}

							}

						}
						else if ( (LA22_6==17) ) {
							alt22=3;
						}

					}

					}
					break;
				case 22:
					{
					alt22=1;
					}
					break;
				case 66:
					{
					alt22=2;
					}
					break;
				case 69:
					{
					alt22=4;
					}
					break;
				}
				switch (alt22) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:34: '.' IDENTIFIER
					{
					char_literal76=(Token)match(input,22,FOLLOW_22_in_designator542); 
					char_literal76_tree = (Object)adaptor.create(char_literal76);
					adaptor.addChild(root_0, char_literal76_tree);

					IDENTIFIER77=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_designator544); 
					IDENTIFIER77_tree = (Object)adaptor.create(IDENTIFIER77);
					adaptor.addChild(root_0, IDENTIFIER77_tree);

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:51: '[' expressionlist ']'
					{
					char_literal78=(Token)match(input,66,FOLLOW_66_in_designator548); 
					char_literal78_tree = (Object)adaptor.create(char_literal78);
					adaptor.addChild(root_0, char_literal78_tree);

					pushFollow(FOLLOW_expressionlist_in_designator550);
					expressionlist79=expressionlist();
					state._fsp--;

					adaptor.addChild(root_0, expressionlist79.getTree());

					char_literal80=(Token)match(input,68,FOLLOW_68_in_designator552); 
					char_literal80_tree = (Object)adaptor.create(char_literal80);
					adaptor.addChild(root_0, char_literal80_tree);

					}
					break;
				case 3 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:76: '(' qualifiedidentifier ')'
					{
					char_literal81=(Token)match(input,16,FOLLOW_16_in_designator556); 
					char_literal81_tree = (Object)adaptor.create(char_literal81);
					adaptor.addChild(root_0, char_literal81_tree);

					pushFollow(FOLLOW_qualifiedidentifier_in_designator558);
					qualifiedidentifier82=qualifiedidentifier();
					state._fsp--;

					adaptor.addChild(root_0, qualifiedidentifier82.getTree());

					char_literal83=(Token)match(input,17,FOLLOW_17_in_designator560); 
					char_literal83_tree = (Object)adaptor.create(char_literal83);
					adaptor.addChild(root_0, char_literal83_tree);

					}
					break;
				case 4 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:52:106: '^'
					{
					char_literal84=(Token)match(input,69,FOLLOW_69_in_designator564); 
					char_literal84_tree = (Object)adaptor.create(char_literal84);
					adaptor.addChild(root_0, char_literal84_tree);

					}
					break;

				default :
					break loop22;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "designator"


	public static class expressionlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionlist"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:54:1: expressionlist : expression ( ',' expression )* ;
	public final OberonParser.expressionlist_return expressionlist() throws RecognitionException {
		OberonParser.expressionlist_return retval = new OberonParser.expressionlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal86=null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope expression87 =null;

		Object char_literal86_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:54:15: ( expression ( ',' expression )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:54:17: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionlist573);
			expression85=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression85.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:54:28: ( ',' expression )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==20) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:54:30: ',' expression
					{
					char_literal86=(Token)match(input,20,FOLLOW_20_in_expressionlist577); 
					char_literal86_tree = (Object)adaptor.create(char_literal86);
					adaptor.addChild(root_0, char_literal86_tree);

					pushFollow(FOLLOW_expression_in_expressionlist579);
					expression87=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression87.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionlist"


	public static class actualparameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actualparameters"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:55:1: actualparameters : '(' ( expressionlist )? ')' ;
	public final OberonParser.actualparameters_return actualparameters() throws RecognitionException {
		OberonParser.actualparameters_return retval = new OberonParser.actualparameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope expressionlist89 =null;

		Object char_literal88_tree=null;
		Object char_literal90_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:55:17: ( '(' ( expressionlist )? ')' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:55:19: '(' ( expressionlist )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal88=(Token)match(input,16,FOLLOW_16_in_actualparameters587); 
			char_literal88_tree = (Object)adaptor.create(char_literal88);
			adaptor.addChild(root_0, char_literal88_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:55:23: ( expressionlist )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= DIGIT && LA24_0 <= INTEGER)||LA24_0==REAL||LA24_0==13||LA24_0==16||LA24_0==19||LA24_0==21||LA24_0==50||LA24_0==70||LA24_0==73) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:55:23: expressionlist
					{
					pushFollow(FOLLOW_expressionlist_in_actualparameters589);
					expressionlist89=expressionlist();
					state._fsp--;

					adaptor.addChild(root_0, expressionlist89.getTree());

					}
					break;

			}

			char_literal90=(Token)match(input,17,FOLLOW_17_in_actualparameters592); 
			char_literal90_tree = (Object)adaptor.create(char_literal90);
			adaptor.addChild(root_0, char_literal90_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actualparameters"


	public static class multoperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multoperator"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:57:1: multoperator : ( '*' | '/' | 'DIV' | 'MOD' | '&' );
	public final OberonParser.multoperator_return multoperator() throws RecognitionException {
		OberonParser.multoperator_return retval = new OberonParser.multoperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set91=null;

		Object set91_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:57:13: ( '*' | '/' | 'DIV' | 'MOD' | '&' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set91=input.LT(1);
			if ( input.LA(1)==15||input.LA(1)==18||input.LA(1)==24||input.LA(1)==37||input.LA(1)==48 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set91));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multoperator"


	public static class addoperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addoperator"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:58:1: addoperator : ( '+' | '-' | 'OR' );
	public final OberonParser.addoperator_return addoperator() throws RecognitionException {
		OberonParser.addoperator_return retval = new OberonParser.addoperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set92=null;

		Object set92_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:58:12: ( '+' | '-' | 'OR' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set92=input.LT(1);
			if ( input.LA(1)==19||input.LA(1)==21||input.LA(1)==52 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set92));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addoperator"


	public static class relation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relation"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:59:1: relation : ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' );
	public final OberonParser.relation_return relation() throws RecognitionException {
		OberonParser.relation_return retval = new OberonParser.relation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set93=null;

		Object set93_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:59:9: ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set93=input.LT(1);
			if ( input.LA(1)==14||(input.LA(1) >= 28 && input.LA(1) <= 32)||(input.LA(1) >= 45 && input.LA(1) <= 46) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set93));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation"


	public static class typedeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedeclaration"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:61:1: typedeclaration : identifierdefinition '=' type ;
	public final OberonParser.typedeclaration_return typedeclaration() throws RecognitionException {
		OberonParser.typedeclaration_return retval = new OberonParser.typedeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal95=null;
		ParserRuleReturnScope identifierdefinition94 =null;
		ParserRuleReturnScope type96 =null;

		Object char_literal95_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:61:16: ( identifierdefinition '=' type )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:61:18: identifierdefinition '=' type
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identifierdefinition_in_typedeclaration670);
			identifierdefinition94=identifierdefinition();
			state._fsp--;

			adaptor.addChild(root_0, identifierdefinition94.getTree());

			char_literal95=(Token)match(input,30,FOLLOW_30_in_typedeclaration672); 
			char_literal95_tree = (Object)adaptor.create(char_literal95);
			adaptor.addChild(root_0, char_literal95_tree);

			pushFollow(FOLLOW_type_in_typedeclaration674);
			type96=type();
			state._fsp--;

			adaptor.addChild(root_0, type96.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedeclaration"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:62:1: type : ( qualifiedidentifier | arraytype | recordtype | pointertype | proceduretype );
	public final OberonParser.type_return type() throws RecognitionException {
		OberonParser.type_return retval = new OberonParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope qualifiedidentifier97 =null;
		ParserRuleReturnScope arraytype98 =null;
		ParserRuleReturnScope recordtype99 =null;
		ParserRuleReturnScope pointertype100 =null;
		ParserRuleReturnScope proceduretype101 =null;


		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:62:5: ( qualifiedidentifier | arraytype | recordtype | pointertype | proceduretype )
			int alt25=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt25=1;
				}
				break;
			case 33:
				{
				alt25=2;
				}
				break;
			case 55:
				{
				alt25=3;
				}
				break;
			case 53:
				{
				alt25=4;
				}
				break;
			case 54:
				{
				alt25=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:62:7: qualifiedidentifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qualifiedidentifier_in_type680);
					qualifiedidentifier97=qualifiedidentifier();
					state._fsp--;

					adaptor.addChild(root_0, qualifiedidentifier97.getTree());

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:62:29: arraytype
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arraytype_in_type684);
					arraytype98=arraytype();
					state._fsp--;

					adaptor.addChild(root_0, arraytype98.getTree());

					}
					break;
				case 3 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:62:41: recordtype
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_recordtype_in_type688);
					recordtype99=recordtype();
					state._fsp--;

					adaptor.addChild(root_0, recordtype99.getTree());

					}
					break;
				case 4 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:62:54: pointertype
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pointertype_in_type692);
					pointertype100=pointertype();
					state._fsp--;

					adaptor.addChild(root_0, pointertype100.getTree());

					}
					break;
				case 5 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:62:68: proceduretype
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_proceduretype_in_type696);
					proceduretype101=proceduretype();
					state._fsp--;

					adaptor.addChild(root_0, proceduretype101.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class qualifiedidentifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qualifiedidentifier"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:64:1: qualifiedidentifier : IDENTIFIER ( '.' IDENTIFIER )? ;
	public final OberonParser.qualifiedidentifier_return qualifiedidentifier() throws RecognitionException {
		OberonParser.qualifiedidentifier_return retval = new OberonParser.qualifiedidentifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER102=null;
		Token char_literal103=null;
		Token IDENTIFIER104=null;

		Object IDENTIFIER102_tree=null;
		Object char_literal103_tree=null;
		Object IDENTIFIER104_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:64:20: ( IDENTIFIER ( '.' IDENTIFIER )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:64:22: IDENTIFIER ( '.' IDENTIFIER )?
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER102=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedidentifier703); 
			IDENTIFIER102_tree = (Object)adaptor.create(IDENTIFIER102);
			adaptor.addChild(root_0, IDENTIFIER102_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:64:33: ( '.' IDENTIFIER )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==22) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==IDENTIFIER) ) {
					alt26=1;
				}
			}
			switch (alt26) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:64:34: '.' IDENTIFIER
					{
					char_literal103=(Token)match(input,22,FOLLOW_22_in_qualifiedidentifier706); 
					char_literal103_tree = (Object)adaptor.create(char_literal103);
					adaptor.addChild(root_0, char_literal103_tree);

					IDENTIFIER104=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedidentifier708); 
					IDENTIFIER104_tree = (Object)adaptor.create(IDENTIFIER104);
					adaptor.addChild(root_0, IDENTIFIER104_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qualifiedidentifier"


	public static class arraytype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arraytype"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:65:1: arraytype : 'ARRAY' length ( ',' length )* 'OF' type ;
	public final OberonParser.arraytype_return arraytype() throws RecognitionException {
		OberonParser.arraytype_return retval = new OberonParser.arraytype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal105=null;
		Token char_literal107=null;
		Token string_literal109=null;
		ParserRuleReturnScope length106 =null;
		ParserRuleReturnScope length108 =null;
		ParserRuleReturnScope type110 =null;

		Object string_literal105_tree=null;
		Object char_literal107_tree=null;
		Object string_literal109_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:65:10: ( 'ARRAY' length ( ',' length )* 'OF' type )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:65:12: 'ARRAY' length ( ',' length )* 'OF' type
			{
			root_0 = (Object)adaptor.nil();


			string_literal105=(Token)match(input,33,FOLLOW_33_in_arraytype716); 
			string_literal105_tree = (Object)adaptor.create(string_literal105);
			adaptor.addChild(root_0, string_literal105_tree);

			pushFollow(FOLLOW_length_in_arraytype718);
			length106=length();
			state._fsp--;

			adaptor.addChild(root_0, length106.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:65:27: ( ',' length )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==20) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:65:28: ',' length
					{
					char_literal107=(Token)match(input,20,FOLLOW_20_in_arraytype721); 
					char_literal107_tree = (Object)adaptor.create(char_literal107);
					adaptor.addChild(root_0, char_literal107_tree);

					pushFollow(FOLLOW_length_in_arraytype723);
					length108=length();
					state._fsp--;

					adaptor.addChild(root_0, length108.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			string_literal109=(Token)match(input,51,FOLLOW_51_in_arraytype727); 
			string_literal109_tree = (Object)adaptor.create(string_literal109);
			adaptor.addChild(root_0, string_literal109_tree);

			pushFollow(FOLLOW_type_in_arraytype729);
			type110=type();
			state._fsp--;

			adaptor.addChild(root_0, type110.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arraytype"


	public static class length_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "length"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:66:1: length : constantexpression ;
	public final OberonParser.length_return length() throws RecognitionException {
		OberonParser.length_return retval = new OberonParser.length_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constantexpression111 =null;


		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:66:7: ( constantexpression )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:66:9: constantexpression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constantexpression_in_length735);
			constantexpression111=constantexpression();
			state._fsp--;

			adaptor.addChild(root_0, constantexpression111.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "length"


	public static class recordtype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "recordtype"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:68:1: recordtype : 'RECORD' ( '(' basetype ')' )? fieldlistsequence 'END' ;
	public final OberonParser.recordtype_return recordtype() throws RecognitionException {
		OberonParser.recordtype_return retval = new OberonParser.recordtype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal112=null;
		Token char_literal113=null;
		Token char_literal115=null;
		Token string_literal117=null;
		ParserRuleReturnScope basetype114 =null;
		ParserRuleReturnScope fieldlistsequence116 =null;

		Object string_literal112_tree=null;
		Object char_literal113_tree=null;
		Object char_literal115_tree=null;
		Object string_literal117_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:68:11: ( 'RECORD' ( '(' basetype ')' )? fieldlistsequence 'END' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:68:13: 'RECORD' ( '(' basetype ')' )? fieldlistsequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal112=(Token)match(input,55,FOLLOW_55_in_recordtype742); 
			string_literal112_tree = (Object)adaptor.create(string_literal112);
			adaptor.addChild(root_0, string_literal112_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:68:22: ( '(' basetype ')' )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==16) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:68:23: '(' basetype ')'
					{
					char_literal113=(Token)match(input,16,FOLLOW_16_in_recordtype745); 
					char_literal113_tree = (Object)adaptor.create(char_literal113);
					adaptor.addChild(root_0, char_literal113_tree);

					pushFollow(FOLLOW_basetype_in_recordtype747);
					basetype114=basetype();
					state._fsp--;

					adaptor.addChild(root_0, basetype114.getTree());

					char_literal115=(Token)match(input,17,FOLLOW_17_in_recordtype749); 
					char_literal115_tree = (Object)adaptor.create(char_literal115);
					adaptor.addChild(root_0, char_literal115_tree);

					}
					break;

			}

			pushFollow(FOLLOW_fieldlistsequence_in_recordtype753);
			fieldlistsequence116=fieldlistsequence();
			state._fsp--;

			adaptor.addChild(root_0, fieldlistsequence116.getTree());

			string_literal117=(Token)match(input,41,FOLLOW_41_in_recordtype755); 
			string_literal117_tree = (Object)adaptor.create(string_literal117);
			adaptor.addChild(root_0, string_literal117_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordtype"


	public static class basetype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "basetype"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:69:1: basetype : qualifiedidentifier ;
	public final OberonParser.basetype_return basetype() throws RecognitionException {
		OberonParser.basetype_return retval = new OberonParser.basetype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope qualifiedidentifier118 =null;


		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:69:9: ( qualifiedidentifier )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:69:11: qualifiedidentifier
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualifiedidentifier_in_basetype761);
			qualifiedidentifier118=qualifiedidentifier();
			state._fsp--;

			adaptor.addChild(root_0, qualifiedidentifier118.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "basetype"


	public static class fieldlistsequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldlistsequence"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:70:1: fieldlistsequence : fieldlist ( ';' fieldlist )* ;
	public final OberonParser.fieldlistsequence_return fieldlistsequence() throws RecognitionException {
		OberonParser.fieldlistsequence_return retval = new OberonParser.fieldlistsequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal120=null;
		ParserRuleReturnScope fieldlist119 =null;
		ParserRuleReturnScope fieldlist121 =null;

		Object char_literal120_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:70:18: ( fieldlist ( ';' fieldlist )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:70:20: fieldlist ( ';' fieldlist )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_fieldlist_in_fieldlistsequence767);
			fieldlist119=fieldlist();
			state._fsp--;

			adaptor.addChild(root_0, fieldlist119.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:70:30: ( ';' fieldlist )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==27) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:70:31: ';' fieldlist
					{
					char_literal120=(Token)match(input,27,FOLLOW_27_in_fieldlistsequence770); 
					char_literal120_tree = (Object)adaptor.create(char_literal120);
					adaptor.addChild(root_0, char_literal120_tree);

					pushFollow(FOLLOW_fieldlist_in_fieldlistsequence772);
					fieldlist121=fieldlist();
					state._fsp--;

					adaptor.addChild(root_0, fieldlist121.getTree());

					}
					break;

				default :
					break loop29;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldlistsequence"


	public static class fieldlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldlist"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:71:1: fieldlist : ( identifierlist ':' type )? ;
	public final OberonParser.fieldlist_return fieldlist() throws RecognitionException {
		OberonParser.fieldlist_return retval = new OberonParser.fieldlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal123=null;
		ParserRuleReturnScope identifierlist122 =null;
		ParserRuleReturnScope type124 =null;

		Object char_literal123_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:71:10: ( ( identifierlist ':' type )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:71:12: ( identifierlist ':' type )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:71:12: ( identifierlist ':' type )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==IDENTIFIER) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:71:13: identifierlist ':' type
					{
					pushFollow(FOLLOW_identifierlist_in_fieldlist781);
					identifierlist122=identifierlist();
					state._fsp--;

					adaptor.addChild(root_0, identifierlist122.getTree());

					char_literal123=(Token)match(input,25,FOLLOW_25_in_fieldlist783); 
					char_literal123_tree = (Object)adaptor.create(char_literal123);
					adaptor.addChild(root_0, char_literal123_tree);

					pushFollow(FOLLOW_type_in_fieldlist785);
					type124=type();
					state._fsp--;

					adaptor.addChild(root_0, type124.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldlist"


	public static class identifierlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifierlist"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:72:1: identifierlist : identifierdefinition ( ',' identifierdefinition )* ;
	public final OberonParser.identifierlist_return identifierlist() throws RecognitionException {
		OberonParser.identifierlist_return retval = new OberonParser.identifierlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal126=null;
		ParserRuleReturnScope identifierdefinition125 =null;
		ParserRuleReturnScope identifierdefinition127 =null;

		Object char_literal126_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:72:15: ( identifierdefinition ( ',' identifierdefinition )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:72:17: identifierdefinition ( ',' identifierdefinition )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identifierdefinition_in_identifierlist793);
			identifierdefinition125=identifierdefinition();
			state._fsp--;

			adaptor.addChild(root_0, identifierdefinition125.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:72:38: ( ',' identifierdefinition )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==20) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:72:39: ',' identifierdefinition
					{
					char_literal126=(Token)match(input,20,FOLLOW_20_in_identifierlist796); 
					char_literal126_tree = (Object)adaptor.create(char_literal126);
					adaptor.addChild(root_0, char_literal126_tree);

					pushFollow(FOLLOW_identifierdefinition_in_identifierlist798);
					identifierdefinition127=identifierdefinition();
					state._fsp--;

					adaptor.addChild(root_0, identifierdefinition127.getTree());

					}
					break;

				default :
					break loop31;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifierlist"


	public static class pointertype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pointertype"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:73:1: pointertype : 'POINTER' 'TO' type ;
	public final OberonParser.pointertype_return pointertype() throws RecognitionException {
		OberonParser.pointertype_return retval = new OberonParser.pointertype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal128=null;
		Token string_literal129=null;
		ParserRuleReturnScope type130 =null;

		Object string_literal128_tree=null;
		Object string_literal129_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:73:12: ( 'POINTER' 'TO' type )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:73:14: 'POINTER' 'TO' type
			{
			root_0 = (Object)adaptor.nil();


			string_literal128=(Token)match(input,53,FOLLOW_53_in_pointertype806); 
			string_literal128_tree = (Object)adaptor.create(string_literal128);
			adaptor.addChild(root_0, string_literal128_tree);

			string_literal129=(Token)match(input,59,FOLLOW_59_in_pointertype808); 
			string_literal129_tree = (Object)adaptor.create(string_literal129);
			adaptor.addChild(root_0, string_literal129_tree);

			pushFollow(FOLLOW_type_in_pointertype810);
			type130=type();
			state._fsp--;

			adaptor.addChild(root_0, type130.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pointertype"


	public static class proceduretype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "proceduretype"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:74:1: proceduretype : 'PROCEDURE' ( formalparameters )? ;
	public final OberonParser.proceduretype_return proceduretype() throws RecognitionException {
		OberonParser.proceduretype_return retval = new OberonParser.proceduretype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal131=null;
		ParserRuleReturnScope formalparameters132 =null;

		Object string_literal131_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:74:14: ( 'PROCEDURE' ( formalparameters )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:74:15: 'PROCEDURE' ( formalparameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal131=(Token)match(input,54,FOLLOW_54_in_proceduretype815); 
			string_literal131_tree = (Object)adaptor.create(string_literal131);
			adaptor.addChild(root_0, string_literal131_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:74:27: ( formalparameters )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==16) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:74:27: formalparameters
					{
					pushFollow(FOLLOW_formalparameters_in_proceduretype817);
					formalparameters132=formalparameters();
					state._fsp--;

					adaptor.addChild(root_0, formalparameters132.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "proceduretype"


	public static class variabledeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variabledeclaration"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:76:1: variabledeclaration : identifierlist ':' type ;
	public final OberonParser.variabledeclaration_return variabledeclaration() throws RecognitionException {
		OberonParser.variabledeclaration_return retval = new OberonParser.variabledeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal134=null;
		ParserRuleReturnScope identifierlist133 =null;
		ParserRuleReturnScope type135 =null;

		Object char_literal134_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:76:20: ( identifierlist ':' type )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:76:22: identifierlist ':' type
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identifierlist_in_variabledeclaration825);
			identifierlist133=identifierlist();
			state._fsp--;

			adaptor.addChild(root_0, identifierlist133.getTree());

			char_literal134=(Token)match(input,25,FOLLOW_25_in_variabledeclaration827); 
			char_literal134_tree = (Object)adaptor.create(char_literal134);
			adaptor.addChild(root_0, char_literal134_tree);

			pushFollow(FOLLOW_type_in_variabledeclaration829);
			type135=type();
			state._fsp--;

			adaptor.addChild(root_0, type135.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variabledeclaration"


	public static class proceduredeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "proceduredeclaration"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:77:1: proceduredeclaration : procedureheading ';' procedurebody IDENTIFIER ;
	public final OberonParser.proceduredeclaration_return proceduredeclaration() throws RecognitionException {
		OberonParser.proceduredeclaration_return retval = new OberonParser.proceduredeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal137=null;
		Token IDENTIFIER139=null;
		ParserRuleReturnScope procedureheading136 =null;
		ParserRuleReturnScope procedurebody138 =null;

		Object char_literal137_tree=null;
		Object IDENTIFIER139_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:77:21: ( procedureheading ';' procedurebody IDENTIFIER )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:77:23: procedureheading ';' procedurebody IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_procedureheading_in_proceduredeclaration835);
			procedureheading136=procedureheading();
			state._fsp--;

			adaptor.addChild(root_0, procedureheading136.getTree());

			char_literal137=(Token)match(input,27,FOLLOW_27_in_proceduredeclaration837); 
			char_literal137_tree = (Object)adaptor.create(char_literal137);
			adaptor.addChild(root_0, char_literal137_tree);

			pushFollow(FOLLOW_procedurebody_in_proceduredeclaration839);
			procedurebody138=procedurebody();
			state._fsp--;

			adaptor.addChild(root_0, procedurebody138.getTree());

			IDENTIFIER139=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_proceduredeclaration841); 
			IDENTIFIER139_tree = (Object)adaptor.create(IDENTIFIER139);
			adaptor.addChild(root_0, IDENTIFIER139_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "proceduredeclaration"


	public static class procedureheading_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureheading"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:78:1: procedureheading : 'PROCEDURE' ( '*' )? identifierdefinition ( formalparameters )? ;
	public final OberonParser.procedureheading_return procedureheading() throws RecognitionException {
		OberonParser.procedureheading_return retval = new OberonParser.procedureheading_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal140=null;
		Token char_literal141=null;
		ParserRuleReturnScope identifierdefinition142 =null;
		ParserRuleReturnScope formalparameters143 =null;

		Object string_literal140_tree=null;
		Object char_literal141_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:78:17: ( 'PROCEDURE' ( '*' )? identifierdefinition ( formalparameters )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:78:19: 'PROCEDURE' ( '*' )? identifierdefinition ( formalparameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal140=(Token)match(input,54,FOLLOW_54_in_procedureheading847); 
			string_literal140_tree = (Object)adaptor.create(string_literal140);
			adaptor.addChild(root_0, string_literal140_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:78:31: ( '*' )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==18) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:78:31: '*'
					{
					char_literal141=(Token)match(input,18,FOLLOW_18_in_procedureheading849); 
					char_literal141_tree = (Object)adaptor.create(char_literal141);
					adaptor.addChild(root_0, char_literal141_tree);

					}
					break;

			}

			pushFollow(FOLLOW_identifierdefinition_in_procedureheading852);
			identifierdefinition142=identifierdefinition();
			state._fsp--;

			adaptor.addChild(root_0, identifierdefinition142.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:78:57: ( formalparameters )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==16) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:78:57: formalparameters
					{
					pushFollow(FOLLOW_formalparameters_in_procedureheading854);
					formalparameters143=formalparameters();
					state._fsp--;

					adaptor.addChild(root_0, formalparameters143.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureheading"


	public static class formalparameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalparameters"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:80:1: formalparameters : '(' ( formalparametersection ( ';' formalparametersection )* )? ')' ( ':' qualifiedidentifier )? ;
	public final OberonParser.formalparameters_return formalparameters() throws RecognitionException {
		OberonParser.formalparameters_return retval = new OberonParser.formalparameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal144=null;
		Token char_literal146=null;
		Token char_literal148=null;
		Token char_literal149=null;
		ParserRuleReturnScope formalparametersection145 =null;
		ParserRuleReturnScope formalparametersection147 =null;
		ParserRuleReturnScope qualifiedidentifier150 =null;

		Object char_literal144_tree=null;
		Object char_literal146_tree=null;
		Object char_literal148_tree=null;
		Object char_literal149_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:80:17: ( '(' ( formalparametersection ( ';' formalparametersection )* )? ')' ( ':' qualifiedidentifier )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:80:19: '(' ( formalparametersection ( ';' formalparametersection )* )? ')' ( ':' qualifiedidentifier )?
			{
			root_0 = (Object)adaptor.nil();


			char_literal144=(Token)match(input,16,FOLLOW_16_in_formalparameters862); 
			char_literal144_tree = (Object)adaptor.create(char_literal144);
			adaptor.addChild(root_0, char_literal144_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:80:23: ( formalparametersection ( ';' formalparametersection )* )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==IDENTIFIER||LA36_0==62) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:80:24: formalparametersection ( ';' formalparametersection )*
					{
					pushFollow(FOLLOW_formalparametersection_in_formalparameters865);
					formalparametersection145=formalparametersection();
					state._fsp--;

					adaptor.addChild(root_0, formalparametersection145.getTree());

					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:80:47: ( ';' formalparametersection )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==27) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:80:49: ';' formalparametersection
							{
							char_literal146=(Token)match(input,27,FOLLOW_27_in_formalparameters869); 
							char_literal146_tree = (Object)adaptor.create(char_literal146);
							adaptor.addChild(root_0, char_literal146_tree);

							pushFollow(FOLLOW_formalparametersection_in_formalparameters871);
							formalparametersection147=formalparametersection();
							state._fsp--;

							adaptor.addChild(root_0, formalparametersection147.getTree());

							}
							break;

						default :
							break loop35;
						}
					}

					}
					break;

			}

			char_literal148=(Token)match(input,17,FOLLOW_17_in_formalparameters877); 
			char_literal148_tree = (Object)adaptor.create(char_literal148);
			adaptor.addChild(root_0, char_literal148_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:80:84: ( ':' qualifiedidentifier )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==25) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:80:85: ':' qualifiedidentifier
					{
					char_literal149=(Token)match(input,25,FOLLOW_25_in_formalparameters880); 
					char_literal149_tree = (Object)adaptor.create(char_literal149);
					adaptor.addChild(root_0, char_literal149_tree);

					pushFollow(FOLLOW_qualifiedidentifier_in_formalparameters882);
					qualifiedidentifier150=qualifiedidentifier();
					state._fsp--;

					adaptor.addChild(root_0, qualifiedidentifier150.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalparameters"


	public static class formalparametersection_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalparametersection"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:82:1: formalparametersection : ( 'VAR' )? IDENTIFIER ( ',' IDENTIFIER )* ':' formaltype ;
	public final OberonParser.formalparametersection_return formalparametersection() throws RecognitionException {
		OberonParser.formalparametersection_return retval = new OberonParser.formalparametersection_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal151=null;
		Token IDENTIFIER152=null;
		Token char_literal153=null;
		Token IDENTIFIER154=null;
		Token char_literal155=null;
		ParserRuleReturnScope formaltype156 =null;

		Object string_literal151_tree=null;
		Object IDENTIFIER152_tree=null;
		Object char_literal153_tree=null;
		Object IDENTIFIER154_tree=null;
		Object char_literal155_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:82:23: ( ( 'VAR' )? IDENTIFIER ( ',' IDENTIFIER )* ':' formaltype )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:82:25: ( 'VAR' )? IDENTIFIER ( ',' IDENTIFIER )* ':' formaltype
			{
			root_0 = (Object)adaptor.nil();


			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:82:25: ( 'VAR' )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==62) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:82:25: 'VAR'
					{
					string_literal151=(Token)match(input,62,FOLLOW_62_in_formalparametersection891); 
					string_literal151_tree = (Object)adaptor.create(string_literal151);
					adaptor.addChild(root_0, string_literal151_tree);

					}
					break;

			}

			IDENTIFIER152=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formalparametersection894); 
			IDENTIFIER152_tree = (Object)adaptor.create(IDENTIFIER152);
			adaptor.addChild(root_0, IDENTIFIER152_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:82:43: ( ',' IDENTIFIER )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==20) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:82:44: ',' IDENTIFIER
					{
					char_literal153=(Token)match(input,20,FOLLOW_20_in_formalparametersection897); 
					char_literal153_tree = (Object)adaptor.create(char_literal153);
					adaptor.addChild(root_0, char_literal153_tree);

					IDENTIFIER154=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formalparametersection899); 
					IDENTIFIER154_tree = (Object)adaptor.create(IDENTIFIER154);
					adaptor.addChild(root_0, IDENTIFIER154_tree);

					}
					break;

				default :
					break loop39;
				}
			}

			char_literal155=(Token)match(input,25,FOLLOW_25_in_formalparametersection903); 
			char_literal155_tree = (Object)adaptor.create(char_literal155);
			adaptor.addChild(root_0, char_literal155_tree);

			pushFollow(FOLLOW_formaltype_in_formalparametersection905);
			formaltype156=formaltype();
			state._fsp--;

			adaptor.addChild(root_0, formaltype156.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalparametersection"


	public static class formaltype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formaltype"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:83:1: formaltype : ( 'ARRAY' 'OF' )* ( qualifiedidentifier | proceduretype ) ;
	public final OberonParser.formaltype_return formaltype() throws RecognitionException {
		OberonParser.formaltype_return retval = new OberonParser.formaltype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal157=null;
		Token string_literal158=null;
		ParserRuleReturnScope qualifiedidentifier159 =null;
		ParserRuleReturnScope proceduretype160 =null;

		Object string_literal157_tree=null;
		Object string_literal158_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:83:11: ( ( 'ARRAY' 'OF' )* ( qualifiedidentifier | proceduretype ) )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:83:13: ( 'ARRAY' 'OF' )* ( qualifiedidentifier | proceduretype )
			{
			root_0 = (Object)adaptor.nil();


			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:83:13: ( 'ARRAY' 'OF' )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==33) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:83:14: 'ARRAY' 'OF'
					{
					string_literal157=(Token)match(input,33,FOLLOW_33_in_formaltype912); 
					string_literal157_tree = (Object)adaptor.create(string_literal157);
					adaptor.addChild(root_0, string_literal157_tree);

					string_literal158=(Token)match(input,51,FOLLOW_51_in_formaltype914); 
					string_literal158_tree = (Object)adaptor.create(string_literal158);
					adaptor.addChild(root_0, string_literal158_tree);

					}
					break;

				default :
					break loop40;
				}
			}

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:83:29: ( qualifiedidentifier | proceduretype )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==IDENTIFIER) ) {
				alt41=1;
			}
			else if ( (LA41_0==54) ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:83:31: qualifiedidentifier
					{
					pushFollow(FOLLOW_qualifiedidentifier_in_formaltype920);
					qualifiedidentifier159=qualifiedidentifier();
					state._fsp--;

					adaptor.addChild(root_0, qualifiedidentifier159.getTree());

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:83:53: proceduretype
					{
					pushFollow(FOLLOW_proceduretype_in_formaltype924);
					proceduretype160=proceduretype();
					state._fsp--;

					adaptor.addChild(root_0, proceduretype160.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formaltype"


	public static class procedurebody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedurebody"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:84:1: procedurebody : declarationsequence ( 'BEGIN' statementsequence )? 'END' ;
	public final OberonParser.procedurebody_return procedurebody() throws RecognitionException {
		OberonParser.procedurebody_return retval = new OberonParser.procedurebody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal162=null;
		Token string_literal164=null;
		ParserRuleReturnScope declarationsequence161 =null;
		ParserRuleReturnScope statementsequence163 =null;

		Object string_literal162_tree=null;
		Object string_literal164_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:84:14: ( declarationsequence ( 'BEGIN' statementsequence )? 'END' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:84:16: declarationsequence ( 'BEGIN' statementsequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declarationsequence_in_procedurebody932);
			declarationsequence161=declarationsequence();
			state._fsp--;

			adaptor.addChild(root_0, declarationsequence161.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:84:36: ( 'BEGIN' statementsequence )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==34) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:84:37: 'BEGIN' statementsequence
					{
					string_literal162=(Token)match(input,34,FOLLOW_34_in_procedurebody935); 
					string_literal162_tree = (Object)adaptor.create(string_literal162);
					adaptor.addChild(root_0, string_literal162_tree);

					pushFollow(FOLLOW_statementsequence_in_procedurebody937);
					statementsequence163=statementsequence();
					state._fsp--;

					adaptor.addChild(root_0, statementsequence163.getTree());

					}
					break;

			}

			string_literal164=(Token)match(input,41,FOLLOW_41_in_procedurebody941); 
			string_literal164_tree = (Object)adaptor.create(string_literal164);
			adaptor.addChild(root_0, string_literal164_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedurebody"


	public static class forwarddeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forwarddeclaration"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:85:1: forwarddeclaration : 'PROCEDURE' '^' IDENTIFIER ( '*' )? ( formalparameters )? ;
	public final OberonParser.forwarddeclaration_return forwarddeclaration() throws RecognitionException {
		OberonParser.forwarddeclaration_return retval = new OberonParser.forwarddeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal165=null;
		Token char_literal166=null;
		Token IDENTIFIER167=null;
		Token char_literal168=null;
		ParserRuleReturnScope formalparameters169 =null;

		Object string_literal165_tree=null;
		Object char_literal166_tree=null;
		Object IDENTIFIER167_tree=null;
		Object char_literal168_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:85:19: ( 'PROCEDURE' '^' IDENTIFIER ( '*' )? ( formalparameters )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:85:21: 'PROCEDURE' '^' IDENTIFIER ( '*' )? ( formalparameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal165=(Token)match(input,54,FOLLOW_54_in_forwarddeclaration947); 
			string_literal165_tree = (Object)adaptor.create(string_literal165);
			adaptor.addChild(root_0, string_literal165_tree);

			char_literal166=(Token)match(input,69,FOLLOW_69_in_forwarddeclaration949); 
			char_literal166_tree = (Object)adaptor.create(char_literal166);
			adaptor.addChild(root_0, char_literal166_tree);

			IDENTIFIER167=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_forwarddeclaration951); 
			IDENTIFIER167_tree = (Object)adaptor.create(IDENTIFIER167);
			adaptor.addChild(root_0, IDENTIFIER167_tree);

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:85:48: ( '*' )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==18) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:85:48: '*'
					{
					char_literal168=(Token)match(input,18,FOLLOW_18_in_forwarddeclaration953); 
					char_literal168_tree = (Object)adaptor.create(char_literal168);
					adaptor.addChild(root_0, char_literal168_tree);

					}
					break;

			}

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:85:53: ( formalparameters )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==16) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:85:53: formalparameters
					{
					pushFollow(FOLLOW_formalparameters_in_forwarddeclaration956);
					formalparameters169=formalparameters();
					state._fsp--;

					adaptor.addChild(root_0, formalparameters169.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forwarddeclaration"


	public static class statementsequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statementsequence"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:86:1: statementsequence : statement ( ';' statement )* ;
	public final OberonParser.statementsequence_return statementsequence() throws RecognitionException {
		OberonParser.statementsequence_return retval = new OberonParser.statementsequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal171=null;
		ParserRuleReturnScope statement170 =null;
		ParserRuleReturnScope statement172 =null;

		Object char_literal171_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:86:18: ( statement ( ';' statement )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:86:20: statement ( ';' statement )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statementsequence964);
			statement170=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement170.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:86:30: ( ';' statement )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==27) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:86:31: ';' statement
					{
					char_literal171=(Token)match(input,27,FOLLOW_27_in_statementsequence967); 
					char_literal171_tree = (Object)adaptor.create(char_literal171);
					adaptor.addChild(root_0, char_literal171_tree);

					pushFollow(FOLLOW_statement_in_statementsequence969);
					statement172=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement172.getTree());

					}
					break;

				default :
					break loop45;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statementsequence"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:1: statement : ( statement2 | ifstatement | casestatement | whilestatement | repeatstatement | loopstatement | withstatement | 'EXIT' | ( 'RETURN' ( expression )? ) )? ;
	public final OberonParser.statement_return statement() throws RecognitionException {
		OberonParser.statement_return retval = new OberonParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal180=null;
		Token string_literal181=null;
		ParserRuleReturnScope statement2173 =null;
		ParserRuleReturnScope ifstatement174 =null;
		ParserRuleReturnScope casestatement175 =null;
		ParserRuleReturnScope whilestatement176 =null;
		ParserRuleReturnScope repeatstatement177 =null;
		ParserRuleReturnScope loopstatement178 =null;
		ParserRuleReturnScope withstatement179 =null;
		ParserRuleReturnScope expression182 =null;

		Object string_literal180_tree=null;
		Object string_literal181_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:10: ( ( statement2 | ifstatement | casestatement | whilestatement | repeatstatement | loopstatement | withstatement | 'EXIT' | ( 'RETURN' ( expression )? ) )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:12: ( statement2 | ifstatement | casestatement | whilestatement | repeatstatement | loopstatement | withstatement | 'EXIT' | ( 'RETURN' ( expression )? ) )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:12: ( statement2 | ifstatement | casestatement | whilestatement | repeatstatement | loopstatement | withstatement | 'EXIT' | ( 'RETURN' ( expression )? ) )?
			int alt47=10;
			switch ( input.LA(1) ) {
				case IDENTIFIER:
					{
					alt47=1;
					}
					break;
				case 43:
					{
					alt47=2;
					}
					break;
				case 35:
					{
					alt47=3;
					}
					break;
				case 63:
					{
					alt47=4;
					}
					break;
				case 56:
					{
					alt47=5;
					}
					break;
				case 47:
					{
					alt47=6;
					}
					break;
				case 64:
					{
					alt47=7;
					}
					break;
				case 42:
					{
					alt47=8;
					}
					break;
				case 57:
					{
					alt47=9;
					}
					break;
			}
			switch (alt47) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:13: statement2
					{
					pushFollow(FOLLOW_statement2_in_statement980);
					statement2173=statement2();
					state._fsp--;

					adaptor.addChild(root_0, statement2173.getTree());

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:26: ifstatement
					{
					pushFollow(FOLLOW_ifstatement_in_statement984);
					ifstatement174=ifstatement();
					state._fsp--;

					adaptor.addChild(root_0, ifstatement174.getTree());

					}
					break;
				case 3 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:40: casestatement
					{
					pushFollow(FOLLOW_casestatement_in_statement988);
					casestatement175=casestatement();
					state._fsp--;

					adaptor.addChild(root_0, casestatement175.getTree());

					}
					break;
				case 4 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:56: whilestatement
					{
					pushFollow(FOLLOW_whilestatement_in_statement992);
					whilestatement176=whilestatement();
					state._fsp--;

					adaptor.addChild(root_0, whilestatement176.getTree());

					}
					break;
				case 5 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:73: repeatstatement
					{
					pushFollow(FOLLOW_repeatstatement_in_statement996);
					repeatstatement177=repeatstatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatstatement177.getTree());

					}
					break;
				case 6 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:91: loopstatement
					{
					pushFollow(FOLLOW_loopstatement_in_statement1000);
					loopstatement178=loopstatement();
					state._fsp--;

					adaptor.addChild(root_0, loopstatement178.getTree());

					}
					break;
				case 7 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:107: withstatement
					{
					pushFollow(FOLLOW_withstatement_in_statement1004);
					withstatement179=withstatement();
					state._fsp--;

					adaptor.addChild(root_0, withstatement179.getTree());

					}
					break;
				case 8 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:123: 'EXIT'
					{
					string_literal180=(Token)match(input,42,FOLLOW_42_in_statement1008); 
					string_literal180_tree = (Object)adaptor.create(string_literal180);
					adaptor.addChild(root_0, string_literal180_tree);

					}
					break;
				case 9 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:132: ( 'RETURN' ( expression )? )
					{
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:132: ( 'RETURN' ( expression )? )
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:133: 'RETURN' ( expression )?
					{
					string_literal181=(Token)match(input,57,FOLLOW_57_in_statement1013); 
					string_literal181_tree = (Object)adaptor.create(string_literal181);
					adaptor.addChild(root_0, string_literal181_tree);

					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:142: ( expression )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( ((LA46_0 >= DIGIT && LA46_0 <= INTEGER)||LA46_0==REAL||LA46_0==13||LA46_0==16||LA46_0==19||LA46_0==21||LA46_0==50||LA46_0==70||LA46_0==73) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /home/user/workspace/OberonParser/src/oberon/Oberon.g:89:142: expression
							{
							pushFollow(FOLLOW_expression_in_statement1015);
							expression182=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression182.getTree());

							}
							break;

					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class statement2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement2"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:90:1: statement2 : designator ( ':=' expression | procedurecall ) ;
	public final OberonParser.statement2_return statement2() throws RecognitionException {
		OberonParser.statement2_return retval = new OberonParser.statement2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal184=null;
		ParserRuleReturnScope designator183 =null;
		ParserRuleReturnScope expression185 =null;
		ParserRuleReturnScope procedurecall186 =null;

		Object string_literal184_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:90:11: ( designator ( ':=' expression | procedurecall ) )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:90:13: designator ( ':=' expression | procedurecall )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_designator_in_statement21025);
			designator183=designator();
			state._fsp--;

			adaptor.addChild(root_0, designator183.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:90:24: ( ':=' expression | procedurecall )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==26) ) {
				alt48=1;
			}
			else if ( (LA48_0==16||LA48_0==27||(LA48_0 >= 39 && LA48_0 <= 41)||LA48_0==61||LA48_0==71) ) {
				alt48=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:90:25: ':=' expression
					{
					string_literal184=(Token)match(input,26,FOLLOW_26_in_statement21028); 
					string_literal184_tree = (Object)adaptor.create(string_literal184);
					adaptor.addChild(root_0, string_literal184_tree);

					pushFollow(FOLLOW_expression_in_statement21030);
					expression185=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression185.getTree());

					}
					break;
				case 2 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:90:43: procedurecall
					{
					pushFollow(FOLLOW_procedurecall_in_statement21034);
					procedurecall186=procedurecall();
					state._fsp--;

					adaptor.addChild(root_0, procedurecall186.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement2"


	public static class procedurecall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedurecall"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:92:1: procedurecall : ( actualparameters )? ;
	public final OberonParser.procedurecall_return procedurecall() throws RecognitionException {
		OberonParser.procedurecall_return retval = new OberonParser.procedurecall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actualparameters187 =null;


		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:92:14: ( ( actualparameters )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:92:16: ( actualparameters )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:92:16: ( actualparameters )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==16) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:92:16: actualparameters
					{
					pushFollow(FOLLOW_actualparameters_in_procedurecall1042);
					actualparameters187=actualparameters();
					state._fsp--;

					adaptor.addChild(root_0, actualparameters187.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedurecall"


	public static class ifstatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifstatement"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:96:1: ifstatement : 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' ;
	public final OberonParser.ifstatement_return ifstatement() throws RecognitionException {
		OberonParser.ifstatement_return retval = new OberonParser.ifstatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal188=null;
		Token string_literal190=null;
		Token string_literal192=null;
		Token string_literal194=null;
		Token string_literal196=null;
		Token string_literal198=null;
		ParserRuleReturnScope expression189 =null;
		ParserRuleReturnScope statementsequence191 =null;
		ParserRuleReturnScope expression193 =null;
		ParserRuleReturnScope statementsequence195 =null;
		ParserRuleReturnScope statementsequence197 =null;

		Object string_literal188_tree=null;
		Object string_literal190_tree=null;
		Object string_literal192_tree=null;
		Object string_literal194_tree=null;
		Object string_literal196_tree=null;
		Object string_literal198_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:96:12: ( 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:96:14: 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal188=(Token)match(input,43,FOLLOW_43_in_ifstatement1052); 
			string_literal188_tree = (Object)adaptor.create(string_literal188);
			adaptor.addChild(root_0, string_literal188_tree);

			pushFollow(FOLLOW_expression_in_ifstatement1054);
			expression189=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression189.getTree());

			string_literal190=(Token)match(input,58,FOLLOW_58_in_ifstatement1056); 
			string_literal190_tree = (Object)adaptor.create(string_literal190);
			adaptor.addChild(root_0, string_literal190_tree);

			pushFollow(FOLLOW_statementsequence_in_ifstatement1058);
			statementsequence191=statementsequence();
			state._fsp--;

			adaptor.addChild(root_0, statementsequence191.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:96:55: ( 'ELSIF' expression 'THEN' statementsequence )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==40) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:96:56: 'ELSIF' expression 'THEN' statementsequence
					{
					string_literal192=(Token)match(input,40,FOLLOW_40_in_ifstatement1061); 
					string_literal192_tree = (Object)adaptor.create(string_literal192);
					adaptor.addChild(root_0, string_literal192_tree);

					pushFollow(FOLLOW_expression_in_ifstatement1063);
					expression193=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression193.getTree());

					string_literal194=(Token)match(input,58,FOLLOW_58_in_ifstatement1065); 
					string_literal194_tree = (Object)adaptor.create(string_literal194);
					adaptor.addChild(root_0, string_literal194_tree);

					pushFollow(FOLLOW_statementsequence_in_ifstatement1067);
					statementsequence195=statementsequence();
					state._fsp--;

					adaptor.addChild(root_0, statementsequence195.getTree());

					}
					break;

				default :
					break loop50;
				}
			}

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:96:102: ( 'ELSE' statementsequence )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==39) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:96:103: 'ELSE' statementsequence
					{
					string_literal196=(Token)match(input,39,FOLLOW_39_in_ifstatement1072); 
					string_literal196_tree = (Object)adaptor.create(string_literal196);
					adaptor.addChild(root_0, string_literal196_tree);

					pushFollow(FOLLOW_statementsequence_in_ifstatement1074);
					statementsequence197=statementsequence();
					state._fsp--;

					adaptor.addChild(root_0, statementsequence197.getTree());

					}
					break;

			}

			string_literal198=(Token)match(input,41,FOLLOW_41_in_ifstatement1078); 
			string_literal198_tree = (Object)adaptor.create(string_literal198);
			adaptor.addChild(root_0, string_literal198_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifstatement"


	public static class casestatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "casestatement"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:98:1: casestatement : 'CASE' expression 'OF' ocase ( '|' ocase )* ( 'ELSE' statementsequence )? 'END' ;
	public final OberonParser.casestatement_return casestatement() throws RecognitionException {
		OberonParser.casestatement_return retval = new OberonParser.casestatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal199=null;
		Token string_literal201=null;
		Token char_literal203=null;
		Token string_literal205=null;
		Token string_literal207=null;
		ParserRuleReturnScope expression200 =null;
		ParserRuleReturnScope ocase202 =null;
		ParserRuleReturnScope ocase204 =null;
		ParserRuleReturnScope statementsequence206 =null;

		Object string_literal199_tree=null;
		Object string_literal201_tree=null;
		Object char_literal203_tree=null;
		Object string_literal205_tree=null;
		Object string_literal207_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:98:14: ( 'CASE' expression 'OF' ocase ( '|' ocase )* ( 'ELSE' statementsequence )? 'END' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:98:16: 'CASE' expression 'OF' ocase ( '|' ocase )* ( 'ELSE' statementsequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal199=(Token)match(input,35,FOLLOW_35_in_casestatement1085); 
			string_literal199_tree = (Object)adaptor.create(string_literal199);
			adaptor.addChild(root_0, string_literal199_tree);

			pushFollow(FOLLOW_expression_in_casestatement1087);
			expression200=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression200.getTree());

			string_literal201=(Token)match(input,51,FOLLOW_51_in_casestatement1089); 
			string_literal201_tree = (Object)adaptor.create(string_literal201);
			adaptor.addChild(root_0, string_literal201_tree);

			pushFollow(FOLLOW_ocase_in_casestatement1091);
			ocase202=ocase();
			state._fsp--;

			adaptor.addChild(root_0, ocase202.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:98:45: ( '|' ocase )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==71) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:98:46: '|' ocase
					{
					char_literal203=(Token)match(input,71,FOLLOW_71_in_casestatement1094); 
					char_literal203_tree = (Object)adaptor.create(char_literal203);
					adaptor.addChild(root_0, char_literal203_tree);

					pushFollow(FOLLOW_ocase_in_casestatement1096);
					ocase204=ocase();
					state._fsp--;

					adaptor.addChild(root_0, ocase204.getTree());

					}
					break;

				default :
					break loop52;
				}
			}

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:98:58: ( 'ELSE' statementsequence )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==39) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:98:59: 'ELSE' statementsequence
					{
					string_literal205=(Token)match(input,39,FOLLOW_39_in_casestatement1101); 
					string_literal205_tree = (Object)adaptor.create(string_literal205);
					adaptor.addChild(root_0, string_literal205_tree);

					pushFollow(FOLLOW_statementsequence_in_casestatement1103);
					statementsequence206=statementsequence();
					state._fsp--;

					adaptor.addChild(root_0, statementsequence206.getTree());

					}
					break;

			}

			string_literal207=(Token)match(input,41,FOLLOW_41_in_casestatement1107); 
			string_literal207_tree = (Object)adaptor.create(string_literal207);
			adaptor.addChild(root_0, string_literal207_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "casestatement"


	public static class ocase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ocase"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:100:1: ocase : ( caselabellist ':' statementsequence )? ;
	public final OberonParser.ocase_return ocase() throws RecognitionException {
		OberonParser.ocase_return retval = new OberonParser.ocase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal209=null;
		ParserRuleReturnScope caselabellist208 =null;
		ParserRuleReturnScope statementsequence210 =null;

		Object char_literal209_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:100:6: ( ( caselabellist ':' statementsequence )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:100:8: ( caselabellist ':' statementsequence )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:100:8: ( caselabellist ':' statementsequence )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( ((LA54_0 >= DIGIT && LA54_0 <= INTEGER)||LA54_0==REAL||LA54_0==13||LA54_0==16||LA54_0==19||LA54_0==21||LA54_0==50||LA54_0==70||LA54_0==73) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:100:9: caselabellist ':' statementsequence
					{
					pushFollow(FOLLOW_caselabellist_in_ocase1116);
					caselabellist208=caselabellist();
					state._fsp--;

					adaptor.addChild(root_0, caselabellist208.getTree());

					char_literal209=(Token)match(input,25,FOLLOW_25_in_ocase1118); 
					char_literal209_tree = (Object)adaptor.create(char_literal209);
					adaptor.addChild(root_0, char_literal209_tree);

					pushFollow(FOLLOW_statementsequence_in_ocase1120);
					statementsequence210=statementsequence();
					state._fsp--;

					adaptor.addChild(root_0, statementsequence210.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ocase"


	public static class caselabellist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caselabellist"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:102:1: caselabellist : caselabels ( ',' caselabels )* ;
	public final OberonParser.caselabellist_return caselabellist() throws RecognitionException {
		OberonParser.caselabellist_return retval = new OberonParser.caselabellist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal212=null;
		ParserRuleReturnScope caselabels211 =null;
		ParserRuleReturnScope caselabels213 =null;

		Object char_literal212_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:102:14: ( caselabels ( ',' caselabels )* )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:102:16: caselabels ( ',' caselabels )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_caselabels_in_caselabellist1129);
			caselabels211=caselabels();
			state._fsp--;

			adaptor.addChild(root_0, caselabels211.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:102:27: ( ',' caselabels )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==20) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:102:28: ',' caselabels
					{
					char_literal212=(Token)match(input,20,FOLLOW_20_in_caselabellist1132); 
					char_literal212_tree = (Object)adaptor.create(char_literal212);
					adaptor.addChild(root_0, char_literal212_tree);

					pushFollow(FOLLOW_caselabels_in_caselabellist1134);
					caselabels213=caselabels();
					state._fsp--;

					adaptor.addChild(root_0, caselabels213.getTree());

					}
					break;

				default :
					break loop55;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caselabellist"


	public static class caselabels_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caselabels"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:103:1: caselabels : constantexpression ( '\\.\\.' constantexpression )? ;
	public final OberonParser.caselabels_return caselabels() throws RecognitionException {
		OberonParser.caselabels_return retval = new OberonParser.caselabels_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal215=null;
		ParserRuleReturnScope constantexpression214 =null;
		ParserRuleReturnScope constantexpression216 =null;

		Object string_literal215_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:103:11: ( constantexpression ( '\\.\\.' constantexpression )? )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:103:13: constantexpression ( '\\.\\.' constantexpression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constantexpression_in_caselabels1142);
			constantexpression214=constantexpression();
			state._fsp--;

			adaptor.addChild(root_0, constantexpression214.getTree());

			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:103:32: ( '\\.\\.' constantexpression )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==67) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// /home/user/workspace/OberonParser/src/oberon/Oberon.g:103:33: '\\.\\.' constantexpression
					{
					string_literal215=(Token)match(input,67,FOLLOW_67_in_caselabels1145); 
					string_literal215_tree = (Object)adaptor.create(string_literal215);
					adaptor.addChild(root_0, string_literal215_tree);

					pushFollow(FOLLOW_constantexpression_in_caselabels1147);
					constantexpression216=constantexpression();
					state._fsp--;

					adaptor.addChild(root_0, constantexpression216.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caselabels"


	public static class whilestatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whilestatement"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:104:1: whilestatement : 'WHILE' expression 'DO' statementsequence 'END' ;
	public final OberonParser.whilestatement_return whilestatement() throws RecognitionException {
		OberonParser.whilestatement_return retval = new OberonParser.whilestatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal217=null;
		Token string_literal219=null;
		Token string_literal221=null;
		ParserRuleReturnScope expression218 =null;
		ParserRuleReturnScope statementsequence220 =null;

		Object string_literal217_tree=null;
		Object string_literal219_tree=null;
		Object string_literal221_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:104:15: ( 'WHILE' expression 'DO' statementsequence 'END' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:104:17: 'WHILE' expression 'DO' statementsequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal217=(Token)match(input,63,FOLLOW_63_in_whilestatement1155); 
			string_literal217_tree = (Object)adaptor.create(string_literal217);
			adaptor.addChild(root_0, string_literal217_tree);

			pushFollow(FOLLOW_expression_in_whilestatement1157);
			expression218=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression218.getTree());

			string_literal219=(Token)match(input,38,FOLLOW_38_in_whilestatement1159); 
			string_literal219_tree = (Object)adaptor.create(string_literal219);
			adaptor.addChild(root_0, string_literal219_tree);

			pushFollow(FOLLOW_statementsequence_in_whilestatement1161);
			statementsequence220=statementsequence();
			state._fsp--;

			adaptor.addChild(root_0, statementsequence220.getTree());

			string_literal221=(Token)match(input,41,FOLLOW_41_in_whilestatement1163); 
			string_literal221_tree = (Object)adaptor.create(string_literal221);
			adaptor.addChild(root_0, string_literal221_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestatement"


	public static class repeatstatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "repeatstatement"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:105:1: repeatstatement : 'REPEAT' statementsequence 'UNTIL' expression ;
	public final OberonParser.repeatstatement_return repeatstatement() throws RecognitionException {
		OberonParser.repeatstatement_return retval = new OberonParser.repeatstatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal222=null;
		Token string_literal224=null;
		ParserRuleReturnScope statementsequence223 =null;
		ParserRuleReturnScope expression225 =null;

		Object string_literal222_tree=null;
		Object string_literal224_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:105:16: ( 'REPEAT' statementsequence 'UNTIL' expression )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:105:18: 'REPEAT' statementsequence 'UNTIL' expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal222=(Token)match(input,56,FOLLOW_56_in_repeatstatement1169); 
			string_literal222_tree = (Object)adaptor.create(string_literal222);
			adaptor.addChild(root_0, string_literal222_tree);

			pushFollow(FOLLOW_statementsequence_in_repeatstatement1171);
			statementsequence223=statementsequence();
			state._fsp--;

			adaptor.addChild(root_0, statementsequence223.getTree());

			string_literal224=(Token)match(input,61,FOLLOW_61_in_repeatstatement1173); 
			string_literal224_tree = (Object)adaptor.create(string_literal224);
			adaptor.addChild(root_0, string_literal224_tree);

			pushFollow(FOLLOW_expression_in_repeatstatement1175);
			expression225=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression225.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "repeatstatement"


	public static class loopstatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "loopstatement"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:106:1: loopstatement : 'LOOP' statementsequence 'END' ;
	public final OberonParser.loopstatement_return loopstatement() throws RecognitionException {
		OberonParser.loopstatement_return retval = new OberonParser.loopstatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal226=null;
		Token string_literal228=null;
		ParserRuleReturnScope statementsequence227 =null;

		Object string_literal226_tree=null;
		Object string_literal228_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:106:14: ( 'LOOP' statementsequence 'END' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:106:16: 'LOOP' statementsequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal226=(Token)match(input,47,FOLLOW_47_in_loopstatement1181); 
			string_literal226_tree = (Object)adaptor.create(string_literal226);
			adaptor.addChild(root_0, string_literal226_tree);

			pushFollow(FOLLOW_statementsequence_in_loopstatement1183);
			statementsequence227=statementsequence();
			state._fsp--;

			adaptor.addChild(root_0, statementsequence227.getTree());

			string_literal228=(Token)match(input,41,FOLLOW_41_in_loopstatement1185); 
			string_literal228_tree = (Object)adaptor.create(string_literal228);
			adaptor.addChild(root_0, string_literal228_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "loopstatement"


	public static class withstatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "withstatement"
	// /home/user/workspace/OberonParser/src/oberon/Oberon.g:108:1: withstatement : 'WITH' qualifiedidentifier ':' qualifiedidentifier 'DO' statementsequence 'END' ;
	public final OberonParser.withstatement_return withstatement() throws RecognitionException {
		OberonParser.withstatement_return retval = new OberonParser.withstatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal229=null;
		Token char_literal231=null;
		Token string_literal233=null;
		Token string_literal235=null;
		ParserRuleReturnScope qualifiedidentifier230 =null;
		ParserRuleReturnScope qualifiedidentifier232 =null;
		ParserRuleReturnScope statementsequence234 =null;

		Object string_literal229_tree=null;
		Object char_literal231_tree=null;
		Object string_literal233_tree=null;
		Object string_literal235_tree=null;

		try {
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:108:14: ( 'WITH' qualifiedidentifier ':' qualifiedidentifier 'DO' statementsequence 'END' )
			// /home/user/workspace/OberonParser/src/oberon/Oberon.g:108:16: 'WITH' qualifiedidentifier ':' qualifiedidentifier 'DO' statementsequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal229=(Token)match(input,64,FOLLOW_64_in_withstatement1192); 
			string_literal229_tree = (Object)adaptor.create(string_literal229);
			adaptor.addChild(root_0, string_literal229_tree);

			pushFollow(FOLLOW_qualifiedidentifier_in_withstatement1194);
			qualifiedidentifier230=qualifiedidentifier();
			state._fsp--;

			adaptor.addChild(root_0, qualifiedidentifier230.getTree());

			char_literal231=(Token)match(input,25,FOLLOW_25_in_withstatement1196); 
			char_literal231_tree = (Object)adaptor.create(char_literal231);
			adaptor.addChild(root_0, char_literal231_tree);

			pushFollow(FOLLOW_qualifiedidentifier_in_withstatement1198);
			qualifiedidentifier232=qualifiedidentifier();
			state._fsp--;

			adaptor.addChild(root_0, qualifiedidentifier232.getTree());

			string_literal233=(Token)match(input,38,FOLLOW_38_in_withstatement1200); 
			string_literal233_tree = (Object)adaptor.create(string_literal233);
			adaptor.addChild(root_0, string_literal233_tree);

			pushFollow(FOLLOW_statementsequence_in_withstatement1202);
			statementsequence234=statementsequence();
			state._fsp--;

			adaptor.addChild(root_0, statementsequence234.getTree());

			string_literal235=(Token)match(input,41,FOLLOW_41_in_withstatement1204); 
			string_literal235_tree = (Object)adaptor.create(string_literal235);
			adaptor.addChild(root_0, string_literal235_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "withstatement"

	// Delegated rules



	public static final BitSet FOLLOW_49_in_module139 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_module141 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_module143 = new BitSet(new long[]{0x5000121400000000L});
	public static final BitSet FOLLOW_importlist_in_module145 = new BitSet(new long[]{0x5000021400000000L});
	public static final BitSet FOLLOW_declarationsequence_in_module148 = new BitSet(new long[]{0x0000020400000000L});
	public static final BitSet FOLLOW_34_in_module151 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_module153 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_module157 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_module159 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_module161 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_module163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_importlist183 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_importo_in_importlist185 = new BitSet(new long[]{0x0000000008100000L});
	public static final BitSet FOLLOW_20_in_importlist188 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_importo_in_importlist190 = new BitSet(new long[]{0x0000000008100000L});
	public static final BitSet FOLLOW_27_in_importlist194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_importo200 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_importo203 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_importo205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_declarationsequence217 = new BitSet(new long[]{0x5000001000000042L});
	public static final BitSet FOLLOW_constantdeclaration_in_declarationsequence220 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_declarationsequence222 = new BitSet(new long[]{0x5000001000000042L});
	public static final BitSet FOLLOW_60_in_declarationsequence228 = new BitSet(new long[]{0x5000001000000042L});
	public static final BitSet FOLLOW_typedeclaration_in_declarationsequence231 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_declarationsequence233 = new BitSet(new long[]{0x5000001000000042L});
	public static final BitSet FOLLOW_62_in_declarationsequence239 = new BitSet(new long[]{0x5000001000000042L});
	public static final BitSet FOLLOW_variabledeclaration_in_declarationsequence242 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_declarationsequence244 = new BitSet(new long[]{0x5000001000000042L});
	public static final BitSet FOLLOW_identifierdefinition_in_constantdeclaration257 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_constantdeclaration259 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_constantexpression_in_constantdeclaration261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifierdefinition267 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_identifierdefinition269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constantexpression277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleexpression_in_expression283 = new BitSet(new long[]{0x00006001F0004002L});
	public static final BitSet FOLLOW_relation_in_expression286 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_simpleexpression_in_expression288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_simpleexpression304 = new BitSet(new long[]{0x0010000000280002L});
	public static final BitSet FOLLOW_addoperator_in_simpleexpression307 = new BitSet(new long[]{0x00040000000124E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_term_in_simpleexpression309 = new BitSet(new long[]{0x0010000000280002L});
	public static final BitSet FOLLOW_factor_in_term317 = new BitSet(new long[]{0x0001002001048002L});
	public static final BitSet FOLLOW_multoperator_in_term320 = new BitSet(new long[]{0x00040000000124E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_factor_in_term322 = new BitSet(new long[]{0x0001002001048002L});
	public static final BitSet FOLLOW_number_in_factor330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_charconstant_in_factor334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_factor338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_factor342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_factor346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_factor350 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_actualparameters_in_factor352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_factor357 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_factor359 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_factor361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_factor365 = new BitSet(new long[]{0x00040000000124E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_factor_in_factor367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_charconstant475 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHARACTER_in_charconstant477 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_charconstant479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGIT_in_charconstant483 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_charconstant485 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_charconstant488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_string495 = new BitSet(new long[]{0x0000000000002010L});
	public static final BitSet FOLLOW_CHARACTER_in_string497 = new BitSet(new long[]{0x0000000000002010L});
	public static final BitSet FOLLOW_13_in_string500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_set506 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000340L});
	public static final BitSet FOLLOW_element_in_set509 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000100L});
	public static final BitSet FOLLOW_20_in_set512 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_element_in_set514 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_set520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_element526 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_element529 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_element531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_designator539 = new BitSet(new long[]{0x0000000000410002L,0x0000000000000024L});
	public static final BitSet FOLLOW_22_in_designator542 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_designator544 = new BitSet(new long[]{0x0000000000410002L,0x0000000000000024L});
	public static final BitSet FOLLOW_66_in_designator548 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expressionlist_in_designator550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_designator552 = new BitSet(new long[]{0x0000000000410002L,0x0000000000000024L});
	public static final BitSet FOLLOW_16_in_designator556 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_designator558 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_designator560 = new BitSet(new long[]{0x0000000000410002L,0x0000000000000024L});
	public static final BitSet FOLLOW_69_in_designator564 = new BitSet(new long[]{0x0000000000410002L,0x0000000000000024L});
	public static final BitSet FOLLOW_expression_in_expressionlist573 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_expressionlist577 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_expressionlist579 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_16_in_actualparameters587 = new BitSet(new long[]{0x00040000002B24E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expressionlist_in_actualparameters589 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_actualparameters592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierdefinition_in_typedeclaration670 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_typedeclaration672 = new BitSet(new long[]{0x00E0000200000040L});
	public static final BitSet FOLLOW_type_in_typedeclaration674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_type680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arraytype_in_type684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordtype_in_type688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointertype_in_type692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_proceduretype_in_type696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedidentifier703 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_qualifiedidentifier706 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedidentifier708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_arraytype716 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_length_in_arraytype718 = new BitSet(new long[]{0x0008000000100000L});
	public static final BitSet FOLLOW_20_in_arraytype721 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_length_in_arraytype723 = new BitSet(new long[]{0x0008000000100000L});
	public static final BitSet FOLLOW_51_in_arraytype727 = new BitSet(new long[]{0x00E0000200000040L});
	public static final BitSet FOLLOW_type_in_arraytype729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantexpression_in_length735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_recordtype742 = new BitSet(new long[]{0x0000000008010040L});
	public static final BitSet FOLLOW_16_in_recordtype745 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_basetype_in_recordtype747 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_recordtype749 = new BitSet(new long[]{0x0000000008000040L});
	public static final BitSet FOLLOW_fieldlistsequence_in_recordtype753 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_recordtype755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_basetype761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldlist_in_fieldlistsequence767 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_fieldlistsequence770 = new BitSet(new long[]{0x0000000008000040L});
	public static final BitSet FOLLOW_fieldlist_in_fieldlistsequence772 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_identifierlist_in_fieldlist781 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_fieldlist783 = new BitSet(new long[]{0x00E0000200000040L});
	public static final BitSet FOLLOW_type_in_fieldlist785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierdefinition_in_identifierlist793 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_identifierlist796 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_identifierdefinition_in_identifierlist798 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_53_in_pointertype806 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_pointertype808 = new BitSet(new long[]{0x00E0000200000040L});
	public static final BitSet FOLLOW_type_in_pointertype810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_proceduretype815 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_formalparameters_in_proceduretype817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierlist_in_variabledeclaration825 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_variabledeclaration827 = new BitSet(new long[]{0x00E0000200000040L});
	public static final BitSet FOLLOW_type_in_variabledeclaration829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration835 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_proceduredeclaration837 = new BitSet(new long[]{0x5000021400000000L});
	public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration839 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_proceduredeclaration841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_procedureheading847 = new BitSet(new long[]{0x0000000000040040L});
	public static final BitSet FOLLOW_18_in_procedureheading849 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_identifierdefinition_in_procedureheading852 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_formalparameters_in_procedureheading854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_formalparameters862 = new BitSet(new long[]{0x4000000000020040L});
	public static final BitSet FOLLOW_formalparametersection_in_formalparameters865 = new BitSet(new long[]{0x0000000008020000L});
	public static final BitSet FOLLOW_27_in_formalparameters869 = new BitSet(new long[]{0x4000000000000040L});
	public static final BitSet FOLLOW_formalparametersection_in_formalparameters871 = new BitSet(new long[]{0x0000000008020000L});
	public static final BitSet FOLLOW_17_in_formalparameters877 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_formalparameters880 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_formalparameters882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_formalparametersection891 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formalparametersection894 = new BitSet(new long[]{0x0000000002100000L});
	public static final BitSet FOLLOW_20_in_formalparametersection897 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formalparametersection899 = new BitSet(new long[]{0x0000000002100000L});
	public static final BitSet FOLLOW_25_in_formalparametersection903 = new BitSet(new long[]{0x0040000200000040L});
	public static final BitSet FOLLOW_formaltype_in_formalparametersection905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_formaltype912 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_formaltype914 = new BitSet(new long[]{0x0040000200000040L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_formaltype920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_proceduretype_in_formaltype924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationsequence_in_procedurebody932 = new BitSet(new long[]{0x0000020400000000L});
	public static final BitSet FOLLOW_34_in_procedurebody935 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_procedurebody937 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_procedurebody941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_forwarddeclaration947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_forwarddeclaration949 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_forwarddeclaration951 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_18_in_forwarddeclaration953 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_formalparameters_in_forwarddeclaration956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statementsequence964 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_statementsequence967 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statement_in_statementsequence969 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_statement2_in_statement980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstatement_in_statement984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_casestatement_in_statement988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestatement_in_statement992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatstatement_in_statement996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopstatement_in_statement1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withstatement_in_statement1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_statement1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_statement1013 = new BitSet(new long[]{0x00040000002924E2L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_statement1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_statement21025 = new BitSet(new long[]{0x0000000004010000L});
	public static final BitSet FOLLOW_26_in_statement21028 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_statement21030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedurecall_in_statement21034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparameters_in_procedurecall1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ifstatement1052 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_ifstatement1054 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_ifstatement1056 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_ifstatement1058 = new BitSet(new long[]{0x0000038000000000L});
	public static final BitSet FOLLOW_40_in_ifstatement1061 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_ifstatement1063 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_ifstatement1065 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_ifstatement1067 = new BitSet(new long[]{0x0000038000000000L});
	public static final BitSet FOLLOW_39_in_ifstatement1072 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_ifstatement1074 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ifstatement1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_casestatement1085 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_casestatement1087 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_casestatement1089 = new BitSet(new long[]{0x00040280002924E0L,0x00000000000002C0L});
	public static final BitSet FOLLOW_ocase_in_casestatement1091 = new BitSet(new long[]{0x0000028000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_casestatement1094 = new BitSet(new long[]{0x00040280002924E0L,0x00000000000002C0L});
	public static final BitSet FOLLOW_ocase_in_casestatement1096 = new BitSet(new long[]{0x0000028000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_39_in_casestatement1101 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_casestatement1103 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_casestatement1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caselabellist_in_ocase1116 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ocase1118 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_ocase1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caselabels_in_caselabellist1129 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_caselabellist1132 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_caselabels_in_caselabellist1134 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_constantexpression_in_caselabels1142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_caselabels1145 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_constantexpression_in_caselabels1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_whilestatement1155 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_whilestatement1157 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_whilestatement1159 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_whilestatement1161 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_whilestatement1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_repeatstatement1169 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_repeatstatement1171 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_repeatstatement1173 = new BitSet(new long[]{0x00040000002924E0L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_repeatstatement1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_loopstatement1181 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_loopstatement1183 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_loopstatement1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_withstatement1192 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_withstatement1194 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_withstatement1196 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_qualifiedidentifier_in_withstatement1198 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_withstatement1200 = new BitSet(new long[]{0x83008C0808000040L,0x0000000000000001L});
	public static final BitSet FOLLOW_statementsequence_in_withstatement1202 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_withstatement1204 = new BitSet(new long[]{0x0000000000000002L});
}
