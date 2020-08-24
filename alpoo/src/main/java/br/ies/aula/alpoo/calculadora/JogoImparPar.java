package br.ies.aula.alpoo.calculadora;

public class JogoImparPar {
	private final Object PAR = "PAR", IMPAR = "IMPAR";
	
	public Object calculo(Float x, Float y) {
		Calculadora calc = new Calculadora();
		Float resultado = calc.soma(x, y);
		if(ePar(resultado)) {
			return PAR;
		}else {
			return IMPAR;
		}
	}
	
	public boolean ePar(Float x) {
		return x % 2 == 0;
	}
}
