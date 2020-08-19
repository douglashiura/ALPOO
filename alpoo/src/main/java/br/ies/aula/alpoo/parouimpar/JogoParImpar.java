package br.ies.aula.alpoo.parouimpar;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class JogoParImpar {
	private static final String PAR = "PAR";
	private static final String IMPAR = "IMPAR";
	private Integer primeiro;
	private Integer segundo;
	
	
	public Object parOuImpar() {
		Calculadora calculadora = new Calculadora();
		calculadora.soma(primeiro, segundo);
		Float resultado = calculadora.obterResultado();
		return ehImpar(resultado) ? IMPAR : PAR;
	}

	private Boolean ehImpar(Float resultado) {
		return resultado % 2 != 0;
	}

	public void fixaJogadas(Integer primeiro, Integer segundo) {
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
	
	
}
