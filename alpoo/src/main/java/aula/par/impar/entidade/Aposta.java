package aula.par.impar.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import aula.par.impar.Pessoa;

@Entity
public class Aposta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer valor;
	@ManyToOne(cascade = {CascadeType.MERGE})
	private Pessoa pessoa;
	@Enumerated(EnumType.STRING)
	private ResultadosDoJogoParImpar aposta;

	Aposta() {}
	
	public Aposta(Integer valor) {
		this.valor = valor;
	}

	public Aposta(String nome, ResultadosDoJogoParImpar aposta, Integer valor) {
		this.nome = nome;
		this.aposta = aposta;
		this.valor = valor;
	}

	//Getters
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getValor() {
		return valor;
	}

	public ResultadosDoJogoParImpar getAposta() {
		return aposta;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
