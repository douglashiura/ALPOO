package jogo.entidades;

import java.util.List;

import jogo.ResultadosDoJogoImparPar;

public class Aposta {

	private Integer valor;
	private String nome;
	private ResultadosDoJogoImparPar aposta;
	private Integer id;
	private static List<Aposta> listaDeVencedores;

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
	
	public List<Aposta> getVencedor(){
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