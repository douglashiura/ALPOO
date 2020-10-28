package br.ies.aula.alpoo.calculadora;

import java.util.Scanner;

public class MainCalculadora {
	public static void main(String[] args) throws OutOfInteger {
		Calculadora calculadora = new Calculadora();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		long x = scan.nextInt();
		System.out.println("Digite a operação a ser feita / ou *: ");
		String operacao = scan.next();
		System.out.println("Digite o segundo número: ");
		long y = scan.nextInt();

		try {
			System.out.println(calculadora.calcular(operacao, x, y));
			if (calculadora.calcular(operacao, x, y) > Integer.MAX_VALUE) {
				throw new OutOfInteger();
			}
		} catch (ArithmeticException e) {
			System.out.println("Impossível dividir por zero!");
		} finally {
			scan.close();
		}
		
		

	}
}
