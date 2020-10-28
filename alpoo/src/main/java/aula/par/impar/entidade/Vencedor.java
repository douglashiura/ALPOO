package aula.par.impar.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vencedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/*Esse é usado para atualizar*/
	/*(cascade = {CascadeType.MERGE})*/
	/*Esse é usado para inserir*/
	/*(cascade = {CascadeType.PERSIST})*/
	@OneToOne
	private Aposta aposta;
	private Date data;

	public Vencedor(Aposta aposta) {
		this.aposta = aposta;
		this.data = new Date();
	}
 
	public Aposta getAposta() {
		return aposta;
	}

	public Date getDate() {
		return data;
	}

}
