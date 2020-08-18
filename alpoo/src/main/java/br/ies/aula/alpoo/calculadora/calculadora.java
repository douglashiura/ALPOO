package br.ies.aula.alpoo.calculadora;

public class calculadora {

	private Float resultado;

	public void soma(Integer primeiraParcela, Integer segundaParcela) {
		resultado = (float) (primeiraParcela+segundaParcela);
	}

	public Float obterResultado() {
		return resultado;
	}

	public void dividir(Integer x, Integer y) {
		if(y.equals(0)) {
			throw new ArithmeticException();
		}
		resultado= ((float)x/y); 
	}

	public void multiplica(Float x, Float y) {
		resultado = x * y;
	}
}