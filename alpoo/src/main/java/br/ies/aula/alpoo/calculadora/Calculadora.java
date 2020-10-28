package br.ies.aula.alpoo.calculadora;

import java.util.Scanner;

public class Calculadora {

	private Integer resultado;
	
	public void somar(Integer num1, Integer num2) {
		resultado = num1 + num2;
	}
	
	public void multiplicar(Integer num1, Integer num2) throws MaxIntegerException {
		long resultadoLong = (long) num1 * num2;
		System.out.println(resultadoLong);
		if (resultadoLong > Integer.MAX_VALUE) {
			throw new MaxIntegerException("O numero é maior que o limite aceito para um inteiro.");
		}
		
		this.resultado = num1 * num2;
	}
	
	public void dividir(Integer num1, Integer num2) {
		try {
			resultado = num1 / num2;
		} catch (ArithmeticException exception) {
			System.out.println("Não é possivel fazer a divisão por zero.");
		}
	}
	
	public Integer obterResultado() {
		return resultado;
	}
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Scanner scan = new Scanner(System.in);
		
		Integer numeroUm = scan.nextInt();
		Integer numeroDois = scan.nextInt();

		calculadora.dividir(numeroUm, numeroDois);
		
		try {
			calculadora.multiplicar(numeroUm, numeroDois);
		} catch (MaxIntegerException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}

}
