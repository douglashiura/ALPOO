package test.br.ies.aula.alpoo;

import java.util.Scanner;

public class TesteJogoImparOuParSemJUnit4 {
	
	public static void main(String[] args) {
		
		int x, y;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n�mero e descubra se ele � par ou impar!");
		
		x = scan.nextInt();
		y = x % 2;
		
		switch(y) {
		case 1:
			System.out.println("� Impar");
			break;
		case 0:
			System.out.println("� Par");
			break;
		}
		scan.close();
	}
	

}
