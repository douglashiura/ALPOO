package br.ies.aula.alpoo.jogo.parimpar.entidade;

import java.sql.Timestamp;

public class Vencedor {
	
	private Long id;
	private Aposta aposta;
	private Timestamp horario;
	
	public Vencedor(Aposta aposta, Timestamp horario) {
		this.aposta = aposta;
		this.horario = horario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aposta getAposta() {
		return aposta;
	}

	public void setAposta(Aposta aposta) {
		this.aposta = aposta;
	}

	public Timestamp getHorario() {
		return horario;
	}

	public void setHorario(Timestamp horario) {
		this.horario = horario;
	}
}
