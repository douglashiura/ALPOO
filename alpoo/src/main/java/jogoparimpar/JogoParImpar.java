package jogoparimpar;

import calculadora.Calculadora;
import entidade.Aposta;
import entidade.ResultadoDoJogoParImpar;

public class JogoParImpar {

	public ResultadoDoJogoParImpar parOuImpar(Aposta primeirAposta, Aposta segundaAposta) {
		Calculadora calculadora = new Calculadora();
		calculadora.soma(primeirAposta.getValor(), segundaAposta.getValor());
		Float resultado = calculadora.obterResultado();
		return ehImpar(resultado) ? ResultadoDoJogoParImpar.IMPAR : ResultadoDoJogoParImpar.PAR;
	}

	private Boolean ehImpar(Float resultado) {
		return resultado % 2 != 0;
	}

}
