package tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Client;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.CreditCard;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Freelancer;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Job;

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

	@Override
	public List<Job> findAllJobsByFreelancerId(int id) {
		List<Job> jobs = null;
		String jpql = "select j from Job j where j.freelancer.id=" + id;
		Query query = entityManager.createQuery(jpql);
		try {
			jobs = query.getResultList();
		} catch (Exception e) {
			System.err.println("jobs not found ...");
		}
		return jobs;
	}

}
