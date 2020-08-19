package br.edu.ies.alpoo;

public class Calculator {
	Integer resultado;
	
	public Integer getResult() {
		return resultado;
	}
	
	public Calculator soma(Integer x,Integer y) {
		this.resultado = x + y;
		return this;
	}
	
	public Calculator multiplica(Integer x,Integer y) {
		this.resultado = x * y;
		return this;
	}
	
	public Calculator divide(Integer x,Integer y) {
		this.resultado = x / y; 
		return this;
	}
}
