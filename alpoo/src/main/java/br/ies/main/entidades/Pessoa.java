package br.ies.main.entidades;

import br.ies.main.tabuleiro.Tabuleiro;

public class Pessoa {
	private String nome;
	private String senha;
	private Tabuleiro tabuleiro;

	public Pessoa() {

	}

	public Pessoa(String nome, String senha, Tabuleiro tabuleiro) {
		this.setNome(nome);
		this.setSenha(senha);
		this.setTabuleiro(tabuleiro);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
}
