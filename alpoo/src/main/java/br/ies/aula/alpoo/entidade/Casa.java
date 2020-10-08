package br.ies.aula.alpoo.entidade;

public class Casa {
	private Integer numero;
	private Casa direita;
	
	public Casa(Integer numero) {
		this.setNumero(numero);
	}
	
	public Integer getNumero() {
		return numero;		
	}

	public void setNumero(Integer numero) {
		this.numero = numero;		
	}
	
	public void trocaPosicao(Casa origem, Casa destino) {
		Integer troca = origem.getNumero();
		origem.setNumero(destino.getNumero());
		destino.setNumero(troca);
	}
	
	public void fixaDireita(Casa direita) {
		this.direita = direita;
	}

	public void moverDireita() {
		trocaPosicao(this, direita);
	}
	
}
