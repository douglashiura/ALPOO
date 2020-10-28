package aula.par.impar.banco.de.dados.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import aula.par.impar.entidade.Aposta;

public class GerenciadorDaAposta {
	
	private SessionFactory sessionFactory;
	
	public GerenciadorDaAposta(GerenciadorDoHibernate hibernate) {
		sessionFactory = hibernate.getSessionFactory();
	}

	public void inserir(Aposta aposta) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.persist(aposta);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}
	
	public void atualizar(Aposta aposta) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.merge(aposta);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}
	
	/*
	public List<Aposta> pegarApostas(Aposta aposta) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			String queryString = "SELECT * FROM aposta";
			List<Aposta> apostas = session.createQuery(queryString, Aposta.class).getResultList();
			session.getTransaction().commit();
			return apostas;
		} finally {
			session.close();
		}
	}
	
	
	public List<Aposta> pegarApostas(Aposta aposta) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			String queryString = "SELECT * FROM aposta";
			List<Aposta> apostas = session.createQuery(queryString, Aposta.class).setParameter("limite", 20).getResultList();
			session.getTransaction().commit();
			return apostas;
		} finally {
			session.close();
		}
	}
	*/
}
