package parimpar;

public class ParImpar {

	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		Jogador pc = new Jogador();

		jogador.setNome();
		pc.setNome("Computador");

		jogador.setEscolha();
		pc.setEscolha(jogador.getEscolha());

		jogador.setJogada();
		pc.setJogada((int) (Math.random() * 10));

		jogador.infoGanhador(pc.getNome(), pc.getJogada());

	}
}
// Faz tipo pedeEscolha() pedeJogada() pro jogador, sla, pra diferenciar o que é do pc e o que é do player.
