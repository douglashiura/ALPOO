package br.ies.aula.alpoo.jogo;

import java.util.List;

import br.ies.aula.alpoo.jogo.entidade.Aposta;
import br.ies.aula.alpoo.jogo.entidade.ResultadosDoJogoParImpar;

public interface OuvinteDeResultado {
	void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> vencedoras);

}
