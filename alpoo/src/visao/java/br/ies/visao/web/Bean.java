package br.ies.visao.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ies.main.tabuleiro.ControleDoTabuleiro;
import br.ies.main.tabuleiro.Tabuleiro;

@SessionScoped
@ManagedBean()
public class Bean {
	private String name;

	private ControleDoTabuleiro controle;

	public Bean() {
		controle = new ControleDoTabuleiro(new Tabuleiro());
		name = "TesteNoJogoDoOito";
	}

	// Superior
	public String getCelulaSuperiorEsquerda() {
		return controle.getTabuleiro().getSuperiorEsquerda().toString();
	}

	public String getCelulaSuperiorCentral() {
		return controle.getTabuleiro().getSuperiorCentral().toString();
	}

	public String getCelulaSuperiorDireita() {
		return controle.getTabuleiro().getSuperiorDireita().toString();
	}

	// Centro
	public String getCelulaCentralEsquerda() {
		return controle.getTabuleiro().getCentroEsquerda().toString();
	}

	public String getCelulaCentral() {
		return controle.getTabuleiro().getCentro().toString();
	}

	public String getCelulaCentralDireita() {
		return controle.getTabuleiro().getCentroDireita().toString();
	}

	// Inferior
	public String getCelulaInferiorEsquerda() {
		return controle.getTabuleiro().getInferiorEsquerda().toString();
	}

	public String getCelulaInferiorCentral() {
		return controle.getTabuleiro().getInferiorCentral().toString();
	}

	public String getCelulaInferiorDireita() {
		return controle.getTabuleiro().getInferiorDireita().toString();
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void moverPraCima() {
		controle.moverPraCima();
	}

	public void moverPraBaixo() {
		controle.moverPraBaixo();
	}

	public void moverPraEsquerda() {
		controle.moverPraEsquerda();
	}

	public void moverPraDireita() {
		controle.moverPraDireita();
	}

}