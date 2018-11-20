package br.com.minic.elementos;


public class DeclaracaoInclude {
	
	//Atributos
	private String nomeBiblioteca;
	
	//Construtor
	public DeclaracaoInclude(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}

	public String getNomeBiblioteca() {
		return nomeBiblioteca;
	}

	public void setNomeBiblioteca(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}
	
	@Override
	public String toString() {
		return "#include <" + this.nomeBiblioteca + ".h>";
	}
	

}
