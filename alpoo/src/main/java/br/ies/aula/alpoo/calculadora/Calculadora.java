package br.ies.aula.alpoo.calculadora;

public class Calculadora {
	
	private Float resultado;

	public Float obterResultado() {
		return resultado;
	}

	public void soma(Integer num1, Integer num2) {
		resultado = (float) (num1 + num2);		
	}
	
	public void multi(Integer num1, Integer num2) {
		resultado = (float) (num1 * num2);		
	}
	
	public void div(Integer num1, Integer num2) throws Exception {
		if (num2.equals(0)) {
			throw new ArithmeticException("Não é possivel dividir por zero.");
		}
		resultado = ((float)num1/num2);	
	}

}
