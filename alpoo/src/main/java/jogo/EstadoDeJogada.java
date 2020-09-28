package jogo;

import java.sql.SQLException;

import jogo.entidades.Aposta;

public interface EstadoDeJogada {
	public void jogar(Aposta aposta) throws SQLException;
}
