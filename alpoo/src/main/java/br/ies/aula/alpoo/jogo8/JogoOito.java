package br.ies.aula.alpoo.jogo8;

public class JogoOito {
	
	private int[][] positions;
	private int line;
	private int column;
	
	public JogoOito() {
		this.positions = new int[][] {{2,5,3}, {3,0,1}, {8,6,7}};
		this.column = 0;
		this.line = 1;
	}
	
	public void createBoard() {
		System.out.println(this.positions[0][0]);
	}	
		
	public void moveUp() {
		
	}

	public void moveDown() {
		
	}

	public void moveLeft() {
		
	}

	public void moveRight() {
		
	}

}
