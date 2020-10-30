package main.entity;

public class ScoreEntity {
	private Integer idScore;
	private Integer valueScore;
	
	public ScoreEntity() {
		super();
	}

	public ScoreEntity(Integer idScore, Integer valueScore) {
		super();
		this.idScore = idScore;
		this.valueScore = valueScore;
	}

	@Override
	public String toString() {
		return "ScoreEntity [idScore=" + idScore + ", valueScore=" + valueScore + "]";
	}
	
}
