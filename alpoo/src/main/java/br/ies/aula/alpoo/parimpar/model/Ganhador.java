package br.ies.aula.alpoo.parimpar.model;

import java.util.Date;

public class Ganhador {
	
	private Integer id;
	private Date data;
	private Aposta aposta;

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