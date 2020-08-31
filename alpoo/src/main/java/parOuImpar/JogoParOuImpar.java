package parOuImpar;

public class JogoParOuImpar {

	//Resultado Provisório
	public Boolean resultado(Integer player1, Integer player2) {
	
		if((player1 + player2) % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
