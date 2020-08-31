package br.ies.aula.alpoo.jogo;

import java.util.Scanner;

public class jogoParImpar {
	
	

	public static void main(String[] args) {
		jogarComScan();
	}
	
	public static void jogarComScan() {
		int n1;
		int n2;
		Scanner scan = new Scanner(System.in);
		String num1 = scan.nextLine();
		String num2 = scan.nextLine();	
		n1 = Integer.parseInt(num1);
		n2 = Integer.parseInt(num2);
		
		if (n1 % 2 == 0) {
			System.out.println("O numero "+n1+" é par.");
			}
		else {System.out.println("O numero "+n1+" é ímpar.");}
		
		if (n2 % 2 == 0) {
			System.out.println("O numero "+n2+" é par.");
			}
		else {System.out.println("O numero "+n2+" é ímpar.");}		
	}

	public static String jogar(int n1, int n2) {	
		if ((n1+n2) % 2 == 0) {
			return "PAR!";
			}
		else { return "IMPAR!"; }
	
	
}}
