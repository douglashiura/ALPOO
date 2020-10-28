package br.ies.main.entidades;

public class Pessoa {
	private Integer id;
	private String nome;
	private String senha;
	private Long tempo;
	private static Pessoa instancia;

	public Pessoa(String nome, String senha) {
		this.setNome(nome);
		this.setSenha(senha);
		instancia = this;
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

	public static Pessoa getInstancia() {
		return instancia;
	}
}
