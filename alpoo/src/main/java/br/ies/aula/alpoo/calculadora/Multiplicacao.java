package br.ies.aula.alpoo.calculadora;

public class Multiplicacao implements Operação {

	@Override
	public int calcular(int x, int y) throws OutOfInteger {
		if (x * y > Integer.MAX_VALUE) throw new OutOfInteger();
		return x * y;

	}

}
