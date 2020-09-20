package test.br.ies.aula.alpoo.parimpar.banco.de.dados;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.parimpar.banco.de.dados.BancoDeDadosDoParImpar;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

public class BancoDeDadosDoParImparTeste {

	@Before
	public void setUp() throws SQLException {
		AjudanteDoBancoDeDados.limparTudo();
	}

	@Test
	public void inserirUmaAposta() throws Exception {
		Aposta aposta = new Aposta("Douglas", ResultadosDoJogoParImpar.IMPAR, 2);
		BancoDeDadosDoParImpar banco = new BancoDeDadosDoParImpar();
		banco.inserir(aposta);
		List<Aposta> apostas = banco.obterApostas();
		assertEquals(1, apostas.size());
		assertEquals("Douglas", apostas.get(0).getNome());
		assertEquals(ResultadosDoJogoParImpar.IMPAR, apostas.get(0).getAposta());
		assertEquals(Integer.valueOf(2), apostas.get(0).getValor());
	}

}
