package test.par.impar;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import aula.par.impar.LojaDoJogoParImpar;
import aula.par.impar.entidade.Pessoa;

public class TestComPessoa {
	private OuvinteDeResultadoDeTeste ouvinteDeTeste;
	private LojaDoJogoParImpar jogo;
	private Pessoa pessoa;

	@Before
	public void setup() throws Exception {
		ouvinteDeTeste = new OuvinteDeResultadoDeTeste();
		jogo = new LojaDoJogoParImpar();
		jogo.adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		jogo.iniciarPartida();
	}

	@Test
	public void criandoPessoa() throws Exception {
		Date data = new Date();
		pessoa = new Pessoa("Victor", data);

		System.out.println("Nome:");
		System.out.println(pessoa.getNome());
		System.out.println("Data de Nascimento:");
		System.out.println(pessoa.getDataDeNascimentoFormatted());

		assertEquals("28/09/2020", pessoa.getDataDeNascimentoFormatted());
	}

	@Test
	public void escolhendoDataDeNascimentoDaPessoa() {
		
	}

	@Test
	public void inserindoPessoaNoBanco() throws Exception {

	}

}
