package br.ies.visao.swing;

import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;
import br.ies.main.entidades.Pessoa;

public class MandadorDeTemposProBanco {

	public MandadorDeTemposProBanco() {

	}

	public void verificaVitoria(JLabel superiorEsquerdo, JLabel superiorCentral, JLabel superiorDireita,
			JLabel centroEsquerda, JLabel centroCentral, JLabel centroDireita, JLabel inferiorEsquerdo,
			JLabel inferiorCentral, JLabel inferiorDireita, JFrame tela) {

		boolean ganhou = superiorEsquerdo.getText().equals("1") && superiorCentral.getText().equals("2")
				&& superiorDireita.getText().equals("3") && centroEsquerda.getText().equals("4")
				&& centroCentral.getText().equals("5") && centroDireita.getText().equals("6")
				&& inferiorEsquerdo.getText().equals("7") && inferiorCentral.getText().equals("8");

		HashMap<Boolean, Runnable> mapaDeDecisoes = new HashMap<Boolean, Runnable>();
		mapaDeDecisoes.put(true, () -> {
			try {
				Cronometro.getInstancia().parar();
				new BancoDeDadosPessoa().inserirMelhorTempo(Pessoa.getInstancia(),
						Cronometro.getInstancia().getTempo());
			} catch (SQLException e) {

			}
		});

		try {
			mapaDeDecisoes.get(ganhou).run();
			new TelaDeVitoria().getFrame().setVisible(true);
			tela.dispose();
		} catch (Exception e) {

		}
	}

}
