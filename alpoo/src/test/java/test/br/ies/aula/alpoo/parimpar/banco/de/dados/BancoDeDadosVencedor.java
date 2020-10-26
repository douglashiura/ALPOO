package test.br.ies.aula.alpoo.parimpar.banco.de.dados;

import java.sql.Timestamp;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.parimpar.dao.ApostaDao;
import br.ies.aula.alpoo.jogo.parimpar.dao.VencedorDao;
import br.ies.aula.alpoo.jogo.parimpar.dao.implementacao.ApostaDaoJdbc;
import br.ies.aula.alpoo.jogo.parimpar.dao.implementacao.VencedorDaoJdbc;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Vencedor;

public class BancoDeDadosVencedor {
	
	ApostaDao apostaDao;
	VencedorDao vencedorDao;
	
	@Before
	public void setUp() {
		apostaDao = new ApostaDaoJdbc();
		vencedorDao = new VencedorDaoJdbc();
		AjudanteBancoDeDados.limparTudo();
	}
	
	@Test
	public void inserir() throws Exception {
		Aposta aposta = new Aposta("Muriel", 2, ResultadosParImpar.IMPAR);
		apostaDao.inserir(aposta);
		Vencedor vencedor = new Vencedor(aposta, new Timestamp(System.currentTimeMillis()));
		vencedorDao.inserir(vencedor);
	}
	
}
