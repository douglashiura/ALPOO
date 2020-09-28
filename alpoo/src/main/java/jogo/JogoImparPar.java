package jogo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ies.aula.alpoo.calculadora.Calculadora;
import jogo.banco.de.dados.BancoDeDadosParImparVencedor;
import jogo.entidades.Aposta;
import jogo.entidades.Vencedor;

public class JogoImparPar {
	private List<Aposta> jogadoresPar;
	private List<Aposta> jogadoresImpar;

	public JogoImparPar() {
		jogadoresPar = new ArrayList<Aposta>();
		jogadoresImpar = new ArrayList<Aposta>();
	}
	
	public List<Aposta> calculo(Aposta primeiraAposta, Aposta segundaAposta) throws SQLException {
		
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.soma(primeiraAposta.getValor(), segundaAposta.getValor());

		this.organizarApostas(primeiraAposta);
		this.organizarApostas(segundaAposta);

		if (ePar(resultado)) {
			inserirNoBancoDeDados(jogadoresPar);
			return jogadoresPar;
		} else {
			inserirNoBancoDeDados(jogadoresImpar);
			return jogadoresImpar;
		}

	}

	private void inserirNoBancoDeDados(List<Aposta> aposta) throws SQLException {
		for (Aposta x : aposta) {
			new BancoDeDadosParImparVencedor().inserir(new Vencedor(x));
		}
	}

	public void organizarApostas(Aposta aposta) {
		if (aposta.getAposta() == ResultadosDoJogoImparPar.PAR) {
			jogadoresPar.add(aposta);
		} else {
			jogadoresImpar.add(aposta);
		}
	}

	public Boolean ePar(Integer x) {
		return x % 2 == 0;
	}

}