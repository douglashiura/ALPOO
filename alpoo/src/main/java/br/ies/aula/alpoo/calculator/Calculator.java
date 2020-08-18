package br.ies.aula.alpoo.calculator;

public class Calculator {

	private Integer result;
	
	public Integer getResult() {
		return result;
	}

	public void add(Integer i, Integer j) {
		result = i + j;
	}
	
	public void multiply(Integer i, Integer j) {
		result = i * j;
	}
	
	public void divide(Integer i, Integer j) {
		result = i / j;
	}
	
}
