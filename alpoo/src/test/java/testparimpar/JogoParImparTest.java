package testparimpar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import alpoo.ConsoleOuvinteDeJogoParImpar;
import bancodedados.BancoDeDadosDoParImpar;
import entidade.Aposta;
import entidade.ResultadoDoJogoParImpar;
import jogoparimpar.LojaDoJogoParImpar;

public class JogoParImparTest {
	private BancoDeDadosDoParImpar banco;
	@Before
	public void setUp() throws Exception{
		banco = new BancoDeDadosDoParImpar();
		banco.limpaTudo();
	}
	
	@Test
	public void insereAposta() throws Exception {
		LojaDoJogoParImpar jogo = new LojaDoJogoParImpar(new BancoDeDadosDoParImpar());
		jogo.adicionarUmOuvinteDeResultado(new ConsoleOuvinteDeJogoParImpar());
		
	}

}
