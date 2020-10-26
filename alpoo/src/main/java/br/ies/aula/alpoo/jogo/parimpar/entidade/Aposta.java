package br.ies.aula.alpoo.jogo.parimpar.entidade;

public class Aposta {
	
	private Long id;
	private String nome;
	private Integer jogada;
	private ResultadosParImpar aposta;
	
	public Aposta() {
	}
	
	public Aposta(String nome, Integer jogada, ResultadosParImpar aposta) {
		this.nome = nome;
		this.jogada = jogada;
		this.aposta = aposta;
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
	
	public Integer getJogada() {
		return jogada;
	}
	
	public void setJogada(Integer jogada) {
		this.jogada = jogada;
	}
	
	public ResultadosParImpar getAposta() {
		return aposta;
	}
	
	public void setAposta(ResultadosParImpar aposta) {
		this.aposta = aposta;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
