package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Integer resultado;

	public void soma(Integer primeiraParcela, Integer segundaParcela) {
		resultado=primeiraParcela+segundaParcela;
	}

	public Integer obterResultado() {
		return resultado;
	}

}
