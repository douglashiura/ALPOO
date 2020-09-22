package entidade;

public class Aposta {

	private Integer valor;
	private String nome;
	private ResultadoDoJogoParImpar aposta;

	public Aposta(String nome, ResultadoDoJogoParImpar aposta, Integer valor) {
		this.nome = nome;
		this.aposta = aposta;
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}

	public ResultadoDoJogoParImpar getAposta() {
		return aposta;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return nome;
	}

}
