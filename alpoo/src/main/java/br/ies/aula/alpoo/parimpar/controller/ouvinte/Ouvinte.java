package br.ies.aula.alpoo.parimpar.controller.ouvinte;

import java.util.List;

import br.ies.aula.alpoo.parimpar.model.Aposta;
import br.ies.aula.alpoo.parimpar.model.ResultadosDoJogoParImpar;

public interface Ouvinte {
	void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> apostas);
}