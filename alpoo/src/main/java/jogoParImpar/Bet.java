package jogoParImpar;

public class Bet {
	private ResultParImpar bet;
	private Integer value;

	public Bet(Integer value, ResultParImpar bet) {
		super();
		this.value = value;
		this.bet = bet;
	}

	public Bet(Integer value) {
		super();
		this.value = value;
	}

	public ResultParImpar getBet() {
		return bet;
	}

	public void setBet(ResultParImpar bet) {
		this.bet = bet;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
