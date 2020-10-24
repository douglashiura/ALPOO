package br.ies.visao.swing;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;

import br.ies.main.tabuleiro.ControleDoTabuleiro;

public class PintadorDeCelulasVizinhas {
	public void pintarDeCelulas(JLabel superiorEsquerdo, JLabel superiorCentral, JLabel superiorDireita,
			JLabel centroEsquerda, JLabel centroCentral, JLabel centroDireita, JLabel inferiorCentral,
			JLabel inferiorEsquerdo, JLabel inferiorDireita, ControleDoTabuleiro controle) {

		List<JLabel> listaDeTextos = new ArrayList<JLabel>();

		listaDeTextos.add(superiorEsquerdo);
		listaDeTextos.add(superiorCentral);
		listaDeTextos.add(superiorDireita);
		listaDeTextos.add(centroEsquerda);
		listaDeTextos.add(centroCentral);
		listaDeTextos.add(centroDireita);
		listaDeTextos.add(inferiorCentral);
		listaDeTextos.add(inferiorEsquerdo);
		listaDeTextos.add(inferiorDireita);

		for (JLabel camposDeTexto : listaDeTextos) {
			try {
				Map<String, Runnable> mapa = new HashMap<String, Runnable>();
				mapa.put("0", () -> camposDeTexto.setText(""));
				mapa.get(camposDeTexto.getText()).run();
			} catch (NullPointerException e) {

			}

			Map<String, Runnable> mapaVizinhosColoridos = new HashMap<String, Runnable>();
			Map<String, Runnable> mapaVizinhosBrancos = new HashMap<String, Runnable>();
			for (JLabel vizinhosColoridos : listaDeTextos) {

				mapaVizinhosColoridos.put(vizinhosColoridos.getText(),
						() -> vizinhosColoridos.setForeground(Color.RED));

				mapaVizinhosBrancos.put(vizinhosColoridos.getText(),
						() -> vizinhosColoridos.setForeground(Color.black));
				mapaVizinhosBrancos.get(vizinhosColoridos.getText()).run();

			}

			pintarCelulas(
					mapaVizinhosColoridos.get(controle.getTabuleiro().getPonteiro().getCima().getNumero().toString()));
			pintarCelulas(
					mapaVizinhosColoridos.get(controle.getTabuleiro().getPonteiro().getBaixo().getNumero().toString()));
			pintarCelulas(mapaVizinhosColoridos
					.get(controle.getTabuleiro().getPonteiro().getEsquerda().getNumero().toString()));
			pintarCelulas(mapaVizinhosColoridos
					.get(controle.getTabuleiro().getPonteiro().getDireita().getNumero().toString()));

		}

	}

	public void pintarCelulas(Runnable r) {
		try {
			r.run();
		} catch (NullPointerException e) {

		}

	}
}
