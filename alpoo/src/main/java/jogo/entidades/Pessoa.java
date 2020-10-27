package jogo.entidades;

import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dataDeNascimento;

	public Pessoa(String nome, Date dataDeNascimento) {
		this.setNome(nome);
		this.setDataDeNascimento(dataDeNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
}
