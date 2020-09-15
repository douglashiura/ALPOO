package visao.douglas;

import aula.par.impar.OuvinteDeResultado;
import aula.par.impar.ResultadosDoJogoParImpar;

public class ConsoleOuvinteDeJogoParImpar implements OuvinteDeResultado {

	@Override
	public void avisa(ResultadosDoJogoParImpar parOuImpar) {
		System.out.println(parOuImpar);
	}

}
