package test.par.impar;

import java.util.Scanner;

public class TestJogoParImpar {

	public static void main(String[] args) {
		
		@SuppressWarnings("all")
		Scanner leitor = new Scanner(System.in);
		Integer player1, player2;

		System.out.println("==<>==Jogo Par ou �mpar!==<>==\n==============================\n");
		System.out.println("Primeiro jogador, digite um n�mero.");
		player1 = Integer.valueOf(leitor.nextInt());
		
		System.out.println("Segundo jogador, digite um n�mero.");
		player2 = Integer.valueOf(leitor.nextInt());
	
		if((player1 + player2) % 2 == 0) {
			System.out.println("Par ganhou!!");
		}else {
			System.out.println("�mpar ganhou!!");
		}
		
	}
	
}
