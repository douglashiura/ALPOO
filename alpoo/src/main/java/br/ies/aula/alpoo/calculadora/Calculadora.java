package br.ies.aula.alpoo.calculadora;

public class Calculadora {
	
	private Float resultado;

	public Float obterResultado() {
		return resultado;
	}

	public void soma(Integer parcelaA, Integer parcelaB) {
		resultado = ((float)parcelaA + parcelaB);
	}
	
	public void subtrair(Integer parcelaA, Integer parcelaB) {
		resultado = ((float)parcelaA - parcelaB);
	}
	
	public void multiplica(Integer parcelaA, Integer parcelaB) {
		resultado = ((float)parcelaA * parcelaB);
	}
	
	public void divide(Integer parcelaA, Integer parcelaB) {
		if(parcelaB.equals(0)) {
			throw new ArithmeticException();
		}
		resultado = ((float)parcelaA / parcelaB);
	}


}