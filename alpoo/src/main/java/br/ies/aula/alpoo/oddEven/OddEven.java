package br.ies.aula.alpoo.oddEven;

public class OddEven {
	private Integer num1;
	private Integer num2;
	
	public OddEven() {	
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
	public String evaluate() {
		if ((getNum1() + getNum2()) % 2 == 0) {
			return "Par";
		}else {
			return "Ímpar";
		}
	}
	

}
