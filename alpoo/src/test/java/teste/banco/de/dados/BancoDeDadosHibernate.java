package teste.banco.de.dados;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import aula.par.impar.banco.de.dados.BancoDeDadosParImparAposta;
import aula.par.impar.banco.de.dados.hibernate.GerenciadorDaAposta;
import aula.par.impar.banco.de.dados.hibernate.GerenciadorDoHibernate;
import aula.par.impar.banco.de.dados.hibernate.GerenciadorDoVencedor;
import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;
import aula.par.impar.entidade.Vencedor;

public class BancoDeDadosHibernate {

	@Before
	public void setUp() throws Exception {
		AjudanteBancoDeDados.limparTudo();
	}
	
	@Test
	public void inserirUmaApostaNoHibernate() throws Exception {
		Aposta aposta = new Aposta("VictorHibernate", ResultadosDoJogoParImpar.IMPAR, 2);
		GerenciadorDoHibernate hibernate = new GerenciadorDoHibernate();
		GerenciadorDaAposta hibernateAposta = new GerenciadorDaAposta(hibernate);
		hibernateAposta.inserir(aposta);
		List<Aposta> apostas = new BancoDeDadosParImparAposta().obterApostas();
		assertEquals(1, apostas.size());
		assertNotNull(apostas.get(0).getId());
		
		//Adicionar os assertEquals restantes
		//assertEquals()...
	}
	
	@Test
	public void inserirUmVencedorNoHibernate() throws Exception {
		Aposta aposta = new Aposta("VictorVencedorHibernate", ResultadosDoJogoParImpar.IMPAR, 2);
		Vencedor vencedor = new Vencedor(aposta);
		GerenciadorDoHibernate hibernate = new GerenciadorDoHibernate();
		GerenciadorDaAposta hibernateAposta = new GerenciadorDaAposta(hibernate);
		GerenciadorDoVencedor hibernateVencedor = new GerenciadorDoVencedor(hibernate);
		hibernateAposta.inserir(aposta);
		hibernateVencedor.inserir(vencedor);
		List<Aposta> apostas = new BancoDeDadosParImparAposta().obterApostas();
		assertEquals(1, apostas.size());
		assertNotNull(apostas.get(0).getId());
		
		//Adicionar os assertEquals restantes
		//assertEquals()...
	}
	
}
