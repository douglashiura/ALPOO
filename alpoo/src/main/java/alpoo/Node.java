package alpoo;

public class Node {

	public Node parent;
	public int[][] matrix;
	
	// Cooerdenadas de bloco em brancos
	public int x, y;
	
	// Numero de peças perdidas
	public int cost;
	
	// Quantidade de movimentos até agora
	public int level;
	
	public Node(int[][] matrix, int x, int y, int newX, int newY, int level, Node parent) {
		this.parent = parent;
		this.matrix = new int[matrix.length][];
		for (int i = 0; i < matrix.length; i++) {
			this.matrix[i] = matrix[i].clone();
		}
		
		// Valor da Troca
		this.matrix[x][y]       = this.matrix[x][y] + this.matrix[newX][newY];
		this.matrix[newX][newY] = this.matrix[x][y] - this.matrix[newX][newY];
		this.matrix[x][y]       = this.matrix[x][y] - this.matrix[newX][newY];
		
		this.cost = Integer.MAX_VALUE;
		this.level = level;
		this.x = newX;
		this.y = newY;
	}
	
}
