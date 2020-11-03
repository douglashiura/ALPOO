package br.ies.visao.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "bean")
public class Bean extends GerenciamentoDasCelulas implements Serializable {
	private static final long serialVersionUID = 1L;

	public Bean() {}

	// Movimentos
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