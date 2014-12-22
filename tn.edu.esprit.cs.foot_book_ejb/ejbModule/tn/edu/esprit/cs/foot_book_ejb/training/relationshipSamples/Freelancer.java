package tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Freelancer
 * 
 */
@Entity
public class Freelancer implements Serializable {

	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	private List<Job> jobs;

	public Freelancer() {
		super();
	}

	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "freelancer", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public void linkJobsToThisFreelancer(List<Job> jobs) {
		this.jobs = jobs;
		for (Job j : jobs) {
			j.setFreelancer(this);
		}
	}

}
