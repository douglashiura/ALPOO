package test.br.ies.aula.alpoo.jogo.oito;

import java.util.Scanner;

import br.ies.aula.alpoo.jogo.oito.JogoOito;

public class TesteJogoOito {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		JogoOito jogoOito = new JogoOito();
		
		System.out.println("-------------ORIGINAL BOARD-------------");
		jogoOito.printBoard();
		
		jogoOito.moveUp();		
		System.out.println("----------------MOVE UP-----------------");
		jogoOito.printBoard();
		
		jogoOito.moveRight();
		System.out.println("---------------MOVE RIGHT---------------");
		jogoOito.printBoard();
		
		jogoOito.moveDown();
		System.out.println("---------------MOVE DOWN----------------");
		jogoOito.printBoard();
		
		jogoOito.moveLeft();
		System.out.println("---------------MOVE LEFT----------------");
		jogoOito.printBoard();
				
		while (jogoOito.getGameOver() == false) {		
			System.out.print("\n\nEscolha entre CIMA - DIREITA - BAIXO - ESQUERDA: ");
			String direction = scan.nextLine();
			
			System.out.println("\n********** Você moveu para " + direction +  " **********");
			jogoOito.move(direction);
			jogoOito.printBoard();
		}
		
		System.out.println("\n\n--- PARABENS, VOCE VENCEU! ---");
		scan.close();
	}
}
