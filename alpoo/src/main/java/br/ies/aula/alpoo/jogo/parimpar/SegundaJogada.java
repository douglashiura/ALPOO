package br.ies.aula.alpoo.jogo.parimpar;

import br.ies.aula.alpoo.calculadora.Calculadora;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;

public class SegundaJogada implements EstadoDoJogo {

	private LojaJogoParImpar jogo;
	private Aposta apostaUm;
	
	public SegundaJogada(Aposta jogadorUm, LojaJogoParImpar jogo) {
		this.apostaUm = jogadorUm;
		this.jogo = jogo;
	}

	@Override
	public void jogar(Aposta apostaDois) {
		ResultadosParImpar resultado = new JogoParImpar(new Calculadora()).parOuImpar(apostaUm, apostaDois);
		jogo.avisarOuvintes(resultado);
		jogo.iniciarPartida();
	}
	
}
