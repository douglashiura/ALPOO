package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Integer resultado;

	public Object obterResultado() {
		return resultado;
	}

	public void soma(Integer parcelaA, Integer parcelaB) {
		resultado = parcelaA+parcelaB;
	}

	public void multi(Integer parcelaA, Integer parcelaB) {
		resultado = parcelaA*parcelaB;		
	}

	public void div(Integer parcelaA, Integer parcelaB) {
		resultado = parcelaA/parcelaB;		
	}
}
