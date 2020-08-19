package br.ies.aula.alpoo.jogo;

public class JogoParImpar {
	
	private String result;
	
	public Object ParOuImpar(Integer x){
		int y = x % 2;
		switch(y) {
		case 1:
			result = "Impar";
			break;
		case 0:
			result = "Par";
			break;
		default:
			result = "Zero";
			break;
		}
		return result;
	}
}
