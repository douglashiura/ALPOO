package br.ies.aula.alpoo.jogo.parimpar.entidade;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Date nascimento;
	private Integer id;

	public Pessoa(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
