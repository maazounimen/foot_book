package tn.edu.esprit.cs.foot_book_ejb.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Stadium
 *
 */
@Entity

public class Stadium implements Serializable {

	
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Stadium() {
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
   
}
