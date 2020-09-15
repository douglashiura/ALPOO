package aula.calculadora;

public class Calculadora {

	private Float resultado;

	public Float obterResultado() {
		return resultado;
	}

	public void soma(Integer value1, Integer value2) {
		resultado = ((float)value1+value2);
	}

	public void multi(Integer value1, Integer value2) {
		resultado = ((float)value1*value2);	
	}

	public void div(Integer value1, Integer value2) {
		if(value2.equals(0)) {
			throw new ArithmeticException();
		}
		resultado = ((float)value1/value2);
	}
}
