package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
    public static final int RULE_ID=25;
    public static final int RULE_HP=14;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=27;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=26;
    public static final int RULE_ES=18;
    public static final int RULE_STRING_LITERAL=5;
    public static final int RULE_SL_COMMENT=28;
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
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=22;
    public static final int RULE_IDZ=4;
    public static final int RULE_FS=17;
    public static final int RULE_ANY_OTHER=29;
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

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:13:7: ( '_Alignas' )
            // InternalAnsic.g:13:9: '_Alignas'
            {
            match("_Alignas"); 


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
            // InternalAnsic.g:14:7: ( '(' )
            // InternalAnsic.g:14:9: '('
            {
            match('('); 

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
            // InternalAnsic.g:15:7: ( ')' )
            // InternalAnsic.g:15:9: ')'
            {
            match(')'); 

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
            // InternalAnsic.g:16:7: ( 'const' )
            // InternalAnsic.g:16:9: 'const'
            {
            match("const"); 


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
            // InternalAnsic.g:17:7: ( 'restrict' )
            // InternalAnsic.g:17:9: 'restrict'
            {
            match("restrict"); 


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
            // InternalAnsic.g:18:7: ( 'volatile' )
            // InternalAnsic.g:18:9: 'volatile'
            {
            match("volatile"); 


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
            // InternalAnsic.g:19:7: ( '_Atomic' )
            // InternalAnsic.g:19:9: '_Atomic'
            {
            match("_Atomic"); 


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
            // InternalAnsic.g:20:7: ( 'void' )
            // InternalAnsic.g:20:9: 'void'
            {
            match("void"); 


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
            // InternalAnsic.g:21:7: ( 'char' )
            // InternalAnsic.g:21:9: 'char'
            {
            match("char"); 


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
            // InternalAnsic.g:22:7: ( 'short' )
            // InternalAnsic.g:22:9: 'short'
            {
            match("short"); 


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
            // InternalAnsic.g:23:7: ( 'int' )
            // InternalAnsic.g:23:9: 'int'
            {
            match("int"); 


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
            // InternalAnsic.g:24:7: ( 'long' )
            // InternalAnsic.g:24:9: 'long'
            {
            match("long"); 


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
            // InternalAnsic.g:25:7: ( 'float' )
            // InternalAnsic.g:25:9: 'float'
            {
            match("float"); 


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
            // InternalAnsic.g:26:7: ( 'double' )
            // InternalAnsic.g:26:9: 'double'
            {
            match("double"); 


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
            // InternalAnsic.g:27:7: ( 'signed' )
            // InternalAnsic.g:27:9: 'signed'
            {
            match("signed"); 


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
            // InternalAnsic.g:28:7: ( 'unsigned' )
            // InternalAnsic.g:28:9: 'unsigned'
            {
            match("unsigned"); 


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
            // InternalAnsic.g:29:7: ( 'bool' )
            // InternalAnsic.g:29:9: 'bool'
            {
            match("bool"); 


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
            // InternalAnsic.g:30:7: ( '_Complex' )
            // InternalAnsic.g:30:9: '_Complex'
            {
            match("_Complex"); 


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
            // InternalAnsic.g:31:7: ( '_Imaginary' )
            // InternalAnsic.g:31:9: '_Imaginary'
            {
            match("_Imaginary"); 


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
            // InternalAnsic.g:32:7: ( 'typedef' )
            // InternalAnsic.g:32:9: 'typedef'
            {
            match("typedef"); 


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
            // InternalAnsic.g:33:7: ( 'enum' )
            // InternalAnsic.g:33:9: 'enum'
            {
            match("enum"); 


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
            // InternalAnsic.g:34:7: ( '{' )
            // InternalAnsic.g:34:9: '{'
            {
            match('{'); 

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
            // InternalAnsic.g:35:7: ( '}' )
            // InternalAnsic.g:35:9: '}'
            {
            match('}'); 

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
            // InternalAnsic.g:36:7: ( ',' )
            // InternalAnsic.g:36:9: ','
            {
            match(','); 

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
            // InternalAnsic.g:37:7: ( '=' )
            // InternalAnsic.g:37:9: '='
            {
            match('='); 

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
            // InternalAnsic.g:38:7: ( 'struct' )
            // InternalAnsic.g:38:9: 'struct'
            {
            match("struct"); 


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
            // InternalAnsic.g:39:7: ( 'union' )
            // InternalAnsic.g:39:9: 'union'
            {
            match("union"); 


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
            // InternalAnsic.g:40:7: ( ';' )
            // InternalAnsic.g:40:9: ';'
            {
            match(';'); 

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
            // InternalAnsic.g:41:7: ( ':' )
            // InternalAnsic.g:41:9: ':'
            {
            match(':'); 

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
            // InternalAnsic.g:42:7: ( 'extern' )
            // InternalAnsic.g:42:9: 'extern'
            {
            match("extern"); 


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
            // InternalAnsic.g:43:7: ( 'static' )
            // InternalAnsic.g:43:9: 'static'
            {
            match("static"); 


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
            // InternalAnsic.g:44:7: ( '_Thread_local' )
            // InternalAnsic.g:44:9: '_Thread_local'
            {
            match("_Thread_local"); 


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
            // InternalAnsic.g:45:7: ( 'auto' )
            // InternalAnsic.g:45:9: 'auto'
            {
            match("auto"); 


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
            // InternalAnsic.g:46:7: ( 'register' )
            // InternalAnsic.g:46:9: 'register'
            {
            match("register"); 


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
            // InternalAnsic.g:47:7: ( '*' )
            // InternalAnsic.g:47:9: '*'
            {
            match('*'); 

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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:51:7: ( '_Generic' )
            // InternalAnsic.g:51:9: '_Generic'
            {
            match("_Generic"); 


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
            // InternalAnsic.g:52:7: ( 'default' )
            // InternalAnsic.g:52:9: 'default'
            {
            match("default"); 


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
            // InternalAnsic.g:53:7: ( '.' )
            // InternalAnsic.g:53:9: '.'
            {
            match('.'); 

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
            // InternalAnsic.g:54:7: ( '_Static_assert' )
            // InternalAnsic.g:54:9: '_Static_assert'
            {
            match("_Static_assert"); 


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
            // InternalAnsic.g:55:7: ( '->' )
            // InternalAnsic.g:55:9: '->'
            {
            match("->"); 


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
            // InternalAnsic.g:56:7: ( '++' )
            // InternalAnsic.g:56:9: '++'
            {
            match("++"); 


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
            // InternalAnsic.g:57:7: ( '--' )
            // InternalAnsic.g:57:9: '--'
            {
            match("--"); 


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
            // InternalAnsic.g:58:7: ( 'sizeof' )
            // InternalAnsic.g:58:9: 'sizeof'
            {
            match("sizeof"); 


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
            // InternalAnsic.g:59:7: ( '_Alignof' )
            // InternalAnsic.g:59:9: '_Alignof'
            {
            match("_Alignof"); 


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
            // InternalAnsic.g:60:7: ( '/' )
            // InternalAnsic.g:60:9: '/'
            {
            match('/'); 

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
            // InternalAnsic.g:61:7: ( '%' )
            // InternalAnsic.g:61:9: '%'
            {
            match('%'); 

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
            // InternalAnsic.g:62:7: ( '+' )
            // InternalAnsic.g:62:9: '+'
            {
            match('+'); 

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
            // InternalAnsic.g:63:7: ( '-' )
            // InternalAnsic.g:63:9: '-'
            {
            match('-'); 

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
            // InternalAnsic.g:64:7: ( '<<' )
            // InternalAnsic.g:64:9: '<<'
            {
            match("<<"); 


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
            // InternalAnsic.g:65:7: ( '>>' )
            // InternalAnsic.g:65:9: '>>'
            {
            match(">>"); 


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
            // InternalAnsic.g:66:7: ( '==' )
            // InternalAnsic.g:66:9: '=='
            {
            match("=="); 


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
            // InternalAnsic.g:67:7: ( '!=' )
            // InternalAnsic.g:67:9: '!='
            {
            match("!="); 


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
            // InternalAnsic.g:68:7: ( 'goto' )
            // InternalAnsic.g:68:9: 'goto'
            {
            match("goto"); 


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
            // InternalAnsic.g:69:7: ( 'continue' )
            // InternalAnsic.g:69:9: 'continue'
            {
            match("continue"); 


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
            // InternalAnsic.g:70:7: ( 'break' )
            // InternalAnsic.g:70:9: 'break'
            {
            match("break"); 


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
            // InternalAnsic.g:71:7: ( 'return' )
            // InternalAnsic.g:71:9: 'return'
            {
            match("return"); 


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
            // InternalAnsic.g:72:7: ( 'while' )
            // InternalAnsic.g:72:9: 'while'
            {
            match("while"); 


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
            // InternalAnsic.g:73:7: ( 'do' )
            // InternalAnsic.g:73:9: 'do'
            {
            match("do"); 


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
            // InternalAnsic.g:74:7: ( 'for' )
            // InternalAnsic.g:74:9: 'for'
            {
            match("for"); 


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
            // InternalAnsic.g:75:7: ( 'if' )
            // InternalAnsic.g:75:9: 'if'
            {
            match("if"); 


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
            // InternalAnsic.g:76:7: ( 'else' )
            // InternalAnsic.g:76:9: 'else'
            {
            match("else"); 


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
            // InternalAnsic.g:77:7: ( 'switch' )
            // InternalAnsic.g:77:9: 'switch'
            {
            match("switch"); 


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
            // InternalAnsic.g:78:7: ( 'case' )
            // InternalAnsic.g:78:9: 'case'
            {
            match("case"); 


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
            // InternalAnsic.g:79:7: ( '&' )
            // InternalAnsic.g:79:9: '&'
            {
            match('&'); 

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
            // InternalAnsic.g:80:7: ( '^' )
            // InternalAnsic.g:80:9: '^'
            {
            match('^'); 

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
            // InternalAnsic.g:81:8: ( '|' )
            // InternalAnsic.g:81:10: '|'
            {
            match('|'); 

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
            // InternalAnsic.g:82:8: ( 'and' )
            // InternalAnsic.g:82:10: 'and'
            {
            match("and"); 


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
            // InternalAnsic.g:83:8: ( 'or' )
            // InternalAnsic.g:83:10: 'or'
            {
            match("or"); 


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
            // InternalAnsic.g:84:8: ( '?' )
            // InternalAnsic.g:84:10: '?'
            {
            match('?'); 

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
            // InternalAnsic.g:85:8: ( '*=' )
            // InternalAnsic.g:85:10: '*='
            {
            match("*="); 


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
            // InternalAnsic.g:86:8: ( '/=' )
            // InternalAnsic.g:86:10: '/='
            {
            match("/="); 


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
            // InternalAnsic.g:87:8: ( '%=' )
            // InternalAnsic.g:87:10: '%='
            {
            match("%="); 


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
            // InternalAnsic.g:88:8: ( '+=' )
            // InternalAnsic.g:88:10: '+='
            {
            match("+="); 


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
            // InternalAnsic.g:89:8: ( '-=' )
            // InternalAnsic.g:89:10: '-='
            {
            match("-="); 


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
            // InternalAnsic.g:90:8: ( '<<=' )
            // InternalAnsic.g:90:10: '<<='
            {
            match("<<="); 


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
            // InternalAnsic.g:91:8: ( '>>=' )
            // InternalAnsic.g:91:10: '>>='
            {
            match(">>="); 


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
            // InternalAnsic.g:92:8: ( '&=' )
            // InternalAnsic.g:92:10: '&='
            {
            match("&="); 


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
            // InternalAnsic.g:93:8: ( '^=' )
            // InternalAnsic.g:93:10: '^='
            {
            match("^="); 


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
            // InternalAnsic.g:94:8: ( '|=' )
            // InternalAnsic.g:94:10: '|='
            {
            match("|="); 


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
            // InternalAnsic.g:95:8: ( '~' )
            // InternalAnsic.g:95:10: '~'
            {
            match('~'); 

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
            // InternalAnsic.g:96:8: ( '!' )
            // InternalAnsic.g:96:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
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
    // $ANTLR end "T__116"

    // $ANTLR start "RULE_IDZ"
    public final void mRULE_IDZ() throws RecognitionException {
        try {
            int _type = RULE_IDZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:10972:10: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // InternalAnsic.g:10972:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // InternalAnsic.g:10972:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnsic.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDZ"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:10974:12: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // InternalAnsic.g:10974:14: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // InternalAnsic.g:10974:14: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAnsic.g:10974:15: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // InternalAnsic.g:10974:30: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAnsic.g:10974:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // InternalAnsic.g:10976:17: ( '0' .. '7' )
            // InternalAnsic.g:10976:19: '0' .. '7'
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
            // InternalAnsic.g:10978:17: ( '0' .. '9' )
            // InternalAnsic.g:10978:19: '0' .. '9'
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
            // InternalAnsic.g:10980:18: ( '1' .. '9' )
            // InternalAnsic.g:10980:20: '1' .. '9'
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
            // InternalAnsic.g:10982:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalAnsic.g:10982:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // InternalAnsic.g:10984:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' ) )
            // InternalAnsic.g:10984:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            {
            // InternalAnsic.g:10984:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            int alt4=4;
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
                alt4=1;
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
                alt4=2;
                }
                break;
            case '_':
                {
                alt4=3;
                }
                break;
            case '0':
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAnsic.g:10984:20: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:10984:29: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:10984:38: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:10984:42: '0' '..' '9'
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
            // InternalAnsic.g:10986:17: ( ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' ) )
            // InternalAnsic.g:10986:19: ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' )
            {
            // InternalAnsic.g:10986:19: ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                {
                alt5=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                {
                alt5=2;
                }
                break;
            case '0':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAnsic.g:10986:20: 'a' .. 'f'
                    {
                    matchRange('a','f'); 

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:10986:29: 'A' .. 'F'
                    {
                    matchRange('A','F'); 

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:10986:38: '0' '..' '9'
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
            // InternalAnsic.g:10988:18: ( '0' ( 'x' | 'X' ) )
            // InternalAnsic.g:10988:20: '0' ( 'x' | 'X' )
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
            // InternalAnsic.g:10990:17: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+' )
            // InternalAnsic.g:10990:19: ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+'
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAnsic.g:10990:29: ( '+' | '-' )?
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
            // InternalAnsic.g:10992:17: ( ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+' )
            // InternalAnsic.g:10992:19: ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+'
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAnsic.g:10992:29: ( '+' | '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
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
            // InternalAnsic.g:10994:18: ( ( 'f' | 'F' | 'l' | 'L' ) )
            // InternalAnsic.g:10994:20: ( 'f' | 'F' | 'l' | 'L' )
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
            // InternalAnsic.g:10996:18: ( RULE_A )
            // InternalAnsic.g:10996:20: RULE_A
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
            // InternalAnsic.g:10998:18: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? ) )
            // InternalAnsic.g:10998:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            {
            // InternalAnsic.g:10998:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='U'||LA11_0=='u') ) {
                alt11=1;
            }
            else if ( (LA11_0=='L'||LA11_0=='l') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAnsic.g:10998:21: ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalAnsic.g:10998:31: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    int alt8=5;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='l') ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1=='l') ) {
                            alt8=3;
                        }
                    }
                    else if ( (LA8_0=='L') ) {
                        int LA8_2 = input.LA(2);

                        if ( (LA8_2=='L') ) {
                            alt8=4;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAnsic.g:10998:32: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalAnsic.g:10998:36: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalAnsic.g:10998:40: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalAnsic.g:10998:48: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:10998:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )?
                    {
                    // InternalAnsic.g:10998:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )
                    int alt9=4;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='l') ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1=='l') ) {
                            alt9=3;
                        }
                        else {
                            alt9=1;}
                    }
                    else if ( (LA9_0=='L') ) {
                        int LA9_2 = input.LA(2);

                        if ( (LA9_2=='L') ) {
                            alt9=4;
                        }
                        else {
                            alt9=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAnsic.g:10998:59: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalAnsic.g:10998:63: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalAnsic.g:10998:67: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalAnsic.g:10998:75: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }

                    // InternalAnsic.g:10998:84: ( 'u' | 'U' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='U'||LA10_0=='u') ) {
                        alt10=1;
                    }
                    switch (alt10) {
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
            // InternalAnsic.g:11000:18: ( ( 'u' | 'U' | 'L' ) )
            // InternalAnsic.g:11000:20: ( 'u' | 'U' | 'L' )
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
            // InternalAnsic.g:11002:18: ( ( 'u' '8' | 'u' | 'U' | 'L' ) )
            // InternalAnsic.g:11002:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            {
            // InternalAnsic.g:11002:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='8') ) {
                    alt12=1;
                }
                else {
                    alt12=2;}
                }
                break;
            case 'U':
                {
                alt12=3;
                }
                break;
            case 'L':
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAnsic.g:11002:21: 'u' '8'
                    {
                    match('u'); 
                    match('8'); 

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:11002:29: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // InternalAnsic.g:11002:33: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // InternalAnsic.g:11002:37: 'L'
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
            // InternalAnsic.g:11004:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // InternalAnsic.g:11004:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // InternalAnsic.g:11004:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||(LA13_0>='\f' && LA13_0<='\r')||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalAnsic.g:11006:17: ( ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' ) )
            // InternalAnsic.g:11006:19: ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            {
            // InternalAnsic.g:11006:19: ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case '0':
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='X'||LA19_1=='x') ) {
                    alt19=1;
                }
                else if ( ((LA19_1>='0' && LA19_1<='7')) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

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
                alt19=2;
                }
                break;
            case '\'':
            case 'L':
            case 'U':
            case 'u':
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAnsic.g:11006:20: RULE_HP RULE_H '+' ( RULE_IS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    // InternalAnsic.g:11006:39: ( RULE_IS )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='L'||LA14_0=='U'||LA14_0=='l'||LA14_0=='u') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAnsic.g:11006:39: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:11006:48: RULE_NZ RULE_D '*' ( RULE_IS )?
                    {
                    mRULE_NZ(); 
                    mRULE_D(); 
                    match('*'); 
                    // InternalAnsic.g:11006:67: ( RULE_IS )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='L'||LA15_0=='U'||LA15_0=='l'||LA15_0=='u') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAnsic.g:11006:67: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:11006:76: '0' RULE_O '*' ( RULE_IS )?
                    {
                    match('0'); 
                    mRULE_O(); 
                    match('*'); 
                    // InternalAnsic.g:11006:91: ( RULE_IS )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='L'||LA16_0=='U'||LA16_0=='l'||LA16_0=='u') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAnsic.g:11006:91: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:11006:100: ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\''
                    {
                    // InternalAnsic.g:11006:100: ( RULE_CP )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='L'||LA17_0=='U'||LA17_0=='u') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAnsic.g:11006:100: RULE_CP
                            {
                            mRULE_CP(); 

                            }
                            break;

                    }

                    match('\''); 
                    // InternalAnsic.g:11006:114: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=3;
                        switch ( input.LA(1) ) {
                        case '\'':
                            {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1=='\n'||LA18_1=='\''||LA18_1=='0'||(LA18_1>='A' && LA18_1<='Z')||LA18_1=='\\'||(LA18_1>='^' && LA18_1<='_')||(LA18_1>='a' && LA18_1<='z')) ) {
                                alt18=1;
                            }


                            }
                            break;
                        case '\n':
                        case '\\':
                        case '^':
                            {
                            alt18=1;
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
                            alt18=2;
                            }
                            break;

                        }

                        switch (alt18) {
                    	case 1 :
                    	    // InternalAnsic.g:11006:115: ( '^' | '\\'' | '\\\\' | '\\n' )
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
                    	    // InternalAnsic.g:11006:136: RULE_ES
                    	    {
                    	    mRULE_ES(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
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
            // InternalAnsic.g:11008:17: ( ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? ) )
            // InternalAnsic.g:11008:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )
            {
            // InternalAnsic.g:11008:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )
            int alt28=5;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalAnsic.g:11008:20: RULE_D '+' RULE_E ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('+'); 
                    mRULE_E(); 
                    // InternalAnsic.g:11008:38: ( RULE_FS )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='F'||LA20_0=='L'||LA20_0=='f'||LA20_0=='l') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAnsic.g:11008:38: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsic.g:11008:47: RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('*'); 
                    match('.'); 
                    mRULE_D(); 
                    match('+'); 
                    // InternalAnsic.g:11008:73: ( RULE_E )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAnsic.g:11008:73: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalAnsic.g:11008:81: ( RULE_FS )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='F'||LA22_0=='L'||LA22_0=='f'||LA22_0=='l') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAnsic.g:11008:81: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalAnsic.g:11008:90: RULE_D '+' '.' ( RULE_E )? ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('+'); 
                    match('.'); 
                    // InternalAnsic.g:11008:105: ( RULE_E )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='E'||LA23_0=='e') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAnsic.g:11008:105: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalAnsic.g:11008:113: ( RULE_FS )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='F'||LA24_0=='L'||LA24_0=='f'||LA24_0=='l') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAnsic.g:11008:113: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalAnsic.g:11008:122: RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    mRULE_P(); 
                    // InternalAnsic.g:11008:148: ( RULE_FS )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='F'||LA25_0=='L'||LA25_0=='f'||LA25_0=='l') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAnsic.g:11008:148: RULE_FS
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
                    // InternalAnsic.g:11008:198: ( RULE_FS )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='F'||LA26_0=='L'||LA26_0=='f'||LA26_0=='l') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAnsic.g:11008:198: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // InternalAnsic.g:11008:207: RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    match('.'); 
                    mRULE_P(); 
                    // InternalAnsic.g:11008:237: ( RULE_FS )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='F'||LA27_0=='L'||LA27_0=='f'||LA27_0=='l') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalAnsic.g:11008:237: RULE_FS
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
            // InternalAnsic.g:11010:21: ( ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+ )
            // InternalAnsic.g:11010:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            {
            // InternalAnsic.g:11010:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='\"'||LA32_0=='L'||LA32_0=='U'||LA32_0=='u') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAnsic.g:11010:24: ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )*
            	    {
            	    // InternalAnsic.g:11010:24: ( RULE_SP )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0=='L'||LA29_0=='U'||LA29_0=='u') ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalAnsic.g:11010:24: RULE_SP
            	            {
            	            mRULE_SP(); 

            	            }
            	            break;

            	    }

            	    match('\"'); 
            	    // InternalAnsic.g:11010:37: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )*
            	    loop30:
            	    do {
            	        int alt30=3;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0=='\n'||LA30_0=='\''||LA30_0=='\\'||LA30_0=='^') ) {
            	            alt30=1;
            	        }
            	        else if ( (LA30_0=='0'||(LA30_0>='A' && LA30_0<='Z')||LA30_0=='_'||(LA30_0>='a' && LA30_0<='z')) ) {
            	            alt30=2;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalAnsic.g:11010:38: ( '^' | '\\'' | '\\\\' | '\\n' )
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
            	    	    // InternalAnsic.g:11010:59: RULE_ES
            	    	    {
            	    	    mRULE_ES(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);

            	    match('\"'); 
            	    // InternalAnsic.g:11010:73: ( RULE_WS )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( ((LA31_0>='\t' && LA31_0<='\n')||(LA31_0>='\f' && LA31_0<='\r')||LA31_0==' ') ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalAnsic.g:11010:73: RULE_WS
            	    	    {
            	    	    mRULE_WS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
            // InternalAnsic.g:11012:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAnsic.g:11012:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAnsic.g:11012:11: ( '^' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='^') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnsic.g:11012:11: '^'
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

            // InternalAnsic.g:11012:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='0' && LA34_0<='9')||(LA34_0>='A' && LA34_0<='Z')||LA34_0=='_'||(LA34_0>='a' && LA34_0<='z')) ) {
                    alt34=1;
                }


                switch (alt34) {
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
            	    break loop34;
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
            // InternalAnsic.g:11014:10: ( ( '0' .. '9' )+ )
            // InternalAnsic.g:11014:12: ( '0' .. '9' )+
            {
            // InternalAnsic.g:11014:12: ( '0' .. '9' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='0' && LA35_0<='9')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAnsic.g:11014:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
            // InternalAnsic.g:11016:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAnsic.g:11016:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAnsic.g:11016:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='\"') ) {
                alt38=1;
            }
            else if ( (LA38_0=='\'') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalAnsic.g:11016:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAnsic.g:11016:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop36:
                    do {
                        int alt36=3;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0=='\\') ) {
                            alt36=1;
                        }
                        else if ( ((LA36_0>='\u0000' && LA36_0<='!')||(LA36_0>='#' && LA36_0<='[')||(LA36_0>=']' && LA36_0<='\uFFFF')) ) {
                            alt36=2;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAnsic.g:11016:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnsic.g:11016:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop36;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:11016:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAnsic.g:11016:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop37:
                    do {
                        int alt37=3;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0=='\\') ) {
                            alt37=1;
                        }
                        else if ( ((LA37_0>='\u0000' && LA37_0<='&')||(LA37_0>='(' && LA37_0<='[')||(LA37_0>=']' && LA37_0<='\uFFFF')) ) {
                            alt37=2;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalAnsic.g:11016:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnsic.g:11016:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop37;
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
            // InternalAnsic.g:11018:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAnsic.g:11018:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAnsic.g:11018:24: ( options {greedy=false; } : . )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0=='*') ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1=='/') ) {
                        alt39=2;
                    }
                    else if ( ((LA39_1>='\u0000' && LA39_1<='.')||(LA39_1>='0' && LA39_1<='\uFFFF')) ) {
                        alt39=1;
                    }


                }
                else if ( ((LA39_0>='\u0000' && LA39_0<=')')||(LA39_0>='+' && LA39_0<='\uFFFF')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAnsic.g:11018:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop39;
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
            // InternalAnsic.g:11020:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAnsic.g:11020:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAnsic.g:11020:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>='\u0000' && LA40_0<='\t')||(LA40_0>='\u000B' && LA40_0<='\f')||(LA40_0>='\u000E' && LA40_0<='\uFFFF')) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAnsic.g:11020:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop40;
                }
            } while (true);

            // InternalAnsic.g:11020:40: ( ( '\\r' )? '\\n' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\n'||LA42_0=='\r') ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAnsic.g:11020:41: ( '\\r' )? '\\n'
                    {
                    // InternalAnsic.g:11020:41: ( '\\r' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='\r') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalAnsic.g:11020:41: '\\r'
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
            // InternalAnsic.g:11022:16: ( . )
            // InternalAnsic.g:11022:18: .
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
        // InternalAnsic.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | RULE_IDZ | RULE_FLOAT | RULE_L | RULE_WS | RULE_I_CONSTANT | RULE_F_CONSTANT | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt43=100;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // InternalAnsic.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // InternalAnsic.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
                // InternalAnsic.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
                // InternalAnsic.g:1:28: T__33
                {
                mT__33(); 

                }
                break;
            case 5 :
                // InternalAnsic.g:1:34: T__34
                {
                mT__34(); 

                }
                break;
            case 6 :
                // InternalAnsic.g:1:40: T__35
                {
                mT__35(); 

                }
                break;
            case 7 :
                // InternalAnsic.g:1:46: T__36
                {
                mT__36(); 

                }
                break;
            case 8 :
                // InternalAnsic.g:1:52: T__37
                {
                mT__37(); 

                }
                break;
            case 9 :
                // InternalAnsic.g:1:58: T__38
                {
                mT__38(); 

                }
                break;
            case 10 :
                // InternalAnsic.g:1:64: T__39
                {
                mT__39(); 

                }
                break;
            case 11 :
                // InternalAnsic.g:1:70: T__40
                {
                mT__40(); 

                }
                break;
            case 12 :
                // InternalAnsic.g:1:76: T__41
                {
                mT__41(); 

                }
                break;
            case 13 :
                // InternalAnsic.g:1:82: T__42
                {
                mT__42(); 

                }
                break;
            case 14 :
                // InternalAnsic.g:1:88: T__43
                {
                mT__43(); 

                }
                break;
            case 15 :
                // InternalAnsic.g:1:94: T__44
                {
                mT__44(); 

                }
                break;
            case 16 :
                // InternalAnsic.g:1:100: T__45
                {
                mT__45(); 

                }
                break;
            case 17 :
                // InternalAnsic.g:1:106: T__46
                {
                mT__46(); 

                }
                break;
            case 18 :
                // InternalAnsic.g:1:112: T__47
                {
                mT__47(); 

                }
                break;
            case 19 :
                // InternalAnsic.g:1:118: T__48
                {
                mT__48(); 

                }
                break;
            case 20 :
                // InternalAnsic.g:1:124: T__49
                {
                mT__49(); 

                }
                break;
            case 21 :
                // InternalAnsic.g:1:130: T__50
                {
                mT__50(); 

                }
                break;
            case 22 :
                // InternalAnsic.g:1:136: T__51
                {
                mT__51(); 

                }
                break;
            case 23 :
                // InternalAnsic.g:1:142: T__52
                {
                mT__52(); 

                }
                break;
            case 24 :
                // InternalAnsic.g:1:148: T__53
                {
                mT__53(); 

                }
                break;
            case 25 :
                // InternalAnsic.g:1:154: T__54
                {
                mT__54(); 

                }
                break;
            case 26 :
                // InternalAnsic.g:1:160: T__55
                {
                mT__55(); 

                }
                break;
            case 27 :
                // InternalAnsic.g:1:166: T__56
                {
                mT__56(); 

                }
                break;
            case 28 :
                // InternalAnsic.g:1:172: T__57
                {
                mT__57(); 

                }
                break;
            case 29 :
                // InternalAnsic.g:1:178: T__58
                {
                mT__58(); 

                }
                break;
            case 30 :
                // InternalAnsic.g:1:184: T__59
                {
                mT__59(); 

                }
                break;
            case 31 :
                // InternalAnsic.g:1:190: T__60
                {
                mT__60(); 

                }
                break;
            case 32 :
                // InternalAnsic.g:1:196: T__61
                {
                mT__61(); 

                }
                break;
            case 33 :
                // InternalAnsic.g:1:202: T__62
                {
                mT__62(); 

                }
                break;
            case 34 :
                // InternalAnsic.g:1:208: T__63
                {
                mT__63(); 

                }
                break;
            case 35 :
                // InternalAnsic.g:1:214: T__64
                {
                mT__64(); 

                }
                break;
            case 36 :
                // InternalAnsic.g:1:220: T__65
                {
                mT__65(); 

                }
                break;
            case 37 :
                // InternalAnsic.g:1:226: T__66
                {
                mT__66(); 

                }
                break;
            case 38 :
                // InternalAnsic.g:1:232: T__67
                {
                mT__67(); 

                }
                break;
            case 39 :
                // InternalAnsic.g:1:238: T__68
                {
                mT__68(); 

                }
                break;
            case 40 :
                // InternalAnsic.g:1:244: T__69
                {
                mT__69(); 

                }
                break;
            case 41 :
                // InternalAnsic.g:1:250: T__70
                {
                mT__70(); 

                }
                break;
            case 42 :
                // InternalAnsic.g:1:256: T__71
                {
                mT__71(); 

                }
                break;
            case 43 :
                // InternalAnsic.g:1:262: T__72
                {
                mT__72(); 

                }
                break;
            case 44 :
                // InternalAnsic.g:1:268: T__73
                {
                mT__73(); 

                }
                break;
            case 45 :
                // InternalAnsic.g:1:274: T__74
                {
                mT__74(); 

                }
                break;
            case 46 :
                // InternalAnsic.g:1:280: T__75
                {
                mT__75(); 

                }
                break;
            case 47 :
                // InternalAnsic.g:1:286: T__76
                {
                mT__76(); 

                }
                break;
            case 48 :
                // InternalAnsic.g:1:292: T__77
                {
                mT__77(); 

                }
                break;
            case 49 :
                // InternalAnsic.g:1:298: T__78
                {
                mT__78(); 

                }
                break;
            case 50 :
                // InternalAnsic.g:1:304: T__79
                {
                mT__79(); 

                }
                break;
            case 51 :
                // InternalAnsic.g:1:310: T__80
                {
                mT__80(); 

                }
                break;
            case 52 :
                // InternalAnsic.g:1:316: T__81
                {
                mT__81(); 

                }
                break;
            case 53 :
                // InternalAnsic.g:1:322: T__82
                {
                mT__82(); 

                }
                break;
            case 54 :
                // InternalAnsic.g:1:328: T__83
                {
                mT__83(); 

                }
                break;
            case 55 :
                // InternalAnsic.g:1:334: T__84
                {
                mT__84(); 

                }
                break;
            case 56 :
                // InternalAnsic.g:1:340: T__85
                {
                mT__85(); 

                }
                break;
            case 57 :
                // InternalAnsic.g:1:346: T__86
                {
                mT__86(); 

                }
                break;
            case 58 :
                // InternalAnsic.g:1:352: T__87
                {
                mT__87(); 

                }
                break;
            case 59 :
                // InternalAnsic.g:1:358: T__88
                {
                mT__88(); 

                }
                break;
            case 60 :
                // InternalAnsic.g:1:364: T__89
                {
                mT__89(); 

                }
                break;
            case 61 :
                // InternalAnsic.g:1:370: T__90
                {
                mT__90(); 

                }
                break;
            case 62 :
                // InternalAnsic.g:1:376: T__91
                {
                mT__91(); 

                }
                break;
            case 63 :
                // InternalAnsic.g:1:382: T__92
                {
                mT__92(); 

                }
                break;
            case 64 :
                // InternalAnsic.g:1:388: T__93
                {
                mT__93(); 

                }
                break;
            case 65 :
                // InternalAnsic.g:1:394: T__94
                {
                mT__94(); 

                }
                break;
            case 66 :
                // InternalAnsic.g:1:400: T__95
                {
                mT__95(); 

                }
                break;
            case 67 :
                // InternalAnsic.g:1:406: T__96
                {
                mT__96(); 

                }
                break;
            case 68 :
                // InternalAnsic.g:1:412: T__97
                {
                mT__97(); 

                }
                break;
            case 69 :
                // InternalAnsic.g:1:418: T__98
                {
                mT__98(); 

                }
                break;
            case 70 :
                // InternalAnsic.g:1:424: T__99
                {
                mT__99(); 

                }
                break;
            case 71 :
                // InternalAnsic.g:1:430: T__100
                {
                mT__100(); 

                }
                break;
            case 72 :
                // InternalAnsic.g:1:437: T__101
                {
                mT__101(); 

                }
                break;
            case 73 :
                // InternalAnsic.g:1:444: T__102
                {
                mT__102(); 

                }
                break;
            case 74 :
                // InternalAnsic.g:1:451: T__103
                {
                mT__103(); 

                }
                break;
            case 75 :
                // InternalAnsic.g:1:458: T__104
                {
                mT__104(); 

                }
                break;
            case 76 :
                // InternalAnsic.g:1:465: T__105
                {
                mT__105(); 

                }
                break;
            case 77 :
                // InternalAnsic.g:1:472: T__106
                {
                mT__106(); 

                }
                break;
            case 78 :
                // InternalAnsic.g:1:479: T__107
                {
                mT__107(); 

                }
                break;
            case 79 :
                // InternalAnsic.g:1:486: T__108
                {
                mT__108(); 

                }
                break;
            case 80 :
                // InternalAnsic.g:1:493: T__109
                {
                mT__109(); 

                }
                break;
            case 81 :
                // InternalAnsic.g:1:500: T__110
                {
                mT__110(); 

                }
                break;
            case 82 :
                // InternalAnsic.g:1:507: T__111
                {
                mT__111(); 

                }
                break;
            case 83 :
                // InternalAnsic.g:1:514: T__112
                {
                mT__112(); 

                }
                break;
            case 84 :
                // InternalAnsic.g:1:521: T__113
                {
                mT__113(); 

                }
                break;
            case 85 :
                // InternalAnsic.g:1:528: T__114
                {
                mT__114(); 

                }
                break;
            case 86 :
                // InternalAnsic.g:1:535: T__115
                {
                mT__115(); 

                }
                break;
            case 87 :
                // InternalAnsic.g:1:542: T__116
                {
                mT__116(); 

                }
                break;
            case 88 :
                // InternalAnsic.g:1:549: RULE_IDZ
                {
                mRULE_IDZ(); 

                }
                break;
            case 89 :
                // InternalAnsic.g:1:558: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 90 :
                // InternalAnsic.g:1:569: RULE_L
                {
                mRULE_L(); 

                }
                break;
            case 91 :
                // InternalAnsic.g:1:576: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 92 :
                // InternalAnsic.g:1:584: RULE_I_CONSTANT
                {
                mRULE_I_CONSTANT(); 

                }
                break;
            case 93 :
                // InternalAnsic.g:1:600: RULE_F_CONSTANT
                {
                mRULE_F_CONSTANT(); 

                }
                break;
            case 94 :
                // InternalAnsic.g:1:616: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 95 :
                // InternalAnsic.g:1:636: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 96 :
                // InternalAnsic.g:1:644: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 97 :
                // InternalAnsic.g:1:653: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 98 :
                // InternalAnsic.g:1:665: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 99 :
                // InternalAnsic.g:1:681: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 100 :
                // InternalAnsic.g:1:697: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA28_eotS =
        "\21\uffff";
    static final String DFA28_eofS =
        "\21\uffff";
    static final String DFA28_minS =
        "\1\60\2\52\1\60\1\uffff\1\56\2\53\1\56\2\uffff\2\56\2\uffff\1\71\1\53";
    static final String DFA28_maxS =
        "\1\71\1\170\1\53\1\146\1\uffff\1\145\2\53\1\56\2\uffff\1\160\1\56\2\uffff\1\71\1\53";
    static final String DFA28_acceptS =
        "\4\uffff\1\2\4\uffff\1\3\1\1\2\uffff\1\5\1\4\2\uffff";
    static final String DFA28_specialS =
        "\21\uffff}>";
    static final String[] DFA28_transitionS = {
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "11008:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )";
        }
    }
    static final String DFA43_eotS =
        "\1\uffff\2\65\2\uffff\13\65\3\uffff\1\136\2\uffff\1\65\1\144\2\uffff\1\150\1\154\1\157\1\163\1\165\2\62\1\171\2\65\1\175\1\177\1\u0081\1\65\2\uffff\1\65\1\u0087\1\uffff\1\u0087\1\65\1\62\1\65\1\62\1\uffff\1\65\1\u009e\1\uffff\1\65\1\uffff\10\65\2\uffff\14\65\1\u00ba\2\65\1\67\2\uffff\6\65\7\uffff\2\65\23\uffff\1\u00c7\1\u00c9\2\uffff\2\65\6\uffff\1\u00cc\3\uffff\1\u0087\1\uffff\1\u0087\3\uffff\1\u0087\6\uffff\1\u0094\10\uffff\1\65\1\u00e0\1\uffff\31\65\1\u00fb\1\65\1\uffff\12\65\1\u0107\4\uffff\2\65\4\uffff\1\123\7\uffff\1\122\6\uffff\1\65\1\uffff\13\65\1\u011f\1\u0120\4\65\1\u0125\6\65\1\u012c\1\65\1\uffff\4\65\1\u0132\2\65\1\u0135\1\65\1\u0137\1\u0138\1\uffff\1\u0139\1\65\1\123\2\uffff\1\122\3\uffff\1\u0094\1\uffff\12\65\1\u0149\1\65\2\uffff\4\65\1\uffff\1\u014f\5\65\1\uffff\1\u0155\3\65\1\u0159\1\uffff\1\u015a\1\65\1\uffff\1\65\3\uffff\1\u015d\4\uffff\1\u015f\11\65\1\uffff\3\65\1\u016d\1\65\1\uffff\1\u016f\1\u0170\1\u0171\1\u0172\1\u0173\1\uffff\1\u0174\2\65\2\uffff\1\65\1\u0178\3\uffff\3\65\1\u017c\11\65\1\uffff\1\65\6\uffff\1\u0187\1\65\1\u0189\1\uffff\1\65\1\u018b\1\u018c\1\uffff\1\u018d\2\65\1\u0190\1\65\1\u0192\1\u0193\1\u0194\1\u0195\1\u0196\1\uffff\1\u0197\1\uffff\1\u0198\3\uffff\2\65\1\uffff\1\65\7\uffff\1\u019c\2\65\1\uffff\4\65\1\u01a3\1\65\1\uffff\1\u01a5\1\uffff";
    static final String DFA43_eofS =
        "\u01a6\uffff";
    static final String DFA43_minS =
        "\1\0\2\60\2\uffff\7\60\1\42\3\60\3\uffff\1\75\2\uffff\1\60\1\75\2\uffff\1\56\1\55\1\53\1\52\1\75\1\74\1\76\1\75\2\60\3\75\1\60\2\uffff\1\42\1\52\1\uffff\1\52\1\60\1\0\1\42\1\0\1\uffff\2\60\1\uffff\1\60\1\uffff\10\60\2\uffff\17\60\1\42\2\uffff\6\60\7\uffff\2\60\23\uffff\2\75\2\uffff\2\60\6\uffff\1\60\2\uffff\1\60\1\52\1\uffff\1\56\3\uffff\1\52\6\0\1\12\1\uffff\5\0\1\uffff\1\0\2\60\1\uffff\33\60\1\uffff\13\60\4\uffff\2\60\1\uffff\2\53\1\56\6\0\1\uffff\10\0\1\60\1\uffff\32\60\1\uffff\13\60\1\uffff\2\60\2\56\5\0\1\12\1\0\14\60\2\uffff\4\60\1\uffff\6\60\1\uffff\5\60\1\uffff\2\60\1\uffff\1\60\3\uffff\1\60\1\71\3\0\12\60\1\uffff\5\60\1\uffff\5\60\1\uffff\3\60\2\uffff\2\60\1\uffff\1\53\1\uffff\15\60\1\uffff\1\60\6\uffff\3\60\1\uffff\3\60\1\uffff\12\60\1\uffff\1\60\1\uffff\1\60\3\uffff\2\60\1\uffff\1\60\7\uffff\3\60\1\uffff\6\60\1\uffff\1\60\1\uffff";
    static final String DFA43_maxS =
        "\1\uffff\2\172\2\uffff\13\172\3\uffff\1\75\2\uffff\1\172\1\75\2\uffff\1\56\1\76\3\75\1\74\1\76\1\75\2\172\1\75\1\172\1\75\1\172\2\uffff\1\172\1\170\1\uffff\1\71\1\172\1\uffff\1\172\1\uffff\1\uffff\2\172\1\uffff\1\172\1\uffff\10\172\2\uffff\17\172\1\42\2\uffff\6\172\7\uffff\2\172\23\uffff\2\75\2\uffff\2\172\6\uffff\1\172\2\uffff\1\146\1\71\1\uffff\1\71\3\uffff\1\71\6\uffff\1\172\1\uffff\5\uffff\1\uffff\1\uffff\2\172\1\uffff\33\172\1\uffff\13\172\4\uffff\2\172\1\uffff\2\53\1\56\6\uffff\1\uffff\10\uffff\1\172\1\uffff\32\172\1\uffff\13\172\1\uffff\2\172\1\160\1\56\5\uffff\1\172\1\uffff\14\172\2\uffff\4\172\1\uffff\6\172\1\uffff\5\172\1\uffff\2\172\1\uffff\1\172\3\uffff\1\172\1\71\3\uffff\12\172\1\uffff\5\172\1\uffff\5\172\1\uffff\3\172\2\uffff\2\172\1\uffff\1\53\1\uffff\15\172\1\uffff\1\172\6\uffff\3\172\1\uffff\3\172\1\uffff\12\172\1\uffff\1\172\1\uffff\1\172\3\uffff\2\172\1\uffff\1\172\7\uffff\3\172\1\uffff\6\172\1\uffff\1\172\1\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\1\4\1\5\13\uffff\1\30\1\31\1\32\1\uffff\1\36\1\37\2\uffff\1\46\1\47\16\uffff\1\112\1\125\2\uffff\1\133\5\uffff\1\144\2\uffff\1\130\1\uffff\1\137\10\uffff\1\4\1\5\20\uffff\1\136\1\134\6\uffff\1\30\1\31\1\32\1\70\1\33\1\36\1\37\2\uffff\1\113\1\45\1\46\1\47\1\50\1\53\1\55\1\57\1\117\1\65\1\56\1\116\1\64\1\114\1\142\1\143\1\62\1\115\1\63\2\uffff\1\71\1\126\2\uffff\1\122\1\105\1\123\1\106\1\124\1\107\1\uffff\1\112\1\125\2\uffff\1\140\1\uffff\1\135\1\131\1\133\10\uffff\1\141\5\uffff\1\136\3\uffff\1\101\33\uffff\1\77\13\uffff\1\120\1\66\1\121\1\67\2\uffff\1\111\11\uffff\1\134\11\uffff\1\15\32\uffff\1\100\13\uffff\1\110\27\uffff\1\13\1\104\4\uffff\1\12\6\uffff\1\16\5\uffff\1\23\2\uffff\1\27\1\uffff\1\102\1\43\1\72\17\uffff\1\6\5\uffff\1\14\5\uffff\1\17\3\uffff\1\35\1\74\2\uffff\1\76\1\uffff\1\1\15\uffff\1\75\1\uffff\1\21\1\60\1\34\1\41\1\103\1\20\3\uffff\1\40\3\uffff\1\11\12\uffff\1\52\1\uffff\1\26\1\uffff\1\3\1\61\1\24\2\uffff\1\51\1\uffff\1\127\1\73\1\7\1\44\1\10\1\22\1\2\3\uffff\1\25\6\uffff\1\42\1\uffff\1\54";
    static final String DFA43_specialS =
        "\1\3\56\uffff\1\44\1\uffff\1\43\133\uffff\1\27\1\7\1\10\1\11\1\22\1\42\2\uffff\1\20\1\35\1\36\1\37\1\14\1\uffff\1\31\64\uffff\1\26\1\41\1\4\1\5\1\6\1\21\1\uffff\1\23\1\25\1\30\1\32\1\33\1\34\1\13\1\15\55\uffff\1\24\1\17\1\45\1\1\1\2\1\uffff\1\16\51\uffff\1\12\1\0\1\40\147\uffff}>";
    static final String[] DFA43_transitionS = {
            "\11\62\2\54\1\62\2\54\22\62\1\54\1\41\1\61\2\62\1\36\1\44\1\57\1\3\1\4\1\27\1\34\1\22\1\33\1\32\1\35\1\53\11\55\1\25\1\24\1\37\1\23\1\40\1\50\1\62\13\56\1\60\10\56\1\52\5\56\1\30\1\62\1\31\1\45\1\2\1\62\1\26\1\15\1\5\1\13\1\17\1\12\1\42\1\56\1\1\2\56\1\11\2\56\1\47\2\56\1\6\1\10\1\16\1\14\1\7\1\43\3\56\1\20\1\46\1\21\1\51\uff81\62",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\64\7\66\1\63\14\66",
            "\12\67\7\uffff\1\71\1\66\1\72\3\66\1\75\1\66\1\73\4\66\1\70\4\66\1\76\1\74\6\66\4\uffff\1\77\1\uffff\32\66",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\104\6\66\1\103\6\66\1\102\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\105\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\106\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\7\66\1\107\1\110\12\66\1\111\2\66\1\112\3\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\113\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\114\2\66\1\115\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\117\11\66\1\116\13\66",
            "\1\122\4\uffff\1\123\10\uffff\10\67\1\121\1\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\120\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\124\2\66\1\125\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\30\66\1\126\1\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\131\1\66\1\127\11\66\1\130\2\66",
            "",
            "",
            "",
            "\1\135",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\142\6\66\1\141\5\66",
            "\1\143",
            "",
            "",
            "\1\147",
            "\1\152\17\uffff\1\153\1\151",
            "\1\155\21\uffff\1\156",
            "\1\161\4\uffff\1\162\15\uffff\1\160",
            "\1\164",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\172\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\7\66\1\173\22\66",
            "\1\174",
            "\1\176\3\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0080",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0082\10\66",
            "",
            "",
            "\1\122\4\uffff\1\123\10\uffff\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\2\u0089\2\uffff\1\u008a\1\uffff\10\u0086\2\u0088\36\uffff\1\u0085\37\uffff\1\u0085",
            "",
            "\2\u0089\2\uffff\1\u008a\1\uffff\12\u008c",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\u0094\1\u0092\34\u0094\1\u0093\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\1\122\4\uffff\1\123\10\uffff\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u009c\7\66\1\u009d\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u009f\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u00a0\7\66\1\u00a1\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u00a2\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\14\66\1\u00a3\15\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\7\66\1\u00a4\22\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00a5\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00a6\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\u00a7\24\66",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00a8\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00a9\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u00aa\7\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u00ac\13\66\1\u00ab\1\u00ad\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00af\2\66\1\u00ae\16\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u00b0\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u00b1\22\66\1\u00b2",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00b4\20\66\1\u00b3\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00b5\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00b6\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u00b7\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u00b8\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00b9\5\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\u00bb\24\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00bd\11\66\1\u00bc\7\66",
            "\1\122",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u00be\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00bf\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\17\66\1\u00c0\12\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00c1\5\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00c2\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u00c3\7\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00c4\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u00c5\26\66",
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
            "\1\u00c6",
            "\1\u00c8",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00ca\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00cb\21\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u00cf\20\uffff\6\u00ce\32\uffff\6\u00cd",
            "\1\123\3\uffff\1\u008a\1\uffff\12\u0088",
            "",
            "\1\u008a\1\uffff\12\u0088",
            "",
            "",
            "",
            "\1\123\3\uffff\1\u008a\1\uffff\12\u0088",
            "\12\u0094\1\u00d1\34\u0094\1\u00d0\10\u0094\1\u00d5\20\u0094\32\u00d3\1\u0094\1\u00d1\1\u0094\1\u00d1\1\u00d4\1\u0094\32\u00d2\uff85\u0094",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\56\u0094\1\u00d7\uffd1\u0094",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\1\123\34\uffff\1\123\10\uffff\1\123\20\uffff\32\123\1\uffff\1\123\1\uffff\2\123\1\uffff\32\123",
            "",
            "\12\u0094\1\u00d9\27\u0094\1\u00d8\4\u0094\1\u00d9\10\u0094\1\u00dd\20\u0094\32\u00db\1\u0094\1\u00d9\1\u0094\1\u00d9\1\u00dc\1\u0094\32\u00da\uff85\u0094",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "\56\u0094\1\u00de\uffd1\u0094",
            "",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00df\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u00e1\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00e2\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u00e3\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\14\66\1\u00e4\15\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00e5\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u00e6\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00e7\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00e8\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00e9\5\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u00ea\1\u00eb\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u00ec\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00ed\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00ee\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00ef\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00f0\5\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00f1\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u00f2\26\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u00f3\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u00f4\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u00f5\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00f6\5\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00f7\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u00f8\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u00f9\23\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00fa\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\66\1\u00fc\30\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00fd\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u00fe\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u00ff\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u0100\16\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u0101\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0102\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\14\66\1\u0103\15\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0104\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0105\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u0106\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u0108\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u0109\16\66",
            "",
            "\1\u010a",
            "\1\u010a",
            "\1\u010b",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\56\u0094\1\u00d7\uffd1\u0094",
            "",
            "\56\u0094\1\u010c\uffd1\u0094",
            "\11\u0094\2\u010d\1\u0094\2\u010d\22\u0094\1\u010d\1\u0094\1\u0111\51\u0094\1\u0110\10\u0094\1\u010f\37\u0094\1\u010e\uff8a\u0094",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "\56\u0094\1\u00de\uffd1\u0094",
            "\56\u0094\1\u0112\uffd1\u0094",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u0113\14\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0114\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u0115\23\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\14\66\1\u0116\15\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\17\66\1\u0117\12\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u0118\23\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0119\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u011a\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u011b\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u011c\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u011d\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u011e\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0121\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u0122\7\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0123\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0124\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0126\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0127\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u0128\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u0129\27\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u012a\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u012b\27\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u012d\6\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u012e\16\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u012f\5\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\6\66\1\u0130\23\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u0131\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\12\66\1\u0133\17\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u0134\26\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0136\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u013a\25\66",
            "\1\u0089\41\uffff\1\u0089\37\uffff\1\u0089",
            "\1\u013b",
            "\71\u0094\1\u013c\uffc6\u0094",
            "\11\u0094\2\u010d\1\u0094\2\u010d\22\u0094\1\u010d\1\u0094\1\u0111\51\u0094\1\u0110\10\u0094\1\u010f\37\u0094\1\u010e\uff8a\u0094",
            "\42\u0094\1\u0111\25\u0094\1\u013d\uffc7\u0094",
            "\42\u0094\1\u0111\uffdd\u0094",
            "\42\u0094\1\u0111\uffdd\u0094",
            "\1\122\27\uffff\1\122\4\uffff\1\122\10\uffff\1\122\20\uffff\32\122\1\uffff\1\122\1\uffff\2\122\1\uffff\32\122",
            "\71\u0094\1\u013e\uffc6\u0094",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u013f\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0140\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u0141\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u0142\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u0143\16\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u0144\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u0145\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0146\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u0147\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u0148\27\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u014a\14\66",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u014b\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u014c\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u014d\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u014e\21\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u0150\26\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\u0151\24\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0152\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u0153\27\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\7\66\1\u0154\22\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0156\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u0157\16\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u0158\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u015b\25\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u015c\14\66",
            "",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u015e",
            "\12\u0094\1\u0092\34\u0094\1\u00d6\10\u0094\1\u0091\20\u0094\32\u008f\1\u0094\1\u008d\1\u0094\1\u0092\1\u0090\1\u0094\32\u008e\uff85\u0094",
            "\42\u0094\1\u0111\uffdd\u0094",
            "\12\u0094\1\u009b\27\u0094\1\u009a\4\u0094\1\u009b\10\u0094\1\u0099\20\u0094\32\u0097\1\u0094\1\u0095\1\u0094\1\u009b\1\u0098\1\u0094\32\u0096\uff85\u0094",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u0160\5\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u0161\15\66\1\u0162\13\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u0163\27\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0164\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u0165\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u0166\26\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u0167\21\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u0168\27\66",
            "\12\67\7\uffff\32\66\4\uffff\1\u0169\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u016a\5\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u016b\27\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u016c\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u016e\16\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0175\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0176\25\66",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\u0177\24\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u010a",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0179\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u017a\7\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\5\66\1\u017b\24\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\27\66\1\u017d\2\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u017e\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\u017f\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u0180\27\66",
            "\12\67\7\uffff\32\66\4\uffff\1\u0181\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\u0182\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0183\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u0184\6\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u0185\10\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u0186\25\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u0188\26\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\15\66\1\u018a\14\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u018e\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u018f\16\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u0191\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\30\66\1\u0199\1\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\16\66\1\u019a\13\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u019b\7\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\2\66\1\u019d\27\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u019e\7\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u019f\31\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\4\66\1\u01a0\25\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u01a1\16\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\21\66\1\u01a2\10\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\23\66\1\u01a4\6\66",
            "",
            "\12\67\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | RULE_IDZ | RULE_FLOAT | RULE_L | RULE_WS | RULE_I_CONSTANT | RULE_F_CONSTANT | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_317 = input.LA(1);

                        s = -1;
                        if ( (LA43_317=='\"') ) {s = 273;}

                        else if ( ((LA43_317>='\u0000' && LA43_317<='!')||(LA43_317>='#' && LA43_317<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_271 = input.LA(1);

                        s = -1;
                        if ( (LA43_271=='\"') ) {s = 273;}

                        else if ( ((LA43_271>='\u0000' && LA43_271<='!')||(LA43_271>='#' && LA43_271<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_272 = input.LA(1);

                        s = -1;
                        if ( (LA43_272=='\"') ) {s = 273;}

                        else if ( ((LA43_272>='\u0000' && LA43_272<='!')||(LA43_272>='#' && LA43_272<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_0 = input.LA(1);

                        s = -1;
                        if ( (LA43_0=='i') ) {s = 1;}

                        else if ( (LA43_0=='_') ) {s = 2;}

                        else if ( (LA43_0=='(') ) {s = 3;}

                        else if ( (LA43_0==')') ) {s = 4;}

                        else if ( (LA43_0=='c') ) {s = 5;}

                        else if ( (LA43_0=='r') ) {s = 6;}

                        else if ( (LA43_0=='v') ) {s = 7;}

                        else if ( (LA43_0=='s') ) {s = 8;}

                        else if ( (LA43_0=='l') ) {s = 9;}

                        else if ( (LA43_0=='f') ) {s = 10;}

                        else if ( (LA43_0=='d') ) {s = 11;}

                        else if ( (LA43_0=='u') ) {s = 12;}

                        else if ( (LA43_0=='b') ) {s = 13;}

                        else if ( (LA43_0=='t') ) {s = 14;}

                        else if ( (LA43_0=='e') ) {s = 15;}

                        else if ( (LA43_0=='{') ) {s = 16;}

                        else if ( (LA43_0=='}') ) {s = 17;}

                        else if ( (LA43_0==',') ) {s = 18;}

                        else if ( (LA43_0=='=') ) {s = 19;}

                        else if ( (LA43_0==';') ) {s = 20;}

                        else if ( (LA43_0==':') ) {s = 21;}

                        else if ( (LA43_0=='a') ) {s = 22;}

                        else if ( (LA43_0=='*') ) {s = 23;}

                        else if ( (LA43_0=='[') ) {s = 24;}

                        else if ( (LA43_0==']') ) {s = 25;}

                        else if ( (LA43_0=='.') ) {s = 26;}

                        else if ( (LA43_0=='-') ) {s = 27;}

                        else if ( (LA43_0=='+') ) {s = 28;}

                        else if ( (LA43_0=='/') ) {s = 29;}

                        else if ( (LA43_0=='%') ) {s = 30;}

                        else if ( (LA43_0=='<') ) {s = 31;}

                        else if ( (LA43_0=='>') ) {s = 32;}

                        else if ( (LA43_0=='!') ) {s = 33;}

                        else if ( (LA43_0=='g') ) {s = 34;}

                        else if ( (LA43_0=='w') ) {s = 35;}

                        else if ( (LA43_0=='&') ) {s = 36;}

                        else if ( (LA43_0=='^') ) {s = 37;}

                        else if ( (LA43_0=='|') ) {s = 38;}

                        else if ( (LA43_0=='o') ) {s = 39;}

                        else if ( (LA43_0=='?') ) {s = 40;}

                        else if ( (LA43_0=='~') ) {s = 41;}

                        else if ( (LA43_0=='U') ) {s = 42;}

                        else if ( (LA43_0=='0') ) {s = 43;}

                        else if ( ((LA43_0>='\t' && LA43_0<='\n')||(LA43_0>='\f' && LA43_0<='\r')||LA43_0==' ') ) {s = 44;}

                        else if ( ((LA43_0>='1' && LA43_0<='9')) ) {s = 45;}

                        else if ( ((LA43_0>='A' && LA43_0<='K')||(LA43_0>='M' && LA43_0<='T')||(LA43_0>='V' && LA43_0<='Z')||LA43_0=='h'||(LA43_0>='j' && LA43_0<='k')||(LA43_0>='m' && LA43_0<='n')||(LA43_0>='p' && LA43_0<='q')||(LA43_0>='x' && LA43_0<='z')) ) {s = 46;}

                        else if ( (LA43_0=='\'') ) {s = 47;}

                        else if ( (LA43_0=='L') ) {s = 48;}

                        else if ( (LA43_0=='\"') ) {s = 49;}

                        else if ( ((LA43_0>='\u0000' && LA43_0<='\b')||LA43_0=='\u000B'||(LA43_0>='\u000E' && LA43_0<='\u001F')||(LA43_0>='#' && LA43_0<='$')||LA43_0=='@'||LA43_0=='\\'||LA43_0=='`'||(LA43_0>='\u007F' && LA43_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_210 = input.LA(1);

                        s = -1;
                        if ( (LA43_210=='\'') ) {s = 214;}

                        else if ( (LA43_210=='\\') ) {s = 141;}

                        else if ( (LA43_210=='\n'||LA43_210=='^') ) {s = 146;}

                        else if ( ((LA43_210>='a' && LA43_210<='z')) ) {s = 142;}

                        else if ( ((LA43_210>='A' && LA43_210<='Z')) ) {s = 143;}

                        else if ( (LA43_210=='_') ) {s = 144;}

                        else if ( (LA43_210=='0') ) {s = 145;}

                        else if ( ((LA43_210>='\u0000' && LA43_210<='\t')||(LA43_210>='\u000B' && LA43_210<='&')||(LA43_210>='(' && LA43_210<='/')||(LA43_210>='1' && LA43_210<='@')||LA43_210=='['||LA43_210==']'||LA43_210=='`'||(LA43_210>='{' && LA43_210<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_211 = input.LA(1);

                        s = -1;
                        if ( (LA43_211=='\'') ) {s = 214;}

                        else if ( (LA43_211=='\\') ) {s = 141;}

                        else if ( ((LA43_211>='a' && LA43_211<='z')) ) {s = 142;}

                        else if ( ((LA43_211>='A' && LA43_211<='Z')) ) {s = 143;}

                        else if ( (LA43_211=='_') ) {s = 144;}

                        else if ( (LA43_211=='0') ) {s = 145;}

                        else if ( (LA43_211=='\n'||LA43_211=='^') ) {s = 146;}

                        else if ( ((LA43_211>='\u0000' && LA43_211<='\t')||(LA43_211>='\u000B' && LA43_211<='&')||(LA43_211>='(' && LA43_211<='/')||(LA43_211>='1' && LA43_211<='@')||LA43_211=='['||LA43_211==']'||LA43_211=='`'||(LA43_211>='{' && LA43_211<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_212 = input.LA(1);

                        s = -1;
                        if ( (LA43_212=='\'') ) {s = 214;}

                        else if ( (LA43_212=='\\') ) {s = 141;}

                        else if ( (LA43_212=='\n'||LA43_212=='^') ) {s = 146;}

                        else if ( ((LA43_212>='a' && LA43_212<='z')) ) {s = 142;}

                        else if ( ((LA43_212>='A' && LA43_212<='Z')) ) {s = 143;}

                        else if ( (LA43_212=='_') ) {s = 144;}

                        else if ( (LA43_212=='0') ) {s = 145;}

                        else if ( ((LA43_212>='\u0000' && LA43_212<='\t')||(LA43_212>='\u000B' && LA43_212<='&')||(LA43_212>='(' && LA43_212<='/')||(LA43_212>='1' && LA43_212<='@')||LA43_212=='['||LA43_212==']'||LA43_212=='`'||(LA43_212>='{' && LA43_212<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA43_142 = input.LA(1);

                        s = -1;
                        if ( (LA43_142=='\'') ) {s = 214;}

                        else if ( (LA43_142=='\\') ) {s = 141;}

                        else if ( (LA43_142=='\n'||LA43_142=='^') ) {s = 146;}

                        else if ( ((LA43_142>='a' && LA43_142<='z')) ) {s = 142;}

                        else if ( ((LA43_142>='A' && LA43_142<='Z')) ) {s = 143;}

                        else if ( (LA43_142=='_') ) {s = 144;}

                        else if ( (LA43_142=='0') ) {s = 145;}

                        else if ( ((LA43_142>='\u0000' && LA43_142<='\t')||(LA43_142>='\u000B' && LA43_142<='&')||(LA43_142>='(' && LA43_142<='/')||(LA43_142>='1' && LA43_142<='@')||LA43_142=='['||LA43_142==']'||LA43_142=='`'||(LA43_142>='{' && LA43_142<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA43_143 = input.LA(1);

                        s = -1;
                        if ( (LA43_143=='\'') ) {s = 214;}

                        else if ( (LA43_143=='\\') ) {s = 141;}

                        else if ( ((LA43_143>='a' && LA43_143<='z')) ) {s = 142;}

                        else if ( ((LA43_143>='A' && LA43_143<='Z')) ) {s = 143;}

                        else if ( (LA43_143=='_') ) {s = 144;}

                        else if ( (LA43_143=='0') ) {s = 145;}

                        else if ( (LA43_143=='\n'||LA43_143=='^') ) {s = 146;}

                        else if ( ((LA43_143>='\u0000' && LA43_143<='\t')||(LA43_143>='\u000B' && LA43_143<='&')||(LA43_143>='(' && LA43_143<='/')||(LA43_143>='1' && LA43_143<='@')||LA43_143=='['||LA43_143==']'||LA43_143=='`'||(LA43_143>='{' && LA43_143<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA43_144 = input.LA(1);

                        s = -1;
                        if ( (LA43_144=='\'') ) {s = 214;}

                        else if ( (LA43_144=='\\') ) {s = 141;}

                        else if ( ((LA43_144>='a' && LA43_144<='z')) ) {s = 142;}

                        else if ( ((LA43_144>='A' && LA43_144<='Z')) ) {s = 143;}

                        else if ( (LA43_144=='_') ) {s = 144;}

                        else if ( (LA43_144=='0') ) {s = 145;}

                        else if ( (LA43_144=='\n'||LA43_144=='^') ) {s = 146;}

                        else if ( ((LA43_144>='\u0000' && LA43_144<='\t')||(LA43_144>='\u000B' && LA43_144<='&')||(LA43_144>='(' && LA43_144<='/')||(LA43_144>='1' && LA43_144<='@')||LA43_144=='['||LA43_144==']'||LA43_144=='`'||(LA43_144>='{' && LA43_144<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA43_316 = input.LA(1);

                        s = -1;
                        if ( (LA43_316=='\'') ) {s = 214;}

                        else if ( (LA43_316=='\\') ) {s = 141;}

                        else if ( (LA43_316=='\n'||LA43_316=='^') ) {s = 146;}

                        else if ( ((LA43_316>='a' && LA43_316<='z')) ) {s = 142;}

                        else if ( ((LA43_316>='A' && LA43_316<='Z')) ) {s = 143;}

                        else if ( (LA43_316=='_') ) {s = 144;}

                        else if ( (LA43_316=='0') ) {s = 145;}

                        else if ( ((LA43_316>='\u0000' && LA43_316<='\t')||(LA43_316>='\u000B' && LA43_316<='&')||(LA43_316>='(' && LA43_316<='/')||(LA43_316>='1' && LA43_316<='@')||LA43_316=='['||LA43_316==']'||LA43_316=='`'||(LA43_316>='{' && LA43_316<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA43_221 = input.LA(1);

                        s = -1;
                        if ( (LA43_221=='.') ) {s = 222;}

                        else if ( ((LA43_221>='\u0000' && LA43_221<='-')||(LA43_221>='/' && LA43_221<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA43_153 = input.LA(1);

                        s = -1;
                        if ( (LA43_153=='.') ) {s = 222;}

                        else if ( ((LA43_153>='\u0000' && LA43_153<='-')||(LA43_153>='/' && LA43_153<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA43_222 = input.LA(1);

                        s = -1;
                        if ( (LA43_222=='.') ) {s = 274;}

                        else if ( ((LA43_222>='\u0000' && LA43_222<='-')||(LA43_222>='/' && LA43_222<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA43_274 = input.LA(1);

                        s = -1;
                        if ( (LA43_274=='9') ) {s = 318;}

                        else if ( ((LA43_274>='\u0000' && LA43_274<='8')||(LA43_274>=':' && LA43_274<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA43_269 = input.LA(1);

                        s = -1;
                        if ( (LA43_269=='\"') ) {s = 273;}

                        else if ( ((LA43_269>='\u0000' && LA43_269<='\b')||LA43_269=='\u000B'||(LA43_269>='\u000E' && LA43_269<='\u001F')||LA43_269=='!'||(LA43_269>='#' && LA43_269<='K')||(LA43_269>='M' && LA43_269<='T')||(LA43_269>='V' && LA43_269<='t')||(LA43_269>='v' && LA43_269<='\uFFFF')) ) {s = 148;}

                        else if ( (LA43_269=='u') ) {s = 270;}

                        else if ( (LA43_269=='U') ) {s = 271;}

                        else if ( (LA43_269=='L') ) {s = 272;}

                        else if ( ((LA43_269>='\t' && LA43_269<='\n')||(LA43_269>='\f' && LA43_269<='\r')||LA43_269==' ') ) {s = 269;}

                        else s = 82;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA43_149 = input.LA(1);

                        s = -1;
                        if ( (LA43_149=='\"') ) {s = 216;}

                        else if ( (LA43_149=='\n'||LA43_149=='\''||LA43_149=='\\'||LA43_149=='^') ) {s = 217;}

                        else if ( ((LA43_149>='a' && LA43_149<='z')) ) {s = 218;}

                        else if ( ((LA43_149>='A' && LA43_149<='Z')) ) {s = 219;}

                        else if ( (LA43_149=='_') ) {s = 220;}

                        else if ( (LA43_149=='0') ) {s = 221;}

                        else if ( ((LA43_149>='\u0000' && LA43_149<='\t')||(LA43_149>='\u000B' && LA43_149<='!')||(LA43_149>='#' && LA43_149<='&')||(LA43_149>='(' && LA43_149<='/')||(LA43_149>='1' && LA43_149<='@')||LA43_149=='['||LA43_149==']'||LA43_149=='`'||(LA43_149>='{' && LA43_149<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA43_213 = input.LA(1);

                        s = -1;
                        if ( (LA43_213=='.') ) {s = 215;}

                        else if ( ((LA43_213>='\u0000' && LA43_213<='-')||(LA43_213>='/' && LA43_213<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA43_145 = input.LA(1);

                        s = -1;
                        if ( (LA43_145=='.') ) {s = 215;}

                        else if ( ((LA43_145>='\u0000' && LA43_145<='-')||(LA43_145>='/' && LA43_145<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA43_215 = input.LA(1);

                        s = -1;
                        if ( (LA43_215=='.') ) {s = 268;}

                        else if ( ((LA43_215>='\u0000' && LA43_215<='-')||(LA43_215>='/' && LA43_215<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA43_268 = input.LA(1);

                        s = -1;
                        if ( (LA43_268=='9') ) {s = 316;}

                        else if ( ((LA43_268>='\u0000' && LA43_268<='8')||(LA43_268>=':' && LA43_268<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA43_216 = input.LA(1);

                        s = -1;
                        if ( ((LA43_216>='\t' && LA43_216<='\n')||(LA43_216>='\f' && LA43_216<='\r')||LA43_216==' ') ) {s = 269;}

                        else if ( (LA43_216=='u') ) {s = 270;}

                        else if ( (LA43_216=='U') ) {s = 271;}

                        else if ( (LA43_216=='L') ) {s = 272;}

                        else if ( (LA43_216=='\"') ) {s = 273;}

                        else if ( ((LA43_216>='\u0000' && LA43_216<='\b')||LA43_216=='\u000B'||(LA43_216>='\u000E' && LA43_216<='\u001F')||LA43_216=='!'||(LA43_216>='#' && LA43_216<='K')||(LA43_216>='M' && LA43_216<='T')||(LA43_216>='V' && LA43_216<='t')||(LA43_216>='v' && LA43_216<='\uFFFF')) ) {s = 148;}

                        else s = 82;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA43_208 = input.LA(1);

                        s = -1;
                        if ( (LA43_208=='\'') ) {s = 214;}

                        else if ( (LA43_208=='\\') ) {s = 141;}

                        else if ( (LA43_208=='\n'||LA43_208=='^') ) {s = 146;}

                        else if ( ((LA43_208>='a' && LA43_208<='z')) ) {s = 142;}

                        else if ( ((LA43_208>='A' && LA43_208<='Z')) ) {s = 143;}

                        else if ( (LA43_208=='_') ) {s = 144;}

                        else if ( (LA43_208=='0') ) {s = 145;}

                        else if ( ((LA43_208>='\u0000' && LA43_208<='\t')||(LA43_208>='\u000B' && LA43_208<='&')||(LA43_208>='(' && LA43_208<='/')||(LA43_208>='1' && LA43_208<='@')||LA43_208=='['||LA43_208==']'||LA43_208=='`'||(LA43_208>='{' && LA43_208<='\uFFFF')) ) {s = 148;}

                        else s = 83;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA43_141 = input.LA(1);

                        s = -1;
                        if ( (LA43_141=='\'') ) {s = 208;}

                        else if ( (LA43_141=='\n'||LA43_141=='\\'||LA43_141=='^') ) {s = 209;}

                        else if ( ((LA43_141>='a' && LA43_141<='z')) ) {s = 210;}

                        else if ( ((LA43_141>='A' && LA43_141<='Z')) ) {s = 211;}

                        else if ( (LA43_141=='_') ) {s = 212;}

                        else if ( (LA43_141=='0') ) {s = 213;}

                        else if ( ((LA43_141>='\u0000' && LA43_141<='\t')||(LA43_141>='\u000B' && LA43_141<='&')||(LA43_141>='(' && LA43_141<='/')||(LA43_141>='1' && LA43_141<='@')||LA43_141=='['||LA43_141==']'||LA43_141=='`'||(LA43_141>='{' && LA43_141<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA43_217 = input.LA(1);

                        s = -1;
                        if ( (LA43_217=='\"') ) {s = 154;}

                        else if ( (LA43_217=='\\') ) {s = 149;}

                        else if ( ((LA43_217>='a' && LA43_217<='z')) ) {s = 150;}

                        else if ( ((LA43_217>='A' && LA43_217<='Z')) ) {s = 151;}

                        else if ( (LA43_217=='_') ) {s = 152;}

                        else if ( (LA43_217=='0') ) {s = 153;}

                        else if ( (LA43_217=='\n'||LA43_217=='\''||LA43_217=='^') ) {s = 155;}

                        else if ( ((LA43_217>='\u0000' && LA43_217<='\t')||(LA43_217>='\u000B' && LA43_217<='!')||(LA43_217>='#' && LA43_217<='&')||(LA43_217>='(' && LA43_217<='/')||(LA43_217>='1' && LA43_217<='@')||LA43_217=='['||LA43_217==']'||LA43_217=='`'||(LA43_217>='{' && LA43_217<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA43_155 = input.LA(1);

                        s = -1;
                        if ( (LA43_155=='\"') ) {s = 154;}

                        else if ( (LA43_155=='\\') ) {s = 149;}

                        else if ( (LA43_155=='\n'||LA43_155=='\''||LA43_155=='^') ) {s = 155;}

                        else if ( ((LA43_155>='a' && LA43_155<='z')) ) {s = 150;}

                        else if ( ((LA43_155>='A' && LA43_155<='Z')) ) {s = 151;}

                        else if ( (LA43_155=='_') ) {s = 152;}

                        else if ( (LA43_155=='0') ) {s = 153;}

                        else if ( ((LA43_155>='\u0000' && LA43_155<='\t')||(LA43_155>='\u000B' && LA43_155<='!')||(LA43_155>='#' && LA43_155<='&')||(LA43_155>='(' && LA43_155<='/')||(LA43_155>='1' && LA43_155<='@')||LA43_155=='['||LA43_155==']'||LA43_155=='`'||(LA43_155>='{' && LA43_155<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA43_218 = input.LA(1);

                        s = -1;
                        if ( (LA43_218=='\"') ) {s = 154;}

                        else if ( (LA43_218=='\\') ) {s = 149;}

                        else if ( ((LA43_218>='a' && LA43_218<='z')) ) {s = 150;}

                        else if ( ((LA43_218>='A' && LA43_218<='Z')) ) {s = 151;}

                        else if ( (LA43_218=='_') ) {s = 152;}

                        else if ( (LA43_218=='0') ) {s = 153;}

                        else if ( (LA43_218=='\n'||LA43_218=='\''||LA43_218=='^') ) {s = 155;}

                        else if ( ((LA43_218>='\u0000' && LA43_218<='\t')||(LA43_218>='\u000B' && LA43_218<='!')||(LA43_218>='#' && LA43_218<='&')||(LA43_218>='(' && LA43_218<='/')||(LA43_218>='1' && LA43_218<='@')||LA43_218=='['||LA43_218==']'||LA43_218=='`'||(LA43_218>='{' && LA43_218<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA43_219 = input.LA(1);

                        s = -1;
                        if ( (LA43_219=='\"') ) {s = 154;}

                        else if ( (LA43_219=='\\') ) {s = 149;}

                        else if ( ((LA43_219>='a' && LA43_219<='z')) ) {s = 150;}

                        else if ( ((LA43_219>='A' && LA43_219<='Z')) ) {s = 151;}

                        else if ( (LA43_219=='_') ) {s = 152;}

                        else if ( (LA43_219=='0') ) {s = 153;}

                        else if ( (LA43_219=='\n'||LA43_219=='\''||LA43_219=='^') ) {s = 155;}

                        else if ( ((LA43_219>='\u0000' && LA43_219<='\t')||(LA43_219>='\u000B' && LA43_219<='!')||(LA43_219>='#' && LA43_219<='&')||(LA43_219>='(' && LA43_219<='/')||(LA43_219>='1' && LA43_219<='@')||LA43_219=='['||LA43_219==']'||LA43_219=='`'||(LA43_219>='{' && LA43_219<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA43_220 = input.LA(1);

                        s = -1;
                        if ( (LA43_220=='\"') ) {s = 154;}

                        else if ( (LA43_220=='\\') ) {s = 149;}

                        else if ( ((LA43_220>='a' && LA43_220<='z')) ) {s = 150;}

                        else if ( ((LA43_220>='A' && LA43_220<='Z')) ) {s = 151;}

                        else if ( (LA43_220=='_') ) {s = 152;}

                        else if ( (LA43_220=='0') ) {s = 153;}

                        else if ( (LA43_220=='\n'||LA43_220=='\''||LA43_220=='^') ) {s = 155;}

                        else if ( ((LA43_220>='\u0000' && LA43_220<='\t')||(LA43_220>='\u000B' && LA43_220<='!')||(LA43_220>='#' && LA43_220<='&')||(LA43_220>='(' && LA43_220<='/')||(LA43_220>='1' && LA43_220<='@')||LA43_220=='['||LA43_220==']'||LA43_220=='`'||(LA43_220>='{' && LA43_220<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA43_150 = input.LA(1);

                        s = -1;
                        if ( (LA43_150=='\"') ) {s = 154;}

                        else if ( (LA43_150=='\\') ) {s = 149;}

                        else if ( ((LA43_150>='a' && LA43_150<='z')) ) {s = 150;}

                        else if ( ((LA43_150>='A' && LA43_150<='Z')) ) {s = 151;}

                        else if ( (LA43_150=='_') ) {s = 152;}

                        else if ( (LA43_150=='0') ) {s = 153;}

                        else if ( (LA43_150=='\n'||LA43_150=='\''||LA43_150=='^') ) {s = 155;}

                        else if ( ((LA43_150>='\u0000' && LA43_150<='\t')||(LA43_150>='\u000B' && LA43_150<='!')||(LA43_150>='#' && LA43_150<='&')||(LA43_150>='(' && LA43_150<='/')||(LA43_150>='1' && LA43_150<='@')||LA43_150=='['||LA43_150==']'||LA43_150=='`'||(LA43_150>='{' && LA43_150<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA43_151 = input.LA(1);

                        s = -1;
                        if ( (LA43_151=='\"') ) {s = 154;}

                        else if ( (LA43_151=='\\') ) {s = 149;}

                        else if ( ((LA43_151>='a' && LA43_151<='z')) ) {s = 150;}

                        else if ( ((LA43_151>='A' && LA43_151<='Z')) ) {s = 151;}

                        else if ( (LA43_151=='_') ) {s = 152;}

                        else if ( (LA43_151=='0') ) {s = 153;}

                        else if ( (LA43_151=='\n'||LA43_151=='\''||LA43_151=='^') ) {s = 155;}

                        else if ( ((LA43_151>='\u0000' && LA43_151<='\t')||(LA43_151>='\u000B' && LA43_151<='!')||(LA43_151>='#' && LA43_151<='&')||(LA43_151>='(' && LA43_151<='/')||(LA43_151>='1' && LA43_151<='@')||LA43_151=='['||LA43_151==']'||LA43_151=='`'||(LA43_151>='{' && LA43_151<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA43_152 = input.LA(1);

                        s = -1;
                        if ( (LA43_152=='\"') ) {s = 154;}

                        else if ( (LA43_152=='\\') ) {s = 149;}

                        else if ( (LA43_152=='\n'||LA43_152=='\''||LA43_152=='^') ) {s = 155;}

                        else if ( ((LA43_152>='a' && LA43_152<='z')) ) {s = 150;}

                        else if ( ((LA43_152>='A' && LA43_152<='Z')) ) {s = 151;}

                        else if ( (LA43_152=='_') ) {s = 152;}

                        else if ( (LA43_152=='0') ) {s = 153;}

                        else if ( ((LA43_152>='\u0000' && LA43_152<='\t')||(LA43_152>='\u000B' && LA43_152<='!')||(LA43_152>='#' && LA43_152<='&')||(LA43_152>='(' && LA43_152<='/')||(LA43_152>='1' && LA43_152<='@')||LA43_152=='['||LA43_152==']'||LA43_152=='`'||(LA43_152>='{' && LA43_152<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA43_318 = input.LA(1);

                        s = -1;
                        if ( (LA43_318=='\"') ) {s = 154;}

                        else if ( (LA43_318=='\\') ) {s = 149;}

                        else if ( (LA43_318=='\n'||LA43_318=='\''||LA43_318=='^') ) {s = 155;}

                        else if ( ((LA43_318>='a' && LA43_318<='z')) ) {s = 150;}

                        else if ( ((LA43_318>='A' && LA43_318<='Z')) ) {s = 151;}

                        else if ( (LA43_318=='_') ) {s = 152;}

                        else if ( (LA43_318=='0') ) {s = 153;}

                        else if ( ((LA43_318>='\u0000' && LA43_318<='\t')||(LA43_318>='\u000B' && LA43_318<='!')||(LA43_318>='#' && LA43_318<='&')||(LA43_318>='(' && LA43_318<='/')||(LA43_318>='1' && LA43_318<='@')||LA43_318=='['||LA43_318==']'||LA43_318=='`'||(LA43_318>='{' && LA43_318<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA43_209 = input.LA(1);

                        s = -1;
                        if ( (LA43_209=='\'') ) {s = 214;}

                        else if ( (LA43_209=='\\') ) {s = 141;}

                        else if ( (LA43_209=='\n'||LA43_209=='^') ) {s = 146;}

                        else if ( ((LA43_209>='a' && LA43_209<='z')) ) {s = 142;}

                        else if ( ((LA43_209>='A' && LA43_209<='Z')) ) {s = 143;}

                        else if ( (LA43_209=='_') ) {s = 144;}

                        else if ( (LA43_209=='0') ) {s = 145;}

                        else if ( ((LA43_209>='\u0000' && LA43_209<='\t')||(LA43_209>='\u000B' && LA43_209<='&')||(LA43_209>='(' && LA43_209<='/')||(LA43_209>='1' && LA43_209<='@')||LA43_209=='['||LA43_209==']'||LA43_209=='`'||(LA43_209>='{' && LA43_209<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA43_146 = input.LA(1);

                        s = -1;
                        if ( (LA43_146=='\'') ) {s = 214;}

                        else if ( (LA43_146=='\\') ) {s = 141;}

                        else if ( ((LA43_146>='a' && LA43_146<='z')) ) {s = 142;}

                        else if ( ((LA43_146>='A' && LA43_146<='Z')) ) {s = 143;}

                        else if ( (LA43_146=='_') ) {s = 144;}

                        else if ( (LA43_146=='0') ) {s = 145;}

                        else if ( (LA43_146=='\n'||LA43_146=='^') ) {s = 146;}

                        else if ( ((LA43_146>='\u0000' && LA43_146<='\t')||(LA43_146>='\u000B' && LA43_146<='&')||(LA43_146>='(' && LA43_146<='/')||(LA43_146>='1' && LA43_146<='@')||LA43_146=='['||LA43_146==']'||LA43_146=='`'||(LA43_146>='{' && LA43_146<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA43_49 = input.LA(1);

                        s = -1;
                        if ( (LA43_49=='\\') ) {s = 149;}

                        else if ( ((LA43_49>='a' && LA43_49<='z')) ) {s = 150;}

                        else if ( ((LA43_49>='A' && LA43_49<='Z')) ) {s = 151;}

                        else if ( (LA43_49=='_') ) {s = 152;}

                        else if ( (LA43_49=='0') ) {s = 153;}

                        else if ( (LA43_49=='\"') ) {s = 154;}

                        else if ( (LA43_49=='\n'||LA43_49=='\''||LA43_49=='^') ) {s = 155;}

                        else if ( ((LA43_49>='\u0000' && LA43_49<='\t')||(LA43_49>='\u000B' && LA43_49<='!')||(LA43_49>='#' && LA43_49<='&')||(LA43_49>='(' && LA43_49<='/')||(LA43_49>='1' && LA43_49<='@')||LA43_49=='['||LA43_49==']'||LA43_49=='`'||(LA43_49>='{' && LA43_49<='\uFFFF')) ) {s = 148;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA43_47 = input.LA(1);

                        s = -1;
                        if ( (LA43_47=='\\') ) {s = 141;}

                        else if ( ((LA43_47>='a' && LA43_47<='z')) ) {s = 142;}

                        else if ( ((LA43_47>='A' && LA43_47<='Z')) ) {s = 143;}

                        else if ( (LA43_47=='_') ) {s = 144;}

                        else if ( (LA43_47=='0') ) {s = 145;}

                        else if ( (LA43_47=='\n'||LA43_47=='^') ) {s = 146;}

                        else if ( (LA43_47=='\'') ) {s = 147;}

                        else if ( ((LA43_47>='\u0000' && LA43_47<='\t')||(LA43_47>='\u000B' && LA43_47<='&')||(LA43_47>='(' && LA43_47<='/')||(LA43_47>='1' && LA43_47<='@')||LA43_47=='['||LA43_47==']'||LA43_47=='`'||(LA43_47>='{' && LA43_47<='\uFFFF')) ) {s = 148;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA43_270 = input.LA(1);

                        s = -1;
                        if ( (LA43_270=='8') ) {s = 317;}

                        else if ( (LA43_270=='\"') ) {s = 273;}

                        else if ( ((LA43_270>='\u0000' && LA43_270<='!')||(LA43_270>='#' && LA43_270<='7')||(LA43_270>='9' && LA43_270<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}