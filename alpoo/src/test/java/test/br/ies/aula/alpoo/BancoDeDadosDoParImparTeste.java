package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import jogo.ResultadosDoJogoImparPar;
import jogo.banco.de.dados.AjudanteDoBancoDeDados;
import jogo.banco.de.dados.BancoDeDadosParImpar;
import jogo.banco.de.dados.BancoDeDadosParImparPessoa;
import jogo.banco.de.dados.BancoDeDadosParImparVencedor;
import jogo.entidades.Aposta;
import jogo.entidades.Pessoa;
import jogo.entidades.Vencedor;

public class BancoDeDadosDoParImparTeste {
	@Before
	public void setUp() throws SQLException {
		AjudanteDoBancoDeDados.limparTudo();
	}

	@Test
	public void inserirUmaAposta() throws Exception {
		Aposta aposta = new Aposta("Vinicius", ResultadosDoJogoImparPar.IMPAR, 2);
		BancoDeDadosParImpar banco = new BancoDeDadosParImpar();
		banco.inserir(aposta);
		List<Aposta> apostas = banco.obterApostas();
		assertEquals(1, apostas.size());
		assertEquals("Vinicius", apostas.get(0).getNome());
		assertEquals(ResultadosDoJogoImparPar.IMPAR, apostas.get(0).getAposta());
		assertEquals(Integer.valueOf(2), apostas.get(0).getValor());

	}

	@Test
	public void inserirUmVencedor() throws Exception {
		Aposta aposta = new Aposta("Vincius", ResultadosDoJogoImparPar.IMPAR, 2);
		BancoDeDadosParImpar banco = new BancoDeDadosParImpar();
		banco.inserir(aposta);
		BancoDeDadosParImparVencedor bancoDeDadosDoVencedor = new BancoDeDadosParImparVencedor();
		Vencedor vencedor = new Vencedor(aposta);
		bancoDeDadosDoVencedor.inserir(vencedor);
		assertNotNull(aposta.getId());
	}

	@Test
	public void inserirUmaPessoa() throws Exception {
		Pessoa pessoa = new Pessoa("Vinicius", new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2000"));
		new BancoDeDadosParImparPessoa().inserir(pessoa);
		assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2000"), pessoa.getDataDeNascimento());
		assertEquals("Vinicius", pessoa.getNome());
	}
}