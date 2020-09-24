package aula.heranca;

public class Aluno extends Pessoa {

	Aluno(String nome, Integer idade) {
		super(ajustaNome(nome), idade);
		
	}

	private static String ajustaNome(String nome) {
		return nome = nome + "abc";
		
	}

	public static void main(String[] args) {
		Aluno teste = new Aluno("Teste", 20);
		System.out.println(teste.getNome());
		
	}

	
}
