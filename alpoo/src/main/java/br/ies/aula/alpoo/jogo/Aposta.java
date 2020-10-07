package br.ies.aula.alpoo.jogo;

import br.ies.aula.alpoo.jogo.entidade.ResultadosDoJogoParImpar;

public class Aposta {

	private Integer valor;
	private Pessoa pessoa;
	private ResultadosDoJogoParImpar aposta;

	public Aposta(Integer valor) {
		this.valor = valor;
	}

	public Aposta(Pessoa pessoa, ResultadosDoJogoParImpar aposta, Integer valor) {
		this.pessoa = pessoa;
		this.aposta = aposta;
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}

	public ResultadosDoJogoParImpar getAposta() {
		return aposta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
}