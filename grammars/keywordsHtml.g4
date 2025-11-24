lexer grammar keywordsHtml;

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

