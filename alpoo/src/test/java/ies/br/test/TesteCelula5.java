package ies.br.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.br.ies.Celula;
import main.br.ies.celulas.CelulaCinco;
import main.br.ies.celulas.CelulaDois;
import main.br.ies.celulas.CelulaNove;
import main.br.ies.celulas.CelulaOito;
import main.br.ies.celulas.CelulaQuatro;
import main.br.ies.celulas.CelulaSeis;
import main.br.ies.celulas.CelulaSete;
import main.br.ies.celulas.CelulaTres;
import main.br.ies.celulas.CelulaUm;

public class TesteCelula5 {
	
	@Test
	public void celulaCinco() throws Exception {
		Celula cinco = new CelulaCinco();
		assertEquals(Integer.valueOf(5), cinco.getNumero());
	}
	
	@Test
	public void moverCelulaCincoParaCelulaSeisQueEstavaEmBranco() throws Exception {
		Celula cinco = new CelulaCinco();
		Celula seis = new CelulaSeis();
		seis.setNumero(Integer.valueOf(0));
		cinco.fixaDireita(seis);
		cinco.moverParaDireita();
		assertEquals(Integer.valueOf(0), cinco.getNumero());
		assertEquals(Integer.valueOf(5), seis.getNumero());
	}
	
	@Test
	public void moverCelulaNoveParaCelulaUm() throws Exception {
		Celula um = new CelulaUm();
		Celula dois = new CelulaDois();
		Celula tres = new CelulaTres();
		Celula quatro = new CelulaQuatro();
		Celula cinco = new CelulaCinco();
		Celula seis = new CelulaSeis();
		Celula sete = new CelulaSete();
		Celula oito = new CelulaOito();
		Celula nove = new CelulaNove();
		mostrarTabuleiro(um,dois,tres,quatro,cinco,seis,sete,oito,nove);
		
		nove.fixaAcima(seis);
		
		nove.moverParaCima();
		assertEquals(Integer.valueOf(0), seis.getNumero());
		assertEquals(Integer.valueOf(6), nove.getNumero());
		mostrarTabuleiro(um,dois,tres,quatro,cinco,seis,sete,oito,nove);
		
		seis.fixaAcima(tres);
		
		seis.moverParaCima();
		assertEquals(Integer.valueOf(0), tres.getNumero());
		assertEquals(Integer.valueOf(3), seis.getNumero());
		mostrarTabuleiro(um,dois,tres,quatro,cinco,seis,sete,oito,nove);
		
		tres.fixaEsquerda(dois);
		
		tres.moverParaEsquerda();
		assertEquals(Integer.valueOf(0), dois.getNumero());
		assertEquals(Integer.valueOf(2), tres.getNumero());
		mostrarTabuleiro(um,dois,tres,quatro,cinco,seis,sete,oito,nove);
		
		dois.fixaEsquerda(um);
		
		dois.moverParaEsquerda();
		assertEquals(Integer.valueOf(0), um.getNumero());
		assertEquals(Integer.valueOf(1), dois.getNumero());
		mostrarTabuleiro(um,dois,tres,quatro,cinco,seis,sete,oito,nove);
	}

	private void mostrarTabuleiro(Celula um, Celula dois, Celula tres, Celula quatro, Celula cinco, Celula seis,
			Celula sete, Celula oito, Celula nove) {
		
		System.out.println("-" + um.getNumero() + "-" + dois.getNumero() + "-" + tres.getNumero());
		System.out.println("-" + quatro.getNumero() + "-" + cinco.getNumero() + "-" + seis.getNumero());
		System.out.println("-" + sete.getNumero() + "-" + oito.getNumero() + "-" + nove.getNumero());
		System.out.println();
	}


	
}