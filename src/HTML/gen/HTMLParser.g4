parser grammar HTMLParser;
options {tokenVocab=HTMLLexer;}

// Start Program


// HTML Parser
//
htmlTag: WhiteSpace* tag WhiteSpace*;
//Done
tag: regularTag | selfClosedTag;
//Done Done
regularTag: openTag WhiteSpace* htmlContent WhiteSpace* closeTag;
//Done Done
openTag: HTMLOpenTag (htmlAttribute | ngAttribute | eventAttribute)* WhiteSpace* RightAngleBracket;
//Done Done
closeTag: HTMLCloseTag WhiteSpace* RightAngleBracket;
//Done Done
selfClosedTag: HTMLOpenTag (htmlAttribute | ngAttribute | eventAttribute)* WhiteSpace* HTMLSelfCloseTag;
//Done Done
htmlContent:  (htmlTag | interpolation | content)* ;
//Done Done
content: (WhiteSpace | CONTENT | WORD)+;
//Done Done
// Edited
htmlAttribute:  WhiteSpace+
                (
                    (
                        AttributeName
                        Equal DoubleQuotation attributeValue+ DoubleQuotation
                    ) |
                    (
                        LeftSquareBracket
                        AttributeName
                        RightSquareBracket
                        Equal DoubleQuotation dataAccessing DoubleQuotation
                    )
                );
// done Done
attributeValue: WORD | Sign | NUMBER | Dot;
//Done Done
ngAttribute: WhiteSpace+ Star (ngIf | ngFor);
//Done Done
// Edited
ngIf: NgIf Equal DoubleQuotation WhiteSpace* (conditions | dataAccessing) WhiteSpace* DoubleQuotation;
//Done Done
ngFor: NgFor Equal DoubleQuotation WhiteSpace*
        (
            forStatment
            WhiteSpace*
            SemiColon
            WhiteSpace*
        )?
        forStatment
        WhiteSpace* DoubleQuotation;
// Done Done
forStatment:    variableDeclaration
                WhiteSpace+
                Of
                WhiteSpace+
                (variableAccessing | Index);
// Done Done
variableDeclaration:  Let
                      WhiteSpace+
                      identifier;

//Done Done
eventAttribute: WhiteSpace+ LeftParenthesis WhiteSpace* attributeName WhiteSpace* RightParenthesis Equal
                DoubleQuotation WhiteSpace* functionAccessing WhiteSpace* DoubleQuotation;
//Done Done
attributeName: EventClick | EventFocus;
// Done Done
interpolation: DoubleLeftCurlyBrace WhiteSpace* statement WhiteSpace* DoubleRightCurlyBrace;
// Done Done
conditions: (
                condition
                WhiteSpace*
                combiningOperator
                WhiteSpace*
            )*
            condition;
// Done Done
condition:  statement
            WhiteSpace*
            conditionalOperator
            WhiteSpace*
            statement;
// Done
statement:  (
                dataAccessing
                WhiteSpace*
                (Sign | Star | Slash)
                WhiteSpace*
            )*
            dataAccessing;
// Done Done
combiningOperator: AndOperator | OrOperator;
// Done Done
conditionalOperator:  StrongConditionalEqual    |
                      StrongConditionalNotEqual |
                      ConditionalEqual          |
                      ConditionalNotEqual       |
                      RightAngleBracket         |
                      GreaterOrEqual            |
                      LeftAngleBracket          |
                      LessOrEqual               ;
// Done Done
dataAccessing: variableAccessing | functionAccessing | value;
// Done Done
functionAccessing: (
                       This Dot
                   )?
                   functionCall
                   chaining*;
//Done Done
variableAccessing:  (
                        This Dot
                    )?
                    identifier
                    chaining*;
// Done Done
chaining:   (
                        Dot propertyAccessing
                    )   |
                    (
                        Dot functionCall
                    )   |
                    arrayElementAccessing;
// Done Done
identifier: WORD;
//Done Done
propertyAccessing: identifier;
//Done Done
functionCall: identifier LeftParenthesis WhiteSpace* parameters? WhiteSpace* RightParenthesis;

// Done Done
arrayElementAccessing:  LeftSquareBracket
                        WhiteSpace*
                        (
                            string |
                            number
                        )
                        WhiteSpace*
                        RightSquareBracket;
// Done Done
parameters: (
                WhiteSpace*
                parameter
                WhiteSpace*
                Comma
                WhiteSpace*
            )*
            parameter;
//Done Done
parameter: value | variableAccessing;
//Done Done
value: string   |
       number   |
       boolean  ;
// Done Done
string: (SingleQuotation WORD SingleQuotation) |
        (DoubleQuotation WORD DoubleQuotation) |
        (Backtick WORD Backtick);
// Done Done
number: NUMBER;
// Done Done
boolean: True | False;
