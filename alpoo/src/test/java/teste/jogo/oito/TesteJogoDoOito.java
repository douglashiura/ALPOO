package teste.jogo.oito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jogo.oito.JogoDoOito;

public class TesteJogoDoOito {
	JogoDoOito jogo;

	@Before
	public void setUp() {
		this.jogo = new JogoDoOito();
	}

	@Test
	public void movimentaParaCima() throws Exception {
		jogo.mostrarJogo();
		jogo.cima();
	}
	
	@Test
	public void movimentaParaDireita() throws Exception {
		jogo.mostrarJogo();
		jogo.direita();
	}
	
	@Test
	public void movimentaParaEsquerda() throws Exception {
		jogo.mostrarJogo();
		jogo.esquerda();
	}
	
	@Test
	public void movimentaParaBaixo() throws Exception {
		jogo.mostrarJogo();
		jogo.baixo();
	}

}
