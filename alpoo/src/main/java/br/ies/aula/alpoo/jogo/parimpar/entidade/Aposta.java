package br.ies.aula.alpoo.jogo.parimpar.entidade;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aposta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Pessoa pessoa;
	private Integer valor;
	@Enumerated(EnumType.STRING)
	private ResultadosDoJogoParImpar aposta;
	
	public Aposta() {};

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
