package aula.exceptions;

import java.util.HashMap;

public class Calculadora {
	private Integer result = Integer.valueOf(0);
	HashMap<String, Operacao> mapaOperacoes;
	
	public Calculadora(){
		mapaOperacoes = new HashMap<String, Operacao>();
		mapaOperacoes.put("+", new Soma());
		mapaOperacoes.put("-", new Subtracao());
		mapaOperacoes.put("*", new Multiplicacao());
		mapaOperacoes.put("/", new Divisao());
	}
	
	public void calcular(String operacao, Integer x, Integer y) throws Exception {
		this.setRes(mapaOperacoes.get(operacao).calcular(x, y));
	}
	
	public void setRes(Integer x) {
		result = x;
	}
	
	public Integer getRes() {
		return result;
	}
}
