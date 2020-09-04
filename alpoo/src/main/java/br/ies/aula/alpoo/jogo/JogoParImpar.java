package br.ies.aula.alpoo.jogo;

import static br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar.IMPAR;
import static br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar.PAR;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class JogoParImpar {
	public ResultadosDoJogoParImpar parOuImpar(Aposta primeirAposta, Aposta segundaAposta) {
		Calculadora calculadora = new Calculadora();
		calculadora.soma(primeirAposta.getValor(), segundaAposta.getValor());
		Float resultado = calculadora.obterResultado();
		return ehImpar(resultado) ? IMPAR : PAR;
	}

	private Boolean ehImpar(Float resultado) {
		return resultado % 2 != 0;
	}

	

}
