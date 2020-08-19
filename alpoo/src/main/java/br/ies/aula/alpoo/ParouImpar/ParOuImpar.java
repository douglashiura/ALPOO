package br.ies.aula.alpoo.ParouImpar;


import br.ies.aula.alpoo.calculadora.Calculadora;

public class ParOuImpar {
	private Integer primeiro;
	private Integer segundo;
	
	public Object parOuImpar() {
		Calculadora calculadora = new Calculadora();
		calculadora.soma(primeiro, segundo);
		Float resultado = calculadora.obterResultado();
		if(resultado % 2 != 0) {
			return "IMPAR";
		}
		return "PAR";
	}
	
	public void fixaJogadores(Integer primeiro, Integer Segundo){
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
}
