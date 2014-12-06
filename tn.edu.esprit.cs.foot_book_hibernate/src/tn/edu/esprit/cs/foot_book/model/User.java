package tn.edu.esprit.cs.foot_book.model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * @author bettaieb
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
