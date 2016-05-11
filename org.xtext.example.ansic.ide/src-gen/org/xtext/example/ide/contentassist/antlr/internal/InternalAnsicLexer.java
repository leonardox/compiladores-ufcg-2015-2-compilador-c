package org.xtext.example.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnsicLexer extends Lexer {
    public static final int RULE_A=12;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_HP=14;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=26;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_I_CONSTANT=23;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_IS=19;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_O=8;
    public static final int RULE_P=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_L=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int RULE_F_CONSTANT=24;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_H=13;
    public static final int T__40=40;
    public static final int RULE_E=15;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_D=9;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_CP=20;
    public static final int T__99=99;
    public static final int RULE_SP=21;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__29=29;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=25;
    public static final int RULE_ES=18;
    public static final int RULE_STRING_LITERAL=4;
    public static final int RULE_SL_COMMENT=27;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=22;
    public static final int RULE_FS=17;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_NZ=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalAnsicLexer() {;} 
    public InternalAnsicLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAnsicLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAnsic.g"; }

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:11:7: ( 'inline' )
            // InternalAnsic.g:11:9: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:12:7: ( '_Noreturn' )
            // InternalAnsic.g:12:9: '_Noreturn'
            {
            match("_Noreturn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:13:7: ( 'struct' )
            // InternalAnsic.g:13:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:14:7: ( 'union' )
            // InternalAnsic.g:14:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:15:7: ( 'typedef' )
            // InternalAnsic.g:15:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:16:7: ( 'extern' )
            // InternalAnsic.g:16:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:17:7: ( 'static' )
            // InternalAnsic.g:17:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:18:7: ( '_Thread_local' )
            // InternalAnsic.g:18:9: '_Thread_local'
            {
            match("_Thread_local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:19:7: ( 'auto' )
            // InternalAnsic.g:19:9: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:20:7: ( 'register' )
            // InternalAnsic.g:20:9: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:21:7: ( '*' )
            // InternalAnsic.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:22:7: ( ';' )
            // InternalAnsic.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:23:7: ( '=' )
            // InternalAnsic.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:24:7: ( '*=' )
            // InternalAnsic.g:24:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:25:7: ( '/=' )
            // InternalAnsic.g:25:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26:7: ( '%=' )
            // InternalAnsic.g:26:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:27:7: ( '+=' )
            // InternalAnsic.g:27:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:28:7: ( '-=' )
            // InternalAnsic.g:28:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:29:7: ( '<<=' )
            // InternalAnsic.g:29:9: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:30:7: ( '>>=' )
            // InternalAnsic.g:30:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:31:7: ( '&=' )
            // InternalAnsic.g:31:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:32:7: ( '^=' )
            // InternalAnsic.g:32:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:33:7: ( '|=' )
            // InternalAnsic.g:33:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:34:7: ( '&' )
            // InternalAnsic.g:34:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:35:7: ( '+' )
            // InternalAnsic.g:35:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:36:7: ( '-' )
            // InternalAnsic.g:36:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:37:7: ( '~' )
            // InternalAnsic.g:37:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:38:7: ( '!' )
            // InternalAnsic.g:38:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:39:7: ( '_Alignas' )
            // InternalAnsic.g:39:9: '_Alignas'
            {
            match("_Alignas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:40:7: ( '(' )
            // InternalAnsic.g:40:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:41:7: ( ')' )
            // InternalAnsic.g:41:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:42:7: ( 'enum' )
            // InternalAnsic.g:42:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:43:7: ( '{' )
            // InternalAnsic.g:43:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:44:7: ( '}' )
            // InternalAnsic.g:44:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:45:7: ( ',' )
            // InternalAnsic.g:45:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:46:7: ( '_Atomic' )
            // InternalAnsic.g:46:9: '_Atomic'
            {
            match("_Atomic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:47:7: ( ':' )
            // InternalAnsic.g:47:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:48:7: ( '[' )
            // InternalAnsic.g:48:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:49:7: ( ']' )
            // InternalAnsic.g:49:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:50:7: ( '...' )
            // InternalAnsic.g:50:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:51:7: ( '.' )
            // InternalAnsic.g:51:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:52:7: ( '_Static_assert' )
            // InternalAnsic.g:52:9: '_Static_assert'
            {
            match("_Static_assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:53:7: ( '->' )
            // InternalAnsic.g:53:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:54:7: ( '++' )
            // InternalAnsic.g:54:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:55:7: ( '--' )
            // InternalAnsic.g:55:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:56:7: ( 'sizeof' )
            // InternalAnsic.g:56:9: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:57:7: ( '_Alignof' )
            // InternalAnsic.g:57:9: '_Alignof'
            {
            match("_Alignof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:58:7: ( '/' )
            // InternalAnsic.g:58:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:59:7: ( '%' )
            // InternalAnsic.g:59:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:60:7: ( '<<' )
            // InternalAnsic.g:60:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:61:7: ( '>>' )
            // InternalAnsic.g:61:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:62:7: ( '==' )
            // InternalAnsic.g:62:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:63:7: ( '!=' )
            // InternalAnsic.g:63:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:64:7: ( 'goto' )
            // InternalAnsic.g:64:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:65:7: ( 'continue' )
            // InternalAnsic.g:65:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:66:7: ( 'break' )
            // InternalAnsic.g:66:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:67:7: ( 'return' )
            // InternalAnsic.g:67:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:68:7: ( 'while' )
            // InternalAnsic.g:68:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:69:7: ( 'do' )
            // InternalAnsic.g:69:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:70:7: ( 'for' )
            // InternalAnsic.g:70:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:71:7: ( 'if' )
            // InternalAnsic.g:71:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:72:7: ( 'else' )
            // InternalAnsic.g:72:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:73:7: ( 'switch' )
            // InternalAnsic.g:73:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:74:7: ( 'case' )
            // InternalAnsic.g:74:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:75:7: ( 'default' )
            // InternalAnsic.g:75:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:76:7: ( '^' )
            // InternalAnsic.g:76:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:77:7: ( '|' )
            // InternalAnsic.g:77:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:78:7: ( 'and' )
            // InternalAnsic.g:78:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:79:7: ( 'or' )
            // InternalAnsic.g:79:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:80:7: ( '?' )
            // InternalAnsic.g:80:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:81:7: ( 'const' )
            // InternalAnsic.g:81:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:82:8: ( 'restrict' )
            // InternalAnsic.g:82:10: 'restrict'
            {
            match("restrict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:83:8: ( 'volatile' )
            // InternalAnsic.g:83:10: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:84:8: ( 'void' )
            // InternalAnsic.g:84:10: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:85:8: ( 'char' )
            // InternalAnsic.g:85:10: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:86:8: ( 'short' )
            // InternalAnsic.g:86:10: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:87:8: ( 'int' )
            // InternalAnsic.g:87:10: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:88:8: ( 'long' )
            // InternalAnsic.g:88:10: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:89:8: ( 'float' )
            // InternalAnsic.g:89:10: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:90:8: ( 'double' )
            // InternalAnsic.g:90:10: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:91:8: ( 'signed' )
            // InternalAnsic.g:91:10: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:92:8: ( 'unsigned' )
            // InternalAnsic.g:92:10: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:93:8: ( 'bool' )
            // InternalAnsic.g:93:10: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:94:8: ( '_Complex' )
            // InternalAnsic.g:94:10: '_Complex'
            {
            match("_Complex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:95:8: ( '_Imaginary' )
            // InternalAnsic.g:95:10: '_Imaginary'
            {
            match("_Imaginary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:96:8: ( '_Generic' )
            // InternalAnsic.g:96:10: '_Generic'
            {
            match("_Generic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:97:8: ( '__func__' )
            // InternalAnsic.g:97:10: '__func__'
            {
            match("__func__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26695:12: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // InternalAnsic.g:26695:14: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // InternalAnsic.g:26695:14: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnsic.g:26695:15: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('.'); 
            // InternalAnsic.g:26695:30: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAnsic.g:26695:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_O"
    public final void mRULE_O() throws RecognitionException {
        try {
            // InternalAnsic.g:26697:17: ( '0' .. '7' )
            // InternalAnsic.g:26697:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_O"

    // $ANTLR start "RULE_D"
    public final void mRULE_D() throws RecognitionException {
        try {
            // InternalAnsic.g:26699:17: ( '0' .. '9' )
            // InternalAnsic.g:26699:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_D"

    // $ANTLR start "RULE_NZ"
    public final void mRULE_NZ() throws RecognitionException {
        try {
            // InternalAnsic.g:26701:18: ( '1' .. '9' )
            // InternalAnsic.g:26701:20: '1' .. '9'
            {
            matchRange('1','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NZ"

    // $ANTLR start "RULE_L"
    public final void mRULE_L() throws RecognitionException {
        try {
            int _type = RULE_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26703:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalAnsic.g:26703:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L"

    // $ANTLR start "RULE_A"
    public final void mRULE_A() throws RecognitionException {
        try {
            // InternalAnsic.g:26705:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' ) )
            // InternalAnsic.g:26705:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            {
            // InternalAnsic.g:26705:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            int alt3=4;
            switch ( input.LA(1) ) {
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
                {
                alt3=2;
                }
                break;
            case '_':
                {
                alt3=3;
                }
                break;
            case '0':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAnsic.g:26705:20: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:26705:29: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:26705:38: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:26705:42: '0' '..' '9'
                    {
                    match('0'); 
                    match(".."); 

                    match('9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_A"

    // $ANTLR start "RULE_H"
    public final void mRULE_H() throws RecognitionException {
        try {
            // InternalAnsic.g:26707:17: ( ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' ) )
            // InternalAnsic.g:26707:19: ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' )
            {
            // InternalAnsic.g:26707:19: ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                {
                alt4=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                {
                alt4=2;
                }
                break;
            case '0':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAnsic.g:26707:20: 'a' .. 'f'
                    {
                    matchRange('a','f'); 

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:26707:29: 'A' .. 'F'
                    {
                    matchRange('A','F'); 

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:26707:38: '0' '..' '9'
                    {
                    match('0'); 
                    match(".."); 

                    match('9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_H"

    // $ANTLR start "RULE_HP"
    public final void mRULE_HP() throws RecognitionException {
        try {
            // InternalAnsic.g:26709:18: ( '0' ( 'x' | 'X' ) )
            // InternalAnsic.g:26709:20: '0' ( 'x' | 'X' )
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HP"

    // $ANTLR start "RULE_E"
    public final void mRULE_E() throws RecognitionException {
        try {
            // InternalAnsic.g:26711:17: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+' )
            // InternalAnsic.g:26711:19: ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+'
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAnsic.g:26711:29: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAnsic.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_D(); 
            match('+'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_E"

    // $ANTLR start "RULE_P"
    public final void mRULE_P() throws RecognitionException {
        try {
            // InternalAnsic.g:26713:17: ( ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+' )
            // InternalAnsic.g:26713:19: ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+'
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAnsic.g:26713:29: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAnsic.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('{'); 
            mRULE_D(); 
            match('}'); 
            match('+'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_P"

    // $ANTLR start "RULE_FS"
    public final void mRULE_FS() throws RecognitionException {
        try {
            // InternalAnsic.g:26715:18: ( ( 'f' | 'F' | 'l' | 'L' ) )
            // InternalAnsic.g:26715:20: ( 'f' | 'F' | 'l' | 'L' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FS"

    // $ANTLR start "RULE_ES"
    public final void mRULE_ES() throws RecognitionException {
        try {
            // InternalAnsic.g:26717:18: ( RULE_A )
            // InternalAnsic.g:26717:20: RULE_A
            {
            mRULE_A(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ES"

    // $ANTLR start "RULE_IS"
    public final void mRULE_IS() throws RecognitionException {
        try {
            // InternalAnsic.g:26719:18: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? ) )
            // InternalAnsic.g:26719:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            {
            // InternalAnsic.g:26719:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='U'||LA10_0=='u') ) {
                alt10=1;
            }
            else if ( (LA10_0=='L'||LA10_0=='l') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAnsic.g:26719:21: ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalAnsic.g:26719:31: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    int alt7=5;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='l') ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1=='l') ) {
                            alt7=3;
                        }
                    }
                    else if ( (LA7_0=='L') ) {
                        int LA7_2 = input.LA(2);

                        if ( (LA7_2=='L') ) {
                            alt7=4;
                        }
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalAnsic.g:26719:32: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalAnsic.g:26719:36: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalAnsic.g:26719:40: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalAnsic.g:26719:48: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:26719:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )?
                    {
                    // InternalAnsic.g:26719:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )
                    int alt8=4;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='l') ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1=='l') ) {
                            alt8=3;
                        }
                        else {
                            alt8=1;}
                    }
                    else if ( (LA8_0=='L') ) {
                        int LA8_2 = input.LA(2);

                        if ( (LA8_2=='L') ) {
                            alt8=4;
                        }
                        else {
                            alt8=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAnsic.g:26719:59: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalAnsic.g:26719:63: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalAnsic.g:26719:67: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalAnsic.g:26719:75: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }

                    // InternalAnsic.g:26719:84: ( 'u' | 'U' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='U'||LA9_0=='u') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAnsic.g:
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IS"

    // $ANTLR start "RULE_CP"
    public final void mRULE_CP() throws RecognitionException {
        try {
            // InternalAnsic.g:26721:18: ( ( 'u' | 'U' | 'L' ) )
            // InternalAnsic.g:26721:20: ( 'u' | 'U' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CP"

    // $ANTLR start "RULE_SP"
    public final void mRULE_SP() throws RecognitionException {
        try {
            // InternalAnsic.g:26723:18: ( ( 'u' '8' | 'u' | 'U' | 'L' ) )
            // InternalAnsic.g:26723:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            {
            // InternalAnsic.g:26723:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='8') ) {
                    alt11=1;
                }
                else {
                    alt11=2;}
                }
                break;
            case 'U':
                {
                alt11=3;
                }
                break;
            case 'L':
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAnsic.g:26723:21: 'u' '8'
                    {
                    match('u'); 
                    match('8'); 

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:26723:29: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:26723:33: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:26723:37: 'L'
                    {
                    match('L'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SP"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26725:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // InternalAnsic.g:26725:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // InternalAnsic.g:26725:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||(LA12_0>='\f' && LA12_0<='\r')||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAnsic.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_I_CONSTANT"
    public final void mRULE_I_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_I_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26727:17: ( ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' ) )
            // InternalAnsic.g:26727:19: ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            {
            // InternalAnsic.g:26727:19: ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case '0':
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='X'||LA18_1=='x') ) {
                    alt18=1;
                }
                else if ( ((LA18_1>='0' && LA18_1<='7')) ) {
                    alt18=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
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
                alt18=2;
                }
                break;
            case '\'':
            case 'L':
            case 'U':
            case 'u':
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAnsic.g:26727:20: RULE_HP RULE_H '+' ( RULE_IS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    // InternalAnsic.g:26727:39: ( RULE_IS )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='L'||LA13_0=='U'||LA13_0=='l'||LA13_0=='u') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalAnsic.g:26727:39: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:26727:48: RULE_NZ RULE_D '*' ( RULE_IS )?
                    {
                    mRULE_NZ(); 
                    mRULE_D(); 
                    match('*'); 
                    // InternalAnsic.g:26727:67: ( RULE_IS )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='L'||LA14_0=='U'||LA14_0=='l'||LA14_0=='u') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAnsic.g:26727:67: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:26727:76: '0' RULE_O '*' ( RULE_IS )?
                    {
                    match('0'); 
                    mRULE_O(); 
                    match('*'); 
                    // InternalAnsic.g:26727:91: ( RULE_IS )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='L'||LA15_0=='U'||LA15_0=='l'||LA15_0=='u') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAnsic.g:26727:91: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:26727:100: ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\''
                    {
                    // InternalAnsic.g:26727:100: ( RULE_CP )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='L'||LA16_0=='U'||LA16_0=='u') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAnsic.g:26727:100: RULE_CP
                            {
                            mRULE_CP(); 

                            }
                            break;

                    }

                    match('\''); 
                    // InternalAnsic.g:26727:114: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=3;
                        switch ( input.LA(1) ) {
                        case '\'':
                            {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1=='\n'||LA17_1=='\''||LA17_1=='0'||(LA17_1>='A' && LA17_1<='Z')||LA17_1=='\\'||(LA17_1>='^' && LA17_1<='_')||(LA17_1>='a' && LA17_1<='z')) ) {
                                alt17=1;
                            }


                            }
                            break;
                        case '\n':
                        case '\\':
                        case '^':
                            {
                            alt17=1;
                            }
                            break;
                        case '0':
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
                        case '_':
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
                            alt17=2;
                            }
                            break;

                        }

                        switch (alt17) {
                    	case 1 :
                    	    // InternalAnsic.g:26727:115: ( '^' | '\\'' | '\\\\' | '\\n' )
                    	    {
                    	    if ( input.LA(1)=='\n'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='^' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnsic.g:26727:136: RULE_ES
                    	    {
                    	    mRULE_ES(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_I_CONSTANT"

    // $ANTLR start "RULE_F_CONSTANT"
    public final void mRULE_F_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_F_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26729:17: ( ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? ) )
            // InternalAnsic.g:26729:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )
            {
            // InternalAnsic.g:26729:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )
            int alt27=5;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalAnsic.g:26729:20: RULE_D '+' RULE_E ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('+'); 
                    mRULE_E(); 
                    // InternalAnsic.g:26729:38: ( RULE_FS )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='F'||LA19_0=='L'||LA19_0=='f'||LA19_0=='l') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAnsic.g:26729:38: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:26729:47: RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('*'); 
                    match('.'); 
                    mRULE_D(); 
                    match('+'); 
                    // InternalAnsic.g:26729:73: ( RULE_E )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAnsic.g:26729:73: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalAnsic.g:26729:81: ( RULE_FS )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='F'||LA21_0=='L'||LA21_0=='f'||LA21_0=='l') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAnsic.g:26729:81: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:26729:90: RULE_D '+' '.' ( RULE_E )? ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('+'); 
                    match('.'); 
                    // InternalAnsic.g:26729:105: ( RULE_E )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='E'||LA22_0=='e') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAnsic.g:26729:105: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalAnsic.g:26729:113: ( RULE_FS )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='F'||LA23_0=='L'||LA23_0=='f'||LA23_0=='l') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAnsic.g:26729:113: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:26729:122: RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    mRULE_P(); 
                    // InternalAnsic.g:26729:148: ( RULE_FS )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='F'||LA24_0=='L'||LA24_0=='f'||LA24_0=='l') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAnsic.g:26729:148: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }

                    mRULE_HP(); 
                    mRULE_H(); 
                    match('*'); 
                    match('.'); 
                    mRULE_H(); 
                    match('+'); 
                    mRULE_P(); 
                    // InternalAnsic.g:26729:198: ( RULE_FS )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='F'||LA25_0=='L'||LA25_0=='f'||LA25_0=='l') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAnsic.g:26729:198: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // InternalAnsic.g:26729:207: RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    match('.'); 
                    mRULE_P(); 
                    // InternalAnsic.g:26729:237: ( RULE_FS )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='F'||LA26_0=='L'||LA26_0=='f'||LA26_0=='l') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAnsic.g:26729:237: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_F_CONSTANT"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26731:21: ( ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+ )
            // InternalAnsic.g:26731:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            {
            // InternalAnsic.g:26731:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='\"'||LA31_0=='L'||LA31_0=='U'||LA31_0=='u') ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAnsic.g:26731:24: ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )*
            	    {
            	    // InternalAnsic.g:26731:24: ( RULE_SP )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0=='L'||LA28_0=='U'||LA28_0=='u') ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalAnsic.g:26731:24: RULE_SP
            	            {
            	            mRULE_SP(); 

            	            }
            	            break;

            	    }

            	    match('\"'); 
            	    // InternalAnsic.g:26731:37: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )*
            	    loop29:
            	    do {
            	        int alt29=3;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0=='\n'||LA29_0=='\''||LA29_0=='\\'||LA29_0=='^') ) {
            	            alt29=1;
            	        }
            	        else if ( (LA29_0=='0'||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')) ) {
            	            alt29=2;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalAnsic.g:26731:38: ( '^' | '\\'' | '\\\\' | '\\n' )
            	    	    {
            	    	    if ( input.LA(1)=='\n'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='^' ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalAnsic.g:26731:59: RULE_ES
            	    	    {
            	    	    mRULE_ES(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);

            	    match('\"'); 
            	    // InternalAnsic.g:26731:73: ( RULE_WS )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( ((LA30_0>='\t' && LA30_0<='\n')||(LA30_0>='\f' && LA30_0<='\r')||LA30_0==' ') ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalAnsic.g:26731:73: RULE_WS
            	    	    {
            	    	    mRULE_WS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26733:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAnsic.g:26733:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAnsic.g:26733:11: ( '^' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='^') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnsic.g:26733:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAnsic.g:26733:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='0' && LA33_0<='9')||(LA33_0>='A' && LA33_0<='Z')||LA33_0=='_'||(LA33_0>='a' && LA33_0<='z')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAnsic.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26735:10: ( ( '0' .. '9' )+ )
            // InternalAnsic.g:26735:12: ( '0' .. '9' )+
            {
            // InternalAnsic.g:26735:12: ( '0' .. '9' )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='0' && LA34_0<='9')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAnsic.g:26735:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26737:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAnsic.g:26737:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAnsic.g:26737:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\"') ) {
                alt37=1;
            }
            else if ( (LA37_0=='\'') ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnsic.g:26737:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAnsic.g:26737:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop35:
                    do {
                        int alt35=3;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0=='\\') ) {
                            alt35=1;
                        }
                        else if ( ((LA35_0>='\u0000' && LA35_0<='!')||(LA35_0>='#' && LA35_0<='[')||(LA35_0>=']' && LA35_0<='\uFFFF')) ) {
                            alt35=2;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAnsic.g:26737:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnsic.g:26737:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:26737:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAnsic.g:26737:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop36:
                    do {
                        int alt36=3;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0=='\\') ) {
                            alt36=1;
                        }
                        else if ( ((LA36_0>='\u0000' && LA36_0<='&')||(LA36_0>='(' && LA36_0<='[')||(LA36_0>=']' && LA36_0<='\uFFFF')) ) {
                            alt36=2;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAnsic.g:26737:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnsic.g:26737:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26739:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAnsic.g:26739:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAnsic.g:26739:24: ( options {greedy=false; } : . )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0=='*') ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1=='/') ) {
                        alt38=2;
                    }
                    else if ( ((LA38_1>='\u0000' && LA38_1<='.')||(LA38_1>='0' && LA38_1<='\uFFFF')) ) {
                        alt38=1;
                    }


                }
                else if ( ((LA38_0>='\u0000' && LA38_0<=')')||(LA38_0>='+' && LA38_0<='\uFFFF')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAnsic.g:26739:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26741:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAnsic.g:26741:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAnsic.g:26741:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='\u0000' && LA39_0<='\t')||(LA39_0>='\u000B' && LA39_0<='\f')||(LA39_0>='\u000E' && LA39_0<='\uFFFF')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAnsic.g:26741:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalAnsic.g:26741:40: ( ( '\\r' )? '\\n' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\n'||LA41_0=='\r') ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAnsic.g:26741:41: ( '\\r' )? '\\n'
                    {
                    // InternalAnsic.g:26741:41: ( '\\r' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='\r') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalAnsic.g:26741:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:26743:16: ( . )
            // InternalAnsic.g:26743:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalAnsic.g:1:8: ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_FLOAT | RULE_L | RULE_WS | RULE_I_CONSTANT | RULE_F_CONSTANT | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt42=99;
        alt42 = dfa42.predict(input);
        switch (alt42) {
            case 1 :
                // InternalAnsic.g:1:10: T__29
                {
                mT__29(); 

                }
                break;
            case 2 :
                // InternalAnsic.g:1:16: T__30
                {
                mT__30(); 

                }
                break;
            case 3 :
                // InternalAnsic.g:1:22: T__31
                {
                mT__31(); 

                }
                break;
            case 4 :
                // InternalAnsic.g:1:28: T__32
                {
                mT__32(); 

                }
                break;
            case 5 :
                // InternalAnsic.g:1:34: T__33
                {
                mT__33(); 

                }
                break;
            case 6 :
                // InternalAnsic.g:1:40: T__34
                {
                mT__34(); 

                }
                break;
            case 7 :
                // InternalAnsic.g:1:46: T__35
                {
                mT__35(); 

                }
                break;
            case 8 :
                // InternalAnsic.g:1:52: T__36
                {
                mT__36(); 

                }
                break;
            case 9 :
                // InternalAnsic.g:1:58: T__37
                {
                mT__37(); 

                }
                break;
            case 10 :
                // InternalAnsic.g:1:64: T__38
                {
                mT__38(); 

                }
                break;
            case 11 :
                // InternalAnsic.g:1:70: T__39
                {
                mT__39(); 

                }
                break;
            case 12 :
                // InternalAnsic.g:1:76: T__40
                {
                mT__40(); 

                }
                break;
            case 13 :
                // InternalAnsic.g:1:82: T__41
                {
                mT__41(); 

                }
                break;
            case 14 :
                // InternalAnsic.g:1:88: T__42
                {
                mT__42(); 

                }
                break;
            case 15 :
                // InternalAnsic.g:1:94: T__43
                {
                mT__43(); 

                }
                break;
            case 16 :
                // InternalAnsic.g:1:100: T__44
                {
                mT__44(); 

                }
                break;
            case 17 :
                // InternalAnsic.g:1:106: T__45
                {
                mT__45(); 

                }
                break;
            case 18 :
                // InternalAnsic.g:1:112: T__46
                {
                mT__46(); 

                }
                break;
            case 19 :
                // InternalAnsic.g:1:118: T__47
                {
                mT__47(); 

                }
                break;
            case 20 :
                // InternalAnsic.g:1:124: T__48
                {
                mT__48(); 

                }
                break;
            case 21 :
                // InternalAnsic.g:1:130: T__49
                {
                mT__49(); 

                }
                break;
            case 22 :
                // InternalAnsic.g:1:136: T__50
                {
                mT__50(); 

                }
                break;
            case 23 :
                // InternalAnsic.g:1:142: T__51
                {
                mT__51(); 

                }
                break;
            case 24 :
                // InternalAnsic.g:1:148: T__52
                {
                mT__52(); 

                }
                break;
            case 25 :
                // InternalAnsic.g:1:154: T__53
                {
                mT__53(); 

                }
                break;
            case 26 :
                // InternalAnsic.g:1:160: T__54
                {
                mT__54(); 

                }
                break;
            case 27 :
                // InternalAnsic.g:1:166: T__55
                {
                mT__55(); 

                }
                break;
            case 28 :
                // InternalAnsic.g:1:172: T__56
                {
                mT__56(); 

                }
                break;
            case 29 :
                // InternalAnsic.g:1:178: T__57
                {
                mT__57(); 

                }
                break;
            case 30 :
                // InternalAnsic.g:1:184: T__58
                {
                mT__58(); 

                }
                break;
            case 31 :
                // InternalAnsic.g:1:190: T__59
                {
                mT__59(); 

                }
                break;
            case 32 :
                // InternalAnsic.g:1:196: T__60
                {
                mT__60(); 

                }
                break;
            case 33 :
                // InternalAnsic.g:1:202: T__61
                {
                mT__61(); 

                }
                break;
            case 34 :
                // InternalAnsic.g:1:208: T__62
                {
                mT__62(); 

                }
                break;
            case 35 :
                // InternalAnsic.g:1:214: T__63
                {
                mT__63(); 

                }
                break;
            case 36 :
                // InternalAnsic.g:1:220: T__64
                {
                mT__64(); 

                }
                break;
            case 37 :
                // InternalAnsic.g:1:226: T__65
                {
                mT__65(); 

                }
                break;
            case 38 :
                // InternalAnsic.g:1:232: T__66
                {
                mT__66(); 

                }
                break;
            case 39 :
                // InternalAnsic.g:1:238: T__67
                {
                mT__67(); 

                }
                break;
            case 40 :
                // InternalAnsic.g:1:244: T__68
                {
                mT__68(); 

                }
                break;
            case 41 :
                // InternalAnsic.g:1:250: T__69
                {
                mT__69(); 

                }
                break;
            case 42 :
                // InternalAnsic.g:1:256: T__70
                {
                mT__70(); 

                }
                break;
            case 43 :
                // InternalAnsic.g:1:262: T__71
                {
                mT__71(); 

                }
                break;
            case 44 :
                // InternalAnsic.g:1:268: T__72
                {
                mT__72(); 

                }
                break;
            case 45 :
                // InternalAnsic.g:1:274: T__73
                {
                mT__73(); 

                }
                break;
            case 46 :
                // InternalAnsic.g:1:280: T__74
                {
                mT__74(); 

                }
                break;
            case 47 :
                // InternalAnsic.g:1:286: T__75
                {
                mT__75(); 

                }
                break;
            case 48 :
                // InternalAnsic.g:1:292: T__76
                {
                mT__76(); 

                }
                break;
            case 49 :
                // InternalAnsic.g:1:298: T__77
                {
                mT__77(); 

                }
                break;
            case 50 :
                // InternalAnsic.g:1:304: T__78
                {
                mT__78(); 

                }
                break;
            case 51 :
                // InternalAnsic.g:1:310: T__79
                {
                mT__79(); 

                }
                break;
            case 52 :
                // InternalAnsic.g:1:316: T__80
                {
                mT__80(); 

                }
                break;
            case 53 :
                // InternalAnsic.g:1:322: T__81
                {
                mT__81(); 

                }
                break;
            case 54 :
                // InternalAnsic.g:1:328: T__82
                {
                mT__82(); 

                }
                break;
            case 55 :
                // InternalAnsic.g:1:334: T__83
                {
                mT__83(); 

                }
                break;
            case 56 :
                // InternalAnsic.g:1:340: T__84
                {
                mT__84(); 

                }
                break;
            case 57 :
                // InternalAnsic.g:1:346: T__85
                {
                mT__85(); 

                }
                break;
            case 58 :
                // InternalAnsic.g:1:352: T__86
                {
                mT__86(); 

                }
                break;
            case 59 :
                // InternalAnsic.g:1:358: T__87
                {
                mT__87(); 

                }
                break;
            case 60 :
                // InternalAnsic.g:1:364: T__88
                {
                mT__88(); 

                }
                break;
            case 61 :
                // InternalAnsic.g:1:370: T__89
                {
                mT__89(); 

                }
                break;
            case 62 :
                // InternalAnsic.g:1:376: T__90
                {
                mT__90(); 

                }
                break;
            case 63 :
                // InternalAnsic.g:1:382: T__91
                {
                mT__91(); 

                }
                break;
            case 64 :
                // InternalAnsic.g:1:388: T__92
                {
                mT__92(); 

                }
                break;
            case 65 :
                // InternalAnsic.g:1:394: T__93
                {
                mT__93(); 

                }
                break;
            case 66 :
                // InternalAnsic.g:1:400: T__94
                {
                mT__94(); 

                }
                break;
            case 67 :
                // InternalAnsic.g:1:406: T__95
                {
                mT__95(); 

                }
                break;
            case 68 :
                // InternalAnsic.g:1:412: T__96
                {
                mT__96(); 

                }
                break;
            case 69 :
                // InternalAnsic.g:1:418: T__97
                {
                mT__97(); 

                }
                break;
            case 70 :
                // InternalAnsic.g:1:424: T__98
                {
                mT__98(); 

                }
                break;
            case 71 :
                // InternalAnsic.g:1:430: T__99
                {
                mT__99(); 

                }
                break;
            case 72 :
                // InternalAnsic.g:1:436: T__100
                {
                mT__100(); 

                }
                break;
            case 73 :
                // InternalAnsic.g:1:443: T__101
                {
                mT__101(); 

                }
                break;
            case 74 :
                // InternalAnsic.g:1:450: T__102
                {
                mT__102(); 

                }
                break;
            case 75 :
                // InternalAnsic.g:1:457: T__103
                {
                mT__103(); 

                }
                break;
            case 76 :
                // InternalAnsic.g:1:464: T__104
                {
                mT__104(); 

                }
                break;
            case 77 :
                // InternalAnsic.g:1:471: T__105
                {
                mT__105(); 

                }
                break;
            case 78 :
                // InternalAnsic.g:1:478: T__106
                {
                mT__106(); 

                }
                break;
            case 79 :
                // InternalAnsic.g:1:485: T__107
                {
                mT__107(); 

                }
                break;
            case 80 :
                // InternalAnsic.g:1:492: T__108
                {
                mT__108(); 

                }
                break;
            case 81 :
                // InternalAnsic.g:1:499: T__109
                {
                mT__109(); 

                }
                break;
            case 82 :
                // InternalAnsic.g:1:506: T__110
                {
                mT__110(); 

                }
                break;
            case 83 :
                // InternalAnsic.g:1:513: T__111
                {
                mT__111(); 

                }
                break;
            case 84 :
                // InternalAnsic.g:1:520: T__112
                {
                mT__112(); 

                }
                break;
            case 85 :
                // InternalAnsic.g:1:527: T__113
                {
                mT__113(); 

                }
                break;
            case 86 :
                // InternalAnsic.g:1:534: T__114
                {
                mT__114(); 

                }
                break;
            case 87 :
                // InternalAnsic.g:1:541: T__115
                {
                mT__115(); 

                }
                break;
            case 88 :
                // InternalAnsic.g:1:548: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 89 :
                // InternalAnsic.g:1:559: RULE_L
                {
                mRULE_L(); 

                }
                break;
            case 90 :
                // InternalAnsic.g:1:566: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 91 :
                // InternalAnsic.g:1:574: RULE_I_CONSTANT
                {
                mRULE_I_CONSTANT(); 

                }
                break;
            case 92 :
                // InternalAnsic.g:1:590: RULE_F_CONSTANT
                {
                mRULE_F_CONSTANT(); 

                }
                break;
            case 93 :
                // InternalAnsic.g:1:606: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 94 :
                // InternalAnsic.g:1:626: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 95 :
                // InternalAnsic.g:1:634: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 96 :
                // InternalAnsic.g:1:643: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 97 :
                // InternalAnsic.g:1:655: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 98 :
                // InternalAnsic.g:1:671: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 99 :
                // InternalAnsic.g:1:687: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA27_eotS =
        "\21\uffff";
    static final String DFA27_eofS =
        "\21\uffff";
    static final String DFA27_minS =
        "\1\60\2\52\1\60\1\uffff\1\56\2\53\1\56\2\uffff\2\56\2\uffff\1\71\1\53";
    static final String DFA27_maxS =
        "\1\71\1\170\1\53\1\146\1\uffff\1\145\2\53\1\56\2\uffff\1\160\1\56\2\uffff\1\71\1\53";
    static final String DFA27_acceptS =
        "\4\uffff\1\2\4\uffff\1\3\1\1\2\uffff\1\5\1\4\2\uffff";
    static final String DFA27_specialS =
        "\21\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\11\2",
            "\1\4\1\5\54\uffff\1\3\37\uffff\1\3",
            "\1\4\1\5",
            "\1\10\20\uffff\6\7\32\uffff\6\6",
            "",
            "\1\11\26\uffff\1\12\37\uffff\1\12",
            "\1\13",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\15\41\uffff\1\16\37\uffff\1\16",
            "\1\17",
            "",
            "",
            "\1\20",
            "\1\13"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "26729:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )";
        }
    }
    static final String DFA42_eotS =
        "\1\uffff\10\65\1\117\1\uffff\1\122\1\126\1\130\1\133\1\137\2\62\1\143\1\145\1\147\1\uffff\1\152\10\uffff\1\164\7\65\1\uffff\2\65\1\u0085\1\65\1\uffff\1\u0085\1\65\1\62\1\65\1\62\1\uffff\1\66\1\u009d\2\uffff\16\66\2\uffff\7\66\22\uffff\1\u00b9\1\u00bb\23\uffff\7\66\1\u00c4\3\66\1\u00c8\1\uffff\2\66\3\uffff\1\u0085\1\uffff\1\u0085\1\uffff\1\u0085\2\uffff\1\u0093\14\uffff\1\66\1\u00df\1\uffff\26\66\1\u00f6\3\66\4\uffff\10\66\1\uffff\1\66\1\u0104\1\66\1\uffff\3\66\3\uffff\1\105\7\uffff\1\106\6\uffff\1\66\1\uffff\23\66\1\u0126\1\u0127\1\u0128\1\uffff\3\66\1\u012c\2\66\1\u012f\1\u0130\1\66\1\u0132\3\66\1\uffff\2\66\1\u0138\1\u0139\1\105\2\uffff\1\u0093\1\106\4\uffff\17\66\1\u014d\1\u014e\3\66\3\uffff\3\66\1\uffff\1\66\1\u0156\2\uffff\1\u0157\1\uffff\1\u0158\2\66\1\u015b\1\66\6\uffff\1\u015e\11\66\1\u0169\1\u016a\1\u016b\1\u016c\1\u016d\2\uffff\2\66\1\u0170\1\66\1\u0172\2\66\3\uffff\1\u0175\1\66\1\uffff\1\66\2\uffff\4\66\1\u017c\5\66\5\uffff\1\66\1\u0183\1\uffff\1\66\1\uffff\2\66\1\uffff\1\u0187\3\66\1\u018b\1\u018c\1\uffff\1\66\1\u018e\1\66\1\u0190\1\u0191\1\u0192\1\uffff\1\u0193\1\u0194\1\u0195\1\uffff\1\u0196\1\u0197\1\66\2\uffff\1\66\1\uffff\1\66\10\uffff\2\66\1\u019d\2\66\1\uffff\2\66\1\u01a2\1\66\1\uffff\1\u01a4\1\uffff";
    static final String DFA42_eofS =
        "\u01a5\uffff";
    static final String DFA42_minS =
        "\1\0\3\60\1\42\4\60\1\75\1\uffff\1\75\1\52\1\75\1\53\1\55\1\74\1\76\3\75\1\uffff\1\75\10\uffff\1\56\7\60\1\uffff\2\60\1\52\1\42\1\uffff\1\52\1\60\1\0\1\42\1\0\1\uffff\1\154\1\60\2\uffff\1\157\1\150\1\154\1\164\1\157\1\155\1\145\1\146\1\141\1\147\1\151\1\157\1\151\1\42\2\uffff\1\160\1\164\1\165\1\163\1\164\1\144\1\147\22\uffff\2\75\23\uffff\1\164\1\156\1\163\1\141\1\145\1\157\1\151\1\60\1\146\1\162\1\157\1\60\1\uffff\1\151\1\156\1\60\2\uffff\1\52\1\uffff\1\56\1\uffff\1\52\2\0\1\12\4\0\1\uffff\5\0\1\uffff\1\0\1\151\1\60\1\uffff\2\162\1\151\1\157\1\141\1\155\1\141\1\156\2\165\1\164\1\145\1\156\1\164\1\162\1\157\1\151\2\145\1\155\1\145\1\157\1\60\1\151\1\165\1\164\4\uffff\1\157\1\163\1\145\1\162\1\141\2\154\1\142\1\uffff\1\141\1\60\1\141\1\uffff\1\141\1\144\1\147\2\53\1\56\6\0\1\uffff\10\0\1\156\1\uffff\2\145\1\147\1\155\1\164\1\160\1\147\1\145\1\156\1\143\1\151\1\157\1\145\1\143\1\164\1\156\1\147\1\144\1\162\3\60\1\uffff\1\163\2\162\1\60\1\151\1\164\2\60\1\153\1\60\1\145\1\154\1\165\1\uffff\2\164\2\60\2\56\1\0\1\12\5\0\1\145\1\164\1\141\1\156\2\151\1\154\1\151\1\162\1\143\1\164\1\143\1\146\1\144\1\150\2\60\1\156\1\145\1\156\3\uffff\1\164\1\156\1\151\1\uffff\1\156\1\60\2\uffff\1\60\1\uffff\1\60\1\145\1\154\1\60\1\151\2\uffff\1\71\3\0\1\60\1\165\1\144\1\141\2\143\1\145\1\156\1\151\1\137\5\60\2\uffff\1\145\1\146\1\60\1\145\1\60\1\143\1\165\3\uffff\1\60\1\164\1\uffff\1\154\1\53\1\uffff\1\162\1\137\1\163\1\146\1\60\1\137\1\170\1\141\1\143\1\137\5\uffff\1\144\1\60\1\uffff\1\162\1\uffff\1\164\1\145\1\uffff\1\60\1\145\1\156\1\154\2\60\1\uffff\1\141\1\60\1\162\3\60\1\uffff\3\60\1\uffff\2\60\1\157\2\uffff\1\163\1\uffff\1\171\10\uffff\1\143\1\163\1\60\1\141\1\145\1\uffff\1\154\1\162\1\60\1\164\1\uffff\1\60\1\uffff";
    static final String DFA42_maxS =
        "\1\uffff\10\172\1\75\1\uffff\4\75\1\76\1\74\1\76\1\75\1\172\1\75\1\uffff\1\75\10\uffff\1\56\7\172\1\uffff\2\172\1\170\1\172\1\uffff\1\71\1\172\1\uffff\1\172\1\uffff\1\uffff\1\164\1\172\2\uffff\1\157\1\150\2\164\1\157\1\155\1\145\1\146\1\162\1\172\1\151\1\157\1\163\1\42\2\uffff\1\160\1\164\1\165\1\163\1\164\1\144\1\164\22\uffff\2\75\23\uffff\1\164\1\156\1\163\1\141\1\145\1\157\1\151\1\172\1\146\1\162\1\157\1\172\1\uffff\1\154\1\156\1\146\2\uffff\1\71\1\uffff\1\71\1\uffff\1\71\2\uffff\1\172\4\uffff\1\uffff\5\uffff\1\uffff\1\uffff\1\151\1\172\1\uffff\2\162\1\151\1\157\1\141\1\155\1\141\1\156\2\165\1\164\1\145\1\156\1\164\1\162\1\157\1\151\2\145\1\155\1\145\1\157\1\172\1\151\1\165\1\164\4\uffff\1\157\1\164\1\145\1\162\1\141\2\154\1\142\1\uffff\1\141\1\172\1\141\1\uffff\1\141\1\144\1\147\2\53\1\56\6\uffff\1\uffff\10\uffff\1\156\1\uffff\2\145\1\147\1\155\1\164\1\160\1\147\1\145\1\156\1\143\1\151\1\157\1\145\1\143\1\164\1\156\1\147\1\144\1\162\3\172\1\uffff\1\163\2\162\1\172\1\151\1\164\2\172\1\153\1\172\1\145\1\154\1\165\1\uffff\2\164\2\172\1\160\1\56\1\uffff\1\172\5\uffff\1\145\1\164\1\141\1\156\2\151\1\154\1\151\1\162\1\143\1\164\1\143\1\146\1\144\1\150\2\172\1\156\1\145\1\156\3\uffff\1\164\1\156\1\151\1\uffff\1\156\1\172\2\uffff\1\172\1\uffff\1\172\1\145\1\154\1\172\1\151\2\uffff\1\71\3\uffff\1\172\1\165\1\144\1\157\2\143\1\145\1\156\1\151\1\137\5\172\2\uffff\1\145\1\146\1\172\1\145\1\172\1\143\1\165\3\uffff\1\172\1\164\1\uffff\1\154\1\53\1\uffff\1\162\1\137\1\163\1\146\1\172\1\137\1\170\1\141\1\143\1\137\5\uffff\1\144\1\172\1\uffff\1\162\1\uffff\1\164\1\145\1\uffff\1\172\1\145\1\156\1\154\2\172\1\uffff\1\141\1\172\1\162\3\172\1\uffff\3\172\1\uffff\2\172\1\157\2\uffff\1\163\1\uffff\1\171\10\uffff\1\143\1\163\1\172\1\141\1\145\1\uffff\1\154\1\162\1\172\1\164\1\uffff\1\172\1\uffff";
    static final String DFA42_acceptS =
        "\12\uffff\1\14\12\uffff\1\33\1\uffff\1\36\1\37\1\41\1\42\1\43\1\45\1\46\1\47\10\uffff\1\106\4\uffff\1\132\5\uffff\1\143\2\uffff\1\131\1\136\16\uffff\1\133\1\135\7\uffff\1\16\1\13\1\14\1\64\1\15\1\17\1\141\1\142\1\60\1\20\1\61\1\21\1\54\1\31\1\22\1\53\1\55\1\32\2\uffff\1\25\1\30\1\26\1\102\1\27\1\103\1\33\1\65\1\34\1\36\1\37\1\41\1\42\1\43\1\45\1\46\1\47\1\50\1\51\14\uffff\1\106\3\uffff\1\137\1\130\1\uffff\1\134\1\uffff\1\132\10\uffff\1\140\5\uffff\1\135\3\uffff\1\75\32\uffff\1\23\1\62\1\24\1\63\10\uffff\1\73\3\uffff\1\105\14\uffff\1\133\11\uffff\1\115\26\uffff\1\104\15\uffff\1\74\41\uffff\1\40\1\76\1\11\3\uffff\1\66\2\uffff\1\100\1\113\1\uffff\1\123\5\uffff\1\112\1\116\23\uffff\1\114\1\4\7\uffff\1\107\1\70\1\72\2\uffff\1\117\2\uffff\1\1\12\uffff\1\3\1\7\1\56\1\121\1\77\2\uffff\1\6\1\uffff\1\71\2\uffff\1\120\6\uffff\1\44\6\uffff\1\5\3\uffff\1\101\3\uffff\1\35\1\57\1\uffff\1\124\1\uffff\1\126\1\127\1\122\1\12\1\110\1\67\1\111\1\2\5\uffff\1\125\4\uffff\1\10\1\uffff\1\52";
    static final String DFA42_specialS =
        "\1\17\56\uffff\1\32\1\uffff\1\27\132\uffff\1\14\1\31\1\uffff\1\37\1\40\1\41\1\11\1\uffff\1\6\1\23\1\24\1\25\1\3\1\uffff\1\16\64\uffff\1\7\1\30\1\34\1\35\1\36\1\10\1\uffff\1\12\1\1\1\15\1\20\1\21\1\22\1\2\1\4\55\uffff\1\13\1\uffff\1\0\1\33\1\44\1\45\1\5\51\uffff\1\42\1\43\1\26\147\uffff}>";
    static final String[] DFA42_transitionS = {
            "\11\62\2\54\1\62\2\54\22\62\1\54\1\26\1\61\2\62\1\15\1\22\1\57\1\27\1\30\1\11\1\16\1\33\1\17\1\37\1\14\1\52\11\55\1\34\1\12\1\20\1\13\1\21\1\47\1\62\13\56\1\60\10\56\1\53\5\56\1\35\1\62\1\36\1\23\1\2\1\62\1\7\1\42\1\41\1\44\1\6\1\45\1\40\1\56\1\1\2\56\1\51\2\56\1\46\2\56\1\10\1\3\1\5\1\4\1\50\1\43\3\56\1\31\1\24\1\32\1\25\uff81\62",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\64\7\66\1\63\14\66",
            "\12\66\7\uffff\1\71\1\66\1\73\3\66\1\75\1\66\1\74\4\66\1\67\4\66\1\72\1\70\6\66\4\uffff\1\76\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\7\66\1\102\1\100\12\66\1\77\2\66\1\101\3\66",
            "\1\106\4\uffff\1\105\10\uffff\10\66\1\104\1\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\103\14\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\30\66\1\107\1\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\112\1\66\1\111\11\66\1\110\2\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\114\6\66\1\113\5\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\115\25\66",
            "\1\116",
            "",
            "\1\121",
            "\1\124\4\uffff\1\125\15\uffff\1\123",
            "\1\127",
            "\1\132\21\uffff\1\131",
            "\1\136\17\uffff\1\134\1\135",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\144\3\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\146",
            "",
            "\1\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\163",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\165\13\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\167\6\66\1\170\6\66\1\166\13\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\172\2\66\1\171\10\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\7\66\1\173\22\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\175\11\66\1\174\13\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\177\2\66\1\176\13\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0080\10\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u0082\13\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u0083\13\66",
            "\2\u0088\2\uffff\1\u0086\1\uffff\10\u0087\2\u0089\36\uffff\1\u0084\37\uffff\1\u0084",
            "\1\106\4\uffff\1\105\10\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\2\u0088\2\uffff\1\u0086\1\uffff\12\u008b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\u0093\1\u008d\34\u0093\1\u008e\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\1\106\4\uffff\1\105\10\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "",
            "\1\u009b\7\uffff\1\u009c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\7\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a8\20\uffff\1\u00a7",
            "\1\u00aa\22\uffff\1\u00a9",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\11\uffff\1\u00ae",
            "\1\106",
            "",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5\13\uffff\1\u00b7\1\u00b6",
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
            "\1\u00b8",
            "\1\u00ba",
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
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00c3\5\66",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u00ca\2\uffff\1\u00c9",
            "\1\u00cb",
            "\1\u00ce\20\uffff\6\u00cd\32\uffff\6\u00cc",
            "",
            "",
            "\1\105\3\uffff\1\u0086\1\uffff\12\u0089",
            "",
            "\1\u0086\1\uffff\12\u0089",
            "",
            "\1\105\3\uffff\1\u0086\1\uffff\12\u0089",
            "\12\u0093\1\u00d0\34\u0093\1\u00cf\10\u0093\1\u00d4\20\u0093\32\u00d2\1\u0093\1\u00d0\1\u0093\1\u00d0\1\u00d3\1\u0093\32\u00d1\uff85\u0093",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\1\105\34\uffff\1\105\10\uffff\1\105\20\uffff\32\105\1\uffff\1\105\1\uffff\2\105\1\uffff\32\105",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\56\u0093\1\u00d6\uffd1\u0093",
            "",
            "\12\u0093\1\u00d8\27\u0093\1\u00d7\4\u0093\1\u00d8\10\u0093\1\u00dc\20\u0093\32\u00da\1\u0093\1\u00d8\1\u0093\1\u00d8\1\u00db\1\u0093\32\u00d9\uff85\u0093",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "\56\u0093\1\u00dd\uffd1\u0093",
            "",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "\1\u00de",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "",
            "",
            "",
            "\1\u00fa",
            "\1\u00fc\1\u00fb",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u0109",
            "\1\u010a",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\56\u0093\1\u00d6\uffd1\u0093",
            "",
            "\56\u0093\1\u010b\uffd1\u0093",
            "\11\u0093\2\u010d\1\u0093\2\u010d\22\u0093\1\u010d\1\u0093\1\u010c\51\u0093\1\u0110\10\u0093\1\u010f\37\u0093\1\u010e\uff8a\u0093",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "\56\u0093\1\u00dd\uffd1\u0093",
            "\56\u0093\1\u0111\uffd1\u0093",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012d",
            "\1\u012e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0131",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0088\41\uffff\1\u0088\37\uffff\1\u0088",
            "\1\u013a",
            "\71\u0093\1\u013b\uffc6\u0093",
            "\1\106\27\uffff\1\106\4\uffff\1\106\10\uffff\1\106\20\uffff\32\106\1\uffff\1\106\1\uffff\2\106\1\uffff\32\106",
            "\11\u0093\2\u010d\1\u0093\2\u010d\22\u0093\1\u010d\1\u0093\1\u010c\51\u0093\1\u0110\10\u0093\1\u010f\37\u0093\1\u010e\uff8a\u0093",
            "\42\u0093\1\u010c\25\u0093\1\u013c\uffc7\u0093",
            "\42\u0093\1\u010c\uffdd\u0093",
            "\42\u0093\1\u010c\uffdd\u0093",
            "\71\u0093\1\u013d\uffc6\u0093",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0159",
            "\1\u015a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u015c",
            "",
            "",
            "\1\u015d",
            "\12\u0093\1\u008d\34\u0093\1\u00d5\10\u0093\1\u0092\20\u0093\32\u0090\1\u0093\1\u008c\1\u0093\1\u008d\1\u0091\1\u0093\32\u008f\uff85\u0093",
            "\42\u0093\1\u010c\uffdd\u0093",
            "\12\u0093\1\u009a\27\u0093\1\u0099\4\u0093\1\u009a\10\u0093\1\u0098\20\u0093\32\u0096\1\u0093\1\u0094\1\u0093\1\u009a\1\u0097\1\u0093\32\u0095\uff85\u0093",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161\15\uffff\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u016e",
            "\1\u016f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0171",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0173",
            "\1\u0174",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0176",
            "",
            "\1\u0177",
            "\1\u0109",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "",
            "",
            "",
            "",
            "",
            "\1\u0182",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0184",
            "",
            "\1\u0185",
            "\1\u0186",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u018d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u018f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0198",
            "",
            "",
            "\1\u0199",
            "",
            "\1\u019a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u019b",
            "\1\u019c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u019e",
            "\1\u019f",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01a3",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_FLOAT | RULE_L | RULE_WS | RULE_I_CONSTANT | RULE_F_CONSTANT | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_269 = input.LA(1);

                        s = -1;
                        if ( (LA42_269=='\"') ) {s = 268;}

                        else if ( ((LA42_269>='\u0000' && LA42_269<='\b')||LA42_269=='\u000B'||(LA42_269>='\u000E' && LA42_269<='\u001F')||LA42_269=='!'||(LA42_269>='#' && LA42_269<='K')||(LA42_269>='M' && LA42_269<='T')||(LA42_269>='V' && LA42_269<='t')||(LA42_269>='v' && LA42_269<='\uFFFF')) ) {s = 147;}

                        else if ( (LA42_269=='u') ) {s = 270;}

                        else if ( (LA42_269=='U') ) {s = 271;}

                        else if ( (LA42_269=='L') ) {s = 272;}

                        else if ( ((LA42_269>='\t' && LA42_269<='\n')||(LA42_269>='\f' && LA42_269<='\r')||LA42_269==' ') ) {s = 269;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_215 = input.LA(1);

                        s = -1;
                        if ( (LA42_215=='\"') ) {s = 268;}

                        else if ( ((LA42_215>='\u0000' && LA42_215<='\b')||LA42_215=='\u000B'||(LA42_215>='\u000E' && LA42_215<='\u001F')||LA42_215=='!'||(LA42_215>='#' && LA42_215<='K')||(LA42_215>='M' && LA42_215<='T')||(LA42_215>='V' && LA42_215<='t')||(LA42_215>='v' && LA42_215<='\uFFFF')) ) {s = 147;}

                        else if ( ((LA42_215>='\t' && LA42_215<='\n')||(LA42_215>='\f' && LA42_215<='\r')||LA42_215==' ') ) {s = 269;}

                        else if ( (LA42_215=='u') ) {s = 270;}

                        else if ( (LA42_215=='U') ) {s = 271;}

                        else if ( (LA42_215=='L') ) {s = 272;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_220 = input.LA(1);

                        s = -1;
                        if ( (LA42_220=='.') ) {s = 221;}

                        else if ( ((LA42_220>='\u0000' && LA42_220<='-')||(LA42_220>='/' && LA42_220<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_152 = input.LA(1);

                        s = -1;
                        if ( (LA42_152=='.') ) {s = 221;}

                        else if ( ((LA42_152>='\u0000' && LA42_152<='-')||(LA42_152>='/' && LA42_152<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_221 = input.LA(1);

                        s = -1;
                        if ( (LA42_221=='.') ) {s = 273;}

                        else if ( ((LA42_221>='\u0000' && LA42_221<='-')||(LA42_221>='/' && LA42_221<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_273 = input.LA(1);

                        s = -1;
                        if ( (LA42_273=='9') ) {s = 317;}

                        else if ( ((LA42_273>='\u0000' && LA42_273<='8')||(LA42_273>=':' && LA42_273<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_148 = input.LA(1);

                        s = -1;
                        if ( (LA42_148=='\"') ) {s = 215;}

                        else if ( (LA42_148=='\n'||LA42_148=='\''||LA42_148=='\\'||LA42_148=='^') ) {s = 216;}

                        else if ( ((LA42_148>='a' && LA42_148<='z')) ) {s = 217;}

                        else if ( ((LA42_148>='A' && LA42_148<='Z')) ) {s = 218;}

                        else if ( (LA42_148=='_') ) {s = 219;}

                        else if ( (LA42_148=='0') ) {s = 220;}

                        else if ( ((LA42_148>='\u0000' && LA42_148<='\t')||(LA42_148>='\u000B' && LA42_148<='!')||(LA42_148>='#' && LA42_148<='&')||(LA42_148>='(' && LA42_148<='/')||(LA42_148>='1' && LA42_148<='@')||LA42_148=='['||LA42_148==']'||LA42_148=='`'||(LA42_148>='{' && LA42_148<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA42_207 = input.LA(1);

                        s = -1;
                        if ( (LA42_207=='\'') ) {s = 213;}

                        else if ( (LA42_207=='\\') ) {s = 140;}

                        else if ( ((LA42_207>='a' && LA42_207<='z')) ) {s = 143;}

                        else if ( ((LA42_207>='A' && LA42_207<='Z')) ) {s = 144;}

                        else if ( (LA42_207=='_') ) {s = 145;}

                        else if ( (LA42_207=='0') ) {s = 146;}

                        else if ( (LA42_207=='\n'||LA42_207=='^') ) {s = 141;}

                        else if ( ((LA42_207>='\u0000' && LA42_207<='\t')||(LA42_207>='\u000B' && LA42_207<='&')||(LA42_207>='(' && LA42_207<='/')||(LA42_207>='1' && LA42_207<='@')||LA42_207=='['||LA42_207==']'||LA42_207=='`'||(LA42_207>='{' && LA42_207<='\uFFFF')) ) {s = 147;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA42_212 = input.LA(1);

                        s = -1;
                        if ( (LA42_212=='.') ) {s = 214;}

                        else if ( ((LA42_212>='\u0000' && LA42_212<='-')||(LA42_212>='/' && LA42_212<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA42_146 = input.LA(1);

                        s = -1;
                        if ( (LA42_146=='.') ) {s = 214;}

                        else if ( ((LA42_146>='\u0000' && LA42_146<='-')||(LA42_146>='/' && LA42_146<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA42_214 = input.LA(1);

                        s = -1;
                        if ( (LA42_214=='.') ) {s = 267;}

                        else if ( ((LA42_214>='\u0000' && LA42_214<='-')||(LA42_214>='/' && LA42_214<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA42_267 = input.LA(1);

                        s = -1;
                        if ( (LA42_267=='9') ) {s = 315;}

                        else if ( ((LA42_267>='\u0000' && LA42_267<='8')||(LA42_267>=':' && LA42_267<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA42_140 = input.LA(1);

                        s = -1;
                        if ( (LA42_140=='\'') ) {s = 207;}

                        else if ( (LA42_140=='\n'||LA42_140=='\\'||LA42_140=='^') ) {s = 208;}

                        else if ( ((LA42_140>='a' && LA42_140<='z')) ) {s = 209;}

                        else if ( ((LA42_140>='A' && LA42_140<='Z')) ) {s = 210;}

                        else if ( (LA42_140=='_') ) {s = 211;}

                        else if ( (LA42_140=='0') ) {s = 212;}

                        else if ( ((LA42_140>='\u0000' && LA42_140<='\t')||(LA42_140>='\u000B' && LA42_140<='&')||(LA42_140>='(' && LA42_140<='/')||(LA42_140>='1' && LA42_140<='@')||LA42_140=='['||LA42_140==']'||LA42_140=='`'||(LA42_140>='{' && LA42_140<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA42_216 = input.LA(1);

                        s = -1;
                        if ( (LA42_216=='\"') ) {s = 153;}

                        else if ( (LA42_216=='\\') ) {s = 148;}

                        else if ( ((LA42_216>='a' && LA42_216<='z')) ) {s = 149;}

                        else if ( ((LA42_216>='A' && LA42_216<='Z')) ) {s = 150;}

                        else if ( (LA42_216=='_') ) {s = 151;}

                        else if ( (LA42_216=='0') ) {s = 152;}

                        else if ( (LA42_216=='\n'||LA42_216=='\''||LA42_216=='^') ) {s = 154;}

                        else if ( ((LA42_216>='\u0000' && LA42_216<='\t')||(LA42_216>='\u000B' && LA42_216<='!')||(LA42_216>='#' && LA42_216<='&')||(LA42_216>='(' && LA42_216<='/')||(LA42_216>='1' && LA42_216<='@')||LA42_216=='['||LA42_216==']'||LA42_216=='`'||(LA42_216>='{' && LA42_216<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA42_154 = input.LA(1);

                        s = -1;
                        if ( (LA42_154=='\"') ) {s = 153;}

                        else if ( (LA42_154=='\\') ) {s = 148;}

                        else if ( (LA42_154=='\n'||LA42_154=='\''||LA42_154=='^') ) {s = 154;}

                        else if ( ((LA42_154>='a' && LA42_154<='z')) ) {s = 149;}

                        else if ( ((LA42_154>='A' && LA42_154<='Z')) ) {s = 150;}

                        else if ( (LA42_154=='_') ) {s = 151;}

                        else if ( (LA42_154=='0') ) {s = 152;}

                        else if ( ((LA42_154>='\u0000' && LA42_154<='\t')||(LA42_154>='\u000B' && LA42_154<='!')||(LA42_154>='#' && LA42_154<='&')||(LA42_154>='(' && LA42_154<='/')||(LA42_154>='1' && LA42_154<='@')||LA42_154=='['||LA42_154==']'||LA42_154=='`'||(LA42_154>='{' && LA42_154<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA42_0 = input.LA(1);

                        s = -1;
                        if ( (LA42_0=='i') ) {s = 1;}

                        else if ( (LA42_0=='_') ) {s = 2;}

                        else if ( (LA42_0=='s') ) {s = 3;}

                        else if ( (LA42_0=='u') ) {s = 4;}

                        else if ( (LA42_0=='t') ) {s = 5;}

                        else if ( (LA42_0=='e') ) {s = 6;}

                        else if ( (LA42_0=='a') ) {s = 7;}

                        else if ( (LA42_0=='r') ) {s = 8;}

                        else if ( (LA42_0=='*') ) {s = 9;}

                        else if ( (LA42_0==';') ) {s = 10;}

                        else if ( (LA42_0=='=') ) {s = 11;}

                        else if ( (LA42_0=='/') ) {s = 12;}

                        else if ( (LA42_0=='%') ) {s = 13;}

                        else if ( (LA42_0=='+') ) {s = 14;}

                        else if ( (LA42_0=='-') ) {s = 15;}

                        else if ( (LA42_0=='<') ) {s = 16;}

                        else if ( (LA42_0=='>') ) {s = 17;}

                        else if ( (LA42_0=='&') ) {s = 18;}

                        else if ( (LA42_0=='^') ) {s = 19;}

                        else if ( (LA42_0=='|') ) {s = 20;}

                        else if ( (LA42_0=='~') ) {s = 21;}

                        else if ( (LA42_0=='!') ) {s = 22;}

                        else if ( (LA42_0=='(') ) {s = 23;}

                        else if ( (LA42_0==')') ) {s = 24;}

                        else if ( (LA42_0=='{') ) {s = 25;}

                        else if ( (LA42_0=='}') ) {s = 26;}

                        else if ( (LA42_0==',') ) {s = 27;}

                        else if ( (LA42_0==':') ) {s = 28;}

                        else if ( (LA42_0=='[') ) {s = 29;}

                        else if ( (LA42_0==']') ) {s = 30;}

                        else if ( (LA42_0=='.') ) {s = 31;}

                        else if ( (LA42_0=='g') ) {s = 32;}

                        else if ( (LA42_0=='c') ) {s = 33;}

                        else if ( (LA42_0=='b') ) {s = 34;}

                        else if ( (LA42_0=='w') ) {s = 35;}

                        else if ( (LA42_0=='d') ) {s = 36;}

                        else if ( (LA42_0=='f') ) {s = 37;}

                        else if ( (LA42_0=='o') ) {s = 38;}

                        else if ( (LA42_0=='?') ) {s = 39;}

                        else if ( (LA42_0=='v') ) {s = 40;}

                        else if ( (LA42_0=='l') ) {s = 41;}

                        else if ( (LA42_0=='0') ) {s = 42;}

                        else if ( (LA42_0=='U') ) {s = 43;}

                        else if ( ((LA42_0>='\t' && LA42_0<='\n')||(LA42_0>='\f' && LA42_0<='\r')||LA42_0==' ') ) {s = 44;}

                        else if ( ((LA42_0>='1' && LA42_0<='9')) ) {s = 45;}

                        else if ( ((LA42_0>='A' && LA42_0<='K')||(LA42_0>='M' && LA42_0<='T')||(LA42_0>='V' && LA42_0<='Z')||LA42_0=='h'||(LA42_0>='j' && LA42_0<='k')||(LA42_0>='m' && LA42_0<='n')||(LA42_0>='p' && LA42_0<='q')||(LA42_0>='x' && LA42_0<='z')) ) {s = 46;}

                        else if ( (LA42_0=='\'') ) {s = 47;}

                        else if ( (LA42_0=='L') ) {s = 48;}

                        else if ( (LA42_0=='\"') ) {s = 49;}

                        else if ( ((LA42_0>='\u0000' && LA42_0<='\b')||LA42_0=='\u000B'||(LA42_0>='\u000E' && LA42_0<='\u001F')||(LA42_0>='#' && LA42_0<='$')||LA42_0=='@'||LA42_0=='\\'||LA42_0=='`'||(LA42_0>='\u007F' && LA42_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA42_217 = input.LA(1);

                        s = -1;
                        if ( (LA42_217=='\"') ) {s = 153;}

                        else if ( (LA42_217=='\\') ) {s = 148;}

                        else if ( (LA42_217=='\n'||LA42_217=='\''||LA42_217=='^') ) {s = 154;}

                        else if ( ((LA42_217>='a' && LA42_217<='z')) ) {s = 149;}

                        else if ( ((LA42_217>='A' && LA42_217<='Z')) ) {s = 150;}

                        else if ( (LA42_217=='_') ) {s = 151;}

                        else if ( (LA42_217=='0') ) {s = 152;}

                        else if ( ((LA42_217>='\u0000' && LA42_217<='\t')||(LA42_217>='\u000B' && LA42_217<='!')||(LA42_217>='#' && LA42_217<='&')||(LA42_217>='(' && LA42_217<='/')||(LA42_217>='1' && LA42_217<='@')||LA42_217=='['||LA42_217==']'||LA42_217=='`'||(LA42_217>='{' && LA42_217<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA42_218 = input.LA(1);

                        s = -1;
                        if ( (LA42_218=='\"') ) {s = 153;}

                        else if ( (LA42_218=='\\') ) {s = 148;}

                        else if ( ((LA42_218>='a' && LA42_218<='z')) ) {s = 149;}

                        else if ( ((LA42_218>='A' && LA42_218<='Z')) ) {s = 150;}

                        else if ( (LA42_218=='_') ) {s = 151;}

                        else if ( (LA42_218=='0') ) {s = 152;}

                        else if ( (LA42_218=='\n'||LA42_218=='\''||LA42_218=='^') ) {s = 154;}

                        else if ( ((LA42_218>='\u0000' && LA42_218<='\t')||(LA42_218>='\u000B' && LA42_218<='!')||(LA42_218>='#' && LA42_218<='&')||(LA42_218>='(' && LA42_218<='/')||(LA42_218>='1' && LA42_218<='@')||LA42_218=='['||LA42_218==']'||LA42_218=='`'||(LA42_218>='{' && LA42_218<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA42_219 = input.LA(1);

                        s = -1;
                        if ( (LA42_219=='\"') ) {s = 153;}

                        else if ( (LA42_219=='\\') ) {s = 148;}

                        else if ( ((LA42_219>='a' && LA42_219<='z')) ) {s = 149;}

                        else if ( ((LA42_219>='A' && LA42_219<='Z')) ) {s = 150;}

                        else if ( (LA42_219=='_') ) {s = 151;}

                        else if ( (LA42_219=='0') ) {s = 152;}

                        else if ( (LA42_219=='\n'||LA42_219=='\''||LA42_219=='^') ) {s = 154;}

                        else if ( ((LA42_219>='\u0000' && LA42_219<='\t')||(LA42_219>='\u000B' && LA42_219<='!')||(LA42_219>='#' && LA42_219<='&')||(LA42_219>='(' && LA42_219<='/')||(LA42_219>='1' && LA42_219<='@')||LA42_219=='['||LA42_219==']'||LA42_219=='`'||(LA42_219>='{' && LA42_219<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA42_149 = input.LA(1);

                        s = -1;
                        if ( (LA42_149=='\"') ) {s = 153;}

                        else if ( (LA42_149=='\\') ) {s = 148;}

                        else if ( (LA42_149=='\n'||LA42_149=='\''||LA42_149=='^') ) {s = 154;}

                        else if ( ((LA42_149>='a' && LA42_149<='z')) ) {s = 149;}

                        else if ( ((LA42_149>='A' && LA42_149<='Z')) ) {s = 150;}

                        else if ( (LA42_149=='_') ) {s = 151;}

                        else if ( (LA42_149=='0') ) {s = 152;}

                        else if ( ((LA42_149>='\u0000' && LA42_149<='\t')||(LA42_149>='\u000B' && LA42_149<='!')||(LA42_149>='#' && LA42_149<='&')||(LA42_149>='(' && LA42_149<='/')||(LA42_149>='1' && LA42_149<='@')||LA42_149=='['||LA42_149==']'||LA42_149=='`'||(LA42_149>='{' && LA42_149<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA42_150 = input.LA(1);

                        s = -1;
                        if ( (LA42_150=='\"') ) {s = 153;}

                        else if ( (LA42_150=='\\') ) {s = 148;}

                        else if ( ((LA42_150>='a' && LA42_150<='z')) ) {s = 149;}

                        else if ( ((LA42_150>='A' && LA42_150<='Z')) ) {s = 150;}

                        else if ( (LA42_150=='_') ) {s = 151;}

                        else if ( (LA42_150=='0') ) {s = 152;}

                        else if ( (LA42_150=='\n'||LA42_150=='\''||LA42_150=='^') ) {s = 154;}

                        else if ( ((LA42_150>='\u0000' && LA42_150<='\t')||(LA42_150>='\u000B' && LA42_150<='!')||(LA42_150>='#' && LA42_150<='&')||(LA42_150>='(' && LA42_150<='/')||(LA42_150>='1' && LA42_150<='@')||LA42_150=='['||LA42_150==']'||LA42_150=='`'||(LA42_150>='{' && LA42_150<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA42_151 = input.LA(1);

                        s = -1;
                        if ( (LA42_151=='\"') ) {s = 153;}

                        else if ( (LA42_151=='\\') ) {s = 148;}

                        else if ( (LA42_151=='\n'||LA42_151=='\''||LA42_151=='^') ) {s = 154;}

                        else if ( ((LA42_151>='a' && LA42_151<='z')) ) {s = 149;}

                        else if ( ((LA42_151>='A' && LA42_151<='Z')) ) {s = 150;}

                        else if ( (LA42_151=='_') ) {s = 151;}

                        else if ( (LA42_151=='0') ) {s = 152;}

                        else if ( ((LA42_151>='\u0000' && LA42_151<='\t')||(LA42_151>='\u000B' && LA42_151<='!')||(LA42_151>='#' && LA42_151<='&')||(LA42_151>='(' && LA42_151<='/')||(LA42_151>='1' && LA42_151<='@')||LA42_151=='['||LA42_151==']'||LA42_151=='`'||(LA42_151>='{' && LA42_151<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA42_317 = input.LA(1);

                        s = -1;
                        if ( (LA42_317=='\"') ) {s = 153;}

                        else if ( (LA42_317=='\\') ) {s = 148;}

                        else if ( (LA42_317=='\n'||LA42_317=='\''||LA42_317=='^') ) {s = 154;}

                        else if ( ((LA42_317>='a' && LA42_317<='z')) ) {s = 149;}

                        else if ( ((LA42_317>='A' && LA42_317<='Z')) ) {s = 150;}

                        else if ( (LA42_317=='_') ) {s = 151;}

                        else if ( (LA42_317=='0') ) {s = 152;}

                        else if ( ((LA42_317>='\u0000' && LA42_317<='\t')||(LA42_317>='\u000B' && LA42_317<='!')||(LA42_317>='#' && LA42_317<='&')||(LA42_317>='(' && LA42_317<='/')||(LA42_317>='1' && LA42_317<='@')||LA42_317=='['||LA42_317==']'||LA42_317=='`'||(LA42_317>='{' && LA42_317<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA42_49 = input.LA(1);

                        s = -1;
                        if ( (LA42_49=='\\') ) {s = 148;}

                        else if ( ((LA42_49>='a' && LA42_49<='z')) ) {s = 149;}

                        else if ( ((LA42_49>='A' && LA42_49<='Z')) ) {s = 150;}

                        else if ( (LA42_49=='_') ) {s = 151;}

                        else if ( (LA42_49=='0') ) {s = 152;}

                        else if ( (LA42_49=='\"') ) {s = 153;}

                        else if ( (LA42_49=='\n'||LA42_49=='\''||LA42_49=='^') ) {s = 154;}

                        else if ( ((LA42_49>='\u0000' && LA42_49<='\t')||(LA42_49>='\u000B' && LA42_49<='!')||(LA42_49>='#' && LA42_49<='&')||(LA42_49>='(' && LA42_49<='/')||(LA42_49>='1' && LA42_49<='@')||LA42_49=='['||LA42_49==']'||LA42_49=='`'||(LA42_49>='{' && LA42_49<='\uFFFF')) ) {s = 147;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA42_208 = input.LA(1);

                        s = -1;
                        if ( (LA42_208=='\'') ) {s = 213;}

                        else if ( (LA42_208=='\\') ) {s = 140;}

                        else if ( ((LA42_208>='a' && LA42_208<='z')) ) {s = 143;}

                        else if ( ((LA42_208>='A' && LA42_208<='Z')) ) {s = 144;}

                        else if ( (LA42_208=='_') ) {s = 145;}

                        else if ( (LA42_208=='0') ) {s = 146;}

                        else if ( (LA42_208=='\n'||LA42_208=='^') ) {s = 141;}

                        else if ( ((LA42_208>='\u0000' && LA42_208<='\t')||(LA42_208>='\u000B' && LA42_208<='&')||(LA42_208>='(' && LA42_208<='/')||(LA42_208>='1' && LA42_208<='@')||LA42_208=='['||LA42_208==']'||LA42_208=='`'||(LA42_208>='{' && LA42_208<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA42_141 = input.LA(1);

                        s = -1;
                        if ( (LA42_141=='\'') ) {s = 213;}

                        else if ( (LA42_141=='\\') ) {s = 140;}

                        else if ( ((LA42_141>='a' && LA42_141<='z')) ) {s = 143;}

                        else if ( ((LA42_141>='A' && LA42_141<='Z')) ) {s = 144;}

                        else if ( (LA42_141=='_') ) {s = 145;}

                        else if ( (LA42_141=='0') ) {s = 146;}

                        else if ( (LA42_141=='\n'||LA42_141=='^') ) {s = 141;}

                        else if ( ((LA42_141>='\u0000' && LA42_141<='\t')||(LA42_141>='\u000B' && LA42_141<='&')||(LA42_141>='(' && LA42_141<='/')||(LA42_141>='1' && LA42_141<='@')||LA42_141=='['||LA42_141==']'||LA42_141=='`'||(LA42_141>='{' && LA42_141<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA42_47 = input.LA(1);

                        s = -1;
                        if ( (LA42_47=='\\') ) {s = 140;}

                        else if ( (LA42_47=='\n'||LA42_47=='^') ) {s = 141;}

                        else if ( (LA42_47=='\'') ) {s = 142;}

                        else if ( ((LA42_47>='a' && LA42_47<='z')) ) {s = 143;}

                        else if ( ((LA42_47>='A' && LA42_47<='Z')) ) {s = 144;}

                        else if ( (LA42_47=='_') ) {s = 145;}

                        else if ( (LA42_47=='0') ) {s = 146;}

                        else if ( ((LA42_47>='\u0000' && LA42_47<='\t')||(LA42_47>='\u000B' && LA42_47<='&')||(LA42_47>='(' && LA42_47<='/')||(LA42_47>='1' && LA42_47<='@')||LA42_47=='['||LA42_47==']'||LA42_47=='`'||(LA42_47>='{' && LA42_47<='\uFFFF')) ) {s = 147;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA42_270 = input.LA(1);

                        s = -1;
                        if ( (LA42_270=='8') ) {s = 316;}

                        else if ( (LA42_270=='\"') ) {s = 268;}

                        else if ( ((LA42_270>='\u0000' && LA42_270<='!')||(LA42_270>='#' && LA42_270<='7')||(LA42_270>='9' && LA42_270<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA42_209 = input.LA(1);

                        s = -1;
                        if ( (LA42_209=='\'') ) {s = 213;}

                        else if ( (LA42_209=='\\') ) {s = 140;}

                        else if ( ((LA42_209>='a' && LA42_209<='z')) ) {s = 143;}

                        else if ( ((LA42_209>='A' && LA42_209<='Z')) ) {s = 144;}

                        else if ( (LA42_209=='_') ) {s = 145;}

                        else if ( (LA42_209=='0') ) {s = 146;}

                        else if ( (LA42_209=='\n'||LA42_209=='^') ) {s = 141;}

                        else if ( ((LA42_209>='\u0000' && LA42_209<='\t')||(LA42_209>='\u000B' && LA42_209<='&')||(LA42_209>='(' && LA42_209<='/')||(LA42_209>='1' && LA42_209<='@')||LA42_209=='['||LA42_209==']'||LA42_209=='`'||(LA42_209>='{' && LA42_209<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA42_210 = input.LA(1);

                        s = -1;
                        if ( (LA42_210=='\'') ) {s = 213;}

                        else if ( (LA42_210=='\\') ) {s = 140;}

                        else if ( ((LA42_210>='a' && LA42_210<='z')) ) {s = 143;}

                        else if ( ((LA42_210>='A' && LA42_210<='Z')) ) {s = 144;}

                        else if ( (LA42_210=='_') ) {s = 145;}

                        else if ( (LA42_210=='0') ) {s = 146;}

                        else if ( (LA42_210=='\n'||LA42_210=='^') ) {s = 141;}

                        else if ( ((LA42_210>='\u0000' && LA42_210<='\t')||(LA42_210>='\u000B' && LA42_210<='&')||(LA42_210>='(' && LA42_210<='/')||(LA42_210>='1' && LA42_210<='@')||LA42_210=='['||LA42_210==']'||LA42_210=='`'||(LA42_210>='{' && LA42_210<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA42_211 = input.LA(1);

                        s = -1;
                        if ( (LA42_211=='\'') ) {s = 213;}

                        else if ( (LA42_211=='\\') ) {s = 140;}

                        else if ( (LA42_211=='\n'||LA42_211=='^') ) {s = 141;}

                        else if ( ((LA42_211>='a' && LA42_211<='z')) ) {s = 143;}

                        else if ( ((LA42_211>='A' && LA42_211<='Z')) ) {s = 144;}

                        else if ( (LA42_211=='_') ) {s = 145;}

                        else if ( (LA42_211=='0') ) {s = 146;}

                        else if ( ((LA42_211>='\u0000' && LA42_211<='\t')||(LA42_211>='\u000B' && LA42_211<='&')||(LA42_211>='(' && LA42_211<='/')||(LA42_211>='1' && LA42_211<='@')||LA42_211=='['||LA42_211==']'||LA42_211=='`'||(LA42_211>='{' && LA42_211<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA42_143 = input.LA(1);

                        s = -1;
                        if ( (LA42_143=='\'') ) {s = 213;}

                        else if ( (LA42_143=='\\') ) {s = 140;}

                        else if ( (LA42_143=='\n'||LA42_143=='^') ) {s = 141;}

                        else if ( ((LA42_143>='a' && LA42_143<='z')) ) {s = 143;}

                        else if ( ((LA42_143>='A' && LA42_143<='Z')) ) {s = 144;}

                        else if ( (LA42_143=='_') ) {s = 145;}

                        else if ( (LA42_143=='0') ) {s = 146;}

                        else if ( ((LA42_143>='\u0000' && LA42_143<='\t')||(LA42_143>='\u000B' && LA42_143<='&')||(LA42_143>='(' && LA42_143<='/')||(LA42_143>='1' && LA42_143<='@')||LA42_143=='['||LA42_143==']'||LA42_143=='`'||(LA42_143>='{' && LA42_143<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA42_144 = input.LA(1);

                        s = -1;
                        if ( (LA42_144=='\'') ) {s = 213;}

                        else if ( (LA42_144=='\\') ) {s = 140;}

                        else if ( (LA42_144=='\n'||LA42_144=='^') ) {s = 141;}

                        else if ( ((LA42_144>='a' && LA42_144<='z')) ) {s = 143;}

                        else if ( ((LA42_144>='A' && LA42_144<='Z')) ) {s = 144;}

                        else if ( (LA42_144=='_') ) {s = 145;}

                        else if ( (LA42_144=='0') ) {s = 146;}

                        else if ( ((LA42_144>='\u0000' && LA42_144<='\t')||(LA42_144>='\u000B' && LA42_144<='&')||(LA42_144>='(' && LA42_144<='/')||(LA42_144>='1' && LA42_144<='@')||LA42_144=='['||LA42_144==']'||LA42_144=='`'||(LA42_144>='{' && LA42_144<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA42_145 = input.LA(1);

                        s = -1;
                        if ( (LA42_145=='\'') ) {s = 213;}

                        else if ( (LA42_145=='\\') ) {s = 140;}

                        else if ( (LA42_145=='\n'||LA42_145=='^') ) {s = 141;}

                        else if ( ((LA42_145>='a' && LA42_145<='z')) ) {s = 143;}

                        else if ( ((LA42_145>='A' && LA42_145<='Z')) ) {s = 144;}

                        else if ( (LA42_145=='_') ) {s = 145;}

                        else if ( (LA42_145=='0') ) {s = 146;}

                        else if ( ((LA42_145>='\u0000' && LA42_145<='\t')||(LA42_145>='\u000B' && LA42_145<='&')||(LA42_145>='(' && LA42_145<='/')||(LA42_145>='1' && LA42_145<='@')||LA42_145=='['||LA42_145==']'||LA42_145=='`'||(LA42_145>='{' && LA42_145<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA42_315 = input.LA(1);

                        s = -1;
                        if ( (LA42_315=='\'') ) {s = 213;}

                        else if ( (LA42_315=='\\') ) {s = 140;}

                        else if ( (LA42_315=='\n'||LA42_315=='^') ) {s = 141;}

                        else if ( ((LA42_315>='a' && LA42_315<='z')) ) {s = 143;}

                        else if ( ((LA42_315>='A' && LA42_315<='Z')) ) {s = 144;}

                        else if ( (LA42_315=='_') ) {s = 145;}

                        else if ( (LA42_315=='0') ) {s = 146;}

                        else if ( ((LA42_315>='\u0000' && LA42_315<='\t')||(LA42_315>='\u000B' && LA42_315<='&')||(LA42_315>='(' && LA42_315<='/')||(LA42_315>='1' && LA42_315<='@')||LA42_315=='['||LA42_315==']'||LA42_315=='`'||(LA42_315>='{' && LA42_315<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA42_316 = input.LA(1);

                        s = -1;
                        if ( (LA42_316=='\"') ) {s = 268;}

                        else if ( ((LA42_316>='\u0000' && LA42_316<='!')||(LA42_316>='#' && LA42_316<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA42_271 = input.LA(1);

                        s = -1;
                        if ( (LA42_271=='\"') ) {s = 268;}

                        else if ( ((LA42_271>='\u0000' && LA42_271<='!')||(LA42_271>='#' && LA42_271<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA42_272 = input.LA(1);

                        s = -1;
                        if ( (LA42_272=='\"') ) {s = 268;}

                        else if ( ((LA42_272>='\u0000' && LA42_272<='!')||(LA42_272>='#' && LA42_272<='\uFFFF')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}