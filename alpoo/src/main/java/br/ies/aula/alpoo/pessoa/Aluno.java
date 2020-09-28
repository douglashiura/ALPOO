package br.ies.aula.alpoo.pessoa;

public class Aluno extends Pessoa {

	private String matricula;

	Aluno(String nome, Integer idade, Integer cpf, String matricula) {
		super(ajustarNome(nome), idade, cpf);
		this.setMatricula(matricula);
	}

	private static String ajustarNome(String nome) {
		nome = nome + "Opa";
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
