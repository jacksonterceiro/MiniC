
package br.com.minic.analisadorlexico;

import br.com.minic.token.Token;

%%

%class AnalisadorLexico
%unicode
%type Token
%line
%column

LETRA = [a-zA-Z]
DIGITO = [0-9]
FINAL_LINHA = (\r | \n | \r\n | \t)
ESPACO_EM_BRANCO = [ ]
PALAVRA_RESERVADA = (char|else|if|int|float|double|main|printf|printint|printstr|return|static|void|while|for|do|include)
PONTO = (.)
ASPAS_SIMPLES = (')
ASPAS_DUPLA = (\")
BARRA_INVERTIDA = (\\)
OPERADOR_ARITMETICO = ("+"|"-"|"*"|"/")
OPERADOR_COMPARACAO = ("=="|"!="|"<"|">"|"<="|">=")
OPERADOR_ATRIBUICAO = ("=")
OPERADOR_UNARIO = ("!")
OPERADOR_LOGICO = ("&&"|"||")
PONTUACAO = (":" | ";" | "," | "(" | ")" | "{" | "}" | "." | "#" | "&")
COMENTARIO_LINHA = ("//")


PR = {PALAVRA_RESERVADA}+
ID = ({LETRA} | _ )({LETRA} | {DIGITO} | _ )*
LI = {DIGITO}+
LIPF = {DIGITO}+ {PONTO} {DIGITO}+
LI_CHAR = {ASPAS_SIMPLES}({LETRA} | {BARRA_INVERTIDA}{LETRA}){ASPAS_SIMPLES}
LI_STRING = {ASPAS_DUPLA}({LETRA} | {BARRA_INVERTIDA})+{ASPAS_DUPLA}
COM_LI = {COMENTARIO_LINHA}(.)*{FINAL_LINHA}
COM_BL = ("/*" ( [^*]* | "*"+ [^/*] )* "*"+ "/")
%%


{PR} { return new Token( "PR", yyline, yycolumn, yytext() ); }
{ID} { return new Token( "ID", yyline, yycolumn, yytext() ); }
{LI} { return new Token( "LI", yyline, yycolumn, yytext() ); }
{LIPF} { return new Token( "LIPF", yyline, yycolumn, yytext() ); }
{LI_CHAR} { return new Token( "LI_CHAR", yyline, yycolumn, yytext() ); }
{LI_STRING} { return new Token( "LI_STRING", yyline, yycolumn, yytext() ); }

{OPERADOR_ARITMETICO} { return new Token( "OP_ARI", yyline, yycolumn, yytext() ); }
{OPERADOR_COMPARACAO} { return new Token( "OP_COM", yyline, yycolumn, yytext() ); }
{OPERADOR_ATRIBUICAO} { return new Token( "OP_ATR", yyline, yycolumn, yytext() ); }
{OPERADOR_UNARIO} { return new Token( "OP_UNA", yyline, yycolumn, yytext() ); }
{OPERADOR_LOGICO} { return new Token( "OP_LOG", yyline, yycolumn, yytext() ); }
{PONTUACAO} { return new Token( "PONT", yyline, yycolumn, yytext() ); }
{COM_LI} { return new Token( "COM_LI", yyline, yycolumn, yytext() ); }
{COM_BL} { return new Token( "COM_BL", yyline, yycolumn, yytext() ); }



{FINAL_LINHA} {}
{ESPACO_EM_BRANCO} {}




. { return new Token( "ERRO", yyline, yycolumn, yytext() ); }