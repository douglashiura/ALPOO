package jogoParImpar;

import br.ies.aula.alpoo.calculadora.Calculadora;

import static jogoParImpar.ResultParImpar.IMPAR;
import static jogoParImpar.ResultParImpar.PAR;

public class Verifica {
	private Bet firstBet;
	private Bet secondBet;
	private static Verifica instance;

	public Verifica() {
	}

	public Object parOuImpar() {
		System.out.println(this.firstBet);
		Calculadora calc = new Calculadora();
		calc.soma(this.firstBet.getValue(), this.secondBet.getValue());
		Float result = calc.obterResultado();
		return isOdd(result) ? IMPAR : PAR;
	}

	public void setPlays(Integer playsOne, Integer playsTwo) {
		this.firstBet = new Bet(playsOne);
		this.secondBet = new Bet(playsTwo);

	}
	public Boolean isOdd(Float result) {
		return result %2!=0;
	}

	public static Verifica obterInstancia() {
		if(instance==null) {
			instance=new Verifica();
		}
		return instance;
	}
	
	public void setPlays(ResultParImpar bet, Integer value) {
		if (firstBet== null) {
			firstBet = new Bet(value, bet);
		} else {
			secondBet = new Bet(value, bet);
		}
	}
}