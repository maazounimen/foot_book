package tn.edu.esprit.cs.foot_book_ejb.training.oneToManyUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tow
 *
 */
@Entity

public class Tow implements Serializable {

	
	private int idTow;
	private static final long serialVersionUID = 1L;
	
	private One one;

	public Tow() {
		super();
	}   
	@Id    
	public int getIdTow() {
		return this.idTow;
	}

	public void setIdTow(int idTow) {
		this.idTow = idTow;
	}
	public One getOne() {
		return one;
	}
	public void setOne(One one) {
		this.one = one;
	}
   
}
