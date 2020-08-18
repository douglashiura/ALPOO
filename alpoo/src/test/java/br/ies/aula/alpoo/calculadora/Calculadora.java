package br.ies.aula.alpoo.calculadora;

public class Calculadora {
	
	private Integer resultado;

	public void soma(Integer primeiraParcela, Integer segundaParcela) {
		resultado=primeiraParcela+segundaParcela;
	}

	public Object obterResultado() {
		return resultado;
	}
	
	public void multiplica(Integer primeiraParcela, Integer segundaParcela) {
		resultado=primeiraParcela*segundaParcela;
	}
	
	public void divisao(Integer primeiraParcela, Integer segundaParcela) {
		resultado=primeiraParcela/segundaParcela;
	}
	
	

}
