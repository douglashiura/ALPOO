package br.ies.aula.alpoo.calculadora;

import java.util.HashMap;

public class Calculadora {
	
	HashMap<String, Operação> operacoes;

	public Calculadora() {
		operacoes = new HashMap<String, Operação>();
		operacoes.put("/", new Divisao());
		operacoes.put("*", new Multiplicacao());
	}

	long calcular(String operacao, long x, long y) {
		return operacoes.get(operacao).calcular(x, y);
	}
}
