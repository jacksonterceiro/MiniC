package br.com.minic.elementos;

public class LiteralPontoFlutuante implements IExpressao {

	//Atributo
	private double valor;

	//Construtor
	public LiteralPontoFlutuante(double valor) {
	  this.setValor( valor );
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
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
