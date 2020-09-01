package br.ies.aula.alpoo.jogo;

public class JogoParImpar {
	
	private String result;
	private int par;
	
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
	
	public Object ParOuImpar(Integer x, Integer z){
		int y = (x + z) % 2;
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
	
	public String getResult() {
		return result;
	}
	
	public void SetParUm() {
		par = 1;
	}
	
	public void SetParDois() {
		par = 2;
	}
	
	public int CheckPar() {
		return par;
	}
	
}
