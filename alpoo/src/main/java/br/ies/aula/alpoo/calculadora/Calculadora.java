package br.ies.aula.alpoo.calculadora;

public class Calculadora {
 private Float resultado;
 
	public Float obterResultado() {		
		return resultado;
		
	}

	public void soma(Integer parcelaA, Integer parcelaB) {
		resultado = Float.valueOf(parcelaA) + Float.valueOf(parcelaB);		
	}
	
	public void multiplica(Integer parcelaA, Integer parcelaB) {
		resultado = Float.valueOf(parcelaA) * Float.valueOf(parcelaB);
	}
	
	public void divide(Integer parcelaA, Integer parcelaB) {
		if (parcelaA.equals(0)) {
			throw new ArithmeticException();
		}
		resultado = Float.valueOf(parcelaA) / Float.valueOf(parcelaB);
		
	}

	
}
