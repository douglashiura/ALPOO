package br.ies.aula.alpoo.parimpar.controller;

import br.ies.aula.alpoo.calculadora.Calculadora;
import br.ies.aula.alpoo.parimpar.model.Aposta;
import br.ies.aula.alpoo.parimpar.model.ResultadosDoJogoParImpar;

public class JogoParImpar {

	public ResultadosDoJogoParImpar parOuImpar(Aposta primeirAposta, Aposta segundaAposta) {
		Calculadora calculadora = new Calculadora();
		calculadora.soma(primeirAposta.getValor(), segundaAposta.getValor());
		Float resultado = calculadora.obterResultado();
		return ehImpar(resultado) ? ResultadosDoJogoParImpar.IMPAR : ResultadosDoJogoParImpar.PAR;
	}

	private Boolean ehImpar(Float resultado) {
		return resultado % 2 != 0;
	}

}