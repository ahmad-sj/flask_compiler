lexer grammar pythonLexer;
tokens { INDENT, DEDENT }

@lexer::members {
    private final java.util.Deque<Token> queue = new java.util.ArrayDeque<>();
    private final java.util.Deque<Integer> indents = new java.util.ArrayDeque<>();
    private int opened = 0;

    private CommonToken ct(int type, String text) {
        return new CommonToken(this._tokenFactorySourcePair, type, Lexer.DEFAULT_TOKEN_CHANNEL,
                getCharIndex() - text.length(), getCharIndex() - 1);
    }

    private void handleNewline() {
        String text = getText();
        String indent = text.replaceAll("[\\r\\n]+", "");
        int next = _input.LA(1);
        if (opened > 0 || next == '\r' || next == '\n' || next == '#' || next == -1 || indent.isEmpty()) {
            skip();
            return;
        }

        emit(ct(NEWLINE, "\n"));

        int prev = indents.isEmpty() ? 0 : indents.peek();
        int curr = indent.length();

        if (curr > prev) {
            indents.push(curr);
            emit(ct(INDENT, indent));
        }
        while (!indents.isEmpty() && indents.peek() > curr) {
            emit(ct(DEDENT, ""));
            indents.pop();
        }
    }

    @Override
    public Token nextToken() {
        if (_input.LA(1) == EOF && !indents.isEmpty()) {
            while (!indents.isEmpty()) {
                emit(ct(DEDENT, ""));
                indents.pop();
            }
        }
        return queue.isEmpty() ? super.nextToken() : queue.poll();
    }

    @Override
    public void emit(Token t) {
        super.emit(t);
        queue.offer(t);
    }
}

DEF: 'def';
CLASS: 'class';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
FROM: 'from';
IMPORT: 'import';
PASS: 'pass';
BREAK: 'break';
CONTINUE: 'continue';
RAISE: 'raise';
GLOBAL: 'global';
NONLOCAL: 'nonlocal';
ASSERT: 'assert';
TRUE: 'True';
FALSE: 'False';
NONE: 'None';

AND: 'and';
OR: 'or';
NOT: 'not';
IS: 'is';
IN: 'in';

ARROW: '->';
WALRUS: ':=';
POWER: '**';
FLOOR_DIV: '//';
EQUALS: '==';
NOT_EQUALS: '!=';
LESS_EQUALS: '<=';
GREATER_EQUALS: '>=';
LESS_THAN: '<';
GREATER_THAN: '>';

DOT: '.';
COMMA: ',';
COLON: ':';
SEMI_COLON: ';';
ASSIGN: '=';
ADD: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
MOD: '%';

OPEN_PAREN  : '(' {opened++;};
CLOSE_PAREN : ')' {opened--;};
OPEN_BRACK  : '[' {opened++;};
CLOSE_BRACK : ']' {opened--;};
OPEN_BRACE  : '{' {opened++;};
CLOSE_BRACE : '}' {opened--;};

NAME : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;

NEWLINE : ('\r'? '\n' [ \t]*) { handleNewline(); };
WS      : [ \t]+ -> skip;
COMMENT : '#' ~[\r\n]* -> skip;
LINE_JOIN : '\\' [ \t]* ('\r'? '\n') -> skip;

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
STR3_CONTENT : (.|[\r\n])*? ;
STR3_END
    : '\'\'\'' -> popMode
    ;
STR3_END2
    : '"""' -> popMode
    ;

mode FSTR;
FSTR_CONTENT : ~['"\\{]+ ;
FSTR_BRACE   : '{' -> pushMode(FSTR_EXPR);
FSTR_ESC     : '\\' . ;
FSTR_END     : ['"] -> popMode ;

mode FSTR_EXPR;
FSTR_EXPR_CONTENT : ~[{}]+ ;
FSTR_EXPR_END     : '}' -> popMode ;

mode FSTR3;
FSTR3_CONTENT : (.|[\r\n])*? ;
FSTR3_END
    : '\'\'\'' -> popMode
    ;
FSTR3_END2
    : '"""' -> popMode
    ;