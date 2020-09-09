package entity;

public class Move {
	private Integer cdMove;
	private Integer valueMove;
	private Integer valueBet;
	public Integer getCdMove() {
		return cdMove;
	}
	public void setCdMove(Integer cdMove) {
		this.cdMove = cdMove;
	}
	public Integer getValueMove() {
		return valueMove;
	}
	public void setValueMove(Integer valueMove) {
		this.valueMove = valueMove;
	}
	public Integer getValueBet() {
		return valueBet;
	}
	public void setValueBet(Integer valueBet) {
		this.valueBet = valueBet;
	}
	@Override
	public String toString() {
		return "Move [cdMove=" + cdMove + ", valueMove=" + valueMove + ", valueBet=" + valueBet + "]";
	}
	
	
}
