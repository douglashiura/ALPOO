package br.ies.aula.alpoo.parimpar.model;

import java.util.Date;

public class Pessoa {
	
	private Integer id;
	private String nome;
	private Date dataNascimento;
	
	public Pessoa(Integer id,String nome, Date dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Pessoa(String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataDeNascimento) {
		this.dataNascimento = dataDeNascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
