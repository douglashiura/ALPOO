package br.ies.aula.alpoo.SobrecargaSobrescrita;

public class IronMouse extends Mouse {
	@Override
	public String observar(Float gravidade) {
		if(gravidade > 15) {
			return "Estou esmagado!";
		}
		return "Estou vivo!";
	}
}
