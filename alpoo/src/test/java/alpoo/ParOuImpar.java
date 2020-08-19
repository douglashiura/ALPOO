package alpoo;

public class ParOuImpar {
	
	public String retornaResultado(int n1, int n2) {
		String resultado = "";
		 
		if((n1 + n2) % 2 == 0) {
			resultado = "É par!";
			return resultado;
		}
		
		resultado = "É impar!";
		return resultado;
	}
}
