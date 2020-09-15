package aula.par.impar;

public class SegundaJogada implements EstadoDeJogada {
	private Aposta primeiraAposta;
	private LojaDoJogoParImpar jogo;

	public SegundaJogada(Aposta primeiraAposta, LojaDoJogoParImpar jogo) {
		this.primeiraAposta = primeiraAposta;
		this.jogo = jogo;
	}

	@Override
	public void jogar(Aposta segundaAposta) {
		ResultadosDoJogoParImpar parImpar = new JogoParImpar()
				.parOuImpar(primeiraAposta, segundaAposta);
		avisaOuvintes(parImpar);
		jogo.iniciarPartida();
	}

	private void avisaOuvintes(ResultadosDoJogoParImpar parImpar) {
		jogo.obterOuvintes().forEach(ouvinte -> {
			ouvinte.avisa(parImpar);
		});
	}

}
