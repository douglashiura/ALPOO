package aula.par.impar;

import aula.calculadora.*;

import static aula.par.impar.ResultadosDoJogoParImpar.IMPAR;
import static aula.par.impar.ResultadosDoJogoParImpar.PAR;

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
