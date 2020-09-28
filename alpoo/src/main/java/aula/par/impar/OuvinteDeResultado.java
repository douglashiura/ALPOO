package aula.par.impar;

import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

public interface OuvinteDeResultado {
	void avisa(ResultadosDoJogoParImpar parOuImpar, Aposta apostaVencedora);
}
