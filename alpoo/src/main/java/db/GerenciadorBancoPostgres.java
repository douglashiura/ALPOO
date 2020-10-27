package db;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import tabuleiro.Tabuleiro;
import tabuleiro.TabuleiroController;

public class GerenciadorBancoPostgres implements BancoDeDados{
	
	private SessionFactory sessionFactory;
	
	public GerenciadorBancoPostgres() {
		
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(AvailableSettings.DRIVER, "org.postgresql.Driver");
		properties.put(AvailableSettings.URL, "jdbc:postgresql://localhost:5432/APS");
		properties.put(AvailableSettings.USER, "postgres");
		properties.put(AvailableSettings.PASS, "Bernardo@1");
		properties.put(AvailableSettings.HBM2DDL_AUTO, "validate");
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Tabuleiro.class);
		StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder();
		StandardServiceRegistry abc = serviceRegistry.applySettings(properties).build();
		sessionFactory = configuration.buildSessionFactory(abc);
	
	}

	@Override
	public void insereNoBanco(Tabuleiro tab) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.persist();
			session.getTransaction().commit();
		} finally {
			session.close();
		}
		
	}

	@Override
	public void atualizaOBanco(TabuleiroController tab) {
		// TODO Auto-generated method stub
		
	}

}
