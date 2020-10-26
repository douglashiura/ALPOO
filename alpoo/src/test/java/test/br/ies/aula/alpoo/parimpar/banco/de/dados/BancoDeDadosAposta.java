package test.br.ies.aula.alpoo.parimpar.banco.de.dados;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.parimpar.dao.implementacao.ApostaDaoJdbc;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;

public class BancoDeDadosAposta {

	ApostaDaoJdbc apostaDao;
	
	@Before
	public void setUp() {
		apostaDao = new ApostaDaoJdbc();
		AjudanteBancoDeDados.limparTudo();
	}
	
	@Test
	public void inserirJogador() throws Exception {
		Aposta aposta = new Aposta("Muriel", 2, ResultadosParImpar.IMPAR);
		apostaDao.inserir(aposta);
		List<Aposta> apostas = apostaDao.obterApostas();
		assertEquals(1, apostas.size());
	}
}
