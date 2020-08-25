package br.ies.aula.alpoo.EightGame;


public class main {
	
	
	public static void main(String[] args) {
		EightGame game = new EightGame();
		game.status();
		System.out.println("\nCIMA");
		game.moveUP();
		game.status();
		System.out.println("\nBAIXO");
		game.moveDown();
		game.status();
		System.out.println("\nDIREITA");
		game.moveRight();
		game.status();
		System.out.println("\nESQUERDA");
		game.moveLeft();
		game.status();
	}
}
