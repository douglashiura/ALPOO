package jogo.banco.de.dados.hibernate;

import org.hibernate.Session;

import jogo.entidades.Vencedor;

public class HibernateVencedor extends GerenciadorDeHibernate {
	public HibernateVencedor() {
		super();
	}

	public void inserir(Vencedor vencedor) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.persist(vencedor);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

}
