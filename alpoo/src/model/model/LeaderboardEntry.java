package model;

public class LeaderboardEntry {
	private Integer entryID;
	private Integer gameID;
	private Integer moves;
	private String playerName;
	
	public LeaderboardEntry(Integer entryID, Integer gameID, Integer moves, String playerName) {
		this.entryID = entryID;
		this.gameID = gameID;
		this.moves = moves;
		this.playerName = playerName;
	}

	public LeaderboardEntry(Integer gameID, Integer moves, String playerName) {
		this.gameID = gameID;
		this.moves = moves;
		this.playerName = playerName;
	}
	
	public LeaderboardEntry(Integer gameID, Integer moves) {
		this.gameID = gameID;
		this.moves = moves;
	}

	public Integer getEntryID() {
		return entryID;
	}

	public void setEntryID(Integer entryID) {
		this.entryID = entryID;
	}
	
	public Integer getGameID() {
		return gameID;
	}

	public Integer getMoves() {
		return moves;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setGameID(Integer gameID) {
		this.gameID = gameID;
	}

	public void setMoves(Integer moves) {
		this.moves = moves;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Game ID: " + gameID + ", Moves: " + moves + ", Player Name: " + playerName;
	}
	
	
	
	

}
