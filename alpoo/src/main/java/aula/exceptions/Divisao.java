package aula.exceptions;

public class Divisao extends Operacao {

	@Override
	public Integer calcular(Integer x, Integer y) {
		try {
			return x / y;
		}catch(Exception e) {
			System.out.println("Dividido Por 0");
			return 0;
		}
	}
	
}
