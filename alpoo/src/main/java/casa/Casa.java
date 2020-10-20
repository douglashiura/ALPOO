package casa;

import movimento.Movimentos;

public class Casa implements Movimentos {
	
	protected Integer numero;
	protected Casa cima;
	protected Casa baixo;
	protected Casa direita;
	protected Casa esquerda;
	
	public Casa(Integer numero) { this.setNumero(numero); }

	public Casa getCima() { return cima; }

	public void setCima(Casa cima) { this.cima = cima; }

	public Casa getBaixo() { return baixo; }

	public void setBaixo(Casa baixo) { this.baixo = baixo; }

	public Casa getDireita() { return direita; }

	public void setDireita(Casa direita) { this.direita = direita; }

	public Casa getEsquerda() { return esquerda; }

	public void setEsquerda(Casa esquerda) { this.esquerda = esquerda; }

	private void setNumero(Integer numero) { this.numero = numero; }
	
	private Integer getNumero() { return this.numero; }

	@Override
	public void moveCima() { this.trocaNumeros(this, cima); }

	@Override
	public void moveBaixo() { this.trocaNumeros(this, baixo); }

	@Override
	public void moveDireita() { this.trocaNumeros(this, direita); }

	@Override
	public void moveEsquerda() { this.trocaNumeros(this, esquerda); }
	
	public void trocaNumeros(Casa origem,Casa destino) {
		Integer trocar = origem.getNumero();
		origem.setNumero(destino.getNumero());
		destino.setNumero(trocar);
	}
}
