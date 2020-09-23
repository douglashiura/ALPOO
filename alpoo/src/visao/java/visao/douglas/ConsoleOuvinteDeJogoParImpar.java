package visao.douglas;

import aula.par.impar.LojaDoJogoParImpar;
import aula.par.impar.OuvinteDeResultado;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

public class ConsoleOuvinteDeJogoParImpar implements OuvinteDeResultado {

	@Override
	public void avisa(ResultadosDoJogoParImpar parOuImpar, LojaDoJogoParImpar jogo) {
		System.out.println(parOuImpar);
	}

}
