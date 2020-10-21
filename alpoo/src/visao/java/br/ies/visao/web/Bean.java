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
	
	//Superior
	public String getCelulaSuperiorEsquerda() {
		return String.format("%s", controle.getTabuleiro().getSuperiorEsquerda());
	}
	
	public String getCelulaSuperiorCentral() {
		return String.format("%s", controle.getTabuleiro().getSuperiorCentral());
	}
	
	public String getCelulaSuperiorDireita() {
		return String.format("%s", controle.getTabuleiro().getSuperiorDireita());
	}
	
	//Centro
	public String getCelulaCentralEsquerda() {
		return String.format("%s", controle.getTabuleiro().getCentroEsquerda());
	}
	
	public String getCelulaCentral() {
		return String.format("%s", controle.getTabuleiro().getCentro());
	}
	
	public String getCelulaCentralDireita() {
		return String.format("%s", controle.getTabuleiro().getCentroDireita());
	}
	
	//Inferior
	public String getCelulaInferiorEsquerda() {
		return String.format("%s", controle.getTabuleiro().getInferiorEsquerda());
	}
	
	public String getCelulaInferiorCentral() {
		return String.format("%s", controle.getTabuleiro().getInferiorCentral());
	}
	
	public String getCelulaInferiorDireita() {
		return String.format("%s", controle.getTabuleiro().getInferiorDireita());
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
}