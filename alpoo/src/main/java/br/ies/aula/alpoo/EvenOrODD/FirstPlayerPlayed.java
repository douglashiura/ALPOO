package br.ies.aula.alpoo.EvenOrODD;

import java.util.LinkedList;

import br.ies.aula.alpoo.EvenOrODD.models.Bet;
import br.ies.aula.alpoo.EvenOrODD.models.GameResults;
import br.ies.aula.alpoo.EvenOrODD.models.ResultListener;

public class FirstPlayerPlayed implements StateOfPlay {
	private GameStateControl gameState;
	
	public FirstPlayerPlayed(GameStateControl gameState) {
		this.gameState = gameState;
	}
	@Override
	public void play(Bet firstBet) {
		gameState.fixGameState(new SecondPlayerPlayed(firstBet, gameState));
	}

}
