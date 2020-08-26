package br.edu.ies.alpoo.jogo.oito;

public abstract class Mensagens {
	public static void mensagemErroNoMovimento() {
		System.out.println("MOVIMENTO INVALIDO");
	}
	
	public static void mensagemSeparaJogos() {
		System.out.println("==+==");
	}
	
	public static void estadoAtualJogo(int[][]jogo) {
		for(int[] linha: jogo) {
			for(int coluna : linha) {
				System.out.printf("%s ",coluna);
			}
			System.out.println();
		}
		Mensagens.mensagemSeparaJogos();
	}

}
