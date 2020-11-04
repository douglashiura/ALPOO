package model;

public class Movement {
	private Integer moveId;
	private Integer gameID;
	private String movement;
	
	public Movement(Integer moveId, Integer gameID, String movement) {
		this.moveId = moveId;
		this.gameID = gameID;
		this.movement = movement;
	}
	
	public Movement(Integer gameID, String movement) {
		this.gameID = gameID;
		this.movement = movement;
	}
	
	public Integer getGameID() {
		return gameID;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public String getMovement() {
		return movement;
	}
		
	public void setGameID(Integer gameID) {
		this.gameID = gameID;
	}
	
	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}
	
	

}
