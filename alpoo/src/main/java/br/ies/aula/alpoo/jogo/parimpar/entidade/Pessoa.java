package br.ies.aula.alpoo.jogo.parimpar.entidade;

import java.time.LocalDate;

public class Pessoa {

	private Long id;
	private String nome;
	private LocalDate dataDeNascimento;
	private String loguin;
	private String senha;
	private Aposta aposta;

	public Pessoa() {
	}
	
	public Pessoa(Long id, String nome, LocalDate dataDeNascimento, String loguin, String senha, Aposta aposta) {
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.loguin = loguin;
		this.senha = senha;
		this.aposta = aposta;
	}
	
	public Pessoa(Long id, String nome, LocalDate dataDeNascimento, String loguin, String senha) {
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.loguin = loguin;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getLoguin() {
		return loguin;
	}

	public void setLoguin(String loguin) {
		this.loguin = loguin;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Aposta getAposta() {
		return aposta;
	}

	public void setAposta(Aposta aposta) {
		this.aposta = aposta;
	}
}
