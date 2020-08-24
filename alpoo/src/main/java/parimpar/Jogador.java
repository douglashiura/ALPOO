package parimpar;

import java.util.Scanner;

public class Jogador {
	private int escolha;
	private int jogada;
	private String nome;
	Scanner scanner = new Scanner(System.in);

	public int getEscolha() {
		return escolha;
	}
	

	public void setEscolha() {
		do {
			System.out.println("Faça sua escolha");
			System.out.println("(0) PAR     (1) IMPAR");

			this.escolha = scanner.nextInt();
		} while (0 != this.escolha && 1 != this.escolha);

		if (0 == this.escolha) {
			System.out.println(this.nome + " escolheu PAR");
		} else {
			System.out.println(this.nome + " escolheu IMPAR");
		}
	}

	public void setEscolha(int escolha) {

		if (1 == escolha) {
			this.escolha = 0;
		} else {
			this.escolha = 1;
		}

		if (0 == this.escolha) {
			System.out.println(this.nome + " escolheu PAR");
		} else {
			System.out.println(this.nome + " escolheu IMPAR");
		}
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada() {
		System.out.print("Faça sua jogada: ");
		this.jogada = scanner.nextInt();
	}

	public void setJogada(int jogada) {
		System.out.println("pc JOGOU: " + jogada);
		this.jogada = jogada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome() {
		System.out.print("Diga seu nome: ");
		this.nome = scanner.next();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void infoGanhador(String nome, int jogada) {

		if (0 == (this.jogada + jogada) % 2) {
			System.out.println("*** PAR ***");
		} else {
			System.out.println("*** IMPAR ***");
		}

		if (this.escolha == (this.jogada + jogada) % 2) {
			System.out.println(this.nome + " Ganhou");
		} else {
			System.out.println(nome + " Ganhou");
		}
	}

}
