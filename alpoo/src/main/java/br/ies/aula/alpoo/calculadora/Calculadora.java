package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Float resultado;

	public void soma(Integer num1, Integer num2) {
		resultado = (float) (num1 + num2);
	}

	public Float obterResultado() {
		return resultado;
	}

	public void mult(Integer num1, Integer num2) {
		resultado = (float) (num1 * num2);
	}

	public void dividir(Integer num1, Integer num2) {
		if(num2.equals(0)) {
			throw new ArithmeticException("Zero não é divisivel.");
		}
		resultado = ((float)num1/num2);  
	}

}
