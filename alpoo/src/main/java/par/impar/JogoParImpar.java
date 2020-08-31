package par.impar;

import static par.impar.ResultadosDoJogoParImpar.*;

import aula.alpoo.calculadora.Calculadora;

public class JogoParImpar {

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

	public void updateAtributes(Integer primeiro, Integer segundo) {
		this.primeiro = primeiro;
		this.segundo = segundo;
	}

}
