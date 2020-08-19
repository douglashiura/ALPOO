package br.edu.ies.alpoo;

public class JogoParImpar {
	private int primeiro;
	private int segundo;
	private Calculator cal;
	
	public JogoParImpar(){
		this.cal = new Calculator();
	}
	
	public JogoParImpar setPrimeiroNumero(int num1) {
		this.primeiro = num1;
		return this;
	}
	
	public JogoParImpar setSegundoNumero(int num2) {
		this.segundo = num2;
		return this;
	}
	
	public String getResultado() {
		Integer result = this.cal.soma(this.primeiro, this.segundo).getResult();
		if(result % 2 == 0 ) {			
			return "Par";
		}
		return "Impar";
	}

}
