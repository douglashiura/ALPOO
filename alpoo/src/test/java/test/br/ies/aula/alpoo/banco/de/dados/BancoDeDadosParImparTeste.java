package test.br.ies.aula.alpoo.banco.de.dados;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.banco.de.dados.BancoDeDadosParImpar;
import br.ies.aula.alpoo.jogo.entidade.Aposta;
import br.ies.aula.alpoo.jogo.entidade.ResultadosDoJogoParImpar;

public class BancoDeDadosParImparTeste {

	@Before
	public void setUp() throws SQLException {
		AjudanteDoBancoDeDados.limparTudo();
	}

	@Test
	public void inserirUmaAposta() throws Exception {
		Aposta aposta = new Aposta("Douglas", ResultadosDoJogoParImpar.IMPAR, 2);
		BancoDeDadosParImpar banco = new BancoDeDadosParImpar();
		banco.inserir(aposta);
		List<Aposta> apostas = banco.obterApostas();
		assertEquals(1, apostas.size());
		assertEquals("Douglas", apostas.get(0).getNome());
		assertEquals(ResultadosDoJogoParImpar.IMPAR, apostas.get(0).getAposta());
		assertEquals(Integer.valueOf(2), apostas.get(0).getValor());
	}

}