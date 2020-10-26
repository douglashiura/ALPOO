package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Integer resultado;
	
	public void somar(Integer num1, Integer num2) {
		resultado = num1 + num2;
	}
	
	public void multiplicar(Integer num1, Integer num2) {
		resultado = num1 * num2;
	}
	
	public void dividir(Integer num1, Integer num2) {
		if (num2.equals(0)) {
			throw new ArithmeticException();
		}		
		resultado = num1 / num2;
	}
	
	public Integer obterResultado() {
		return resultado;
	}

}
