package main.entity;

public class scoreEntity {
	private Integer idScore;
	private Integer valueScore;
	
	public scoreEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public scoreEntity(Integer idScore, Integer valueScore) {
		super();
		this.idScore = idScore;
		this.valueScore = valueScore;
	}

	@Override
	public String toString() {
		return "scoreEntity [idScore=" + idScore + ", valueScore=" + valueScore + "]";
	}
	
}
