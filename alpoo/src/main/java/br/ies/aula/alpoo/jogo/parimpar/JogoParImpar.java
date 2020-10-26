package br.ies.aula.alpoo.jogo.parimpar;

import static br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar.IMPAR;
import static br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar.PAR;

import br.ies.aula.alpoo.calculadora.Calculadora;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;

public class JogoParImpar {
	
	Calculadora calculadora;
	
	public JogoParImpar(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	public ResultadosParImpar parOuImpar(Aposta jogadorUm, Aposta jogadorDois) {
		calculadora.somar(jogadorUm.getJogada(), jogadorDois.getJogada());
		return calculadora.obterResultado() % 2 == 0 ? PAR : IMPAR;
	}
}
