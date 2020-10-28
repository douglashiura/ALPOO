package br.ies.aula.alpoo.calculadora;

import java.util.Scanner;

public class MainCalculadora {
	public static void main(String[] args) throws OutOfInteger {
		Calculadora calculadora = new Calculadora();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		Integer x = scan.nextInt();
		System.out.println("Digite a operação a ser feita / ou *: ");
		String operacao = scan.next();
		System.out.println("Digite o segundo número: ");
		Integer y = scan.nextInt();

		System.out.println(calculadora.calcular(operacao, x, y));

	}
}
