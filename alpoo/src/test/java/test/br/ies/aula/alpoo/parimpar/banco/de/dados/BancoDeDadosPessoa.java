package test.br.ies.aula.alpoo.parimpar.banco.de.dados;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.parimpar.dao.implementacao.PessoaDaoJdbc;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Pessoa;

public class BancoDeDadosPessoa {
	
	PessoaDaoJdbc pessoaDao;
	
	@Before
	public void setUp() {
		pessoaDao = new PessoaDaoJdbc();
		AjudanteBancoDeDados.limparTudo();
	}
	
	@Test
	public void inserirPessoa() throws Exception {
		Pessoa pessoa = new Pessoa(null, "Muriel", LocalDate.now(), "mugui", "123456");
		pessoaDao.inserir(pessoa);
	}
}
