package br.ies.aula.alpoo.parimpar.controller.ouvinte;

import java.util.List;

import br.ies.aula.alpoo.parimpar.controller.DAO.GanhadorDAO;
import br.ies.aula.alpoo.parimpar.model.Aposta;
import br.ies.aula.alpoo.parimpar.model.Ganhador;
import br.ies.aula.alpoo.parimpar.model.ResultadosDoJogoParImpar;

public class OuvinteVencedor implements Ouvinte {

	@Override
	public void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> apostas) {
		try {
			GanhadorDAO ganhadorDAO = new GanhadorDAO();
			for (Aposta aposta : apostas) {
				if (resultado == aposta.getAposta()) {
					ganhadorDAO.inserirGanhador(new Ganhador(aposta));
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
