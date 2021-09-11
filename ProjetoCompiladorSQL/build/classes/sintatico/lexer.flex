package sintatico;

import java_cup.runtime.Symbol;
import sintatico.sym;
// import static sintatico.Tokens.*;
%%


//%public
%cup
%full
%line
%char
%ignorecase
%eofval{
    return new Symbol(sym.EOF, new String("Fim de arquivo"));
%eofval}
//%class Lexer
//%type Tokens
espaço = [ \n\t\r]
/*%{
public String lexeme;
/*public int ContaToken;*/
%}*/
tabela = [t]
atrib = [a]
letras = [a-z]
numeros = [1-9]

%%

/*" " {ContaToken++; return ESPACO}*/
("select") {return new Symbol (sym.SELECT, yychar, yyline, yytext());}
("from") {return new Symbol (sym.FROM, yychar, yyline, yytext());}
("where") {return new Symbol (sym.WHERE, yychar, yyline, yytext());}
("order") {return new Symbol (sym.ORDER, yychar, yyline, yytext());}
("by") {return new Symbol (sym.BY, yychar, yyline, yytext());}
(",") {return new Symbol (sym.VIRGULA, yychar, yyline, yytext());}
(";") {return new Symbol (sym.PONTO_E_VIRGULA, yychar, yyline, yytext());}
( "=" ) {return new Symbol (sym.IGUAL, yychar, yyline, yytext());}
( "*" ) {return new Symbol (sym.TODOS, yychar, yyline, yytext());}
({tabela}{letras}*) {return new Symbol (sym.TABELA, yychar, yyline, yytext());}
({atrib}{letras}*) {return new Symbol (sym.ATRIBUTO, yychar, yyline, yytext());}
({numeros}*) {return new Symbol (sym.VALOR_NUMERICO, yychar, yyline, yytext());}
{espaço} {}
. {System.err.println("Caractere Ilegal: "+yytext());}