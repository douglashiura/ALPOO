package br.ies.aula.alpoo.calculadora;

public class Calculadora {

	private int resultado;

	public void soma(Integer Parcela1, Integer Parcela2) {
		resultado = Parcela1 + Parcela2;
	}

	public Integer obterResultado() {
		return resultado;
	}

	public void multiplicacao(Integer Parcela1, Integer Parcela2) {
		resultado = Parcela1 * Parcela2;
	}

	public void divisao(Integer Parcela1, Integer Parcela2){
		resultado = Parcela1 / Parcela2;
	}

	
}
