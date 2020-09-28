package visao.douglas;

import aula.par.impar.OuvinteDeResultado;
import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

public class ConsoleOuvinteDeJogoParImpar implements OuvinteDeResultado {

	@Override
	public void avisa(ResultadosDoJogoParImpar parOuImpar, Aposta apostaVencedora) {
		System.out.println(parOuImpar);
	}

}
