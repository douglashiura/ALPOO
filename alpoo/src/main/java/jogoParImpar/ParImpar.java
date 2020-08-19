package jogoParImpar;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		ler();
	}

	public static void ler() {
		int n1 = 0;
		int n2 = 0;
		
		Scanner myObj = new Scanner(System.in);  

		System.out.println("ENTER NUMBER ONE:");
		String num1 = myObj.nextLine(); 
		
		System.out.println("ENTER NUMBER TWO:");
		String num2 = myObj.nextLine();
		myObj.close();
		
		n1 = Integer.parseInt(num1);
		if(n1%2==0) {

			System.out.println(("PAR:" +  n1));
		}
		else {
			System.out.println("IMPAR: " + n1);
		}
		n2 = Integer.parseInt(num2);
		
		if(n1%2==0) {

			System.out.println(("PAR:" +  n2));
		}
		else {
			System.out.println("IMPAR: " + n2);
		}
	}
}