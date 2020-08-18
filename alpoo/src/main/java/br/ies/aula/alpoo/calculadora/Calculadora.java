package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Integer resultado;
	
	public Integer soma(Integer num1, Integer num2) {
		resultado = num1 + num2;
		return resultado;
	}
	
	public Integer multiplicar(Integer num1, Integer num2) {
		resultado = num1 * num2;
		return resultado;
	}
	
	public Integer getResultado() {
		return resultado;
	}

}
