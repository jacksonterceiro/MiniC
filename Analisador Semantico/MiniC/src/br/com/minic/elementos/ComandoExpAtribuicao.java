package br.com.minic.elementos;

public class ComandoExpAtribuicao implements IComando {
	
	//Atributos
	IExpressao identificador;
	IExpressao expAtr;
	
	//Construtor
	public ComandoExpAtribuicao(IExpressao identificador, IExpressao expAtr) {
		setIdentificador(identificador);
		setExpAtr(expAtr);
	}

	public IExpressao getIdentificador() {
		return identificador;
	}

	public void setIdentificador(IExpressao identificador) {
		this.identificador = identificador;
	}
	
	public IExpressao getExpAtr() {
		return expAtr;
	}

	public void setExpAtr(IExpressao expAtr) {
		this.expAtr = expAtr;
	}

	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append(this.getIdentificador());
		toString.append(" = ");
		toString.append(this.getExpAtr());
		toString.append(";");
		
		return toString.toString();
	}

	@Override
	public void setEntreParenteses(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
