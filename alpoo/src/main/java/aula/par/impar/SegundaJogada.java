package aula.par.impar;

import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;
import aula.par.impar.entidade.Vencedor;

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
		
		if(parImpar == primeiraAposta.getAposta()) {
			avisaOuvintes(parImpar, primeiraAposta);
			jogo.usarBancoDeVencedor(new Vencedor(primeiraAposta));
		}else {
			avisaOuvintes(parImpar, segundaAposta);
			jogo.usarBancoDeVencedor(new Vencedor(segundaAposta));
		}
		
		jogo.iniciarPartida();
	}

	private void avisaOuvintes(ResultadosDoJogoParImpar parImpar, Aposta apostaVencedora) {
		jogo.obterOuvintesDeResultado().forEach(ouvinte -> {
			ouvinte.avisa(parImpar, apostaVencedora);
		});
		
	}

}
