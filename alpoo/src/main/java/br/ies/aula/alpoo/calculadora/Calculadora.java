package br.ies.aula.alpoo.calculadora;

public class Calculadora {
	
	private Integer resultado;

	public Integer obterResultado() {
		return resultado;
	}

	public void soma(Integer num1, Integer num2) {
		resultado = num1 + num2;		
	}
	
	public void multi(Integer num1, Integer num2) {
		resultado = num1 * num2;		
	}
	
	public void div(Integer num1, Integer num2) {
		if (num1 == 0 || num2 == 0 ) {
			resultado = 0;
			return;
		}
		resultado = num1 / num2;		
	}

}
