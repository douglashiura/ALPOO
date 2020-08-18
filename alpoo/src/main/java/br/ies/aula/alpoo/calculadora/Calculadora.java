package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private Float resultado;


	public void soma(Float soma1, Float soma2) {
		this.resultado = soma1+soma2;
	}

	public void dividir(Float d1, Float d2) {
		this.resultado = d1/d2;
	}
	/*public void dividirZero(Float d1, Float d2) {
		if(d2.equals(0)) {
			throw new ArithmeticException();
		}
	}*/
	public void multiplicar(Float produto1, Float produto2) {
		this.resultado = produto1*produto2;
	}
	public void subtrair(Float n1, Float n2) {
		this.resultado = n1-n2;
	}
	public Float obterResultado() {
		return this.resultado;
	}
}
