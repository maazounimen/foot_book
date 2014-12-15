package tn.edu.esprit.cs.foot_book_ejb.training.oneToManyUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: One
 *
 */
@Entity

public class One implements Serializable {

	
	private int idOne;
	private static final long serialVersionUID = 1L;

	public One() {
		super();
	}   
	@Id    
	public int getIdOne() {
		return this.idOne;
	}

	public void setIdOne(int idOne) {
		this.idOne = idOne;
	}
   
}
