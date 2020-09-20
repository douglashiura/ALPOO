package br.ies.aula.alpoo.parimpar;

import static br.ies.aula.alpoo.parimpar.Results.*;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class JogoParImpar {
	
	private static JogoParImpar instancia;
	private Aposta primeiraAposta;
	private Aposta segundaAposta;	
	
	public Object parOuImpar() {
		if(primeiraAposta!=null) {
			Calculadora calculadora = new Calculadora();
			calculadora.soma(primeiraAposta.getValor(), segundaAposta.getValor());
			Float resultado = calculadora.obterResultado();
			return ehImpar(resultado) ? IMPAR : PAR;			
		} else {
			return null;
		}
	}

	private Boolean ehImpar(Float resultado) {
		return resultado % 2 != 0;
	}

	public void fixaJogadas(Integer primeiro, Integer segundo) {
		this.primeiraAposta = new Aposta(primeiro);
		this.segundaAposta = new Aposta(segundo);
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
