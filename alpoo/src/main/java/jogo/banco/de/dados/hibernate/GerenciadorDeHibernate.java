package jogo.banco.de.dados.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import jogo.entidades.Aposta;
import jogo.entidades.Vencedor;

public class GerenciadorDeHibernate {

	protected SessionFactory sessionFactory;
	private static GerenciadorDeHibernate instancia = new GerenciadorDeHibernate();

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
		configuration.addAnnotatedClass(Vencedor.class);
		StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder();
		StandardServiceRegistry abc = serviceRegistry.applySettings(properties).build();
		sessionFactory = configuration.buildSessionFactory(abc);
	}
	
	public static GerenciadorDeHibernate getInstancia() {
		return instancia;
	}

}
