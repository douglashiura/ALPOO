package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private int resultado;

	public int obterResultado() {
		return resultado;
	}

	public void soma(Integer parcelaA, Integer parcelaB) {
		resultado=parcelaA+parcelaB;
		
	}
}
