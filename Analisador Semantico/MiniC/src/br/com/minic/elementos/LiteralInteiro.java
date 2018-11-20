package br.com.minic.elementos;

public class LiteralInteiro implements IExpressao {

	//ATRIBUTO
	private int valor;

	//CONSTRUTOR
	public LiteralInteiro(int valor) {
	  this.setValor( valor ); 
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
  @Override
  public String toString() {
    return String.valueOf(this.getValor());
  }

	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}

}
