package tn.edu.esprit.cs.foot_book_ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}
