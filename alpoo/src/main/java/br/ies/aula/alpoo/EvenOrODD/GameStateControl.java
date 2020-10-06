package br.ies.aula.alpoo.EvenOrODD;

import java.util.HashMap;
import java.util.LinkedList;

import br.ies.aula.alpoo.EvenOrODD.models.Bet;
import br.ies.aula.alpoo.EvenOrODD.models.GameResults;
import br.ies.aula.alpoo.EvenOrODD.models.ResultListener;

public class GameStateControl {
	private LinkedList<Bet> bets;
	private StateOfPlay gameState;
	LinkedList<ResultListener> listeners;
	
	public GameStateControl() {
		listeners = new LinkedList<ResultListener>();
		startMatch();
	}
	
	public void placeABet(Bet bet) {
		bets.add(bet);
		gameState.play(bet);
	}

	public void startMatch() {
		gameState = new FirstPlayerPlayed(this);
		bets = new LinkedList<Bet>();
	}
	
	public void addResultListener(ResultListener resultListener) {
		listeners.add(resultListener);
	}
	
	public void fixGameState(StateOfPlay gameState) {
		this.gameState = gameState;
	}
	
	public void notifyListeners(GameResults result) {
		LinkedList<Bet> bets = getBets(result);
		listeners.forEach(listener -> {
			listener.notify(result, bets);
		});
	}
	
	public LinkedList<Bet> getBets(GameResults result) {
		HashMap<GameResults, LinkedList<Bet>> indexedsBets = new HashMap<GameResults, LinkedList<Bet>>();
		indexedsBets.put(GameResults.IMPAR, new LinkedList<Bet>());
		indexedsBets.put(GameResults.PAR, new LinkedList<Bet>());
		
		for(Bet bet: bets) {
			indexedsBets.get(bet.getBet()).add(bet);
		}
		
		return indexedsBets.get(result);
	}

}
