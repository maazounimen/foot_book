package tn.edu.esprit.cs.foot_book_ejb.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.edu.esprit.cs.foot_book_ejb.model.User;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity

public class Player extends User implements Serializable {

	
	private String account;
	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}   
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
   
}
