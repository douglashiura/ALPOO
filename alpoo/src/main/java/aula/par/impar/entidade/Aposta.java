package aula.par.impar.entidade;

public class Aposta {
	private Integer valor;
	private String nome;
	private ResultadosDoJogoParImpar aposta;
	private Integer id;

	public Aposta(Integer valor) {
		this.valor = valor;
	}

	public Aposta(String nome, ResultadosDoJogoParImpar aposta, Integer valor) {
		this.nome = nome;
		this.aposta = aposta;
		this.valor = valor;
	}

	//Getters
	public Integer getValor() {
		return valor;
	}

	public ResultadosDoJogoParImpar getAposta() {
		return aposta;
	}

	public String getNome() {
		return nome;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
