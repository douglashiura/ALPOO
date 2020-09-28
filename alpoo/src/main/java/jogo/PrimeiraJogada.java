package jogo;

import jogo.entidades.Aposta;

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
