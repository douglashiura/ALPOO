package br.ies.main.banco.de.dados;

import org.hibernate.Session;

import br.ies.main.entidades.Pessoa;
import br.ies.main.tabuleiro.Tabuleiro;

public class HibernateDaPessoa extends GerenciadorDoHibernate {

	public HibernateDaPessoa() {
		super();
	}

	public void inserirPessoa(Tabuleiro tabuleiro) {
		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.persist(tabuleiro);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

	public Pessoa acharPessoa(Pessoa pessoa) {
		try {

		} finally {

		}
		return new Pessoa();
	}
}
