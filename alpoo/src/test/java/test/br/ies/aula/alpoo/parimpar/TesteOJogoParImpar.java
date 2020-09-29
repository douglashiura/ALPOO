package test.br.ies.aula.alpoo.parimpar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.parimpar.LojaDoJogoParImpar;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Pessoa;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

public class TesteOJogoParImpar {
	private OuvinteDeResultadoDeTeste ouvinteDeTeste;
	private LojaDoJogoParImpar jogo;

	@Before
	public void configuracao() {
		ouvinteDeTeste = new OuvinteDeResultadoDeTeste();
		jogo = new LojaDoJogoParImpar();
		jogo.adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		jogo.iniciarPartida();
	}

	@Test
	public void cenarioOndeAPrimeiraTelaJogaAntes() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 22);
		Pessoa pessoa = new Pessoa("Paulo", calendar.getTime());
		ResultadosDoJogoParImpar aposta = ResultadosDoJogoParImpar.IMPAR;
		Integer valor = Integer.valueOf(2);
		jogo.fixaJogada(new Aposta(pessoa, aposta, valor));
		jogo.fixaJogada(new Aposta(pessoa, ResultadosDoJogoParImpar.PAR, Integer.valueOf(1)));
		assertEquals(ResultadosDoJogoParImpar.IMPAR, ouvinteDeTeste.parOuImpar().get(0).getAposta());
	}

	@Test
	public void umOuvinteDeVitoriaDoJogoSemJogadas() throws Exception {
		jogo.adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		assertFalse(ouvinteDeTeste.foiAvisado());
	}

	@Test
	public void umOuvinteDeVitoriaDoJogo() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 22);
		Pessoa pessoa = new Pessoa("Paulo", calendar.getTime());
		Aposta vencedora = new Aposta(pessoa, ResultadosDoJogoParImpar.PAR, 2);
		jogo.adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		jogo.fixaJogada(new Aposta(pessoa, ResultadosDoJogoParImpar.IMPAR, 2));
		jogo.fixaJogada(vencedora);
		assertTrue(ouvinteDeTeste.foiAvisado());
		assertEquals(vencedora, ouvinteDeTeste.parOuImpar().get(0));
		assertEquals(1, ouvinteDeTeste.parOuImpar().size());
	}

	@Test
	public void cenarioOndeApenasUmJogadorJogou() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 22);
		Pessoa pessoa = new Pessoa("Paulo", calendar.getTime());
		ResultadosDoJogoParImpar aposta = ResultadosDoJogoParImpar.IMPAR;
		Integer valor = Integer.valueOf(2);
		jogo.fixaJogada(new Aposta(pessoa, aposta, valor));
		assertNull(ouvinteDeTeste.parOuImpar());
	}

	@Test
	public void checarPessoa() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 22);
		Pessoa pessoa = new Pessoa("João", calendar.getTime());
		assertEquals("João", pessoa.getNome());
		assertEquals("22/01/2010", new SimpleDateFormat("dd/MM/yyyy").format(pessoa.getNascimento()));
	}

}
