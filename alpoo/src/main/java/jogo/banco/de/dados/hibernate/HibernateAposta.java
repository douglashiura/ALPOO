package jogo.banco.de.dados.hibernate;

import java.util.List;

import org.hibernate.Session;

import jogo.entidades.Aposta;

public class HibernateAposta extends GerenciadorDeHibernate {
	public HibernateAposta() {
		super();
		
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
	
	public List<Aposta> atualizar(Aposta aposta) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.merge(aposta);
			String queryString = "SELECT aposta.valor FROM aposta WHERE aposta.id > :limite";
			List<Aposta> apostas = session.createQuery(queryString, Aposta.class).setParameter("limite", 20).getResultList();
			session.getTransaction().commit();
			return apostas;
		} finally {
			session.close();
		}
	}
	
	public void deletar(Aposta aposta) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.remove(aposta);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}
}
