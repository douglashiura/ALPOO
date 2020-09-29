package br.ies.aula.alpoo.jogo.entidade;

public class Aposta {
	
	private Integer valor;
	private String nome;
	private ResultadosDoJogoParImpar aposta;
	
	public Aposta(String nome, ResultadosDoJogoParImpar aposta, Integer valor) {
		this.nome = nome;
		this.aposta = aposta;
		this.valor = valor;
	}
	public Integer getValor() {
		return valor;
	}
	public ResultadosDoJogoParImpar getAposta() {
		return aposta;
	}
	public String getNome() {
		return nome;
	}
}