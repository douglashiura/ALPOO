package br.ies.visao.web;

import java.util.HashMap;

import br.ies.main.tabuleiro.ControleDoTabuleiro;
import br.ies.main.tabuleiro.Tabuleiro;

public class GerenciamentoDasCelulas {
	private static final String colorStandard = "#23549e";
	private static final String colorBackground = "#072c63";

	protected ControleDoTabuleiro controle;
	private HashMap<Integer, String> mapaDeCores;

	public GerenciamentoDasCelulas() {
		controle = new ControleDoTabuleiro(new Tabuleiro());
		mapaDeCores = new HashMap<Integer, String>();
		mapaDeCores.put(0, colorBackground);
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

	// Checar Cor

	public String getCorCelula(Integer numero) {
		try {
			return mapaDeCores.get(numero);
		} catch (NullPointerException e) {
			return colorStandard;
		}
	}

	// Superior Cor

	public String getCorCelulaSuperiorEsquerda() {
		return getCorCelula(controle.getTabuleiro().getSuperiorEsquerda());
	}

	public String getCorCelulaSuperiorCentral() {
		return getCorCelula(controle.getTabuleiro().getSuperiorCentral());
	}

	public String getCorCelulaSuperiorDireita() {
		return getCorCelula(controle.getTabuleiro().getSuperiorDireita());
	}

	// Central Cor

	public String getCorCelulaCentralEsquerda() {
		return getCorCelula(controle.getTabuleiro().getCentroEsquerda());
	}

	public String getCorCelulaCentral() {
		return getCorCelula(controle.getTabuleiro().getCentro());
	}

	public String getCorCelulaCentralDireita() {
		return getCorCelula(controle.getTabuleiro().getCentroDireita());
	}

	// Inferior Cor

	public String getCorCelulaInferiorEsquerda() {
		return getCorCelula(controle.getTabuleiro().getInferiorEsquerda());
	}

	public String getCorCelulaInferiorCentral() {
		return getCorCelula(controle.getTabuleiro().getInferiorCentral());
	}

	public String getCorCelulaInferiorDireita() {
		return getCorCelula(controle.getTabuleiro().getInferiorDireita());
	}

}
