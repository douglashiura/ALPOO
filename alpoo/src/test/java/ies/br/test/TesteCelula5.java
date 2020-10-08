package ies.br.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.br.ies.Celula;
import main.br.ies.celulas.CelulaCinco;

public class TesteCelula5 {
	
	@Test
	public void celulaCinco() throws Exception {
		Celula cinco = new CelulaCinco();
		assertEquals(Integer.valueOf(5), cinco.getNumero());
	}
	
	@Test
	public void moverCelulaCincoParaCelulaSeisQueEstavaEmBranco() throws Exception {
		Celula cinco = new CelulaCinco();
		Celula seis = new Celula(6);
		seis.setNumero(Integer.valueOf(0));
		cinco.fixaDireita(seis);
		cinco.moverParaDireita();
		assertEquals(Integer.valueOf(0), cinco.getNumero());
		assertEquals(Integer.valueOf(5), seis.getNumero());
	}
	
}