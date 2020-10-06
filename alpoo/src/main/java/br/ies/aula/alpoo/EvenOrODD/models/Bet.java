package br.ies.aula.alpoo.EvenOrODD.models;

public class Bet {
	private String name;
	private int value;
	private GameResults bet;
	
	public Bet(String name, int value, GameResults bet) {
		this.name = name;
		this.value = value;
		this.bet = bet;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public GameResults getBet() {
		return bet;
	}
}
