package model;

public class Game {
	private Integer gameID;
	private String startSequence;
	
	public Game(Integer gameID, String startSequence) {
		this.gameID = gameID;
		this.startSequence = startSequence;
	}
	
	public Game() {

	}

	public Integer getGameID() {
		return gameID;
	}

	public String getStartSequence() {
		return startSequence;
	}

	public void setGameID(Integer gameID) {
		this.gameID = gameID;
	}

	public void setStartSequence(String startSequence) {
		this.startSequence = startSequence;
	}
	
	
	
	
}
