package br.ies.aula.alpoo.EvenOrODD;

import java.util.LinkedList;

import br.ies.aula.alpoo.EvenOrODD.models.Bet;
import br.ies.aula.alpoo.EvenOrODD.models.GameResults;
import br.ies.aula.alpoo.EvenOrODD.models.ResultListener;

public class SecondPlayerPlayed implements StateOfPlay {
	private Bet firstBet;
	private GameStateControl gameState;
	
	public SecondPlayerPlayed(Bet firstBet, GameStateControl gameState) {
		this.firstBet = firstBet;
		this.gameState = gameState;
	}

	@Override
	public void play(Bet secondBet) {
		GameResults gameResult = new EvenOrODD().playGame(firstBet, secondBet);
	}

}
