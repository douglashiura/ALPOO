package br.ies.main.entidades;

import java.sql.Timestamp;

@SuppressWarnings("unused")
public class Pessoa {
	private Integer id;
	private String nome;
	private String senha;
	private Long tempo;

	public Pessoa(String nome, String senha) {
		this.setNome(nome);
		this.setSenha(senha);
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getTempo() {
		return tempo;
	}

	public void setTempo(Long tempo) {
		this.tempo = tempo;
	}
}
