package alpoo;

public class Jogo {

	private Integer primeiro;
	private Integer segundo;

	public Object parOuImpar() {
		Calculadora calculadora = new Calculadora();
		calculadora.soma(primeiro, segundo);
		Float resultado = calculadora.obterResultado();
		if (resultado % 2 != 0) {
			return "IMPAR";
		}
		return "PAR";
	}

	public void fixaJogadas(Integer primeiro, Integer segundo) {
		this.primeiro = primeiro;
		this.segundo = segundo;
	}

}


