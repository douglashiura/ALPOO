package br.ies.aula.alpoo.jogo;

public class JogoParImpar {
	
	private String result, jogada1, jogada2, nome1, nome2;
	private int par;
	public Boolean jogou1, jogou2;
	
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
	
	public void SalvarUm(String jogada, String nome) {
		this.jogada1 = jogada;
		this.nome1 = nome;
	}
	
	public void SalvarDois(String jogada, String nome) {
		this.jogada2 = jogada;
		this.nome2 = nome;
	}
	
	public Object ParOuImparPronto(){
		int x = Integer.parseInt(jogada1);
		int z = Integer.parseInt(jogada2);
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
	
	public void JogouUm(Boolean jogou) {
		this.jogou1 = true;
	}
	
	public void JogouDois(Boolean jogou) {
		this.jogou2 = true;
	}
	
	public String ReturnNomeUm() {
		return nome1;
	}
	
	public String ReturnNomeDois() {
		return nome2;
	}
}
