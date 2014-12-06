package tn.edu.esprit.cs.foot_book.dao.impl;

import org.hibernate.Session;

import tn.edu.esprit.cs.foot_book.dao.interfaces.IUserDao;
import tn.edu.esprit.cs.foot_book.model.User;
import tn.edu.esprit.cs.foot_book.utilities.HibernateUtilities;

public class UserDao implements IUserDao {
	private Session session = HibernateUtilities.getInstance().getSession();

	@Override
	public boolean addUser(User user) {
		boolean b = false;
		try {
			session.getTransaction().begin();
			session.persist(user);
			session.getTransaction().commit();

			b = true;
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		return b;
	}

}
