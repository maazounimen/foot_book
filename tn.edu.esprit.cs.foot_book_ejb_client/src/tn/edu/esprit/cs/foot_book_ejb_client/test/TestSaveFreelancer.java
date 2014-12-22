package tn.edu.esprit.cs.foot_book_ejb_client.test;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Freelancer;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Job;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.services.ClientServicesRemote;

public class TestSaveFreelancer {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/ClientServices!"
					+ ClientServicesRemote.class.getCanonicalName();
			ClientServicesRemote proxy = (ClientServicesRemote) context
					.lookup(jndiName);

			Freelancer freelancer = new Freelancer();
			freelancer.setId(1);
			freelancer.setName("foulen");

			Job job = new Job();
			job.setId(1);
			job.setTitle("job one");

			List<Job> jobs = new ArrayList<>();
			jobs.add(job);

			freelancer.linkJobsToThisFreelancer(jobs);

			proxy.saveFreelancer(freelancer);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
