package br.ies.aula.alpoo.jogo.parimpar;

import java.util.List;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;

public interface OuvinteDeResultado {
	
	void avisa(ResultadosParImpar resultado, List<Aposta> vencedores);
	
}
