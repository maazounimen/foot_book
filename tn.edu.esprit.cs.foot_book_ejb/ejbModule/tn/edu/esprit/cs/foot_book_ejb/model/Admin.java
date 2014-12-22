package tn.edu.esprit.cs.foot_book_ejb.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.edu.esprit.cs.foot_book_ejb.model.User;


/**
 * Entity implementation class for Entity: Admin.
 */
@Entity

public class Admin extends User implements Serializable {

	
	/** The access level. */
	private String accessLevel;
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new admin.
	 */
	public Admin() {
		super();
	}   
	
	/**
	 * Gets the access level.
	 *
	 * @return the access level
	 */
	public String getAccessLevel() {
		return this.accessLevel;
	}

	/**
	 * Sets the access level.
	 *
	 * @param accessLevel the new access level
	 */
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
   
}
