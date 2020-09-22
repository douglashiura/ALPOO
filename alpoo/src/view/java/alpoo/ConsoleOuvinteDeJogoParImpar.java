package alpoo;

import java.util.List;

import entidade.Aposta;
import entidade.ResultadoDoJogoParImpar;
import jogoparimpar.OuvinteDeResultado;

public class ConsoleOuvinteDeJogoParImpar implements OuvinteDeResultado{

	@Override
	public void avisa(ResultadoDoJogoParImpar resultado, List<Aposta> apostas) {
		for (Aposta aposta : apostas) {
			System.out.println(aposta.getNome());
		}
	}

}
