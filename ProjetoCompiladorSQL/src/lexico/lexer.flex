package lexico;

import static lexico.Tokens.*;
%%

%class Lexer
%type Tokens
espaço = [ \n\t\r]
tabela = [t]
atrib = [a]
letras = [a-z]
numeros = [1-9]

%{
    public String lexeme;
%}
%%


("select") {lexeme = yytext(); return SELECT;}
("from") {lexeme = yytext(); return FROM;}
("where") {lexeme = yytext(); return WHERE;}
("order") {lexeme = yytext(); return ORDER;}
("by") {lexeme = yytext(); return BY;}
(",") {lexeme = yytext(); return VIRGULA;}
(";") {lexeme = yytext(); return PONTO_E_VIRGULA;}
( "=" ) {lexeme = yytext(); return IGUAL;}
( "*" ) {lexeme = yytext(); return TODOS;}
({tabela}{letras}*) {lexeme = yytext(); return TABELA;}
({atrib}{letras}*) {lexeme = yytext(); return ATRIBUTO;}
({numeros}*) {lexeme = yytext(); return VALOR_NUMERICO;}
{espaço} {}
. {return ERRO;}