package br.ies.aula.alpoo.jogo.parimpar;

import static br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar.IMPAR;
import static br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar.PAR;

import br.ies.aula.alpoo.calculadora.Calculadora;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

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
