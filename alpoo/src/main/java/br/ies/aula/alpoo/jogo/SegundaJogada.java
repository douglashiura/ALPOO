package br.ies.aula.alpoo.jogo;

import br.ies.aula.alpoo.jogo.entidade.Aposta;
import br.ies.aula.alpoo.jogo.entidade.ResultadosDoJogoParImpar;

public class SegundaJogada implements EstadoDeJogada {
	private Aposta primeiraAposta;
	private LojaDoJogoParImpar jogo;

	public SegundaJogada(Aposta primeiraAposta, LojaDoJogoParImpar jogo) {
		this.primeiraAposta = primeiraAposta;
		this.jogo = jogo;
	}

	@Override
	public void jogar(Aposta segundaAposta) {
		ResultadosDoJogoParImpar parImpar = new JogoParImpar().parOuImpar(primeiraAposta, segundaAposta);
		jogo.avisaOuvintes(parImpar);
		jogo.iniciarPartida();
	}

}