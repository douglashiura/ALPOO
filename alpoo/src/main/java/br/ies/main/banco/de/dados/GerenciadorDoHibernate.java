package br.ies.main.banco.de.dados;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import br.ies.main.tabuleiro.Tabuleiro;

public class GerenciadorDoHibernate {
	protected SessionFactory session;
	private static GerenciadorDoHibernate instancia = new GerenciadorDoHibernate();

	public GerenciadorDoHibernate() {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(AvailableSettings.DRIVER, "org.postgresql.Driver");
		properties.put(AvailableSettings.URL, "jdbc:postgresql://localhost:5432/JogoDoOito");
		properties.put(AvailableSettings.USER, "postgres");
		properties.put(AvailableSettings.PASS, "Aloka@01");
		properties.put(AvailableSettings.HBM2DDL_AUTO, "validate");
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Tabuleiro.class);
		StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder();
		StandardServiceRegistry abc = serviceRegistry.applySettings(properties).build();
		setSession(configuration.buildSessionFactory(abc));
	}

	public static GerenciadorDoHibernate getInstancia() {
		return instancia;
	}

	public SessionFactory getSession() {
		return session;
	}

	public void setSession(SessionFactory session) {
		this.session = session;
	}
}
