package br.ies.aula.alpoo.jogo;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class JogoParImpar {

	private Double num1;
	private Double num2;
	private Calculadora calc;;
	
	public JogoParImpar(Calculadora calc) {
		this.calc = calc;
	}
	
	public void jogar(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public String parOuImpar() {
		calc.soma(num1, num2);
		Double result = calc.getResultado();
		return result % 2 == 0 ? "PAR" : "IMPAR";
	}

}
