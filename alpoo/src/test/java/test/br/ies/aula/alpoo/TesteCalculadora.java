package test.br.ies.aula.alpoo;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class TesteCalculadora {	
	
	private Calculadora calculadora;
	Scanner scan = new Scanner(System.in);

	@Before
	public void setUp() {
		calculadora  = new Calculadora();
	}
	
	@Test
	public void somaComResultado3() {		
		calculadora.soma(2,1);
		assertEquals(Integer.valueOf(3),calculadora.obterResultado());
	}
	
	@Test
	public void somaComResultado2() throws Exception {
		calculadora.soma(1, 1);
		assertEquals(Integer.valueOf(2),calculadora.obterResultado());
	}
	
	@Test
	public void multiplicacaoComResultado4() {
		calculadora.multiplicacao(2, 2);
		assertEquals(Integer.valueOf(4),calculadora.obterResultado());
	}
	
	@Test
	public void divisaoComResultado5() {
		calculadora.divisao(10, 2);
		assertEquals(Integer.valueOf(5),calculadora.obterResultado());
	}
	
	@Test
	public void ParImpar() {
		int primNum,segunNum;
		primNum = scan.nextInt();
		segunNum = scan.nextInt();
		
		calculadora.soma(primNum, segunNum);
		
		if (calculadora.obterResultado() % 2 == 0) {
			System.out.println("É par");
		}
		else {
			System.out.println("É impar");
		}		
	}
}
