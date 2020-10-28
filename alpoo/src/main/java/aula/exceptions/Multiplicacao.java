package aula.exceptions;

public class Multiplicacao extends Operacao {

	public Integer calcular(Integer x, Integer y) throws AlemDoMaximo {
		long maximo = Long.parseLong(x.toString()) * Long.parseLong(y.toString());
		if (maximo > Integer.MAX_VALUE) {
			throw new AlemDoMaximo();
		}
		return x * y;

	}

}
