package br.ies.aula.alpoo.EvenOrODD;

public class EvenOrODD {
	
	public GameResults playGame(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber % 2 == 0? GameResults.PAR: GameResults.IMPAR;
	}
}
