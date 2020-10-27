package br.ies.main.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.ies.main.tabuleiro.Tabuleiro;

@Entity
@Table
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String senha;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Tabuleiro tabuleiro;

	Pessoa() {
		
	}

	public Pessoa(String nome, String senha, Tabuleiro tabuleiro) {
		this.setNome(nome);
		this.setSenha(senha);
		this.tabuleiro = tabuleiro;
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
}
