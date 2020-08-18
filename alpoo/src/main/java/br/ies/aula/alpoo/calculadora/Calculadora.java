package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Object resultado;

	public void soma(Float parcela1, Float parcela2) {
		resultado = parcela1 + parcela2;
	}

	public Object obterResultado() {
		return resultado;
	}

	public void multi(Float x, Float y) {
		resultado = x * y;		
	}

	public void div(Float x, Float y) {
		if(y.equals(0f)) throw new ArithmeticException();
		resultado = x / y;	
	}

}
