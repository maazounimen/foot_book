package tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.services;

import javax.ejb.Remote;

import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Client;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.CreditCard;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Freelancer;

@Remote
public interface ClientServicesRemote {
	boolean saveClient(Client client);

	boolean saveCreditCard(CreditCard creditCard);

	boolean saveFreelancer(Freelancer freelancer);

	Freelancer findFreelancerById(int id);

}
