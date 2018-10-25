
package br.com.minic.analisadorlexico;

import java.io.FileReader;
import java.io.IOException;

import br.com.minic.token.Token;

public class AnalisadorLexicoApp {

  public static void main(String[] args) {

		try {
			FileReader arquivoTeste = new FileReader("programas/ProgramaTeste.txt");
			
			AnalisadorLexico analisadorLexico = new AnalisadorLexico(arquivoTeste);	
			Token token = analisadorLexico.yylex();
			
			while(token != null) {
				token.setLexema(token.getLexema().replace("\n", "").replace("\r", ""));
				System.out.println(token);
				token = analisadorLexico.yylex();
			}
			
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}

  }
  
}
