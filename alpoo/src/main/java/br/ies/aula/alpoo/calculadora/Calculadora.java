package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Float resultado;

	public void soma(Integer primeiraParcela, Integer segundaParcela) {
		resultado = (float) (primeiraParcela+segundaParcela);
	}

	public Float obterResultado() {
		return resultado;
	}

	public void dividir(Integer quociente, Integer dividendo) {
		if(dividendo.equals(0)) {
			throw new ArithmeticException();
		}
		resultado= ((float)quociente/dividendo); 
	}

	

}