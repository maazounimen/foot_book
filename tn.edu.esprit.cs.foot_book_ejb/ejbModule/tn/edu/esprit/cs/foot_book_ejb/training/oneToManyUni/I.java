package tn.edu.esprit.cs.foot_book_ejb.training.oneToManyUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: I
 *
 */
@Entity

public class I implements Serializable {

	
	private int idI;
	private static final long serialVersionUID = 1L;

	public I() {
		super();
	}   
	@Id    
	public int getIdI() {
		return this.idI;
	}

	public void setIdI(int idI) {
		this.idI = idI;
	}
   
}
