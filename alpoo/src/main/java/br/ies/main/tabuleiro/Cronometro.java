package br.ies.main.tabuleiro;

import java.sql.Timestamp;

public class Cronometro {

	private Timestamp relogio;
	private long tempo;
	private static Cronometro instancia = new Cronometro();

	public Cronometro() {
		relogio = new Timestamp(System.currentTimeMillis());
	}

	public void parar() {
		tempo = (System.currentTimeMillis() - relogio.getTime()) / 1000;
	}

	public void iniciar() {
		relogio = new Timestamp(System.currentTimeMillis());
	}

	public long getTempo() {
		return tempo;
	}

	public static Cronometro getInstancia() {
		return instancia;
	}
}