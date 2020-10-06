package br.ies.aula.alpoo.SobrecargaSobrescrita;

public interface Observavel<T> {
	public String observar(Float gravidade);
	public String observar(Integer gravidade);
	public String observar(T gravidade);
}
