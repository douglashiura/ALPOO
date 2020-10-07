package br.ies.aula.alpoo.jogo.oito;

public class Main {

	public static void main(String[] args) {
		//melhorar a orientacao
		JogoDoOito jogo = new JogoDoOito();
		jogo.imprimeMatriz();
		jogo.moverZero(Direcao.CIMA);
		jogo.moverZero(Direcao.BAIXO);
		jogo.moverZero(Direcao.ESQUERDA);
		jogo.moverZero(Direcao.DIREITA);
	}

}
