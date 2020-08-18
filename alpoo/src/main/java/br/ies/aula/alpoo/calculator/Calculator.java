package br.ies.aula.alpoo.calculator;

public class Calculator {

	private Float result;
	
	public Float getResult() {
		return result;
	}

	public void add(Integer i, Integer j) {
		result = (float) i + j;
	}
	
	public void multiply(Integer i, Integer j) {
		result = (float) i * j;
	}
	
	public void divide(Integer i, Integer j) {
		if (j.equals(0)) throw new ArithmeticException();
		result = ((float) i / j);
	}
	
}
