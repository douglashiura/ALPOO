package test.br.ies.aula.alpoo;

import br.ies.aula.alpoo.jogo.OuvinteDeResultado;
import br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar;

public class OuvinteDeResultadoDeTeste implements OuvinteDeResultado {

	private Boolean avisado;
	private ResultadosDoJogoParImpar parOuImpar;

	public OuvinteDeResultadoDeTeste() {
		avisado = Boolean.FALSE;
	}

	public boolean foiAvisado() {
		return avisado;
	}

	@Override
	public void avisa(ResultadosDoJogoParImpar parOuImpar) {
		this.parOuImpar = parOuImpar;
		avisado = Boolean.TRUE;
		
	}

	public ResultadosDoJogoParImpar parOuImpar() {
		return parOuImpar;
	}

}
