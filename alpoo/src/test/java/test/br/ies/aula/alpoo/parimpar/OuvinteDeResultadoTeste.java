package test.br.ies.aula.alpoo.parimpar;

import java.util.List;

import br.ies.aula.alpoo.jogo.parimpar.OuvinteDeResultado;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;

public class OuvinteDeResultadoTeste implements OuvinteDeResultado {

	private Boolean avisado;
	private ResultadosParImpar resultado;

	public OuvinteDeResultadoTeste() {
		avisado = Boolean.FALSE;
	}

	public boolean foiAvisado() {
		return avisado;
	}

	@Override
	public void avisa(ResultadosParImpar resultado, List<Aposta> apostas) {
		this.resultado = apostas.get(0).getAposta();
		avisado = Boolean.TRUE;
		
	}

	public ResultadosParImpar obterResultado() {
		return resultado;
	}

}
