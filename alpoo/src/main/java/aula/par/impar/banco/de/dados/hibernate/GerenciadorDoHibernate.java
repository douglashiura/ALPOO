package aula.par.impar.banco.de.dados.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.Vencedor;

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
		configuration.addAnnotatedClass(Vencedor.class);
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		StandardServiceRegistry service = serviceRegistryBuilder.applySettings(properties).build();
		sessionFactory = configuration.buildSessionFactory(service);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
