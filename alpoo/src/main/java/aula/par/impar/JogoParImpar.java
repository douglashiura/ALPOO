package aula.par.impar;

import static aula.par.impar.entidade.ResultadosDoJogoParImpar.IMPAR;
import static aula.par.impar.entidade.ResultadosDoJogoParImpar.PAR;

import aula.calculadora.*;
import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

public class JogoParImpar {
	public ResultadosDoJogoParImpar parOuImpar(Aposta primeirAposta, Aposta segundaAposta) {
		Calculadora calculadora = new Calculadora();
		calculadora.soma(primeirAposta.getValor(), segundaAposta.getValor());
		Float resultado = calculadora.obterResultado();
		return ehImpar(resultado) ? IMPAR : PAR;
	}

	private Boolean ehImpar(Float resultado) {
		return resultado % 2 != 0;
	}

	

}
