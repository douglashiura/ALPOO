package br.ies.aula.alpoo.SobrecargaSobrescrita;

import java.awt.Point;

public class Mouse implements Observavel<Point>{

	@Override
	public String observar(Float gravidade) {
		if(gravidade > 10) {
			return "Estou esmagado!";
		}
		return "Estou vivo!";
	}

	@Override
	public String observar(Integer gravidade) {		
		return "Esta gravidade não é natural";
	}

	@Override
	public String observar(Point gravidade) {		
		return "Desse ponto não sou observável!";
	}

}
