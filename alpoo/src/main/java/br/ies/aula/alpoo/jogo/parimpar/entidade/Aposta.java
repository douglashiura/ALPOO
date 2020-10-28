package br.ies.aula.alpoo.jogo.parimpar.entidade;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Aposta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer jogada;
	
	@Enumerated(EnumType.STRING)
	private ResultadosParImpar aposta;
	
	@ManyToOne
	private Pessoa pessoa;
	
	public Aposta() {
	}
	
	public Aposta(Integer jogada, ResultadosParImpar aposta, Pessoa pessoa) {
		this.jogada = jogada;
		this.aposta = aposta;
		this.pessoa = pessoa;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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
		return pessoa.getNome();
	}
}
