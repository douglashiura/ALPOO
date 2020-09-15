package alpoo;

import java.util.List;

import br.ies.aula.alpoo.jogo.Aposta;
import br.ies.aula.alpoo.jogo.OuvinteDeResultado;
import br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar;

public class ConsoleOuvinteDeJogoParImpar implements OuvinteDeResultado {

	@Override
	public void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> apostas) {
		for (Aposta aposta : apostas) {
			System.out.println(aposta.getNome());
		}
	}

}
