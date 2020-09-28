package br.ies.aula.alpoo.pessoa;

public class Pessoa {
	private String nome;
	private Integer idade;
	
	Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	};
	
	public String getNome() {
		return nome;
	}
}
