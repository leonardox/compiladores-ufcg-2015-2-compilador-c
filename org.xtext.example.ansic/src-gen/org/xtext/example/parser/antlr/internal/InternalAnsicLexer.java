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

    public InternalAnsicLexer() {;} 
    public InternalAnsicLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAnsicLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAnsic.g"; }

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:11:7: ( '(' )
            // InternalAnsic.g:11:9: '('
            {
            match('('); 

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
            // InternalAnsic.g:12:7: ( ')' )
            // InternalAnsic.g:12:9: ')'
            {
            match(')'); 

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
            // InternalAnsic.g:13:7: ( '[' )
            // InternalAnsic.g:13:9: '['
            {
            match('['); 

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
            // InternalAnsic.g:14:7: ( ']' )
            // InternalAnsic.g:14:9: ']'
            {
            match(']'); 

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
            // InternalAnsic.g:15:7: ( '.' )
            // InternalAnsic.g:15:9: '.'
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
            // InternalAnsic.g:16:7: ( ',' )
            // InternalAnsic.g:16:9: ','
            {
            match(','); 

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
            // InternalAnsic.g:17:7: ( '&' )
            // InternalAnsic.g:17:9: '&'
            {
            match('&'); 

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
            // InternalAnsic.g:18:7: ( '*' )
            // InternalAnsic.g:18:9: '*'
            {
            match('*'); 

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
            // InternalAnsic.g:19:7: ( '+' )
            // InternalAnsic.g:19:9: '+'
            {
            match('+'); 

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
            // InternalAnsic.g:20:7: ( '-' )
            // InternalAnsic.g:20:9: '-'
            {
            match('-'); 

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
            // InternalAnsic.g:21:7: ( '~' )
            // InternalAnsic.g:21:9: '~'
            {
            match('~'); 

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
            // InternalAnsic.g:22:7: ( '!' )
            // InternalAnsic.g:22:9: '!'
            {
            match('!'); 

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
            // InternalAnsic.g:23:7: ( '/' )
            // InternalAnsic.g:23:9: '/'
            {
            match('/'); 

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
            // InternalAnsic.g:24:7: ( '%' )
            // InternalAnsic.g:24:9: '%'
            {
            match('%'); 

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
            // InternalAnsic.g:25:7: ( '<' )
            // InternalAnsic.g:25:9: '<'
            {
            match('<'); 

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
            // InternalAnsic.g:26:7: ( '>' )
            // InternalAnsic.g:26:9: '>'
            {
            match('>'); 

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
            // InternalAnsic.g:27:7: ( '^' )
            // InternalAnsic.g:27:9: '^'
            {
            match('^'); 

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
            // InternalAnsic.g:28:7: ( '|' )
            // InternalAnsic.g:28:9: '|'
            {
            match('|'); 

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
            // InternalAnsic.g:29:7: ( '?' )
            // InternalAnsic.g:29:9: '?'
            {
            match('?'); 

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
            // InternalAnsic.g:30:7: ( ':' )
            // InternalAnsic.g:30:9: ':'
            {
            match(':'); 

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
            // InternalAnsic.g:31:7: ( '=' )
            // InternalAnsic.g:31:9: '='
            {
            match('='); 

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
            // InternalAnsic.g:32:7: ( ';' )
            // InternalAnsic.g:32:9: ';'
            {
            match(';'); 

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
            // InternalAnsic.g:33:7: ( 'charz' )
            // InternalAnsic.g:33:9: 'charz'
            {
            match("charz"); 


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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:36:7: ( 'f' )
            // InternalAnsic.g:36:9: 'f'
            {
            match('f'); 

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
            // InternalAnsic.g:37:7: ( 'F' )
            // InternalAnsic.g:37:9: 'F'
            {
            match('F'); 

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
            // InternalAnsic.g:38:7: ( 'l' )
            // InternalAnsic.g:38:9: 'l'
            {
            match('l'); 

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
            // InternalAnsic.g:39:7: ( 'L' )
            // InternalAnsic.g:39:9: 'L'
            {
            match('L'); 

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
            // InternalAnsic.g:40:7: ( 'u' )
            // InternalAnsic.g:40:9: 'u'
            {
            match('u'); 

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
            // InternalAnsic.g:41:7: ( 'U' )
            // InternalAnsic.g:41:9: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "RULE_AUTO"
    public final void mRULE_AUTO() throws RecognitionException {
        try {
            int _type = RULE_AUTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5285:11: ( 'auto' )
            // InternalAnsic.g:5285:13: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AUTO"

    // $ANTLR start "RULE_BREAK"
    public final void mRULE_BREAK() throws RecognitionException {
        try {
            int _type = RULE_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5287:12: ( 'break' )
            // InternalAnsic.g:5287:14: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BREAK"

    // $ANTLR start "RULE_CASE"
    public final void mRULE_CASE() throws RecognitionException {
        try {
            int _type = RULE_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5289:11: ( 'case' )
            // InternalAnsic.g:5289:13: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5291:11: ( 'char' )
            // InternalAnsic.g:5291:13: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_CONST"
    public final void mRULE_CONST() throws RecognitionException {
        try {
            int _type = RULE_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5293:12: ( 'const' )
            // InternalAnsic.g:5293:14: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONST"

    // $ANTLR start "RULE_CONTINUE"
    public final void mRULE_CONTINUE() throws RecognitionException {
        try {
            int _type = RULE_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5295:15: ( 'continue' )
            // InternalAnsic.g:5295:17: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONTINUE"

    // $ANTLR start "RULE_DEFAULT"
    public final void mRULE_DEFAULT() throws RecognitionException {
        try {
            int _type = RULE_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5297:14: ( 'default' )
            // InternalAnsic.g:5297:16: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFAULT"

    // $ANTLR start "RULE_DO"
    public final void mRULE_DO() throws RecognitionException {
        try {
            int _type = RULE_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5299:9: ( 'do' )
            // InternalAnsic.g:5299:11: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5301:13: ( 'double' )
            // InternalAnsic.g:5301:15: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5303:11: ( 'else' )
            // InternalAnsic.g:5303:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_ENUM"
    public final void mRULE_ENUM() throws RecognitionException {
        try {
            int _type = RULE_ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5305:11: ( 'enum' )
            // InternalAnsic.g:5305:13: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENUM"

    // $ANTLR start "RULE_EXTERN"
    public final void mRULE_EXTERN() throws RecognitionException {
        try {
            int _type = RULE_EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5307:13: ( 'extern' )
            // InternalAnsic.g:5307:15: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTERN"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5309:12: ( 'float' )
            // InternalAnsic.g:5309:14: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_FOR"
    public final void mRULE_FOR() throws RecognitionException {
        try {
            int _type = RULE_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5311:10: ( 'for' )
            // InternalAnsic.g:5311:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR"

    // $ANTLR start "RULE_GOTO"
    public final void mRULE_GOTO() throws RecognitionException {
        try {
            int _type = RULE_GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5313:11: ( 'goto' )
            // InternalAnsic.g:5313:13: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GOTO"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5315:9: ( 'if' )
            // InternalAnsic.g:5315:11: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_INTE"
    public final void mRULE_INTE() throws RecognitionException {
        try {
            int _type = RULE_INTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5317:11: ( 'int' )
            // InternalAnsic.g:5317:13: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTE"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5319:11: ( 'long' )
            // InternalAnsic.g:5319:13: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_REGISTER"
    public final void mRULE_REGISTER() throws RecognitionException {
        try {
            int _type = RULE_REGISTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5321:15: ( 'register' )
            // InternalAnsic.g:5321:17: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGISTER"

    // $ANTLR start "RULE_RETURNO"
    public final void mRULE_RETURNO() throws RecognitionException {
        try {
            int _type = RULE_RETURNO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5323:14: ( 'return' )
            // InternalAnsic.g:5323:16: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURNO"

    // $ANTLR start "RULE_SHORT"
    public final void mRULE_SHORT() throws RecognitionException {
        try {
            int _type = RULE_SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5325:12: ( 'short' )
            // InternalAnsic.g:5325:14: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SHORT"

    // $ANTLR start "RULE_SIGNED"
    public final void mRULE_SIGNED() throws RecognitionException {
        try {
            int _type = RULE_SIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5327:13: ( 'signed' )
            // InternalAnsic.g:5327:15: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED"

    // $ANTLR start "RULE_SIZEOF"
    public final void mRULE_SIZEOF() throws RecognitionException {
        try {
            int _type = RULE_SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5329:13: ( 'sizeof' )
            // InternalAnsic.g:5329:15: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIZEOF"

    // $ANTLR start "RULE_STATIC"
    public final void mRULE_STATIC() throws RecognitionException {
        try {
            int _type = RULE_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5331:13: ( 'static' )
            // InternalAnsic.g:5331:15: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATIC"

    // $ANTLR start "RULE_STRUCT"
    public final void mRULE_STRUCT() throws RecognitionException {
        try {
            int _type = RULE_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5333:13: ( 'struct' )
            // InternalAnsic.g:5333:15: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRUCT"

    // $ANTLR start "RULE_SWITCH"
    public final void mRULE_SWITCH() throws RecognitionException {
        try {
            int _type = RULE_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5335:13: ( 'switch' )
            // InternalAnsic.g:5335:15: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SWITCH"

    // $ANTLR start "RULE_TYPEDEF"
    public final void mRULE_TYPEDEF() throws RecognitionException {
        try {
            int _type = RULE_TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5337:14: ( 'typedef' )
            // InternalAnsic.g:5337:16: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPEDEF"

    // $ANTLR start "RULE_UNION"
    public final void mRULE_UNION() throws RecognitionException {
        try {
            int _type = RULE_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5339:12: ( 'union' )
            // InternalAnsic.g:5339:14: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNION"

    // $ANTLR start "RULE_UNSIGNED"
    public final void mRULE_UNSIGNED() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5341:15: ( 'unsigned' )
            // InternalAnsic.g:5341:17: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED"

    // $ANTLR start "RULE_VOID"
    public final void mRULE_VOID() throws RecognitionException {
        try {
            int _type = RULE_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5343:11: ( 'void' )
            // InternalAnsic.g:5343:13: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VOID"

    // $ANTLR start "RULE_VOLATILE"
    public final void mRULE_VOLATILE() throws RecognitionException {
        try {
            int _type = RULE_VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5345:15: ( 'volatile' )
            // InternalAnsic.g:5345:17: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VOLATILE"

    // $ANTLR start "RULE_WHILE"
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5347:12: ( 'while' )
            // InternalAnsic.g:5347:14: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHILE"

    // $ANTLR start "RULE_ELLIPSIS"
    public final void mRULE_ELLIPSIS() throws RecognitionException {
        try {
            int _type = RULE_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5349:15: ( '...' )
            // InternalAnsic.g:5349:17: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELLIPSIS"

    // $ANTLR start "RULE_RIGHT_ASSIGN"
    public final void mRULE_RIGHT_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5351:19: ( '>>=' )
            // InternalAnsic.g:5351:21: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_ASSIGN"

    // $ANTLR start "RULE_LEFT_ASSIGN"
    public final void mRULE_LEFT_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_LEFT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5353:18: ( '<<=' )
            // InternalAnsic.g:5353:20: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_ASSIGN"

    // $ANTLR start "RULE_ADD_ASSIGN"
    public final void mRULE_ADD_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ADD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5355:17: ( '+=' )
            // InternalAnsic.g:5355:19: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADD_ASSIGN"

    // $ANTLR start "RULE_SUB_ASSIGN"
    public final void mRULE_SUB_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_SUB_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5357:17: ( '-=' )
            // InternalAnsic.g:5357:19: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUB_ASSIGN"

    // $ANTLR start "RULE_MUL_ASSIGN"
    public final void mRULE_MUL_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MUL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5359:17: ( '*=' )
            // InternalAnsic.g:5359:19: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUL_ASSIGN"

    // $ANTLR start "RULE_DIV_ASSIGN"
    public final void mRULE_DIV_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5361:17: ( '/=' )
            // InternalAnsic.g:5361:19: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIV_ASSIGN"

    // $ANTLR start "RULE_MOD_ASSIGN"
    public final void mRULE_MOD_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5363:17: ( '%=' )
            // InternalAnsic.g:5363:19: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD_ASSIGN"

    // $ANTLR start "RULE_AND_ASSIGN"
    public final void mRULE_AND_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_AND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5365:17: ( '&=' )
            // InternalAnsic.g:5365:19: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_ASSIGN"

    // $ANTLR start "RULE_XOR_ASSIGN"
    public final void mRULE_XOR_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_XOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5367:17: ( '^=' )
            // InternalAnsic.g:5367:19: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XOR_ASSIGN"

    // $ANTLR start "RULE_OR_ASSIGN"
    public final void mRULE_OR_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_OR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5369:16: ( '|=' )
            // InternalAnsic.g:5369:18: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_ASSIGN"

    // $ANTLR start "RULE_RIGHT_OP"
    public final void mRULE_RIGHT_OP() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5371:15: ( '>>' )
            // InternalAnsic.g:5371:17: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_OP"

    // $ANTLR start "RULE_LEFT_OP"
    public final void mRULE_LEFT_OP() throws RecognitionException {
        try {
            int _type = RULE_LEFT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5373:14: ( '<<' )
            // InternalAnsic.g:5373:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_OP"

    // $ANTLR start "RULE_INC_OP"
    public final void mRULE_INC_OP() throws RecognitionException {
        try {
            int _type = RULE_INC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5375:13: ( '++' )
            // InternalAnsic.g:5375:15: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INC_OP"

    // $ANTLR start "RULE_DEC_OP"
    public final void mRULE_DEC_OP() throws RecognitionException {
        try {
            int _type = RULE_DEC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5377:13: ( '--' )
            // InternalAnsic.g:5377:15: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_OP"

    // $ANTLR start "RULE_PTR_OP"
    public final void mRULE_PTR_OP() throws RecognitionException {
        try {
            int _type = RULE_PTR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5379:13: ( '->' )
            // InternalAnsic.g:5379:15: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PTR_OP"

    // $ANTLR start "RULE_AND_OP"
    public final void mRULE_AND_OP() throws RecognitionException {
        try {
            int _type = RULE_AND_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5381:13: ( '&&' )
            // InternalAnsic.g:5381:15: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_OP"

    // $ANTLR start "RULE_OR_OP"
    public final void mRULE_OR_OP() throws RecognitionException {
        try {
            int _type = RULE_OR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5383:12: ( '||' )
            // InternalAnsic.g:5383:14: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_OP"

    // $ANTLR start "RULE_LE_OP"
    public final void mRULE_LE_OP() throws RecognitionException {
        try {
            int _type = RULE_LE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5385:12: ( '<=' )
            // InternalAnsic.g:5385:14: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LE_OP"

    // $ANTLR start "RULE_GE_OP"
    public final void mRULE_GE_OP() throws RecognitionException {
        try {
            int _type = RULE_GE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5387:12: ( '>=' )
            // InternalAnsic.g:5387:14: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GE_OP"

    // $ANTLR start "RULE_EQ_OP"
    public final void mRULE_EQ_OP() throws RecognitionException {
        try {
            int _type = RULE_EQ_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5389:12: ( '==' )
            // InternalAnsic.g:5389:14: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQ_OP"

    // $ANTLR start "RULE_NE_OP"
    public final void mRULE_NE_OP() throws RecognitionException {
        try {
            int _type = RULE_NE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5391:12: ( '!=' )
            // InternalAnsic.g:5391:14: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NE_OP"

    // $ANTLR start "RULE_D"
    public final void mRULE_D() throws RecognitionException {
        try {
            int _type = RULE_D;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5393:8: ( '0' .. '9' )
            // InternalAnsic.g:5393:10: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_D"

    // $ANTLR start "RULE_L"
    public final void mRULE_L() throws RecognitionException {
        try {
            int _type = RULE_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5395:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalAnsic.g:5395:10: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "RULE_E"
    public final void mRULE_E() throws RecognitionException {
        try {
            int _type = RULE_E;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5397:8: ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_D )+ )
            // InternalAnsic.g:5397:10: ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_D )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAnsic.g:5397:20: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
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

            // InternalAnsic.g:5397:31: ( RULE_D )+
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
            	    // InternalAnsic.g:5397:31: RULE_D
            	    {
            	    mRULE_D(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_E"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5399:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAnsic.g:5399:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAnsic.g:5399:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAnsic.g:5399:11: '^'
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

            // InternalAnsic.g:5399:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // InternalAnsic.g:5401:10: ( ( '0' .. '9' )+ )
            // InternalAnsic.g:5401:12: ( '0' .. '9' )+
            {
            // InternalAnsic.g:5401:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnsic.g:5401:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalAnsic.g:5403:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAnsic.g:5403:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAnsic.g:5403:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAnsic.g:5403:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAnsic.g:5403:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAnsic.g:5403:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnsic.g:5403:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAnsic.g:5403:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAnsic.g:5403:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAnsic.g:5403:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnsic.g:5403:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalAnsic.g:5405:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAnsic.g:5405:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAnsic.g:5405:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnsic.g:5405:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalAnsic.g:5407:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAnsic.g:5407:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAnsic.g:5407:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAnsic.g:5407:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalAnsic.g:5407:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAnsic.g:5407:41: ( '\\r' )? '\\n'
                    {
                    // InternalAnsic.g:5407:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAnsic.g:5407:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5409:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAnsic.g:5409:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAnsic.g:5409:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAnsic.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnsic.g:5411:16: ( . )
            // InternalAnsic.g:5411:18: .
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
        // InternalAnsic.g:1:8: ( T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | RULE_AUTO | RULE_BREAK | RULE_CASE | RULE_CHAR | RULE_CONST | RULE_CONTINUE | RULE_DEFAULT | RULE_DO | RULE_DOUBLE | RULE_ELSE | RULE_ENUM | RULE_EXTERN | RULE_FLOAT | RULE_FOR | RULE_GOTO | RULE_IF | RULE_INTE | RULE_LONG | RULE_REGISTER | RULE_RETURNO | RULE_SHORT | RULE_SIGNED | RULE_SIZEOF | RULE_STATIC | RULE_STRUCT | RULE_SWITCH | RULE_TYPEDEF | RULE_UNION | RULE_UNSIGNED | RULE_VOID | RULE_VOLATILE | RULE_WHILE | RULE_ELLIPSIS | RULE_RIGHT_ASSIGN | RULE_LEFT_ASSIGN | RULE_ADD_ASSIGN | RULE_SUB_ASSIGN | RULE_MUL_ASSIGN | RULE_DIV_ASSIGN | RULE_MOD_ASSIGN | RULE_AND_ASSIGN | RULE_XOR_ASSIGN | RULE_OR_ASSIGN | RULE_RIGHT_OP | RULE_LEFT_OP | RULE_INC_OP | RULE_DEC_OP | RULE_PTR_OP | RULE_AND_OP | RULE_OR_OP | RULE_LE_OP | RULE_GE_OP | RULE_EQ_OP | RULE_NE_OP | RULE_D | RULE_L | RULE_E | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=95;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalAnsic.g:1:10: T__68
                {
                mT__68(); 

                }
                break;
            case 2 :
                // InternalAnsic.g:1:16: T__69
                {
                mT__69(); 

                }
                break;
            case 3 :
                // InternalAnsic.g:1:22: T__70
                {
                mT__70(); 

                }
                break;
            case 4 :
                // InternalAnsic.g:1:28: T__71
                {
                mT__71(); 

                }
                break;
            case 5 :
                // InternalAnsic.g:1:34: T__72
                {
                mT__72(); 

                }
                break;
            case 6 :
                // InternalAnsic.g:1:40: T__73
                {
                mT__73(); 

                }
                break;
            case 7 :
                // InternalAnsic.g:1:46: T__74
                {
                mT__74(); 

                }
                break;
            case 8 :
                // InternalAnsic.g:1:52: T__75
                {
                mT__75(); 

                }
                break;
            case 9 :
                // InternalAnsic.g:1:58: T__76
                {
                mT__76(); 

                }
                break;
            case 10 :
                // InternalAnsic.g:1:64: T__77
                {
                mT__77(); 

                }
                break;
            case 11 :
                // InternalAnsic.g:1:70: T__78
                {
                mT__78(); 

                }
                break;
            case 12 :
                // InternalAnsic.g:1:76: T__79
                {
                mT__79(); 

                }
                break;
            case 13 :
                // InternalAnsic.g:1:82: T__80
                {
                mT__80(); 

                }
                break;
            case 14 :
                // InternalAnsic.g:1:88: T__81
                {
                mT__81(); 

                }
                break;
            case 15 :
                // InternalAnsic.g:1:94: T__82
                {
                mT__82(); 

                }
                break;
            case 16 :
                // InternalAnsic.g:1:100: T__83
                {
                mT__83(); 

                }
                break;
            case 17 :
                // InternalAnsic.g:1:106: T__84
                {
                mT__84(); 

                }
                break;
            case 18 :
                // InternalAnsic.g:1:112: T__85
                {
                mT__85(); 

                }
                break;
            case 19 :
                // InternalAnsic.g:1:118: T__86
                {
                mT__86(); 

                }
                break;
            case 20 :
                // InternalAnsic.g:1:124: T__87
                {
                mT__87(); 

                }
                break;
            case 21 :
                // InternalAnsic.g:1:130: T__88
                {
                mT__88(); 

                }
                break;
            case 22 :
                // InternalAnsic.g:1:136: T__89
                {
                mT__89(); 

                }
                break;
            case 23 :
                // InternalAnsic.g:1:142: T__90
                {
                mT__90(); 

                }
                break;
            case 24 :
                // InternalAnsic.g:1:148: T__91
                {
                mT__91(); 

                }
                break;
            case 25 :
                // InternalAnsic.g:1:154: T__92
                {
                mT__92(); 

                }
                break;
            case 26 :
                // InternalAnsic.g:1:160: T__93
                {
                mT__93(); 

                }
                break;
            case 27 :
                // InternalAnsic.g:1:166: T__94
                {
                mT__94(); 

                }
                break;
            case 28 :
                // InternalAnsic.g:1:172: T__95
                {
                mT__95(); 

                }
                break;
            case 29 :
                // InternalAnsic.g:1:178: T__96
                {
                mT__96(); 

                }
                break;
            case 30 :
                // InternalAnsic.g:1:184: T__97
                {
                mT__97(); 

                }
                break;
            case 31 :
                // InternalAnsic.g:1:190: T__98
                {
                mT__98(); 

                }
                break;
            case 32 :
                // InternalAnsic.g:1:196: RULE_AUTO
                {
                mRULE_AUTO(); 

                }
                break;
            case 33 :
                // InternalAnsic.g:1:206: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 34 :
                // InternalAnsic.g:1:217: RULE_CASE
                {
                mRULE_CASE(); 

                }
                break;
            case 35 :
                // InternalAnsic.g:1:227: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 36 :
                // InternalAnsic.g:1:237: RULE_CONST
                {
                mRULE_CONST(); 

                }
                break;
            case 37 :
                // InternalAnsic.g:1:248: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 38 :
                // InternalAnsic.g:1:262: RULE_DEFAULT
                {
                mRULE_DEFAULT(); 

                }
                break;
            case 39 :
                // InternalAnsic.g:1:275: RULE_DO
                {
                mRULE_DO(); 

                }
                break;
            case 40 :
                // InternalAnsic.g:1:283: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 41 :
                // InternalAnsic.g:1:295: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 42 :
                // InternalAnsic.g:1:305: RULE_ENUM
                {
                mRULE_ENUM(); 

                }
                break;
            case 43 :
                // InternalAnsic.g:1:315: RULE_EXTERN
                {
                mRULE_EXTERN(); 

                }
                break;
            case 44 :
                // InternalAnsic.g:1:327: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 45 :
                // InternalAnsic.g:1:338: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 46 :
                // InternalAnsic.g:1:347: RULE_GOTO
                {
                mRULE_GOTO(); 

                }
                break;
            case 47 :
                // InternalAnsic.g:1:357: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 48 :
                // InternalAnsic.g:1:365: RULE_INTE
                {
                mRULE_INTE(); 

                }
                break;
            case 49 :
                // InternalAnsic.g:1:375: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 50 :
                // InternalAnsic.g:1:385: RULE_REGISTER
                {
                mRULE_REGISTER(); 

                }
                break;
            case 51 :
                // InternalAnsic.g:1:399: RULE_RETURNO
                {
                mRULE_RETURNO(); 

                }
                break;
            case 52 :
                // InternalAnsic.g:1:412: RULE_SHORT
                {
                mRULE_SHORT(); 

                }
                break;
            case 53 :
                // InternalAnsic.g:1:423: RULE_SIGNED
                {
                mRULE_SIGNED(); 

                }
                break;
            case 54 :
                // InternalAnsic.g:1:435: RULE_SIZEOF
                {
                mRULE_SIZEOF(); 

                }
                break;
            case 55 :
                // InternalAnsic.g:1:447: RULE_STATIC
                {
                mRULE_STATIC(); 

                }
                break;
            case 56 :
                // InternalAnsic.g:1:459: RULE_STRUCT
                {
                mRULE_STRUCT(); 

                }
                break;
            case 57 :
                // InternalAnsic.g:1:471: RULE_SWITCH
                {
                mRULE_SWITCH(); 

                }
                break;
            case 58 :
                // InternalAnsic.g:1:483: RULE_TYPEDEF
                {
                mRULE_TYPEDEF(); 

                }
                break;
            case 59 :
                // InternalAnsic.g:1:496: RULE_UNION
                {
                mRULE_UNION(); 

                }
                break;
            case 60 :
                // InternalAnsic.g:1:507: RULE_UNSIGNED
                {
                mRULE_UNSIGNED(); 

                }
                break;
            case 61 :
                // InternalAnsic.g:1:521: RULE_VOID
                {
                mRULE_VOID(); 

                }
                break;
            case 62 :
                // InternalAnsic.g:1:531: RULE_VOLATILE
                {
                mRULE_VOLATILE(); 

                }
                break;
            case 63 :
                // InternalAnsic.g:1:545: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 64 :
                // InternalAnsic.g:1:556: RULE_ELLIPSIS
                {
                mRULE_ELLIPSIS(); 

                }
                break;
            case 65 :
                // InternalAnsic.g:1:570: RULE_RIGHT_ASSIGN
                {
                mRULE_RIGHT_ASSIGN(); 

                }
                break;
            case 66 :
                // InternalAnsic.g:1:588: RULE_LEFT_ASSIGN
                {
                mRULE_LEFT_ASSIGN(); 

                }
                break;
            case 67 :
                // InternalAnsic.g:1:605: RULE_ADD_ASSIGN
                {
                mRULE_ADD_ASSIGN(); 

                }
                break;
            case 68 :
                // InternalAnsic.g:1:621: RULE_SUB_ASSIGN
                {
                mRULE_SUB_ASSIGN(); 

                }
                break;
            case 69 :
                // InternalAnsic.g:1:637: RULE_MUL_ASSIGN
                {
                mRULE_MUL_ASSIGN(); 

                }
                break;
            case 70 :
                // InternalAnsic.g:1:653: RULE_DIV_ASSIGN
                {
                mRULE_DIV_ASSIGN(); 

                }
                break;
            case 71 :
                // InternalAnsic.g:1:669: RULE_MOD_ASSIGN
                {
                mRULE_MOD_ASSIGN(); 

                }
                break;
            case 72 :
                // InternalAnsic.g:1:685: RULE_AND_ASSIGN
                {
                mRULE_AND_ASSIGN(); 

                }
                break;
            case 73 :
                // InternalAnsic.g:1:701: RULE_XOR_ASSIGN
                {
                mRULE_XOR_ASSIGN(); 

                }
                break;
            case 74 :
                // InternalAnsic.g:1:717: RULE_OR_ASSIGN
                {
                mRULE_OR_ASSIGN(); 

                }
                break;
            case 75 :
                // InternalAnsic.g:1:732: RULE_RIGHT_OP
                {
                mRULE_RIGHT_OP(); 

                }
                break;
            case 76 :
                // InternalAnsic.g:1:746: RULE_LEFT_OP
                {
                mRULE_LEFT_OP(); 

                }
                break;
            case 77 :
                // InternalAnsic.g:1:759: RULE_INC_OP
                {
                mRULE_INC_OP(); 

                }
                break;
            case 78 :
                // InternalAnsic.g:1:771: RULE_DEC_OP
                {
                mRULE_DEC_OP(); 

                }
                break;
            case 79 :
                // InternalAnsic.g:1:783: RULE_PTR_OP
                {
                mRULE_PTR_OP(); 

                }
                break;
            case 80 :
                // InternalAnsic.g:1:795: RULE_AND_OP
                {
                mRULE_AND_OP(); 

                }
                break;
            case 81 :
                // InternalAnsic.g:1:807: RULE_OR_OP
                {
                mRULE_OR_OP(); 

                }
                break;
            case 82 :
                // InternalAnsic.g:1:818: RULE_LE_OP
                {
                mRULE_LE_OP(); 

                }
                break;
            case 83 :
                // InternalAnsic.g:1:829: RULE_GE_OP
                {
                mRULE_GE_OP(); 

                }
                break;
            case 84 :
                // InternalAnsic.g:1:840: RULE_EQ_OP
                {
                mRULE_EQ_OP(); 

                }
                break;
            case 85 :
                // InternalAnsic.g:1:851: RULE_NE_OP
                {
                mRULE_NE_OP(); 

                }
                break;
            case 86 :
                // InternalAnsic.g:1:862: RULE_D
                {
                mRULE_D(); 

                }
                break;
            case 87 :
                // InternalAnsic.g:1:869: RULE_L
                {
                mRULE_L(); 

                }
                break;
            case 88 :
                // InternalAnsic.g:1:876: RULE_E
                {
                mRULE_E(); 

                }
                break;
            case 89 :
                // InternalAnsic.g:1:883: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 90 :
                // InternalAnsic.g:1:891: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 91 :
                // InternalAnsic.g:1:900: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 92 :
                // InternalAnsic.g:1:912: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 93 :
                // InternalAnsic.g:1:928: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 94 :
                // InternalAnsic.g:1:944: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 95 :
                // InternalAnsic.g:1:952: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\5\uffff\1\70\1\uffff\1\74\1\76\1\101\1\105\1\uffff\1\110\1\114\1\116\1\121\1\124\1\127\1\132\2\uffff\1\136\1\uffff\1\143\2\uffff\1\150\1\151\1\153\1\154\1\156\1\157\13\143\1\u0084\2\143\1\uffff\2\62\36\uffff\1\u0089\2\uffff\1\u008b\15\uffff\3\126\3\uffff\2\126\2\uffff\1\126\2\uffff\1\126\2\uffff\3\126\1\u0098\3\126\1\uffff\1\167\1\126\1\u009d\11\126\10\uffff\4\126\1\u00b0\7\126\1\uffff\4\126\1\uffff\1\u00bc\14\126\1\u00ca\1\u00cb\3\126\1\uffff\1\u00cf\2\126\1\u00d2\3\126\1\u00d6\1\u00d7\1\126\1\u00d9\1\uffff\11\126\1\u00e3\2\126\1\u00e6\2\uffff\1\u00e7\1\126\1\u00e9\1\uffff\1\u00ea\1\126\1\uffff\1\u00ec\2\126\2\uffff\1\126\1\uffff\2\126\1\u00f2\6\126\1\uffff\1\126\1\u00fa\2\uffff\1\126\2\uffff\1\126\1\uffff\1\126\1\u00fe\1\u00ff\1\126\1\u0101\1\uffff\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\2\126\1\uffff\2\126\1\u010b\2\uffff\1\126\6\uffff\1\u010d\1\126\1\u010f\1\u0110\1\uffff\1\u0111\1\uffff\1\u0112\4\uffff";
    static final String DFA14_eofS =
        "\u0113\uffff";
    static final String DFA14_minS =
        "\1\0\4\uffff\1\56\1\uffff\1\46\1\75\1\53\1\55\1\uffff\1\75\1\52\1\75\1\74\3\75\2\uffff\1\75\1\uffff\1\60\2\uffff\11\60\1\53\10\60\1\53\1\60\1\uffff\2\0\36\uffff\1\75\2\uffff\1\75\15\uffff\1\141\1\163\1\156\3\uffff\1\157\1\162\2\uffff\1\156\2\uffff\1\151\2\uffff\1\164\1\145\1\146\1\60\1\163\1\165\1\164\1\uffff\1\60\1\164\1\60\1\164\1\147\1\157\1\147\1\141\1\151\1\160\2\151\10\uffff\1\162\1\145\1\163\1\141\1\60\1\147\1\157\1\151\1\157\2\141\1\142\1\uffff\1\145\1\155\1\145\1\157\1\uffff\1\60\1\151\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145\1\144\1\141\1\154\2\60\1\164\1\151\1\164\1\uffff\1\60\1\156\1\147\1\60\1\153\1\165\1\154\2\60\1\162\1\60\1\uffff\1\163\1\162\1\164\1\145\1\157\1\151\2\143\1\144\1\60\1\164\1\145\1\60\2\uffff\1\60\1\156\1\60\1\uffff\1\60\1\156\1\uffff\1\60\1\154\1\145\2\uffff\1\156\1\uffff\1\164\1\156\1\60\1\144\1\146\1\143\1\164\1\150\1\145\1\uffff\1\151\1\60\2\uffff\1\165\2\uffff\1\145\1\uffff\1\164\2\60\1\145\1\60\1\uffff\5\60\1\146\1\154\1\uffff\1\145\1\144\1\60\2\uffff\1\162\6\uffff\1\60\1\145\2\60\1\uffff\1\60\1\uffff\1\60\4\uffff";
    static final String DFA14_maxS =
        "\1\uffff\4\uffff\1\56\1\uffff\3\75\1\76\1\uffff\4\75\1\76\1\172\1\174\2\uffff\1\75\1\uffff\1\172\2\uffff\21\172\1\71\2\172\1\uffff\2\uffff\36\uffff\1\75\2\uffff\1\75\15\uffff\1\141\1\163\1\156\3\uffff\1\157\1\162\2\uffff\1\156\2\uffff\1\163\2\uffff\1\164\1\145\1\146\1\172\1\163\1\165\1\164\1\uffff\1\172\1\164\1\172\2\164\1\157\1\172\1\162\1\151\1\160\1\154\1\151\10\uffff\1\162\1\145\1\164\1\141\1\172\1\147\1\157\1\151\1\157\2\141\1\142\1\uffff\1\145\1\155\1\145\1\157\1\uffff\1\172\1\151\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145\1\144\1\141\1\154\2\172\1\164\1\151\1\164\1\uffff\1\172\1\156\1\147\1\172\1\153\1\165\1\154\2\172\1\162\1\172\1\uffff\1\163\1\162\1\164\1\145\1\157\1\151\2\143\1\144\1\172\1\164\1\145\1\172\2\uffff\1\172\1\156\1\172\1\uffff\1\172\1\156\1\uffff\1\172\1\154\1\145\2\uffff\1\156\1\uffff\1\164\1\156\1\172\1\144\1\146\1\143\1\164\1\150\1\145\1\uffff\1\151\1\172\2\uffff\1\165\2\uffff\1\145\1\uffff\1\164\2\172\1\145\1\172\1\uffff\5\172\1\146\1\154\1\uffff\1\145\1\144\1\172\2\uffff\1\162\6\uffff\1\172\1\145\2\172\1\uffff\1\172\1\uffff\1\172\4\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\4\uffff\1\13\7\uffff\1\23\1\24\1\uffff\1\26\1\uffff\1\30\1\31\24\uffff\1\131\2\uffff\1\136\1\137\1\1\1\2\1\3\1\4\1\100\1\5\1\6\1\110\1\120\1\7\1\105\1\10\1\103\1\115\1\11\1\104\1\116\1\117\1\12\1\13\1\125\1\14\1\106\1\134\1\135\1\15\1\107\1\16\1\uffff\1\122\1\17\1\uffff\1\123\1\20\1\111\1\131\1\21\1\112\1\121\1\22\1\23\1\24\1\124\1\25\1\26\3\uffff\1\127\1\30\1\31\2\uffff\1\32\1\33\1\uffff\1\34\1\35\1\uffff\1\36\1\37\7\uffff\1\130\14\uffff\1\126\1\132\1\133\1\136\1\102\1\114\1\101\1\113\14\uffff\1\47\4\uffff\1\57\22\uffff\1\55\13\uffff\1\60\15\uffff\1\43\1\42\3\uffff\1\61\2\uffff\1\40\3\uffff\1\51\1\52\1\uffff\1\56\11\uffff\1\75\2\uffff\1\27\1\44\1\uffff\1\54\1\73\1\uffff\1\41\5\uffff\1\64\7\uffff\1\77\3\uffff\1\50\1\53\1\uffff\1\63\1\65\1\66\1\67\1\70\1\71\4\uffff\1\46\1\uffff\1\72\1\uffff\1\45\1\74\1\62\1\76";
    static final String DFA14_specialS =
        "\1\2\56\uffff\1\0\1\1\u00e2\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\62\2\61\2\62\1\61\22\62\1\61\1\14\1\57\2\62\1\16\1\7\1\60\1\1\1\2\1\10\1\11\1\6\1\12\1\5\1\15\12\53\1\24\1\26\1\17\1\25\1\20\1\23\1\62\4\55\1\54\1\33\5\55\1\35\10\55\1\37\5\55\1\3\1\62\1\4\1\21\1\56\1\62\1\40\1\41\1\27\1\42\1\43\1\32\1\44\1\55\1\45\2\55\1\34\5\55\1\46\1\47\1\50\1\36\1\51\1\52\3\55\1\30\1\22\1\31\1\13\uff81\62",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "\1\73\26\uffff\1\72",
            "\1\75",
            "\1\100\21\uffff\1\77",
            "\1\103\17\uffff\1\102\1\104",
            "",
            "\1\107",
            "\1\112\4\uffff\1\113\15\uffff\1\111",
            "\1\115",
            "\1\117\1\120",
            "\1\123\1\122",
            "\1\125\3\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\130\76\uffff\1\131",
            "",
            "",
            "\1\135",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\1\141\6\126\1\140\6\126\1\142\13\126",
            "",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\13\126\1\146\2\126\1\147\13\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\16\126\1\152\13\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\15\126\1\155\14\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\24\126\1\160\5\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\21\126\1\161\10\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\4\126\1\162\11\126\1\163\13\126",
            "\1\167\1\uffff\1\167\2\uffff\12\170\7\uffff\32\126\4\uffff\1\126\1\uffff\13\126\1\164\1\126\1\165\11\126\1\166\2\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\16\126\1\171\13\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\5\126\1\172\7\126\1\173\14\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\4\126\1\174\25\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\7\126\1\175\1\176\12\126\1\177\2\126\1\u0080\3\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\30\126\1\u0081\1\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\16\126\1\u0082\13\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\7\126\1\u0083\22\126",
            "\12\u0085",
            "\1\167\1\uffff\1\167\2\uffff\12\170\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "\0\u0086",
            "\0\u0086",
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
            "\1\u0088",
            "",
            "",
            "\1\u008a",
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
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "",
            "",
            "\1\u0091",
            "",
            "",
            "\1\u0092\11\uffff\1\u0093",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\24\126\1\u0097\5\126",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\12\170\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u009c",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u009e",
            "\1\u009f\14\uffff\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\22\uffff\1\u00a3",
            "\1\u00a4\20\uffff\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8\2\uffff\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\1\u00ae",
            "\1\u00af",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\31\126\1\u00c9",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00d0",
            "\1\u00d1",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00d8",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00e4",
            "\1\u00e5",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00e8",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00eb",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "",
            "\1\u00fb",
            "",
            "",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u0100",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "",
            "\1\u010c",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\1\u010e",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "\12\126\7\uffff\32\126\4\uffff\1\126\1\uffff\32\126",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | RULE_AUTO | RULE_BREAK | RULE_CASE | RULE_CHAR | RULE_CONST | RULE_CONTINUE | RULE_DEFAULT | RULE_DO | RULE_DOUBLE | RULE_ELSE | RULE_ENUM | RULE_EXTERN | RULE_FLOAT | RULE_FOR | RULE_GOTO | RULE_IF | RULE_INTE | RULE_LONG | RULE_REGISTER | RULE_RETURNO | RULE_SHORT | RULE_SIGNED | RULE_SIZEOF | RULE_STATIC | RULE_STRUCT | RULE_SWITCH | RULE_TYPEDEF | RULE_UNION | RULE_UNSIGNED | RULE_VOID | RULE_VOLATILE | RULE_WHILE | RULE_ELLIPSIS | RULE_RIGHT_ASSIGN | RULE_LEFT_ASSIGN | RULE_ADD_ASSIGN | RULE_SUB_ASSIGN | RULE_MUL_ASSIGN | RULE_DIV_ASSIGN | RULE_MOD_ASSIGN | RULE_AND_ASSIGN | RULE_XOR_ASSIGN | RULE_OR_ASSIGN | RULE_RIGHT_OP | RULE_LEFT_OP | RULE_INC_OP | RULE_DEC_OP | RULE_PTR_OP | RULE_AND_OP | RULE_OR_OP | RULE_LE_OP | RULE_GE_OP | RULE_EQ_OP | RULE_NE_OP | RULE_D | RULE_L | RULE_E | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_47 = input.LA(1);

                        s = -1;
                        if ( ((LA14_47>='\u0000' && LA14_47<='\uFFFF')) ) {s = 134;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_48 = input.LA(1);

                        s = -1;
                        if ( ((LA14_48>='\u0000' && LA14_48<='\uFFFF')) ) {s = 134;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='(') ) {s = 1;}

                        else if ( (LA14_0==')') ) {s = 2;}

                        else if ( (LA14_0=='[') ) {s = 3;}

                        else if ( (LA14_0==']') ) {s = 4;}

                        else if ( (LA14_0=='.') ) {s = 5;}

                        else if ( (LA14_0==',') ) {s = 6;}

                        else if ( (LA14_0=='&') ) {s = 7;}

                        else if ( (LA14_0=='*') ) {s = 8;}

                        else if ( (LA14_0=='+') ) {s = 9;}

                        else if ( (LA14_0=='-') ) {s = 10;}

                        else if ( (LA14_0=='~') ) {s = 11;}

                        else if ( (LA14_0=='!') ) {s = 12;}

                        else if ( (LA14_0=='/') ) {s = 13;}

                        else if ( (LA14_0=='%') ) {s = 14;}

                        else if ( (LA14_0=='<') ) {s = 15;}

                        else if ( (LA14_0=='>') ) {s = 16;}

                        else if ( (LA14_0=='^') ) {s = 17;}

                        else if ( (LA14_0=='|') ) {s = 18;}

                        else if ( (LA14_0=='?') ) {s = 19;}

                        else if ( (LA14_0==':') ) {s = 20;}

                        else if ( (LA14_0=='=') ) {s = 21;}

                        else if ( (LA14_0==';') ) {s = 22;}

                        else if ( (LA14_0=='c') ) {s = 23;}

                        else if ( (LA14_0=='{') ) {s = 24;}

                        else if ( (LA14_0=='}') ) {s = 25;}

                        else if ( (LA14_0=='f') ) {s = 26;}

                        else if ( (LA14_0=='F') ) {s = 27;}

                        else if ( (LA14_0=='l') ) {s = 28;}

                        else if ( (LA14_0=='L') ) {s = 29;}

                        else if ( (LA14_0=='u') ) {s = 30;}

                        else if ( (LA14_0=='U') ) {s = 31;}

                        else if ( (LA14_0=='a') ) {s = 32;}

                        else if ( (LA14_0=='b') ) {s = 33;}

                        else if ( (LA14_0=='d') ) {s = 34;}

                        else if ( (LA14_0=='e') ) {s = 35;}

                        else if ( (LA14_0=='g') ) {s = 36;}

                        else if ( (LA14_0=='i') ) {s = 37;}

                        else if ( (LA14_0=='r') ) {s = 38;}

                        else if ( (LA14_0=='s') ) {s = 39;}

                        else if ( (LA14_0=='t') ) {s = 40;}

                        else if ( (LA14_0=='v') ) {s = 41;}

                        else if ( (LA14_0=='w') ) {s = 42;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 43;}

                        else if ( (LA14_0=='E') ) {s = 44;}

                        else if ( ((LA14_0>='A' && LA14_0<='D')||(LA14_0>='G' && LA14_0<='K')||(LA14_0>='M' && LA14_0<='T')||(LA14_0>='V' && LA14_0<='Z')||LA14_0=='h'||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='q')||(LA14_0>='x' && LA14_0<='z')) ) {s = 45;}

                        else if ( (LA14_0=='_') ) {s = 46;}

                        else if ( (LA14_0=='\"') ) {s = 47;}

                        else if ( (LA14_0=='\'') ) {s = 48;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 49;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='$')||LA14_0=='@'||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='\u007F' && LA14_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}