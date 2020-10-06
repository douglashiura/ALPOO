package br.ies.aula.alpoo.EvenOrODD.models;

import java.util.LinkedList;

public interface ResultListener {
	void notify(GameResults result, LinkedList<Bet> winners);
}
