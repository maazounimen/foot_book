package tn.edu.esprit.cs.foot_book_ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.cs.foot_book_ejb.model.User;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.BookingServicesLocal;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.BookingServicesRemote;

/**
 * Session Bean implementation class BookingServices
 */
@Stateless
public class BookingServices implements BookingServicesRemote,
		BookingServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public BookingServices() {
	}

	@Override
	public User identify(String login, String password) {
		User userFound = null;
		String jpql = "select u from User u where u.login='" + login
				+ "' and u.password='" + password + "' ";
		Query query = entityManager.createQuery(jpql);
		try {
			System.out.println(query);
			userFound = (User) query.getSingleResult();
		} catch (Exception e) {
			System.err.println("user not found");
		}
		return userFound;
	}

}
