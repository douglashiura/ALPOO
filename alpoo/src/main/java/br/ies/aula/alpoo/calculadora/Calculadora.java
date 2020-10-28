package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Integer resultado;
	
	public void somar(Integer num1, Integer num2) {
		resultado = num1 + num2;
	}
	
	public void multiplicar(Integer num1, Integer num2) throws MaxIntegerException {
		resultado = num1 * num2;
		
		if (resultado > Integer.MAX_VALUE) {
			throw new MaxIntegerException("O numero � maior que o limite aceito para um inteiro.");
		}
		
	}
	
	public void dividir(Integer num1, Integer num2) {
		try {
			resultado = num1 / num2;
		} catch (ArithmeticException exception) {
			System.out.println("N�o � possivel fazer a divis�o por zero.");
		}
	}
	
	public Integer obterResultado() {
		return resultado;
	}

}
