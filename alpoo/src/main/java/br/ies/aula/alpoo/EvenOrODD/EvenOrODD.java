package br.ies.aula.alpoo.EvenOrODD;

import java.util.ArrayList;

import br.ies.aula.alpoo.EvenOrODD.models.Bet;
import br.ies.aula.alpoo.EvenOrODD.models.GameResults;

public class EvenOrODD {
	private static EvenOrODD instance;
	private int firstNumber;
	private int secondNumber;
	private ArrayList<Bet> bets;
	
	public GameResults playGame(Bet firstBet, Bet secondBet) {
		return (firstBet.getValue() + secondBet.getValue()) % 2 == 0? GameResults.PAR: GameResults.IMPAR;
	}
}
