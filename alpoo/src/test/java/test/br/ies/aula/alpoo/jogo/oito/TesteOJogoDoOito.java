package test.br.ies.aula.alpoo.jogo.oito;

import br.ies.aula.alpoo.jogo.oito.JogoDoOitoProcedural;

public class TesteOJogoDoOito {

	public static void main(String[] args) throws InterruptedException {
		JogoDoOitoProcedural jogo = new JogoDoOitoProcedural();
		jogo.moverAPecaBranca("CIMA");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("BAIXO");
		jogo.moverAPecaBranca("ESQUERDA");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("CIMA");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("BAIXO");
		jogo.moverAPecaBranca("ESQUERDA");
		jogo.moverAPecaBranca("ESQUERDA");
		jogo.moverAPecaBranca("CIMA");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("BAIXO");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("CIMA");
		jogo.moverAPecaBranca("ESQUERDA");
		jogo.moverAPecaBranca("ESQUERDA");
		jogo.moverAPecaBranca("BAIXO");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("BAIXO");
		jogo.moverAPecaBranca("ESQUERDA");
		jogo.moverAPecaBranca("ESQUERDA");
		jogo.moverAPecaBranca("CIMA");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("BAIXO");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("BAIXO");
		jogo.moverAPecaBranca("CIMA");
		jogo.moverAPecaBranca("ESQUERDA");
		jogo.moverAPecaBranca("ESQUERDA");
		jogo.moverAPecaBranca("BAIXO");
		jogo.moverAPecaBranca("DIREITA");
		jogo.moverAPecaBranca("DIREITA");
		System.out.println();
		jogo.pintarTabuleiro();
		System.out.println("VENCEUUUUUU");
	}
}
