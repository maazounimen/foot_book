package tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Client;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.CreditCard;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Freelancer;

/**
 * Session Bean implementation class ClientServices
 * 
 * @author daly
 */
@Stateless
public class ClientServices implements ClientServicesRemote,
		ClientServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ClientServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean saveClient(Client client) {
		boolean b = false;
		try {
			entityManager.persist(client);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public boolean saveCreditCard(CreditCard creditCard) {
		boolean b = false;
		try {
			entityManager.persist(creditCard);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public boolean saveFreelancer(Freelancer freelancer) {
		boolean b = false;
		try {
			entityManager.persist(freelancer);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Freelancer findFreelancerById(int id) {
		Freelancer freelancerFound = null;
		try {
			freelancerFound = entityManager.find(Freelancer.class, id);
		} catch (Exception e) {
			System.err.println("freelancer not found ...");
		}

		return freelancerFound;
	}

}
