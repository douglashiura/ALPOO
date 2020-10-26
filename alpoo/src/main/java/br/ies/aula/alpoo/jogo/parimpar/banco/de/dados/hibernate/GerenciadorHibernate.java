package br.ies.aula.alpoo.jogo.parimpar.banco.de.dados.hibernate;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;

public class GerenciadorHibernate {
	public GerenciadorHibernate() {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(AvailableSettings.DRIVER, "org.postgresql.Driver");
		properties.put(AvailableSettings.USER, "postgres");
		properties.put(AvailableSettings.PASS, "guidev87");
		properties.put(AvailableSettings.URL, "jdbc:postgresql://localhost:5432/app");
		properties.put(AvailableSettings.HBM2DDL_AUTO, "validate");

		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Aposta.class);

		StandardServiceRegistryBuilder serviceRegisterBuilder = new StandardServiceRegistryBuilder();
		StandardServiceRegistry service = serviceRegisterBuilder.applySettings(properties).build();

		sesssionFactory = configuration.buildSessionFactory(service);
	}

	public void inserir(Aposta aposta) {
		Session session = sesssionFactory.openSession();
		try {
			session.beginTransaction();
			session.persist(aposta);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
		
	}
}
