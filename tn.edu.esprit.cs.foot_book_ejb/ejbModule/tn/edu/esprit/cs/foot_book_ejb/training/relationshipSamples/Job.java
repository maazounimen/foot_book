package tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Job
 *
 */
@Entity

public class Job implements Serializable {

	
	private int id;
	private String title;
	private static final long serialVersionUID = 1L;
	
	private Freelancer freelancer;

	public Job() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@ManyToOne
	public Freelancer getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}
   
}
