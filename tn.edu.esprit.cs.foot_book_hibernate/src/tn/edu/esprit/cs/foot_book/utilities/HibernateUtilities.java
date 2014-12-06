package tn.edu.esprit.cs.foot_book.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateUtilities {

	private SessionFactory sessionFactory;
	private Session session;
	private static HibernateUtilities instance;

	private HibernateUtilities() {
	}

	public Session getSession() {
		if (session == null) {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.getCurrentSession();
		}

		return session;
	}

	public static HibernateUtilities getInstance() {
		if (instance == null) {
			instance = new HibernateUtilities();

		}
		return instance;
	}

}
