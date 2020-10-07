package br.ies.aula.alpoo.parimpar.model;


public class Aposta {

	private Integer id;
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
	
	public Aposta(Integer id, Pessoa pessoa, ResultadosDoJogoParImpar aposta, Integer valor) {
		this.id = id;
		this.pessoa = pessoa;
		this.aposta = aposta;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public ResultadosDoJogoParImpar getAposta() {
		return aposta;
	}

	public void setAposta(ResultadosDoJogoParImpar aposta) {
		this.aposta = aposta;
	}
	
}