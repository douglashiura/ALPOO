package br.ies.aula.alpoo.oddEven;

public class OddEven {
	private Integer firstNum;
	private Integer secondNum;
	
	public OddEven() {	
	}
	
	public Integer getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(Integer num) {
		this.firstNum = num;
	}
	public Integer getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(Integer num) {
		this.secondNum = num;
	}
	public String evaluate() {
		if ((getFirstNum() + getSecondNum()) % 2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	

}
