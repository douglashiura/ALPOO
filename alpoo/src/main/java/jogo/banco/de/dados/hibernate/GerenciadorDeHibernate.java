package jogo.banco.de.dados.hibernate;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import jogo.entidades.Aposta;

public class GerenciadorDeHibernate {

	private SessionFactory sessionFactory;

	public GerenciadorDeHibernate() {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(AvailableSettings.DRIVER, "org.postgresql.Driver");
		properties.put(AvailableSettings.URL, "jdbc:postgresql://localhost:5432/JogoImparPar");
		properties.put(AvailableSettings.USER, "postgres");
		properties.put(AvailableSettings.PASS, "Aloka@01");
		properties.put(AvailableSettings.HBM2DDL_AUTO, "validate");
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Aposta.class);
		StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder();
		StandardServiceRegistry abc = serviceRegistry.applySettings(properties).build();
		sessionFactory = configuration.buildSessionFactory(abc);
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
