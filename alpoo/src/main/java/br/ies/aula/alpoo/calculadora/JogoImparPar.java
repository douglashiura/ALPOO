package br.ies.aula.alpoo.calculadora;

public class JogoImparPar {
	private static final Object PAR = "PAR";
	private static final Object  IMPAR = "IMPAR";
	private static Float primeiro;
	private static Float segundo;
	
	public Object calculo(Float x, Float y) {
		Calculadora calc = new Calculadora();
		Float resultado = calc.soma(primeiro, segundo);
		if(ePar(resultado)) {
			return PAR;
		}else {
			return IMPAR;
		}
	}
	
	public boolean ePar(Float x) {
		return x % 2 == 0;
	}
	
	public void definirNumeros(Float x, Float y) {
		primeiro = x;
		segundo = y;
	}
}
