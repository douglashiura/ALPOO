package br.ies.visao.web;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;
import br.ies.main.entidades.Pessoa;
import br.ies.visao.swing.Cronometro;

@SessionScoped
@ManagedBean(name = "bean")
public class Bean extends GerenciamentoDasCelulas implements Serializable {
	private static final long serialVersionUID = 1L;

	public Bean() {
	}

	// Movimentos
	public void moverPraCima() {
		controle.moverPraCima();
		verificaVitoria();
	}

	public void moverPraBaixo() {
		controle.moverPraBaixo();
		verificaVitoria();
	}

	public void moverPraEsquerda() {
		controle.moverPraEsquerda();
		verificaVitoria();
	}

	public void moverPraDireita() {
		controle.moverPraDireita();
		verificaVitoria();
	}

	public void verificaVitoria() {

		boolean ganhou = getCelulaSuperiorEsquerda().equals("1") && getCelulaSuperiorCentral().equals("2")
				&& getCelulaSuperiorDireita().equals("3") && getCelulaCentralEsquerda().equals("4")
				&& getCelulaCentral().equals("5") && getCelulaCentralDireita().equals("6")
				&& getCelulaInferiorEsquerda().equals("7") && getCelulaInferiorCentral().equals("8");

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
//			new TelaDeVitoria().getFrame().setVisible(true);
//			tela.dispose();
		} catch (Exception e) {

		}
		System.out.println(ganhou);
	}

}