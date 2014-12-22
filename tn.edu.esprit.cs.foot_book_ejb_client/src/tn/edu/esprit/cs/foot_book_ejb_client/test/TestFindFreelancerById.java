package tn.edu.esprit.cs.foot_book_ejb_client.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Freelancer;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.services.ClientServicesRemote;

public class TestFindFreelancerById {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/ClientServices!"
					+ ClientServicesRemote.class.getCanonicalName();
			ClientServicesRemote proxy = (ClientServicesRemote) context
					.lookup(jndiName);

			Freelancer freelancer = proxy.findFreelancerById(1);

			System.out.println(freelancer.getJobs().size());

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
