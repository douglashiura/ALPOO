package br.ies.aula.alpoo.jogo.parimpar;

import java.util.List;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

public interface OuvinteDeResultado {
	void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> vencedoras);
}
