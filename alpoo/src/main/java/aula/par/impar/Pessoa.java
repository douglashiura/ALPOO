package aula.par.impar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private String nome;
	private Date nascimento;
	
	public Pessoa(String nome, Date nascimento){
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
//	Date data = new Date();
//	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
//	System.out.println(formatador.format(data));
	
//	new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2000")
	
//	Talvez usar Calendar
//	Calendar calendar = Calendar.getInstance();
//	calendar.set(calendar.YEAR, 2010);
//	calendar.set(calendar.MONTH, 05);
//	calendar.set(calendar.DAY, 1);

	
	public String getNome() {
		return nome;
	}
	
	public Date getDataDeNascimento() {
		return nascimento;
	}
	
	public String getDataDeNascimentoFormatted() {
		return new SimpleDateFormat("dd/MM/yyyy").format(nascimento);
	}
}
