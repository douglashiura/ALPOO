package br.ies.aula.alpoo.calculadora;

public class Divisao implements Operação {

	@Override
	public int calcular(int x, int y) {
		try {
			return x / y;
		} catch (ArithmeticException e) {
			System.out.println("Impossível dividir por 0!");
			return 0;
		}
		
	}

}
