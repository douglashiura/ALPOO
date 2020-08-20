package br.ies.aula.alpoo.calculadora;

public class Calculadora {
	
	private float resultado;

	public void soma(Integer primeiraParcela, Integer segundaParcela) {
		resultado=((float)primeiraParcela+segundaParcela);
	}

	public Float obterResultado() {
		return resultado;
	}
	
	public void multiplica(Integer primeiraParcela, Integer segundaParcela) {
		resultado=((float)primeiraParcela*segundaParcela);
	}
	
	public void divisao(Integer primeiraParcela, Integer segundaParcela) {
		resultado=((float)primeiraParcela/segundaParcela);
	}
	
	public void subtrair(Integer primeiraParcela, Integer segundaParcela) {
		resultado=((float)primeiraParcela-segundaParcela);
	}
	
}
 

