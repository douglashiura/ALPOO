package jogo;

import java.sql.SQLException;
import java.util.List;

import jogo.entidades.Aposta;

public class SegundaJogada implements EstadoDeJogada {

	private Aposta primeiraAposta;
	private LojaDoJogoParImpar jogo;

	public SegundaJogada(Aposta primeiraAposta, LojaDoJogoParImpar jogo) {
		this.primeiraAposta = primeiraAposta;
		this.jogo = jogo;
	}

	@Override
	public void jogar(Aposta segundaAposta) throws SQLException {
		List<Aposta> ganhador = new JogoImparPar().calculo(primeiraAposta, segundaAposta);
		avisaOuvinte(ganhador);
		jogo.iniciarPartida();
	}

	private void avisaOuvinte(List<Aposta> aposta) {
		jogo.obterOuvintes().forEach(ouvinte -> {
			ouvinte.avisa(aposta);
		});

	}

}