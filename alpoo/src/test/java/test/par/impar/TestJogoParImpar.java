package test.par.impar;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import aula.par.impar.JogoParImpar;
import aula.par.impar.LojaDoJogoParImpar;
import aula.par.impar.OuvinteDeResultado;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

@SuppressWarnings("unused")
public class TestJogoParImpar {
	private OuvinteDeResultadoDeTeste ouvinteDeTeste;
	private LojaDoJogoParImpar jogo;

	@Before
	public void setup() throws Exception {
		ouvinteDeTeste = new OuvinteDeResultadoDeTeste();
		jogo = new LojaDoJogoParImpar();
		jogo.adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		jogo.iniciarPartida();
	}
	
	@Test
	public void cenarioOndeAPrimeiraTelaJogaAntes() throws Exception {
		//Jogador 1
		String nome1 = "Paulo";
		ResultadosDoJogoParImpar aposta1 = ResultadosDoJogoParImpar.IMPAR;
		Integer jogada1 = Integer.valueOf(2);
		//Atualiza Jogada e Aposta do Jogador 1
		jogo.fixaJogada(nome1, aposta1, jogada1);
		
		//Jogador 2
		String nome2 = "Maria";
		ResultadosDoJogoParImpar aposta2 = ResultadosDoJogoParImpar.PAR;
		Integer jogada2 = Integer.valueOf(1);
		//Atualiza Jogada e Aposta do Jogador 2
		jogo.fixaJogada(nome2, aposta2, jogada2);
		
		//pensar em como fazer o teste 
		assertEquals(ResultadosDoJogoParImpar.IMPAR, ouvinteDeTeste.parOuImpar().get(0).getAposta());
	}
	
}
