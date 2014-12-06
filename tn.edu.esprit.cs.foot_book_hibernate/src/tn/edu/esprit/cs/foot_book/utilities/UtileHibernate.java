package tn.edu.esprit.cs.foot_book.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class UtileHibernate {

	private SessionFactory sessionFactory;
	private Session session;
	private static UtileHibernate instance;

	private UtileHibernate() {
	}

	public Session getSession() {
		if (session == null) {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.getCurrentSession();
		}

		return session;
	}

	public static UtileHibernate getInstance() {
		if (instance == null) {
			instance = new UtileHibernate();

		}
		return instance;
	}

}
