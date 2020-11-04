package casa;

import dao.MovimentosDao;
import impl.TabuleiroImpl;

public class Casa implements MovimentosDao {

	protected Integer numero;
	protected Casa cima;
	protected Casa baixo;
	protected Casa direita;
	protected Casa esquerda;
	protected String nomePosicao;

	public Casa(Integer numero, String nomePosicao) {
		this.setNumero(numero);
		this.nomePosicao = nomePosicao;
	}

	public String getNomePosicao() {
		return this.nomePosicao;
	}

	public Casa getCima() {
		return cima;
	}

	public void setCima(Casa cima) {
		this.cima = cima;
	}

	public Casa getBaixo() {
		return baixo;
	}

	public void setBaixo(Casa baixo) {
		this.baixo = baixo;
	}

	public Casa getDireita() {
		return direita;
	}

	public void setDireita(Casa direita) {
		this.direita = direita;
	}

	public Casa getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Casa esquerda) {
		this.esquerda = esquerda;
	}

	private void setNumero(Integer numero) {
		this.numero = numero;
	}

	private Integer getNumero() {
		return this.numero;
	}

	public void moveCima() {
		this.trocaNumeros(this, cima);
	}

	public void moveBaixo() {
		this.trocaNumeros(this, baixo);
	}

	public void moveDireita() {
		this.trocaNumeros(this, direita);
	}

	public void moveEsquerda() {
		this.trocaNumeros(this, esquerda);
	}

	public void trocaNumeros(Casa origem, Casa destino) {
		TabuleiroImpl tabuleiroDao = new TabuleiroImpl();
		try {
			boolean atualizaTela = tabuleiroDao.atualizaTabuleiro(origem.getNomePosicao(), destino.getNomePosicao());
			if (atualizaTela) {
				Integer trocar = origem.getNumero();
				origem.setNumero(destino.getNumero());
				destino.setNumero(trocar);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		if (this.numero != 0) {
			return this.numero.toString();			
		} else {
			return "";
		}

	}

	public Integer verEstadoDoNumero() {
		return this.getNumero();
	}
}
