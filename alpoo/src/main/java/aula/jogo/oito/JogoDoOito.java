package aula.jogo.oito;

public class JogoDoOito {

	private static Integer[][] arrayJogo = new Integer[3][3];
	
	//Criar o Jogo
	public JogoDoOito(Integer x) {
		for(Integer i=0; i<=2; i++) {
			for(Integer j=0; j<=2; j++) {
				if(i == 2 && j == 2) {
					x=0;
				}
				arrayJogo[i][j] = x;
				x--;
			}
		}
		
	}
	
	public Integer[] getZero() {
		Integer[] result = new Integer[2];
		for(Integer i=0; i<=2; i++) {
			for(Integer j=0; j<=2; j++) {
				if(arrayJogo[i][j] == 0) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
	}
	
	//Jogadas
	public void moverCima() {
		Integer[] zeroArray = this.getZero();
		Integer i = zeroArray[0];
		Integer j = zeroArray[1];
		Integer memoria = 0;
		
		i--;
		memoria = arrayJogo[i][j];
		arrayJogo[i][j] = 0;
		i++;
		arrayJogo[i][j] = memoria;
		
	}
	
	public void moverBaixo() {
		Integer[] zeroArray = this.getZero();
		Integer i = zeroArray[0];
		Integer j = zeroArray[1];
		Integer memoria = 0;
		
		i++;
		memoria = arrayJogo[i][j];
		arrayJogo[i][j] = 0;
		i--;
		arrayJogo[i][j] = memoria;
	}
	
	public void moverEsquerda() {
		Integer[] zeroArray = this.getZero();
		Integer i = zeroArray[0];
		Integer j = zeroArray[1];
		Integer memoria = 0;
		
		j--;
		memoria = arrayJogo[i][j];
		arrayJogo[i][j] = 0;
		j++;
		arrayJogo[i][j] = memoria;
	}
	
	public void moverDireita() {
		Integer[] zeroArray = this.getZero();
		Integer i = zeroArray[0];
		Integer j = zeroArray[1];
		Integer memoria = 0;
		
		j++;
		memoria = arrayJogo[i][j];
		arrayJogo[i][j] = 0;
		j--;
		arrayJogo[i][j] = memoria;
	}
	
	//Printar o jogo
	public void showGame() {
		for(Integer i=0; i<=2; i++) {
			for(Integer j=0; j<=2; j++) {
				System.out.print(arrayJogo[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public Integer[][] getArray(){
		return arrayJogo;
	}
}
