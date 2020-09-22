package jogoparimpar;

import java.util.List;

import entidade.Aposta;
import entidade.ResultadoDoJogoParImpar;

public interface OuvinteDeResultado {
	void avisa(ResultadoDoJogoParImpar resultado, List<Aposta> vencedoras);
}
