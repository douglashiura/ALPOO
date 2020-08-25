package br.ies.aula.alpoo.jogooito;

public class AchaEspacoVazio {
	Integer array1[][] = new Integer[3][3];
	int Var1,Var2;
	
	public void FindBlankSpace(Integer array1[][]) {
		for (int i = 0; i <= 2; i++ ) {
			for (int j = 0; j <= 2; j++) {
				if (array1[i][j].equals(Integer.valueOf(0))) {
					Var1 = i;
					Var2 = j;
				}
			}
		}
	}

	public int getVar1() {
		return Var1;
	}

	public int getVar2() {
		return Var2;
	}
	
}
