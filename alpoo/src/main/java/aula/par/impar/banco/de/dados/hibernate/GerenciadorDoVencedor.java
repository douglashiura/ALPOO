package aula.par.impar.banco.de.dados.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import aula.par.impar.entidade.Vencedor;

public class GerenciadorDoVencedor {

	private SessionFactory sessionFactory;
	
	public GerenciadorDoVencedor(GerenciadorDoHibernate hibernate) {
		sessionFactory = hibernate.getSessionFactory();
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
	
	public void atualizar(Vencedor vencedor) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.merge(vencedor);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}
	
}
