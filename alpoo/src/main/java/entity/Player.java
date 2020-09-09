package entity;

public class Player {
	private Integer cdPlayer;
	private String name;
	public Integer getCdPlayer() {
		return cdPlayer;
	}
	public void setCdPlayer(Integer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Player [cdPlayer=" + cdPlayer + ", name=" + name + "]";
	}
	
	
}
