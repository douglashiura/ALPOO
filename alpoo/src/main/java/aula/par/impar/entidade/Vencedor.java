package aula.par.impar.entidade;

import java.util.Date;

public class Vencedor {
	private Aposta aposta;
	private Date date;

	public Vencedor(Aposta aposta) {
		this.aposta = aposta;
		this.date = new Date();
	}
 
	public Aposta getAposta() {
		return aposta;
	}

	public Date getDate() {
		return date;
	}

}
