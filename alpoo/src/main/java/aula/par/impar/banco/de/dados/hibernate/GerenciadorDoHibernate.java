package aula.par.impar.banco.de.dados.hibernate;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import aula.par.impar.entidade.Aposta;

public class GerenciadorDoHibernate {

	private SessionFactory sessionFactory;

	public GerenciadorDoHibernate() {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(AvailableSettings.DRIVER, "org.postgresql.Driver");
		properties.put(AvailableSettings.USER, "postgres");
		properties.put(AvailableSettings.PASS, "9922");
		properties.put(AvailableSettings.URL, "jdbc:postgresql://localhost:5432/app");
		properties.put(AvailableSettings.HBM2DDL_AUTO, "validate");
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Aposta.class);
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		StandardServiceRegistry service = serviceRegistryBuilder.applySettings(properties).build();
		sessionFactory = configuration.buildSessionFactory(service);
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
	
	public List<Aposta> pegarApostasMaiorQueVinte(Aposta aposta) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			String queryString = "SELECT aposta FROM Aposta WHERE aposta.id > :limite";
			List<Aposta> apostas = session.createQuery(queryString, Aposta.class).setParameter("limite", 20).getResultList();
			session.getTransaction().commit();
			return apostas;
		} finally {
			session.close();
		}
	}
	
}
