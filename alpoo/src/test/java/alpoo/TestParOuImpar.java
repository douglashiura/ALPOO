package alpoo;
import java.util.Scanner;

import org.junit.Test;
public class TestParOuImpar {

	private ParOuImpar parOuImpar = new ParOuImpar();
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);

	@Test
	public void run() {
		try {
			System.out.println("digite o primeiro numero");
			int n1 = s1.nextInt();

			System.out.println("digite o segundo numero");
			int n2 = s2.nextInt();
			System.out.println(parOuImpar.retornaResultado(n1 , n2));

		}catch (Exception e) {
			System.err.println("você não digitou um número! resete o programa");
		}
		s1.close();
		s2.close();
	}
}
