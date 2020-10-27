package jogo.entidades;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Vencedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne(cascade = {CascadeType.PERSIST})
	private Aposta aposta;
	@Column(name = "horario")
	private Date date;

	public Vencedor(Aposta aposta) {
		this.aposta = aposta;
		this.date = new Date();
	}
	
	Vencedor() {
		// TODO Auto-generated constructor stub
	}

	public Aposta getAposta() {
		return aposta;
	}

	public Date getDate() {
		return date;
	}

}
