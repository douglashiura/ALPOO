package br.edu.ies.alpoo.jogo.oito;

public enum MOVIMENTO {
	CIMA("up"),
	DESCE("down"),
	DIREITA("right"),
	ESQUERDA("left");
	
	private final String direcao;

	MOVIMENTO(String movimento) {
		this.direcao = movimento;
	}
	
	public String getDirecao() {
		return this.direcao;
	}
}
