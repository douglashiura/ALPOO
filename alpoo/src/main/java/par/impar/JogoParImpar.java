package par.impar;

import static par.impar.ResultadosDoJogoParImpar.*;

import aula.alpoo.calculadora.Calculadora;

@SuppressWarnings("all")
public class JogoParImpar {

	private Integer primeiro;
	private Integer segundo;
	
	
	private String apostaPrimeiro;
	private String apostaSegundo;

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
	public void updateApostas(String comboBoxP1, String comboBoxP2) {
		this.apostaPrimeiro = comboBoxP1;
		this.apostaSegundo = comboBoxP2;
	}

}
