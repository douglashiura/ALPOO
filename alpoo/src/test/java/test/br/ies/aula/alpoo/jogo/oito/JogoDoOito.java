package test.br.ies.aula.alpoo.jogo.oito;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

	
public class JogoDoOito {
		//[0] = linha [1] = coluna.
		int [] posicaoZero = new int [2];
		int [][] matriz = new int [3][3];
		
		public JogoDoOito() {
			//aleatoriedade dos numeros
			Integer[] intArray = {0,1,2,3,4,5,6,7,8};

			List<Integer> intList = Arrays.asList(intArray);

			Collections.shuffle(intList);

			intList.toArray(intArray);
			
			int i = 0;
			
			//preenchimento da matriz
			for(int k=0; k < 3; k++) {
				for(int j=0; j<3; j++) {
					matriz[k][j] = intArray[i];
					if(intArray[i] == 0) {
						posicaoZero[0] = k;
						posicaoZero[1] = j;
					}
					i++;
				}
			}
		}
		
		public void imprimeMatriz() {
			
			for (int l = 0; l < matriz.length; l++)  {  
			       for (int c = 0; c < matriz[0].length; c++)     { 
			           System.out.print(matriz[l][c] + " ");
			       }  
			       System.out.println(" ");
			     }  
			System.out.println("\n");
		}
		
		public void moverCima(){
			if(posicaoZero[0] > 0) {
				int aux = matriz[posicaoZero[0] - 1][posicaoZero[1]];
				matriz[posicaoZero[0] - 1][posicaoZero[1]] = 0;
				matriz[posicaoZero[0]][posicaoZero[1]] = aux;
				posicaoZero[0] = posicaoZero[0] - 1;
			}
			this.imprimeMatriz();
		}
		
		public void moverBaixo() {
			if(posicaoZero[0] < 2) {
				int aux = matriz[posicaoZero[0] + 1][posicaoZero[1]];
				matriz[posicaoZero[0] + 1][posicaoZero[1]] = 0;
				matriz[posicaoZero[0]][posicaoZero[1]] = aux;
				posicaoZero[0] = posicaoZero[0] + 1;
			}
			this.imprimeMatriz();
		}
		
		public void moverEsquerda() {
			if(posicaoZero[1] > 0) {
				int aux = matriz[posicaoZero[0]][posicaoZero[1]-1];
				matriz[posicaoZero[0]][posicaoZero[1]-1] = 0;
				matriz[posicaoZero[0]][posicaoZero[1]] = aux;
				posicaoZero[1] = posicaoZero[1] - 1;
			}
			this.imprimeMatriz();
		}
		
		public void moverDireita() {
			if(posicaoZero[1] < 2) {
				int aux = matriz[posicaoZero[0]][posicaoZero[1]+1];
				matriz[posicaoZero[0]][posicaoZero[1]+1] = 0;
				matriz[posicaoZero[0]][posicaoZero[1]] = aux;
				posicaoZero[1] = posicaoZero[1] + 1;
			}
			this.imprimeMatriz();
		}
	}
