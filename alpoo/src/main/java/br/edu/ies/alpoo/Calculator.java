package br.edu.ies.alpoo;

public class Calculator {
	Object resultado;
	
	public Object getResult() {
		return resultado;
	}
	
	public void soma(Integer x,Integer y) {
		this.resultado = x + y; 
	}
}
