package tn.edu.esprit.cs.foot_book_ejb.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
		User userFound = entityManager.find(User.class, id);
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
}
