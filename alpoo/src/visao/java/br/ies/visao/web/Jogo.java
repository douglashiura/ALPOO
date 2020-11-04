package br.ies.visao.web;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;
import br.ies.main.entidades.Pessoa;
import br.ies.main.tabuleiro.AleatorizadorDeTabuleiro;
import br.ies.visao.swing.Cronometro;

@SessionScoped
@ManagedBean(name = "jogo")
public class Jogo extends GerenciamentoDasCelulas implements Serializable {
	private static final long serialVersionUID = 1L;

	private Cronometro cronometro;

	private String retornoDoStatusDoJogo;
	private Boolean ganhouOJogo;
	private Boolean primeiraInteracaoDoUsuario;

	public Jogo() {
		primeiraInteracaoDoUsuario = false;// test
		ganhouOJogo = false;
	}

	public void iniciarCronometro() {
		cronometro = new Cronometro();
		cronometro.iniciar();
	}

	public void verificaVitoria() {
		ganhouOJogo = getCelulaSuperiorEsquerda().equals("1") && getCelulaSuperiorCentral().equals("2")
				&& getCelulaSuperiorDireita().equals("3") && getCelulaCentralEsquerda().equals("4")
				&& getCelulaCentral().equals("5") && getCelulaCentralDireita().equals("6")
				&& getCelulaInferiorEsquerda().equals("7") && getCelulaInferiorCentral().equals("8");

		HashMap<Boolean, Runnable> mapaDeDecisoes = new HashMap<Boolean, Runnable>();

		mapaDeDecisoes.put(true, () -> {
			try {
				primeiraInteracaoDoUsuario = false;
				cronometro.parar();
				new BancoDeDadosPessoa().inserirMelhorTempo(Pessoa.getInstancia(), cronometro.getTempo());

			} catch (SQLException e) {

			}
		});

		try {
			mapaDeDecisoes.get(ganhouOJogo).run();
		} catch (Exception e) {

		}
	}

	public void aleatorizar() {
		new AleatorizadorDeTabuleiro(controle.getTabuleiro());
	}

	public String statusDoJogo() {
		try {
			HashMap<Boolean, String> hashmap = new HashMap<Boolean, String>();
			hashmap.put(true, "Você Venceu!");
			hashmap.put(false, "");

			HashMap<Boolean, Runnable> mapPrimeiraInteracao = new HashMap<Boolean, Runnable>();
			mapPrimeiraInteracao.put(false, () -> {
				retornoDoStatusDoJogo = hashmap.get(ganhouOJogo);
			});

			mapPrimeiraInteracao.get(primeiraInteracaoDoUsuario).run();
			return retornoDoStatusDoJogo;
		} catch (Exception e) {
			return "";
		}
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
}