grammar Oberon;

options {
  language=Java;
  output=AST;
}

@lexer::header{ package oberon; }
@parser::header{ package oberon; }

WS: ('\t' | ' ' | '\r' | '\n' )+ { skip(); };

fragment LETTER:  ('a'..'z' | 'A'..'Z');
fragment DIGIT: '0'..'9';
fragment OTHER  :   ' ' | '.' | ':' | '\\"';

fragment CHARACTER: LETTER | DIGIT | OTHER;

module: 'MODULE' IDENTIFIER ';' importlist? declarationsequence ('BEGIN' statementsequence)? 'END' IDENTIFIER '.' EOF;

IDENTIFIER: LETTER (LETTER|DIGIT)*;
importlist: 'IMPORT' importo (',' importo)* ';';
importo: IDENTIFIER (':=' IDENTIFIER)?;


declarationsequence: ( 'CONST' (constantdeclaration ';')* | 'TYPE' (typedeclaration ';')* | 'VAR' (variabledeclaration ';')* )*;
 
constantdeclaration: identifierdefinition '=' constantexpression;
identifierdefinition: IDENTIFIER '*'?;

constantexpression: expression;
expression: simpleexpression (relation simpleexpression)?;

simpleexpression: ('+'|'-')? term (addoperator term)*;
term: factor (multoperator factor)*;
factor: number | charconstant | string | 'NIL' | set | designator actualparameters? | '(' expression ')' | '~' factor;



number: INTEGER | REAL;
INTEGER: DIGIT (DIGIT* | ('A' | 'B' | 'C' | 'D' | 'E' | 'F')* 'H'); 
//HEXDIGIT: DIGIT | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';
REAL: DIGIT+ '.' DIGIT* SCALEFACTOR?;

SCALEFACTOR:  ( 'E' | 'D' ) ( '+' | '-')? DIGIT DIGIT*;

charconstant: '"' CHARACTER '"' | DIGIT INTEGER* 'X';

string: '"' CHARACTER* '"';
set: '{' (element (',' element)*)? '}';
element: expression ('..' expression)?;
designator: qualifiedidentifier ('.' IDENTIFIER | '[' expressionlist ']' | '(' qualifiedidentifier ')' | '^')*;

expressionlist: expression ( ',' expression)*;
actualparameters: '(' expressionlist? ')';

multoperator: '*' | '/' | 'DIV' | 'MOD' | '&';
addoperator: '+' | '-' | 'OR';
relation: '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS';

typedeclaration: identifierdefinition '=' type;
type: qualifiedidentifier | arraytype | recordtype | pointertype | proceduretype;

qualifiedidentifier: IDENTIFIER ('.' IDENTIFIER)?;
arraytype: 'ARRAY' length (',' length)* 'OF' type;
length: constantexpression;

recordtype: 'RECORD' ('(' basetype ')')? fieldlistsequence 'END';
basetype: qualifiedidentifier;
fieldlistsequence: fieldlist (';' fieldlist)*;
fieldlist: (identifierlist ':' type)?;
identifierlist: identifierdefinition (',' identifierdefinition)*;
pointertype: 'POINTER' 'TO' type;
proceduretype:'PROCEDURE' formalparameters?;

variabledeclaration: identifierlist ':' type;
proceduredeclaration: procedureheading ';' procedurebody IDENTIFIER;
procedureheading: 'PROCEDURE' '*'? identifierdefinition formalparameters?;

formalparameters: '(' (formalparametersection ( ';' formalparametersection)*)? ')' (':' qualifiedidentifier)?;

formalparametersection: 'VAR'? IDENTIFIER (',' IDENTIFIER)* ':' formaltype;
formaltype: ('ARRAY' 'OF')* ( qualifiedidentifier | proceduretype );
procedurebody: declarationsequence ('BEGIN' statementsequence)? 'END';
forwarddeclaration: 'PROCEDURE' '^' IDENTIFIER '*'? formalparameters?; 
statementsequence: statement (';' statement)*;

//statement: (assignment | procedurecall | ifstatement | casestatement | whilestatement | repeatstatement | loopstatement | withstatement | 'EXIT' | ('RETURN' expression?))?;
statement: (statement2 | ifstatement | casestatement | whilestatement | repeatstatement | loopstatement | withstatement | 'EXIT' | ('RETURN' expression?))?;
statement2: designator (':=' expression | procedurecall);

procedurecall: actualparameters?;
//assignment: designator ':=' expression;
//procedurecall: designator actualparameters?;

ifstatement: 'IF' expression 'THEN' statementsequence ('ELSIF' expression 'THEN' statementsequence)* ('ELSE' statementsequence)? 'END';

casestatement: 'CASE' expression 'OF' ocase ('|' ocase)* ('ELSE' statementsequence)? 'END';
 
ocase: (caselabellist ':' statementsequence)?;

caselabellist: caselabels (',' caselabels)*;
caselabels: constantexpression ('\.\.' constantexpression)?;
whilestatement: 'WHILE' expression 'DO' statementsequence 'END';
repeatstatement: 'REPEAT' statementsequence 'UNTIL' expression;
loopstatement: 'LOOP' statementsequence 'END';

withstatement: 'WITH' qualifiedidentifier ':' qualifiedidentifier 'DO' statementsequence 'END';