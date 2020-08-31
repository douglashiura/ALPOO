package br.ies.aula.alpoo.calculadora;

public class Calculadora {
 private Float resultado;
 private Float imparOuPar;
 
	public Float obterResultado() {		
		return resultado;	
	}

	public void soma(Integer parcelaA, Integer parcelaB) {
		resultado = Float.valueOf(parcelaA) + Float.valueOf(parcelaB);
	}  		
	
	public void multiplica(Integer parcelaA, Integer parcelaB) {
		resultado = Float.valueOf(parcelaA) * Float.valueOf(parcelaB);
	}
	
	public void divide(Float parcelaA, Float parcelaB) {
		if (parcelaA.equals(0)) {
			throw new ArithmeticException();
		}
		resultado = parcelaA / parcelaB;
		imparOuPar = parcelaA % parcelaB;
		
		if (imparOuPar == 0) {System.out.println("O numero é par.");}
		else {System.out.println("O numero é ímpar.");}
		
		
		}
		
	}

	

