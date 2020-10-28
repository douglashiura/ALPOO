package teste.banco.de.dados;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import aula.par.impar.banco.de.dados.BancoDeDadosParImparAposta;
import aula.par.impar.banco.de.dados.BancoDeDadosParImparVencedor;
import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;
import aula.par.impar.entidade.Vencedor;

public class BancoDeDadosDoParImparTeste {

	@Before
	public void setUp() throws Exception {
		AjudanteBancoDeDados.limparTudo();
	}

	@Test
	public void inserirUmaAposta() throws Exception {
		Aposta aposta = new Aposta("Victor", ResultadosDoJogoParImpar.IMPAR, 2);
		BancoDeDadosParImparAposta banco = new BancoDeDadosParImparAposta();
		banco.inserir(aposta);
		List<Aposta> apostas = banco.obterApostas();
		assertEquals(1, apostas.size());
		assertNotNull(apostas.get(0).getId());

		// Adicionar os assertEquals restantes
		// assertEquals()...
	}

	@Test
	public void inserirUmVencedor() throws Exception {
		Aposta aposta = new Aposta("Victor", ResultadosDoJogoParImpar.IMPAR, 2);
		BancoDeDadosParImparAposta banco = new BancoDeDadosParImparAposta();
		banco.inserir(aposta);

		Vencedor vencedor = new Vencedor(aposta);
		BancoDeDadosParImparVencedor bancoDeDadosDoVencedor = new BancoDeDadosParImparVencedor();
		bancoDeDadosDoVencedor.inserir(vencedor);

	};

}
