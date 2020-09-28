package test.par.impar;

import java.util.List;

import aula.par.impar.OuvinteDeResultado;
import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

public class OuvinteDeResultadoDeTeste implements OuvinteDeResultado {
	private Boolean avisado;
	private List<Aposta> parOuImpar;

	public OuvinteDeResultadoDeTeste() {
		avisado = Boolean.FALSE;
	}

	public boolean foiAvisado() {
		return avisado;
	}
	
	//Arrumar depois a interface OuvinteDeResultado
	public void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> parOuImpar) {
		this.parOuImpar = parOuImpar;
		avisado = Boolean.TRUE;
	}

	public List<Aposta> parOuImpar() {
		return parOuImpar;
	}

	//Método possivelmente obsoleto da interface OuvinteDeResultado
	@Override
	public void avisa(ResultadosDoJogoParImpar parOuImpar, Aposta apostaVencedora) {
		// TODO Auto-generated method stub
		
	}

}