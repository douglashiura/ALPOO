package br.ies.aula.alpoo.jogo.parimpar.entidade;

import java.util.Date;

public class Ganhador {

	private Date data;
	private Aposta aposta;
	private Integer id;

	public Ganhador(Aposta aposta) {
		this.aposta = aposta;
		this.data = new Date();
	}

	public Date getDate() {
		return data;
	}

	public Aposta getAposta() {
		return aposta;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

}
