package br.ies.aula.alpoo.parouimpar;

import br.ies.aula.alpoo.calculadora.Calculadora;
import static br.ies.aula.alpoo.parouimpar.Results.*;

public class JogoParImpar {
	
	private static JogoParImpar instancia;
	private Integer primeiro;
	private Integer segundo;	
	
	public Object parOuImpar() {
		Calculadora calculadora = new Calculadora();
		calculadora.soma(primeiro, segundo);
		Float resultado = calculadora.obterResultado();
		return ehImpar(resultado) ? IMPAR : PAR;
	}

	private Boolean ehImpar(Float resultado) {
		return resultado % 2 != 0;
	}

	public void fixaJogadas(Integer primeiro, Integer segundo) {
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
	
	public static JogoParImpar obterInstancia() {
		if(instancia==null) {
			instancia=new JogoParImpar();
		}
		return instancia;
	}
	
	public void fixaJogada(String nome, Results aposta, Integer valor) {
		
	}
}
