package br.ies.aula.alpoo.pessoa;

public class Pessoa {
	private String nome;
	private Integer idade;
	private Integer cpf;

	Pessoa(String nome, Integer idade, Integer cpf) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);

	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
