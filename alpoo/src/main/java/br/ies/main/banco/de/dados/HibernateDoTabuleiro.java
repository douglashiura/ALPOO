package br.ies.main.banco.de.dados;

import org.hibernate.Session;

import br.ies.main.tabuleiro.Tabuleiro;

public class HibernateDoTabuleiro extends GerenciadorDoHibernate {
	
	public HibernateDoTabuleiro() {
		super();
	}
	
	public void inserirTabuleiro(Tabuleiro tabuleiro) {
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			session.persist(tabuleiro);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}
}
