/*
 Gkountelos Dimitrios, AEM: 3663
 email: gkounted@csd.auth.gr
*/

// Define a grammar called SimpleFortran
grammar SimpleFortran;
/*
                ### LEXER ###

    Below are the reserved words of the languages grammar.
    They are written in this type (ex. F U N C T I O N),
    to make the grammar case insensitive. That means that the
    word "FUNction" will be recognized the same as "function".
    To achieve this, every letter is written in the same way as: "F : 'f' | 'F'"
*/
T_FUNCTION : F U N C T I O N ;
T_SUBROUTINE : S U B R O U T I N  E ;
T_END : E N D ;
T_COMMON : C O M M O N ;
 T_INTEGER : I N T E G E R ;
T_REAL : R E A L ;
T_COMPLEX : C O M P L E X ;
T_LOGICAL : L O G I C A L ;
T_CHARACTER : C H A R A C T E R ;
T_STRING : S T R I N G ;
T_LIST : L I S T ;
T_DATA : D A T A ;
T_CONTINUE : C O N T I N U E ;
T_GOTO : G O T O ;
T_CALL : C A L L ;
T_READ : R E A D ;
T_WRITE : W R I T E ;
T_LENGTH : L E N G T H ;
T_NEW : N E W ;
T_IF : I F ;
T_THEN : T H E N ;
T_ELSE :  E L S E ;
T_ENDIF : E N D I F ;
T_DO : D O ;
T_ENDDO : E N D D O ;
T_STOP : S T O P ;
T_RETURN : R E T U R N ;

ID : [a-zA-Z]+ [0-9]* ('_' ([0-9]*([a-zA-Z]+ | ([a-zA-Z]+ '_' [a-zA-Z]+)))* '_')? ;
A : 'A' | 'a';
B : 'B'| 'b';
C : 'C'| 'c';
D : 'D'| 'd';
E : 'E'| 'e';
F : 'F'| 'f';
G : 'G'| 'g';
H : 'H'| 'h';
I : 'I'| 'i';
J : 'J'| 'j';
K : 'K'| 'k';
L : 'L'| 'l';
M : 'M'| 'm';
N : 'N'| 'n';
O : 'O'| 'o';
P : 'P'| 'p';
Q : 'Q'| 'q';
R : 'R'| 'r';
S : 'S'| 's';
T : 'T'| 't';
U : 'U'| 'u';
Y : 'Y'| 'y';
V : 'V'| 'v';
X : 'X'| 'x';
W : 'W'| 'w';
Z : 'Z'| 'z';

/*
    ### SYMBOLS ###
*/
L_PAREN : '(' ;
R_PAREN : ')' ;
COMMA : ',' ;
ASSIGN : '=' ;
COLON : ':' ;
L_BRACK : '[' ;
R_BRACK : ']' ;

/*
    ### OPERATORS ###
*/
OROP : '.' O R '.';
ANDOP : '.' A N D '.' ;
NOTOP : '.' N O T '.' ;
RELOP : '.' G T '.'
     | '.' G E'.'
     | '.' L T '.'
     | '.' L E '.'
     | '.' E Q '.'
     | '.' N E '.' ;
ADDOP : '+'
     | '-' ;
MULOP : '*' ;
DIVOP : '/' ;
POWEROP : '**' ;

/*
    ### SPECIAL CHARACTERS ###
*/
LF : '\'' '\\' 'n' '\'';
FF : '\'' '\\' 'f' '\'';
HT : '\'' '\\' 't' '\'';
CR : '\'' '\\' 'r' '\'';
BS : '\'' '\\' 'b' '\'';
VT : '\'' '\\' 'v' '\'';

/*
        ### DATA TYPES ###
*/
ICONST : '0'
     | [1-9]+[0-9]*
     | ('0X' | '0x')([1-9] | [a-fA-F])+([0-9] | [a-fA-F])*
     | ('0O' | '0o')[1-7]+[0-7]*
     | ('0B' | '0b')[1]+[0-1]* ;

RCONST : [0-9]*'.'[0-9]+ (('E' | 'e')'-'?[0-9]+)?
     | [0-9]+'.'[0-9]* (('E' | 'e')'-'?[0-9]+)?
     | [1-9] [0-9]* '.'*[0-9]* (('E' | 'e')'-'?[0-9]+)?
     | ('0X' | '0x')([1-9] | [a-fA-F])+([0-9] | [a-fA-F])*'.' ([0-9] | [a-fA-F])* ~[0] ([0-9] | [a-fA-F])*
     | ('0O' | '0o')[0-7]* '.' [0-7]* [1-7] [0-7]*
     | ('0B' | '0b')[0-1]* '.' [0-1]* [1] [0-1]*;

LCONST : '.TRUE.' | '.true.'
     | '.FALSE.' | '.false.' ;

CCONST : '\'' [\u0020-\u007e]+ '\''
     | LF
     | FF
     | HT
     | CR
     | BS
     | VT ;

SCONST : '"' ([\u0020] | [\u0021] | [\u0023-\u007e] | ('\\' 'n') | ('\\' 'f') | ('\\' 't') | ('\\' 'r') | ('\\' 'b') | ('\\' 'v') | '\\' | ('\\' '"'))* '"' ;

LISTFUNC : 'C' (('A''D'*) | ('D'+)) 'R' ;

WS : [ \t\r\n]+ ->skip ;
COMMENTS : '$' [ -~]* [ \r\t\n]+ ->skip;
END_EOF : EOF ->channel(1) ;

/*
        ### PARSER ###
*/
program : body T_END subprograms ;

body : declarations statements ;

declarations : declarations type vars
     | declarations T_COMMON cblock_list
     | declarations T_DATA vals
     | ;

type : T_INTEGER | T_REAL | T_COMPLEX | T_LOGICAL | T_CHARACTER | T_STRING ;

vars : vars COMMA undef_variable
     | undef_variable ;

undef_variable : listspec ID L_PAREN dims R_PAREN
     | listspec ID ;

listspec : T_LIST
    | ;

dims : dims COMMA dim
     | dim ;

dim : ICONST | ID ;

cblock_list : cblock_list cblock
     | cblock ;

cblock : DIVOP ID DIVOP id_list ;

id_list : id_list COMMA ID
     | ID ;

vals : vals COMMA ID value_list
     | ID value_list ;

value_list : DIVOP values DIVOP ;

values : values COMMA value
     | value ;

value : repeat sign constant
     | ADDOP constant
     | constant ;

repeat : ICONST MULOP
     | MULOP ;

sign : ADDOP
     | ;

constant : simple_constant
     | complex_constant ;

simple_constant : ICONST | RCONST | LCONST | CCONST | SCONST ;

complex_constant : L_PAREN RCONST COLON sign RCONST R_PAREN ;

statements : statements labeled_statement
     | labeled_statement ;

labeled_statement : label statement
     | statement ;

label : ICONST ;

statement : simple_statement
     | compound_statement;

simple_statement : assignment
     | goto_statement
     | if_statement
     | subroutine_call
     | io_statement
     | T_CONTINUE
     | T_RETURN
     | T_STOP ;

assignment : variable ASSIGN expression ;

variable : ID L_PAREN expressions R_PAREN
     | LISTFUNC L_PAREN expression R_PAREN
     | ID ;

expressions : expressions COMMA expression
     | expression ;

expression : expression OROP expression
     | expression ANDOP expression
     | expression POWEROP expression
     | expression DIVOP expression
     | expression MULOP expression
     | expression ADDOP expression
     | expression RELOP expression
     | NOTOP expression
     | ADDOP expression
     | variable
     | simple_constant
     | T_LENGTH L_PAREN expression R_PAREN
     | T_NEW L_PAREN expression R_PAREN
     | L_PAREN expression R_PAREN
     | L_PAREN expression COLON expression R_PAREN
     | listexpression ;

listexpression : L_BRACK expressions R_BRACK
     | L_BRACK R_BRACK ;

goto_statement : T_GOTO label
     | T_GOTO ID COMMA L_PAREN labels R_PAREN ;

labels : labels COMMA label
     | label ;

if_statement : T_IF L_PAREN expression R_PAREN label COMMA label COMMA label
     | T_IF L_PAREN expression R_PAREN simple_statement ;

subroutine_call : T_CALL variable ;

io_statement : T_READ read_list
     | T_WRITE write_list ;

read_list : read_list COMMA read_item
     | read_item ;

read_item : variable
     | L_PAREN read_list COMMA ID ASSIGN iter_space R_PAREN ;

iter_space : expression COMMA expression step ;

step : COMMA expression
     | ;

write_list : write_list COMMA write_item
     | write_item ;

write_item : expression
     | L_PAREN write_list COMMA ID ASSIGN iter_space R_PAREN ;

compound_statement : branch_statement
     | loop_statement ;

branch_statement : T_IF L_PAREN expression R_PAREN T_THEN body tail ;

tail : T_ELSE body T_ENDIF
     | T_ENDIF ;

loop_statement : T_DO ID ASSIGN iter_space body T_ENDDO ;

subprograms : subprograms subprogram
     | ;

subprogram : header body T_END ;

header : type listspec T_FUNCTION ID L_PAREN formal_parameters R_PAREN
     | T_SUBROUTINE ID L_PAREN formal_parameters R_PAREN
     | T_SUBROUTINE ID;

formal_parameters : type vars COMMA formal_parameters
     | type vars ;
