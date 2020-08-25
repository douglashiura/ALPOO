package test.br.ies.aula.alpoo;


import br.ies.aula.alpoo.calculadora.jogo8;

public class testeJogo8 {

	public static void main(String[] args) throws InterruptedException {
		jogo8 jogo = new jogo8();
		jogo.moverQuadrado("right");
		jogo.moverQuadrado("down");
		jogo.moverQuadrado("left");
		jogo.moverQuadrado("up");
		jogo.moverQuadrado("right");
		jogo.moverQuadrado("right");
		jogo.moverQuadrado("up");
		jogo.moverQuadrado("left");
		jogo.moverQuadrado("down");
		jogo.moverQuadrado("right");
		jogo.moverQuadrado("down");
		jogo.moverQuadrado("left");
		jogo.moverQuadrado("left");
		jogo.moverQuadrado("up");
		jogo.moverQuadrado("right");
		jogo.moverQuadrado("up");
		jogo.moverQuadrado("left");
		jogo.moverQuadrado("down");
		jogo.moverQuadrado("right");
		jogo.moverQuadrado("down");
		jogo.moverQuadrado("right");
		System.out.println("\nVenceu! Parabéns!");
	}
}