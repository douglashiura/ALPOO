package br.ies.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import br.ies.main.celulas.Celula;

public class TesteDeTrocaDeNumeroDaCelula {

	private Celula celulaUm;
	private Celula celulaDois;

	@Test
	public void trocandoValoresDaPrimeiraCelulaComASegunda() {
		celulaUm = new Celula(Integer.valueOf(5));
		celulaDois = new Celula(Integer.valueOf(9));
		celulaUm.trocarNumero(celulaUm, celulaDois);

		assertEquals(Integer.valueOf(9), celulaUm.getNumero());
	}

	@Test
	public void trocandoValoresDaSegundaCelulaComAPrimeira() {
		celulaUm = new Celula(Integer.valueOf(5));
		celulaDois = new Celula(Integer.valueOf(9));
		celulaDois.trocarNumero(celulaUm, celulaDois);

		assertEquals(Integer.valueOf(5), celulaDois.getNumero());
	}
}
