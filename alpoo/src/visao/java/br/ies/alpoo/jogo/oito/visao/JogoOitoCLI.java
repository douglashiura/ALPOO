package br.ies.alpoo.jogo.oito.visao;

import java.util.Arrays;
import java.util.Scanner;

import br.ies.aula.alpoo.jogo.oito.JogoOito;

public class JogoOitoCLI {
	public static void main(String[] args) throws InterruptedException{
		Integer [][] doneArray = new Integer[][] {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 }};
		Controles control = new Controles();
		Scanner scan = new Scanner(System.in);
		String direction = null, name = null, provisoria = null;
		int okName = 0, okDone = 0;
		
		while (okName == 0) {
			System.out.println("Bem vindo ao jogo do Oito! Digite seu nome :");
			name = scan.nextLine();
			if (name.isEmpty() || name == "") {
				System.out.println("Digite um nome!\n");
			}
			else {
				control.setName(name);
				okName = 1;
			}
		}
		
		System.out.println("Que o jogo comece! Bom jogo "+ name +"!!!");
		
		while (okDone == 0) {
			System.out.println("\nNúmero de jogadas = " + String.valueOf(control.getJogadas()));
			System.out.println("");
			JogoOito.printTabuleiro();
			System.out.println("\nDigite A, W, S, D para mover o 0, DONE para terminar, REPLAY para jogar novamente ou EXIT para sair do jogo.");
			provisoria = scan.nextLine();
			direction = provisoria.toUpperCase();
			switch(direction) {
			case "W":
				JogoOito.mover("UP");
				Controles.setJogadas(control.getJogadas() + 1);
				break;
			case "A":
				JogoOito.mover("LEFT");
				Controles.setJogadas(control.getJogadas() + 1);
				break;
			case "S":
				JogoOito.mover("DOWN");
				Controles.setJogadas(control.getJogadas() + 1);
				break;
			case "D":
				JogoOito.mover("RIGHT");
				Controles.setJogadas(control.getJogadas() + 1);
				break;
			case "DONE":
				if(Arrays.deepEquals(doneArray, JogoOito.getTabuleiro())) {
					control.insertToDBNamePlays();
					System.out.println("Jogo finalizado!");
					okDone = 1;
				}
				else {
					System.out.println("O jogo ainda não acabou!");
				}
				break;
			case "REPLAY":
				int rnd = (int) (Math.random()*5 + 1);
				Controles.setJogadas(0);
				JogoOito.setTabuleiroByID(rnd);
				int x = 0,y = 0;
				
				for(int i=0 ; i<3;i++){
					for(int j=0 ; j<3; j++){
						if (JogoOito.getTabuleiro()[i][j] == 0) {
							x = j;
							y = i;
						}
					}
				}
				
				JogoOito.setColuna(x);
				JogoOito.setLinha(y);
				break;
			case "EXIT":
				System.out.println("Obrigado por jogar!");
				return;
			}

		}
		scan.close();
	}
	
}
