package br.ies.aula.alpoo.oddEven;

import java.util.Scanner;

public class OddEven {
	private Integer num1;
	private Integer num2;
	private Integer result;
	private Scanner scanner = new Scanner(System.in);
	
	public OddEven() {
		System.out.println("Digite o primeiro número:");
		setNum1(scanner.nextInt());
		System.out.println("Digite o segundo número:");
		setNum2(scanner.nextInt());
		evaluate();
		if (getResult() == 0) {
			System.out.println("O resultado é Par");
		}else {
			System.out.println("O resultado é Ímpar");
		}
		scanner.close();
	}
	
	public Integer getNum1() {
		return num1;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	public Integer getNum2() {
		return num2;
	}
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	public Integer evaluate() {
		setResult((getNum1() + getNum2()) % 2);
		return getResult();
	}
	

}
