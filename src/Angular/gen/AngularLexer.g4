lexer grammar AngularLexer;

// Comment
TypeScriptComment: (WhiteSpace* StartTypeScriptComment COMMENT_CONTENT*) -> skip;
StartTypeScriptComment: Slash Slash;

// Angular
AngularDecorator: AtSign IDENTIFIER;

// Essentials
Import: 'import';
From: 'from';
Export: 'export';
Class: 'class';
Let: 'let';
Const: 'const';
Var: 'var';
Return: 'return';
Private: 'private';
Public: 'public';
Protected: 'protected';
Constructor: 'constructor';
Function: 'function';
This: 'this';
If: 'if';
Else: 'else';
For: 'for';
While: 'while';
Of: 'of';
// Companation
MathOperator: Plus | Dash | Star | Slash;
Sign: Plus | Dash;
Increment: Plus Plus;
Decrement: Dash Dash;
PlusEqual: Plus Equal;
MinusEqual: Dash Equal;
Arrow: Equal RightAngleBracket;
GreaterThan: RightAngleBracket;
GreaterOrEqual: RightAngleBracket Equal;
LessThan: LeftAngleBracket;
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

// Values
True: 'true';
False: 'false';
MultiLinesString: Backtick MULTI_LINES_STRING_CONTENT* Backtick;
DoubleQuotationString: DoubleQuotation DOUBLE_QUOTATION_STRING_CONTENT* DoubleQuotation;
SingleQuotationString: SingleQuotation SINGLE_QUOTATION_STRING_CONTENT* SingleQuotation;
NUMBER: Sign? DIGIT+ (Dot DIGIT+)?;

DIGIT: [0-9];
IDENTIFIER:[a-zA-Z_][a-zA-Z0-9_]*;
WORD: [a-zA-Z0-9-_];

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

WhiteSpace: (' ') -> skip;
NewLine: ('\n' | '\r') -> skip;

SINGLE_QUOTATION_STRING_CONTENT: ~['];
DOUBLE_QUOTATION_STRING_CONTENT: ~["];
MULTI_LINES_STRING_CONTENT: ~[`];

COMMENT_CONTENT: ~[\n];
