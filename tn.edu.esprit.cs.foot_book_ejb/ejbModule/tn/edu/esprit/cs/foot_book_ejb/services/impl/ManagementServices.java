package tn.edu.esprit.cs.foot_book_ejb.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.cs.foot_book_ejb.model.Stadium;
import tn.edu.esprit.cs.foot_book_ejb.model.User;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesLocal;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesRemote;

@Stateless
public class ManagementServices implements ManagementServicesRemote,
		ManagementServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void sayAhla(String name) {
		System.out.println("ahla w sahla : " + name);

	}

	@Override
	public boolean save(User user) {
		boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public User findUserById(int id) {
		User userFound = null;
		try {
			userFound = entityManager.find(User.class, id);
		} catch (Exception e) {
			System.err.println("user not found ...");
		}

		return userFound;
	}

	@Override
	public boolean updateUser(User user) {
		boolean b = false;
		try {
			entityManager.merge(user);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public boolean deleteUserById(int id) {
		boolean b = false;
		try {
			entityManager.remove(findUserById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<User> findAllUsers() {
		String jpql = "select u from User u";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public boolean saveStadium(Stadium stadium) {
		boolean b = false;
		try {
			entityManager.persist(stadium);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public boolean updateStadium(Stadium stadium) {
		boolean b = false;
		try {
			entityManager.merge(stadium);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public boolean deleteStadiumById(int id) {
		boolean b = false;
		try {
			entityManager.remove(findStadiumById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Stadium findStadiumById(int id) {
		return entityManager.find(Stadium.class, id);
	}

	@Override
	public List<Stadium> findAllStadiums() {
		String jpql = "select s from Stadium s ";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}
}
