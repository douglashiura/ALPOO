package br.ies.main.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.ies.main.tabuleiro.Tabuleiro;

@Entity
@Table
public class Pessoa {
	private String nome;
	private String senha;
	private Tabuleiro tabuleiro;

	public Pessoa(String nome, String senha, Tabuleiro tabuleiro) {
		this.nome = nome;
		this.senha = senha;
		this.tabuleiro = tabuleiro;
	}
}
