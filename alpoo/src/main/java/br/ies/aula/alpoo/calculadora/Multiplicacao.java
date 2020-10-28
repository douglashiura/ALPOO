package br.ies.aula.alpoo.calculadora;

public class Multiplicacao implements Operação {

	@Override
	public Integer calcular(Integer x, Integer y) throws OutOfInteger {
		long max = Long.parseLong(x.toString()) * Long.parseLong(y.toString());
		if (max > Integer.MAX_VALUE) {
			throw new OutOfInteger();
		}
		return x * y;

	}

}
