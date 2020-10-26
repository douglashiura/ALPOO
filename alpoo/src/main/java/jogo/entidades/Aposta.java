package jogo.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import jogo.ResultadosDoJogoImparPar;

@Entity
@Table
public class Aposta {
	@Id
	@Column(name = "aposta_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer valor;
	private String nome;
	@ManyToOne(cascade = {CascadeType.MERGE})
	private Pessoa pessoa;
	@Enumerated(EnumType.STRING)
	private ResultadosDoJogoImparPar aposta;

	private static List<Aposta> listaDeVencedores;

	Aposta() {
	}

	public Aposta(Integer valor) {
		this.setValor(valor);
	}

	public Aposta(String nome, ResultadosDoJogoImparPar aposta, Integer valor) {
		this.setValor(valor);
		this.setNome(nome);
		this.setAposta(aposta);
	}

	public void setVencedor(List<Aposta> vencedor) {
		listaDeVencedores = vencedor;
	}

	public List<Aposta> getVencedor() {
		return listaDeVencedores;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ResultadosDoJogoImparPar getAposta() {
		return aposta;
	}

	public void setAposta(ResultadosDoJogoImparPar aposta) {
		this.aposta = aposta;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}