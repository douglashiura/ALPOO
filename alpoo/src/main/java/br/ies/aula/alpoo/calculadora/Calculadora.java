package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Object resultado;

	public void soma(Integer parcela1, Integer parcela2) {
		resultado = parcela1 + parcela2;
	}

	public Object obterResultado() {
		return resultado;
	}

	public void multi(Integer x, Integer y) {
		resultado = x * y;		
	}

}
