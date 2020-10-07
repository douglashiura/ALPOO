package br.ies.aula.alpoo.jogo;

import java.util.List;

import br.ies.aula.alpoo.jogo.banco.GanhadorDB;
import br.ies.aula.alpoo.jogo.entidade.Aposta;
import br.ies.aula.alpoo.jogo.entidade.Ganhador;
import br.ies.aula.alpoo.jogo.entidade.ResultadosDoJogoParImpar;

public class OuvinteQueInsereOVencedorNoBanco implements OuvinteDeResultado {

	@Override
	public void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> vencedoras) {
		try {
			GanhadorDB ganhadorDB = new GanhadorDB();
			for (Aposta aposta : vencedoras) {
				if (resultado == aposta.getAposta()) {
					ganhadorDB.inserirGanhador(new Ganhador(aposta));
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
