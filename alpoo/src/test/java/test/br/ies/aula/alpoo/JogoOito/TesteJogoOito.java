package test.br.ies.aula.alpoo.JogoOito;

import br.ies.aula.alpoo.jogooito.JogoOito;

public class TesteJogoOito {
	public static void main(String[] args) {
		JogoOito jogo = new JogoOito();
		
		jogo.MostrarQuadro();
		jogo.MoveDown();
		jogo.MoveLeft();
		jogo.MoveLeft();
		jogo.MoveUp();
		jogo.MoveUp();
		jogo.MoveRight();
		jogo.MoveDown();
		jogo.MostrarQuadro();
	}
}
