package br.com.minic.elementos;

import java.util.List;

public class ProgramaMiniC {

	//Atributos
	private List<DeclaracaoInclude> declaracaoInclude;
	private FuncaoMain funcaoMain;
	private List<DeclaracaoFuncao> declaracaoFuncoes;
	
	//Construtor
	public ProgramaMiniC(List<DeclaracaoInclude> declaracaoInclude, FuncaoMain funcaoMain, List<DeclaracaoFuncao> declaracaoFuncoes) {
		this.declaracaoInclude = declaracaoInclude;
		this.funcaoMain = funcaoMain;
		this.declaracaoFuncoes = declaracaoFuncoes;
	}
	
	
	//GET SET DECLARACAO FUNCAO
	public List<DeclaracaoFuncao> getDeclFuncoes() {
		return declaracaoFuncoes;
	}


	public void setDeclFuncoes(List<DeclaracaoFuncao> declFuncoes) {
		this.declaracaoFuncoes = declFuncoes;
	}

	
	//GET SET FUNCAO MAIN
	public FuncaoMain getFuncaoMain() {
		return funcaoMain;
	}

	public void setFuncaoMain(FuncaoMain funcaoMain) {
		this.funcaoMain = funcaoMain;
	}

	//GET SET DECLARACAO INCLUDE
	public List<DeclaracaoInclude> getDeclaracaoInclude() {
		return declaracaoInclude;
	}

	public void setDeclaracaoInclude(List<DeclaracaoInclude> declaracaoInclude) {
		this.declaracaoInclude = declaracaoInclude;
	}
	
	@Override
	public String toString() {
		
		StringBuilder programaMiniC = new StringBuilder();
		
		if(this.declaracaoInclude != null) {
			for(DeclaracaoInclude declaracaoInclude: this.declaracaoInclude){
				programaMiniC.append(declaracaoInclude.toString());
				programaMiniC.append( "\n" );
			}
		}
		
	    programaMiniC.append( "\n" );
	    programaMiniC.append( "\n" );
	    
	    programaMiniC.append( this.funcaoMain.toString() );
	    
	    programaMiniC.append( "\n" );
	    programaMiniC.append( "\n" );
	    
	    if( this.declaracaoFuncoes != null ) {
	    	
	      for(DeclaracaoFuncao declaracaoFuncao: this.declaracaoFuncoes) {
	      	  
	        programaMiniC.append( declaracaoFuncao.toString() );
	        programaMiniC.append( "\n" );
	          
	      }
	      
	    }
		
		return programaMiniC.toString();
	}

}
