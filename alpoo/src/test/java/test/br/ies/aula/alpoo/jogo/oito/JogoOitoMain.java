package test.br.ies.aula.alpoo.jogo.oito;

import br.ies.aula.alpoo.jogo.oito.JogoOito;

public class JogoOitoMain {
	public static void main(String[] args) throws InterruptedException{
		JogoOito jogoOito = new JogoOito();
		
		jogoOito.printTabuleiro();
		jogoOito.moveZero("UP");
		jogoOito.moveZero("LEFT");
		jogoOito.moveZero("DOWN");
		jogoOito.moveZero("RIGHT");
		jogoOito.moveZero("DOWN");
		jogoOito.moveZero("LEFT");
		jogoOito.moveZero("UP");
		jogoOito.moveZero("RIGHT");
		jogoOito.moveZero("UP");
		jogoOito.moveZero("RIGHT");
		jogoOito.moveZero("DOWN");
		jogoOito.moveZero("DOWN");
		
		System.out.println("Finalizado.");
	}
	
}
