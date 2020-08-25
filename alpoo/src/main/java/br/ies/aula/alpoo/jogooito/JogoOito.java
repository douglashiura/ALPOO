package br.ies.aula.alpoo.jogooito;


public class JogoOito {
	Integer[][] array1 = {
			{Integer.valueOf(1),Integer.valueOf(3),Integer.valueOf(4)},
			{Integer.valueOf(8),Integer.valueOf(6),Integer.valueOf(2)},
			{Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(5)}
	};
	AchaEspacoVazio finder = new AchaEspacoVazio();
	int arrayX,arrayY;
	Integer temp;

	public void Start() {
		
	}
	
	public void MoveUp() {
		finder.FindBlankSpace(array1);
		arrayX = finder.getVar1();
		arrayY = finder.getVar2();
		
		if (arrayX != 0) {
			temp = array1[arrayX - 1][arrayY];
			array1[arrayX][arrayY] = temp;
			array1[arrayX - 1][arrayY] = Integer.valueOf(0);
		}
		else System.out.println("Não da pra mover pra cima");
	}	
	
	public void MoveDown() {
		finder.FindBlankSpace(array1);
		arrayX = finder.getVar1();
		arrayY = finder.getVar2();
		
		if (arrayX != 2) {
			temp = array1[arrayX + 1][arrayY];
			array1[arrayX][arrayY] = temp;
			array1[arrayX + 1][arrayY] = Integer.valueOf(0);
		}
		
		else System.out.println("Não dá para mover pra baixo");
	}	
	
	public void MoveLeft() {
		finder.FindBlankSpace(array1);
		arrayX = finder.getVar1();
		arrayY = finder.getVar2();
		
		if (arrayY != 0) {
			temp = array1[arrayX][arrayY - 1];
			array1[arrayX][arrayY] = temp;
			array1[arrayX][arrayY - 1] = Integer.valueOf(0);
		}
		else System.out.println("Não da pra mover pra esquerda");
	}
	
	public void MoveRight() {
		finder.FindBlankSpace(array1);
		arrayX = finder.getVar1();
		arrayY = finder.getVar2();
		
		if (arrayY != 2) {
		temp = array1[arrayX][arrayY + 1];
		array1[arrayX][arrayY] = temp;
		array1[arrayX][arrayY + 1] = Integer.valueOf(0);
		}
		else System.out.println("Não da pra mover pra direita");
	}
	
	public void MostrarQuadro() {
		for (int i = 0; i <= 2; i++ ) {
			for (int j = 0; j <= 2; j++) {
				if (j == 2) {
					System.out.println(array1[i][j]);
				}
				else System.out.print(array1[i][j]);
			}
		}
	}
	
	
	
}