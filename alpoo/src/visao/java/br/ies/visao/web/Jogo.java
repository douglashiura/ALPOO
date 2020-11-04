package br.ies.visao.web;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;
import br.ies.main.entidades.Pessoa;
import br.ies.main.tabuleiro.AleatorizadorDeTabuleiro;
import br.ies.main.tabuleiro.Cronometro;

@SessionScoped
@ManagedBean(name = "jogo")
public class Jogo extends GerenciamentoDasCelulas implements Serializable {
	private static final long serialVersionUID = 1L;

	private String retornoDoStatusDoJogo;
	private Boolean ganhouOJogo;
	private Boolean primeiraInteracaoDoUsuario;

	public Jogo() {
		new Cronometro();
		setPrimeiraInteracaoDoUsuario(false);
		setGanhouOJogo(false);
	}

	public void iniciarCronometro() {
		Cronometro.getInstancia().iniciar();
	}

	public void verificaVitoria() {
		setGanhouOJogo(getCelulaSuperiorEsquerda().equals("1") && getCelulaSuperiorCentral().equals("2")
				&& getCelulaSuperiorDireita().equals("3") && getCelulaCentralEsquerda().equals("4")
				&& getCelulaCentral().equals("5") && getCelulaCentralDireita().equals("6")
				&& getCelulaInferiorEsquerda().equals("7") && getCelulaInferiorCentral().equals("8"));

		HashMap<Boolean, Runnable> mapaDeDecisoes = new HashMap<Boolean, Runnable>();

		mapaDeDecisoes.put(true, () -> {
			try {
				setPrimeiraInteracaoDoUsuario(false);
				Cronometro.getInstancia().parar();
				new BancoDeDadosPessoa().inserirMelhorTempo(Pessoa.getInstancia(), Cronometro.getInstancia().getTempo());

			} catch (SQLException e) {

			}
		});

		try {
			mapaDeDecisoes.get(getGanhouOJogo()).run();
		} catch (Exception e) {

		}
	}

	public void aleatorizar() {
		new AleatorizadorDeTabuleiro(getControle().getTabuleiro());
	}

	public String statusDoJogo() {
		try {
			HashMap<Boolean, String> hashmap = new HashMap<Boolean, String>();
			hashmap.put(true, "Você Venceu!");
			hashmap.put(false, "");

			HashMap<Boolean, Runnable> mapPrimeiraInteracao = new HashMap<Boolean, Runnable>();
			mapPrimeiraInteracao.put(false, () -> {
				retornoDoStatusDoJogo = hashmap.get(getGanhouOJogo());
			});

			mapPrimeiraInteracao.get(getPrimeiraInteracaoDoUsuario()).run();
			return retornoDoStatusDoJogo;
		} catch (Exception e) {
			return "";
		}
	}

	// Movimentos
	public void moverPraCima() {
		getControle().moverPraCima();
		verificaVitoria();
	}

	public void moverPraBaixo() {
		getControle().moverPraBaixo();
		verificaVitoria();
	}

	public void moverPraEsquerda() {
		getControle().moverPraEsquerda();
		verificaVitoria();
	}

	public void moverPraDireita() {
		getControle().moverPraDireita();
		verificaVitoria();
	}

	// Getters e Setters
	
	public Boolean getPrimeiraInteracaoDoUsuario() {
		return primeiraInteracaoDoUsuario;
	}

	public void setPrimeiraInteracaoDoUsuario(Boolean primeiraInteracaoDoUsuario) {
		this.primeiraInteracaoDoUsuario = primeiraInteracaoDoUsuario;
	}
	

	public Boolean getGanhouOJogo() {
		return ganhouOJogo;
	}
	

	public void setGanhouOJogo(Boolean ganhouOJogo) {
		this.ganhouOJogo = ganhouOJogo;
	}
}