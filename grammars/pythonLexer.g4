lexer grammar pythonLexer;



//Indentation

@members {
    private Stack<Integer> indents = new Stack<>();
    private LinkedList<Token> pendingTokens = new LinkedList<>();
    private int opened = 0;

    public PythonFlaskLexer(CharStream input) {
        super(input);
        indents.push(0);
    }

    @Override
    public Token nextToken() {
        if (!pendingTokens.isEmpty()) {
            return pendingTokens.removeFirst();
        }

        Token token = super.nextToken();

        if (token.getType() == EOF) {
            while (indents.size() > 1) {
                indents.pop();
                Token dedent = new CommonToken(DEDENT, "<DEDENT>");
                pendingTokens.add(dedent);
            }

            if (!pendingTokens.isEmpty()) {
                return pendingTokens.removeFirst();
            }
        }

        return token;
    }

    private Token createToken(int type, String text) {
        return new CommonToken(type, text);
    }
}


NEWLINE
    :   ('\r'? '\n')+ {
            String spaces = "";
            int pos = 1;
            while (true) {
                int c = _input.LA(pos);
                if (c == ' ' || c == '\t') {
                    spaces += (char)c;
                    pos++;
                } else break;
            }

            if (opened > 0) {
                skip();
            } else {
                emit(createToken(NEWLINE, "\n"));

                int currentIndent = spaces.replace("\t","    ").length();
                int previousIndent = indents.peek();

                if (currentIndent > previousIndent) {
                    indents.push(currentIndent);
                    pendingTokens.add(createToken(INDENT, "<INDENT>"));
                } else {
                    while (currentIndent < previousIndent) {
                        indents.pop();
                        previousIndent = indents.peek();
                        pendingTokens.add(createToken(DEDENT, "<DEDENT>"));
                    }
                }
            }
        }
    ;

INDENT  : '<INVALID_INDENT>' -> skip;
DEDENT  : '<INVALID_DEDENT>' -> skip;

WS      : [ \t]+ -> skip;



// Condition
    IF  :    'if';
    ELIF :   'elif'; //اختصار ل else if
    ELSE : 'else';

     // loops

     FOR     : 'for';
     WHILE   : 'while';
    BREAK   : 'break';
    CONTINUE: 'continue';

     //Definition
    DEF     : 'def';


    // OOP
    CLASS   : 'class';
    RETURN  : 'return';
    IMPORT  : 'import';

     //operator
    EQUAL :'=';
    NOTEQUAL:'!=';
    EQUALEQUAL   : '==';
    LESSTHAN      : '<';
    GREATERTHAN     : '>';
    LESSOREQUAL      : '<=';
    GREATEROREQUAL      : '>=';
    PLUS    : '+';
    MINUS   : '-';
    STAR    : '*';
    SLASH   : '/';
    PERCENT : '%';
    COLON :':';
    COMMA : ',';
    DOT : '.';
    AT : '@';
    ARROW:'->';
    FROM : 'from';
    AS      : 'as';
    PASS    : 'pass';



// print
    PRINT :'print';


 // data type
 NAME :[a-zA-Z_][a-zA-Z0-9_]*;
 INT :[0-9]+;
FLOAT  : DIGIT+ '.' DIGIT* ;
DIGIT : [0-9] ;


 //Comment
 COMMENT : '#' ~[\r\n]* -> skip;


TRUE    : 'True';
FALSE   : 'False';
NONE    : 'None';
AND     : 'and';
OR      : 'or';
NOT     : 'not';


// Brackets

OPEND_NORMAL_BRAKET :'('{opened++;};
CLOSED_NORMAL_BRAKET:')'{opened--;};

OPEND_SQUAR_BRAKET:'['{opened++;};
CLOSED_SQUAR_BRAKET:']'{opened--;};

OPEN_CURLY_BRAKET:'{'{opened++;};
CLOSED_CURLY_BRAKET:'}'{opened--;};


     //Handle string

STRING_SINGLE : '\'' -> pushMode(STR);
STRING_DOUBLE : '"' -> pushMode(STR);
TRIPLE_SINGLE : '\'\'\'' -> pushMode(STR3);
TRIPLE_DOUBLE : '"""' -> pushMode(STR3);
FSTRING_SINGLE : [fF]'\'' -> pushMode(FSTR);
FSTRING_DOUBLE : [fF]'"' -> pushMode(FSTR);
FTRIPLE_SINGLE : [fF]'\'\'\'' -> pushMode(FSTR3);
FTRIPLE_DOUBLE : [fF]'"""' -> pushMode(FSTR3);

mode STR;
STR_CONTENT : ~['"\\]+ ;
STR_ESC     : '\\' . ;
STR_END     : ['"] -> popMode ;

mode STR3;
STR3_CONTENT : (.|[\r\n])+? ;
STR3_END     : '\'\'\'' -> popMode ;
STR3_END2    : '"""' -> popMode ;

mode FSTR;
FSTR_CONTENT : ~['"\\{]+ ;
FSTR_BRACE   : '{' -> pushMode(FSTR_EXPR);
FSTR_ESC     : '\\' . ;
FSTR_END     : ['"] -> popMode ;

mode FSTR_EXPR;
FSTR_EXPR_CONTENT : ~[{}]+ ;
FSTR_EXPR_END     : '}' -> popMode ;

mode FSTR3;
FSTR3_CONTENT : (.|[\r\n])+? ;
FSTR3_END     : '\'\'\'' -> popMode ;
FSTR3_END2    : '"""' -> popMode ;


