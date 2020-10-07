package test.br.ies.aula.alpoo;

import java.util.List;

import br.ies.aula.alpoo.jogo.OuvinteDeResultado;
import br.ies.aula.alpoo.jogo.entidade.Aposta;
import br.ies.aula.alpoo.jogo.entidade.ResultadosDoJogoParImpar;

public class OuvinteDeResultadoDeTeste implements OuvinteDeResultado {

	private Boolean avisado;
	private List<Aposta> parOuImpar;

	public OuvinteDeResultadoDeTeste() {
		avisado = Boolean.FALSE;
	}

	public boolean foiAvisado() {
		return avisado;
	}

	@Override
	public void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> parOuImpar) {
		this.parOuImpar = parOuImpar;
		avisado = Boolean.TRUE;
	}

	public List<Aposta> parOuImpar() {
		return parOuImpar;
	}

}