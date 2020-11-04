package br.ies.visao.web;

import java.util.HashMap;

import br.ies.main.tabuleiro.ControleDoTabuleiro;
import br.ies.main.tabuleiro.Tabuleiro;

public abstract class GerenciamentoDasCelulas {
	private static final String colorStandard = "#23549e";
	private static final String colorBackground = "#072c63";

	private ControleDoTabuleiro controle;
	private HashMap<Integer, String> mapaDeCores;

	public GerenciamentoDasCelulas() {
		controle = new ControleDoTabuleiro(new Tabuleiro());
		mapaDeCores = new HashMap<Integer, String>();
		mapaDeCores.put(0, colorBackground);
	}

	// Superior
	public String getCelulaSuperiorEsquerda() {
		return getControle().getTabuleiro().getSuperiorEsquerda().toString();
	}

	public String getCelulaSuperiorCentral() {
		return getControle().getTabuleiro().getSuperiorCentral().toString();
	}

	public String getCelulaSuperiorDireita() {
		return getControle().getTabuleiro().getSuperiorDireita().toString();
	}

	// Centro
	public String getCelulaCentralEsquerda() {
		return getControle().getTabuleiro().getCentroEsquerda().toString();
	}

	public String getCelulaCentral() {
		return getControle().getTabuleiro().getCentro().toString();
	}

	public String getCelulaCentralDireita() {
		return getControle().getTabuleiro().getCentroDireita().toString();
	}

	// Inferior
	public String getCelulaInferiorEsquerda() {
		return getControle().getTabuleiro().getInferiorEsquerda().toString();
	}

	public String getCelulaInferiorCentral() {
		return getControle().getTabuleiro().getInferiorCentral().toString();
	}

	public String getCelulaInferiorDireita() {
		return getControle().getTabuleiro().getInferiorDireita().toString();
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
		return getCorCelula(getControle().getTabuleiro().getSuperiorEsquerda());
	}

	public String getCorCelulaSuperiorCentral() {
		return getCorCelula(getControle().getTabuleiro().getSuperiorCentral());
	}

	public String getCorCelulaSuperiorDireita() {
		return getCorCelula(getControle().getTabuleiro().getSuperiorDireita());
	}

	// Central Cor

	public String getCorCelulaCentralEsquerda() {
		return getCorCelula(getControle().getTabuleiro().getCentroEsquerda());
	}

	public String getCorCelulaCentral() {
		return getCorCelula(getControle().getTabuleiro().getCentro());
	}

	public String getCorCelulaCentralDireita() {
		return getCorCelula(getControle().getTabuleiro().getCentroDireita());
	}

	// Inferior Cor

	public String getCorCelulaInferiorEsquerda() {
		return getCorCelula(getControle().getTabuleiro().getInferiorEsquerda());
	}

	public String getCorCelulaInferiorCentral() {
		return getCorCelula(getControle().getTabuleiro().getInferiorCentral());
	}

	public String getCorCelulaInferiorDireita() {
		return getCorCelula(getControle().getTabuleiro().getInferiorDireita());
	}

	// Getter
	public ControleDoTabuleiro getControle() {
		return controle;
	}

}
