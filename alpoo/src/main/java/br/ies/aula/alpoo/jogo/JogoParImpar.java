package br.ies.aula.alpoo.jogo;

import static br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar.IMPAR;
import static br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar.PAR;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class JogoParImpar {

	private static JogoParImpar instancia;
	private Aposta primeirAposta;
	private Aposta segundaAposta;

	public Object parOuImpar() {
		if (primeirAposta != null && segundaAposta != null) {
			Calculadora calculadora = new Calculadora();
			calculadora.soma(primeirAposta.getValor(), segundaAposta.getValor());
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
		this.primeirAposta = new Aposta(primeiro);
		this.segundaAposta = new Aposta(segundo);
	}

	public static JogoParImpar obterInstancia() {
		if (instancia == null) {
			instancia = new JogoParImpar();
		}
		return instancia;
	}

	public void fixaJogada(String nome, ResultadosDoJogoParImpar aposta, Integer valor) {
		if (primeirAposta == null) {
			primeirAposta = new Aposta(nome, aposta, valor);
		} else {
			segundaAposta = new Aposta(nome, aposta, valor);
		}
	}

}
