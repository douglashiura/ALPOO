package test.br.ies.aula.alpoo.banco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.banco.ApostaDB;
import br.ies.aula.alpoo.jogo.banco.GanhadorDB;
import br.ies.aula.alpoo.jogo.entidade.Aposta;
import br.ies.aula.alpoo.jogo.entidade.Ganhador;
import br.ies.aula.alpoo.jogo.entidade.ResultadosDoJogoParImpar;

public class BancoTesteParImpar {

	@Before
	public void setUp() throws SQLException {
		ResetBanco.limparBanco();
	}

	@Test
	public void inserirUmaAposta() throws Exception {
		Aposta aposta = new Aposta("Pedro", ResultadosDoJogoParImpar.IMPAR, 2);
		ApostaDB bancoDeDadosDoParImparAposta = new ApostaDB();
		bancoDeDadosDoParImparAposta.inserirApostas(aposta);
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
		Aposta aposta = new Aposta("Pedro", ResultadosDoJogoParImpar.IMPAR, 2);
		ApostaDB bancoDeDadosDoParImparAposta = new ApostaDB();
		bancoDeDadosDoParImparAposta.inserirApostas(aposta);
		GanhadorDB bancoDadosParImparGanhador = new GanhadorDB();
		Ganhador ganhador = new Ganhador(aposta);
		bancoDadosParImparGanhador.inserirGanhador(ganhador);
		assertNotNull(ganhador.getId());
	}

}