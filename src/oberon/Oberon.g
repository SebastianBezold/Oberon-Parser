grammar Oberon;

options {
  language=Java;
  output=AST;
}

tokens {
  STATEMENTSEQUENCE;
  SET;
  ID;
  STATEMENT2;
  DESIGNATOR;
  ASSIGNMENT;
  PROCEDURECALL;
  IDLIST;
  COND;
}

@lexer::header{ package oberon; }
@parser::header{ package oberon; }

// Skip comments and whitespace
COMMENT :               '(*' (options{greedy=false;}: .)* '*)' {skip();};
WS:                     ('\t' | ' ' | '\r' | '\n' )+ { skip(); };

fragment LETTER:        'a'..'z' | 'A'..'Z';
fragment DIGIT:         '0'..'9';
fragment OTHER:         ' ' | '.' | ':' | '\\"';
fragment CHARACTER:     LETTER | DIGIT | OTHER;
fragment HEXDIGIT:      DIGIT | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

IDENTIFIER:             LETTER ( LETTER | DIGIT )*;
INTEGER:                DIGIT+ | DIGIT HEXDIGIT* 'H'; 
REAL:                   DIGIT+ '.' DIGIT* SCALEFACTOR?;
SCALEFACTOR:            ( 'E' | 'D' ) ( '+' | '-')? DIGIT DIGIT*;
CHARCONST:              '"' CHARACTER '"' | DIGIT HEXDIGIT* 'X';
STRING:                 '"' CHARACTER* '"';

// Start-rule
module:                 'MODULE'^ IDENTIFIER ';'! importlist? declarationsequence ('BEGIN'! statementsequence)? 'END'! IDENTIFIER! '.'! EOF!;

importlist:             'IMPORT' importo (',' importo)* ';'
                        -> importo+;
              
importo:                IDENTIFIER (':='! IDENTIFIER)?;

declarationsequence:    ( 'CONST'^ (constantdeclaration ';'!)* | 'TYPE'^ (typedeclaration ';'!)* | 'VAR'^ (variabledeclaration ';'!)* )*;
 
constantdeclaration:    identifierdefinition '='! constantexpression;
identifierdefinition:   IDENTIFIER '*'?;

constantexpression:     expression;
expression:             simpleexpression (relation^ simpleexpression)?;

simpleexpression:       ('+'|'-')? term (addoperator term)*;
term: factor            (multoperator factor)*;
factor:                 number | CHARCONST | STRING | 'NIL' | set | designator actualparameters? | '(' expression ')' | '~' factor;
number:                 INTEGER | REAL;

set:                    '{' (element (',' element)*)? '}' -> ^(SET element+);
element:                expression ('..' expression)?;

designator:             qualifiedidentifier ( options{ greedy=true;}:'.' IDENTIFIER | '[' e=expressionlist ']' | '(' q=qualifiedidentifier  ')' | '^')*
                        -> ^(DESIGNATOR qualifiedidentifier IDENTIFIER?) $e? $q? '^'?;
            
expressionlist:         expression ( ',' expression)*;

actualparameters:       '('! expressionlist? ')'!;

multoperator:           '*' | '/' | 'DIV' | 'MOD' | '&';
addoperator:            '+' | '-' | 'OR';
relation:               '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS';

typedeclaration:        identifierdefinition '=' type;

type:                   qualifiedidentifier | arraytype | recordtype | pointertype | proceduretype;

qualifiedidentifier:    (options{ greedy=true;}:IDENTIFIER '.')? IDENTIFIER -> ^(ID IDENTIFIER*);

arraytype:              'ARRAY'^ length (',' length)* 'OF' type;

length:                 constantexpression;

recordtype:             'RECORD' ('(' basetype ')')? fieldlistsequence 'END';
basetype:               qualifiedidentifier;
fieldlistsequence:      fieldlist (';' fieldlist)*;
fieldlist:              (identifierlist ':' type)?;
identifierlist:         identifierdefinition (',' identifierdefinition)*;
pointertype:            'POINTER' 'TO' type;
proceduretype:          'PROCEDURE' formalparameters?;

variabledeclaration:    identifierlist ':' type;
proceduredeclaration:   procedureheading ';' procedurebody IDENTIFIER;
procedureheading:       'PROCEDURE' '*'? identifierdefinition formalparameters?;

formalparameters:       '('! (formalparametersection ( ';' formalparametersection)*)? ')'! (':' qualifiedidentifier)?;

formalparametersection: 'VAR'? IDENTIFIER (',' IDENTIFIER)* ':' formaltype;
formaltype:             ('ARRAY' 'OF')* ( qualifiedidentifier | proceduretype );
procedurebody:          declarationsequence ('BEGIN' statementsequence)? 'END';
forwarddeclaration:     'PROCEDURE' '^' IDENTIFIER '*'? formalparameters?; 

statementsequence:      statement (';' statement)* -> ^(STATEMENTSEQUENCE statement+) ;

statement:              (statement2 | oberonstatement | ifstatement | casestatement | whilestatement | 
                        repeatstatement | loopstatement | withstatement | 'EXIT' | 'RETURN' expression?)?;

statement2:             designator (':=' expression | procedurecall) 
                        -> ^(ASSIGNMENT designator expression? procedurecall?) ;

procedurecall:          actualparameters?;

ifstatement:            'IF' e1=expression 'THEN' s1=statementsequence 
                        ('ELSIF' e2=expression 'THEN' s2=statementsequence)* 
                        ('ELSE' s3=statementsequence)? 'END'
                        -> ^('IF' ^(COND $e1) $s1 ^('ELSIF' $e2 $s2)? ^('ELSE' $s3)? );

casestatement:          'CASE'^ expression 'OF'! ocase ('|' ocase)* ('ELSE' statementsequence)? 'END'!;
 
ocase:                  (caselabellist ':' statementsequence)?;

caselabellist:          caselabels (',' caselabels)*;
caselabels:             constantexpression ('\.\.' constantexpression)?;

whilestatement:         'WHILE'^ expression 'DO'! statementsequence 'END'!;
repeatstatement:        'REPEAT'^ statementsequence 'UNTIL'! expression;
loopstatement:          'LOOP'^ statementsequence 'END'!;

withstatement:          'WITH'^ qualifiedidentifier ':' qualifiedidentifier 'DO'! statementsequence 'END'!;

// PROCEDURES from language report
oberonstatement:        procnew | procabs | procodd | proccap | procash | proclen |
                        procmaxmin | procsize | procinc | procdec | procincl |
                        procexcl | proccopy | prochalt;

procnew:                'NEW'^ '('! qualifiedidentifier ')'!;
procabs:                'ABS'^ '('! number ')'!;
procodd:                'ODD'^ '('! INTEGER ')'!;
proccap:                'CAP'^ '('! CHARACTER ')'!;
procash:                'ASH'^ '('! INTEGER ')'!;
proclen:                'LEN'^ '('! qualifiedidentifier (',' INTEGER)? ')'!;
procmaxmin:             ('MAX'^|'MIN'^) '('! qualifiedidentifier | set ')'!;
procsize:               'SIZE'^ '('! qualifiedidentifier ')'!;
procinc:                'INC'^ '('! INTEGER (','! INTEGER)? ')'!;
procdec:                'DEC'^ '('! INTEGER (','! INTEGER)? ')'!;
procincl:               'INCL'^ '('! set ','! INTEGER ')'!;
procexcl:               'EXCL'^ '('! set ','! INTEGER ')'!;
proccopy:               'COPY'^ '('! qualifiedidentifier ','! qualifiedidentifier ')'!;
prochalt:               'HALT'^ '('! INTEGER ')'!;