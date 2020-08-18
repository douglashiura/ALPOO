package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Integer resultado;
	
	public Integer obterResultado() {
		return resultado;
	}
	
	public Integer soma(Integer num1, Integer num2) {
		resultado = num1 + num2;
		return resultado;
	}

}
