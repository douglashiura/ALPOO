package entities;

public class Jogador {
	private Integer id;
	private Integer idTabuleiro;
	private String nome;
	
	public Jogador(Integer idTabuleiro, String nome) {
		this.idTabuleiro = idTabuleiro;
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdTabuleiro() {
		return idTabuleiro;
	}
	public void setIdTabuleiro(Integer idTabuleiro) {
		this.idTabuleiro = idTabuleiro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Jogador [id=" + id + ", idTabuleiro=" + idTabuleiro + ", nome=" + nome + "]";
	}
}
