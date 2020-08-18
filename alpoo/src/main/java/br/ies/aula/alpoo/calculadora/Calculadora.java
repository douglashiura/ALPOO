package br.ies.aula.alpoo.calculadora;

public class Calculadora {
	
	private Float resultado;

	public Float obterResultado() {
		return resultado;
	}

	public void soma(Integer parcelaA, Integer parcelaB) {
		resultado = ((float)parcelaA + parcelaB);
	}

	public void multiplica(int parcelaA, int parcelaB) {
		resultado = (float) (parcelaA * parcelaB);
	}

	public void divide(Integer dividendo, Integer divisor) {
		if(divisor.equals(0)) {
			throw new ArithmeticException();
		}
		resultado = ((float)dividendo / divisor);
	}
}
