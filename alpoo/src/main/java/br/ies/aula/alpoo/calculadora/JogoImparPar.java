package br.ies.aula.alpoo.calculadora;

import java.util.Scanner;

public class JogoImparPar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número do primeiro jogador: ");
		Integer num1 = Integer.valueOf(scan.nextInt());

		System.out.println("Digite o número do segundo jogador: ");
		Integer num2 = Integer.valueOf(scan.nextInt());

		if((num1 + num2) % 2 == 0) {
			System.out.println("Par ganhou!");
		}else {
			System.out.println("Ímpar ganhou!");
		}
		
		scan.close();
	}
}
