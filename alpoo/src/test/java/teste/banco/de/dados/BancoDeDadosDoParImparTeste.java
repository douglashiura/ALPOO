package teste.banco.de.dados;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import aula.par.impar.Aposta;
import aula.par.impar.ResultadosDoJogoParImpar;
import aular.par.impar.banco.de.dados.BancoDeDadosParImpar;

public class BancoDeDadosDoParImparTeste {

	@Before
	public void setUp() throws Exception {
		AjudanteBancoDeDados.limparTudo();
	}
	
	@Test
	public void inserirUmaAposta() throws Exception {
		Aposta aposta = new Aposta("Victor", ResultadosDoJogoParImpar.IMPAR, 2);
		BancoDeDadosParImpar banco = new BancoDeDadosParImpar();
		banco.inserir(aposta);
		List<Aposta> apostas = banco.obterApostas();
		assertEquals(1, apostas.size());
//		assertEquals();
	}
}
