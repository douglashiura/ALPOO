package br.ies.aula.alpoo.jogo;

import static br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar.IMPAR;
import static br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar.PAR;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class JogoParImpar {

	private static JogoParImpar instancia;
	private Aposta primeiraAposta;
	private Aposta segundaAposta;
	
	public Object parOuImpar() {
		if (primeiraAposta != null && segundaAposta != null) {
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

	public void fixaJogadas(Integer primeiraAposta , Integer segundaAposta) {
		this.primeiraAposta = new Aposta(primeiraAposta);
		this.segundaAposta = new Aposta(segundaAposta);
	}
	
	public static JogoParImpar obterInstancia() {
		if(instancia==null) {
			instancia=new JogoParImpar();
		}
		return instancia;
	}

	public void fixaJogada(String nome, ResultadosDoJogoParImpar aposta, Integer valor) {
		if (primeiraAposta == null) {
			primeiraAposta = new Aposta(nome, aposta, valor);
		} else {
			segundaAposta = new Aposta(nome, aposta, valor);
		}
	}
}