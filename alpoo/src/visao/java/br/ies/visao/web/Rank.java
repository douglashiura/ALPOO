package br.ies.visao.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;

@SessionScoped
@ManagedBean(name = "rank")
public class Rank implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<String> listaDeNomes;
	private List<Integer> listaDePontuacoes;

	private Integer contadorDeLinhas;

	public Rank() {
		contadorDeLinhas=0;
	}
	
	public void puxarDadosDoBanco() {
		try {
			setListaDeNomes(new BancoDeDadosPessoa().retornarTodosOsNomeDePessoasQuePossuemTempo());
			setListaDePontuacoes(new BancoDeDadosPessoa().retornarTodosOsTemposDePessoas());
		} catch (Exception e) {}
	}

	public Integer contarLinhas() {
		contadorDeLinhas++;
		return contadorDeLinhas;
	}
	
	public void resetarContadorDeLinhas() {
		contadorDeLinhas = 0;
	}
	
	// Getters e Setters
	public List<String> getListaDeNomes() {
		return listaDeNomes;
	}

	public void setListaDeNomes(List<String> listaDeNomes) {
		this.listaDeNomes = listaDeNomes;
	}

	public List<Integer> getListaDePontuacoes() {
		return listaDePontuacoes;
	}

	public void setListaDePontuacoes(List<Integer> listaDePontuacoes) {
		this.listaDePontuacoes = listaDePontuacoes;
	}
}
