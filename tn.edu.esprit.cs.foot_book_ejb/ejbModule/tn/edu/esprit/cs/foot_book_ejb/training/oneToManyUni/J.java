package tn.edu.esprit.cs.foot_book_ejb.training.oneToManyUni;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: J
 * 
 */
@Entity
public class J implements Serializable {

	private int idJ;
	private static final long serialVersionUID = 1L;

	private I i;

	public J() {
		super();
	}

	@Id
	public int getIdJ() {
		return this.idJ;
	}

	public void setIdJ(int idJ) {
		this.idJ = idJ;
	}

	@ManyToOne
	public I getI() {
		return i;
	}

	public void setI(I i) {
		this.i = i;
	}

}
