package test.br.ies.aula.alpoo.jogo.oito;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.oito.JogoDoOito;

@SuppressWarnings("unused")
public class TesteJogoDoOito {
	
	JogoDoOito jogo = new JogoDoOito(8);
	
	public void telaJogo() {
		System.out.println("=========<>=========");
		System.out.println("Estado Atual do Jogo");
		System.out.println("=========<>=========");
		jogo.showGame();
		System.out.println("....................");
	}
	
	@Test
	public void jogando() {
		this.telaJogo();
		jogo.moverEsquerda();
		this.telaJogo();
		jogo.moverCima();
		this.telaJogo();
		jogo.moverDireita();
		this.telaJogo();
		jogo.moverBaixo();
		this.telaJogo();
	}
	
	
}
