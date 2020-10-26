package test.br.ies.aula.alpoo.jogo.oito;

import br.ies.aula.alpoo.jogo.oito.JogoOito;

public class JogoOitoMain {
	public static void main(String[] args) throws InterruptedException{
		JogoOito jogoOito = new JogoOito();
		
		jogoOito.printTabuleiro();
		jogoOito.mover("UP");
		jogoOito.mover("LEFT");
		jogoOito.mover("DOWN");
		jogoOito.mover("RIGHT");
		jogoOito.mover("DOWN");
		jogoOito.mover("LEFT");
		jogoOito.mover("UP");
		jogoOito.mover("RIGHT");
		jogoOito.mover("UP");
		jogoOito.mover("RIGHT");
		jogoOito.mover("DOWN");
		jogoOito.mover("DOWN");
		
		System.out.println("\nFinalizado.");
	}
	
}
