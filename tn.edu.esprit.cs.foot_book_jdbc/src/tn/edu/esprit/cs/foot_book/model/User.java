package tn.edu.esprit.cs.foot_book.model;

import java.io.Serializable;

/**
 * @author bettaieb The Class User.
 */
public class User implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/**
	 * Instantiates a new user.
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new user.
	 * 
	 * @param name
	 *            the name
	 */
	public User(String name) {
		super();
		this.name = name;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
