parser grammar AngularParser;
options {tokenVocab=AngularLexer;}

// Start Program
// Done
program: importStatement*
         component*
         (
             exportClass |
             (
                class
                export
             )
         );
// =========================

// Imports
// Done
importStatement: Import
                 importLibs+
                 From string SemiColon;
// Done Done
importLibs: LeftCurlyBrace
            (
                identifier Comma
            )*
            identifier Comma?
            RightCurlyBrace;
// =========================

// Angular Component
// Done Done
component:  AngularDecorator
            LeftParenthesis LeftCurlyBrace
            (
                componentMetaData
                Comma
            )*
            (
                componentMetaData
                Comma?
            )?
            RightCurlyBrace RightParenthesis;
// Done Done
componentMetaData:  componentMetaDataKey componentMetaDataValue;
// Done Done
componentMetaDataKey: identifier Colon;
// Done Done
componentMetaDataValue: value | variableAccessing;
// =========================

// Export and Class
// Done Done
exportClass: Export class;
// Done Done
class: Class identifier classBody;
// Done Done
export: Export LeftCurlyBrace identifier RightCurlyBrace SemiColon;
// Done Done
classBody:  LeftCurlyBrace
            (
                classAttribute  |
                classMethod
            )*
            RightCurlyBrace;
// Done Done
classAttribute: accessModifiers?
                identifier
                type?
                (
                    assigningOperator
                    value
                )?
                SemiColon;
// Done Done
classMethod: (
                 Constructor    |
                 (
                    accessModifiers?
                    identifier
                 )
             )
             arguments
             type?
             block;
// =========================

// Code Blocks
// Done Done
block:  LeftCurlyBrace
        blockContent*
        RightCurlyBrace;
// Done Done
blockContent: variable    |
               function    |
               ifElseBlock |
               forBlock    |
               whileBlock  |
               return;
// Done Done
variable:   (
                variableDeclaration |
                variableAccessing
            )
            variableAssigning?
            SemiColon;
// Done Done
variableDeclaration:  declaration?
                      identifier
                      type?;
// Done Done
variableAccessing:  chainingOperator?
                    (
                        This Dot
                    )?
                    identifier
                    variableChaining*
                    chainingOperator?;
// Done Done
variableChaining:   (
                        Dot propertyAccessing
                    )   |
                    (
                        Dot functionCall
                    )   |
                    arrayElementAccessing;
// Done Done
variableAssigning:  assigningOperator
                    (
                        statement
                        MathOperator
                    )*
                    statement;
// Done Done
propertyAccessing: identifier;
// Done Done
arrayElementAccessing:  LeftSquareBracket
                        (
                            string |
                            number
                        )
                        RightSquareBracket;
// Done Done
function:   functionDeclaration |
            (
                functionAccessing
                SemiColon
            );
// Done Done
functionDeclaration: Function
                     identifier
                     arguments
                     type?
                     block;
// Done Done
functionAccessing: (
                       This Dot
                   )?
                   functionCall
                   variableChaining*;
// Done Done
functionCall: identifier LeftParenthesis parameters? RightParenthesis;
// Done Done
ifElseBlock:    ifStatement
                ifElseStatement*
                elseStatement?;
// Done Done
ifStatement: If LeftParenthesis conditions RightParenthesis block;
// Done Done
ifElseStatement: Else If LeftParenthesis conditions RightParenthesis block;
// Done Done
elseStatement: Else block;
// Done Done
forBlock: forStatment block;
// Done
forStatment: For
             LeftParenthesis
             (
                (
                    variable
                    conditions
                    SemiColon
                    variableAccessing
                )   |
                (
                    variableDeclaration
                    Of
                    variableAccessing
                )
             )
             RightParenthesis;
// Done Done
whileBlock: whileStatement block;

// Done Done
whileStatement: While
               LeftParenthesis
               conditions?
               RightParenthesis;
// Done Done
conditions: (
                condition
                combiningOperator
            )*
            condition;
// Done Done
condition:  statement
            conditionalOperator
            statement;
// Done Done
statement:  variableAccessing   |
            functionAccessing   |
            value;
// =========================

// Essential Code
// Done Done
combiningOperator: AndOperator | OrOperator;
// Done Done
conditionalOperator:  StrongConditionalEqual    |
                      StrongConditionalNotEqual |
                      ConditionalEqual          |
                      ConditionalNotEqual       |
                      GreaterThan               |
                      GreaterOrEqual            |
                      LessThan                  |
                      LessOrEqual               ;
// Done Done
assigningOperator:  Equal       |
                    PlusEqual   |
                    MinusEqual  ;
// Done Done
chainingOperator: Increment | Decrement;
// Done Done
arguments:  LeftParenthesis
            (
                argument
                Comma
            )*
            argument?
            RightParenthesis;
// Done Done
argument: accessModifiers?
          identifier
          QuestionMark?
          type?;
// Done Done
parameters: (
                parameter
                Comma
            )*
            parameter;
// Done Done
parameter: value;
// Done Done
declaration: Let    |
             Const  |
             Var;
// Done Done
accessModifiers: Private    |
                 Public     |
                 Protected;
// Done Done
type: Colon
      (
        (
            String      |
            Number      |
            Boolean     |
            Any         |
            identifier  |
            objectType
        )
        (
            LeftSquareBracket
            RightSquareBracket
        )?
      ) |
      Void;
// Done Done
identifier: IDENTIFIER;
// Done Done
objectType: LeftCurlyBrace
            (
                propertyType
                SemiColon
            )*
            propertyType
            RightCurlyBrace;
// Done Done
propertyType: identifier
              type;
// Done Done
return: Return
        statement?
        SemiColon;
// Done Done
value: string   |
       number   |
       boolean  |
       array    |
       object   |
       anonymousFunction;
// Done Done
string: SingleQuotationString   |
        DoubleQuotationString   |
        MultiLinesString;
// Done Done
number: NUMBER;
// Done Done
boolean: True | False;
// Done Done
array:  LeftSquareBracket
        (
            element
            Comma
        )*
        (
            element
            Comma?
        )?
        RightSquareBracket;
// Done Done
element: value | variableAccessing;
// Done Done
object: LeftCurlyBrace
        (
            property
            Comma
        )*
        (
            property
            Comma?
        )?
        RightCurlyBrace;

// Done Done
property: identifier
          Colon
          value;
// Done Done
anonymousFunction:  arguments
                    type?
                    Arrow
                    block;
// =========================