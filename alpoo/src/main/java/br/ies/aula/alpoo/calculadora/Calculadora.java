package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Double resultado;
	
	public void soma(Double num1, Double num2) {
		resultado = num1 + num2;
	}
	
	public void multiplicar(Double num1, Double num2) {
		resultado = num1 * num2;
	}
	
	public void dividir(Double num1, Double num2) {
		if (num2.equals(0.0)) {
			throw new ArithmeticException();
		}		
		resultado = num1 / num2;
	}
	
	public Double getResultado() {
		return resultado;
	}

}
