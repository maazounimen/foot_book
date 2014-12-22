package tn.edu.esprit.cs.foot_book_ejb.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.edu.esprit.cs.foot_book_ejb.model.User;

// TODO: Auto-generated Javadoc
/**
 * Entity implementation class for Entity: Player.
 */
@Entity

public class Player extends User implements Serializable {

	
	/** The account. */
	private String account;
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new player.
	 */
	public Player() {
		super();
	}   
	
	/**
	 * Gets the account.
	 *
	 * @return the account
	 */
	public String getAccount() {
		return this.account;
	}

	/**
	 * Sets the account.
	 *
	 * @param account the new account
	 */
	public void setAccount(String account) {
		this.account = account;
	}
   
}
