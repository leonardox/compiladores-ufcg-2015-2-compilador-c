package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.AnsicGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAnsicParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PTR_OP", "RULE_INC_OP", "RULE_DEC_OP", "RULE_SIZEOF", "RULE_LEFT_OP", "RULE_RIGHT_OP", "RULE_LE_OP", "RULE_GE_OP", "RULE_EQ_OP", "RULE_NE_OP", "RULE_AND_OP", "RULE_OR_OP", "RULE_MUL_ASSIGN", "RULE_DIV_ASSIGN", "RULE_MOD_ASSIGN", "RULE_ADD_ASSIGN", "RULE_SUB_ASSIGN", "RULE_LEFT_ASSIGN", "RULE_RIGHT_ASSIGN", "RULE_AND_ASSIGN", "RULE_XOR_ASSIGN", "RULE_OR_ASSIGN", "RULE_TYPEDEF", "RULE_EXTERN", "RULE_STATIC", "RULE_AUTO", "RULE_REGISTER", "RULE_VOID", "RULE_SHORT", "RULE_INT", "RULE_LONG", "RULE_FLOAT", "RULE_DOUBLE", "RULE_SIGNED", "RULE_UNSIGNED", "RULE_STRUCT", "RULE_UNION", "RULE_ENUM", "RULE_CONST", "RULE_VOLATILE", "RULE_ELLIPSIS", "RULE_CASE", "RULE_DEFAULT", "RULE_IF", "RULE_ELSE", "RULE_SWITCH", "RULE_WHILE", "RULE_DO", "RULE_FOR", "RULE_GOTO", "RULE_CONTINUE", "RULE_BREAK", "RULE_RETURNO", "RULE_ID", "RULE_STRING", "RULE_D", "RULE_E", "RULE_CHAR", "RULE_INTE", "RULE_L", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'.'", "','", "'&'", "'*'", "'+'", "'-'", "'~'", "'!'", "'/'", "'%'", "'<'", "'>'", "'^'", "'|'", "'?'", "':'", "'='", "';'", "'charz'", "'{'", "'}'", "'f'", "'F'", "'l'", "'L'", "'u'", "'U'"
    };
    public static final int RULE_STRUCT=39;
    public static final int RULE_DEC_OP=6;
    public static final int RULE_REGISTER=30;
    public static final int RULE_WHILE=50;
    public static final int RULE_ID=57;
    public static final int RULE_SUB_ASSIGN=20;
    public static final int RULE_AUTO=29;
    public static final int RULE_INT=33;
    public static final int RULE_RETURNO=56;
    public static final int RULE_ML_COMMENT=64;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_MUL_ASSIGN=16;
    public static final int RULE_ENUM=41;
    public static final int RULE_CONST=42;
    public static final int RULE_VOLATILE=43;
    public static final int RULE_DEFAULT=46;
    public static final int RULE_IF=47;
    public static final int RULE_ELLIPSIS=44;
    public static final int RULE_AND_OP=14;
    public static final int RULE_LEFT_ASSIGN=21;
    public static final int RULE_SIGNED=37;
    public static final int RULE_EQ_OP=12;
    public static final int RULE_UNSIGNED=38;
    public static final int RULE_STATIC=28;
    public static final int RULE_LEFT_OP=8;
    public static final int RULE_CONTINUE=54;
    public static final int RULE_AND_ASSIGN=23;
    public static final int RULE_SWITCH=49;
    public static final int RULE_L=63;
    public static final int RULE_OR_OP=15;
    public static final int RULE_FLOAT=35;
    public static final int RULE_E=60;
    public static final int RULE_D=59;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_EXTERN=27;
    public static final int RULE_GE_OP=11;
    public static final int RULE_CHAR=61;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int RULE_INTE=62;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_MOD_ASSIGN=18;
    public static final int RULE_SHORT=32;
    public static final int RULE_CASE=45;
    public static final int RULE_XOR_ASSIGN=24;
    public static final int RULE_DO=51;
    public static final int RULE_INC_OP=5;
    public static final int RULE_UNION=40;
    public static final int RULE_ELSE=48;
    public static final int RULE_TYPEDEF=26;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_NE_OP=13;
    public static final int RULE_OR_ASSIGN=25;
    public static final int RULE_PTR_OP=4;
    public static final int RULE_STRING=58;
    public static final int RULE_SL_COMMENT=65;
    public static final int RULE_DOUBLE=36;
    public static final int RULE_BREAK=55;
    public static final int T__77=77;
    public static final int RULE_ADD_ASSIGN=19;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int RULE_FOR=52;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_SIZEOF=7;
    public static final int RULE_VOID=31;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_GOTO=53;
    public static final int RULE_WS=66;
    public static final int RULE_RIGHT_ASSIGN=22;
    public static final int RULE_ANY_OTHER=67;
    public static final int RULE_RIGHT_OP=9;
    public static final int RULE_DIV_ASSIGN=17;
    public static final int RULE_LE_OP=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_LONG=34;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalAnsicParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnsicParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnsicParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnsic.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private AnsicGrammarAccess grammarAccess;

        public InternalAnsicParser(TokenStream input, AnsicGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected AnsicGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalAnsic.g:70:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalAnsic.g:70:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalAnsic.g:71:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalAnsic.g:77:1: ruleDomainModel returns [EObject current=null] : ( (lv_geetings_0_0= ruletranslation_unit ) ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_geetings_0_0 = null;



        	enterRule();

        try {
            // InternalAnsic.g:83:2: ( ( (lv_geetings_0_0= ruletranslation_unit ) ) )
            // InternalAnsic.g:84:2: ( (lv_geetings_0_0= ruletranslation_unit ) )
            {
            // InternalAnsic.g:84:2: ( (lv_geetings_0_0= ruletranslation_unit ) )
            // InternalAnsic.g:85:3: (lv_geetings_0_0= ruletranslation_unit )
            {
            // InternalAnsic.g:85:3: (lv_geetings_0_0= ruletranslation_unit )
            // InternalAnsic.g:86:4: lv_geetings_0_0= ruletranslation_unit
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDomainModelAccess().getGeetingsTranslation_unitParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_geetings_0_0=ruletranslation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getDomainModelRule());
              				}
              				add(
              					current,
              					"geetings",
              					lv_geetings_0_0,
              					"org.xtext.example.Ansic.translation_unit");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleprimary_expression"
    // InternalAnsic.g:106:1: entryRuleprimary_expression returns [String current=null] : iv_ruleprimary_expression= ruleprimary_expression EOF ;
    public final String entryRuleprimary_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprimary_expression = null;


        try {
            // InternalAnsic.g:106:58: (iv_ruleprimary_expression= ruleprimary_expression EOF )
            // InternalAnsic.g:107:2: iv_ruleprimary_expression= ruleprimary_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimary_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprimary_expression=ruleprimary_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimary_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprimary_expression"


    // $ANTLR start "ruleprimary_expression"
    // InternalAnsic.g:113:1: ruleprimary_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= ruleIDENTIFIER | this_CONSTANT_1= ruleCONSTANT | this_STRING_LITERAL_2= ruleSTRING_LITERAL | (kw= '(' this_expression_4= ruleexpression kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleprimary_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_0 = null;

        AntlrDatatypeRuleToken this_CONSTANT_1 = null;

        AntlrDatatypeRuleToken this_STRING_LITERAL_2 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;



        	enterRule();

        try {
            // InternalAnsic.g:119:2: ( (this_IDENTIFIER_0= ruleIDENTIFIER | this_CONSTANT_1= ruleCONSTANT | this_STRING_LITERAL_2= ruleSTRING_LITERAL | (kw= '(' this_expression_4= ruleexpression kw= ')' ) ) )
            // InternalAnsic.g:120:2: (this_IDENTIFIER_0= ruleIDENTIFIER | this_CONSTANT_1= ruleCONSTANT | this_STRING_LITERAL_2= ruleSTRING_LITERAL | (kw= '(' this_expression_4= ruleexpression kw= ')' ) )
            {
            // InternalAnsic.g:120:2: (this_IDENTIFIER_0= ruleIDENTIFIER | this_CONSTANT_1= ruleCONSTANT | this_STRING_LITERAL_2= ruleSTRING_LITERAL | (kw= '(' this_expression_4= ruleexpression kw= ')' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case RULE_D:
            case 72:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            case 68:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAnsic.g:121:3: this_IDENTIFIER_0= ruleIDENTIFIER
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimary_expressionAccess().getIDENTIFIERParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IDENTIFIER_0=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENTIFIER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:132:3: this_CONSTANT_1= ruleCONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimary_expressionAccess().getCONSTANTParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CONSTANT_1=ruleCONSTANT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONSTANT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:143:3: this_STRING_LITERAL_2= ruleSTRING_LITERAL
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimary_expressionAccess().getSTRING_LITERALParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_STRING_LITERAL_2=ruleSTRING_LITERAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_LITERAL_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:154:3: (kw= '(' this_expression_4= ruleexpression kw= ')' )
                    {
                    // InternalAnsic.g:154:3: (kw= '(' this_expression_4= ruleexpression kw= ')' )
                    // InternalAnsic.g:155:4: kw= '(' this_expression_4= ruleexpression kw= ')'
                    {
                    kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimary_expressionAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimary_expressionAccess().getExpressionParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_4=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimary_expressionAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprimary_expression"


    // $ANTLR start "entryRulepostfix_expressionL"
    // InternalAnsic.g:180:1: entryRulepostfix_expressionL returns [String current=null] : iv_rulepostfix_expressionL= rulepostfix_expressionL EOF ;
    public final String entryRulepostfix_expressionL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepostfix_expressionL = null;


        try {
            // InternalAnsic.g:180:59: (iv_rulepostfix_expressionL= rulepostfix_expressionL EOF )
            // InternalAnsic.g:181:2: iv_rulepostfix_expressionL= rulepostfix_expressionL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfix_expressionLRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepostfix_expressionL=rulepostfix_expressionL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepostfix_expressionL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepostfix_expressionL"


    // $ANTLR start "rulepostfix_expressionL"
    // InternalAnsic.g:187:1: rulepostfix_expressionL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' this_expression_1= ruleexpression kw= ']' this_postfix_expressionL_3= rulepostfix_expressionL ) | (kw= '(' kw= ')' this_postfix_expressionL_6= rulepostfix_expressionL ) | (kw= '(' this_argument_expression_list_8= ruleargument_expression_list kw= ')' this_postfix_expressionL_10= rulepostfix_expressionL ) | (kw= '.' this_IDENTIFIER_12= ruleIDENTIFIER this_postfix_expressionL_13= rulepostfix_expressionL ) | (this_PTR_OP_14= RULE_PTR_OP this_IDENTIFIER_15= ruleIDENTIFIER this_postfix_expressionL_16= rulepostfix_expressionL ) | (this_INC_OP_17= RULE_INC_OP this_postfix_expressionL_18= rulepostfix_expressionL ) | (this_DEC_OP_19= RULE_DEC_OP this_postfix_expressionL_20= rulepostfix_expressionL )? ) ;
    public final AntlrDatatypeRuleToken rulepostfix_expressionL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_PTR_OP_14=null;
        Token this_INC_OP_17=null;
        Token this_DEC_OP_19=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_postfix_expressionL_3 = null;

        AntlrDatatypeRuleToken this_postfix_expressionL_6 = null;

        AntlrDatatypeRuleToken this_argument_expression_list_8 = null;

        AntlrDatatypeRuleToken this_postfix_expressionL_10 = null;

        AntlrDatatypeRuleToken this_IDENTIFIER_12 = null;

        AntlrDatatypeRuleToken this_postfix_expressionL_13 = null;

        AntlrDatatypeRuleToken this_IDENTIFIER_15 = null;

        AntlrDatatypeRuleToken this_postfix_expressionL_16 = null;

        AntlrDatatypeRuleToken this_postfix_expressionL_18 = null;

        AntlrDatatypeRuleToken this_postfix_expressionL_20 = null;



        	enterRule();

        try {
            // InternalAnsic.g:193:2: ( ( (kw= '[' this_expression_1= ruleexpression kw= ']' this_postfix_expressionL_3= rulepostfix_expressionL ) | (kw= '(' kw= ')' this_postfix_expressionL_6= rulepostfix_expressionL ) | (kw= '(' this_argument_expression_list_8= ruleargument_expression_list kw= ')' this_postfix_expressionL_10= rulepostfix_expressionL ) | (kw= '.' this_IDENTIFIER_12= ruleIDENTIFIER this_postfix_expressionL_13= rulepostfix_expressionL ) | (this_PTR_OP_14= RULE_PTR_OP this_IDENTIFIER_15= ruleIDENTIFIER this_postfix_expressionL_16= rulepostfix_expressionL ) | (this_INC_OP_17= RULE_INC_OP this_postfix_expressionL_18= rulepostfix_expressionL ) | (this_DEC_OP_19= RULE_DEC_OP this_postfix_expressionL_20= rulepostfix_expressionL )? ) )
            // InternalAnsic.g:194:2: ( (kw= '[' this_expression_1= ruleexpression kw= ']' this_postfix_expressionL_3= rulepostfix_expressionL ) | (kw= '(' kw= ')' this_postfix_expressionL_6= rulepostfix_expressionL ) | (kw= '(' this_argument_expression_list_8= ruleargument_expression_list kw= ')' this_postfix_expressionL_10= rulepostfix_expressionL ) | (kw= '.' this_IDENTIFIER_12= ruleIDENTIFIER this_postfix_expressionL_13= rulepostfix_expressionL ) | (this_PTR_OP_14= RULE_PTR_OP this_IDENTIFIER_15= ruleIDENTIFIER this_postfix_expressionL_16= rulepostfix_expressionL ) | (this_INC_OP_17= RULE_INC_OP this_postfix_expressionL_18= rulepostfix_expressionL ) | (this_DEC_OP_19= RULE_DEC_OP this_postfix_expressionL_20= rulepostfix_expressionL )? )
            {
            // InternalAnsic.g:194:2: ( (kw= '[' this_expression_1= ruleexpression kw= ']' this_postfix_expressionL_3= rulepostfix_expressionL ) | (kw= '(' kw= ')' this_postfix_expressionL_6= rulepostfix_expressionL ) | (kw= '(' this_argument_expression_list_8= ruleargument_expression_list kw= ')' this_postfix_expressionL_10= rulepostfix_expressionL ) | (kw= '.' this_IDENTIFIER_12= ruleIDENTIFIER this_postfix_expressionL_13= rulepostfix_expressionL ) | (this_PTR_OP_14= RULE_PTR_OP this_IDENTIFIER_15= ruleIDENTIFIER this_postfix_expressionL_16= rulepostfix_expressionL ) | (this_INC_OP_17= RULE_INC_OP this_postfix_expressionL_18= rulepostfix_expressionL ) | (this_DEC_OP_19= RULE_DEC_OP this_postfix_expressionL_20= rulepostfix_expressionL )? )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt3=1;
                }
                break;
            case 68:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==69) ) {
                    alt3=2;
                }
                else if ( ((LA3_2>=RULE_INC_OP && LA3_2<=RULE_SIZEOF)||(LA3_2>=RULE_ID && LA3_2<=RULE_D)||LA3_2==68||LA3_2==72||(LA3_2>=74 && LA3_2<=79)) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                alt3=4;
                }
                break;
            case RULE_PTR_OP:
                {
                alt3=5;
                }
                break;
            case RULE_INC_OP:
                {
                alt3=6;
                }
                break;
            case EOF:
            case RULE_DEC_OP:
            case RULE_LEFT_OP:
            case RULE_RIGHT_OP:
            case RULE_LE_OP:
            case RULE_GE_OP:
            case RULE_EQ_OP:
            case RULE_NE_OP:
            case RULE_AND_OP:
            case RULE_OR_OP:
            case RULE_MUL_ASSIGN:
            case RULE_DIV_ASSIGN:
            case RULE_MOD_ASSIGN:
            case RULE_ADD_ASSIGN:
            case RULE_SUB_ASSIGN:
            case RULE_LEFT_ASSIGN:
            case RULE_RIGHT_ASSIGN:
            case RULE_AND_ASSIGN:
            case RULE_XOR_ASSIGN:
            case RULE_OR_ASSIGN:
            case 69:
            case 71:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 92:
                {
                alt3=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAnsic.g:195:3: (kw= '[' this_expression_1= ruleexpression kw= ']' this_postfix_expressionL_3= rulepostfix_expressionL )
                    {
                    // InternalAnsic.g:195:3: (kw= '[' this_expression_1= ruleexpression kw= ']' this_postfix_expressionL_3= rulepostfix_expressionL )
                    // InternalAnsic.g:196:4: kw= '[' this_expression_1= ruleexpression kw= ']' this_postfix_expressionL_3= rulepostfix_expressionL
                    {
                    kw=(Token)match(input,70,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPostfix_expressionLAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_expression_1=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,71,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPostfix_expressionLAccess().getRightSquareBracketKeyword_0_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getPostfix_expressionLParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_postfix_expressionL_3=rulepostfix_expressionL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_postfix_expressionL_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:228:3: (kw= '(' kw= ')' this_postfix_expressionL_6= rulepostfix_expressionL )
                    {
                    // InternalAnsic.g:228:3: (kw= '(' kw= ')' this_postfix_expressionL_6= rulepostfix_expressionL )
                    // InternalAnsic.g:229:4: kw= '(' kw= ')' this_postfix_expressionL_6= rulepostfix_expressionL
                    {
                    kw=(Token)match(input,68,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPostfix_expressionLAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPostfix_expressionLAccess().getRightParenthesisKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getPostfix_expressionLParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_postfix_expressionL_6=rulepostfix_expressionL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_postfix_expressionL_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:251:3: (kw= '(' this_argument_expression_list_8= ruleargument_expression_list kw= ')' this_postfix_expressionL_10= rulepostfix_expressionL )
                    {
                    // InternalAnsic.g:251:3: (kw= '(' this_argument_expression_list_8= ruleargument_expression_list kw= ')' this_postfix_expressionL_10= rulepostfix_expressionL )
                    // InternalAnsic.g:252:4: kw= '(' this_argument_expression_list_8= ruleargument_expression_list kw= ')' this_postfix_expressionL_10= rulepostfix_expressionL
                    {
                    kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPostfix_expressionLAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getArgument_expression_listParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_argument_expression_list_8=ruleargument_expression_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_argument_expression_list_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPostfix_expressionLAccess().getRightParenthesisKeyword_2_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getPostfix_expressionLParserRuleCall_2_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_postfix_expressionL_10=rulepostfix_expressionL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_postfix_expressionL_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:284:3: (kw= '.' this_IDENTIFIER_12= ruleIDENTIFIER this_postfix_expressionL_13= rulepostfix_expressionL )
                    {
                    // InternalAnsic.g:284:3: (kw= '.' this_IDENTIFIER_12= ruleIDENTIFIER this_postfix_expressionL_13= rulepostfix_expressionL )
                    // InternalAnsic.g:285:4: kw= '.' this_IDENTIFIER_12= ruleIDENTIFIER this_postfix_expressionL_13= rulepostfix_expressionL
                    {
                    kw=(Token)match(input,72,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPostfix_expressionLAccess().getFullStopKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getIDENTIFIERParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_IDENTIFIER_12=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getPostfix_expressionLParserRuleCall_3_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_postfix_expressionL_13=rulepostfix_expressionL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_postfix_expressionL_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAnsic.g:312:3: (this_PTR_OP_14= RULE_PTR_OP this_IDENTIFIER_15= ruleIDENTIFIER this_postfix_expressionL_16= rulepostfix_expressionL )
                    {
                    // InternalAnsic.g:312:3: (this_PTR_OP_14= RULE_PTR_OP this_IDENTIFIER_15= ruleIDENTIFIER this_postfix_expressionL_16= rulepostfix_expressionL )
                    // InternalAnsic.g:313:4: this_PTR_OP_14= RULE_PTR_OP this_IDENTIFIER_15= ruleIDENTIFIER this_postfix_expressionL_16= rulepostfix_expressionL
                    {
                    this_PTR_OP_14=(Token)match(input,RULE_PTR_OP,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PTR_OP_14);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PTR_OP_14, grammarAccess.getPostfix_expressionLAccess().getPTR_OPTerminalRuleCall_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getIDENTIFIERParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_IDENTIFIER_15=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_15);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getPostfix_expressionLParserRuleCall_4_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_postfix_expressionL_16=rulepostfix_expressionL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_postfix_expressionL_16);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAnsic.g:342:3: (this_INC_OP_17= RULE_INC_OP this_postfix_expressionL_18= rulepostfix_expressionL )
                    {
                    // InternalAnsic.g:342:3: (this_INC_OP_17= RULE_INC_OP this_postfix_expressionL_18= rulepostfix_expressionL )
                    // InternalAnsic.g:343:4: this_INC_OP_17= RULE_INC_OP this_postfix_expressionL_18= rulepostfix_expressionL
                    {
                    this_INC_OP_17=(Token)match(input,RULE_INC_OP,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INC_OP_17);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INC_OP_17, grammarAccess.getPostfix_expressionLAccess().getINC_OPTerminalRuleCall_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getPostfix_expressionLParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_postfix_expressionL_18=rulepostfix_expressionL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_postfix_expressionL_18);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAnsic.g:362:3: (this_DEC_OP_19= RULE_DEC_OP this_postfix_expressionL_20= rulepostfix_expressionL )?
                    {
                    // InternalAnsic.g:362:3: (this_DEC_OP_19= RULE_DEC_OP this_postfix_expressionL_20= rulepostfix_expressionL )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_DEC_OP) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalAnsic.g:363:4: this_DEC_OP_19= RULE_DEC_OP this_postfix_expressionL_20= rulepostfix_expressionL
                            {
                            this_DEC_OP_19=(Token)match(input,RULE_DEC_OP,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_DEC_OP_19);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				newLeafNode(this_DEC_OP_19, grammarAccess.getPostfix_expressionLAccess().getDEC_OPTerminalRuleCall_6_0());
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getPostfix_expressionLAccess().getPostfix_expressionLParserRuleCall_6_1());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_postfix_expressionL_20=rulepostfix_expressionL();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_postfix_expressionL_20);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepostfix_expressionL"


    // $ANTLR start "entryRulepostfix_expression"
    // InternalAnsic.g:385:1: entryRulepostfix_expression returns [String current=null] : iv_rulepostfix_expression= rulepostfix_expression EOF ;
    public final String entryRulepostfix_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepostfix_expression = null;


        try {
            // InternalAnsic.g:385:58: (iv_rulepostfix_expression= rulepostfix_expression EOF )
            // InternalAnsic.g:386:2: iv_rulepostfix_expression= rulepostfix_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfix_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepostfix_expression=rulepostfix_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepostfix_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepostfix_expression"


    // $ANTLR start "rulepostfix_expression"
    // InternalAnsic.g:392:1: rulepostfix_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_primary_expression_0= ruleprimary_expression this_postfix_expressionL_1= rulepostfix_expressionL ) ;
    public final AntlrDatatypeRuleToken rulepostfix_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_primary_expression_0 = null;

        AntlrDatatypeRuleToken this_postfix_expressionL_1 = null;



        	enterRule();

        try {
            // InternalAnsic.g:398:2: ( (this_primary_expression_0= ruleprimary_expression this_postfix_expressionL_1= rulepostfix_expressionL ) )
            // InternalAnsic.g:399:2: (this_primary_expression_0= ruleprimary_expression this_postfix_expressionL_1= rulepostfix_expressionL )
            {
            // InternalAnsic.g:399:2: (this_primary_expression_0= ruleprimary_expression this_postfix_expressionL_1= rulepostfix_expressionL )
            // InternalAnsic.g:400:3: this_primary_expression_0= ruleprimary_expression this_postfix_expressionL_1= rulepostfix_expressionL
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPostfix_expressionAccess().getPrimary_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_primary_expression_0=ruleprimary_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_primary_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPostfix_expressionAccess().getPostfix_expressionLParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_postfix_expressionL_1=rulepostfix_expressionL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_postfix_expressionL_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepostfix_expression"


    // $ANTLR start "entryRuleargument_expression_listI"
    // InternalAnsic.g:424:1: entryRuleargument_expression_listI returns [String current=null] : iv_ruleargument_expression_listI= ruleargument_expression_listI EOF ;
    public final String entryRuleargument_expression_listI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleargument_expression_listI = null;


        try {
            // InternalAnsic.g:424:65: (iv_ruleargument_expression_listI= ruleargument_expression_listI EOF )
            // InternalAnsic.g:425:2: iv_ruleargument_expression_listI= ruleargument_expression_listI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgument_expression_listIRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleargument_expression_listI=ruleargument_expression_listI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleargument_expression_listI.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleargument_expression_listI"


    // $ANTLR start "ruleargument_expression_listI"
    // InternalAnsic.g:431:1: ruleargument_expression_listI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' this_assignment_expression_1= ruleassignment_expression this_argument_expression_listI_2= ruleargument_expression_listI )? ;
    public final AntlrDatatypeRuleToken ruleargument_expression_listI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_assignment_expression_1 = null;

        AntlrDatatypeRuleToken this_argument_expression_listI_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:437:2: ( (kw= ',' this_assignment_expression_1= ruleassignment_expression this_argument_expression_listI_2= ruleargument_expression_listI )? )
            // InternalAnsic.g:438:2: (kw= ',' this_assignment_expression_1= ruleassignment_expression this_argument_expression_listI_2= ruleargument_expression_listI )?
            {
            // InternalAnsic.g:438:2: (kw= ',' this_assignment_expression_1= ruleassignment_expression this_argument_expression_listI_2= ruleargument_expression_listI )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==73) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAnsic.g:439:3: kw= ',' this_assignment_expression_1= ruleassignment_expression this_argument_expression_listI_2= ruleargument_expression_listI
                    {
                    kw=(Token)match(input,73,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getArgument_expression_listIAccess().getCommaKeyword_0());
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgument_expression_listIAccess().getAssignment_expressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_8);
                    this_assignment_expression_1=ruleassignment_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_assignment_expression_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgument_expression_listIAccess().getArgument_expression_listIParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_argument_expression_listI_2=ruleargument_expression_listI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_argument_expression_listI_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleargument_expression_listI"


    // $ANTLR start "entryRuleargument_expression_list"
    // InternalAnsic.g:468:1: entryRuleargument_expression_list returns [String current=null] : iv_ruleargument_expression_list= ruleargument_expression_list EOF ;
    public final String entryRuleargument_expression_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleargument_expression_list = null;


        try {
            // InternalAnsic.g:468:64: (iv_ruleargument_expression_list= ruleargument_expression_list EOF )
            // InternalAnsic.g:469:2: iv_ruleargument_expression_list= ruleargument_expression_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgument_expression_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleargument_expression_list=ruleargument_expression_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleargument_expression_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleargument_expression_list"


    // $ANTLR start "ruleargument_expression_list"
    // InternalAnsic.g:475:1: ruleargument_expression_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_assignment_expression_0= ruleassignment_expression this_argument_expression_listI_1= ruleargument_expression_listI ) ;
    public final AntlrDatatypeRuleToken ruleargument_expression_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_assignment_expression_0 = null;

        AntlrDatatypeRuleToken this_argument_expression_listI_1 = null;



        	enterRule();

        try {
            // InternalAnsic.g:481:2: ( (this_assignment_expression_0= ruleassignment_expression this_argument_expression_listI_1= ruleargument_expression_listI ) )
            // InternalAnsic.g:482:2: (this_assignment_expression_0= ruleassignment_expression this_argument_expression_listI_1= ruleargument_expression_listI )
            {
            // InternalAnsic.g:482:2: (this_assignment_expression_0= ruleassignment_expression this_argument_expression_listI_1= ruleargument_expression_listI )
            // InternalAnsic.g:483:3: this_assignment_expression_0= ruleassignment_expression this_argument_expression_listI_1= ruleargument_expression_listI
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArgument_expression_listAccess().getAssignment_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_assignment_expression_0=ruleassignment_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_assignment_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArgument_expression_listAccess().getArgument_expression_listIParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_argument_expression_listI_1=ruleargument_expression_listI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_argument_expression_listI_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleargument_expression_list"


    // $ANTLR start "entryRuleunary_expression"
    // InternalAnsic.g:507:1: entryRuleunary_expression returns [String current=null] : iv_ruleunary_expression= ruleunary_expression EOF ;
    public final String entryRuleunary_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_expression = null;


        try {
            // InternalAnsic.g:507:56: (iv_ruleunary_expression= ruleunary_expression EOF )
            // InternalAnsic.g:508:2: iv_ruleunary_expression= ruleunary_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnary_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunary_expression=ruleunary_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunary_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunary_expression"


    // $ANTLR start "ruleunary_expression"
    // InternalAnsic.g:514:1: ruleunary_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_postfix_expression_0= rulepostfix_expression | (this_INC_OP_1= RULE_INC_OP this_unary_expression_2= ruleunary_expression ) | (this_DEC_OP_3= RULE_DEC_OP this_unary_expression_4= ruleunary_expression ) | (this_unary_operator_5= ruleunary_operator this_cast_expression_6= rulecast_expression ) | (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression ) | (this_SIZEOF_9= RULE_SIZEOF kw= '(' this_type_name_11= ruletype_name kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleunary_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INC_OP_1=null;
        Token this_DEC_OP_3=null;
        Token this_SIZEOF_7=null;
        Token this_SIZEOF_9=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_postfix_expression_0 = null;

        AntlrDatatypeRuleToken this_unary_expression_2 = null;

        AntlrDatatypeRuleToken this_unary_expression_4 = null;

        AntlrDatatypeRuleToken this_unary_operator_5 = null;

        AntlrDatatypeRuleToken this_cast_expression_6 = null;

        AntlrDatatypeRuleToken this_unary_expression_8 = null;

        AntlrDatatypeRuleToken this_type_name_11 = null;



        	enterRule();

        try {
            // InternalAnsic.g:520:2: ( (this_postfix_expression_0= rulepostfix_expression | (this_INC_OP_1= RULE_INC_OP this_unary_expression_2= ruleunary_expression ) | (this_DEC_OP_3= RULE_DEC_OP this_unary_expression_4= ruleunary_expression ) | (this_unary_operator_5= ruleunary_operator this_cast_expression_6= rulecast_expression ) | (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression ) | (this_SIZEOF_9= RULE_SIZEOF kw= '(' this_type_name_11= ruletype_name kw= ')' ) ) )
            // InternalAnsic.g:521:2: (this_postfix_expression_0= rulepostfix_expression | (this_INC_OP_1= RULE_INC_OP this_unary_expression_2= ruleunary_expression ) | (this_DEC_OP_3= RULE_DEC_OP this_unary_expression_4= ruleunary_expression ) | (this_unary_operator_5= ruleunary_operator this_cast_expression_6= rulecast_expression ) | (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression ) | (this_SIZEOF_9= RULE_SIZEOF kw= '(' this_type_name_11= ruletype_name kw= ')' ) )
            {
            // InternalAnsic.g:521:2: (this_postfix_expression_0= rulepostfix_expression | (this_INC_OP_1= RULE_INC_OP this_unary_expression_2= ruleunary_expression ) | (this_DEC_OP_3= RULE_DEC_OP this_unary_expression_4= ruleunary_expression ) | (this_unary_operator_5= ruleunary_operator this_cast_expression_6= rulecast_expression ) | (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression ) | (this_SIZEOF_9= RULE_SIZEOF kw= '(' this_type_name_11= ruletype_name kw= ')' ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalAnsic.g:522:3: this_postfix_expression_0= rulepostfix_expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnary_expressionAccess().getPostfix_expressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_postfix_expression_0=rulepostfix_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_postfix_expression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:533:3: (this_INC_OP_1= RULE_INC_OP this_unary_expression_2= ruleunary_expression )
                    {
                    // InternalAnsic.g:533:3: (this_INC_OP_1= RULE_INC_OP this_unary_expression_2= ruleunary_expression )
                    // InternalAnsic.g:534:4: this_INC_OP_1= RULE_INC_OP this_unary_expression_2= ruleunary_expression
                    {
                    this_INC_OP_1=(Token)match(input,RULE_INC_OP,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INC_OP_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INC_OP_1, grammarAccess.getUnary_expressionAccess().getINC_OPTerminalRuleCall_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnary_expressionAccess().getUnary_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_unary_expression_2=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_unary_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:553:3: (this_DEC_OP_3= RULE_DEC_OP this_unary_expression_4= ruleunary_expression )
                    {
                    // InternalAnsic.g:553:3: (this_DEC_OP_3= RULE_DEC_OP this_unary_expression_4= ruleunary_expression )
                    // InternalAnsic.g:554:4: this_DEC_OP_3= RULE_DEC_OP this_unary_expression_4= ruleunary_expression
                    {
                    this_DEC_OP_3=(Token)match(input,RULE_DEC_OP,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DEC_OP_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DEC_OP_3, grammarAccess.getUnary_expressionAccess().getDEC_OPTerminalRuleCall_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnary_expressionAccess().getUnary_expressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_unary_expression_4=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_unary_expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:573:3: (this_unary_operator_5= ruleunary_operator this_cast_expression_6= rulecast_expression )
                    {
                    // InternalAnsic.g:573:3: (this_unary_operator_5= ruleunary_operator this_cast_expression_6= rulecast_expression )
                    // InternalAnsic.g:574:4: this_unary_operator_5= ruleunary_operator this_cast_expression_6= rulecast_expression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnary_expressionAccess().getUnary_operatorParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_3);
                    this_unary_operator_5=ruleunary_operator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_unary_operator_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnary_expressionAccess().getCast_expressionParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_cast_expression_6=rulecast_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_cast_expression_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAnsic.g:596:3: (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression )
                    {
                    // InternalAnsic.g:596:3: (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression )
                    // InternalAnsic.g:597:4: this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression
                    {
                    this_SIZEOF_7=(Token)match(input,RULE_SIZEOF,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SIZEOF_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SIZEOF_7, grammarAccess.getUnary_expressionAccess().getSIZEOFTerminalRuleCall_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnary_expressionAccess().getUnary_expressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_unary_expression_8=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_unary_expression_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAnsic.g:616:3: (this_SIZEOF_9= RULE_SIZEOF kw= '(' this_type_name_11= ruletype_name kw= ')' )
                    {
                    // InternalAnsic.g:616:3: (this_SIZEOF_9= RULE_SIZEOF kw= '(' this_type_name_11= ruletype_name kw= ')' )
                    // InternalAnsic.g:617:4: this_SIZEOF_9= RULE_SIZEOF kw= '(' this_type_name_11= ruletype_name kw= ')'
                    {
                    this_SIZEOF_9=(Token)match(input,RULE_SIZEOF,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SIZEOF_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SIZEOF_9, grammarAccess.getUnary_expressionAccess().getSIZEOFTerminalRuleCall_5_0());
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getUnary_expressionAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnary_expressionAccess().getType_nameParserRuleCall_5_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_type_name_11=ruletype_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_name_11);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getUnary_expressionAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunary_expression"


    // $ANTLR start "entryRuleunary_operator"
    // InternalAnsic.g:649:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // InternalAnsic.g:649:54: (iv_ruleunary_operator= ruleunary_operator EOF )
            // InternalAnsic.g:650:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnary_operatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunary_operator=ruleunary_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunary_operator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunary_operator"


    // $ANTLR start "ruleunary_operator"
    // InternalAnsic.g:656:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '*' | kw= '+' | kw= '-' | kw= '~' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAnsic.g:662:2: ( (kw= '&' | kw= '*' | kw= '+' | kw= '-' | kw= '~' | kw= '!' ) )
            // InternalAnsic.g:663:2: (kw= '&' | kw= '*' | kw= '+' | kw= '-' | kw= '~' | kw= '!' )
            {
            // InternalAnsic.g:663:2: (kw= '&' | kw= '*' | kw= '+' | kw= '-' | kw= '~' | kw= '!' )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt6=1;
                }
                break;
            case 75:
                {
                alt6=2;
                }
                break;
            case 76:
                {
                alt6=3;
                }
                break;
            case 77:
                {
                alt6=4;
                }
                break;
            case 78:
                {
                alt6=5;
                }
                break;
            case 79:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAnsic.g:664:3: kw= '&'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getAmpersandKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:670:3: kw= '*'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:676:3: kw= '+'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:682:3: kw= '-'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAnsic.g:688:3: kw= '~'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getTildeKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAnsic.g:694:3: kw= '!'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getExclamationMarkKeyword_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunary_operator"


    // $ANTLR start "entryRulecast_expression"
    // InternalAnsic.g:703:1: entryRulecast_expression returns [String current=null] : iv_rulecast_expression= rulecast_expression EOF ;
    public final String entryRulecast_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecast_expression = null;


        try {
            // InternalAnsic.g:703:55: (iv_rulecast_expression= rulecast_expression EOF )
            // InternalAnsic.g:704:2: iv_rulecast_expression= rulecast_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCast_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecast_expression=rulecast_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecast_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecast_expression"


    // $ANTLR start "rulecast_expression"
    // InternalAnsic.g:710:1: rulecast_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_unary_expression_0= ruleunary_expression | (kw= '(' this_type_name_2= ruletype_name kw= ')' this_cast_expression_4= rulecast_expression ) ) ;
    public final AntlrDatatypeRuleToken rulecast_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_unary_expression_0 = null;

        AntlrDatatypeRuleToken this_type_name_2 = null;

        AntlrDatatypeRuleToken this_cast_expression_4 = null;



        	enterRule();

        try {
            // InternalAnsic.g:716:2: ( (this_unary_expression_0= ruleunary_expression | (kw= '(' this_type_name_2= ruletype_name kw= ')' this_cast_expression_4= rulecast_expression ) ) )
            // InternalAnsic.g:717:2: (this_unary_expression_0= ruleunary_expression | (kw= '(' this_type_name_2= ruletype_name kw= ')' this_cast_expression_4= rulecast_expression ) )
            {
            // InternalAnsic.g:717:2: (this_unary_expression_0= ruleunary_expression | (kw= '(' this_type_name_2= ruletype_name kw= ')' this_cast_expression_4= rulecast_expression ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalAnsic.g:718:3: this_unary_expression_0= ruleunary_expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCast_expressionAccess().getUnary_expressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_unary_expression_0=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_unary_expression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:729:3: (kw= '(' this_type_name_2= ruletype_name kw= ')' this_cast_expression_4= rulecast_expression )
                    {
                    // InternalAnsic.g:729:3: (kw= '(' this_type_name_2= ruletype_name kw= ')' this_cast_expression_4= rulecast_expression )
                    // InternalAnsic.g:730:4: kw= '(' this_type_name_2= ruletype_name kw= ')' this_cast_expression_4= rulecast_expression
                    {
                    kw=(Token)match(input,68,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCast_expressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCast_expressionAccess().getType_nameParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_type_name_2=ruletype_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_name_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCast_expressionAccess().getRightParenthesisKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCast_expressionAccess().getCast_expressionParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_cast_expression_4=rulecast_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_cast_expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecast_expression"


    // $ANTLR start "entryRulemultiplicative_expressionI"
    // InternalAnsic.g:765:1: entryRulemultiplicative_expressionI returns [String current=null] : iv_rulemultiplicative_expressionI= rulemultiplicative_expressionI EOF ;
    public final String entryRulemultiplicative_expressionI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicative_expressionI = null;


        try {
            // InternalAnsic.g:765:66: (iv_rulemultiplicative_expressionI= rulemultiplicative_expressionI EOF )
            // InternalAnsic.g:766:2: iv_rulemultiplicative_expressionI= rulemultiplicative_expressionI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicative_expressionIRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemultiplicative_expressionI=rulemultiplicative_expressionI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultiplicative_expressionI.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiplicative_expressionI"


    // $ANTLR start "rulemultiplicative_expressionI"
    // InternalAnsic.g:772:1: rulemultiplicative_expressionI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' this_cast_expression_1= rulecast_expression this_multiplicative_expressionI_2= rulemultiplicative_expressionI ) | (kw= '/' this_cast_expression_4= rulecast_expression this_multiplicative_expressionI_5= rulemultiplicative_expressionI ) | (kw= '%' this_cast_expression_7= rulecast_expression this_multiplicative_expressionI_8= rulemultiplicative_expressionI )? ) ;
    public final AntlrDatatypeRuleToken rulemultiplicative_expressionI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_cast_expression_1 = null;

        AntlrDatatypeRuleToken this_multiplicative_expressionI_2 = null;

        AntlrDatatypeRuleToken this_cast_expression_4 = null;

        AntlrDatatypeRuleToken this_multiplicative_expressionI_5 = null;

        AntlrDatatypeRuleToken this_cast_expression_7 = null;

        AntlrDatatypeRuleToken this_multiplicative_expressionI_8 = null;



        	enterRule();

        try {
            // InternalAnsic.g:778:2: ( ( (kw= '*' this_cast_expression_1= rulecast_expression this_multiplicative_expressionI_2= rulemultiplicative_expressionI ) | (kw= '/' this_cast_expression_4= rulecast_expression this_multiplicative_expressionI_5= rulemultiplicative_expressionI ) | (kw= '%' this_cast_expression_7= rulecast_expression this_multiplicative_expressionI_8= rulemultiplicative_expressionI )? ) )
            // InternalAnsic.g:779:2: ( (kw= '*' this_cast_expression_1= rulecast_expression this_multiplicative_expressionI_2= rulemultiplicative_expressionI ) | (kw= '/' this_cast_expression_4= rulecast_expression this_multiplicative_expressionI_5= rulemultiplicative_expressionI ) | (kw= '%' this_cast_expression_7= rulecast_expression this_multiplicative_expressionI_8= rulemultiplicative_expressionI )? )
            {
            // InternalAnsic.g:779:2: ( (kw= '*' this_cast_expression_1= rulecast_expression this_multiplicative_expressionI_2= rulemultiplicative_expressionI ) | (kw= '/' this_cast_expression_4= rulecast_expression this_multiplicative_expressionI_5= rulemultiplicative_expressionI ) | (kw= '%' this_cast_expression_7= rulecast_expression this_multiplicative_expressionI_8= rulemultiplicative_expressionI )? )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt9=1;
                }
                break;
            case 80:
                {
                alt9=2;
                }
                break;
            case EOF:
            case RULE_LEFT_OP:
            case RULE_RIGHT_OP:
            case RULE_LE_OP:
            case RULE_GE_OP:
            case RULE_EQ_OP:
            case RULE_NE_OP:
            case RULE_AND_OP:
            case RULE_OR_OP:
            case 69:
            case 71:
            case 73:
            case 74:
            case 76:
            case 77:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 92:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAnsic.g:780:3: (kw= '*' this_cast_expression_1= rulecast_expression this_multiplicative_expressionI_2= rulemultiplicative_expressionI )
                    {
                    // InternalAnsic.g:780:3: (kw= '*' this_cast_expression_1= rulecast_expression this_multiplicative_expressionI_2= rulemultiplicative_expressionI )
                    // InternalAnsic.g:781:4: kw= '*' this_cast_expression_1= rulecast_expression this_multiplicative_expressionI_2= rulemultiplicative_expressionI
                    {
                    kw=(Token)match(input,75,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getMultiplicative_expressionIAccess().getAsteriskKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicative_expressionIAccess().getCast_expressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    this_cast_expression_1=rulecast_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_cast_expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicative_expressionIAccess().getMultiplicative_expressionIParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_multiplicative_expressionI_2=rulemultiplicative_expressionI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_multiplicative_expressionI_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:808:3: (kw= '/' this_cast_expression_4= rulecast_expression this_multiplicative_expressionI_5= rulemultiplicative_expressionI )
                    {
                    // InternalAnsic.g:808:3: (kw= '/' this_cast_expression_4= rulecast_expression this_multiplicative_expressionI_5= rulemultiplicative_expressionI )
                    // InternalAnsic.g:809:4: kw= '/' this_cast_expression_4= rulecast_expression this_multiplicative_expressionI_5= rulemultiplicative_expressionI
                    {
                    kw=(Token)match(input,80,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getMultiplicative_expressionIAccess().getSolidusKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicative_expressionIAccess().getCast_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    this_cast_expression_4=rulecast_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_cast_expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicative_expressionIAccess().getMultiplicative_expressionIParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_multiplicative_expressionI_5=rulemultiplicative_expressionI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_multiplicative_expressionI_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:836:3: (kw= '%' this_cast_expression_7= rulecast_expression this_multiplicative_expressionI_8= rulemultiplicative_expressionI )?
                    {
                    // InternalAnsic.g:836:3: (kw= '%' this_cast_expression_7= rulecast_expression this_multiplicative_expressionI_8= rulemultiplicative_expressionI )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==81) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAnsic.g:837:4: kw= '%' this_cast_expression_7= rulecast_expression this_multiplicative_expressionI_8= rulemultiplicative_expressionI
                            {
                            kw=(Token)match(input,81,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(kw);
                              				newLeafNode(kw, grammarAccess.getMultiplicative_expressionIAccess().getPercentSignKeyword_2_0());
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getMultiplicative_expressionIAccess().getCast_expressionParserRuleCall_2_1());
                              			
                            }
                            pushFollow(FOLLOW_11);
                            this_cast_expression_7=rulecast_expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_cast_expression_7);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getMultiplicative_expressionIAccess().getMultiplicative_expressionIParserRuleCall_2_2());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_multiplicative_expressionI_8=rulemultiplicative_expressionI();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_multiplicative_expressionI_8);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiplicative_expressionI"


    // $ANTLR start "entryRulemultiplicative_expression"
    // InternalAnsic.g:867:1: entryRulemultiplicative_expression returns [String current=null] : iv_rulemultiplicative_expression= rulemultiplicative_expression EOF ;
    public final String entryRulemultiplicative_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicative_expression = null;


        try {
            // InternalAnsic.g:867:65: (iv_rulemultiplicative_expression= rulemultiplicative_expression EOF )
            // InternalAnsic.g:868:2: iv_rulemultiplicative_expression= rulemultiplicative_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicative_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemultiplicative_expression=rulemultiplicative_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultiplicative_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiplicative_expression"


    // $ANTLR start "rulemultiplicative_expression"
    // InternalAnsic.g:874:1: rulemultiplicative_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_cast_expression_0= rulecast_expression this_multiplicative_expressionI_1= rulemultiplicative_expressionI ) ;
    public final AntlrDatatypeRuleToken rulemultiplicative_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_cast_expression_0 = null;

        AntlrDatatypeRuleToken this_multiplicative_expressionI_1 = null;



        	enterRule();

        try {
            // InternalAnsic.g:880:2: ( (this_cast_expression_0= rulecast_expression this_multiplicative_expressionI_1= rulemultiplicative_expressionI ) )
            // InternalAnsic.g:881:2: (this_cast_expression_0= rulecast_expression this_multiplicative_expressionI_1= rulemultiplicative_expressionI )
            {
            // InternalAnsic.g:881:2: (this_cast_expression_0= rulecast_expression this_multiplicative_expressionI_1= rulemultiplicative_expressionI )
            // InternalAnsic.g:882:3: this_cast_expression_0= rulecast_expression this_multiplicative_expressionI_1= rulemultiplicative_expressionI
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getCast_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_cast_expression_0=rulecast_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_cast_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicative_expressionAccess().getMultiplicative_expressionIParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_multiplicative_expressionI_1=rulemultiplicative_expressionI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_multiplicative_expressionI_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiplicative_expression"


    // $ANTLR start "entryRuleadditive_expression"
    // InternalAnsic.g:906:1: entryRuleadditive_expression returns [String current=null] : iv_ruleadditive_expression= ruleadditive_expression EOF ;
    public final String entryRuleadditive_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleadditive_expression = null;


        try {
            // InternalAnsic.g:906:59: (iv_ruleadditive_expression= ruleadditive_expression EOF )
            // InternalAnsic.g:907:2: iv_ruleadditive_expression= ruleadditive_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditive_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleadditive_expression=ruleadditive_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleadditive_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleadditive_expression"


    // $ANTLR start "ruleadditive_expression"
    // InternalAnsic.g:913:1: ruleadditive_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_multiplicative_expression_0= rulemultiplicative_expression ( (kw= '+' | kw= '-' ) this_multiplicative_expression_3= rulemultiplicative_expression )* ) ;
    public final AntlrDatatypeRuleToken ruleadditive_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_multiplicative_expression_0 = null;

        AntlrDatatypeRuleToken this_multiplicative_expression_3 = null;



        	enterRule();

        try {
            // InternalAnsic.g:919:2: ( (this_multiplicative_expression_0= rulemultiplicative_expression ( (kw= '+' | kw= '-' ) this_multiplicative_expression_3= rulemultiplicative_expression )* ) )
            // InternalAnsic.g:920:2: (this_multiplicative_expression_0= rulemultiplicative_expression ( (kw= '+' | kw= '-' ) this_multiplicative_expression_3= rulemultiplicative_expression )* )
            {
            // InternalAnsic.g:920:2: (this_multiplicative_expression_0= rulemultiplicative_expression ( (kw= '+' | kw= '-' ) this_multiplicative_expression_3= rulemultiplicative_expression )* )
            // InternalAnsic.g:921:3: this_multiplicative_expression_0= rulemultiplicative_expression ( (kw= '+' | kw= '-' ) this_multiplicative_expression_3= rulemultiplicative_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditive_expressionAccess().getMultiplicative_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_multiplicative_expression_0=rulemultiplicative_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_multiplicative_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:931:3: ( (kw= '+' | kw= '-' ) this_multiplicative_expression_3= rulemultiplicative_expression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=76 && LA11_0<=77)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAnsic.g:932:4: (kw= '+' | kw= '-' ) this_multiplicative_expression_3= rulemultiplicative_expression
            	    {
            	    // InternalAnsic.g:932:4: (kw= '+' | kw= '-' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==76) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==77) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAnsic.g:933:5: kw= '+'
            	            {
            	            kw=(Token)match(input,76,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getAdditive_expressionAccess().getPlusSignKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAnsic.g:939:5: kw= '-'
            	            {
            	            kw=(Token)match(input,77,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getAdditive_expressionAccess().getHyphenMinusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getAdditive_expressionAccess().getMultiplicative_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_12);
            	    this_multiplicative_expression_3=rulemultiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_multiplicative_expression_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleadditive_expression"


    // $ANTLR start "entryRuleshift_expression"
    // InternalAnsic.g:960:1: entryRuleshift_expression returns [String current=null] : iv_ruleshift_expression= ruleshift_expression EOF ;
    public final String entryRuleshift_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleshift_expression = null;


        try {
            // InternalAnsic.g:960:56: (iv_ruleshift_expression= ruleshift_expression EOF )
            // InternalAnsic.g:961:2: iv_ruleshift_expression= ruleshift_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShift_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleshift_expression=ruleshift_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleshift_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleshift_expression"


    // $ANTLR start "ruleshift_expression"
    // InternalAnsic.g:967:1: ruleshift_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_additive_expression_0= ruleadditive_expression ( (this_LEFT_OP_1= RULE_LEFT_OP | this_RIGHT_OP_2= RULE_RIGHT_OP ) this_additive_expression_3= ruleadditive_expression )* ) ;
    public final AntlrDatatypeRuleToken ruleshift_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LEFT_OP_1=null;
        Token this_RIGHT_OP_2=null;
        AntlrDatatypeRuleToken this_additive_expression_0 = null;

        AntlrDatatypeRuleToken this_additive_expression_3 = null;



        	enterRule();

        try {
            // InternalAnsic.g:973:2: ( (this_additive_expression_0= ruleadditive_expression ( (this_LEFT_OP_1= RULE_LEFT_OP | this_RIGHT_OP_2= RULE_RIGHT_OP ) this_additive_expression_3= ruleadditive_expression )* ) )
            // InternalAnsic.g:974:2: (this_additive_expression_0= ruleadditive_expression ( (this_LEFT_OP_1= RULE_LEFT_OP | this_RIGHT_OP_2= RULE_RIGHT_OP ) this_additive_expression_3= ruleadditive_expression )* )
            {
            // InternalAnsic.g:974:2: (this_additive_expression_0= ruleadditive_expression ( (this_LEFT_OP_1= RULE_LEFT_OP | this_RIGHT_OP_2= RULE_RIGHT_OP ) this_additive_expression_3= ruleadditive_expression )* )
            // InternalAnsic.g:975:3: this_additive_expression_0= ruleadditive_expression ( (this_LEFT_OP_1= RULE_LEFT_OP | this_RIGHT_OP_2= RULE_RIGHT_OP ) this_additive_expression_3= ruleadditive_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShift_expressionAccess().getAdditive_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_additive_expression_0=ruleadditive_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_additive_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:985:3: ( (this_LEFT_OP_1= RULE_LEFT_OP | this_RIGHT_OP_2= RULE_RIGHT_OP ) this_additive_expression_3= ruleadditive_expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_LEFT_OP && LA13_0<=RULE_RIGHT_OP)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAnsic.g:986:4: (this_LEFT_OP_1= RULE_LEFT_OP | this_RIGHT_OP_2= RULE_RIGHT_OP ) this_additive_expression_3= ruleadditive_expression
            	    {
            	    // InternalAnsic.g:986:4: (this_LEFT_OP_1= RULE_LEFT_OP | this_RIGHT_OP_2= RULE_RIGHT_OP )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==RULE_LEFT_OP) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==RULE_RIGHT_OP) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAnsic.g:987:5: this_LEFT_OP_1= RULE_LEFT_OP
            	            {
            	            this_LEFT_OP_1=(Token)match(input,RULE_LEFT_OP,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_LEFT_OP_1);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_LEFT_OP_1, grammarAccess.getShift_expressionAccess().getLEFT_OPTerminalRuleCall_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAnsic.g:995:5: this_RIGHT_OP_2= RULE_RIGHT_OP
            	            {
            	            this_RIGHT_OP_2=(Token)match(input,RULE_RIGHT_OP,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_RIGHT_OP_2);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_RIGHT_OP_2, grammarAccess.getShift_expressionAccess().getRIGHT_OPTerminalRuleCall_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getShift_expressionAccess().getAdditive_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_13);
            	    this_additive_expression_3=ruleadditive_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_additive_expression_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleshift_expression"


    // $ANTLR start "entryRulerelational_expression"
    // InternalAnsic.g:1018:1: entryRulerelational_expression returns [String current=null] : iv_rulerelational_expression= rulerelational_expression EOF ;
    public final String entryRulerelational_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelational_expression = null;


        try {
            // InternalAnsic.g:1018:61: (iv_rulerelational_expression= rulerelational_expression EOF )
            // InternalAnsic.g:1019:2: iv_rulerelational_expression= rulerelational_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelational_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerelational_expression=rulerelational_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerelational_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerelational_expression"


    // $ANTLR start "rulerelational_expression"
    // InternalAnsic.g:1025:1: rulerelational_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_shift_expression_0= ruleshift_expression ( (kw= '<' | kw= '>' | this_LE_OP_3= RULE_LE_OP | this_GE_OP_4= RULE_GE_OP ) this_shift_expression_5= ruleshift_expression )* ) ;
    public final AntlrDatatypeRuleToken rulerelational_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LE_OP_3=null;
        Token this_GE_OP_4=null;
        AntlrDatatypeRuleToken this_shift_expression_0 = null;

        AntlrDatatypeRuleToken this_shift_expression_5 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1031:2: ( (this_shift_expression_0= ruleshift_expression ( (kw= '<' | kw= '>' | this_LE_OP_3= RULE_LE_OP | this_GE_OP_4= RULE_GE_OP ) this_shift_expression_5= ruleshift_expression )* ) )
            // InternalAnsic.g:1032:2: (this_shift_expression_0= ruleshift_expression ( (kw= '<' | kw= '>' | this_LE_OP_3= RULE_LE_OP | this_GE_OP_4= RULE_GE_OP ) this_shift_expression_5= ruleshift_expression )* )
            {
            // InternalAnsic.g:1032:2: (this_shift_expression_0= ruleshift_expression ( (kw= '<' | kw= '>' | this_LE_OP_3= RULE_LE_OP | this_GE_OP_4= RULE_GE_OP ) this_shift_expression_5= ruleshift_expression )* )
            // InternalAnsic.g:1033:3: this_shift_expression_0= ruleshift_expression ( (kw= '<' | kw= '>' | this_LE_OP_3= RULE_LE_OP | this_GE_OP_4= RULE_GE_OP ) this_shift_expression_5= ruleshift_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelational_expressionAccess().getShift_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_shift_expression_0=ruleshift_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_shift_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1043:3: ( (kw= '<' | kw= '>' | this_LE_OP_3= RULE_LE_OP | this_GE_OP_4= RULE_GE_OP ) this_shift_expression_5= ruleshift_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_LE_OP && LA15_0<=RULE_GE_OP)||(LA15_0>=82 && LA15_0<=83)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAnsic.g:1044:4: (kw= '<' | kw= '>' | this_LE_OP_3= RULE_LE_OP | this_GE_OP_4= RULE_GE_OP ) this_shift_expression_5= ruleshift_expression
            	    {
            	    // InternalAnsic.g:1044:4: (kw= '<' | kw= '>' | this_LE_OP_3= RULE_LE_OP | this_GE_OP_4= RULE_GE_OP )
            	    int alt14=4;
            	    switch ( input.LA(1) ) {
            	    case 82:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 83:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case RULE_LE_OP:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case RULE_GE_OP:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // InternalAnsic.g:1045:5: kw= '<'
            	            {
            	            kw=(Token)match(input,82,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getRelational_expressionAccess().getLessThanSignKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAnsic.g:1051:5: kw= '>'
            	            {
            	            kw=(Token)match(input,83,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getRelational_expressionAccess().getGreaterThanSignKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalAnsic.g:1057:5: this_LE_OP_3= RULE_LE_OP
            	            {
            	            this_LE_OP_3=(Token)match(input,RULE_LE_OP,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_LE_OP_3);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_LE_OP_3, grammarAccess.getRelational_expressionAccess().getLE_OPTerminalRuleCall_1_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalAnsic.g:1065:5: this_GE_OP_4= RULE_GE_OP
            	            {
            	            this_GE_OP_4=(Token)match(input,RULE_GE_OP,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_GE_OP_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_GE_OP_4, grammarAccess.getRelational_expressionAccess().getGE_OPTerminalRuleCall_1_0_3());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getRelational_expressionAccess().getShift_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_14);
            	    this_shift_expression_5=ruleshift_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_shift_expression_5);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerelational_expression"


    // $ANTLR start "entryRuleequality_expression"
    // InternalAnsic.g:1088:1: entryRuleequality_expression returns [String current=null] : iv_ruleequality_expression= ruleequality_expression EOF ;
    public final String entryRuleequality_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleequality_expression = null;


        try {
            // InternalAnsic.g:1088:59: (iv_ruleequality_expression= ruleequality_expression EOF )
            // InternalAnsic.g:1089:2: iv_ruleequality_expression= ruleequality_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquality_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleequality_expression=ruleequality_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleequality_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleequality_expression"


    // $ANTLR start "ruleequality_expression"
    // InternalAnsic.g:1095:1: ruleequality_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_relational_expression_0= rulerelational_expression ( (this_EQ_OP_1= RULE_EQ_OP | this_NE_OP_2= RULE_NE_OP ) this_relational_expression_3= rulerelational_expression )* ) ;
    public final AntlrDatatypeRuleToken ruleequality_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQ_OP_1=null;
        Token this_NE_OP_2=null;
        AntlrDatatypeRuleToken this_relational_expression_0 = null;

        AntlrDatatypeRuleToken this_relational_expression_3 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1101:2: ( (this_relational_expression_0= rulerelational_expression ( (this_EQ_OP_1= RULE_EQ_OP | this_NE_OP_2= RULE_NE_OP ) this_relational_expression_3= rulerelational_expression )* ) )
            // InternalAnsic.g:1102:2: (this_relational_expression_0= rulerelational_expression ( (this_EQ_OP_1= RULE_EQ_OP | this_NE_OP_2= RULE_NE_OP ) this_relational_expression_3= rulerelational_expression )* )
            {
            // InternalAnsic.g:1102:2: (this_relational_expression_0= rulerelational_expression ( (this_EQ_OP_1= RULE_EQ_OP | this_NE_OP_2= RULE_NE_OP ) this_relational_expression_3= rulerelational_expression )* )
            // InternalAnsic.g:1103:3: this_relational_expression_0= rulerelational_expression ( (this_EQ_OP_1= RULE_EQ_OP | this_NE_OP_2= RULE_NE_OP ) this_relational_expression_3= rulerelational_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEquality_expressionAccess().getRelational_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_relational_expression_0=rulerelational_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_relational_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1113:3: ( (this_EQ_OP_1= RULE_EQ_OP | this_NE_OP_2= RULE_NE_OP ) this_relational_expression_3= rulerelational_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_EQ_OP && LA17_0<=RULE_NE_OP)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAnsic.g:1114:4: (this_EQ_OP_1= RULE_EQ_OP | this_NE_OP_2= RULE_NE_OP ) this_relational_expression_3= rulerelational_expression
            	    {
            	    // InternalAnsic.g:1114:4: (this_EQ_OP_1= RULE_EQ_OP | this_NE_OP_2= RULE_NE_OP )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_EQ_OP) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==RULE_NE_OP) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalAnsic.g:1115:5: this_EQ_OP_1= RULE_EQ_OP
            	            {
            	            this_EQ_OP_1=(Token)match(input,RULE_EQ_OP,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_EQ_OP_1);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_EQ_OP_1, grammarAccess.getEquality_expressionAccess().getEQ_OPTerminalRuleCall_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAnsic.g:1123:5: this_NE_OP_2= RULE_NE_OP
            	            {
            	            this_NE_OP_2=(Token)match(input,RULE_NE_OP,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_NE_OP_2);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_NE_OP_2, grammarAccess.getEquality_expressionAccess().getNE_OPTerminalRuleCall_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getEquality_expressionAccess().getRelational_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_15);
            	    this_relational_expression_3=rulerelational_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_relational_expression_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleequality_expression"


    // $ANTLR start "entryRuleand_expression"
    // InternalAnsic.g:1146:1: entryRuleand_expression returns [String current=null] : iv_ruleand_expression= ruleand_expression EOF ;
    public final String entryRuleand_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleand_expression = null;


        try {
            // InternalAnsic.g:1146:54: (iv_ruleand_expression= ruleand_expression EOF )
            // InternalAnsic.g:1147:2: iv_ruleand_expression= ruleand_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnd_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleand_expression=ruleand_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleand_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleand_expression"


    // $ANTLR start "ruleand_expression"
    // InternalAnsic.g:1153:1: ruleand_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_equality_expression_0= ruleequality_expression (kw= '&' this_equality_expression_2= ruleequality_expression )* ) ;
    public final AntlrDatatypeRuleToken ruleand_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_equality_expression_0 = null;

        AntlrDatatypeRuleToken this_equality_expression_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1159:2: ( (this_equality_expression_0= ruleequality_expression (kw= '&' this_equality_expression_2= ruleequality_expression )* ) )
            // InternalAnsic.g:1160:2: (this_equality_expression_0= ruleequality_expression (kw= '&' this_equality_expression_2= ruleequality_expression )* )
            {
            // InternalAnsic.g:1160:2: (this_equality_expression_0= ruleequality_expression (kw= '&' this_equality_expression_2= ruleequality_expression )* )
            // InternalAnsic.g:1161:3: this_equality_expression_0= ruleequality_expression (kw= '&' this_equality_expression_2= ruleequality_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAnd_expressionAccess().getEquality_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_equality_expression_0=ruleequality_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_equality_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1171:3: (kw= '&' this_equality_expression_2= ruleequality_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==74) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAnsic.g:1172:4: kw= '&' this_equality_expression_2= ruleequality_expression
            	    {
            	    kw=(Token)match(input,74,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getAnd_expressionAccess().getAmpersandKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getAnd_expressionAccess().getEquality_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    this_equality_expression_2=ruleequality_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_equality_expression_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleand_expression"


    // $ANTLR start "entryRuleexclusive_or_expression"
    // InternalAnsic.g:1192:1: entryRuleexclusive_or_expression returns [String current=null] : iv_ruleexclusive_or_expression= ruleexclusive_or_expression EOF ;
    public final String entryRuleexclusive_or_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexclusive_or_expression = null;


        try {
            // InternalAnsic.g:1192:63: (iv_ruleexclusive_or_expression= ruleexclusive_or_expression EOF )
            // InternalAnsic.g:1193:2: iv_ruleexclusive_or_expression= ruleexclusive_or_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclusive_or_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexclusive_or_expression=ruleexclusive_or_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexclusive_or_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexclusive_or_expression"


    // $ANTLR start "ruleexclusive_or_expression"
    // InternalAnsic.g:1199:1: ruleexclusive_or_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_and_expression_0= ruleand_expression (kw= '^' this_and_expression_2= ruleand_expression )* ) ;
    public final AntlrDatatypeRuleToken ruleexclusive_or_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_and_expression_0 = null;

        AntlrDatatypeRuleToken this_and_expression_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1205:2: ( (this_and_expression_0= ruleand_expression (kw= '^' this_and_expression_2= ruleand_expression )* ) )
            // InternalAnsic.g:1206:2: (this_and_expression_0= ruleand_expression (kw= '^' this_and_expression_2= ruleand_expression )* )
            {
            // InternalAnsic.g:1206:2: (this_and_expression_0= ruleand_expression (kw= '^' this_and_expression_2= ruleand_expression )* )
            // InternalAnsic.g:1207:3: this_and_expression_0= ruleand_expression (kw= '^' this_and_expression_2= ruleand_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExclusive_or_expressionAccess().getAnd_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_and_expression_0=ruleand_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_and_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1217:3: (kw= '^' this_and_expression_2= ruleand_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==84) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAnsic.g:1218:4: kw= '^' this_and_expression_2= ruleand_expression
            	    {
            	    kw=(Token)match(input,84,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExclusive_or_expressionAccess().getCircumflexAccentKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExclusive_or_expressionAccess().getAnd_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
            	    this_and_expression_2=ruleand_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_and_expression_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexclusive_or_expression"


    // $ANTLR start "entryRuleinclusive_or_expression"
    // InternalAnsic.g:1238:1: entryRuleinclusive_or_expression returns [String current=null] : iv_ruleinclusive_or_expression= ruleinclusive_or_expression EOF ;
    public final String entryRuleinclusive_or_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinclusive_or_expression = null;


        try {
            // InternalAnsic.g:1238:63: (iv_ruleinclusive_or_expression= ruleinclusive_or_expression EOF )
            // InternalAnsic.g:1239:2: iv_ruleinclusive_or_expression= ruleinclusive_or_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInclusive_or_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinclusive_or_expression=ruleinclusive_or_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinclusive_or_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinclusive_or_expression"


    // $ANTLR start "ruleinclusive_or_expression"
    // InternalAnsic.g:1245:1: ruleinclusive_or_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_exclusive_or_expression_0= ruleexclusive_or_expression (kw= '|' this_exclusive_or_expression_2= ruleexclusive_or_expression )* ) ;
    public final AntlrDatatypeRuleToken ruleinclusive_or_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_exclusive_or_expression_0 = null;

        AntlrDatatypeRuleToken this_exclusive_or_expression_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1251:2: ( (this_exclusive_or_expression_0= ruleexclusive_or_expression (kw= '|' this_exclusive_or_expression_2= ruleexclusive_or_expression )* ) )
            // InternalAnsic.g:1252:2: (this_exclusive_or_expression_0= ruleexclusive_or_expression (kw= '|' this_exclusive_or_expression_2= ruleexclusive_or_expression )* )
            {
            // InternalAnsic.g:1252:2: (this_exclusive_or_expression_0= ruleexclusive_or_expression (kw= '|' this_exclusive_or_expression_2= ruleexclusive_or_expression )* )
            // InternalAnsic.g:1253:3: this_exclusive_or_expression_0= ruleexclusive_or_expression (kw= '|' this_exclusive_or_expression_2= ruleexclusive_or_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getInclusive_or_expressionAccess().getExclusive_or_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_exclusive_or_expression_0=ruleexclusive_or_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_exclusive_or_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1263:3: (kw= '|' this_exclusive_or_expression_2= ruleexclusive_or_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==85) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAnsic.g:1264:4: kw= '|' this_exclusive_or_expression_2= ruleexclusive_or_expression
            	    {
            	    kw=(Token)match(input,85,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getInclusive_or_expressionAccess().getVerticalLineKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInclusive_or_expressionAccess().getExclusive_or_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_18);
            	    this_exclusive_or_expression_2=ruleexclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_exclusive_or_expression_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinclusive_or_expression"


    // $ANTLR start "entryRulelogical_and_expression"
    // InternalAnsic.g:1284:1: entryRulelogical_and_expression returns [String current=null] : iv_rulelogical_and_expression= rulelogical_and_expression EOF ;
    public final String entryRulelogical_and_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelogical_and_expression = null;


        try {
            // InternalAnsic.g:1284:62: (iv_rulelogical_and_expression= rulelogical_and_expression EOF )
            // InternalAnsic.g:1285:2: iv_rulelogical_and_expression= rulelogical_and_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_and_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelogical_and_expression=rulelogical_and_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_and_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelogical_and_expression"


    // $ANTLR start "rulelogical_and_expression"
    // InternalAnsic.g:1291:1: rulelogical_and_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_inclusive_or_expression_0= ruleinclusive_or_expression (this_AND_OP_1= RULE_AND_OP this_inclusive_or_expression_2= ruleinclusive_or_expression )* ) ;
    public final AntlrDatatypeRuleToken rulelogical_and_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AND_OP_1=null;
        AntlrDatatypeRuleToken this_inclusive_or_expression_0 = null;

        AntlrDatatypeRuleToken this_inclusive_or_expression_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1297:2: ( (this_inclusive_or_expression_0= ruleinclusive_or_expression (this_AND_OP_1= RULE_AND_OP this_inclusive_or_expression_2= ruleinclusive_or_expression )* ) )
            // InternalAnsic.g:1298:2: (this_inclusive_or_expression_0= ruleinclusive_or_expression (this_AND_OP_1= RULE_AND_OP this_inclusive_or_expression_2= ruleinclusive_or_expression )* )
            {
            // InternalAnsic.g:1298:2: (this_inclusive_or_expression_0= ruleinclusive_or_expression (this_AND_OP_1= RULE_AND_OP this_inclusive_or_expression_2= ruleinclusive_or_expression )* )
            // InternalAnsic.g:1299:3: this_inclusive_or_expression_0= ruleinclusive_or_expression (this_AND_OP_1= RULE_AND_OP this_inclusive_or_expression_2= ruleinclusive_or_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_and_expressionAccess().getInclusive_or_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_inclusive_or_expression_0=ruleinclusive_or_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_inclusive_or_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1309:3: (this_AND_OP_1= RULE_AND_OP this_inclusive_or_expression_2= ruleinclusive_or_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_AND_OP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAnsic.g:1310:4: this_AND_OP_1= RULE_AND_OP this_inclusive_or_expression_2= ruleinclusive_or_expression
            	    {
            	    this_AND_OP_1=(Token)match(input,RULE_AND_OP,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_AND_OP_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_AND_OP_1, grammarAccess.getLogical_and_expressionAccess().getAND_OPTerminalRuleCall_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_and_expressionAccess().getInclusive_or_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_19);
            	    this_inclusive_or_expression_2=ruleinclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_inclusive_or_expression_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogical_and_expression"


    // $ANTLR start "entryRulelogical_or_expression"
    // InternalAnsic.g:1332:1: entryRulelogical_or_expression returns [String current=null] : iv_rulelogical_or_expression= rulelogical_or_expression EOF ;
    public final String entryRulelogical_or_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelogical_or_expression = null;


        try {
            // InternalAnsic.g:1332:61: (iv_rulelogical_or_expression= rulelogical_or_expression EOF )
            // InternalAnsic.g:1333:2: iv_rulelogical_or_expression= rulelogical_or_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_or_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelogical_or_expression=rulelogical_or_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelogical_or_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelogical_or_expression"


    // $ANTLR start "rulelogical_or_expression"
    // InternalAnsic.g:1339:1: rulelogical_or_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_logical_and_expression_0= rulelogical_and_expression (this_OR_OP_1= RULE_OR_OP this_logical_and_expression_2= rulelogical_and_expression )* ) ;
    public final AntlrDatatypeRuleToken rulelogical_or_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OR_OP_1=null;
        AntlrDatatypeRuleToken this_logical_and_expression_0 = null;

        AntlrDatatypeRuleToken this_logical_and_expression_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1345:2: ( (this_logical_and_expression_0= rulelogical_and_expression (this_OR_OP_1= RULE_OR_OP this_logical_and_expression_2= rulelogical_and_expression )* ) )
            // InternalAnsic.g:1346:2: (this_logical_and_expression_0= rulelogical_and_expression (this_OR_OP_1= RULE_OR_OP this_logical_and_expression_2= rulelogical_and_expression )* )
            {
            // InternalAnsic.g:1346:2: (this_logical_and_expression_0= rulelogical_and_expression (this_OR_OP_1= RULE_OR_OP this_logical_and_expression_2= rulelogical_and_expression )* )
            // InternalAnsic.g:1347:3: this_logical_and_expression_0= rulelogical_and_expression (this_OR_OP_1= RULE_OR_OP this_logical_and_expression_2= rulelogical_and_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_or_expressionAccess().getLogical_and_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_logical_and_expression_0=rulelogical_and_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_logical_and_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1357:3: (this_OR_OP_1= RULE_OR_OP this_logical_and_expression_2= rulelogical_and_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_OR_OP) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAnsic.g:1358:4: this_OR_OP_1= RULE_OR_OP this_logical_and_expression_2= rulelogical_and_expression
            	    {
            	    this_OR_OP_1=(Token)match(input,RULE_OR_OP,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_OR_OP_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_OR_OP_1, grammarAccess.getLogical_or_expressionAccess().getOR_OPTerminalRuleCall_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_or_expressionAccess().getLogical_and_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_20);
            	    this_logical_and_expression_2=rulelogical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_logical_and_expression_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogical_or_expression"


    // $ANTLR start "entryRuleconditional_expression"
    // InternalAnsic.g:1380:1: entryRuleconditional_expression returns [String current=null] : iv_ruleconditional_expression= ruleconditional_expression EOF ;
    public final String entryRuleconditional_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconditional_expression = null;


        try {
            // InternalAnsic.g:1380:62: (iv_ruleconditional_expression= ruleconditional_expression EOF )
            // InternalAnsic.g:1381:2: iv_ruleconditional_expression= ruleconditional_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditional_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconditional_expression=ruleconditional_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconditional_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconditional_expression"


    // $ANTLR start "ruleconditional_expression"
    // InternalAnsic.g:1387:1: ruleconditional_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_logical_or_expression_0= rulelogical_or_expression (kw= '?' this_expression_2= ruleexpression kw= ':' this_conditional_expression_4= ruleconditional_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleconditional_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_logical_or_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_conditional_expression_4 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1393:2: ( (this_logical_or_expression_0= rulelogical_or_expression (kw= '?' this_expression_2= ruleexpression kw= ':' this_conditional_expression_4= ruleconditional_expression )? ) )
            // InternalAnsic.g:1394:2: (this_logical_or_expression_0= rulelogical_or_expression (kw= '?' this_expression_2= ruleexpression kw= ':' this_conditional_expression_4= ruleconditional_expression )? )
            {
            // InternalAnsic.g:1394:2: (this_logical_or_expression_0= rulelogical_or_expression (kw= '?' this_expression_2= ruleexpression kw= ':' this_conditional_expression_4= ruleconditional_expression )? )
            // InternalAnsic.g:1395:3: this_logical_or_expression_0= rulelogical_or_expression (kw= '?' this_expression_2= ruleexpression kw= ':' this_conditional_expression_4= ruleconditional_expression )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConditional_expressionAccess().getLogical_or_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_logical_or_expression_0=rulelogical_or_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_logical_or_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1405:3: (kw= '?' this_expression_2= ruleexpression kw= ':' this_conditional_expression_4= ruleconditional_expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==86) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAnsic.g:1406:4: kw= '?' this_expression_2= ruleexpression kw= ':' this_conditional_expression_4= ruleconditional_expression
                    {
                    kw=(Token)match(input,86,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConditional_expressionAccess().getQuestionMarkKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConditional_expressionAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_expression_2=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,87,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConditional_expressionAccess().getColonKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConditional_expressionAccess().getConditional_expressionParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_conditional_expression_4=ruleconditional_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_conditional_expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconditional_expression"


    // $ANTLR start "entryRuleassignment_expression"
    // InternalAnsic.g:1441:1: entryRuleassignment_expression returns [String current=null] : iv_ruleassignment_expression= ruleassignment_expression EOF ;
    public final String entryRuleassignment_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment_expression = null;


        try {
            // InternalAnsic.g:1441:61: (iv_ruleassignment_expression= ruleassignment_expression EOF )
            // InternalAnsic.g:1442:2: iv_ruleassignment_expression= ruleassignment_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignment_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleassignment_expression=ruleassignment_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_expression"


    // $ANTLR start "ruleassignment_expression"
    // InternalAnsic.g:1448:1: ruleassignment_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_conditional_expression_0= ruleconditional_expression | (this_unary_expression_1= ruleunary_expression this_assignment_operator_2= ruleassignment_operator this_assignment_expression_3= ruleassignment_expression ) ) ;
    public final AntlrDatatypeRuleToken ruleassignment_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_conditional_expression_0 = null;

        AntlrDatatypeRuleToken this_unary_expression_1 = null;

        AntlrDatatypeRuleToken this_assignment_operator_2 = null;

        AntlrDatatypeRuleToken this_assignment_expression_3 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1454:2: ( (this_conditional_expression_0= ruleconditional_expression | (this_unary_expression_1= ruleunary_expression this_assignment_operator_2= ruleassignment_operator this_assignment_expression_3= ruleassignment_expression ) ) )
            // InternalAnsic.g:1455:2: (this_conditional_expression_0= ruleconditional_expression | (this_unary_expression_1= ruleunary_expression this_assignment_operator_2= ruleassignment_operator this_assignment_expression_3= ruleassignment_expression ) )
            {
            // InternalAnsic.g:1455:2: (this_conditional_expression_0= ruleconditional_expression | (this_unary_expression_1= ruleunary_expression this_assignment_operator_2= ruleassignment_operator this_assignment_expression_3= ruleassignment_expression ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalAnsic.g:1456:3: this_conditional_expression_0= ruleconditional_expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssignment_expressionAccess().getConditional_expressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_conditional_expression_0=ruleconditional_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_conditional_expression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:1467:3: (this_unary_expression_1= ruleunary_expression this_assignment_operator_2= ruleassignment_operator this_assignment_expression_3= ruleassignment_expression )
                    {
                    // InternalAnsic.g:1467:3: (this_unary_expression_1= ruleunary_expression this_assignment_operator_2= ruleassignment_operator this_assignment_expression_3= ruleassignment_expression )
                    // InternalAnsic.g:1468:4: this_unary_expression_1= ruleunary_expression this_assignment_operator_2= ruleassignment_operator this_assignment_expression_3= ruleassignment_expression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAssignment_expressionAccess().getUnary_expressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_unary_expression_1=ruleunary_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_unary_expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAssignment_expressionAccess().getAssignment_operatorParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_3);
                    this_assignment_operator_2=ruleassignment_operator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_assignment_operator_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAssignment_expressionAccess().getAssignment_expressionParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_assignment_expression_3=ruleassignment_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_assignment_expression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_expression"


    // $ANTLR start "entryRuleexpression"
    // InternalAnsic.g:1503:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // InternalAnsic.g:1503:50: (iv_ruleexpression= ruleexpression EOF )
            // InternalAnsic.g:1504:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalAnsic.g:1510:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_assignment_expression_0= ruleassignment_expression (kw= ',' this_assignment_expression_2= ruleassignment_expression )* ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_assignment_expression_0 = null;

        AntlrDatatypeRuleToken this_assignment_expression_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1516:2: ( (this_assignment_expression_0= ruleassignment_expression (kw= ',' this_assignment_expression_2= ruleassignment_expression )* ) )
            // InternalAnsic.g:1517:2: (this_assignment_expression_0= ruleassignment_expression (kw= ',' this_assignment_expression_2= ruleassignment_expression )* )
            {
            // InternalAnsic.g:1517:2: (this_assignment_expression_0= ruleassignment_expression (kw= ',' this_assignment_expression_2= ruleassignment_expression )* )
            // InternalAnsic.g:1518:3: this_assignment_expression_0= ruleassignment_expression (kw= ',' this_assignment_expression_2= ruleassignment_expression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getAssignment_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_assignment_expression_0=ruleassignment_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_assignment_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1528:3: (kw= ',' this_assignment_expression_2= ruleassignment_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==73) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAnsic.g:1529:4: kw= ',' this_assignment_expression_2= ruleassignment_expression
            	    {
            	    kw=(Token)match(input,73,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExpressionAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExpressionAccess().getAssignment_expressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_assignment_expression_2=ruleassignment_expression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_assignment_expression_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleassignment_operator"
    // InternalAnsic.g:1549:1: entryRuleassignment_operator returns [String current=null] : iv_ruleassignment_operator= ruleassignment_operator EOF ;
    public final String entryRuleassignment_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment_operator = null;


        try {
            // InternalAnsic.g:1549:59: (iv_ruleassignment_operator= ruleassignment_operator EOF )
            // InternalAnsic.g:1550:2: iv_ruleassignment_operator= ruleassignment_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignment_operatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleassignment_operator=ruleassignment_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment_operator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_operator"


    // $ANTLR start "ruleassignment_operator"
    // InternalAnsic.g:1556:1: ruleassignment_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | this_MUL_ASSIGN_1= RULE_MUL_ASSIGN | this_DIV_ASSIGN_2= RULE_DIV_ASSIGN | this_MOD_ASSIGN_3= RULE_MOD_ASSIGN | this_ADD_ASSIGN_4= RULE_ADD_ASSIGN | this_SUB_ASSIGN_5= RULE_SUB_ASSIGN | this_LEFT_ASSIGN_6= RULE_LEFT_ASSIGN | this_RIGHT_ASSIGN_7= RULE_RIGHT_ASSIGN | this_AND_ASSIGN_8= RULE_AND_ASSIGN | this_XOR_ASSIGN_9= RULE_XOR_ASSIGN | this_OR_ASSIGN_10= RULE_OR_ASSIGN ) ;
    public final AntlrDatatypeRuleToken ruleassignment_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_MUL_ASSIGN_1=null;
        Token this_DIV_ASSIGN_2=null;
        Token this_MOD_ASSIGN_3=null;
        Token this_ADD_ASSIGN_4=null;
        Token this_SUB_ASSIGN_5=null;
        Token this_LEFT_ASSIGN_6=null;
        Token this_RIGHT_ASSIGN_7=null;
        Token this_AND_ASSIGN_8=null;
        Token this_XOR_ASSIGN_9=null;
        Token this_OR_ASSIGN_10=null;


        	enterRule();

        try {
            // InternalAnsic.g:1562:2: ( (kw= '=' | this_MUL_ASSIGN_1= RULE_MUL_ASSIGN | this_DIV_ASSIGN_2= RULE_DIV_ASSIGN | this_MOD_ASSIGN_3= RULE_MOD_ASSIGN | this_ADD_ASSIGN_4= RULE_ADD_ASSIGN | this_SUB_ASSIGN_5= RULE_SUB_ASSIGN | this_LEFT_ASSIGN_6= RULE_LEFT_ASSIGN | this_RIGHT_ASSIGN_7= RULE_RIGHT_ASSIGN | this_AND_ASSIGN_8= RULE_AND_ASSIGN | this_XOR_ASSIGN_9= RULE_XOR_ASSIGN | this_OR_ASSIGN_10= RULE_OR_ASSIGN ) )
            // InternalAnsic.g:1563:2: (kw= '=' | this_MUL_ASSIGN_1= RULE_MUL_ASSIGN | this_DIV_ASSIGN_2= RULE_DIV_ASSIGN | this_MOD_ASSIGN_3= RULE_MOD_ASSIGN | this_ADD_ASSIGN_4= RULE_ADD_ASSIGN | this_SUB_ASSIGN_5= RULE_SUB_ASSIGN | this_LEFT_ASSIGN_6= RULE_LEFT_ASSIGN | this_RIGHT_ASSIGN_7= RULE_RIGHT_ASSIGN | this_AND_ASSIGN_8= RULE_AND_ASSIGN | this_XOR_ASSIGN_9= RULE_XOR_ASSIGN | this_OR_ASSIGN_10= RULE_OR_ASSIGN )
            {
            // InternalAnsic.g:1563:2: (kw= '=' | this_MUL_ASSIGN_1= RULE_MUL_ASSIGN | this_DIV_ASSIGN_2= RULE_DIV_ASSIGN | this_MOD_ASSIGN_3= RULE_MOD_ASSIGN | this_ADD_ASSIGN_4= RULE_ADD_ASSIGN | this_SUB_ASSIGN_5= RULE_SUB_ASSIGN | this_LEFT_ASSIGN_6= RULE_LEFT_ASSIGN | this_RIGHT_ASSIGN_7= RULE_RIGHT_ASSIGN | this_AND_ASSIGN_8= RULE_AND_ASSIGN | this_XOR_ASSIGN_9= RULE_XOR_ASSIGN | this_OR_ASSIGN_10= RULE_OR_ASSIGN )
            int alt26=11;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt26=1;
                }
                break;
            case RULE_MUL_ASSIGN:
                {
                alt26=2;
                }
                break;
            case RULE_DIV_ASSIGN:
                {
                alt26=3;
                }
                break;
            case RULE_MOD_ASSIGN:
                {
                alt26=4;
                }
                break;
            case RULE_ADD_ASSIGN:
                {
                alt26=5;
                }
                break;
            case RULE_SUB_ASSIGN:
                {
                alt26=6;
                }
                break;
            case RULE_LEFT_ASSIGN:
                {
                alt26=7;
                }
                break;
            case RULE_RIGHT_ASSIGN:
                {
                alt26=8;
                }
                break;
            case RULE_AND_ASSIGN:
                {
                alt26=9;
                }
                break;
            case RULE_XOR_ASSIGN:
                {
                alt26=10;
                }
                break;
            case RULE_OR_ASSIGN:
                {
                alt26=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAnsic.g:1564:3: kw= '='
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignment_operatorAccess().getEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:1570:3: this_MUL_ASSIGN_1= RULE_MUL_ASSIGN
                    {
                    this_MUL_ASSIGN_1=(Token)match(input,RULE_MUL_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MUL_ASSIGN_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MUL_ASSIGN_1, grammarAccess.getAssignment_operatorAccess().getMUL_ASSIGNTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:1578:3: this_DIV_ASSIGN_2= RULE_DIV_ASSIGN
                    {
                    this_DIV_ASSIGN_2=(Token)match(input,RULE_DIV_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DIV_ASSIGN_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DIV_ASSIGN_2, grammarAccess.getAssignment_operatorAccess().getDIV_ASSIGNTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:1586:3: this_MOD_ASSIGN_3= RULE_MOD_ASSIGN
                    {
                    this_MOD_ASSIGN_3=(Token)match(input,RULE_MOD_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MOD_ASSIGN_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MOD_ASSIGN_3, grammarAccess.getAssignment_operatorAccess().getMOD_ASSIGNTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAnsic.g:1594:3: this_ADD_ASSIGN_4= RULE_ADD_ASSIGN
                    {
                    this_ADD_ASSIGN_4=(Token)match(input,RULE_ADD_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ADD_ASSIGN_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ADD_ASSIGN_4, grammarAccess.getAssignment_operatorAccess().getADD_ASSIGNTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAnsic.g:1602:3: this_SUB_ASSIGN_5= RULE_SUB_ASSIGN
                    {
                    this_SUB_ASSIGN_5=(Token)match(input,RULE_SUB_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SUB_ASSIGN_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SUB_ASSIGN_5, grammarAccess.getAssignment_operatorAccess().getSUB_ASSIGNTerminalRuleCall_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAnsic.g:1610:3: this_LEFT_ASSIGN_6= RULE_LEFT_ASSIGN
                    {
                    this_LEFT_ASSIGN_6=(Token)match(input,RULE_LEFT_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LEFT_ASSIGN_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LEFT_ASSIGN_6, grammarAccess.getAssignment_operatorAccess().getLEFT_ASSIGNTerminalRuleCall_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAnsic.g:1618:3: this_RIGHT_ASSIGN_7= RULE_RIGHT_ASSIGN
                    {
                    this_RIGHT_ASSIGN_7=(Token)match(input,RULE_RIGHT_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RIGHT_ASSIGN_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_RIGHT_ASSIGN_7, grammarAccess.getAssignment_operatorAccess().getRIGHT_ASSIGNTerminalRuleCall_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAnsic.g:1626:3: this_AND_ASSIGN_8= RULE_AND_ASSIGN
                    {
                    this_AND_ASSIGN_8=(Token)match(input,RULE_AND_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_AND_ASSIGN_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_AND_ASSIGN_8, grammarAccess.getAssignment_operatorAccess().getAND_ASSIGNTerminalRuleCall_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAnsic.g:1634:3: this_XOR_ASSIGN_9= RULE_XOR_ASSIGN
                    {
                    this_XOR_ASSIGN_9=(Token)match(input,RULE_XOR_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_XOR_ASSIGN_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_XOR_ASSIGN_9, grammarAccess.getAssignment_operatorAccess().getXOR_ASSIGNTerminalRuleCall_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalAnsic.g:1642:3: this_OR_ASSIGN_10= RULE_OR_ASSIGN
                    {
                    this_OR_ASSIGN_10=(Token)match(input,RULE_OR_ASSIGN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OR_ASSIGN_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OR_ASSIGN_10, grammarAccess.getAssignment_operatorAccess().getOR_ASSIGNTerminalRuleCall_10());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_operator"


    // $ANTLR start "entryRuleconstant_expression"
    // InternalAnsic.g:1653:1: entryRuleconstant_expression returns [String current=null] : iv_ruleconstant_expression= ruleconstant_expression EOF ;
    public final String entryRuleconstant_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_expression = null;


        try {
            // InternalAnsic.g:1653:59: (iv_ruleconstant_expression= ruleconstant_expression EOF )
            // InternalAnsic.g:1654:2: iv_ruleconstant_expression= ruleconstant_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconstant_expression=ruleconstant_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_expression"


    // $ANTLR start "ruleconstant_expression"
    // InternalAnsic.g:1660:1: ruleconstant_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_conditional_expression_0= ruleconditional_expression ;
    public final AntlrDatatypeRuleToken ruleconstant_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_conditional_expression_0 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1666:2: (this_conditional_expression_0= ruleconditional_expression )
            // InternalAnsic.g:1667:2: this_conditional_expression_0= ruleconditional_expression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getConstant_expressionAccess().getConditional_expressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_conditional_expression_0=ruleconditional_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_conditional_expression_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_expression"


    // $ANTLR start "entryRuledeclaration"
    // InternalAnsic.g:1680:1: entryRuledeclaration returns [String current=null] : iv_ruledeclaration= ruledeclaration EOF ;
    public final String entryRuledeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration = null;


        try {
            // InternalAnsic.g:1680:51: (iv_ruledeclaration= ruledeclaration EOF )
            // InternalAnsic.g:1681:2: iv_ruledeclaration= ruledeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledeclaration=ruledeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeclaration"


    // $ANTLR start "ruledeclaration"
    // InternalAnsic.g:1687:1: ruledeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_specifiers_0= ruledeclaration_specifiers (this_init_declarator_list_1= ruleinit_declarator_list )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruledeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_declaration_specifiers_0 = null;

        AntlrDatatypeRuleToken this_init_declarator_list_1 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1693:2: ( (this_declaration_specifiers_0= ruledeclaration_specifiers (this_init_declarator_list_1= ruleinit_declarator_list )? kw= ';' ) )
            // InternalAnsic.g:1694:2: (this_declaration_specifiers_0= ruledeclaration_specifiers (this_init_declarator_list_1= ruleinit_declarator_list )? kw= ';' )
            {
            // InternalAnsic.g:1694:2: (this_declaration_specifiers_0= ruledeclaration_specifiers (this_init_declarator_list_1= ruleinit_declarator_list )? kw= ';' )
            // InternalAnsic.g:1695:3: this_declaration_specifiers_0= ruledeclaration_specifiers (this_init_declarator_list_1= ruleinit_declarator_list )? kw= ';'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDeclarationAccess().getDeclaration_specifiersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_declaration_specifiers_0=ruledeclaration_specifiers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_declaration_specifiers_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1705:3: (this_init_declarator_list_1= ruleinit_declarator_list )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||LA27_0==68||LA27_0==75) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnsic.g:1706:4: this_init_declarator_list_1= ruleinit_declarator_list
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclarationAccess().getInit_declarator_listParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_init_declarator_list_1=ruleinit_declarator_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_init_declarator_list_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDeclarationAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclaration"


    // $ANTLR start "entryRuledeclaration_specifiers"
    // InternalAnsic.g:1726:1: entryRuledeclaration_specifiers returns [String current=null] : iv_ruledeclaration_specifiers= ruledeclaration_specifiers EOF ;
    public final String entryRuledeclaration_specifiers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_specifiers = null;


        try {
            // InternalAnsic.g:1726:62: (iv_ruledeclaration_specifiers= ruledeclaration_specifiers EOF )
            // InternalAnsic.g:1727:2: iv_ruledeclaration_specifiers= ruledeclaration_specifiers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaration_specifiersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledeclaration_specifiers=ruledeclaration_specifiers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration_specifiers.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeclaration_specifiers"


    // $ANTLR start "ruledeclaration_specifiers"
    // InternalAnsic.g:1733:1: ruledeclaration_specifiers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_storage_class_specifier_0= rulestorage_class_specifier (this_declaration_specifiers_1= ruledeclaration_specifiers )? ) | (this_type_specifier_2= ruletype_specifier (this_declaration_specifiers_3= ruledeclaration_specifiers )? ) | (this_type_qualifier_4= ruletype_qualifier (this_declaration_specifiers_5= ruledeclaration_specifiers )? ) ) ;
    public final AntlrDatatypeRuleToken ruledeclaration_specifiers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_storage_class_specifier_0 = null;

        AntlrDatatypeRuleToken this_declaration_specifiers_1 = null;

        AntlrDatatypeRuleToken this_type_specifier_2 = null;

        AntlrDatatypeRuleToken this_declaration_specifiers_3 = null;

        AntlrDatatypeRuleToken this_type_qualifier_4 = null;

        AntlrDatatypeRuleToken this_declaration_specifiers_5 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1739:2: ( ( (this_storage_class_specifier_0= rulestorage_class_specifier (this_declaration_specifiers_1= ruledeclaration_specifiers )? ) | (this_type_specifier_2= ruletype_specifier (this_declaration_specifiers_3= ruledeclaration_specifiers )? ) | (this_type_qualifier_4= ruletype_qualifier (this_declaration_specifiers_5= ruledeclaration_specifiers )? ) ) )
            // InternalAnsic.g:1740:2: ( (this_storage_class_specifier_0= rulestorage_class_specifier (this_declaration_specifiers_1= ruledeclaration_specifiers )? ) | (this_type_specifier_2= ruletype_specifier (this_declaration_specifiers_3= ruledeclaration_specifiers )? ) | (this_type_qualifier_4= ruletype_qualifier (this_declaration_specifiers_5= ruledeclaration_specifiers )? ) )
            {
            // InternalAnsic.g:1740:2: ( (this_storage_class_specifier_0= rulestorage_class_specifier (this_declaration_specifiers_1= ruledeclaration_specifiers )? ) | (this_type_specifier_2= ruletype_specifier (this_declaration_specifiers_3= ruledeclaration_specifiers )? ) | (this_type_qualifier_4= ruletype_qualifier (this_declaration_specifiers_5= ruledeclaration_specifiers )? ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_TYPEDEF:
            case RULE_EXTERN:
            case RULE_STATIC:
            case RULE_AUTO:
            case RULE_REGISTER:
                {
                alt31=1;
                }
                break;
            case RULE_VOID:
            case RULE_SHORT:
            case RULE_INT:
            case RULE_LONG:
            case RULE_FLOAT:
            case RULE_DOUBLE:
            case RULE_SIGNED:
            case RULE_UNSIGNED:
            case RULE_STRUCT:
            case RULE_UNION:
            case RULE_ENUM:
            case RULE_ID:
            case 90:
                {
                alt31=2;
                }
                break;
            case RULE_CONST:
            case RULE_VOLATILE:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAnsic.g:1741:3: (this_storage_class_specifier_0= rulestorage_class_specifier (this_declaration_specifiers_1= ruledeclaration_specifiers )? )
                    {
                    // InternalAnsic.g:1741:3: (this_storage_class_specifier_0= rulestorage_class_specifier (this_declaration_specifiers_1= ruledeclaration_specifiers )? )
                    // InternalAnsic.g:1742:4: this_storage_class_specifier_0= rulestorage_class_specifier (this_declaration_specifiers_1= ruledeclaration_specifiers )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclaration_specifiersAccess().getStorage_class_specifierParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_27);
                    this_storage_class_specifier_0=rulestorage_class_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_storage_class_specifier_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAnsic.g:1752:4: (this_declaration_specifiers_1= ruledeclaration_specifiers )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=RULE_TYPEDEF && LA28_0<=RULE_VOLATILE)||LA28_0==90) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_ID) ) {
                        int LA28_2 = input.LA(2);

                        if ( (synpred55_InternalAnsic()) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAnsic.g:1753:5: this_declaration_specifiers_1= ruledeclaration_specifiers
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getDeclaration_specifiersAccess().getDeclaration_specifiersParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_declaration_specifiers_1=ruledeclaration_specifiers();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_declaration_specifiers_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:1766:3: (this_type_specifier_2= ruletype_specifier (this_declaration_specifiers_3= ruledeclaration_specifiers )? )
                    {
                    // InternalAnsic.g:1766:3: (this_type_specifier_2= ruletype_specifier (this_declaration_specifiers_3= ruledeclaration_specifiers )? )
                    // InternalAnsic.g:1767:4: this_type_specifier_2= ruletype_specifier (this_declaration_specifiers_3= ruledeclaration_specifiers )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclaration_specifiersAccess().getType_specifierParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_27);
                    this_type_specifier_2=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_specifier_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAnsic.g:1777:4: (this_declaration_specifiers_3= ruledeclaration_specifiers )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=RULE_TYPEDEF && LA29_0<=RULE_VOLATILE)||LA29_0==90) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==RULE_ID) ) {
                        int LA29_2 = input.LA(2);

                        if ( (synpred57_InternalAnsic()) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalAnsic.g:1778:5: this_declaration_specifiers_3= ruledeclaration_specifiers
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getDeclaration_specifiersAccess().getDeclaration_specifiersParserRuleCall_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_declaration_specifiers_3=ruledeclaration_specifiers();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_declaration_specifiers_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:1791:3: (this_type_qualifier_4= ruletype_qualifier (this_declaration_specifiers_5= ruledeclaration_specifiers )? )
                    {
                    // InternalAnsic.g:1791:3: (this_type_qualifier_4= ruletype_qualifier (this_declaration_specifiers_5= ruledeclaration_specifiers )? )
                    // InternalAnsic.g:1792:4: this_type_qualifier_4= ruletype_qualifier (this_declaration_specifiers_5= ruledeclaration_specifiers )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclaration_specifiersAccess().getType_qualifierParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_27);
                    this_type_qualifier_4=ruletype_qualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_qualifier_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAnsic.g:1802:4: (this_declaration_specifiers_5= ruledeclaration_specifiers )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=RULE_TYPEDEF && LA30_0<=RULE_VOLATILE)||LA30_0==90) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==RULE_ID) ) {
                        int LA30_2 = input.LA(2);

                        if ( (synpred59_InternalAnsic()) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalAnsic.g:1803:5: this_declaration_specifiers_5= ruledeclaration_specifiers
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getDeclaration_specifiersAccess().getDeclaration_specifiersParserRuleCall_2_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_declaration_specifiers_5=ruledeclaration_specifiers();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_declaration_specifiers_5);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclaration_specifiers"


    // $ANTLR start "entryRuleinit_declarator_list"
    // InternalAnsic.g:1819:1: entryRuleinit_declarator_list returns [String current=null] : iv_ruleinit_declarator_list= ruleinit_declarator_list EOF ;
    public final String entryRuleinit_declarator_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinit_declarator_list = null;


        try {
            // InternalAnsic.g:1819:60: (iv_ruleinit_declarator_list= ruleinit_declarator_list EOF )
            // InternalAnsic.g:1820:2: iv_ruleinit_declarator_list= ruleinit_declarator_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInit_declarator_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinit_declarator_list=ruleinit_declarator_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinit_declarator_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinit_declarator_list"


    // $ANTLR start "ruleinit_declarator_list"
    // InternalAnsic.g:1826:1: ruleinit_declarator_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_init_declarator_0= ruleinit_declarator (kw= ',' this_init_declarator_2= ruleinit_declarator )* ) ;
    public final AntlrDatatypeRuleToken ruleinit_declarator_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_init_declarator_0 = null;

        AntlrDatatypeRuleToken this_init_declarator_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1832:2: ( (this_init_declarator_0= ruleinit_declarator (kw= ',' this_init_declarator_2= ruleinit_declarator )* ) )
            // InternalAnsic.g:1833:2: (this_init_declarator_0= ruleinit_declarator (kw= ',' this_init_declarator_2= ruleinit_declarator )* )
            {
            // InternalAnsic.g:1833:2: (this_init_declarator_0= ruleinit_declarator (kw= ',' this_init_declarator_2= ruleinit_declarator )* )
            // InternalAnsic.g:1834:3: this_init_declarator_0= ruleinit_declarator (kw= ',' this_init_declarator_2= ruleinit_declarator )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getInit_declarator_listAccess().getInit_declaratorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_init_declarator_0=ruleinit_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_init_declarator_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1844:3: (kw= ',' this_init_declarator_2= ruleinit_declarator )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==73) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAnsic.g:1845:4: kw= ',' this_init_declarator_2= ruleinit_declarator
            	    {
            	    kw=(Token)match(input,73,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getInit_declarator_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInit_declarator_listAccess().getInit_declaratorParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_init_declarator_2=ruleinit_declarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_init_declarator_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinit_declarator_list"


    // $ANTLR start "entryRuleinit_declarator"
    // InternalAnsic.g:1865:1: entryRuleinit_declarator returns [String current=null] : iv_ruleinit_declarator= ruleinit_declarator EOF ;
    public final String entryRuleinit_declarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinit_declarator = null;


        try {
            // InternalAnsic.g:1865:55: (iv_ruleinit_declarator= ruleinit_declarator EOF )
            // InternalAnsic.g:1866:2: iv_ruleinit_declarator= ruleinit_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInit_declaratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinit_declarator=ruleinit_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinit_declarator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinit_declarator"


    // $ANTLR start "ruleinit_declarator"
    // InternalAnsic.g:1872:1: ruleinit_declarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declarator_0= ruledeclarator (kw= '=' this_initializer_2= ruleinitializer )* ) ;
    public final AntlrDatatypeRuleToken ruleinit_declarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_declarator_0 = null;

        AntlrDatatypeRuleToken this_initializer_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1878:2: ( (this_declarator_0= ruledeclarator (kw= '=' this_initializer_2= ruleinitializer )* ) )
            // InternalAnsic.g:1879:2: (this_declarator_0= ruledeclarator (kw= '=' this_initializer_2= ruleinitializer )* )
            {
            // InternalAnsic.g:1879:2: (this_declarator_0= ruledeclarator (kw= '=' this_initializer_2= ruleinitializer )* )
            // InternalAnsic.g:1880:3: this_declarator_0= ruledeclarator (kw= '=' this_initializer_2= ruleinitializer )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getInit_declaratorAccess().getDeclaratorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_declarator_0=ruledeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_declarator_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:1890:3: (kw= '=' this_initializer_2= ruleinitializer )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==88) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAnsic.g:1891:4: kw= '=' this_initializer_2= ruleinitializer
            	    {
            	    kw=(Token)match(input,88,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getInit_declaratorAccess().getEqualsSignKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInit_declaratorAccess().getInitializerParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_29);
            	    this_initializer_2=ruleinitializer();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_initializer_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinit_declarator"


    // $ANTLR start "entryRulestorage_class_specifier"
    // InternalAnsic.g:1911:1: entryRulestorage_class_specifier returns [String current=null] : iv_rulestorage_class_specifier= rulestorage_class_specifier EOF ;
    public final String entryRulestorage_class_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestorage_class_specifier = null;


        try {
            // InternalAnsic.g:1911:63: (iv_rulestorage_class_specifier= rulestorage_class_specifier EOF )
            // InternalAnsic.g:1912:2: iv_rulestorage_class_specifier= rulestorage_class_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStorage_class_specifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestorage_class_specifier=rulestorage_class_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestorage_class_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestorage_class_specifier"


    // $ANTLR start "rulestorage_class_specifier"
    // InternalAnsic.g:1918:1: rulestorage_class_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPEDEF_0= RULE_TYPEDEF | this_EXTERN_1= RULE_EXTERN | this_STATIC_2= RULE_STATIC | this_AUTO_3= RULE_AUTO | this_REGISTER_4= RULE_REGISTER ) ;
    public final AntlrDatatypeRuleToken rulestorage_class_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPEDEF_0=null;
        Token this_EXTERN_1=null;
        Token this_STATIC_2=null;
        Token this_AUTO_3=null;
        Token this_REGISTER_4=null;


        	enterRule();

        try {
            // InternalAnsic.g:1924:2: ( (this_TYPEDEF_0= RULE_TYPEDEF | this_EXTERN_1= RULE_EXTERN | this_STATIC_2= RULE_STATIC | this_AUTO_3= RULE_AUTO | this_REGISTER_4= RULE_REGISTER ) )
            // InternalAnsic.g:1925:2: (this_TYPEDEF_0= RULE_TYPEDEF | this_EXTERN_1= RULE_EXTERN | this_STATIC_2= RULE_STATIC | this_AUTO_3= RULE_AUTO | this_REGISTER_4= RULE_REGISTER )
            {
            // InternalAnsic.g:1925:2: (this_TYPEDEF_0= RULE_TYPEDEF | this_EXTERN_1= RULE_EXTERN | this_STATIC_2= RULE_STATIC | this_AUTO_3= RULE_AUTO | this_REGISTER_4= RULE_REGISTER )
            int alt34=5;
            switch ( input.LA(1) ) {
            case RULE_TYPEDEF:
                {
                alt34=1;
                }
                break;
            case RULE_EXTERN:
                {
                alt34=2;
                }
                break;
            case RULE_STATIC:
                {
                alt34=3;
                }
                break;
            case RULE_AUTO:
                {
                alt34=4;
                }
                break;
            case RULE_REGISTER:
                {
                alt34=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalAnsic.g:1926:3: this_TYPEDEF_0= RULE_TYPEDEF
                    {
                    this_TYPEDEF_0=(Token)match(input,RULE_TYPEDEF,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TYPEDEF_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TYPEDEF_0, grammarAccess.getStorage_class_specifierAccess().getTYPEDEFTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:1934:3: this_EXTERN_1= RULE_EXTERN
                    {
                    this_EXTERN_1=(Token)match(input,RULE_EXTERN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXTERN_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXTERN_1, grammarAccess.getStorage_class_specifierAccess().getEXTERNTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:1942:3: this_STATIC_2= RULE_STATIC
                    {
                    this_STATIC_2=(Token)match(input,RULE_STATIC,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STATIC_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STATIC_2, grammarAccess.getStorage_class_specifierAccess().getSTATICTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:1950:3: this_AUTO_3= RULE_AUTO
                    {
                    this_AUTO_3=(Token)match(input,RULE_AUTO,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_AUTO_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_AUTO_3, grammarAccess.getStorage_class_specifierAccess().getAUTOTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAnsic.g:1958:3: this_REGISTER_4= RULE_REGISTER
                    {
                    this_REGISTER_4=(Token)match(input,RULE_REGISTER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_REGISTER_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_REGISTER_4, grammarAccess.getStorage_class_specifierAccess().getREGISTERTerminalRuleCall_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestorage_class_specifier"


    // $ANTLR start "entryRuletype_specifier"
    // InternalAnsic.g:1969:1: entryRuletype_specifier returns [String current=null] : iv_ruletype_specifier= ruletype_specifier EOF ;
    public final String entryRuletype_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_specifier = null;


        try {
            // InternalAnsic.g:1969:54: (iv_ruletype_specifier= ruletype_specifier EOF )
            // InternalAnsic.g:1970:2: iv_ruletype_specifier= ruletype_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype_specifier=ruletype_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_specifier"


    // $ANTLR start "ruletype_specifier"
    // InternalAnsic.g:1976:1: ruletype_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VOID_0= RULE_VOID | kw= 'charz' | this_SHORT_2= RULE_SHORT | this_INT_3= RULE_INT | this_LONG_4= RULE_LONG | this_FLOAT_5= RULE_FLOAT | this_DOUBLE_6= RULE_DOUBLE | this_SIGNED_7= RULE_SIGNED | this_UNSIGNED_8= RULE_UNSIGNED | this_struct_or_union_specifier_9= rulestruct_or_union_specifier | this_enum_specifier_10= ruleenum_specifier | this_TYPE_NAMEE_11= ruleTYPE_NAMEE ) ;
    public final AntlrDatatypeRuleToken ruletype_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VOID_0=null;
        Token kw=null;
        Token this_SHORT_2=null;
        Token this_INT_3=null;
        Token this_LONG_4=null;
        Token this_FLOAT_5=null;
        Token this_DOUBLE_6=null;
        Token this_SIGNED_7=null;
        Token this_UNSIGNED_8=null;
        AntlrDatatypeRuleToken this_struct_or_union_specifier_9 = null;

        AntlrDatatypeRuleToken this_enum_specifier_10 = null;

        AntlrDatatypeRuleToken this_TYPE_NAMEE_11 = null;



        	enterRule();

        try {
            // InternalAnsic.g:1982:2: ( (this_VOID_0= RULE_VOID | kw= 'charz' | this_SHORT_2= RULE_SHORT | this_INT_3= RULE_INT | this_LONG_4= RULE_LONG | this_FLOAT_5= RULE_FLOAT | this_DOUBLE_6= RULE_DOUBLE | this_SIGNED_7= RULE_SIGNED | this_UNSIGNED_8= RULE_UNSIGNED | this_struct_or_union_specifier_9= rulestruct_or_union_specifier | this_enum_specifier_10= ruleenum_specifier | this_TYPE_NAMEE_11= ruleTYPE_NAMEE ) )
            // InternalAnsic.g:1983:2: (this_VOID_0= RULE_VOID | kw= 'charz' | this_SHORT_2= RULE_SHORT | this_INT_3= RULE_INT | this_LONG_4= RULE_LONG | this_FLOAT_5= RULE_FLOAT | this_DOUBLE_6= RULE_DOUBLE | this_SIGNED_7= RULE_SIGNED | this_UNSIGNED_8= RULE_UNSIGNED | this_struct_or_union_specifier_9= rulestruct_or_union_specifier | this_enum_specifier_10= ruleenum_specifier | this_TYPE_NAMEE_11= ruleTYPE_NAMEE )
            {
            // InternalAnsic.g:1983:2: (this_VOID_0= RULE_VOID | kw= 'charz' | this_SHORT_2= RULE_SHORT | this_INT_3= RULE_INT | this_LONG_4= RULE_LONG | this_FLOAT_5= RULE_FLOAT | this_DOUBLE_6= RULE_DOUBLE | this_SIGNED_7= RULE_SIGNED | this_UNSIGNED_8= RULE_UNSIGNED | this_struct_or_union_specifier_9= rulestruct_or_union_specifier | this_enum_specifier_10= ruleenum_specifier | this_TYPE_NAMEE_11= ruleTYPE_NAMEE )
            int alt35=12;
            switch ( input.LA(1) ) {
            case RULE_VOID:
                {
                alt35=1;
                }
                break;
            case 90:
                {
                alt35=2;
                }
                break;
            case RULE_SHORT:
                {
                alt35=3;
                }
                break;
            case RULE_INT:
                {
                alt35=4;
                }
                break;
            case RULE_LONG:
                {
                alt35=5;
                }
                break;
            case RULE_FLOAT:
                {
                alt35=6;
                }
                break;
            case RULE_DOUBLE:
                {
                alt35=7;
                }
                break;
            case RULE_SIGNED:
                {
                alt35=8;
                }
                break;
            case RULE_UNSIGNED:
                {
                alt35=9;
                }
                break;
            case RULE_STRUCT:
            case RULE_UNION:
                {
                alt35=10;
                }
                break;
            case RULE_ENUM:
                {
                alt35=11;
                }
                break;
            case RULE_ID:
                {
                alt35=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalAnsic.g:1984:3: this_VOID_0= RULE_VOID
                    {
                    this_VOID_0=(Token)match(input,RULE_VOID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VOID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_VOID_0, grammarAccess.getType_specifierAccess().getVOIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:1992:3: kw= 'charz'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharzKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:1998:3: this_SHORT_2= RULE_SHORT
                    {
                    this_SHORT_2=(Token)match(input,RULE_SHORT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SHORT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SHORT_2, grammarAccess.getType_specifierAccess().getSHORTTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:2006:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_3, grammarAccess.getType_specifierAccess().getINTTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAnsic.g:2014:3: this_LONG_4= RULE_LONG
                    {
                    this_LONG_4=(Token)match(input,RULE_LONG,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LONG_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LONG_4, grammarAccess.getType_specifierAccess().getLONGTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAnsic.g:2022:3: this_FLOAT_5= RULE_FLOAT
                    {
                    this_FLOAT_5=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FLOAT_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_FLOAT_5, grammarAccess.getType_specifierAccess().getFLOATTerminalRuleCall_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAnsic.g:2030:3: this_DOUBLE_6= RULE_DOUBLE
                    {
                    this_DOUBLE_6=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DOUBLE_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DOUBLE_6, grammarAccess.getType_specifierAccess().getDOUBLETerminalRuleCall_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAnsic.g:2038:3: this_SIGNED_7= RULE_SIGNED
                    {
                    this_SIGNED_7=(Token)match(input,RULE_SIGNED,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SIGNED_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SIGNED_7, grammarAccess.getType_specifierAccess().getSIGNEDTerminalRuleCall_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAnsic.g:2046:3: this_UNSIGNED_8= RULE_UNSIGNED
                    {
                    this_UNSIGNED_8=(Token)match(input,RULE_UNSIGNED,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UNSIGNED_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_UNSIGNED_8, grammarAccess.getType_specifierAccess().getUNSIGNEDTerminalRuleCall_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAnsic.g:2054:3: this_struct_or_union_specifier_9= rulestruct_or_union_specifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_specifierAccess().getStruct_or_union_specifierParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_struct_or_union_specifier_9=rulestruct_or_union_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_struct_or_union_specifier_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalAnsic.g:2065:3: this_enum_specifier_10= ruleenum_specifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_specifierAccess().getEnum_specifierParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_enum_specifier_10=ruleenum_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_enum_specifier_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalAnsic.g:2076:3: this_TYPE_NAMEE_11= ruleTYPE_NAMEE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getType_specifierAccess().getTYPE_NAMEEParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TYPE_NAMEE_11=ruleTYPE_NAMEE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TYPE_NAMEE_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_specifier"


    // $ANTLR start "entryRulestruct_or_union_specifier"
    // InternalAnsic.g:2090:1: entryRulestruct_or_union_specifier returns [String current=null] : iv_rulestruct_or_union_specifier= rulestruct_or_union_specifier EOF ;
    public final String entryRulestruct_or_union_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestruct_or_union_specifier = null;


        try {
            // InternalAnsic.g:2090:65: (iv_rulestruct_or_union_specifier= rulestruct_or_union_specifier EOF )
            // InternalAnsic.g:2091:2: iv_rulestruct_or_union_specifier= rulestruct_or_union_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStruct_or_union_specifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestruct_or_union_specifier=rulestruct_or_union_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestruct_or_union_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestruct_or_union_specifier"


    // $ANTLR start "rulestruct_or_union_specifier"
    // InternalAnsic.g:2097:1: rulestruct_or_union_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_struct_or_union_0= rulestruct_or_union this_IDENTIFIER_1= ruleIDENTIFIER kw= '{' this_struct_declaration_list_3= rulestruct_declaration_list kw= '}' ) | (this_struct_or_union_5= rulestruct_or_union kw= '{' this_struct_declaration_list_7= rulestruct_declaration_list kw= '}' ) | (this_struct_or_union_9= rulestruct_or_union this_IDENTIFIER_10= ruleIDENTIFIER ) ) ;
    public final AntlrDatatypeRuleToken rulestruct_or_union_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_struct_or_union_0 = null;

        AntlrDatatypeRuleToken this_IDENTIFIER_1 = null;

        AntlrDatatypeRuleToken this_struct_declaration_list_3 = null;

        AntlrDatatypeRuleToken this_struct_or_union_5 = null;

        AntlrDatatypeRuleToken this_struct_declaration_list_7 = null;

        AntlrDatatypeRuleToken this_struct_or_union_9 = null;

        AntlrDatatypeRuleToken this_IDENTIFIER_10 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2103:2: ( ( (this_struct_or_union_0= rulestruct_or_union this_IDENTIFIER_1= ruleIDENTIFIER kw= '{' this_struct_declaration_list_3= rulestruct_declaration_list kw= '}' ) | (this_struct_or_union_5= rulestruct_or_union kw= '{' this_struct_declaration_list_7= rulestruct_declaration_list kw= '}' ) | (this_struct_or_union_9= rulestruct_or_union this_IDENTIFIER_10= ruleIDENTIFIER ) ) )
            // InternalAnsic.g:2104:2: ( (this_struct_or_union_0= rulestruct_or_union this_IDENTIFIER_1= ruleIDENTIFIER kw= '{' this_struct_declaration_list_3= rulestruct_declaration_list kw= '}' ) | (this_struct_or_union_5= rulestruct_or_union kw= '{' this_struct_declaration_list_7= rulestruct_declaration_list kw= '}' ) | (this_struct_or_union_9= rulestruct_or_union this_IDENTIFIER_10= ruleIDENTIFIER ) )
            {
            // InternalAnsic.g:2104:2: ( (this_struct_or_union_0= rulestruct_or_union this_IDENTIFIER_1= ruleIDENTIFIER kw= '{' this_struct_declaration_list_3= rulestruct_declaration_list kw= '}' ) | (this_struct_or_union_5= rulestruct_or_union kw= '{' this_struct_declaration_list_7= rulestruct_declaration_list kw= '}' ) | (this_struct_or_union_9= rulestruct_or_union this_IDENTIFIER_10= ruleIDENTIFIER ) )
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRUCT) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_ID) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==91) ) {
                        alt36=1;
                    }
                    else if ( (LA36_3==EOF||(LA36_3>=RULE_TYPEDEF && LA36_3<=RULE_VOLATILE)||LA36_3==RULE_ID||(LA36_3>=68 && LA36_3<=70)||LA36_3==73||LA36_3==75||LA36_3==87||(LA36_3>=89 && LA36_3<=90)) ) {
                        alt36=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA36_1==91) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA36_0==RULE_UNION) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==RULE_ID) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==91) ) {
                        alt36=1;
                    }
                    else if ( (LA36_3==EOF||(LA36_3>=RULE_TYPEDEF && LA36_3<=RULE_VOLATILE)||LA36_3==RULE_ID||(LA36_3>=68 && LA36_3<=70)||LA36_3==73||LA36_3==75||LA36_3==87||(LA36_3>=89 && LA36_3<=90)) ) {
                        alt36=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA36_2==91) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalAnsic.g:2105:3: (this_struct_or_union_0= rulestruct_or_union this_IDENTIFIER_1= ruleIDENTIFIER kw= '{' this_struct_declaration_list_3= rulestruct_declaration_list kw= '}' )
                    {
                    // InternalAnsic.g:2105:3: (this_struct_or_union_0= rulestruct_or_union this_IDENTIFIER_1= ruleIDENTIFIER kw= '{' this_struct_declaration_list_3= rulestruct_declaration_list kw= '}' )
                    // InternalAnsic.g:2106:4: this_struct_or_union_0= rulestruct_or_union this_IDENTIFIER_1= ruleIDENTIFIER kw= '{' this_struct_declaration_list_3= rulestruct_declaration_list kw= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_or_union_specifierAccess().getStruct_or_unionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    this_struct_or_union_0=rulestruct_or_union();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_struct_or_union_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_or_union_specifierAccess().getIDENTIFIERParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_IDENTIFIER_1=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,91,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getStruct_or_union_specifierAccess().getLeftCurlyBracketKeyword_0_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_or_union_specifierAccess().getStruct_declaration_listParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_struct_declaration_list_3=rulestruct_declaration_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_struct_declaration_list_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getStruct_or_union_specifierAccess().getRightCurlyBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2148:3: (this_struct_or_union_5= rulestruct_or_union kw= '{' this_struct_declaration_list_7= rulestruct_declaration_list kw= '}' )
                    {
                    // InternalAnsic.g:2148:3: (this_struct_or_union_5= rulestruct_or_union kw= '{' this_struct_declaration_list_7= rulestruct_declaration_list kw= '}' )
                    // InternalAnsic.g:2149:4: this_struct_or_union_5= rulestruct_or_union kw= '{' this_struct_declaration_list_7= rulestruct_declaration_list kw= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_or_union_specifierAccess().getStruct_or_unionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_struct_or_union_5=rulestruct_or_union();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_struct_or_union_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,91,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getStruct_or_union_specifierAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_or_union_specifierAccess().getStruct_declaration_listParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_struct_declaration_list_7=rulestruct_declaration_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_struct_declaration_list_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getStruct_or_union_specifierAccess().getRightCurlyBracketKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:2181:3: (this_struct_or_union_9= rulestruct_or_union this_IDENTIFIER_10= ruleIDENTIFIER )
                    {
                    // InternalAnsic.g:2181:3: (this_struct_or_union_9= rulestruct_or_union this_IDENTIFIER_10= ruleIDENTIFIER )
                    // InternalAnsic.g:2182:4: this_struct_or_union_9= rulestruct_or_union this_IDENTIFIER_10= ruleIDENTIFIER
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_or_union_specifierAccess().getStruct_or_unionParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    this_struct_or_union_9=rulestruct_or_union();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_struct_or_union_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_or_union_specifierAccess().getIDENTIFIERParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_IDENTIFIER_10=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestruct_or_union_specifier"


    // $ANTLR start "entryRulestruct_or_union"
    // InternalAnsic.g:2207:1: entryRulestruct_or_union returns [String current=null] : iv_rulestruct_or_union= rulestruct_or_union EOF ;
    public final String entryRulestruct_or_union() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestruct_or_union = null;


        try {
            // InternalAnsic.g:2207:55: (iv_rulestruct_or_union= rulestruct_or_union EOF )
            // InternalAnsic.g:2208:2: iv_rulestruct_or_union= rulestruct_or_union EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStruct_or_unionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestruct_or_union=rulestruct_or_union();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestruct_or_union.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestruct_or_union"


    // $ANTLR start "rulestruct_or_union"
    // InternalAnsic.g:2214:1: rulestruct_or_union returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRUCT_0= RULE_STRUCT | this_UNION_1= RULE_UNION ) ;
    public final AntlrDatatypeRuleToken rulestruct_or_union() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRUCT_0=null;
        Token this_UNION_1=null;


        	enterRule();

        try {
            // InternalAnsic.g:2220:2: ( (this_STRUCT_0= RULE_STRUCT | this_UNION_1= RULE_UNION ) )
            // InternalAnsic.g:2221:2: (this_STRUCT_0= RULE_STRUCT | this_UNION_1= RULE_UNION )
            {
            // InternalAnsic.g:2221:2: (this_STRUCT_0= RULE_STRUCT | this_UNION_1= RULE_UNION )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRUCT) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_UNION) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnsic.g:2222:3: this_STRUCT_0= RULE_STRUCT
                    {
                    this_STRUCT_0=(Token)match(input,RULE_STRUCT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRUCT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRUCT_0, grammarAccess.getStruct_or_unionAccess().getSTRUCTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2230:3: this_UNION_1= RULE_UNION
                    {
                    this_UNION_1=(Token)match(input,RULE_UNION,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UNION_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_UNION_1, grammarAccess.getStruct_or_unionAccess().getUNIONTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestruct_or_union"


    // $ANTLR start "entryRulestruct_declaration_list"
    // InternalAnsic.g:2241:1: entryRulestruct_declaration_list returns [String current=null] : iv_rulestruct_declaration_list= rulestruct_declaration_list EOF ;
    public final String entryRulestruct_declaration_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestruct_declaration_list = null;


        try {
            // InternalAnsic.g:2241:63: (iv_rulestruct_declaration_list= rulestruct_declaration_list EOF )
            // InternalAnsic.g:2242:2: iv_rulestruct_declaration_list= rulestruct_declaration_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStruct_declaration_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestruct_declaration_list=rulestruct_declaration_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestruct_declaration_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestruct_declaration_list"


    // $ANTLR start "rulestruct_declaration_list"
    // InternalAnsic.g:2248:1: rulestruct_declaration_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_struct_declaration_0= rulestruct_declaration )+ ;
    public final AntlrDatatypeRuleToken rulestruct_declaration_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_struct_declaration_0 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2254:2: ( (this_struct_declaration_0= rulestruct_declaration )+ )
            // InternalAnsic.g:2255:2: (this_struct_declaration_0= rulestruct_declaration )+
            {
            // InternalAnsic.g:2255:2: (this_struct_declaration_0= rulestruct_declaration )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_VOID && LA38_0<=RULE_VOLATILE)||LA38_0==RULE_ID||LA38_0==90) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAnsic.g:2256:3: this_struct_declaration_0= rulestruct_declaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getStruct_declaration_listAccess().getStruct_declarationParserRuleCall());
            	      		
            	    }
            	    pushFollow(FOLLOW_33);
            	    this_struct_declaration_0=rulestruct_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_struct_declaration_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestruct_declaration_list"


    // $ANTLR start "entryRulestruct_declaration"
    // InternalAnsic.g:2270:1: entryRulestruct_declaration returns [String current=null] : iv_rulestruct_declaration= rulestruct_declaration EOF ;
    public final String entryRulestruct_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestruct_declaration = null;


        try {
            // InternalAnsic.g:2270:58: (iv_rulestruct_declaration= rulestruct_declaration EOF )
            // InternalAnsic.g:2271:2: iv_rulestruct_declaration= rulestruct_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStruct_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestruct_declaration=rulestruct_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestruct_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestruct_declaration"


    // $ANTLR start "rulestruct_declaration"
    // InternalAnsic.g:2277:1: rulestruct_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_specifier_qualifier_list_0= rulespecifier_qualifier_list this_struct_declarator_list_1= rulestruct_declarator_list kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulestruct_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_specifier_qualifier_list_0 = null;

        AntlrDatatypeRuleToken this_struct_declarator_list_1 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2283:2: ( (this_specifier_qualifier_list_0= rulespecifier_qualifier_list this_struct_declarator_list_1= rulestruct_declarator_list kw= ';' ) )
            // InternalAnsic.g:2284:2: (this_specifier_qualifier_list_0= rulespecifier_qualifier_list this_struct_declarator_list_1= rulestruct_declarator_list kw= ';' )
            {
            // InternalAnsic.g:2284:2: (this_specifier_qualifier_list_0= rulespecifier_qualifier_list this_struct_declarator_list_1= rulestruct_declarator_list kw= ';' )
            // InternalAnsic.g:2285:3: this_specifier_qualifier_list_0= rulespecifier_qualifier_list this_struct_declarator_list_1= rulestruct_declarator_list kw= ';'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getStruct_declarationAccess().getSpecifier_qualifier_listParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_specifier_qualifier_list_0=rulespecifier_qualifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_specifier_qualifier_list_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getStruct_declarationAccess().getStruct_declarator_listParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_26);
            this_struct_declarator_list_1=rulestruct_declarator_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_struct_declarator_list_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStruct_declarationAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestruct_declaration"


    // $ANTLR start "entryRulespecifier_qualifier_list"
    // InternalAnsic.g:2314:1: entryRulespecifier_qualifier_list returns [String current=null] : iv_rulespecifier_qualifier_list= rulespecifier_qualifier_list EOF ;
    public final String entryRulespecifier_qualifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulespecifier_qualifier_list = null;


        try {
            // InternalAnsic.g:2314:64: (iv_rulespecifier_qualifier_list= rulespecifier_qualifier_list EOF )
            // InternalAnsic.g:2315:2: iv_rulespecifier_qualifier_list= rulespecifier_qualifier_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecifier_qualifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulespecifier_qualifier_list=rulespecifier_qualifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulespecifier_qualifier_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulespecifier_qualifier_list"


    // $ANTLR start "rulespecifier_qualifier_list"
    // InternalAnsic.g:2321:1: rulespecifier_qualifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list ) | this_type_specifier_2= ruletype_specifier | (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list ) | this_type_qualifier_5= ruletype_qualifier ) ;
    public final AntlrDatatypeRuleToken rulespecifier_qualifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_type_specifier_0 = null;

        AntlrDatatypeRuleToken this_specifier_qualifier_list_1 = null;

        AntlrDatatypeRuleToken this_type_specifier_2 = null;

        AntlrDatatypeRuleToken this_type_qualifier_3 = null;

        AntlrDatatypeRuleToken this_specifier_qualifier_list_4 = null;

        AntlrDatatypeRuleToken this_type_qualifier_5 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2327:2: ( ( (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list ) | this_type_specifier_2= ruletype_specifier | (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list ) | this_type_qualifier_5= ruletype_qualifier ) )
            // InternalAnsic.g:2328:2: ( (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list ) | this_type_specifier_2= ruletype_specifier | (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list ) | this_type_qualifier_5= ruletype_qualifier )
            {
            // InternalAnsic.g:2328:2: ( (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list ) | this_type_specifier_2= ruletype_specifier | (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list ) | this_type_qualifier_5= ruletype_qualifier )
            int alt39=4;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalAnsic.g:2329:3: (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list )
                    {
                    // InternalAnsic.g:2329:3: (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list )
                    // InternalAnsic.g:2330:4: this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSpecifier_qualifier_listAccess().getType_specifierParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_type_specifier_0=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_specifier_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSpecifier_qualifier_listAccess().getSpecifier_qualifier_listParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_specifier_qualifier_list_1=rulespecifier_qualifier_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_specifier_qualifier_list_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2352:3: this_type_specifier_2= ruletype_specifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSpecifier_qualifier_listAccess().getType_specifierParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_type_specifier_2=ruletype_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_type_specifier_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:2363:3: (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list )
                    {
                    // InternalAnsic.g:2363:3: (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list )
                    // InternalAnsic.g:2364:4: this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSpecifier_qualifier_listAccess().getType_qualifierParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_type_qualifier_3=ruletype_qualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_qualifier_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSpecifier_qualifier_listAccess().getSpecifier_qualifier_listParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_specifier_qualifier_list_4=rulespecifier_qualifier_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_specifier_qualifier_list_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:2386:3: this_type_qualifier_5= ruletype_qualifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSpecifier_qualifier_listAccess().getType_qualifierParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_type_qualifier_5=ruletype_qualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_type_qualifier_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulespecifier_qualifier_list"


    // $ANTLR start "entryRulestruct_declarator_list"
    // InternalAnsic.g:2400:1: entryRulestruct_declarator_list returns [String current=null] : iv_rulestruct_declarator_list= rulestruct_declarator_list EOF ;
    public final String entryRulestruct_declarator_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestruct_declarator_list = null;


        try {
            // InternalAnsic.g:2400:62: (iv_rulestruct_declarator_list= rulestruct_declarator_list EOF )
            // InternalAnsic.g:2401:2: iv_rulestruct_declarator_list= rulestruct_declarator_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStruct_declarator_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestruct_declarator_list=rulestruct_declarator_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestruct_declarator_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestruct_declarator_list"


    // $ANTLR start "rulestruct_declarator_list"
    // InternalAnsic.g:2407:1: rulestruct_declarator_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_struct_declarator_0= rulestruct_declarator (kw= ',' this_struct_declarator_2= rulestruct_declarator )* ) ;
    public final AntlrDatatypeRuleToken rulestruct_declarator_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_struct_declarator_0 = null;

        AntlrDatatypeRuleToken this_struct_declarator_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2413:2: ( (this_struct_declarator_0= rulestruct_declarator (kw= ',' this_struct_declarator_2= rulestruct_declarator )* ) )
            // InternalAnsic.g:2414:2: (this_struct_declarator_0= rulestruct_declarator (kw= ',' this_struct_declarator_2= rulestruct_declarator )* )
            {
            // InternalAnsic.g:2414:2: (this_struct_declarator_0= rulestruct_declarator (kw= ',' this_struct_declarator_2= rulestruct_declarator )* )
            // InternalAnsic.g:2415:3: this_struct_declarator_0= rulestruct_declarator (kw= ',' this_struct_declarator_2= rulestruct_declarator )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getStruct_declarator_listAccess().getStruct_declaratorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_struct_declarator_0=rulestruct_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_struct_declarator_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:2425:3: (kw= ',' this_struct_declarator_2= rulestruct_declarator )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==73) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAnsic.g:2426:4: kw= ',' this_struct_declarator_2= rulestruct_declarator
            	    {
            	    kw=(Token)match(input,73,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getStruct_declarator_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStruct_declarator_listAccess().getStruct_declaratorParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_struct_declarator_2=rulestruct_declarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_struct_declarator_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestruct_declarator_list"


    // $ANTLR start "entryRulestruct_declarator"
    // InternalAnsic.g:2446:1: entryRulestruct_declarator returns [String current=null] : iv_rulestruct_declarator= rulestruct_declarator EOF ;
    public final String entryRulestruct_declarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestruct_declarator = null;


        try {
            // InternalAnsic.g:2446:57: (iv_rulestruct_declarator= rulestruct_declarator EOF )
            // InternalAnsic.g:2447:2: iv_rulestruct_declarator= rulestruct_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStruct_declaratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestruct_declarator=rulestruct_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestruct_declarator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestruct_declarator"


    // $ANTLR start "rulestruct_declarator"
    // InternalAnsic.g:2453:1: rulestruct_declarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declarator_0= ruledeclarator | (kw= ':' this_constant_expression_2= ruleconstant_expression ) | (this_declarator_3= ruledeclarator kw= ':' this_constant_expression_5= ruleconstant_expression ) ) ;
    public final AntlrDatatypeRuleToken rulestruct_declarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_declarator_0 = null;

        AntlrDatatypeRuleToken this_constant_expression_2 = null;

        AntlrDatatypeRuleToken this_declarator_3 = null;

        AntlrDatatypeRuleToken this_constant_expression_5 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2459:2: ( (this_declarator_0= ruledeclarator | (kw= ':' this_constant_expression_2= ruleconstant_expression ) | (this_declarator_3= ruledeclarator kw= ':' this_constant_expression_5= ruleconstant_expression ) ) )
            // InternalAnsic.g:2460:2: (this_declarator_0= ruledeclarator | (kw= ':' this_constant_expression_2= ruleconstant_expression ) | (this_declarator_3= ruledeclarator kw= ':' this_constant_expression_5= ruleconstant_expression ) )
            {
            // InternalAnsic.g:2460:2: (this_declarator_0= ruledeclarator | (kw= ':' this_constant_expression_2= ruleconstant_expression ) | (this_declarator_3= ruledeclarator kw= ':' this_constant_expression_5= ruleconstant_expression ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                int LA41_1 = input.LA(2);

                if ( (synpred85_InternalAnsic()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA41_2 = input.LA(2);

                if ( (synpred85_InternalAnsic()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA41_3 = input.LA(2);

                if ( (synpred85_InternalAnsic()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            case 87:
                {
                alt41=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalAnsic.g:2461:3: this_declarator_0= ruledeclarator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStruct_declaratorAccess().getDeclaratorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_declarator_0=ruledeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_declarator_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2472:3: (kw= ':' this_constant_expression_2= ruleconstant_expression )
                    {
                    // InternalAnsic.g:2472:3: (kw= ':' this_constant_expression_2= ruleconstant_expression )
                    // InternalAnsic.g:2473:4: kw= ':' this_constant_expression_2= ruleconstant_expression
                    {
                    kw=(Token)match(input,87,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getStruct_declaratorAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_declaratorAccess().getConstant_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_constant_expression_2=ruleconstant_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_constant_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:2490:3: (this_declarator_3= ruledeclarator kw= ':' this_constant_expression_5= ruleconstant_expression )
                    {
                    // InternalAnsic.g:2490:3: (this_declarator_3= ruledeclarator kw= ':' this_constant_expression_5= ruleconstant_expression )
                    // InternalAnsic.g:2491:4: this_declarator_3= ruledeclarator kw= ':' this_constant_expression_5= ruleconstant_expression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_declaratorAccess().getDeclaratorParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_declarator_3=ruledeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declarator_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,87,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getStruct_declaratorAccess().getColonKeyword_2_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStruct_declaratorAccess().getConstant_expressionParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_constant_expression_5=ruleconstant_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_constant_expression_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestruct_declarator"


    // $ANTLR start "entryRuleenum_specifier"
    // InternalAnsic.g:2521:1: entryRuleenum_specifier returns [String current=null] : iv_ruleenum_specifier= ruleenum_specifier EOF ;
    public final String entryRuleenum_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenum_specifier = null;


        try {
            // InternalAnsic.g:2521:54: (iv_ruleenum_specifier= ruleenum_specifier EOF )
            // InternalAnsic.g:2522:2: iv_ruleenum_specifier= ruleenum_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnum_specifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleenum_specifier=ruleenum_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenum_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenum_specifier"


    // $ANTLR start "ruleenum_specifier"
    // InternalAnsic.g:2528:1: ruleenum_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ENUM_0= RULE_ENUM kw= '{' this_enumerator_list_2= ruleenumerator_list kw= '}' ) | (this_ENUM_4= RULE_ENUM this_IDENTIFIER_5= ruleIDENTIFIER kw= '{' this_enumerator_list_7= ruleenumerator_list kw= '}' ) | (this_ENUM_9= RULE_ENUM this_IDENTIFIER_10= ruleIDENTIFIER ) ) ;
    public final AntlrDatatypeRuleToken ruleenum_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ENUM_0=null;
        Token kw=null;
        Token this_ENUM_4=null;
        Token this_ENUM_9=null;
        AntlrDatatypeRuleToken this_enumerator_list_2 = null;

        AntlrDatatypeRuleToken this_IDENTIFIER_5 = null;

        AntlrDatatypeRuleToken this_enumerator_list_7 = null;

        AntlrDatatypeRuleToken this_IDENTIFIER_10 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2534:2: ( ( (this_ENUM_0= RULE_ENUM kw= '{' this_enumerator_list_2= ruleenumerator_list kw= '}' ) | (this_ENUM_4= RULE_ENUM this_IDENTIFIER_5= ruleIDENTIFIER kw= '{' this_enumerator_list_7= ruleenumerator_list kw= '}' ) | (this_ENUM_9= RULE_ENUM this_IDENTIFIER_10= ruleIDENTIFIER ) ) )
            // InternalAnsic.g:2535:2: ( (this_ENUM_0= RULE_ENUM kw= '{' this_enumerator_list_2= ruleenumerator_list kw= '}' ) | (this_ENUM_4= RULE_ENUM this_IDENTIFIER_5= ruleIDENTIFIER kw= '{' this_enumerator_list_7= ruleenumerator_list kw= '}' ) | (this_ENUM_9= RULE_ENUM this_IDENTIFIER_10= ruleIDENTIFIER ) )
            {
            // InternalAnsic.g:2535:2: ( (this_ENUM_0= RULE_ENUM kw= '{' this_enumerator_list_2= ruleenumerator_list kw= '}' ) | (this_ENUM_4= RULE_ENUM this_IDENTIFIER_5= ruleIDENTIFIER kw= '{' this_enumerator_list_7= ruleenumerator_list kw= '}' ) | (this_ENUM_9= RULE_ENUM this_IDENTIFIER_10= ruleIDENTIFIER ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ENUM) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_ID) ) {
                    int LA42_2 = input.LA(3);

                    if ( (LA42_2==91) ) {
                        alt42=2;
                    }
                    else if ( (LA42_2==EOF||(LA42_2>=RULE_TYPEDEF && LA42_2<=RULE_VOLATILE)||LA42_2==RULE_ID||(LA42_2>=68 && LA42_2<=70)||LA42_2==73||LA42_2==75||LA42_2==87||(LA42_2>=89 && LA42_2<=90)) ) {
                        alt42=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA42_1==91) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalAnsic.g:2536:3: (this_ENUM_0= RULE_ENUM kw= '{' this_enumerator_list_2= ruleenumerator_list kw= '}' )
                    {
                    // InternalAnsic.g:2536:3: (this_ENUM_0= RULE_ENUM kw= '{' this_enumerator_list_2= ruleenumerator_list kw= '}' )
                    // InternalAnsic.g:2537:4: this_ENUM_0= RULE_ENUM kw= '{' this_enumerator_list_2= ruleenumerator_list kw= '}'
                    {
                    this_ENUM_0=(Token)match(input,RULE_ENUM,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ENUM_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ENUM_0, grammarAccess.getEnum_specifierAccess().getENUMTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,91,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEnum_specifierAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEnum_specifierAccess().getEnumerator_listParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_enumerator_list_2=ruleenumerator_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_enumerator_list_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEnum_specifierAccess().getRightCurlyBracketKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2566:3: (this_ENUM_4= RULE_ENUM this_IDENTIFIER_5= ruleIDENTIFIER kw= '{' this_enumerator_list_7= ruleenumerator_list kw= '}' )
                    {
                    // InternalAnsic.g:2566:3: (this_ENUM_4= RULE_ENUM this_IDENTIFIER_5= ruleIDENTIFIER kw= '{' this_enumerator_list_7= ruleenumerator_list kw= '}' )
                    // InternalAnsic.g:2567:4: this_ENUM_4= RULE_ENUM this_IDENTIFIER_5= ruleIDENTIFIER kw= '{' this_enumerator_list_7= ruleenumerator_list kw= '}'
                    {
                    this_ENUM_4=(Token)match(input,RULE_ENUM,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ENUM_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ENUM_4, grammarAccess.getEnum_specifierAccess().getENUMTerminalRuleCall_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEnum_specifierAccess().getIDENTIFIERParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_IDENTIFIER_5=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,91,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEnum_specifierAccess().getLeftCurlyBracketKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEnum_specifierAccess().getEnumerator_listParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_enumerator_list_7=ruleenumerator_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_enumerator_list_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEnum_specifierAccess().getRightCurlyBracketKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:2606:3: (this_ENUM_9= RULE_ENUM this_IDENTIFIER_10= ruleIDENTIFIER )
                    {
                    // InternalAnsic.g:2606:3: (this_ENUM_9= RULE_ENUM this_IDENTIFIER_10= ruleIDENTIFIER )
                    // InternalAnsic.g:2607:4: this_ENUM_9= RULE_ENUM this_IDENTIFIER_10= ruleIDENTIFIER
                    {
                    this_ENUM_9=(Token)match(input,RULE_ENUM,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ENUM_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ENUM_9, grammarAccess.getEnum_specifierAccess().getENUMTerminalRuleCall_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEnum_specifierAccess().getIDENTIFIERParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_IDENTIFIER_10=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenum_specifier"


    // $ANTLR start "entryRuleenumerator_list"
    // InternalAnsic.g:2629:1: entryRuleenumerator_list returns [String current=null] : iv_ruleenumerator_list= ruleenumerator_list EOF ;
    public final String entryRuleenumerator_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenumerator_list = null;


        try {
            // InternalAnsic.g:2629:55: (iv_ruleenumerator_list= ruleenumerator_list EOF )
            // InternalAnsic.g:2630:2: iv_ruleenumerator_list= ruleenumerator_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerator_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleenumerator_list=ruleenumerator_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenumerator_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenumerator_list"


    // $ANTLR start "ruleenumerator_list"
    // InternalAnsic.g:2636:1: ruleenumerator_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_enumerator_0= ruleenumerator (kw= ',' this_enumerator_2= ruleenumerator )* ) ;
    public final AntlrDatatypeRuleToken ruleenumerator_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_enumerator_0 = null;

        AntlrDatatypeRuleToken this_enumerator_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2642:2: ( (this_enumerator_0= ruleenumerator (kw= ',' this_enumerator_2= ruleenumerator )* ) )
            // InternalAnsic.g:2643:2: (this_enumerator_0= ruleenumerator (kw= ',' this_enumerator_2= ruleenumerator )* )
            {
            // InternalAnsic.g:2643:2: (this_enumerator_0= ruleenumerator (kw= ',' this_enumerator_2= ruleenumerator )* )
            // InternalAnsic.g:2644:3: this_enumerator_0= ruleenumerator (kw= ',' this_enumerator_2= ruleenumerator )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEnumerator_listAccess().getEnumeratorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_enumerator_0=ruleenumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_enumerator_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:2654:3: (kw= ',' this_enumerator_2= ruleenumerator )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==73) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAnsic.g:2655:4: kw= ',' this_enumerator_2= ruleenumerator
            	    {
            	    kw=(Token)match(input,73,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getEnumerator_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getEnumerator_listAccess().getEnumeratorParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_enumerator_2=ruleenumerator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_enumerator_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenumerator_list"


    // $ANTLR start "entryRuleenumerator"
    // InternalAnsic.g:2675:1: entryRuleenumerator returns [String current=null] : iv_ruleenumerator= ruleenumerator EOF ;
    public final String entryRuleenumerator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenumerator = null;


        try {
            // InternalAnsic.g:2675:50: (iv_ruleenumerator= ruleenumerator EOF )
            // InternalAnsic.g:2676:2: iv_ruleenumerator= ruleenumerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumeratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleenumerator=ruleenumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenumerator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenumerator"


    // $ANTLR start "ruleenumerator"
    // InternalAnsic.g:2682:1: ruleenumerator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= ruleIDENTIFIER | (this_IDENTIFIER_1= ruleIDENTIFIER kw= '=' this_constant_expression_3= ruleconstant_expression ) ) ;
    public final AntlrDatatypeRuleToken ruleenumerator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_0 = null;

        AntlrDatatypeRuleToken this_IDENTIFIER_1 = null;

        AntlrDatatypeRuleToken this_constant_expression_3 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2688:2: ( (this_IDENTIFIER_0= ruleIDENTIFIER | (this_IDENTIFIER_1= ruleIDENTIFIER kw= '=' this_constant_expression_3= ruleconstant_expression ) ) )
            // InternalAnsic.g:2689:2: (this_IDENTIFIER_0= ruleIDENTIFIER | (this_IDENTIFIER_1= ruleIDENTIFIER kw= '=' this_constant_expression_3= ruleconstant_expression ) )
            {
            // InternalAnsic.g:2689:2: (this_IDENTIFIER_0= ruleIDENTIFIER | (this_IDENTIFIER_1= ruleIDENTIFIER kw= '=' this_constant_expression_3= ruleconstant_expression ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==88) ) {
                    alt44=2;
                }
                else if ( (LA44_1==EOF||LA44_1==73||LA44_1==92) ) {
                    alt44=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalAnsic.g:2690:3: this_IDENTIFIER_0= ruleIDENTIFIER
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnumeratorAccess().getIDENTIFIERParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IDENTIFIER_0=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENTIFIER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2701:3: (this_IDENTIFIER_1= ruleIDENTIFIER kw= '=' this_constant_expression_3= ruleconstant_expression )
                    {
                    // InternalAnsic.g:2701:3: (this_IDENTIFIER_1= ruleIDENTIFIER kw= '=' this_constant_expression_3= ruleconstant_expression )
                    // InternalAnsic.g:2702:4: this_IDENTIFIER_1= ruleIDENTIFIER kw= '=' this_constant_expression_3= ruleconstant_expression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEnumeratorAccess().getIDENTIFIERParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_35);
                    this_IDENTIFIER_1=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,88,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEnumeratorAccess().getConstant_expressionParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_constant_expression_3=ruleconstant_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_constant_expression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenumerator"


    // $ANTLR start "entryRuletype_qualifier"
    // InternalAnsic.g:2732:1: entryRuletype_qualifier returns [String current=null] : iv_ruletype_qualifier= ruletype_qualifier EOF ;
    public final String entryRuletype_qualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_qualifier = null;


        try {
            // InternalAnsic.g:2732:54: (iv_ruletype_qualifier= ruletype_qualifier EOF )
            // InternalAnsic.g:2733:2: iv_ruletype_qualifier= ruletype_qualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_qualifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype_qualifier=ruletype_qualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_qualifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_qualifier"


    // $ANTLR start "ruletype_qualifier"
    // InternalAnsic.g:2739:1: ruletype_qualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONST_0= RULE_CONST | this_VOLATILE_1= RULE_VOLATILE ) ;
    public final AntlrDatatypeRuleToken ruletype_qualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONST_0=null;
        Token this_VOLATILE_1=null;


        	enterRule();

        try {
            // InternalAnsic.g:2745:2: ( (this_CONST_0= RULE_CONST | this_VOLATILE_1= RULE_VOLATILE ) )
            // InternalAnsic.g:2746:2: (this_CONST_0= RULE_CONST | this_VOLATILE_1= RULE_VOLATILE )
            {
            // InternalAnsic.g:2746:2: (this_CONST_0= RULE_CONST | this_VOLATILE_1= RULE_VOLATILE )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_CONST) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_VOLATILE) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalAnsic.g:2747:3: this_CONST_0= RULE_CONST
                    {
                    this_CONST_0=(Token)match(input,RULE_CONST,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONST_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONST_0, grammarAccess.getType_qualifierAccess().getCONSTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2755:3: this_VOLATILE_1= RULE_VOLATILE
                    {
                    this_VOLATILE_1=(Token)match(input,RULE_VOLATILE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VOLATILE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_VOLATILE_1, grammarAccess.getType_qualifierAccess().getVOLATILETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_qualifier"


    // $ANTLR start "entryRuledeclarator"
    // InternalAnsic.g:2766:1: entryRuledeclarator returns [String current=null] : iv_ruledeclarator= ruledeclarator EOF ;
    public final String entryRuledeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclarator = null;


        try {
            // InternalAnsic.g:2766:50: (iv_ruledeclarator= ruledeclarator EOF )
            // InternalAnsic.g:2767:2: iv_ruledeclarator= ruledeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledeclarator=ruledeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclarator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeclarator"


    // $ANTLR start "ruledeclarator"
    // InternalAnsic.g:2773:1: ruledeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_pointer_0= rulepointer this_direct_declarator_1= ruledirect_declarator ) | this_direct_declarator_2= ruledirect_declarator ) ;
    public final AntlrDatatypeRuleToken ruledeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_pointer_0 = null;

        AntlrDatatypeRuleToken this_direct_declarator_1 = null;

        AntlrDatatypeRuleToken this_direct_declarator_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2779:2: ( ( (this_pointer_0= rulepointer this_direct_declarator_1= ruledirect_declarator ) | this_direct_declarator_2= ruledirect_declarator ) )
            // InternalAnsic.g:2780:2: ( (this_pointer_0= rulepointer this_direct_declarator_1= ruledirect_declarator ) | this_direct_declarator_2= ruledirect_declarator )
            {
            // InternalAnsic.g:2780:2: ( (this_pointer_0= rulepointer this_direct_declarator_1= ruledirect_declarator ) | this_direct_declarator_2= ruledirect_declarator )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==75) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID||LA46_0==68) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAnsic.g:2781:3: (this_pointer_0= rulepointer this_direct_declarator_1= ruledirect_declarator )
                    {
                    // InternalAnsic.g:2781:3: (this_pointer_0= rulepointer this_direct_declarator_1= ruledirect_declarator )
                    // InternalAnsic.g:2782:4: this_pointer_0= rulepointer this_direct_declarator_1= ruledirect_declarator
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclaratorAccess().getPointerParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_pointer_0=rulepointer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_pointer_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclaratorAccess().getDirect_declaratorParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_declarator_1=ruledirect_declarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_declarator_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2804:3: this_direct_declarator_2= ruledirect_declarator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclaratorAccess().getDirect_declaratorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_declarator_2=ruledirect_declarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_direct_declarator_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclarator"


    // $ANTLR start "entryRuledirect_declarator"
    // InternalAnsic.g:2818:1: entryRuledirect_declarator returns [String current=null] : iv_ruledirect_declarator= ruledirect_declarator EOF ;
    public final String entryRuledirect_declarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledirect_declarator = null;


        try {
            // InternalAnsic.g:2818:57: (iv_ruledirect_declarator= ruledirect_declarator EOF )
            // InternalAnsic.g:2819:2: iv_ruledirect_declarator= ruledirect_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirect_declaratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledirect_declarator=ruledirect_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledirect_declarator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledirect_declarator"


    // $ANTLR start "ruledirect_declarator"
    // InternalAnsic.g:2825:1: ruledirect_declarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFIER_0= ruleIDENTIFIER this_direct_declaratorI_1= ruledirect_declaratorI ) | (kw= '(' this_declarator_3= ruledeclarator kw= ')' this_direct_declaratorI_5= ruledirect_declaratorI ) ) ;
    public final AntlrDatatypeRuleToken ruledirect_declarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_0 = null;

        AntlrDatatypeRuleToken this_direct_declaratorI_1 = null;

        AntlrDatatypeRuleToken this_declarator_3 = null;

        AntlrDatatypeRuleToken this_direct_declaratorI_5 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2831:2: ( ( (this_IDENTIFIER_0= ruleIDENTIFIER this_direct_declaratorI_1= ruledirect_declaratorI ) | (kw= '(' this_declarator_3= ruledeclarator kw= ')' this_direct_declaratorI_5= ruledirect_declaratorI ) ) )
            // InternalAnsic.g:2832:2: ( (this_IDENTIFIER_0= ruleIDENTIFIER this_direct_declaratorI_1= ruledirect_declaratorI ) | (kw= '(' this_declarator_3= ruledeclarator kw= ')' this_direct_declaratorI_5= ruledirect_declaratorI ) )
            {
            // InternalAnsic.g:2832:2: ( (this_IDENTIFIER_0= ruleIDENTIFIER this_direct_declaratorI_1= ruledirect_declaratorI ) | (kw= '(' this_declarator_3= ruledeclarator kw= ')' this_direct_declaratorI_5= ruledirect_declaratorI ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==68) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalAnsic.g:2833:3: (this_IDENTIFIER_0= ruleIDENTIFIER this_direct_declaratorI_1= ruledirect_declaratorI )
                    {
                    // InternalAnsic.g:2833:3: (this_IDENTIFIER_0= ruleIDENTIFIER this_direct_declaratorI_1= ruledirect_declaratorI )
                    // InternalAnsic.g:2834:4: this_IDENTIFIER_0= ruleIDENTIFIER this_direct_declaratorI_1= ruledirect_declaratorI
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorAccess().getIDENTIFIERParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    this_IDENTIFIER_0=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorAccess().getDirect_declaratorIParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_declaratorI_1=ruledirect_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_declaratorI_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2856:3: (kw= '(' this_declarator_3= ruledeclarator kw= ')' this_direct_declaratorI_5= ruledirect_declaratorI )
                    {
                    // InternalAnsic.g:2856:3: (kw= '(' this_declarator_3= ruledeclarator kw= ')' this_direct_declaratorI_5= ruledirect_declaratorI )
                    // InternalAnsic.g:2857:4: kw= '(' this_declarator_3= ruledeclarator kw= ')' this_direct_declaratorI_5= ruledirect_declaratorI
                    {
                    kw=(Token)match(input,68,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorAccess().getDeclaratorParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_declarator_3=ruledeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declarator_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorAccess().getRightParenthesisKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorAccess().getDirect_declaratorIParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_declaratorI_5=ruledirect_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_declaratorI_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledirect_declarator"


    // $ANTLR start "entryRuledirect_declaratorI"
    // InternalAnsic.g:2892:1: entryRuledirect_declaratorI returns [String current=null] : iv_ruledirect_declaratorI= ruledirect_declaratorI EOF ;
    public final String entryRuledirect_declaratorI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledirect_declaratorI = null;


        try {
            // InternalAnsic.g:2892:58: (iv_ruledirect_declaratorI= ruledirect_declaratorI EOF )
            // InternalAnsic.g:2893:2: iv_ruledirect_declaratorI= ruledirect_declaratorI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirect_declaratorIRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledirect_declaratorI=ruledirect_declaratorI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledirect_declaratorI.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledirect_declaratorI"


    // $ANTLR start "ruledirect_declaratorI"
    // InternalAnsic.g:2899:1: ruledirect_declaratorI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' this_constant_expression_1= ruleconstant_expression kw= ']' this_direct_declaratorI_3= ruledirect_declaratorI ) | (kw= '[' kw= ']' this_direct_declaratorI_6= ruledirect_declaratorI ) | (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI ) | (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI ) | (kw= '(' kw= ')' this_direct_declaratorI_17= ruledirect_declaratorI )? ) ;
    public final AntlrDatatypeRuleToken ruledirect_declaratorI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_expression_1 = null;

        AntlrDatatypeRuleToken this_direct_declaratorI_3 = null;

        AntlrDatatypeRuleToken this_direct_declaratorI_6 = null;

        AntlrDatatypeRuleToken this_parameter_type_list_8 = null;

        AntlrDatatypeRuleToken this_direct_declaratorI_10 = null;

        AntlrDatatypeRuleToken this_identifier_list_12 = null;

        AntlrDatatypeRuleToken this_direct_declaratorI_14 = null;

        AntlrDatatypeRuleToken this_direct_declaratorI_17 = null;



        	enterRule();

        try {
            // InternalAnsic.g:2905:2: ( ( (kw= '[' this_constant_expression_1= ruleconstant_expression kw= ']' this_direct_declaratorI_3= ruledirect_declaratorI ) | (kw= '[' kw= ']' this_direct_declaratorI_6= ruledirect_declaratorI ) | (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI ) | (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI ) | (kw= '(' kw= ')' this_direct_declaratorI_17= ruledirect_declaratorI )? ) )
            // InternalAnsic.g:2906:2: ( (kw= '[' this_constant_expression_1= ruleconstant_expression kw= ']' this_direct_declaratorI_3= ruledirect_declaratorI ) | (kw= '[' kw= ']' this_direct_declaratorI_6= ruledirect_declaratorI ) | (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI ) | (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI ) | (kw= '(' kw= ')' this_direct_declaratorI_17= ruledirect_declaratorI )? )
            {
            // InternalAnsic.g:2906:2: ( (kw= '[' this_constant_expression_1= ruleconstant_expression kw= ']' this_direct_declaratorI_3= ruledirect_declaratorI ) | (kw= '[' kw= ']' this_direct_declaratorI_6= ruledirect_declaratorI ) | (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI ) | (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI ) | (kw= '(' kw= ')' this_direct_declaratorI_17= ruledirect_declaratorI )? )
            int alt49=5;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalAnsic.g:2907:3: (kw= '[' this_constant_expression_1= ruleconstant_expression kw= ']' this_direct_declaratorI_3= ruledirect_declaratorI )
                    {
                    // InternalAnsic.g:2907:3: (kw= '[' this_constant_expression_1= ruleconstant_expression kw= ']' this_direct_declaratorI_3= ruledirect_declaratorI )
                    // InternalAnsic.g:2908:4: kw= '[' this_constant_expression_1= ruleconstant_expression kw= ']' this_direct_declaratorI_3= ruledirect_declaratorI
                    {
                    kw=(Token)match(input,70,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorIAccess().getConstant_expressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_constant_expression_1=ruleconstant_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_constant_expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,71,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getRightSquareBracketKeyword_0_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorIAccess().getDirect_declaratorIParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_declaratorI_3=ruledirect_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_declaratorI_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:2940:3: (kw= '[' kw= ']' this_direct_declaratorI_6= ruledirect_declaratorI )
                    {
                    // InternalAnsic.g:2940:3: (kw= '[' kw= ']' this_direct_declaratorI_6= ruledirect_declaratorI )
                    // InternalAnsic.g:2941:4: kw= '[' kw= ']' this_direct_declaratorI_6= ruledirect_declaratorI
                    {
                    kw=(Token)match(input,70,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,71,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getRightSquareBracketKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorIAccess().getDirect_declaratorIParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_declaratorI_6=ruledirect_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_declaratorI_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:2963:3: (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI )
                    {
                    // InternalAnsic.g:2963:3: (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI )
                    // InternalAnsic.g:2964:4: kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI
                    {
                    kw=(Token)match(input,68,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorIAccess().getParameter_type_listParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_parameter_type_list_8=ruleparameter_type_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_parameter_type_list_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getRightParenthesisKeyword_2_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorIAccess().getDirect_declaratorIParserRuleCall_2_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_declaratorI_10=ruledirect_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_declaratorI_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:2996:3: (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI )
                    {
                    // InternalAnsic.g:2996:3: (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI )
                    // InternalAnsic.g:2997:4: kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI
                    {
                    kw=(Token)match(input,68,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorIAccess().getIdentifier_listParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_identifier_list_12=ruleidentifier_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_identifier_list_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getRightParenthesisKeyword_3_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_declaratorIAccess().getDirect_declaratorIParserRuleCall_3_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_declaratorI_14=ruledirect_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_declaratorI_14);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAnsic.g:3029:3: (kw= '(' kw= ')' this_direct_declaratorI_17= ruledirect_declaratorI )?
                    {
                    // InternalAnsic.g:3029:3: (kw= '(' kw= ')' this_direct_declaratorI_17= ruledirect_declaratorI )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==68) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalAnsic.g:3030:4: kw= '(' kw= ')' this_direct_declaratorI_17= ruledirect_declaratorI
                            {
                            kw=(Token)match(input,68,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(kw);
                              				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getLeftParenthesisKeyword_4_0());
                              			
                            }
                            kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(kw);
                              				newLeafNode(kw, grammarAccess.getDirect_declaratorIAccess().getRightParenthesisKeyword_4_1());
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getDirect_declaratorIAccess().getDirect_declaratorIParserRuleCall_4_2());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_direct_declaratorI_17=ruledirect_declaratorI();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_direct_declaratorI_17);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledirect_declaratorI"


    // $ANTLR start "entryRulepointer"
    // InternalAnsic.g:3055:1: entryRulepointer returns [String current=null] : iv_rulepointer= rulepointer EOF ;
    public final String entryRulepointer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepointer = null;


        try {
            // InternalAnsic.g:3055:47: (iv_rulepointer= rulepointer EOF )
            // InternalAnsic.g:3056:2: iv_rulepointer= rulepointer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepointer=rulepointer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepointer.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepointer"


    // $ANTLR start "rulepointer"
    // InternalAnsic.g:3062:1: rulepointer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | (kw= '*' this_type_qualifier_list_2= ruletype_qualifier_list ) | (kw= '*' this_pointer_4= rulepointer ) | (kw= '*' this_type_qualifier_list_6= ruletype_qualifier_list this_pointer_7= rulepointer ) ) ;
    public final AntlrDatatypeRuleToken rulepointer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_type_qualifier_list_2 = null;

        AntlrDatatypeRuleToken this_pointer_4 = null;

        AntlrDatatypeRuleToken this_type_qualifier_list_6 = null;

        AntlrDatatypeRuleToken this_pointer_7 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3068:2: ( (kw= '*' | (kw= '*' this_type_qualifier_list_2= ruletype_qualifier_list ) | (kw= '*' this_pointer_4= rulepointer ) | (kw= '*' this_type_qualifier_list_6= ruletype_qualifier_list this_pointer_7= rulepointer ) ) )
            // InternalAnsic.g:3069:2: (kw= '*' | (kw= '*' this_type_qualifier_list_2= ruletype_qualifier_list ) | (kw= '*' this_pointer_4= rulepointer ) | (kw= '*' this_type_qualifier_list_6= ruletype_qualifier_list this_pointer_7= rulepointer ) )
            {
            // InternalAnsic.g:3069:2: (kw= '*' | (kw= '*' this_type_qualifier_list_2= ruletype_qualifier_list ) | (kw= '*' this_pointer_4= rulepointer ) | (kw= '*' this_type_qualifier_list_6= ruletype_qualifier_list this_pointer_7= rulepointer ) )
            int alt50=4;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalAnsic.g:3070:3: kw= '*'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPointerAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:3076:3: (kw= '*' this_type_qualifier_list_2= ruletype_qualifier_list )
                    {
                    // InternalAnsic.g:3076:3: (kw= '*' this_type_qualifier_list_2= ruletype_qualifier_list )
                    // InternalAnsic.g:3077:4: kw= '*' this_type_qualifier_list_2= ruletype_qualifier_list
                    {
                    kw=(Token)match(input,75,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPointerAccess().getAsteriskKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPointerAccess().getType_qualifier_listParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_type_qualifier_list_2=ruletype_qualifier_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_qualifier_list_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:3094:3: (kw= '*' this_pointer_4= rulepointer )
                    {
                    // InternalAnsic.g:3094:3: (kw= '*' this_pointer_4= rulepointer )
                    // InternalAnsic.g:3095:4: kw= '*' this_pointer_4= rulepointer
                    {
                    kw=(Token)match(input,75,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPointerAccess().getAsteriskKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPointerAccess().getPointerParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_pointer_4=rulepointer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_pointer_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:3112:3: (kw= '*' this_type_qualifier_list_6= ruletype_qualifier_list this_pointer_7= rulepointer )
                    {
                    // InternalAnsic.g:3112:3: (kw= '*' this_type_qualifier_list_6= ruletype_qualifier_list this_pointer_7= rulepointer )
                    // InternalAnsic.g:3113:4: kw= '*' this_type_qualifier_list_6= ruletype_qualifier_list this_pointer_7= rulepointer
                    {
                    kw=(Token)match(input,75,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPointerAccess().getAsteriskKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPointerAccess().getType_qualifier_listParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    this_type_qualifier_list_6=ruletype_qualifier_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_qualifier_list_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPointerAccess().getPointerParserRuleCall_3_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_pointer_7=rulepointer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_pointer_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepointer"


    // $ANTLR start "entryRuletype_qualifier_list"
    // InternalAnsic.g:3143:1: entryRuletype_qualifier_list returns [String current=null] : iv_ruletype_qualifier_list= ruletype_qualifier_list EOF ;
    public final String entryRuletype_qualifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_qualifier_list = null;


        try {
            // InternalAnsic.g:3143:59: (iv_ruletype_qualifier_list= ruletype_qualifier_list EOF )
            // InternalAnsic.g:3144:2: iv_ruletype_qualifier_list= ruletype_qualifier_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_qualifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype_qualifier_list=ruletype_qualifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_qualifier_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_qualifier_list"


    // $ANTLR start "ruletype_qualifier_list"
    // InternalAnsic.g:3150:1: ruletype_qualifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_type_qualifier_0= ruletype_qualifier )+ ;
    public final AntlrDatatypeRuleToken ruletype_qualifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_type_qualifier_0 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3156:2: ( (this_type_qualifier_0= ruletype_qualifier )+ )
            // InternalAnsic.g:3157:2: (this_type_qualifier_0= ruletype_qualifier )+
            {
            // InternalAnsic.g:3157:2: (this_type_qualifier_0= ruletype_qualifier )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_CONST && LA51_0<=RULE_VOLATILE)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalAnsic.g:3158:3: this_type_qualifier_0= ruletype_qualifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getType_qualifier_listAccess().getType_qualifierParserRuleCall());
            	      		
            	    }
            	    pushFollow(FOLLOW_40);
            	    this_type_qualifier_0=ruletype_qualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_type_qualifier_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_qualifier_list"


    // $ANTLR start "entryRuleparameter_type_list"
    // InternalAnsic.g:3172:1: entryRuleparameter_type_list returns [String current=null] : iv_ruleparameter_type_list= ruleparameter_type_list EOF ;
    public final String entryRuleparameter_type_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameter_type_list = null;


        try {
            // InternalAnsic.g:3172:59: (iv_ruleparameter_type_list= ruleparameter_type_list EOF )
            // InternalAnsic.g:3173:2: iv_ruleparameter_type_list= ruleparameter_type_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_type_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameter_type_list=ruleparameter_type_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_type_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_type_list"


    // $ANTLR start "ruleparameter_type_list"
    // InternalAnsic.g:3179:1: ruleparameter_type_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_parameter_list_0= ruleparameter_list (kw= ',' this_ELLIPSIS_2= RULE_ELLIPSIS )* ) ;
    public final AntlrDatatypeRuleToken ruleparameter_type_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ELLIPSIS_2=null;
        AntlrDatatypeRuleToken this_parameter_list_0 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3185:2: ( (this_parameter_list_0= ruleparameter_list (kw= ',' this_ELLIPSIS_2= RULE_ELLIPSIS )* ) )
            // InternalAnsic.g:3186:2: (this_parameter_list_0= ruleparameter_list (kw= ',' this_ELLIPSIS_2= RULE_ELLIPSIS )* )
            {
            // InternalAnsic.g:3186:2: (this_parameter_list_0= ruleparameter_list (kw= ',' this_ELLIPSIS_2= RULE_ELLIPSIS )* )
            // InternalAnsic.g:3187:3: this_parameter_list_0= ruleparameter_list (kw= ',' this_ELLIPSIS_2= RULE_ELLIPSIS )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameter_type_listAccess().getParameter_listParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_parameter_list_0=ruleparameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_parameter_list_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:3197:3: (kw= ',' this_ELLIPSIS_2= RULE_ELLIPSIS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==73) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAnsic.g:3198:4: kw= ',' this_ELLIPSIS_2= RULE_ELLIPSIS
            	    {
            	    kw=(Token)match(input,73,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getParameter_type_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_ELLIPSIS_2=(Token)match(input,RULE_ELLIPSIS,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ELLIPSIS_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ELLIPSIS_2, grammarAccess.getParameter_type_listAccess().getELLIPSISTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_type_list"


    // $ANTLR start "entryRuleparameter_list"
    // InternalAnsic.g:3215:1: entryRuleparameter_list returns [String current=null] : iv_ruleparameter_list= ruleparameter_list EOF ;
    public final String entryRuleparameter_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameter_list = null;


        try {
            // InternalAnsic.g:3215:54: (iv_ruleparameter_list= ruleparameter_list EOF )
            // InternalAnsic.g:3216:2: iv_ruleparameter_list= ruleparameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameter_list=ruleparameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_list"


    // $ANTLR start "ruleparameter_list"
    // InternalAnsic.g:3222:1: ruleparameter_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_parameter_declaration_0= ruleparameter_declaration (kw= ',' this_parameter_declaration_2= ruleparameter_declaration )* ) ;
    public final AntlrDatatypeRuleToken ruleparameter_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_parameter_declaration_0 = null;

        AntlrDatatypeRuleToken this_parameter_declaration_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3228:2: ( (this_parameter_declaration_0= ruleparameter_declaration (kw= ',' this_parameter_declaration_2= ruleparameter_declaration )* ) )
            // InternalAnsic.g:3229:2: (this_parameter_declaration_0= ruleparameter_declaration (kw= ',' this_parameter_declaration_2= ruleparameter_declaration )* )
            {
            // InternalAnsic.g:3229:2: (this_parameter_declaration_0= ruleparameter_declaration (kw= ',' this_parameter_declaration_2= ruleparameter_declaration )* )
            // InternalAnsic.g:3230:3: this_parameter_declaration_0= ruleparameter_declaration (kw= ',' this_parameter_declaration_2= ruleparameter_declaration )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameter_listAccess().getParameter_declarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_parameter_declaration_0=ruleparameter_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_parameter_declaration_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:3240:3: (kw= ',' this_parameter_declaration_2= ruleparameter_declaration )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==73) ) {
                    int LA53_1 = input.LA(2);

                    if ( ((LA53_1>=RULE_TYPEDEF && LA53_1<=RULE_VOLATILE)||LA53_1==RULE_ID||LA53_1==90) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalAnsic.g:3241:4: kw= ',' this_parameter_declaration_2= ruleparameter_declaration
            	    {
            	    kw=(Token)match(input,73,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getParameter_listAccess().getParameter_declarationParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_parameter_declaration_2=ruleparameter_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_parameter_declaration_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_list"


    // $ANTLR start "entryRuleparameter_declaration"
    // InternalAnsic.g:3261:1: entryRuleparameter_declaration returns [String current=null] : iv_ruleparameter_declaration= ruleparameter_declaration EOF ;
    public final String entryRuleparameter_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparameter_declaration = null;


        try {
            // InternalAnsic.g:3261:61: (iv_ruleparameter_declaration= ruleparameter_declaration EOF )
            // InternalAnsic.g:3262:2: iv_ruleparameter_declaration= ruleparameter_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameter_declaration=ruleparameter_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_declaration"


    // $ANTLR start "ruleparameter_declaration"
    // InternalAnsic.g:3268:1: ruleparameter_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator ) | (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator ) | this_declaration_specifiers_4= ruledeclaration_specifiers ) ;
    public final AntlrDatatypeRuleToken ruleparameter_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_specifiers_0 = null;

        AntlrDatatypeRuleToken this_declarator_1 = null;

        AntlrDatatypeRuleToken this_declaration_specifiers_2 = null;

        AntlrDatatypeRuleToken this_abstract_declarator_3 = null;

        AntlrDatatypeRuleToken this_declaration_specifiers_4 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3274:2: ( ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator ) | (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator ) | this_declaration_specifiers_4= ruledeclaration_specifiers ) )
            // InternalAnsic.g:3275:2: ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator ) | (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator ) | this_declaration_specifiers_4= ruledeclaration_specifiers )
            {
            // InternalAnsic.g:3275:2: ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator ) | (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator ) | this_declaration_specifiers_4= ruledeclaration_specifiers )
            int alt54=3;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalAnsic.g:3276:3: (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator )
                    {
                    // InternalAnsic.g:3276:3: (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator )
                    // InternalAnsic.g:3277:4: this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameter_declarationAccess().getDeclaration_specifiersParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_declaration_specifiers_0=ruledeclaration_specifiers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declaration_specifiers_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameter_declarationAccess().getDeclaratorParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_declarator_1=ruledeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declarator_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:3299:3: (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator )
                    {
                    // InternalAnsic.g:3299:3: (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator )
                    // InternalAnsic.g:3300:4: this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameter_declarationAccess().getDeclaration_specifiersParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_42);
                    this_declaration_specifiers_2=ruledeclaration_specifiers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declaration_specifiers_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameter_declarationAccess().getAbstract_declaratorParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_abstract_declarator_3=ruleabstract_declarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_abstract_declarator_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:3322:3: this_declaration_specifiers_4= ruledeclaration_specifiers
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameter_declarationAccess().getDeclaration_specifiersParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_declaration_specifiers_4=ruledeclaration_specifiers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_declaration_specifiers_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_declaration"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalAnsic.g:3336:1: entryRuleidentifier_list returns [String current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final String entryRuleidentifier_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleidentifier_list = null;


        try {
            // InternalAnsic.g:3336:55: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalAnsic.g:3337:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifier_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalAnsic.g:3343:1: ruleidentifier_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= ruleIDENTIFIER (kw= ',' this_IDENTIFIER_2= ruleIDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleidentifier_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_0 = null;

        AntlrDatatypeRuleToken this_IDENTIFIER_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3349:2: ( (this_IDENTIFIER_0= ruleIDENTIFIER (kw= ',' this_IDENTIFIER_2= ruleIDENTIFIER )* ) )
            // InternalAnsic.g:3350:2: (this_IDENTIFIER_0= ruleIDENTIFIER (kw= ',' this_IDENTIFIER_2= ruleIDENTIFIER )* )
            {
            // InternalAnsic.g:3350:2: (this_IDENTIFIER_0= ruleIDENTIFIER (kw= ',' this_IDENTIFIER_2= ruleIDENTIFIER )* )
            // InternalAnsic.g:3351:3: this_IDENTIFIER_0= ruleIDENTIFIER (kw= ',' this_IDENTIFIER_2= ruleIDENTIFIER )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIdentifier_listAccess().getIDENTIFIERParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_IDENTIFIER_0=ruleIDENTIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:3361:3: (kw= ',' this_IDENTIFIER_2= ruleIDENTIFIER )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==73) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAnsic.g:3362:4: kw= ',' this_IDENTIFIER_2= ruleIDENTIFIER
            	    {
            	    kw=(Token)match(input,73,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getIdentifier_listAccess().getIDENTIFIERParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_IDENTIFIER_2=ruleIDENTIFIER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENTIFIER_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuletype_name"
    // InternalAnsic.g:3382:1: entryRuletype_name returns [String current=null] : iv_ruletype_name= ruletype_name EOF ;
    public final String entryRuletype_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype_name = null;


        try {
            // InternalAnsic.g:3382:49: (iv_ruletype_name= ruletype_name EOF )
            // InternalAnsic.g:3383:2: iv_ruletype_name= ruletype_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_nameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype_name=ruletype_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_name.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_name"


    // $ANTLR start "ruletype_name"
    // InternalAnsic.g:3389:1: ruletype_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_specifier_qualifier_list_0= rulespecifier_qualifier_list (this_abstract_declarator_1= ruleabstract_declarator )? ) ;
    public final AntlrDatatypeRuleToken ruletype_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_specifier_qualifier_list_0 = null;

        AntlrDatatypeRuleToken this_abstract_declarator_1 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3395:2: ( (this_specifier_qualifier_list_0= rulespecifier_qualifier_list (this_abstract_declarator_1= ruleabstract_declarator )? ) )
            // InternalAnsic.g:3396:2: (this_specifier_qualifier_list_0= rulespecifier_qualifier_list (this_abstract_declarator_1= ruleabstract_declarator )? )
            {
            // InternalAnsic.g:3396:2: (this_specifier_qualifier_list_0= rulespecifier_qualifier_list (this_abstract_declarator_1= ruleabstract_declarator )? )
            // InternalAnsic.g:3397:3: this_specifier_qualifier_list_0= rulespecifier_qualifier_list (this_abstract_declarator_1= ruleabstract_declarator )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getType_nameAccess().getSpecifier_qualifier_listParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_specifier_qualifier_list_0=rulespecifier_qualifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_specifier_qualifier_list_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:3407:3: (this_abstract_declarator_1= ruleabstract_declarator )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==68||LA56_0==70||LA56_0==75) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAnsic.g:3408:4: this_abstract_declarator_1= ruleabstract_declarator
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getType_nameAccess().getAbstract_declaratorParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_abstract_declarator_1=ruleabstract_declarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_abstract_declarator_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_name"


    // $ANTLR start "entryRuleabstract_declarator"
    // InternalAnsic.g:3423:1: entryRuleabstract_declarator returns [String current=null] : iv_ruleabstract_declarator= ruleabstract_declarator EOF ;
    public final String entryRuleabstract_declarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleabstract_declarator = null;


        try {
            // InternalAnsic.g:3423:59: (iv_ruleabstract_declarator= ruleabstract_declarator EOF )
            // InternalAnsic.g:3424:2: iv_ruleabstract_declarator= ruleabstract_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstract_declaratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleabstract_declarator=ruleabstract_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleabstract_declarator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleabstract_declarator"


    // $ANTLR start "ruleabstract_declarator"
    // InternalAnsic.g:3430:1: ruleabstract_declarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_direct_abstract_declarator_0= ruledirect_abstract_declarator | (this_pointer_1= rulepointer (this_direct_abstract_declarator_2= ruledirect_abstract_declarator )? ) ) ;
    public final AntlrDatatypeRuleToken ruleabstract_declarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_direct_abstract_declarator_0 = null;

        AntlrDatatypeRuleToken this_pointer_1 = null;

        AntlrDatatypeRuleToken this_direct_abstract_declarator_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3436:2: ( (this_direct_abstract_declarator_0= ruledirect_abstract_declarator | (this_pointer_1= rulepointer (this_direct_abstract_declarator_2= ruledirect_abstract_declarator )? ) ) )
            // InternalAnsic.g:3437:2: (this_direct_abstract_declarator_0= ruledirect_abstract_declarator | (this_pointer_1= rulepointer (this_direct_abstract_declarator_2= ruledirect_abstract_declarator )? ) )
            {
            // InternalAnsic.g:3437:2: (this_direct_abstract_declarator_0= ruledirect_abstract_declarator | (this_pointer_1= rulepointer (this_direct_abstract_declarator_2= ruledirect_abstract_declarator )? ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==68||LA58_0==70) ) {
                alt58=1;
            }
            else if ( (LA58_0==75) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalAnsic.g:3438:3: this_direct_abstract_declarator_0= ruledirect_abstract_declarator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstract_declaratorAccess().getDirect_abstract_declaratorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declarator_0=ruledirect_abstract_declarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_direct_abstract_declarator_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:3449:3: (this_pointer_1= rulepointer (this_direct_abstract_declarator_2= ruledirect_abstract_declarator )? )
                    {
                    // InternalAnsic.g:3449:3: (this_pointer_1= rulepointer (this_direct_abstract_declarator_2= ruledirect_abstract_declarator )? )
                    // InternalAnsic.g:3450:4: this_pointer_1= rulepointer (this_direct_abstract_declarator_2= ruledirect_abstract_declarator )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstract_declaratorAccess().getPointerParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_44);
                    this_pointer_1=rulepointer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_pointer_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAnsic.g:3460:4: (this_direct_abstract_declarator_2= ruledirect_abstract_declarator )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==68||LA57_0==70) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalAnsic.g:3461:5: this_direct_abstract_declarator_2= ruledirect_abstract_declarator
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getAbstract_declaratorAccess().getDirect_abstract_declaratorParserRuleCall_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_direct_abstract_declarator_2=ruledirect_abstract_declarator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_direct_abstract_declarator_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleabstract_declarator"


    // $ANTLR start "entryRuledirect_abstract_declarator"
    // InternalAnsic.g:3477:1: entryRuledirect_abstract_declarator returns [String current=null] : iv_ruledirect_abstract_declarator= ruledirect_abstract_declarator EOF ;
    public final String entryRuledirect_abstract_declarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledirect_abstract_declarator = null;


        try {
            // InternalAnsic.g:3477:66: (iv_ruledirect_abstract_declarator= ruledirect_abstract_declarator EOF )
            // InternalAnsic.g:3478:2: iv_ruledirect_abstract_declarator= ruledirect_abstract_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirect_abstract_declaratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledirect_abstract_declarator=ruledirect_abstract_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledirect_abstract_declarator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledirect_abstract_declarator"


    // $ANTLR start "ruledirect_abstract_declarator"
    // InternalAnsic.g:3484:1: ruledirect_abstract_declarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_abstract_declarator_1= ruleabstract_declarator kw= ')' this_direct_abstract_declaratorI_3= ruledirect_abstract_declaratorI ) | (kw= '[' kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI ) | (kw= '[' this_constant_expression_8= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_10= ruledirect_abstract_declaratorI ) | (kw= '(' kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI ) | (kw= '(' this_parameter_type_list_15= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_17= ruledirect_abstract_declaratorI ) ) ;
    public final AntlrDatatypeRuleToken ruledirect_abstract_declarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_abstract_declarator_1 = null;

        AntlrDatatypeRuleToken this_direct_abstract_declaratorI_3 = null;

        AntlrDatatypeRuleToken this_direct_abstract_declaratorI_6 = null;

        AntlrDatatypeRuleToken this_constant_expression_8 = null;

        AntlrDatatypeRuleToken this_direct_abstract_declaratorI_10 = null;

        AntlrDatatypeRuleToken this_direct_abstract_declaratorI_13 = null;

        AntlrDatatypeRuleToken this_parameter_type_list_15 = null;

        AntlrDatatypeRuleToken this_direct_abstract_declaratorI_17 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3490:2: ( ( (kw= '(' this_abstract_declarator_1= ruleabstract_declarator kw= ')' this_direct_abstract_declaratorI_3= ruledirect_abstract_declaratorI ) | (kw= '[' kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI ) | (kw= '[' this_constant_expression_8= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_10= ruledirect_abstract_declaratorI ) | (kw= '(' kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI ) | (kw= '(' this_parameter_type_list_15= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_17= ruledirect_abstract_declaratorI ) ) )
            // InternalAnsic.g:3491:2: ( (kw= '(' this_abstract_declarator_1= ruleabstract_declarator kw= ')' this_direct_abstract_declaratorI_3= ruledirect_abstract_declaratorI ) | (kw= '[' kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI ) | (kw= '[' this_constant_expression_8= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_10= ruledirect_abstract_declaratorI ) | (kw= '(' kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI ) | (kw= '(' this_parameter_type_list_15= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_17= ruledirect_abstract_declaratorI ) )
            {
            // InternalAnsic.g:3491:2: ( (kw= '(' this_abstract_declarator_1= ruleabstract_declarator kw= ')' this_direct_abstract_declaratorI_3= ruledirect_abstract_declaratorI ) | (kw= '[' kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI ) | (kw= '[' this_constant_expression_8= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_10= ruledirect_abstract_declaratorI ) | (kw= '(' kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI ) | (kw= '(' this_parameter_type_list_15= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_17= ruledirect_abstract_declaratorI ) )
            int alt59=5;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==68) ) {
                switch ( input.LA(2) ) {
                case RULE_TYPEDEF:
                case RULE_EXTERN:
                case RULE_STATIC:
                case RULE_AUTO:
                case RULE_REGISTER:
                case RULE_VOID:
                case RULE_SHORT:
                case RULE_INT:
                case RULE_LONG:
                case RULE_FLOAT:
                case RULE_DOUBLE:
                case RULE_SIGNED:
                case RULE_UNSIGNED:
                case RULE_STRUCT:
                case RULE_UNION:
                case RULE_ENUM:
                case RULE_CONST:
                case RULE_VOLATILE:
                case RULE_ID:
                case 90:
                    {
                    alt59=5;
                    }
                    break;
                case 68:
                case 70:
                case 75:
                    {
                    alt59=1;
                    }
                    break;
                case 69:
                    {
                    alt59=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA59_0==70) ) {
                int LA59_2 = input.LA(2);

                if ( ((LA59_2>=RULE_INC_OP && LA59_2<=RULE_SIZEOF)||(LA59_2>=RULE_ID && LA59_2<=RULE_D)||LA59_2==68||LA59_2==72||(LA59_2>=74 && LA59_2<=79)) ) {
                    alt59=3;
                }
                else if ( (LA59_2==71) ) {
                    alt59=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalAnsic.g:3492:3: (kw= '(' this_abstract_declarator_1= ruleabstract_declarator kw= ')' this_direct_abstract_declaratorI_3= ruledirect_abstract_declaratorI )
                    {
                    // InternalAnsic.g:3492:3: (kw= '(' this_abstract_declarator_1= ruleabstract_declarator kw= ')' this_direct_abstract_declaratorI_3= ruledirect_abstract_declaratorI )
                    // InternalAnsic.g:3493:4: kw= '(' this_abstract_declarator_1= ruleabstract_declarator kw= ')' this_direct_abstract_declaratorI_3= ruledirect_abstract_declaratorI
                    {
                    kw=(Token)match(input,68,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorAccess().getAbstract_declaratorParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_abstract_declarator_1=ruleabstract_declarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_abstract_declarator_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getRightParenthesisKeyword_0_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorAccess().getDirect_abstract_declaratorIParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declaratorI_3=ruledirect_abstract_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_abstract_declaratorI_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:3525:3: (kw= '[' kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI )
                    {
                    // InternalAnsic.g:3525:3: (kw= '[' kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI )
                    // InternalAnsic.g:3526:4: kw= '[' kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI
                    {
                    kw=(Token)match(input,70,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,71,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getRightSquareBracketKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorAccess().getDirect_abstract_declaratorIParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declaratorI_6=ruledirect_abstract_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_abstract_declaratorI_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:3548:3: (kw= '[' this_constant_expression_8= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_10= ruledirect_abstract_declaratorI )
                    {
                    // InternalAnsic.g:3548:3: (kw= '[' this_constant_expression_8= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_10= ruledirect_abstract_declaratorI )
                    // InternalAnsic.g:3549:4: kw= '[' this_constant_expression_8= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_10= ruledirect_abstract_declaratorI
                    {
                    kw=(Token)match(input,70,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorAccess().getConstant_expressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_constant_expression_8=ruleconstant_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_constant_expression_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,71,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getRightSquareBracketKeyword_2_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorAccess().getDirect_abstract_declaratorIParserRuleCall_2_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declaratorI_10=ruledirect_abstract_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_abstract_declaratorI_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:3581:3: (kw= '(' kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI )
                    {
                    // InternalAnsic.g:3581:3: (kw= '(' kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI )
                    // InternalAnsic.g:3582:4: kw= '(' kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI
                    {
                    kw=(Token)match(input,68,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getRightParenthesisKeyword_3_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorAccess().getDirect_abstract_declaratorIParserRuleCall_3_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declaratorI_13=ruledirect_abstract_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_abstract_declaratorI_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAnsic.g:3604:3: (kw= '(' this_parameter_type_list_15= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_17= ruledirect_abstract_declaratorI )
                    {
                    // InternalAnsic.g:3604:3: (kw= '(' this_parameter_type_list_15= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_17= ruledirect_abstract_declaratorI )
                    // InternalAnsic.g:3605:4: kw= '(' this_parameter_type_list_15= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_17= ruledirect_abstract_declaratorI
                    {
                    kw=(Token)match(input,68,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorAccess().getParameter_type_listParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_parameter_type_list_15=ruleparameter_type_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_parameter_type_list_15);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorAccess().getRightParenthesisKeyword_4_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorAccess().getDirect_abstract_declaratorIParserRuleCall_4_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declaratorI_17=ruledirect_abstract_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_abstract_declaratorI_17);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledirect_abstract_declarator"


    // $ANTLR start "entryRuledirect_abstract_declaratorI"
    // InternalAnsic.g:3640:1: entryRuledirect_abstract_declaratorI returns [String current=null] : iv_ruledirect_abstract_declaratorI= ruledirect_abstract_declaratorI EOF ;
    public final String entryRuledirect_abstract_declaratorI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledirect_abstract_declaratorI = null;


        try {
            // InternalAnsic.g:3640:67: (iv_ruledirect_abstract_declaratorI= ruledirect_abstract_declaratorI EOF )
            // InternalAnsic.g:3641:2: iv_ruledirect_abstract_declaratorI= ruledirect_abstract_declaratorI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirect_abstract_declaratorIRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledirect_abstract_declaratorI=ruledirect_abstract_declaratorI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledirect_abstract_declaratorI.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledirect_abstract_declaratorI"


    // $ANTLR start "ruledirect_abstract_declaratorI"
    // InternalAnsic.g:3647:1: ruledirect_abstract_declaratorI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' kw= ']' this_direct_abstract_declaratorI_2= ruledirect_abstract_declaratorI ) | (kw= '[' this_constant_expression_4= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI ) | (kw= '(' kw= ')' this_direct_abstract_declaratorI_9= ruledirect_abstract_declaratorI ) | (kw= '(' this_parameter_type_list_11= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI ) ) ;
    public final AntlrDatatypeRuleToken ruledirect_abstract_declaratorI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_direct_abstract_declaratorI_2 = null;

        AntlrDatatypeRuleToken this_constant_expression_4 = null;

        AntlrDatatypeRuleToken this_direct_abstract_declaratorI_6 = null;

        AntlrDatatypeRuleToken this_direct_abstract_declaratorI_9 = null;

        AntlrDatatypeRuleToken this_parameter_type_list_11 = null;

        AntlrDatatypeRuleToken this_direct_abstract_declaratorI_13 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3653:2: ( ( (kw= '[' kw= ']' this_direct_abstract_declaratorI_2= ruledirect_abstract_declaratorI ) | (kw= '[' this_constant_expression_4= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI ) | (kw= '(' kw= ')' this_direct_abstract_declaratorI_9= ruledirect_abstract_declaratorI ) | (kw= '(' this_parameter_type_list_11= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI ) ) )
            // InternalAnsic.g:3654:2: ( (kw= '[' kw= ']' this_direct_abstract_declaratorI_2= ruledirect_abstract_declaratorI ) | (kw= '[' this_constant_expression_4= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI ) | (kw= '(' kw= ')' this_direct_abstract_declaratorI_9= ruledirect_abstract_declaratorI ) | (kw= '(' this_parameter_type_list_11= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI ) )
            {
            // InternalAnsic.g:3654:2: ( (kw= '[' kw= ']' this_direct_abstract_declaratorI_2= ruledirect_abstract_declaratorI ) | (kw= '[' this_constant_expression_4= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI ) | (kw= '(' kw= ')' this_direct_abstract_declaratorI_9= ruledirect_abstract_declaratorI ) | (kw= '(' this_parameter_type_list_11= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI ) )
            int alt60=4;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==70) ) {
                int LA60_1 = input.LA(2);

                if ( ((LA60_1>=RULE_INC_OP && LA60_1<=RULE_SIZEOF)||(LA60_1>=RULE_ID && LA60_1<=RULE_D)||LA60_1==68||LA60_1==72||(LA60_1>=74 && LA60_1<=79)) ) {
                    alt60=2;
                }
                else if ( (LA60_1==71) ) {
                    alt60=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA60_0==68) ) {
                int LA60_2 = input.LA(2);

                if ( ((LA60_2>=RULE_TYPEDEF && LA60_2<=RULE_VOLATILE)||LA60_2==RULE_ID||LA60_2==90) ) {
                    alt60=4;
                }
                else if ( (LA60_2==69) ) {
                    alt60=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalAnsic.g:3655:3: (kw= '[' kw= ']' this_direct_abstract_declaratorI_2= ruledirect_abstract_declaratorI )
                    {
                    // InternalAnsic.g:3655:3: (kw= '[' kw= ']' this_direct_abstract_declaratorI_2= ruledirect_abstract_declaratorI )
                    // InternalAnsic.g:3656:4: kw= '[' kw= ']' this_direct_abstract_declaratorI_2= ruledirect_abstract_declaratorI
                    {
                    kw=(Token)match(input,70,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorIAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    kw=(Token)match(input,71,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorIAccess().getRightSquareBracketKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorIAccess().getDirect_abstract_declaratorIParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declaratorI_2=ruledirect_abstract_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_abstract_declaratorI_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:3678:3: (kw= '[' this_constant_expression_4= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI )
                    {
                    // InternalAnsic.g:3678:3: (kw= '[' this_constant_expression_4= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI )
                    // InternalAnsic.g:3679:4: kw= '[' this_constant_expression_4= ruleconstant_expression kw= ']' this_direct_abstract_declaratorI_6= ruledirect_abstract_declaratorI
                    {
                    kw=(Token)match(input,70,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorIAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorIAccess().getConstant_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_constant_expression_4=ruleconstant_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_constant_expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,71,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorIAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorIAccess().getDirect_abstract_declaratorIParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declaratorI_6=ruledirect_abstract_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_abstract_declaratorI_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:3711:3: (kw= '(' kw= ')' this_direct_abstract_declaratorI_9= ruledirect_abstract_declaratorI )
                    {
                    // InternalAnsic.g:3711:3: (kw= '(' kw= ')' this_direct_abstract_declaratorI_9= ruledirect_abstract_declaratorI )
                    // InternalAnsic.g:3712:4: kw= '(' kw= ')' this_direct_abstract_declaratorI_9= ruledirect_abstract_declaratorI
                    {
                    kw=(Token)match(input,68,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorIAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorIAccess().getRightParenthesisKeyword_2_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorIAccess().getDirect_abstract_declaratorIParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declaratorI_9=ruledirect_abstract_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_abstract_declaratorI_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:3734:3: (kw= '(' this_parameter_type_list_11= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI )
                    {
                    // InternalAnsic.g:3734:3: (kw= '(' this_parameter_type_list_11= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI )
                    // InternalAnsic.g:3735:4: kw= '(' this_parameter_type_list_11= ruleparameter_type_list kw= ')' this_direct_abstract_declaratorI_13= ruledirect_abstract_declaratorI
                    {
                    kw=(Token)match(input,68,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorIAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorIAccess().getParameter_type_listParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_parameter_type_list_11=ruleparameter_type_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_parameter_type_list_11);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDirect_abstract_declaratorIAccess().getRightParenthesisKeyword_3_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDirect_abstract_declaratorIAccess().getDirect_abstract_declaratorIParserRuleCall_3_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_direct_abstract_declaratorI_13=ruledirect_abstract_declaratorI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_direct_abstract_declaratorI_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledirect_abstract_declaratorI"


    // $ANTLR start "entryRuleinitializer"
    // InternalAnsic.g:3770:1: entryRuleinitializer returns [String current=null] : iv_ruleinitializer= ruleinitializer EOF ;
    public final String entryRuleinitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinitializer = null;


        try {
            // InternalAnsic.g:3770:51: (iv_ruleinitializer= ruleinitializer EOF )
            // InternalAnsic.g:3771:2: iv_ruleinitializer= ruleinitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinitializer=ruleinitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinitializer.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinitializer"


    // $ANTLR start "ruleinitializer"
    // InternalAnsic.g:3777:1: ruleinitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_assignment_expression_0= ruleassignment_expression | (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' ) | (kw= '{' this_initializer_list_5= ruleinitializer_list kw= ',' kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleinitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_assignment_expression_0 = null;

        AntlrDatatypeRuleToken this_initializer_list_2 = null;

        AntlrDatatypeRuleToken this_initializer_list_5 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3783:2: ( (this_assignment_expression_0= ruleassignment_expression | (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' ) | (kw= '{' this_initializer_list_5= ruleinitializer_list kw= ',' kw= '}' ) ) )
            // InternalAnsic.g:3784:2: (this_assignment_expression_0= ruleassignment_expression | (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' ) | (kw= '{' this_initializer_list_5= ruleinitializer_list kw= ',' kw= '}' ) )
            {
            // InternalAnsic.g:3784:2: (this_assignment_expression_0= ruleassignment_expression | (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' ) | (kw= '{' this_initializer_list_5= ruleinitializer_list kw= ',' kw= '}' ) )
            int alt61=3;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalAnsic.g:3785:3: this_assignment_expression_0= ruleassignment_expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInitializerAccess().getAssignment_expressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_assignment_expression_0=ruleassignment_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_assignment_expression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:3796:3: (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' )
                    {
                    // InternalAnsic.g:3796:3: (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' )
                    // InternalAnsic.g:3797:4: kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}'
                    {
                    kw=(Token)match(input,91,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getInitializerAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getInitializerAccess().getInitializer_listParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_initializer_list_2=ruleinitializer_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_initializer_list_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getInitializerAccess().getRightCurlyBracketKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:3819:3: (kw= '{' this_initializer_list_5= ruleinitializer_list kw= ',' kw= '}' )
                    {
                    // InternalAnsic.g:3819:3: (kw= '{' this_initializer_list_5= ruleinitializer_list kw= ',' kw= '}' )
                    // InternalAnsic.g:3820:4: kw= '{' this_initializer_list_5= ruleinitializer_list kw= ',' kw= '}'
                    {
                    kw=(Token)match(input,91,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getInitializerAccess().getLeftCurlyBracketKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getInitializerAccess().getInitializer_listParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_initializer_list_5=ruleinitializer_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_initializer_list_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,73,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getInitializerAccess().getCommaKeyword_2_2());
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getInitializerAccess().getRightCurlyBracketKeyword_2_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinitializer"


    // $ANTLR start "entryRuleinitializer_list"
    // InternalAnsic.g:3850:1: entryRuleinitializer_list returns [String current=null] : iv_ruleinitializer_list= ruleinitializer_list EOF ;
    public final String entryRuleinitializer_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinitializer_list = null;


        try {
            // InternalAnsic.g:3850:56: (iv_ruleinitializer_list= ruleinitializer_list EOF )
            // InternalAnsic.g:3851:2: iv_ruleinitializer_list= ruleinitializer_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializer_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinitializer_list=ruleinitializer_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinitializer_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinitializer_list"


    // $ANTLR start "ruleinitializer_list"
    // InternalAnsic.g:3857:1: ruleinitializer_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_initializer_0= ruleinitializer (kw= ',' this_initializer_2= ruleinitializer )* ) ;
    public final AntlrDatatypeRuleToken ruleinitializer_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_initializer_0 = null;

        AntlrDatatypeRuleToken this_initializer_2 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3863:2: ( (this_initializer_0= ruleinitializer (kw= ',' this_initializer_2= ruleinitializer )* ) )
            // InternalAnsic.g:3864:2: (this_initializer_0= ruleinitializer (kw= ',' this_initializer_2= ruleinitializer )* )
            {
            // InternalAnsic.g:3864:2: (this_initializer_0= ruleinitializer (kw= ',' this_initializer_2= ruleinitializer )* )
            // InternalAnsic.g:3865:3: this_initializer_0= ruleinitializer (kw= ',' this_initializer_2= ruleinitializer )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getInitializer_listAccess().getInitializerParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_initializer_0=ruleinitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_initializer_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAnsic.g:3875:3: (kw= ',' this_initializer_2= ruleinitializer )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==73) ) {
                    int LA62_2 = input.LA(2);

                    if ( ((LA62_2>=RULE_INC_OP && LA62_2<=RULE_SIZEOF)||(LA62_2>=RULE_ID && LA62_2<=RULE_D)||LA62_2==68||LA62_2==72||(LA62_2>=74 && LA62_2<=79)||LA62_2==91) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // InternalAnsic.g:3876:4: kw= ',' this_initializer_2= ruleinitializer
            	    {
            	    kw=(Token)match(input,73,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getInitializer_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInitializer_listAccess().getInitializerParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_initializer_2=ruleinitializer();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_initializer_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinitializer_list"


    // $ANTLR start "entryRulestatement"
    // InternalAnsic.g:3896:1: entryRulestatement returns [String current=null] : iv_rulestatement= rulestatement EOF ;
    public final String entryRulestatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement = null;


        try {
            // InternalAnsic.g:3896:49: (iv_rulestatement= rulestatement EOF )
            // InternalAnsic.g:3897:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalAnsic.g:3903:1: rulestatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_labeled_statement_0= rulelabeled_statement | this_compound_statement_1= rulecompound_statement | this_expression_statement_2= ruleexpression_statement | this_selection_statement_3= ruleselection_statement | this_iteration_statement_4= ruleiteration_statement | this_jump_statement_5= rulejump_statement ) ;
    public final AntlrDatatypeRuleToken rulestatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_labeled_statement_0 = null;

        AntlrDatatypeRuleToken this_compound_statement_1 = null;

        AntlrDatatypeRuleToken this_expression_statement_2 = null;

        AntlrDatatypeRuleToken this_selection_statement_3 = null;

        AntlrDatatypeRuleToken this_iteration_statement_4 = null;

        AntlrDatatypeRuleToken this_jump_statement_5 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3909:2: ( (this_labeled_statement_0= rulelabeled_statement | this_compound_statement_1= rulecompound_statement | this_expression_statement_2= ruleexpression_statement | this_selection_statement_3= ruleselection_statement | this_iteration_statement_4= ruleiteration_statement | this_jump_statement_5= rulejump_statement ) )
            // InternalAnsic.g:3910:2: (this_labeled_statement_0= rulelabeled_statement | this_compound_statement_1= rulecompound_statement | this_expression_statement_2= ruleexpression_statement | this_selection_statement_3= ruleselection_statement | this_iteration_statement_4= ruleiteration_statement | this_jump_statement_5= rulejump_statement )
            {
            // InternalAnsic.g:3910:2: (this_labeled_statement_0= rulelabeled_statement | this_compound_statement_1= rulecompound_statement | this_expression_statement_2= ruleexpression_statement | this_selection_statement_3= ruleselection_statement | this_iteration_statement_4= ruleiteration_statement | this_jump_statement_5= rulejump_statement )
            int alt63=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==87) ) {
                    alt63=1;
                }
                else if ( ((LA63_1>=RULE_PTR_OP && LA63_1<=RULE_DEC_OP)||(LA63_1>=RULE_LEFT_OP && LA63_1<=RULE_OR_ASSIGN)||LA63_1==68||LA63_1==70||(LA63_1>=72 && LA63_1<=77)||(LA63_1>=80 && LA63_1<=86)||(LA63_1>=88 && LA63_1<=89)) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CASE:
            case RULE_DEFAULT:
                {
                alt63=1;
                }
                break;
            case 91:
                {
                alt63=2;
                }
                break;
            case RULE_INC_OP:
            case RULE_DEC_OP:
            case RULE_SIZEOF:
            case RULE_STRING:
            case RULE_D:
            case 68:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 89:
                {
                alt63=3;
                }
                break;
            case RULE_IF:
            case RULE_SWITCH:
                {
                alt63=4;
                }
                break;
            case RULE_WHILE:
            case RULE_DO:
            case RULE_FOR:
                {
                alt63=5;
                }
                break;
            case RULE_GOTO:
            case RULE_CONTINUE:
            case RULE_BREAK:
            case RULE_RETURNO:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalAnsic.g:3911:3: this_labeled_statement_0= rulelabeled_statement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLabeled_statementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_labeled_statement_0=rulelabeled_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_labeled_statement_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:3922:3: this_compound_statement_1= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getCompound_statementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_compound_statement_1=rulecompound_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_compound_statement_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:3933:3: this_expression_statement_2= ruleexpression_statement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getExpression_statementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_statement_2=ruleexpression_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_expression_statement_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:3944:3: this_selection_statement_3= ruleselection_statement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSelection_statementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_selection_statement_3=ruleselection_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_selection_statement_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAnsic.g:3955:3: this_iteration_statement_4= ruleiteration_statement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIteration_statementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_iteration_statement_4=ruleiteration_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_iteration_statement_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAnsic.g:3966:3: this_jump_statement_5= rulejump_statement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getJump_statementParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_jump_statement_5=rulejump_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_jump_statement_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelabeled_statement"
    // InternalAnsic.g:3980:1: entryRulelabeled_statement returns [String current=null] : iv_rulelabeled_statement= rulelabeled_statement EOF ;
    public final String entryRulelabeled_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelabeled_statement = null;


        try {
            // InternalAnsic.g:3980:57: (iv_rulelabeled_statement= rulelabeled_statement EOF )
            // InternalAnsic.g:3981:2: iv_rulelabeled_statement= rulelabeled_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeled_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelabeled_statement=rulelabeled_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelabeled_statement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabeled_statement"


    // $ANTLR start "rulelabeled_statement"
    // InternalAnsic.g:3987:1: rulelabeled_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFIER_0= ruleIDENTIFIER kw= ':' this_statement_2= rulestatement ) | (this_CASE_3= RULE_CASE this_constant_expression_4= ruleconstant_expression kw= ':' this_statement_6= rulestatement ) | (this_DEFAULT_7= RULE_DEFAULT kw= ':' this_statement_9= rulestatement ) ) ;
    public final AntlrDatatypeRuleToken rulelabeled_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_CASE_3=null;
        Token this_DEFAULT_7=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_0 = null;

        AntlrDatatypeRuleToken this_statement_2 = null;

        AntlrDatatypeRuleToken this_constant_expression_4 = null;

        AntlrDatatypeRuleToken this_statement_6 = null;

        AntlrDatatypeRuleToken this_statement_9 = null;



        	enterRule();

        try {
            // InternalAnsic.g:3993:2: ( ( (this_IDENTIFIER_0= ruleIDENTIFIER kw= ':' this_statement_2= rulestatement ) | (this_CASE_3= RULE_CASE this_constant_expression_4= ruleconstant_expression kw= ':' this_statement_6= rulestatement ) | (this_DEFAULT_7= RULE_DEFAULT kw= ':' this_statement_9= rulestatement ) ) )
            // InternalAnsic.g:3994:2: ( (this_IDENTIFIER_0= ruleIDENTIFIER kw= ':' this_statement_2= rulestatement ) | (this_CASE_3= RULE_CASE this_constant_expression_4= ruleconstant_expression kw= ':' this_statement_6= rulestatement ) | (this_DEFAULT_7= RULE_DEFAULT kw= ':' this_statement_9= rulestatement ) )
            {
            // InternalAnsic.g:3994:2: ( (this_IDENTIFIER_0= ruleIDENTIFIER kw= ':' this_statement_2= rulestatement ) | (this_CASE_3= RULE_CASE this_constant_expression_4= ruleconstant_expression kw= ':' this_statement_6= rulestatement ) | (this_DEFAULT_7= RULE_DEFAULT kw= ':' this_statement_9= rulestatement ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt64=1;
                }
                break;
            case RULE_CASE:
                {
                alt64=2;
                }
                break;
            case RULE_DEFAULT:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalAnsic.g:3995:3: (this_IDENTIFIER_0= ruleIDENTIFIER kw= ':' this_statement_2= rulestatement )
                    {
                    // InternalAnsic.g:3995:3: (this_IDENTIFIER_0= ruleIDENTIFIER kw= ':' this_statement_2= rulestatement )
                    // InternalAnsic.g:3996:4: this_IDENTIFIER_0= ruleIDENTIFIER kw= ':' this_statement_2= rulestatement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLabeled_statementAccess().getIDENTIFIERParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_IDENTIFIER_0=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,87,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLabeled_statementAccess().getColonKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLabeled_statementAccess().getStatementParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_statement_2=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:4023:3: (this_CASE_3= RULE_CASE this_constant_expression_4= ruleconstant_expression kw= ':' this_statement_6= rulestatement )
                    {
                    // InternalAnsic.g:4023:3: (this_CASE_3= RULE_CASE this_constant_expression_4= ruleconstant_expression kw= ':' this_statement_6= rulestatement )
                    // InternalAnsic.g:4024:4: this_CASE_3= RULE_CASE this_constant_expression_4= ruleconstant_expression kw= ':' this_statement_6= rulestatement
                    {
                    this_CASE_3=(Token)match(input,RULE_CASE,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_CASE_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CASE_3, grammarAccess.getLabeled_statementAccess().getCASETerminalRuleCall_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLabeled_statementAccess().getConstant_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_constant_expression_4=ruleconstant_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_constant_expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,87,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLabeled_statementAccess().getColonKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLabeled_statementAccess().getStatementParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_statement_6=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:4058:3: (this_DEFAULT_7= RULE_DEFAULT kw= ':' this_statement_9= rulestatement )
                    {
                    // InternalAnsic.g:4058:3: (this_DEFAULT_7= RULE_DEFAULT kw= ':' this_statement_9= rulestatement )
                    // InternalAnsic.g:4059:4: this_DEFAULT_7= RULE_DEFAULT kw= ':' this_statement_9= rulestatement
                    {
                    this_DEFAULT_7=(Token)match(input,RULE_DEFAULT,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DEFAULT_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DEFAULT_7, grammarAccess.getLabeled_statementAccess().getDEFAULTTerminalRuleCall_2_0());
                      			
                    }
                    kw=(Token)match(input,87,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLabeled_statementAccess().getColonKeyword_2_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLabeled_statementAccess().getStatementParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_statement_9=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabeled_statement"


    // $ANTLR start "entryRulecompound_statement"
    // InternalAnsic.g:4086:1: entryRulecompound_statement returns [String current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final String entryRulecompound_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecompound_statement = null;


        try {
            // InternalAnsic.g:4086:58: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalAnsic.g:4087:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompound_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompound_statement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalAnsic.g:4093:1: rulecompound_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' kw= '}' ) | (kw= '{' this_statement_list_3= rulestatement_list kw= '}' ) | (kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}' ) | (kw= '{' this_declaration_list_9= ruledeclaration_list this_statement_list_10= rulestatement_list kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken rulecompound_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_statement_list_3 = null;

        AntlrDatatypeRuleToken this_declaration_list_6 = null;

        AntlrDatatypeRuleToken this_declaration_list_9 = null;

        AntlrDatatypeRuleToken this_statement_list_10 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4099:2: ( ( (kw= '{' kw= '}' ) | (kw= '{' this_statement_list_3= rulestatement_list kw= '}' ) | (kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}' ) | (kw= '{' this_declaration_list_9= ruledeclaration_list this_statement_list_10= rulestatement_list kw= '}' ) ) )
            // InternalAnsic.g:4100:2: ( (kw= '{' kw= '}' ) | (kw= '{' this_statement_list_3= rulestatement_list kw= '}' ) | (kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}' ) | (kw= '{' this_declaration_list_9= ruledeclaration_list this_statement_list_10= rulestatement_list kw= '}' ) )
            {
            // InternalAnsic.g:4100:2: ( (kw= '{' kw= '}' ) | (kw= '{' this_statement_list_3= rulestatement_list kw= '}' ) | (kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}' ) | (kw= '{' this_declaration_list_9= ruledeclaration_list this_statement_list_10= rulestatement_list kw= '}' ) )
            int alt65=4;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==91) ) {
                int LA65_1 = input.LA(2);

                if ( (synpred128_InternalAnsic()) ) {
                    alt65=1;
                }
                else if ( (synpred129_InternalAnsic()) ) {
                    alt65=2;
                }
                else if ( (synpred130_InternalAnsic()) ) {
                    alt65=3;
                }
                else if ( (true) ) {
                    alt65=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAnsic.g:4101:3: (kw= '{' kw= '}' )
                    {
                    // InternalAnsic.g:4101:3: (kw= '{' kw= '}' )
                    // InternalAnsic.g:4102:4: kw= '{' kw= '}'
                    {
                    kw=(Token)match(input,91,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCompound_statementAccess().getLeftCurlyBracketKeyword_0_0());
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCompound_statementAccess().getRightCurlyBracketKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:4114:3: (kw= '{' this_statement_list_3= rulestatement_list kw= '}' )
                    {
                    // InternalAnsic.g:4114:3: (kw= '{' this_statement_list_3= rulestatement_list kw= '}' )
                    // InternalAnsic.g:4115:4: kw= '{' this_statement_list_3= rulestatement_list kw= '}'
                    {
                    kw=(Token)match(input,91,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCompound_statementAccess().getLeftCurlyBracketKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCompound_statementAccess().getStatement_listParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_statement_list_3=rulestatement_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_list_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCompound_statementAccess().getRightCurlyBracketKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:4137:3: (kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}' )
                    {
                    // InternalAnsic.g:4137:3: (kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}' )
                    // InternalAnsic.g:4138:4: kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}'
                    {
                    kw=(Token)match(input,91,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCompound_statementAccess().getLeftCurlyBracketKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCompound_statementAccess().getDeclaration_listParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_declaration_list_6=ruledeclaration_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declaration_list_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCompound_statementAccess().getRightCurlyBracketKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:4160:3: (kw= '{' this_declaration_list_9= ruledeclaration_list this_statement_list_10= rulestatement_list kw= '}' )
                    {
                    // InternalAnsic.g:4160:3: (kw= '{' this_declaration_list_9= ruledeclaration_list this_statement_list_10= rulestatement_list kw= '}' )
                    // InternalAnsic.g:4161:4: kw= '{' this_declaration_list_9= ruledeclaration_list this_statement_list_10= rulestatement_list kw= '}'
                    {
                    kw=(Token)match(input,91,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCompound_statementAccess().getLeftCurlyBracketKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCompound_statementAccess().getDeclaration_listParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_45);
                    this_declaration_list_9=ruledeclaration_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declaration_list_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCompound_statementAccess().getStatement_listParserRuleCall_3_2());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_statement_list_10=rulestatement_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_list_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCompound_statementAccess().getRightCurlyBracketKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRuledeclaration_list"
    // InternalAnsic.g:4196:1: entryRuledeclaration_list returns [String current=null] : iv_ruledeclaration_list= ruledeclaration_list EOF ;
    public final String entryRuledeclaration_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledeclaration_list = null;


        try {
            // InternalAnsic.g:4196:56: (iv_ruledeclaration_list= ruledeclaration_list EOF )
            // InternalAnsic.g:4197:2: iv_ruledeclaration_list= ruledeclaration_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaration_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledeclaration_list=ruledeclaration_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeclaration_list"


    // $ANTLR start "ruledeclaration_list"
    // InternalAnsic.g:4203:1: ruledeclaration_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_declaration_0= ruledeclaration )+ ;
    public final AntlrDatatypeRuleToken ruledeclaration_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_0 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4209:2: ( (this_declaration_0= ruledeclaration )+ )
            // InternalAnsic.g:4210:2: (this_declaration_0= ruledeclaration )+
            {
            // InternalAnsic.g:4210:2: (this_declaration_0= ruledeclaration )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                alt66 = dfa66.predict(input);
                switch (alt66) {
            	case 1 :
            	    // InternalAnsic.g:4211:3: this_declaration_0= ruledeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getDeclaration_listAccess().getDeclarationParserRuleCall());
            	      		
            	    }
            	    pushFollow(FOLLOW_27);
            	    this_declaration_0=ruledeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_declaration_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclaration_list"


    // $ANTLR start "entryRulestatement_list"
    // InternalAnsic.g:4225:1: entryRulestatement_list returns [String current=null] : iv_rulestatement_list= rulestatement_list EOF ;
    public final String entryRulestatement_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestatement_list = null;


        try {
            // InternalAnsic.g:4225:54: (iv_rulestatement_list= rulestatement_list EOF )
            // InternalAnsic.g:4226:2: iv_rulestatement_list= rulestatement_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement_list=rulestatement_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_list.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_list"


    // $ANTLR start "rulestatement_list"
    // InternalAnsic.g:4232:1: rulestatement_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_statement_0= rulestatement )+ ;
    public final AntlrDatatypeRuleToken rulestatement_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_statement_0 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4238:2: ( (this_statement_0= rulestatement )+ )
            // InternalAnsic.g:4239:2: (this_statement_0= rulestatement )+
            {
            // InternalAnsic.g:4239:2: (this_statement_0= rulestatement )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_INC_OP && LA67_0<=RULE_SIZEOF)||(LA67_0>=RULE_CASE && LA67_0<=RULE_IF)||(LA67_0>=RULE_SWITCH && LA67_0<=RULE_D)||LA67_0==68||LA67_0==72||(LA67_0>=74 && LA67_0<=79)||LA67_0==89||LA67_0==91) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalAnsic.g:4240:3: this_statement_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getStatement_listAccess().getStatementParserRuleCall());
            	      		
            	    }
            	    pushFollow(FOLLOW_46);
            	    this_statement_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_statement_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_list"


    // $ANTLR start "entryRuleexpression_statement"
    // InternalAnsic.g:4254:1: entryRuleexpression_statement returns [String current=null] : iv_ruleexpression_statement= ruleexpression_statement EOF ;
    public final String entryRuleexpression_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression_statement = null;


        try {
            // InternalAnsic.g:4254:60: (iv_ruleexpression_statement= ruleexpression_statement EOF )
            // InternalAnsic.g:4255:2: iv_ruleexpression_statement= ruleexpression_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression_statement=ruleexpression_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression_statement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression_statement"


    // $ANTLR start "ruleexpression_statement"
    // InternalAnsic.g:4261:1: ruleexpression_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ';' | (this_expression_1= ruleexpression kw= ';' ) ) ;
    public final AntlrDatatypeRuleToken ruleexpression_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_1 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4267:2: ( (kw= ';' | (this_expression_1= ruleexpression kw= ';' ) ) )
            // InternalAnsic.g:4268:2: (kw= ';' | (this_expression_1= ruleexpression kw= ';' ) )
            {
            // InternalAnsic.g:4268:2: (kw= ';' | (this_expression_1= ruleexpression kw= ';' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==89) ) {
                alt68=1;
            }
            else if ( ((LA68_0>=RULE_INC_OP && LA68_0<=RULE_SIZEOF)||(LA68_0>=RULE_ID && LA68_0<=RULE_D)||LA68_0==68||LA68_0==72||(LA68_0>=74 && LA68_0<=79)) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalAnsic.g:4269:3: kw= ';'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getExpression_statementAccess().getSemicolonKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:4275:3: (this_expression_1= ruleexpression kw= ';' )
                    {
                    // InternalAnsic.g:4275:3: (this_expression_1= ruleexpression kw= ';' )
                    // InternalAnsic.g:4276:4: this_expression_1= ruleexpression kw= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpression_statementAccess().getExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_expression_1=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpression_statementAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression_statement"


    // $ANTLR start "entryRuleselection_statement"
    // InternalAnsic.g:4296:1: entryRuleselection_statement returns [String current=null] : iv_ruleselection_statement= ruleselection_statement EOF ;
    public final String entryRuleselection_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleselection_statement = null;


        try {
            // InternalAnsic.g:4296:59: (iv_ruleselection_statement= ruleselection_statement EOF )
            // InternalAnsic.g:4297:2: iv_ruleselection_statement= ruleselection_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelection_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleselection_statement=ruleselection_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleselection_statement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleselection_statement"


    // $ANTLR start "ruleselection_statement"
    // InternalAnsic.g:4303:1: ruleselection_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) | (this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement ) | (this_SWITCH_12= RULE_SWITCH kw= '(' this_expression_14= ruleexpression kw= ')' this_statement_16= rulestatement ) ) ;
    public final AntlrDatatypeRuleToken ruleselection_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IF_0=null;
        Token kw=null;
        Token this_IF_5=null;
        Token this_ELSE_10=null;
        Token this_SWITCH_12=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_statement_4 = null;

        AntlrDatatypeRuleToken this_expression_7 = null;

        AntlrDatatypeRuleToken this_statement_9 = null;

        AntlrDatatypeRuleToken this_statement_11 = null;

        AntlrDatatypeRuleToken this_expression_14 = null;

        AntlrDatatypeRuleToken this_statement_16 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4309:2: ( ( (this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) | (this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement ) | (this_SWITCH_12= RULE_SWITCH kw= '(' this_expression_14= ruleexpression kw= ')' this_statement_16= rulestatement ) ) )
            // InternalAnsic.g:4310:2: ( (this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) | (this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement ) | (this_SWITCH_12= RULE_SWITCH kw= '(' this_expression_14= ruleexpression kw= ')' this_statement_16= rulestatement ) )
            {
            // InternalAnsic.g:4310:2: ( (this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) | (this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement ) | (this_SWITCH_12= RULE_SWITCH kw= '(' this_expression_14= ruleexpression kw= ')' this_statement_16= rulestatement ) )
            int alt69=3;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_IF) ) {
                int LA69_1 = input.LA(2);

                if ( (synpred134_InternalAnsic()) ) {
                    alt69=1;
                }
                else if ( (synpred135_InternalAnsic()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA69_0==RULE_SWITCH) ) {
                alt69=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalAnsic.g:4311:3: (this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
                    {
                    // InternalAnsic.g:4311:3: (this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
                    // InternalAnsic.g:4312:4: this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement
                    {
                    this_IF_0=(Token)match(input,RULE_IF,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IF_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IF_0, grammarAccess.getSelection_statementAccess().getIFTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSelection_statementAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSelection_statementAccess().getExpressionParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_2=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSelection_statementAccess().getRightParenthesisKeyword_0_3());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSelection_statementAccess().getStatementParserRuleCall_0_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_statement_4=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:4351:3: (this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement )
                    {
                    // InternalAnsic.g:4351:3: (this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement )
                    // InternalAnsic.g:4352:4: this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement
                    {
                    this_IF_5=(Token)match(input,RULE_IF,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IF_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IF_5, grammarAccess.getSelection_statementAccess().getIFTerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSelection_statementAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSelection_statementAccess().getExpressionParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_7=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSelection_statementAccess().getRightParenthesisKeyword_1_3());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSelection_statementAccess().getStatementParserRuleCall_1_4());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_statement_9=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_ELSE_10=(Token)match(input,RULE_ELSE,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ELSE_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ELSE_10, grammarAccess.getSelection_statementAccess().getELSETerminalRuleCall_1_5());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSelection_statementAccess().getStatementParserRuleCall_1_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_statement_11=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_11);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:4408:3: (this_SWITCH_12= RULE_SWITCH kw= '(' this_expression_14= ruleexpression kw= ')' this_statement_16= rulestatement )
                    {
                    // InternalAnsic.g:4408:3: (this_SWITCH_12= RULE_SWITCH kw= '(' this_expression_14= ruleexpression kw= ')' this_statement_16= rulestatement )
                    // InternalAnsic.g:4409:4: this_SWITCH_12= RULE_SWITCH kw= '(' this_expression_14= ruleexpression kw= ')' this_statement_16= rulestatement
                    {
                    this_SWITCH_12=(Token)match(input,RULE_SWITCH,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SWITCH_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SWITCH_12, grammarAccess.getSelection_statementAccess().getSWITCHTerminalRuleCall_2_0());
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSelection_statementAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSelection_statementAccess().getExpressionParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_14=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_14);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSelection_statementAccess().getRightParenthesisKeyword_2_3());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSelection_statementAccess().getStatementParserRuleCall_2_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_statement_16=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_16);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleselection_statement"


    // $ANTLR start "entryRuleiteration_statement"
    // InternalAnsic.g:4451:1: entryRuleiteration_statement returns [String current=null] : iv_ruleiteration_statement= ruleiteration_statement EOF ;
    public final String entryRuleiteration_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleiteration_statement = null;


        try {
            // InternalAnsic.g:4451:59: (iv_ruleiteration_statement= ruleiteration_statement EOF )
            // InternalAnsic.g:4452:2: iv_ruleiteration_statement= ruleiteration_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteration_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleiteration_statement=ruleiteration_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleiteration_statement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleiteration_statement"


    // $ANTLR start "ruleiteration_statement"
    // InternalAnsic.g:4458:1: ruleiteration_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WHILE_0= RULE_WHILE kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) | (this_DO_5= RULE_DO this_statement_6= rulestatement this_WHILE_7= RULE_WHILE kw= '(' this_expression_9= ruleexpression kw= ')' kw= ';' ) | (this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement ) | (this_FOR_18= RULE_FOR kw= '(' this_expression_statement_20= ruleexpression_statement this_expression_statement_21= ruleexpression_statement this_expression_22= ruleexpression kw= ')' this_statement_24= rulestatement ) ) ;
    public final AntlrDatatypeRuleToken ruleiteration_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WHILE_0=null;
        Token kw=null;
        Token this_DO_5=null;
        Token this_WHILE_7=null;
        Token this_FOR_12=null;
        Token this_FOR_18=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_statement_4 = null;

        AntlrDatatypeRuleToken this_statement_6 = null;

        AntlrDatatypeRuleToken this_expression_9 = null;

        AntlrDatatypeRuleToken this_expression_statement_14 = null;

        AntlrDatatypeRuleToken this_expression_statement_15 = null;

        AntlrDatatypeRuleToken this_statement_17 = null;

        AntlrDatatypeRuleToken this_expression_statement_20 = null;

        AntlrDatatypeRuleToken this_expression_statement_21 = null;

        AntlrDatatypeRuleToken this_expression_22 = null;

        AntlrDatatypeRuleToken this_statement_24 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4464:2: ( ( (this_WHILE_0= RULE_WHILE kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) | (this_DO_5= RULE_DO this_statement_6= rulestatement this_WHILE_7= RULE_WHILE kw= '(' this_expression_9= ruleexpression kw= ')' kw= ';' ) | (this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement ) | (this_FOR_18= RULE_FOR kw= '(' this_expression_statement_20= ruleexpression_statement this_expression_statement_21= ruleexpression_statement this_expression_22= ruleexpression kw= ')' this_statement_24= rulestatement ) ) )
            // InternalAnsic.g:4465:2: ( (this_WHILE_0= RULE_WHILE kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) | (this_DO_5= RULE_DO this_statement_6= rulestatement this_WHILE_7= RULE_WHILE kw= '(' this_expression_9= ruleexpression kw= ')' kw= ';' ) | (this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement ) | (this_FOR_18= RULE_FOR kw= '(' this_expression_statement_20= ruleexpression_statement this_expression_statement_21= ruleexpression_statement this_expression_22= ruleexpression kw= ')' this_statement_24= rulestatement ) )
            {
            // InternalAnsic.g:4465:2: ( (this_WHILE_0= RULE_WHILE kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) | (this_DO_5= RULE_DO this_statement_6= rulestatement this_WHILE_7= RULE_WHILE kw= '(' this_expression_9= ruleexpression kw= ')' kw= ';' ) | (this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement ) | (this_FOR_18= RULE_FOR kw= '(' this_expression_statement_20= ruleexpression_statement this_expression_statement_21= ruleexpression_statement this_expression_22= ruleexpression kw= ')' this_statement_24= rulestatement ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case RULE_WHILE:
                {
                alt70=1;
                }
                break;
            case RULE_DO:
                {
                alt70=2;
                }
                break;
            case RULE_FOR:
                {
                int LA70_3 = input.LA(2);

                if ( (synpred138_InternalAnsic()) ) {
                    alt70=3;
                }
                else if ( (true) ) {
                    alt70=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalAnsic.g:4466:3: (this_WHILE_0= RULE_WHILE kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
                    {
                    // InternalAnsic.g:4466:3: (this_WHILE_0= RULE_WHILE kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
                    // InternalAnsic.g:4467:4: this_WHILE_0= RULE_WHILE kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement
                    {
                    this_WHILE_0=(Token)match(input,RULE_WHILE,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_WHILE_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WHILE_0, grammarAccess.getIteration_statementAccess().getWHILETerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIteration_statementAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getExpressionParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_2=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIteration_statementAccess().getRightParenthesisKeyword_0_3());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getStatementParserRuleCall_0_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_statement_4=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:4506:3: (this_DO_5= RULE_DO this_statement_6= rulestatement this_WHILE_7= RULE_WHILE kw= '(' this_expression_9= ruleexpression kw= ')' kw= ';' )
                    {
                    // InternalAnsic.g:4506:3: (this_DO_5= RULE_DO this_statement_6= rulestatement this_WHILE_7= RULE_WHILE kw= '(' this_expression_9= ruleexpression kw= ')' kw= ';' )
                    // InternalAnsic.g:4507:4: this_DO_5= RULE_DO this_statement_6= rulestatement this_WHILE_7= RULE_WHILE kw= '(' this_expression_9= ruleexpression kw= ')' kw= ';'
                    {
                    this_DO_5=(Token)match(input,RULE_DO,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DO_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DO_5, grammarAccess.getIteration_statementAccess().getDOTerminalRuleCall_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getStatementParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_48);
                    this_statement_6=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_WHILE_7=(Token)match(input,RULE_WHILE,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_WHILE_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WHILE_7, grammarAccess.getIteration_statementAccess().getWHILETerminalRuleCall_1_2());
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIteration_statementAccess().getLeftParenthesisKeyword_1_3());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getExpressionParserRuleCall_1_4());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_9=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIteration_statementAccess().getRightParenthesisKeyword_1_5());
                      			
                    }
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIteration_statementAccess().getSemicolonKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:4558:3: (this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement )
                    {
                    // InternalAnsic.g:4558:3: (this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement )
                    // InternalAnsic.g:4559:4: this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement
                    {
                    this_FOR_12=(Token)match(input,RULE_FOR,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FOR_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_FOR_12, grammarAccess.getIteration_statementAccess().getFORTerminalRuleCall_2_0());
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIteration_statementAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getExpression_statementParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_49);
                    this_expression_statement_14=ruleexpression_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_statement_14);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getExpression_statementParserRuleCall_2_3());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_statement_15=ruleexpression_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_statement_15);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIteration_statementAccess().getRightParenthesisKeyword_2_4());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getStatementParserRuleCall_2_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_statement_17=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_17);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:4608:3: (this_FOR_18= RULE_FOR kw= '(' this_expression_statement_20= ruleexpression_statement this_expression_statement_21= ruleexpression_statement this_expression_22= ruleexpression kw= ')' this_statement_24= rulestatement )
                    {
                    // InternalAnsic.g:4608:3: (this_FOR_18= RULE_FOR kw= '(' this_expression_statement_20= ruleexpression_statement this_expression_statement_21= ruleexpression_statement this_expression_22= ruleexpression kw= ')' this_statement_24= rulestatement )
                    // InternalAnsic.g:4609:4: this_FOR_18= RULE_FOR kw= '(' this_expression_statement_20= ruleexpression_statement this_expression_statement_21= ruleexpression_statement this_expression_22= ruleexpression kw= ')' this_statement_24= rulestatement
                    {
                    this_FOR_18=(Token)match(input,RULE_FOR,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FOR_18);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_FOR_18, grammarAccess.getIteration_statementAccess().getFORTerminalRuleCall_3_0());
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIteration_statementAccess().getLeftParenthesisKeyword_3_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getExpression_statementParserRuleCall_3_2());
                      			
                    }
                    pushFollow(FOLLOW_49);
                    this_expression_statement_20=ruleexpression_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_statement_20);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getExpression_statementParserRuleCall_3_3());
                      			
                    }
                    pushFollow(FOLLOW_3);
                    this_expression_statement_21=ruleexpression_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_statement_21);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getExpressionParserRuleCall_3_4());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_expression_22=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_22);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,69,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIteration_statementAccess().getRightParenthesisKeyword_3_5());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIteration_statementAccess().getStatementParserRuleCall_3_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_statement_24=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_statement_24);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleiteration_statement"


    // $ANTLR start "entryRulejump_statement"
    // InternalAnsic.g:4671:1: entryRulejump_statement returns [String current=null] : iv_rulejump_statement= rulejump_statement EOF ;
    public final String entryRulejump_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulejump_statement = null;


        try {
            // InternalAnsic.g:4671:54: (iv_rulejump_statement= rulejump_statement EOF )
            // InternalAnsic.g:4672:2: iv_rulejump_statement= rulejump_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJump_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulejump_statement=rulejump_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulejump_statement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulejump_statement"


    // $ANTLR start "rulejump_statement"
    // InternalAnsic.g:4678:1: rulejump_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_GOTO_0= RULE_GOTO this_IDENTIFIER_1= ruleIDENTIFIER kw= ';' ) | (this_CONTINUE_3= RULE_CONTINUE kw= ';' ) | (this_BREAK_5= RULE_BREAK kw= ';' ) | (this_RETURNO_7= RULE_RETURNO kw= ';' ) | (this_RETURNO_9= RULE_RETURNO this_expression_10= ruleexpression kw= ';' ) ) ;
    public final AntlrDatatypeRuleToken rulejump_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_GOTO_0=null;
        Token kw=null;
        Token this_CONTINUE_3=null;
        Token this_BREAK_5=null;
        Token this_RETURNO_7=null;
        Token this_RETURNO_9=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_1 = null;

        AntlrDatatypeRuleToken this_expression_10 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4684:2: ( ( (this_GOTO_0= RULE_GOTO this_IDENTIFIER_1= ruleIDENTIFIER kw= ';' ) | (this_CONTINUE_3= RULE_CONTINUE kw= ';' ) | (this_BREAK_5= RULE_BREAK kw= ';' ) | (this_RETURNO_7= RULE_RETURNO kw= ';' ) | (this_RETURNO_9= RULE_RETURNO this_expression_10= ruleexpression kw= ';' ) ) )
            // InternalAnsic.g:4685:2: ( (this_GOTO_0= RULE_GOTO this_IDENTIFIER_1= ruleIDENTIFIER kw= ';' ) | (this_CONTINUE_3= RULE_CONTINUE kw= ';' ) | (this_BREAK_5= RULE_BREAK kw= ';' ) | (this_RETURNO_7= RULE_RETURNO kw= ';' ) | (this_RETURNO_9= RULE_RETURNO this_expression_10= ruleexpression kw= ';' ) )
            {
            // InternalAnsic.g:4685:2: ( (this_GOTO_0= RULE_GOTO this_IDENTIFIER_1= ruleIDENTIFIER kw= ';' ) | (this_CONTINUE_3= RULE_CONTINUE kw= ';' ) | (this_BREAK_5= RULE_BREAK kw= ';' ) | (this_RETURNO_7= RULE_RETURNO kw= ';' ) | (this_RETURNO_9= RULE_RETURNO this_expression_10= ruleexpression kw= ';' ) )
            int alt71=5;
            switch ( input.LA(1) ) {
            case RULE_GOTO:
                {
                alt71=1;
                }
                break;
            case RULE_CONTINUE:
                {
                alt71=2;
                }
                break;
            case RULE_BREAK:
                {
                alt71=3;
                }
                break;
            case RULE_RETURNO:
                {
                int LA71_4 = input.LA(2);

                if ( (LA71_4==89) ) {
                    alt71=4;
                }
                else if ( ((LA71_4>=RULE_INC_OP && LA71_4<=RULE_SIZEOF)||(LA71_4>=RULE_ID && LA71_4<=RULE_D)||LA71_4==68||LA71_4==72||(LA71_4>=74 && LA71_4<=79)) ) {
                    alt71=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalAnsic.g:4686:3: (this_GOTO_0= RULE_GOTO this_IDENTIFIER_1= ruleIDENTIFIER kw= ';' )
                    {
                    // InternalAnsic.g:4686:3: (this_GOTO_0= RULE_GOTO this_IDENTIFIER_1= ruleIDENTIFIER kw= ';' )
                    // InternalAnsic.g:4687:4: this_GOTO_0= RULE_GOTO this_IDENTIFIER_1= ruleIDENTIFIER kw= ';'
                    {
                    this_GOTO_0=(Token)match(input,RULE_GOTO,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_GOTO_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_GOTO_0, grammarAccess.getJump_statementAccess().getGOTOTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJump_statementAccess().getIDENTIFIERParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_IDENTIFIER_1=ruleIDENTIFIER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJump_statementAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:4711:3: (this_CONTINUE_3= RULE_CONTINUE kw= ';' )
                    {
                    // InternalAnsic.g:4711:3: (this_CONTINUE_3= RULE_CONTINUE kw= ';' )
                    // InternalAnsic.g:4712:4: this_CONTINUE_3= RULE_CONTINUE kw= ';'
                    {
                    this_CONTINUE_3=(Token)match(input,RULE_CONTINUE,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_CONTINUE_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CONTINUE_3, grammarAccess.getJump_statementAccess().getCONTINUETerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJump_statementAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:4726:3: (this_BREAK_5= RULE_BREAK kw= ';' )
                    {
                    // InternalAnsic.g:4726:3: (this_BREAK_5= RULE_BREAK kw= ';' )
                    // InternalAnsic.g:4727:4: this_BREAK_5= RULE_BREAK kw= ';'
                    {
                    this_BREAK_5=(Token)match(input,RULE_BREAK,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BREAK_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BREAK_5, grammarAccess.getJump_statementAccess().getBREAKTerminalRuleCall_2_0());
                      			
                    }
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJump_statementAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:4741:3: (this_RETURNO_7= RULE_RETURNO kw= ';' )
                    {
                    // InternalAnsic.g:4741:3: (this_RETURNO_7= RULE_RETURNO kw= ';' )
                    // InternalAnsic.g:4742:4: this_RETURNO_7= RULE_RETURNO kw= ';'
                    {
                    this_RETURNO_7=(Token)match(input,RULE_RETURNO,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_RETURNO_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_RETURNO_7, grammarAccess.getJump_statementAccess().getRETURNOTerminalRuleCall_3_0());
                      			
                    }
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJump_statementAccess().getSemicolonKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAnsic.g:4756:3: (this_RETURNO_9= RULE_RETURNO this_expression_10= ruleexpression kw= ';' )
                    {
                    // InternalAnsic.g:4756:3: (this_RETURNO_9= RULE_RETURNO this_expression_10= ruleexpression kw= ';' )
                    // InternalAnsic.g:4757:4: this_RETURNO_9= RULE_RETURNO this_expression_10= ruleexpression kw= ';'
                    {
                    this_RETURNO_9=(Token)match(input,RULE_RETURNO,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_RETURNO_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_RETURNO_9, grammarAccess.getJump_statementAccess().getRETURNOTerminalRuleCall_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJump_statementAccess().getExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_expression_10=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJump_statementAccess().getSemicolonKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulejump_statement"


    // $ANTLR start "entryRuletranslation_unit"
    // InternalAnsic.g:4784:1: entryRuletranslation_unit returns [String current=null] : iv_ruletranslation_unit= ruletranslation_unit EOF ;
    public final String entryRuletranslation_unit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletranslation_unit = null;


        try {
            // InternalAnsic.g:4784:56: (iv_ruletranslation_unit= ruletranslation_unit EOF )
            // InternalAnsic.g:4785:2: iv_ruletranslation_unit= ruletranslation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTranslation_unitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletranslation_unit=ruletranslation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletranslation_unit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletranslation_unit"


    // $ANTLR start "ruletranslation_unit"
    // InternalAnsic.g:4791:1: ruletranslation_unit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_external_declaration_0= ruleexternal_declaration )+ ;
    public final AntlrDatatypeRuleToken ruletranslation_unit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_external_declaration_0 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4797:2: ( (this_external_declaration_0= ruleexternal_declaration )+ )
            // InternalAnsic.g:4798:2: (this_external_declaration_0= ruleexternal_declaration )+
            {
            // InternalAnsic.g:4798:2: (this_external_declaration_0= ruleexternal_declaration )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=RULE_TYPEDEF && LA72_0<=RULE_VOLATILE)||LA72_0==RULE_ID||LA72_0==68||LA72_0==75||LA72_0==90) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalAnsic.g:4799:3: this_external_declaration_0= ruleexternal_declaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getTranslation_unitAccess().getExternal_declarationParserRuleCall());
            	      		
            	    }
            	    pushFollow(FOLLOW_50);
            	    this_external_declaration_0=ruleexternal_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_external_declaration_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletranslation_unit"


    // $ANTLR start "entryRuleexternal_declaration"
    // InternalAnsic.g:4813:1: entryRuleexternal_declaration returns [String current=null] : iv_ruleexternal_declaration= ruleexternal_declaration EOF ;
    public final String entryRuleexternal_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexternal_declaration = null;


        try {
            // InternalAnsic.g:4813:60: (iv_ruleexternal_declaration= ruleexternal_declaration EOF )
            // InternalAnsic.g:4814:2: iv_ruleexternal_declaration= ruleexternal_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternal_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexternal_declaration=ruleexternal_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexternal_declaration.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexternal_declaration"


    // $ANTLR start "ruleexternal_declaration"
    // InternalAnsic.g:4820:1: ruleexternal_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_function_definition_0= rulefunction_definition | this_declaration_1= ruledeclaration ) ;
    public final AntlrDatatypeRuleToken ruleexternal_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_function_definition_0 = null;

        AntlrDatatypeRuleToken this_declaration_1 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4826:2: ( (this_function_definition_0= rulefunction_definition | this_declaration_1= ruledeclaration ) )
            // InternalAnsic.g:4827:2: (this_function_definition_0= rulefunction_definition | this_declaration_1= ruledeclaration )
            {
            // InternalAnsic.g:4827:2: (this_function_definition_0= rulefunction_definition | this_declaration_1= ruledeclaration )
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalAnsic.g:4828:3: this_function_definition_0= rulefunction_definition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExternal_declarationAccess().getFunction_definitionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_function_definition_0=rulefunction_definition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_function_definition_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:4839:3: this_declaration_1= ruledeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExternal_declarationAccess().getDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_declaration_1=ruledeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_declaration_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexternal_declaration"


    // $ANTLR start "entryRulefunction_definition"
    // InternalAnsic.g:4853:1: entryRulefunction_definition returns [String current=null] : iv_rulefunction_definition= rulefunction_definition EOF ;
    public final String entryRulefunction_definition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction_definition = null;


        try {
            // InternalAnsic.g:4853:59: (iv_rulefunction_definition= rulefunction_definition EOF )
            // InternalAnsic.g:4854:2: iv_rulefunction_definition= rulefunction_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_definitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_definition=rulefunction_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_definition.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_definition"


    // $ANTLR start "rulefunction_definition"
    // InternalAnsic.g:4860:1: rulefunction_definition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement ) | (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement ) | (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement ) | (this_declarator_10= ruledeclarator this_compound_statement_11= rulecompound_statement ) ) ;
    public final AntlrDatatypeRuleToken rulefunction_definition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_declaration_specifiers_0 = null;

        AntlrDatatypeRuleToken this_declarator_1 = null;

        AntlrDatatypeRuleToken this_declaration_list_2 = null;

        AntlrDatatypeRuleToken this_compound_statement_3 = null;

        AntlrDatatypeRuleToken this_declaration_specifiers_4 = null;

        AntlrDatatypeRuleToken this_declarator_5 = null;

        AntlrDatatypeRuleToken this_compound_statement_6 = null;

        AntlrDatatypeRuleToken this_declarator_7 = null;

        AntlrDatatypeRuleToken this_declaration_list_8 = null;

        AntlrDatatypeRuleToken this_compound_statement_9 = null;

        AntlrDatatypeRuleToken this_declarator_10 = null;

        AntlrDatatypeRuleToken this_compound_statement_11 = null;



        	enterRule();

        try {
            // InternalAnsic.g:4866:2: ( ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement ) | (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement ) | (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement ) | (this_declarator_10= ruledeclarator this_compound_statement_11= rulecompound_statement ) ) )
            // InternalAnsic.g:4867:2: ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement ) | (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement ) | (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement ) | (this_declarator_10= ruledeclarator this_compound_statement_11= rulecompound_statement ) )
            {
            // InternalAnsic.g:4867:2: ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement ) | (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement ) | (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement ) | (this_declarator_10= ruledeclarator this_compound_statement_11= rulecompound_statement ) )
            int alt74=4;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // InternalAnsic.g:4868:3: (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement )
                    {
                    // InternalAnsic.g:4868:3: (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement )
                    // InternalAnsic.g:4869:4: this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaration_specifiersParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_declaration_specifiers_0=ruledeclaration_specifiers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declaration_specifiers_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaratorParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    this_declarator_1=ruledeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declarator_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaration_listParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_declaration_list_2=ruledeclaration_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declaration_list_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getCompound_statementParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_compound_statement_3=rulecompound_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_compound_statement_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:4911:3: (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement )
                    {
                    // InternalAnsic.g:4911:3: (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement )
                    // InternalAnsic.g:4912:4: this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaration_specifiersParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_declaration_specifiers_4=ruledeclaration_specifiers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declaration_specifiers_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaratorParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_declarator_5=ruledeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declarator_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getCompound_statementParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_compound_statement_6=rulecompound_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_compound_statement_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:4944:3: (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement )
                    {
                    // InternalAnsic.g:4944:3: (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement )
                    // InternalAnsic.g:4945:4: this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaratorParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    this_declarator_7=ruledeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declarator_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaration_listParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_declaration_list_8=ruledeclaration_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declaration_list_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getCompound_statementParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_compound_statement_9=rulecompound_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_compound_statement_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:4977:3: (this_declarator_10= ruledeclarator this_compound_statement_11= rulecompound_statement )
                    {
                    // InternalAnsic.g:4977:3: (this_declarator_10= ruledeclarator this_compound_statement_11= rulecompound_statement )
                    // InternalAnsic.g:4978:4: this_declarator_10= ruledeclarator this_compound_statement_11= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaratorParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_declarator_10=ruledeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_declarator_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunction_definitionAccess().getCompound_statementParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_compound_statement_11=rulecompound_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_compound_statement_11);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_definition"


    // $ANTLR start "entryRuleIDENTIFIER"
    // InternalAnsic.g:5003:1: entryRuleIDENTIFIER returns [String current=null] : iv_ruleIDENTIFIER= ruleIDENTIFIER EOF ;
    public final String entryRuleIDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDENTIFIER = null;


        try {
            // InternalAnsic.g:5003:50: (iv_ruleIDENTIFIER= ruleIDENTIFIER EOF )
            // InternalAnsic.g:5004:2: iv_ruleIDENTIFIER= ruleIDENTIFIER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDENTIFIERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIDENTIFIER=ruleIDENTIFIER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDENTIFIER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDENTIFIER"


    // $ANTLR start "ruleIDENTIFIER"
    // InternalAnsic.g:5010:1: ruleIDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAnsic.g:5016:2: (this_ID_0= RULE_ID )
            // InternalAnsic.g:5017:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIDENTIFIERAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDENTIFIER"


    // $ANTLR start "entryRuleTYPE_NAMEE"
    // InternalAnsic.g:5027:1: entryRuleTYPE_NAMEE returns [String current=null] : iv_ruleTYPE_NAMEE= ruleTYPE_NAMEE EOF ;
    public final String entryRuleTYPE_NAMEE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_NAMEE = null;


        try {
            // InternalAnsic.g:5027:50: (iv_ruleTYPE_NAMEE= ruleTYPE_NAMEE EOF )
            // InternalAnsic.g:5028:2: iv_ruleTYPE_NAMEE= ruleTYPE_NAMEE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTYPE_NAMEERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_NAMEE=ruleTYPE_NAMEE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTYPE_NAMEE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTYPE_NAMEE"


    // $ANTLR start "ruleTYPE_NAMEE"
    // InternalAnsic.g:5034:1: ruleTYPE_NAMEE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTYPE_NAMEE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAnsic.g:5040:2: (this_ID_0= RULE_ID )
            // InternalAnsic.g:5041:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getTYPE_NAMEEAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_NAMEE"


    // $ANTLR start "entryRuleSTRING_LITERAL"
    // InternalAnsic.g:5051:1: entryRuleSTRING_LITERAL returns [String current=null] : iv_ruleSTRING_LITERAL= ruleSTRING_LITERAL EOF ;
    public final String entryRuleSTRING_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTRING_LITERAL = null;


        try {
            // InternalAnsic.g:5051:54: (iv_ruleSTRING_LITERAL= ruleSTRING_LITERAL EOF )
            // InternalAnsic.g:5052:2: iv_ruleSTRING_LITERAL= ruleSTRING_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSTRING_LITERALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSTRING_LITERAL=ruleSTRING_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSTRING_LITERAL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTRING_LITERAL"


    // $ANTLR start "ruleSTRING_LITERAL"
    // InternalAnsic.g:5058:1: ruleSTRING_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleSTRING_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAnsic.g:5064:2: (this_STRING_0= RULE_STRING )
            // InternalAnsic.g:5065:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getSTRING_LITERALAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTRING_LITERAL"


    // $ANTLR start "entryRuleFS"
    // InternalAnsic.g:5075:1: entryRuleFS returns [String current=null] : iv_ruleFS= ruleFS EOF ;
    public final String entryRuleFS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFS = null;


        try {
            // InternalAnsic.g:5075:42: (iv_ruleFS= ruleFS EOF )
            // InternalAnsic.g:5076:2: iv_ruleFS= ruleFS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFS=ruleFS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFS"


    // $ANTLR start "ruleFS"
    // InternalAnsic.g:5082:1: ruleFS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'f' | kw= 'F' | kw= 'l' | kw= 'L' ) ;
    public final AntlrDatatypeRuleToken ruleFS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAnsic.g:5088:2: ( (kw= 'f' | kw= 'F' | kw= 'l' | kw= 'L' ) )
            // InternalAnsic.g:5089:2: (kw= 'f' | kw= 'F' | kw= 'l' | kw= 'L' )
            {
            // InternalAnsic.g:5089:2: (kw= 'f' | kw= 'F' | kw= 'l' | kw= 'L' )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt75=1;
                }
                break;
            case 94:
                {
                alt75=2;
                }
                break;
            case 95:
                {
                alt75=3;
                }
                break;
            case 96:
                {
                alt75=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalAnsic.g:5090:3: kw= 'f'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFSAccess().getFKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:5096:3: kw= 'F'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFSAccess().getFKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:5102:3: kw= 'l'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFSAccess().getLKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:5108:3: kw= 'L'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFSAccess().getLKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFS"


    // $ANTLR start "entryRuleIS"
    // InternalAnsic.g:5117:1: entryRuleIS returns [String current=null] : iv_ruleIS= ruleIS EOF ;
    public final String entryRuleIS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIS = null;


        try {
            // InternalAnsic.g:5117:42: (iv_ruleIS= ruleIS EOF )
            // InternalAnsic.g:5118:2: iv_ruleIS= ruleIS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getISRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIS=ruleIS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIS"


    // $ANTLR start "ruleIS"
    // InternalAnsic.g:5124:1: ruleIS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'u' | kw= 'U' | kw= 'l' | kw= 'L' )+ ;
    public final AntlrDatatypeRuleToken ruleIS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAnsic.g:5130:2: ( (kw= 'u' | kw= 'U' | kw= 'l' | kw= 'L' )+ )
            // InternalAnsic.g:5131:2: (kw= 'u' | kw= 'U' | kw= 'l' | kw= 'L' )+
            {
            // InternalAnsic.g:5131:2: (kw= 'u' | kw= 'U' | kw= 'l' | kw= 'L' )+
            int cnt76=0;
            loop76:
            do {
                int alt76=5;
                switch ( input.LA(1) ) {
                case 97:
                    {
                    alt76=1;
                    }
                    break;
                case 98:
                    {
                    alt76=2;
                    }
                    break;
                case 95:
                    {
                    alt76=3;
                    }
                    break;
                case 96:
                    {
                    alt76=4;
                    }
                    break;

                }

                switch (alt76) {
            	case 1 :
            	    // InternalAnsic.g:5132:3: kw= 'u'
            	    {
            	    kw=(Token)match(input,97,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISAccess().getUKeyword_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalAnsic.g:5138:3: kw= 'U'
            	    {
            	    kw=(Token)match(input,98,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISAccess().getUKeyword_1());
            	      		
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalAnsic.g:5144:3: kw= 'l'
            	    {
            	    kw=(Token)match(input,95,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISAccess().getLKeyword_2());
            	      		
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalAnsic.g:5150:3: kw= 'L'
            	    {
            	    kw=(Token)match(input,96,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getISAccess().getLKeyword_3());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIS"


    // $ANTLR start "entryRuleCONSTANT"
    // InternalAnsic.g:5159:1: entryRuleCONSTANT returns [String current=null] : iv_ruleCONSTANT= ruleCONSTANT EOF ;
    public final String entryRuleCONSTANT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONSTANT = null;


        try {
            // InternalAnsic.g:5159:48: (iv_ruleCONSTANT= ruleCONSTANT EOF )
            // InternalAnsic.g:5160:2: iv_ruleCONSTANT= ruleCONSTANT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCONSTANTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCONSTANT=ruleCONSTANT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCONSTANT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONSTANT"


    // $ANTLR start "ruleCONSTANT"
    // InternalAnsic.g:5166:1: ruleCONSTANT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_D_0= RULE_D )+ (this_IS_1= ruleIS )? ) | ( (this_D_2= RULE_D )* kw= '.' (this_D_4= RULE_D )+ (this_E_5= RULE_E )? (this_FS_6= ruleFS )? ) | ( (this_D_7= RULE_D )+ kw= '.' (this_E_9= RULE_E )? (this_FS_10= ruleFS )? ) ) ;
    public final AntlrDatatypeRuleToken ruleCONSTANT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_D_0=null;
        Token this_D_2=null;
        Token kw=null;
        Token this_D_4=null;
        Token this_E_5=null;
        Token this_D_7=null;
        Token this_E_9=null;
        AntlrDatatypeRuleToken this_IS_1 = null;

        AntlrDatatypeRuleToken this_FS_6 = null;

        AntlrDatatypeRuleToken this_FS_10 = null;



        	enterRule();

        try {
            // InternalAnsic.g:5172:2: ( ( ( (this_D_0= RULE_D )+ (this_IS_1= ruleIS )? ) | ( (this_D_2= RULE_D )* kw= '.' (this_D_4= RULE_D )+ (this_E_5= RULE_E )? (this_FS_6= ruleFS )? ) | ( (this_D_7= RULE_D )+ kw= '.' (this_E_9= RULE_E )? (this_FS_10= ruleFS )? ) ) )
            // InternalAnsic.g:5173:2: ( ( (this_D_0= RULE_D )+ (this_IS_1= ruleIS )? ) | ( (this_D_2= RULE_D )* kw= '.' (this_D_4= RULE_D )+ (this_E_5= RULE_E )? (this_FS_6= ruleFS )? ) | ( (this_D_7= RULE_D )+ kw= '.' (this_E_9= RULE_E )? (this_FS_10= ruleFS )? ) )
            {
            // InternalAnsic.g:5173:2: ( ( (this_D_0= RULE_D )+ (this_IS_1= ruleIS )? ) | ( (this_D_2= RULE_D )* kw= '.' (this_D_4= RULE_D )+ (this_E_5= RULE_E )? (this_FS_6= ruleFS )? ) | ( (this_D_7= RULE_D )+ kw= '.' (this_E_9= RULE_E )? (this_FS_10= ruleFS )? ) )
            int alt86=3;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalAnsic.g:5174:3: ( (this_D_0= RULE_D )+ (this_IS_1= ruleIS )? )
                    {
                    // InternalAnsic.g:5174:3: ( (this_D_0= RULE_D )+ (this_IS_1= ruleIS )? )
                    // InternalAnsic.g:5175:4: (this_D_0= RULE_D )+ (this_IS_1= ruleIS )?
                    {
                    // InternalAnsic.g:5175:4: (this_D_0= RULE_D )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==RULE_D) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalAnsic.g:5176:5: this_D_0= RULE_D
                    	    {
                    	    this_D_0=(Token)match(input,RULE_D,FOLLOW_52); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_D_0);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_D_0, grammarAccess.getCONSTANTAccess().getDTerminalRuleCall_0_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // InternalAnsic.g:5184:4: (this_IS_1= ruleIS )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( ((LA78_0>=95 && LA78_0<=98)) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalAnsic.g:5185:5: this_IS_1= ruleIS
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getCONSTANTAccess().getISParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_IS_1=ruleIS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_IS_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:5198:3: ( (this_D_2= RULE_D )* kw= '.' (this_D_4= RULE_D )+ (this_E_5= RULE_E )? (this_FS_6= ruleFS )? )
                    {
                    // InternalAnsic.g:5198:3: ( (this_D_2= RULE_D )* kw= '.' (this_D_4= RULE_D )+ (this_E_5= RULE_E )? (this_FS_6= ruleFS )? )
                    // InternalAnsic.g:5199:4: (this_D_2= RULE_D )* kw= '.' (this_D_4= RULE_D )+ (this_E_5= RULE_E )? (this_FS_6= ruleFS )?
                    {
                    // InternalAnsic.g:5199:4: (this_D_2= RULE_D )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==RULE_D) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalAnsic.g:5200:5: this_D_2= RULE_D
                    	    {
                    	    this_D_2=(Token)match(input,RULE_D,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_D_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_D_2, grammarAccess.getCONSTANTAccess().getDTerminalRuleCall_1_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    kw=(Token)match(input,72,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCONSTANTAccess().getFullStopKeyword_1_1());
                      			
                    }
                    // InternalAnsic.g:5213:4: (this_D_4= RULE_D )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==RULE_D) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalAnsic.g:5214:5: this_D_4= RULE_D
                    	    {
                    	    this_D_4=(Token)match(input,RULE_D,FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_D_4);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_D_4, grammarAccess.getCONSTANTAccess().getDTerminalRuleCall_1_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt80 >= 1 ) break loop80;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(80, input);
                                throw eee;
                        }
                        cnt80++;
                    } while (true);

                    // InternalAnsic.g:5222:4: (this_E_5= RULE_E )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_E) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalAnsic.g:5223:5: this_E_5= RULE_E
                            {
                            this_E_5=(Token)match(input,RULE_E,FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_E_5);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_E_5, grammarAccess.getCONSTANTAccess().getETerminalRuleCall_1_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalAnsic.g:5231:4: (this_FS_6= ruleFS )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( ((LA82_0>=93 && LA82_0<=96)) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalAnsic.g:5232:5: this_FS_6= ruleFS
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getCONSTANTAccess().getFSParserRuleCall_1_4());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_FS_6=ruleFS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_FS_6);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:5245:3: ( (this_D_7= RULE_D )+ kw= '.' (this_E_9= RULE_E )? (this_FS_10= ruleFS )? )
                    {
                    // InternalAnsic.g:5245:3: ( (this_D_7= RULE_D )+ kw= '.' (this_E_9= RULE_E )? (this_FS_10= ruleFS )? )
                    // InternalAnsic.g:5246:4: (this_D_7= RULE_D )+ kw= '.' (this_E_9= RULE_E )? (this_FS_10= ruleFS )?
                    {
                    // InternalAnsic.g:5246:4: (this_D_7= RULE_D )+
                    int cnt83=0;
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==RULE_D) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalAnsic.g:5247:5: this_D_7= RULE_D
                    	    {
                    	    this_D_7=(Token)match(input,RULE_D,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_D_7);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_D_7, grammarAccess.getCONSTANTAccess().getDTerminalRuleCall_2_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt83 >= 1 ) break loop83;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(83, input);
                                throw eee;
                        }
                        cnt83++;
                    } while (true);

                    kw=(Token)match(input,72,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCONSTANTAccess().getFullStopKeyword_2_1());
                      			
                    }
                    // InternalAnsic.g:5260:4: (this_E_9= RULE_E )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_E) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalAnsic.g:5261:5: this_E_9= RULE_E
                            {
                            this_E_9=(Token)match(input,RULE_E,FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_E_9);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_E_9, grammarAccess.getCONSTANTAccess().getETerminalRuleCall_2_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalAnsic.g:5269:4: (this_FS_10= ruleFS )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( ((LA85_0>=93 && LA85_0<=96)) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalAnsic.g:5270:5: this_FS_10= ruleFS
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getCONSTANTAccess().getFSParserRuleCall_2_3());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_FS_10=ruleFS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_FS_10);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONSTANT"

    // $ANTLR start synpred16_InternalAnsic
    public final void synpred16_InternalAnsic_fragment() throws RecognitionException {   
        Token this_SIZEOF_7=null;
        AntlrDatatypeRuleToken this_unary_expression_8 = null;


        // InternalAnsic.g:596:3: ( (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression ) )
        // InternalAnsic.g:596:3: (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression )
        {
        // InternalAnsic.g:596:3: (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression )
        // InternalAnsic.g:597:4: this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression
        {
        this_SIZEOF_7=(Token)match(input,RULE_SIZEOF,FOLLOW_3); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_unary_expression_8=ruleunary_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalAnsic

    // $ANTLR start synpred22_InternalAnsic
    public final void synpred22_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_unary_expression_0 = null;


        // InternalAnsic.g:718:3: (this_unary_expression_0= ruleunary_expression )
        // InternalAnsic.g:718:3: this_unary_expression_0= ruleunary_expression
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getCast_expressionAccess().getUnary_expressionParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_unary_expression_0=ruleunary_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalAnsic

    // $ANTLR start synpred42_InternalAnsic
    public final void synpred42_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_conditional_expression_0 = null;


        // InternalAnsic.g:1456:3: (this_conditional_expression_0= ruleconditional_expression )
        // InternalAnsic.g:1456:3: this_conditional_expression_0= ruleconditional_expression
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getAssignment_expressionAccess().getConditional_expressionParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_conditional_expression_0=ruleconditional_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalAnsic

    // $ANTLR start synpred55_InternalAnsic
    public final void synpred55_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declaration_specifiers_1 = null;


        // InternalAnsic.g:1753:5: (this_declaration_specifiers_1= ruledeclaration_specifiers )
        // InternalAnsic.g:1753:5: this_declaration_specifiers_1= ruledeclaration_specifiers
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getDeclaration_specifiersAccess().getDeclaration_specifiersParserRuleCall_0_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_declaration_specifiers_1=ruledeclaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalAnsic

    // $ANTLR start synpred57_InternalAnsic
    public final void synpred57_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declaration_specifiers_3 = null;


        // InternalAnsic.g:1778:5: (this_declaration_specifiers_3= ruledeclaration_specifiers )
        // InternalAnsic.g:1778:5: this_declaration_specifiers_3= ruledeclaration_specifiers
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getDeclaration_specifiersAccess().getDeclaration_specifiersParserRuleCall_1_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_declaration_specifiers_3=ruledeclaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalAnsic

    // $ANTLR start synpred59_InternalAnsic
    public final void synpred59_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declaration_specifiers_5 = null;


        // InternalAnsic.g:1803:5: (this_declaration_specifiers_5= ruledeclaration_specifiers )
        // InternalAnsic.g:1803:5: this_declaration_specifiers_5= ruledeclaration_specifiers
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getDeclaration_specifiersAccess().getDeclaration_specifiersParserRuleCall_2_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_declaration_specifiers_5=ruledeclaration_specifiers();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalAnsic

    // $ANTLR start synpred81_InternalAnsic
    public final void synpred81_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_type_specifier_0 = null;

        AntlrDatatypeRuleToken this_specifier_qualifier_list_1 = null;


        // InternalAnsic.g:2329:3: ( (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list ) )
        // InternalAnsic.g:2329:3: (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list )
        {
        // InternalAnsic.g:2329:3: (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list )
        // InternalAnsic.g:2330:4: this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getSpecifier_qualifier_listAccess().getType_specifierParserRuleCall_0_0());
          			
        }
        pushFollow(FOLLOW_10);
        this_type_specifier_0=ruletype_specifier();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_specifier_qualifier_list_1=rulespecifier_qualifier_list();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred81_InternalAnsic

    // $ANTLR start synpred82_InternalAnsic
    public final void synpred82_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_type_specifier_2 = null;


        // InternalAnsic.g:2352:3: (this_type_specifier_2= ruletype_specifier )
        // InternalAnsic.g:2352:3: this_type_specifier_2= ruletype_specifier
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getSpecifier_qualifier_listAccess().getType_specifierParserRuleCall_1());
          		
        }
        pushFollow(FOLLOW_2);
        this_type_specifier_2=ruletype_specifier();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_InternalAnsic

    // $ANTLR start synpred83_InternalAnsic
    public final void synpred83_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_type_qualifier_3 = null;

        AntlrDatatypeRuleToken this_specifier_qualifier_list_4 = null;


        // InternalAnsic.g:2363:3: ( (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list ) )
        // InternalAnsic.g:2363:3: (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list )
        {
        // InternalAnsic.g:2363:3: (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list )
        // InternalAnsic.g:2364:4: this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getSpecifier_qualifier_listAccess().getType_qualifierParserRuleCall_2_0());
          			
        }
        pushFollow(FOLLOW_10);
        this_type_qualifier_3=ruletype_qualifier();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_specifier_qualifier_list_4=rulespecifier_qualifier_list();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred83_InternalAnsic

    // $ANTLR start synpred85_InternalAnsic
    public final void synpred85_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declarator_0 = null;


        // InternalAnsic.g:2461:3: (this_declarator_0= ruledeclarator )
        // InternalAnsic.g:2461:3: this_declarator_0= ruledeclarator
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getStruct_declaratorAccess().getDeclaratorParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_declarator_0=ruledeclarator();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_InternalAnsic

    // $ANTLR start synpred96_InternalAnsic
    public final void synpred96_InternalAnsic_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_parameter_type_list_8 = null;

        AntlrDatatypeRuleToken this_direct_declaratorI_10 = null;


        // InternalAnsic.g:2963:3: ( (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI ) )
        // InternalAnsic.g:2963:3: (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI )
        {
        // InternalAnsic.g:2963:3: (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI )
        // InternalAnsic.g:2964:4: kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI
        {
        kw=(Token)match(input,68,FOLLOW_37); if (state.failed) return ;
        pushFollow(FOLLOW_4);
        this_parameter_type_list_8=ruleparameter_type_list();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_direct_declaratorI_10=ruledirect_declaratorI();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred96_InternalAnsic

    // $ANTLR start synpred97_InternalAnsic
    public final void synpred97_InternalAnsic_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_identifier_list_12 = null;

        AntlrDatatypeRuleToken this_direct_declaratorI_14 = null;


        // InternalAnsic.g:2996:3: ( (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI ) )
        // InternalAnsic.g:2996:3: (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI )
        {
        // InternalAnsic.g:2996:3: (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI )
        // InternalAnsic.g:2997:4: kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI
        {
        kw=(Token)match(input,68,FOLLOW_7); if (state.failed) return ;
        pushFollow(FOLLOW_4);
        this_identifier_list_12=ruleidentifier_list();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,69,FOLLOW_36); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_direct_declaratorI_14=ruledirect_declaratorI();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred97_InternalAnsic

    // $ANTLR start synpred105_InternalAnsic
    public final void synpred105_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declaration_specifiers_0 = null;

        AntlrDatatypeRuleToken this_declarator_1 = null;


        // InternalAnsic.g:3276:3: ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator ) )
        // InternalAnsic.g:3276:3: (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator )
        {
        // InternalAnsic.g:3276:3: (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator )
        // InternalAnsic.g:3277:4: this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getParameter_declarationAccess().getDeclaration_specifiersParserRuleCall_0_0());
          			
        }
        pushFollow(FOLLOW_28);
        this_declaration_specifiers_0=ruledeclaration_specifiers();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_declarator_1=ruledeclarator();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred105_InternalAnsic

    // $ANTLR start synpred106_InternalAnsic
    public final void synpred106_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declaration_specifiers_2 = null;

        AntlrDatatypeRuleToken this_abstract_declarator_3 = null;


        // InternalAnsic.g:3299:3: ( (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator ) )
        // InternalAnsic.g:3299:3: (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator )
        {
        // InternalAnsic.g:3299:3: (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator )
        // InternalAnsic.g:3300:4: this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getParameter_declarationAccess().getDeclaration_specifiersParserRuleCall_1_0());
          			
        }
        pushFollow(FOLLOW_42);
        this_declaration_specifiers_2=ruledeclaration_specifiers();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_abstract_declarator_3=ruleabstract_declarator();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred106_InternalAnsic

    // $ANTLR start synpred119_InternalAnsic
    public final void synpred119_InternalAnsic_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_initializer_list_2 = null;


        // InternalAnsic.g:3796:3: ( (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' ) )
        // InternalAnsic.g:3796:3: (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' )
        {
        // InternalAnsic.g:3796:3: (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' )
        // InternalAnsic.g:3797:4: kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}'
        {
        kw=(Token)match(input,91,FOLLOW_30); if (state.failed) return ;
        pushFollow(FOLLOW_32);
        this_initializer_list_2=ruleinitializer_list();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred119_InternalAnsic

    // $ANTLR start synpred128_InternalAnsic
    public final void synpred128_InternalAnsic_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalAnsic.g:4101:3: ( (kw= '{' kw= '}' ) )
        // InternalAnsic.g:4101:3: (kw= '{' kw= '}' )
        {
        // InternalAnsic.g:4101:3: (kw= '{' kw= '}' )
        // InternalAnsic.g:4102:4: kw= '{' kw= '}'
        {
        kw=(Token)match(input,91,FOLLOW_32); if (state.failed) return ;
        kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred128_InternalAnsic

    // $ANTLR start synpred129_InternalAnsic
    public final void synpred129_InternalAnsic_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_statement_list_3 = null;


        // InternalAnsic.g:4114:3: ( (kw= '{' this_statement_list_3= rulestatement_list kw= '}' ) )
        // InternalAnsic.g:4114:3: (kw= '{' this_statement_list_3= rulestatement_list kw= '}' )
        {
        // InternalAnsic.g:4114:3: (kw= '{' this_statement_list_3= rulestatement_list kw= '}' )
        // InternalAnsic.g:4115:4: kw= '{' this_statement_list_3= rulestatement_list kw= '}'
        {
        kw=(Token)match(input,91,FOLLOW_45); if (state.failed) return ;
        pushFollow(FOLLOW_32);
        this_statement_list_3=rulestatement_list();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred129_InternalAnsic

    // $ANTLR start synpred130_InternalAnsic
    public final void synpred130_InternalAnsic_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_declaration_list_6 = null;


        // InternalAnsic.g:4137:3: ( (kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}' ) )
        // InternalAnsic.g:4137:3: (kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}' )
        {
        // InternalAnsic.g:4137:3: (kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}' )
        // InternalAnsic.g:4138:4: kw= '{' this_declaration_list_6= ruledeclaration_list kw= '}'
        {
        kw=(Token)match(input,91,FOLLOW_37); if (state.failed) return ;
        pushFollow(FOLLOW_32);
        this_declaration_list_6=ruledeclaration_list();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred130_InternalAnsic

    // $ANTLR start synpred131_InternalAnsic
    public final void synpred131_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declaration_0 = null;


        // InternalAnsic.g:4211:3: (this_declaration_0= ruledeclaration )
        // InternalAnsic.g:4211:3: this_declaration_0= ruledeclaration
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getDeclaration_listAccess().getDeclarationParserRuleCall());
          		
        }
        pushFollow(FOLLOW_2);
        this_declaration_0=ruledeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_InternalAnsic

    // $ANTLR start synpred134_InternalAnsic
    public final void synpred134_InternalAnsic_fragment() throws RecognitionException {   
        Token this_IF_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_statement_4 = null;


        // InternalAnsic.g:4311:3: ( (this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement ) )
        // InternalAnsic.g:4311:3: (this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
        {
        // InternalAnsic.g:4311:3: (this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement )
        // InternalAnsic.g:4312:4: this_IF_0= RULE_IF kw= '(' this_expression_2= ruleexpression kw= ')' this_statement_4= rulestatement
        {
        this_IF_0=(Token)match(input,RULE_IF,FOLLOW_9); if (state.failed) return ;
        kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return ;
        pushFollow(FOLLOW_4);
        this_expression_2=ruleexpression();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,69,FOLLOW_45); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_statement_4=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred134_InternalAnsic

    // $ANTLR start synpred135_InternalAnsic
    public final void synpred135_InternalAnsic_fragment() throws RecognitionException {   
        Token this_IF_5=null;
        Token kw=null;
        Token this_ELSE_10=null;
        AntlrDatatypeRuleToken this_expression_7 = null;

        AntlrDatatypeRuleToken this_statement_9 = null;

        AntlrDatatypeRuleToken this_statement_11 = null;


        // InternalAnsic.g:4351:3: ( (this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement ) )
        // InternalAnsic.g:4351:3: (this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement )
        {
        // InternalAnsic.g:4351:3: (this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement )
        // InternalAnsic.g:4352:4: this_IF_5= RULE_IF kw= '(' this_expression_7= ruleexpression kw= ')' this_statement_9= rulestatement this_ELSE_10= RULE_ELSE this_statement_11= rulestatement
        {
        this_IF_5=(Token)match(input,RULE_IF,FOLLOW_9); if (state.failed) return ;
        kw=(Token)match(input,68,FOLLOW_3); if (state.failed) return ;
        pushFollow(FOLLOW_4);
        this_expression_7=ruleexpression();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,69,FOLLOW_45); if (state.failed) return ;
        pushFollow(FOLLOW_47);
        this_statement_9=rulestatement();

        state._fsp--;
        if (state.failed) return ;
        this_ELSE_10=(Token)match(input,RULE_ELSE,FOLLOW_45); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_statement_11=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred135_InternalAnsic

    // $ANTLR start synpred138_InternalAnsic
    public final void synpred138_InternalAnsic_fragment() throws RecognitionException {   
        Token this_FOR_12=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_statement_14 = null;

        AntlrDatatypeRuleToken this_expression_statement_15 = null;

        AntlrDatatypeRuleToken this_statement_17 = null;


        // InternalAnsic.g:4558:3: ( (this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement ) )
        // InternalAnsic.g:4558:3: (this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement )
        {
        // InternalAnsic.g:4558:3: (this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement )
        // InternalAnsic.g:4559:4: this_FOR_12= RULE_FOR kw= '(' this_expression_statement_14= ruleexpression_statement this_expression_statement_15= ruleexpression_statement kw= ')' this_statement_17= rulestatement
        {
        this_FOR_12=(Token)match(input,RULE_FOR,FOLLOW_9); if (state.failed) return ;
        kw=(Token)match(input,68,FOLLOW_49); if (state.failed) return ;
        pushFollow(FOLLOW_49);
        this_expression_statement_14=ruleexpression_statement();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_4);
        this_expression_statement_15=ruleexpression_statement();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,69,FOLLOW_45); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_statement_17=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred138_InternalAnsic

    // $ANTLR start synpred144_InternalAnsic
    public final void synpred144_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_function_definition_0 = null;


        // InternalAnsic.g:4828:3: (this_function_definition_0= rulefunction_definition )
        // InternalAnsic.g:4828:3: this_function_definition_0= rulefunction_definition
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getExternal_declarationAccess().getFunction_definitionParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_function_definition_0=rulefunction_definition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred144_InternalAnsic

    // $ANTLR start synpred145_InternalAnsic
    public final void synpred145_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declaration_specifiers_0 = null;

        AntlrDatatypeRuleToken this_declarator_1 = null;

        AntlrDatatypeRuleToken this_declaration_list_2 = null;

        AntlrDatatypeRuleToken this_compound_statement_3 = null;


        // InternalAnsic.g:4868:3: ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement ) )
        // InternalAnsic.g:4868:3: (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement )
        {
        // InternalAnsic.g:4868:3: (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement )
        // InternalAnsic.g:4869:4: this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaration_specifiersParserRuleCall_0_0());
          			
        }
        pushFollow(FOLLOW_28);
        this_declaration_specifiers_0=ruledeclaration_specifiers();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_37);
        this_declarator_1=ruledeclarator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_31);
        this_declaration_list_2=ruledeclaration_list();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_compound_statement_3=rulecompound_statement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred145_InternalAnsic

    // $ANTLR start synpred146_InternalAnsic
    public final void synpred146_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declaration_specifiers_4 = null;

        AntlrDatatypeRuleToken this_declarator_5 = null;

        AntlrDatatypeRuleToken this_compound_statement_6 = null;


        // InternalAnsic.g:4911:3: ( (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement ) )
        // InternalAnsic.g:4911:3: (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement )
        {
        // InternalAnsic.g:4911:3: (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement )
        // InternalAnsic.g:4912:4: this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaration_specifiersParserRuleCall_1_0());
          			
        }
        pushFollow(FOLLOW_28);
        this_declaration_specifiers_4=ruledeclaration_specifiers();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_31);
        this_declarator_5=ruledeclarator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_compound_statement_6=rulecompound_statement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred146_InternalAnsic

    // $ANTLR start synpred147_InternalAnsic
    public final void synpred147_InternalAnsic_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_declarator_7 = null;

        AntlrDatatypeRuleToken this_declaration_list_8 = null;

        AntlrDatatypeRuleToken this_compound_statement_9 = null;


        // InternalAnsic.g:4944:3: ( (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement ) )
        // InternalAnsic.g:4944:3: (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement )
        {
        // InternalAnsic.g:4944:3: (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement )
        // InternalAnsic.g:4945:4: this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFunction_definitionAccess().getDeclaratorParserRuleCall_2_0());
          			
        }
        pushFollow(FOLLOW_37);
        this_declarator_7=ruledeclarator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_31);
        this_declaration_list_8=ruledeclaration_list();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_compound_statement_9=rulecompound_statement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred147_InternalAnsic

    // Delegated rules

    public final boolean synpred22_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred145_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred145_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred146_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred128_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred144_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred144_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred147_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred147_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred134_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalAnsic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalAnsic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\5\15\uffff\1\0\2\uffff";
    static final String dfa_3s = "\1\117\15\uffff\1\0\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\4\uffff\1\2\1\3\1\4\6\uffff\1\5\1\6";
    static final String dfa_5s = "\16\uffff\1\0\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\7\1\16\61\uffff\3\1\10\uffff\1\1\3\uffff\1\1\1\uffff\6\10",
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
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "521:2: (this_postfix_expression_0= rulepostfix_expression | (this_INC_OP_1= RULE_INC_OP this_unary_expression_2= ruleunary_expression ) | (this_DEC_OP_3= RULE_DEC_OP this_unary_expression_4= ruleunary_expression ) | (this_unary_operator_5= ruleunary_operator this_cast_expression_6= rulecast_expression ) | (this_SIZEOF_7= RULE_SIZEOF this_unary_expression_8= ruleunary_expression ) | (this_SIZEOF_9= RULE_SIZEOF kw= '(' this_type_name_11= ruletype_name kw= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_14 = input.LA(1);

                         
                        int index5_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index5_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\20\uffff";
    static final String dfa_8s = "\1\5\4\uffff\1\0\12\uffff";
    static final String dfa_9s = "\1\117\4\uffff\1\0\12\uffff";
    static final String dfa_10s = "\1\uffff\1\1\15\uffff\1\2";
    static final String dfa_11s = "\5\uffff\1\0\12\uffff}>";
    static final String[] dfa_12s = {
            "\3\1\61\uffff\3\1\10\uffff\1\5\3\uffff\1\1\1\uffff\6\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "717:2: (this_unary_expression_0= ruleunary_expression | (kw= '(' this_type_name_2= ruletype_name kw= ')' this_cast_expression_4= rulecast_expression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalAnsic()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\1\5\16\0\2\uffff";
    static final String dfa_14s = "\1\117\16\0\2\uffff";
    static final String dfa_15s = "\17\uffff\1\1\1\2";
    static final String dfa_16s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\2\uffff}>";
    static final String[] dfa_17s = {
            "\1\6\1\7\1\16\61\uffff\1\1\1\4\1\2\10\uffff\1\5\3\uffff\1\3\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1455:2: (this_conditional_expression_0= ruleconditional_expression | (this_unary_expression_1= ruleunary_expression this_assignment_operator_2= ruleassignment_operator this_assignment_expression_3= ruleassignment_expression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA24_10 = input.LA(1);

                         
                        int index24_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA24_11 = input.LA(1);

                         
                        int index24_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA24_12 = input.LA(1);

                         
                        int index24_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA24_13 = input.LA(1);

                         
                        int index24_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA24_14 = input.LA(1);

                         
                        int index24_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAnsic()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index24_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_18s = "\24\uffff";
    static final String dfa_19s = "\1\37\17\0\4\uffff";
    static final String dfa_20s = "\1\132\17\0\4\uffff";
    static final String dfa_21s = "\20\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_22s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\4\uffff}>";
    static final String[] dfa_23s = {
            "\1\1\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\15\uffff\1\15\40\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_18;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "2328:2: ( (this_type_specifier_0= ruletype_specifier this_specifier_qualifier_list_1= rulespecifier_qualifier_list ) | this_type_specifier_2= ruletype_specifier | (this_type_qualifier_3= ruletype_qualifier this_specifier_qualifier_list_4= rulespecifier_qualifier_list ) | this_type_qualifier_5= ruletype_qualifier )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA39_9 = input.LA(1);

                         
                        int index39_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA39_10 = input.LA(1);

                         
                        int index39_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA39_11 = input.LA(1);

                         
                        int index39_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA39_12 = input.LA(1);

                         
                        int index39_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA39_13 = input.LA(1);

                         
                        int index39_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81_InternalAnsic()) ) {s = 16;}

                        else if ( (synpred82_InternalAnsic()) ) {s = 17;}

                         
                        input.seek(index39_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA39_14 = input.LA(1);

                         
                        int index39_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred83_InternalAnsic()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index39_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA39_15 = input.LA(1);

                         
                        int index39_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred83_InternalAnsic()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index39_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_24s = "\14\uffff";
    static final String dfa_25s = "\1\3\13\uffff";
    static final String dfa_26s = "\1\32\1\5\1\32\3\uffff\1\32\1\uffff\1\32\1\0\1\32\1\uffff";
    static final String dfa_27s = "\1\133\1\117\1\132\3\uffff\1\132\1\uffff\1\132\1\0\1\132\1\uffff";
    static final String dfa_28s = "\3\uffff\1\5\1\2\1\1\1\uffff\1\3\3\uffff\1\4";
    static final String dfa_29s = "\11\uffff\1\0\2\uffff}>";
    static final String[] dfa_30s = {
            "\22\3\15\uffff\1\3\12\uffff\1\2\1\3\1\1\2\uffff\1\3\15\uffff\5\3",
            "\3\5\61\uffff\3\5\10\uffff\1\5\2\uffff\1\4\1\5\1\uffff\6\5",
            "\22\7\15\uffff\1\6\13\uffff\1\3\24\uffff\1\7",
            "",
            "",
            "",
            "\22\7\15\uffff\1\7\12\uffff\1\7\1\11\1\7\2\uffff\1\10\1\uffff\1\7\16\uffff\1\7",
            "",
            "\23\7\14\uffff\1\12\40\uffff\1\7",
            "\1\uffff",
            "\22\7\15\uffff\1\7\12\uffff\1\7\1\11\1\7\2\uffff\1\10\1\uffff\1\7\16\uffff\1\7",
            ""
    };

    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_24;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "2906:2: ( (kw= '[' this_constant_expression_1= ruleconstant_expression kw= ']' this_direct_declaratorI_3= ruledirect_declaratorI ) | (kw= '[' kw= ']' this_direct_declaratorI_6= ruledirect_declaratorI ) | (kw= '(' this_parameter_type_list_8= ruleparameter_type_list kw= ')' this_direct_declaratorI_10= ruledirect_declaratorI ) | (kw= '(' this_identifier_list_12= ruleidentifier_list kw= ')' this_direct_declaratorI_14= ruledirect_declaratorI ) | (kw= '(' kw= ')' this_direct_declaratorI_17= ruledirect_declaratorI )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_9 = input.LA(1);

                         
                        int index49_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalAnsic()) ) {s = 7;}

                        else if ( (synpred97_InternalAnsic()) ) {s = 11;}

                         
                        input.seek(index49_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_31s = "\10\uffff";
    static final String dfa_32s = "\1\uffff\1\2\1\uffff\2\7\3\uffff";
    static final String dfa_33s = "\1\113\1\52\1\uffff\2\52\3\uffff";
    static final String dfa_34s = "\2\113\1\uffff\2\113\3\uffff";
    static final String dfa_35s = "\2\uffff\1\1\2\uffff\1\3\1\4\1\2";
    static final String dfa_36s = "\10\uffff}>";
    static final String[] dfa_37s = {
            "\1\1",
            "\1\3\1\4\15\uffff\1\2\12\uffff\3\2\2\uffff\1\2\1\uffff\1\5",
            "",
            "\1\3\1\4\15\uffff\1\7\12\uffff\3\7\2\uffff\1\7\1\uffff\1\6",
            "\1\3\1\4\15\uffff\1\7\12\uffff\3\7\2\uffff\1\7\1\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_31;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "3069:2: (kw= '*' | (kw= '*' this_type_qualifier_list_2= ruletype_qualifier_list ) | (kw= '*' this_pointer_4= rulepointer ) | (kw= '*' this_type_qualifier_list_6= ruletype_qualifier_list this_pointer_7= rulepointer ) )";
        }
    }
    static final String dfa_38s = "\30\uffff";
    static final String dfa_39s = "\1\32\24\0\3\uffff";
    static final String dfa_40s = "\1\132\24\0\3\uffff";
    static final String dfa_41s = "\25\uffff\1\1\1\2\1\3";
    static final String dfa_42s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\3\uffff}>";
    static final String[] dfa_43s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\23\1\24\15\uffff\1\22\40\uffff\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "3275:2: ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator ) | (this_declaration_specifiers_2= ruledeclaration_specifiers this_abstract_declarator_3= ruleabstract_declarator ) | this_declaration_specifiers_4= ruledeclaration_specifiers )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_6 = input.LA(1);

                         
                        int index54_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_8 = input.LA(1);

                         
                        int index54_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_11 = input.LA(1);

                         
                        int index54_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_12 = input.LA(1);

                         
                        int index54_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_13 = input.LA(1);

                         
                        int index54_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA54_14 = input.LA(1);

                         
                        int index54_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA54_15 = input.LA(1);

                         
                        int index54_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA54_16 = input.LA(1);

                         
                        int index54_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA54_17 = input.LA(1);

                         
                        int index54_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA54_18 = input.LA(1);

                         
                        int index54_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA54_19 = input.LA(1);

                         
                        int index54_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA54_20 = input.LA(1);

                         
                        int index54_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalAnsic()) ) {s = 21;}

                        else if ( (synpred106_InternalAnsic()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index54_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_44s = "\22\uffff";
    static final String dfa_45s = "\1\5\16\uffff\1\0\2\uffff";
    static final String dfa_46s = "\1\133\16\uffff\1\0\2\uffff";
    static final String dfa_47s = "\1\uffff\1\1\16\uffff\1\2\1\3";
    static final String dfa_48s = "\17\uffff\1\0\2\uffff}>";
    static final String[] dfa_49s = {
            "\3\1\61\uffff\3\1\10\uffff\1\1\3\uffff\1\1\1\uffff\6\1\13\uffff\1\17",
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
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3784:2: (this_assignment_expression_0= ruleassignment_expression | (kw= '{' this_initializer_list_2= ruleinitializer_list kw= '}' ) | (kw= '{' this_initializer_list_5= ruleinitializer_list kw= ',' kw= '}' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_15 = input.LA(1);

                         
                        int index61_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalAnsic()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index61_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_50s = "\61\uffff";
    static final String dfa_51s = "\1\1\60\uffff";
    static final String dfa_52s = "\1\5\1\uffff\1\0\56\uffff";
    static final String dfa_53s = "\1\134\1\uffff\1\0\56\uffff";
    static final String dfa_54s = "\1\uffff\1\2\34\uffff\1\1\22\uffff";
    static final String dfa_55s = "\2\uffff\1\0\56\uffff}>";
    static final String[] dfa_56s = {
            "\3\1\22\uffff\22\36\1\uffff\3\1\1\uffff\10\1\1\2\2\1\10\uffff\1\1\3\uffff\1\1\1\uffff\6\1\11\uffff\1\1\1\36\2\1",
            "",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_50;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "()+ loopback of 4210:2: (this_declaration_0= ruledeclaration )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalAnsic()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_57s = "\25\uffff\1\1\1\uffff\1\2";
    static final String[] dfa_58s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\23\1\24\15\uffff\1\22\12\uffff\1\25\6\uffff\1\25\16\uffff\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_57;
            this.special = dfa_42;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "4827:2: (this_function_definition_0= rulefunction_definition | this_declaration_1= ruledeclaration )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred144_InternalAnsic()) ) {s = 21;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_59s = "\33\uffff";
    static final String dfa_60s = "\1\32\26\0\4\uffff";
    static final String dfa_61s = "\1\132\26\0\4\uffff";
    static final String dfa_62s = "\27\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_63s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\4\uffff}>";
    static final String[] dfa_64s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\23\1\24\15\uffff\1\22\12\uffff\1\26\6\uffff\1\25\16\uffff\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_59;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "4867:2: ( (this_declaration_specifiers_0= ruledeclaration_specifiers this_declarator_1= ruledeclarator this_declaration_list_2= ruledeclaration_list this_compound_statement_3= rulecompound_statement ) | (this_declaration_specifiers_4= ruledeclaration_specifiers this_declarator_5= ruledeclarator this_compound_statement_6= rulecompound_statement ) | (this_declarator_7= ruledeclarator this_declaration_list_8= ruledeclaration_list this_compound_statement_9= rulecompound_statement ) | (this_declarator_10= ruledeclarator this_compound_statement_11= rulecompound_statement ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_10 = input.LA(1);

                         
                        int index74_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_11 = input.LA(1);

                         
                        int index74_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_13 = input.LA(1);

                         
                        int index74_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_14 = input.LA(1);

                         
                        int index74_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_15 = input.LA(1);

                         
                        int index74_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA74_16 = input.LA(1);

                         
                        int index74_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA74_17 = input.LA(1);

                         
                        int index74_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA74_18 = input.LA(1);

                         
                        int index74_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                        else if ( (synpred147_InternalAnsic()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index74_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA74_19 = input.LA(1);

                         
                        int index74_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA74_20 = input.LA(1);

                         
                        int index74_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalAnsic()) ) {s = 23;}

                        else if ( (synpred146_InternalAnsic()) ) {s = 24;}

                         
                        input.seek(index74_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA74_21 = input.LA(1);

                         
                        int index74_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred147_InternalAnsic()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index74_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA74_22 = input.LA(1);

                         
                        int index74_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred147_InternalAnsic()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index74_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\6\uffff";
    static final String dfa_66s = "\1\uffff\1\4\1\uffff\1\5\2\uffff";
    static final String dfa_67s = "\1\73\1\4\1\uffff\1\4\2\uffff";
    static final String dfa_68s = "\1\110\1\142\1\uffff\1\140\2\uffff";
    static final String dfa_69s = "\2\uffff\1\2\1\uffff\1\1\1\3";
    static final String dfa_70s = "\6\uffff}>";
    static final String[] dfa_71s = {
            "\1\1\14\uffff\1\2",
            "\3\4\1\uffff\22\4\41\uffff\1\1\10\uffff\4\4\1\3\5\4\2\uffff\12\4\2\uffff\1\4\2\uffff\4\4",
            "",
            "\3\5\1\uffff\22\5\37\uffff\1\4\1\uffff\1\2\1\5\7\uffff\12\5\2\uffff\12\5\2\uffff\5\5",
            "",
            ""
    };

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[][] dfa_71 = unpackEncodedStringArray(dfa_71s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_65;
            this.eof = dfa_66;
            this.min = dfa_67;
            this.max = dfa_68;
            this.accept = dfa_69;
            this.special = dfa_70;
            this.transition = dfa_71;
        }
        public String getDescription() {
            return "5173:2: ( ( (this_D_0= RULE_D )+ (this_IS_1= ruleIS )? ) | ( (this_D_2= RULE_D )* kw= '.' (this_D_4= RULE_D )+ (this_E_5= RULE_E )? (this_FS_6= ruleFS )? ) | ( (this_D_7= RULE_D )+ kw= '.' (this_E_9= RULE_E )? (this_FS_10= ruleFS )? ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0E000000000000E0L,0x000000000000FD10L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000070L,0x0000000000000150L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x02000FFF80000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000C02L,0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003FF0000L,0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000000000000L,0x0000000002000810L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x02000FFFFC000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000810L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0E000000000000E0L,0x000000000800FD10L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x02000FFF80000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L,0x0000000000800810L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x02000FFFFC000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000850L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000850L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0FFEE000000000E0L,0x000000000A00FD10L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0FFEE000000000E2L,0x000000000A00FD10L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0E000000000000E0L,0x000000000200FD10L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x02000FFFFC000002L,0x0000000004000810L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000780000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000000002L,0x0000000780000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1800000000000002L,0x00000001E0000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x00000001E0000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000002L,0x00000001E0000000L});

}