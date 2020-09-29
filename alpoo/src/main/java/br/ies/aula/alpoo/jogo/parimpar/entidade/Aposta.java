package br.ies.aula.alpoo.jogo.parimpar.entidade;

public class Aposta {

	private Integer valor;
	private ResultadosDoJogoParImpar aposta;
	private Integer id;
	private Pessoa pessoa;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;

	}
}
