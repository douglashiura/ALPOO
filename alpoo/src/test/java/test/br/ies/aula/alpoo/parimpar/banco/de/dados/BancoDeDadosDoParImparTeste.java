package test.br.ies.aula.alpoo.parimpar.banco.de.dados;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.parimpar.banco.de.dados.BancoDeDadosDoParImparAposta;
import br.ies.aula.alpoo.jogo.parimpar.banco.de.dados.BancoDeDadosDoParImparGanhador;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Ganhador;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

public class BancoDeDadosDoParImparTeste {

	@Before
	public void setUp() throws SQLException {
		AjudanteDoBancoDeDados.limparTudo();
	}

	@Test
	public void inserirUmaAposta() throws Exception {
		Aposta aposta = new Aposta("Gui", ResultadosDoJogoParImpar.IMPAR, 2);
		BancoDeDadosDoParImparAposta bancoDeDadosDoParImparAposta = new BancoDeDadosDoParImparAposta();
		bancoDeDadosDoParImparAposta.inserir(aposta);
		List<Aposta> apostas = bancoDeDadosDoParImparAposta.obterApostas();
		assertEquals(1, apostas.size());
		assertEquals("Gui", apostas.get(0).getNome());
		assertEquals(ResultadosDoJogoParImpar.IMPAR, apostas.get(0).getAposta());
		assertEquals(Integer.valueOf(2), apostas.get(0).getValor());
		assertNotNull(aposta.getId());
		assertNotNull(apostas.get(0).getId());
	}
	
	@Test
	public void inserirUmGanhador() throws Exception {
		Aposta aposta = new Aposta("Gui", ResultadosDoJogoParImpar.IMPAR, 2);
		BancoDeDadosDoParImparAposta bancoDeDadosDoParImparAposta = new BancoDeDadosDoParImparAposta();
		bancoDeDadosDoParImparAposta.inserir(aposta);
		BancoDeDadosDoParImparGanhador bancoDadosParImparGanhador = new BancoDeDadosDoParImparGanhador();
		Ganhador ganhador = new Ganhador(aposta);
		bancoDadosParImparGanhador.inserir(ganhador);
		assertNotNull(ganhador.getId());
	}

}
