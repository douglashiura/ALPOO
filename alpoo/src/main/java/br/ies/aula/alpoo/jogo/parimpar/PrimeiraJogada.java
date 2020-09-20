package br.ies.aula.alpoo.jogo.parimpar;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;

public class PrimeiraJogada implements EstadoDeJogada {

	private LojaDoJogoParImpar jogo;

	public PrimeiraJogada(LojaDoJogoParImpar jogo) {
		this.jogo = jogo;
	}

	@Override
	public void jogar(Aposta primeiraAposta) {
		jogo.fixarMaquinaDeEstadoDasJogadas(new SegundaJogada(primeiraAposta, jogo));
	}
}
