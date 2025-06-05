lexer grammar HTMLLexer;

This: 'this';
Of: 'of';
Let: 'let';
Index: 'index';

NUMBER: Sign? DIGIT+ (Dot DIGIT+)?;

DoubleLeftCurlyBrace:LeftCurlyBrace LeftCurlyBrace;
DoubleRightCurlyBrace:RightCurlyBrace RightCurlyBrace;

HTMLOpenTag: LeftAngleBracket ElementName;
HTMLCloseTag: LeftAngleBracket Slash ElementName;
HTMLSelfCloseTag: Slash RightAngleBracket;

HTMLComment: (WhiteSpace* StartHTMLComment COMMENT* EndHTMLComment WhiteSpace*) -> skip;
StartHTMLComment: LeftAngleBracket ExclamationMark Dash Dash;
EndHTMLComment: Dash Dash RightAngleBracket;

GreaterOrEqual: RightAngleBracket Equal;
LessOrEqual: LeftAngleBracket Equal;
ConditionalEqual: Equal Equal;
ConditionalNotEqual: ExclamationMark Equal;
StrongConditionalEqual: Equal Equal Equal;
StrongConditionalNotEqual: ExclamationMark Equal Equal;
AndOperator: Ampersand Ampersand;
OrOperator: Pipe Pipe;

// Types
String: 'string';
Number: 'number';
Boolean: 'boolean';
Any: 'any';
Void: 'void';
Sign: Plus | Dash;
True: 'true';
False: 'false';

// HTML
ElementName:    'div'       |
                'span'      |
                'button'    |
                'h1'        |
                'h2'        |
                'h3'        |
                'p'         |
                'a'         |
                'img'       |
                'ol'        |
                'ul'        |
                'li'        |
                'section'   |
                'header'    |
                'footer'    |
                'hr'        |
                'br'        ;

AttributeName:  'id'        |
                'class'     |
                'href'      |
                'src'       |
                'alt'       ;


// Angular
NgFor: 'ngFor';
NgIf: 'ngIf';

EventClick:  'click';
EventFocus:  'focus';

DIGIT: [0-9];
WORD:[a-zA-Z_][a-zA-Z0-9_]*;

// Symbols
Slash:  '/';
BackSlash: '\\';
Equal: '=';
Star: '*';
Dash: '-';
Plus: '+';
Backtick: '`';
Dot: '.';
Comma: ',';
Colon: ':';
SemiColon: ';';
AtSign: '@';
Ampersand: '&';
Pipe: '|';
ExclamationMark: '!';
QuestionMark: '?';
LeftAngleBracket: '<';
RightAngleBracket: '>';
LeftParenthesis: '(';
RightParenthesis: ')';
LeftCurlyBrace: '{';
RightCurlyBrace: '}';
LeftSquareBracket: '[';
RightSquareBracket: ']';
SingleQuotation: '\'';
DoubleQuotation: '"';

WhiteSpace: (' ');
NewLine: ('\n' | '\r') -> skip;

CONTENT: ~[<>];
COMMENT: ~[-];
