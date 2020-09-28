package br.ies.aula.alpoo.jogo.parimpar.banco.de.dados;

import java.sql.SQLException;
import java.util.List;

import br.ies.aula.alpoo.jogo.parimpar.OuvinteDeResultado;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Ganhador;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

public class OuvinteResultadoGanhador implements OuvinteDeResultado {

	@Override
	public void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> vencedoras) {
		BancoDeDadosDoParImparGanhador bancoDadosParImparGanhador = new BancoDeDadosDoParImparGanhador();
		
		for (Aposta vencedora : vencedoras) {
			Ganhador ganhador = new Ganhador(vencedora);
			try {
				bancoDadosParImparGanhador.inserir(ganhador);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
