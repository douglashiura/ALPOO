package br.ies.aula.alpoo.jogo.parimpar;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;

public class PrimeiraJogada implements EstadoDoJogo {
	
	LojaJogoParImpar jogo;
	
	public PrimeiraJogada(LojaJogoParImpar jogo) {
		this.jogo = jogo;
	}

	@Override
	public void jogar(Aposta jogadorUm) {
		jogo.alterarEstado(new SegundaJogada(jogadorUm, jogo));
	}
	
}
