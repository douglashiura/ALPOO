package br.ies.aula.alpoo.calculadora;

public class JogoImparPar {
	private final Object PAR = "PAR", IMPAR = "IMPAR";
	
	public Object calculo(Float x, Float y) {
		Calculadora calc = new Calculadora();
		Float resultado = calc.soma(x, y);
		if(Float.valueOf(resultado) % 2 == 0) {
			return PAR;
		}else {
			return IMPAR;
		}
	}
}
