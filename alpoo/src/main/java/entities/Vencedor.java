package entities;

import javax.swing.JLabel;

public class Vencedor {

	public Vencedor() {

	}

	static public boolean verificaVencedor(JLabel cimaEsquerda, JLabel cimaMeio, JLabel cimaDireita, JLabel meioEsquerda, JLabel meio,
			JLabel meioDireita, JLabel inferiorEsquerda, JLabel inferiorMeio, JLabel inferiorDireita) {
		boolean ganhou = cimaEsquerda.getText().equals("1") && cimaMeio.getText().equals("2") && cimaDireita.getText().equals("3") && meioEsquerda.getText().equals("4") && meio.getText().equals("5")
				&& meioDireita.getText().equals("6") && inferiorEsquerda.getText().equals("7") && inferiorMeio.getText().equals("8") && inferiorDireita.getText().equals("");
		return ganhou;
	}

}