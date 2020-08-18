package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Double resultado;
	
	public Double soma(Double num1, Double num2) {
		resultado = num1 + num2;
		return resultado;
	}
	
	public Double multiplicar(Double num1, Double num2) {
		resultado = num1 * num2;
		return resultado;
	}
	
	public Double dividir(Double num1, Double num2) {
		if (num2 != 0) {
			resultado = num1 / num2;
			return resultado;
		} else {
			return null;
		}
	}
	
	public Double getResultado() {
		return resultado;
	}

}
