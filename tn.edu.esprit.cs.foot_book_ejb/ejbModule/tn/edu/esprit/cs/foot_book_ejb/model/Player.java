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

	
	private String typeAccount;
	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}   
	public String getTypeAccount() {
		return this.typeAccount;
	}

	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}
   
}
