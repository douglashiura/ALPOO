package br.ies.aula.alpoo.calculadora;

public class Calculadora {
	
	private Integer resultado;

	public Integer obterResultado() {
		return resultado;
	}

	public void soma(Integer parcelaA, Integer parcelaB) {
		resultado = parcelaA + parcelaB;
	}

	public void multiplica(int parcelaA, int parcelaB) {
		resultado = parcelaA * parcelaB;
	}

	public void divide(int parcelaA, int parcelaB) {
		resultado = parcelaA / parcelaB;
	}
}
