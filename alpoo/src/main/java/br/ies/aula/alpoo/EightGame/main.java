package br.ies.aula.alpoo.EightGame;


public class main {
	
	
	public static void main(String[] args) {
		EightGame game = new EightGame();
		game.status();
		System.out.println("CIMA\n");
		game.moveUP();
		game.status();
		System.out.println("BAIXO\n");
		game.moveDown();
		game.status();
		System.out.println("DIREITA\n");
		game.moveRight();
		game.status();
		System.out.println("ESQUERDA\n");
		game.moveLeft();
		game.status();
	}
}
