package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Float resultado;

	public Float soma(Float parcela1, Float parcela2) {
		return resultado = parcela1 + parcela2;
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
