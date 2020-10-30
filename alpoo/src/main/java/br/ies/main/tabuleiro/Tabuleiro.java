package br.ies.main.tabuleiro;

import br.ies.main.celulas.Celula;
import br.ies.main.celulas.CelulaCentral;
import br.ies.main.celulas.CelulaCentralDireita;
import br.ies.main.celulas.CelulaCentralEsquerda;
import br.ies.main.celulas.CelulaInferiorCentral;
import br.ies.main.celulas.CelulaInferiorDireita;
import br.ies.main.celulas.CelulaInferiorEsquerda;
import br.ies.main.celulas.CelulaSuperiorCentral;
import br.ies.main.celulas.CelulaSuperiorDireita;
import br.ies.main.celulas.CelulaSuperiorEsquerda;

public class Tabuleiro {

	private Celula ponteiro;
	private CelulaCentral centro;
	private CelulaCentralDireita centroDireita;
	private CelulaCentralEsquerda centroEsquerda;
	private CelulaInferiorCentral inferiorCentral;
	private CelulaInferiorDireita inferiorDireita;
	private CelulaInferiorEsquerda inferiorEsquerda;
	private CelulaSuperiorCentral superiorCentral;
	private CelulaSuperiorDireita superiorDireita;
	private CelulaSuperiorEsquerda superiorEsquerda;

	public Tabuleiro() {
		superiorEsquerda = new CelulaSuperiorEsquerda(Integer.valueOf(1));
		superiorCentral = new CelulaSuperiorCentral(Integer.valueOf(8));
		superiorDireita = new CelulaSuperiorDireita(Integer.valueOf(2));
		centroEsquerda = new CelulaCentralEsquerda(Integer.valueOf(0));
		centro = new CelulaCentral(Integer.valueOf(4));
		centroDireita = new CelulaCentralDireita(Integer.valueOf(3));
		inferiorEsquerda = new CelulaInferiorEsquerda(Integer.valueOf(7));
		inferiorCentral = new CelulaInferiorCentral(Integer.valueOf(6));
		inferiorDireita = new CelulaInferiorDireita(Integer.valueOf(5));
		setPonteiro(centroEsquerda);

		superiorEsquerda.setBaixo(centroEsquerda);
		superiorEsquerda.setDireita(superiorCentral);

		superiorCentral.setBaixo(centro);
		superiorCentral.setDireita(superiorDireita);
		superiorCentral.setEsquerda(superiorEsquerda);

		superiorDireita.setBaixo(centroDireita);
		superiorDireita.setEsquerda(superiorCentral);

		centroEsquerda.setDireita(centro);
		centroEsquerda.setBaixo(inferiorEsquerda);
		centroEsquerda.setCima(superiorEsquerda);

		centro.setBaixo(inferiorCentral);
		centro.setCima(superiorCentral);
		centro.setDireita(centroDireita);
		centro.setEsquerda(centroEsquerda);

		centroDireita.setBaixo(inferiorDireita);
		centroDireita.setCima(superiorDireita);
		centroDireita.setEsquerda(centro);

		inferiorEsquerda.setCima(centroEsquerda);
		inferiorEsquerda.setDireita(inferiorCentral);

		inferiorCentral.setCima(centro);
		inferiorCentral.setDireita(inferiorDireita);
		inferiorCentral.setEsquerda(inferiorEsquerda);

		inferiorDireita.setCima(centroDireita);
		inferiorDireita.setEsquerda(inferiorCentral);

//		new AleatorizadorDeTabuleiro(this);
	}

	public Celula getPonteiro() {
		return ponteiro;
	}

	public void setPonteiro(Celula ponteiro) {
		this.ponteiro = ponteiro;
	}

	public Integer getCentro() {
		return centro.getNumero();
	}

	public Integer getCentroDireita() {
		return centroDireita.getNumero();
	}

	public Integer getCentroEsquerda() {
		return centroEsquerda.getNumero();
	}

	public Integer getInferiorCentral() {
		return inferiorCentral.getNumero();
	}

	public Integer getInferiorDireita() {
		return inferiorDireita.getNumero();
	}

	public Integer getInferiorEsquerda() {
		return inferiorEsquerda.getNumero();
	}

	public Integer getSuperiorCentral() {
		return superiorCentral.getNumero();
	}

	public Integer getSuperiorDireita() {
		return superiorDireita.getNumero();
	}

	public Integer getSuperiorEsquerda() {
		return superiorEsquerda.getNumero();
	}

}
