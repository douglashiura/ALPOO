package alpoo;

import br.ies.aula.alpoo.jogo.OuvinteDeResultado;
import br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar;

public class ConsoleOuvinteDeJogoParImpar implements OuvinteDeResultado {

	@Override
	public void avisa(ResultadosDoJogoParImpar parOuImpar) {
		System.out.println(parOuImpar);
	}

}
