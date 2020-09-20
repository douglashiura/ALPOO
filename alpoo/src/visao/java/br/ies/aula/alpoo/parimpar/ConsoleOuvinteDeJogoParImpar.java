package br.ies.aula.alpoo.parimpar;

import java.util.List;

import br.ies.aula.alpoo.jogo.parimpar.OuvinteDeResultado;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

public class ConsoleOuvinteDeJogoParImpar implements OuvinteDeResultado {

	@Override
	public void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> apostas) {
		for (Aposta aposta : apostas) {
			System.out.println(aposta.getNome());
		}
	}

}
