package tabuleiro;

import javax.persistence.Entity;

import casa.Casa;
import casa.CasaCimaDireita;
import casa.CasaCimaEsquerda;
import casa.CasaCimaMeio;
import casa.CasaInferiorDireita;
import casa.CasaInferiorEsquerda;
import casa.CasaInferiorMeio;
import casa.CasaMeio;
import casa.CasaMeioDireita;
import casa.CasaMeioEsquerda;

@Entity
public class Tabuleiro {
	
	private Casa ponteiro;
	private CasaMeio meio;
	private CasaMeioDireita meioDireita;
	private CasaMeioEsquerda meioEsquerda;
	private CasaInferiorMeio inferiorMeio;
	private CasaInferiorDireita inferiorDireita;
	private CasaInferiorEsquerda inferiorEsquerda;
	private CasaCimaMeio cimaMeio;
	private CasaCimaDireita cimaDireita;
	private CasaCimaEsquerda cimaEsquerda;
	
	public Tabuleiro() {
		this.setInstancias();
		this.setVizinhos();
	}

	private void setInstancias() {
		this.cimaDireita = new CasaCimaDireita(Integer.valueOf(8));
		this.cimaEsquerda = new CasaCimaEsquerda(Integer.valueOf(1));
		this.cimaMeio = new CasaCimaMeio(Integer.valueOf(5));
		this.meio = new CasaMeio(Integer.valueOf(0));
		this.meioDireita = new CasaMeioDireita(Integer.valueOf(4));
		this.meioEsquerda = new CasaMeioEsquerda(Integer.valueOf(3));
		this.inferiorDireita = new CasaInferiorDireita(Integer.valueOf(7));
		this.inferiorEsquerda = new CasaInferiorEsquerda(Integer.valueOf(2));
		this.inferiorMeio = new CasaInferiorMeio(Integer.valueOf(6));
	}
	
	private void setVizinhos() {
		this.setPonteiro(this.meio);
		
		this.cimaEsquerda.setBaixo(this.meioEsquerda);
		this.cimaEsquerda.setDireita(this.cimaMeio);
		
		this.cimaMeio.setEsquerda(this.cimaEsquerda);
		this.cimaMeio.setBaixo(this.meio);
		this.cimaMeio.setDireita(this.cimaDireita);
		
		this.cimaDireita.setEsquerda(this.cimaMeio);
		this.cimaDireita.setBaixo(this.meioDireita);
		
		this.meioEsquerda.setCima(this.cimaEsquerda);
		this.meioEsquerda.setDireita(this.meio);
		this.meioEsquerda.setBaixo(this.inferiorEsquerda);
		
		this.meio.setEsquerda(this.meioEsquerda);
		this.meio.setDireita(this.meioDireita);
		this.meio.setCima(this.cimaMeio);
		this.meio.setBaixo(this.inferiorMeio);
		
		this.meioDireita.setCima(this.cimaDireita);
		this.meioDireita.setEsquerda(this.meio);
		this.meioDireita.setBaixo(this.inferiorDireita);
		
		this.inferiorEsquerda.setCima(this.meioEsquerda);
		this.inferiorEsquerda.setDireita(this.inferiorMeio);
		
		this.inferiorMeio.setEsquerda(this.inferiorEsquerda);
		this.inferiorMeio.setCima(this.meio);
		this.inferiorMeio.setDireita(this.inferiorDireita);
		
		this.inferiorDireita.setCima(this.meioDireita);
		this.inferiorDireita.setEsquerda(this.inferiorMeio);
		
	}

	public void setPonteiro(Casa ponteiro) { this.ponteiro = ponteiro; }

	public Casa getPonteiro() { return ponteiro; }

	public Casa getMeio() { return meio; }

	public Casa getMeioDireita() { return meioDireita; }

	public Casa getMeioEsquerda() {	return meioEsquerda; }

	public Casa getInferiorMeio() {	return inferiorMeio; }

	public Casa getInferiorDireita() { return inferiorDireita; }

	public Casa getInferiorEsquerda() {	return inferiorEsquerda; }

	public Casa getCimaMeio() {	return cimaMeio; }

	public Casa getCimaDireita() { return cimaDireita; }

	public Casa getCimaEsquerda() { return cimaEsquerda; }
	
	@Override
	public String toString() {
		return "Tabuleiro [ponteiro=" + ponteiro.verEstadoDoNumero() + ", meio=" + meio.verEstadoDoNumero() + ", meioDireita=" + meioDireita.verEstadoDoNumero() + ", meioEsquerda="
				+ meioEsquerda.verEstadoDoNumero() + ", inferiorMeio=" + inferiorMeio.verEstadoDoNumero() + ", inferiorDireita=" + inferiorDireita.verEstadoDoNumero()
				+ ", inferiorEsquerda=" + inferiorEsquerda.verEstadoDoNumero() + ", cimaMeio=" + cimaMeio.verEstadoDoNumero() + ", cimaDireita=" + cimaDireita.verEstadoDoNumero()
				+ ", cimaEsquerda=" + cimaEsquerda.verEstadoDoNumero() + "]";
	}

}
