lexer grammar templateFragments;

fragment ID: [a-zA-Z_][a-zA-Z0-9_]*;
fragment STRING: '\'' [a-zA-Z0-9()._-]* '\'' | '"' [a-zA-Z0-9()._-]* '"';
fragment NUMBER
    : INT
    | FLOAT
    ;

fragment INT: [0-9]+;
fragment FLOAT: [0-9]+ '.' [0-9]+;

// comparison operators
fragment J_COMP_EQ: '==';
fragment J_COMP_NEQ: '!=';
fragment J_COMP_GT: '>';
fragment J_COMP_GE: '>=';
fragment J_COMP_LT: '<';
fragment J_COMP_LE: '<=';
fragment J_COMP_IN: 'in';
fragment J_COMP_NIN: 'not in';

// test values
fragment J_TEST_DEFINED: 'defined';
fragment J_TEST_UNDEFINED: 'undefined';
fragment J_TEST_NONE: 'none';
fragment J_TEST_NUMBER: 'number';
fragment J_TEST_FILE: 'file';
fragment J_TEST_SAMEAS: 'sameas';
fragment J_TEST_SEQUENCE: 'sequence';
fragment J_TEST_MAPPING: 'mapping';
fragment J_TEST_EVEN: 'even';
fragment J_TEST_ODD: 'odd';
fragment J_TEST_LOWER: 'lower';
fragment J_TEST_UPPER: 'upper';


fragment LAB: '<';
fragment RAB: '>';

fragment LBRACE: '{';
fragment RBRACE: '}';

fragment LPAREN: '(';
fragment RPAREN: ')';

fragment SLASH: '/';

fragment SQUOT: '\'';
fragment DQUOT: '"';
fragment EQ: '=';
fragment DASH: '-';

fragment DOT: '.';
fragment COLON: ':';
fragment SEMICOLON: ';';
fragment COMMA: ',';

fragment TILDE: '~';
fragment EXCALM: '!';
fragment AT: '@';
fragment HASH: '#';
fragment DOLLAR: '$';
fragment PERCENT: '%';
fragment POWER: '^';
fragment AND: '&';
fragment STAR: '*';
fragment PIPELINE: '|';

fragment MULT: '*';
fragment PLUS: '+';
fragment MINUS: '-';
fragment DIV: '/';




fragment CSS_ID: [a-zA-Z] [a-zA-Z0-9\-_:.]*;
fragment CSS_PROP_NAME: [a-zA-Z@] [a-zA-Z\-]*;
fragment CSS_PROP_VAL_FRAG: [a-zA-Z0-9#(),.]+;

fragment CSS_STATE: 'hover' | 'active' | 'visited';


fragment HTML_TAG_NAME: 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio'
        | 'b' | 'base' | 'basfont' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas'
        | 'caption' | 'cite' | 'code' | 'col' | 'colgroup'
        | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt'
        | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form'
        | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hr' | 'html'
        | 'i' | 'iframe' | 'img' | 'input' | 'ins'
        | 'kbd'
        | 'label' | 'legend' | 'li' | 'link'
        | 'main' | 'map' | 'mark' | 'meta' | 'meter'
        | 'nav' | 'noscript'
        | 'object' | 'ol'
        | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress'
        | 'q'
        | 'rp' | 'rt' | 'ruby'
        | 's' | 'samp' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup'
        | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track'
        | 'u' | 'ul'
        | 'var' | 'video'
        | 'wbr'
        ;

// not used yet
fragment HTML_GLOBAL_ATTR: 'accesskey' | 'class' | 'contenteditable' | 'dir' | 'draggable' | 'enterkeyhint' | 'hidden' | 'id'
                           'inert' | 'inputmode' | 'lang' | 'popover' | 'spellcheck' |  | 'style' | 'tabindex' | 'title' | 'translate';