lexer grammar pythonLexer;

@lexer::header {
import org.antlr.v4.runtime.*;
import java.util.*;
}

tokens { INDENT, DEDENT }

@members {
    private static final int TAB_LENGTH = 8;

    private Deque<Integer> indents = new ArrayDeque<>();
    private LinkedList<Token> pending = new LinkedList<>();
    private int opened = 0;

    public pythonLexer(CharStream input) {
        super(input);
        indents.push(0);
    }

    @Override
    public Token nextToken() {
        if (!pending.isEmpty()) {
            return pending.poll();
        }

        Token t = super.nextToken();

        if (t.getType() == EOF) {

            while (indents.size() > 1) {
                indents.pop();
                pending.add(new CommonToken(DEDENT, ""));
            }
            pending.add(t);
            return pending.poll();
        }

        return t;
    }

    private void emitIndentation(String spaces) {
        int indent = countIndent(spaces);
        int prev = indents.peek();

        if (indent > prev) {
            indents.push(indent);
            pending.add(new CommonToken(INDENT, ""));
        }
        else if (indent < prev) {
            while (indents.peek() > indent) {
                indents.pop();
                pending.add(new CommonToken(DEDENT, ""));
            }
            if (indents.peek() != indent) {
                throw new RuntimeException("IndentationError: inconsistent indentation");
            }
        }
    }

    private int countIndent(String spaces) {
        int count = 0;
        for (char c : spaces.toCharArray()) {
            count += (c == '\t') ? TAB_LENGTH : 1;
        }
        return count;
    }

    private void openBrace() { opened++; }
    private void closeBrace() { opened--; }
}


// NEWLINE

NEWLINE
    : '\r'? '\n' [ \t]* {
        if (opened == 0) {
            String text = getText();
            String spaces = text.replaceAll("[^\t ]", "");

            // 1) emit NEWLINE
            pending.add(new CommonToken(NEWLINE, "\n"));
            // 2) then emit INDENT / DEDENT immediately after
            emitIndentation(spaces);
        }
        else {
            pending.add(new CommonToken(NEWLINE, "\n"));
        }
    }
;

WS : [ \t]+ -> skip;



// Keywords

DEF     : 'def';
CLASS   : 'class';
IF      : 'if';
ELIF    : 'elif';
ELSE    : 'else';
FOR     : 'for';
WHILE   : 'while';
RETURN  : 'return';
BREAK   : 'break';
CONTINUE: 'continue';
PASS    : 'pass';
IMPORT  : 'import';
FROM    : 'from';
AS      : 'as';
IN      : 'in';
TRUE    : 'True';
FALSE   : 'False';
NONE    : 'None';
AND     : 'and';
OR      : 'or';
NOT     : 'not';


// Operators

EQUAL           : '=';
NOTEQUAL        : '!=';
EQUALEQUAL      : '==';
LESSTHAN        : '<';
GREATERTHAN     : '>';
LESSOREQUAL     : '<=';
GREATEROREQUAL  : '>=';
PLUS            : '+';
MINUS           : '-';
STAR            : '*';
SLASH           : '/';
PERCENT         : '%';
COLON           : ':';
COMMA           : ',';
DOT             : '.';
AT              : '@';
ARROW           : '->';
SEMICOLON       : ';';


// Brackets (IMPORTANT)

OPEND_NORMAL_BRAKET   : '(' { openBrace(); };
CLOSED_NORMAL_BRAKET  : ')' { closeBrace(); };
OPEND_SQUAR_BRAKET    : '[' { openBrace(); };
CLOSED_SQUAR_BRAKET   : ']' { closeBrace(); };
OPEN_CURLY_BRAKET     : '{' { openBrace(); };
CLOSED_CURLY_BRAKET   : '}' { closeBrace(); };


// Literals & Identifiers



NAME   : [a-zA-Z_][a-zA-Z0-9_]*;
FLOAT  : [0-9]+ '.' [0-9]*;
INT    : [0-9]+;
STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;


// Comments

COMMENT : '#' ~[\r\n]* -> skip;

