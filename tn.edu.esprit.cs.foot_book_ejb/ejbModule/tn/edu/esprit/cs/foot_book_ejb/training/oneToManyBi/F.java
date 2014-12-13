package tn.edu.esprit.cs.foot_book_ejb.training.oneToManyBi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: F
 * 
 */
@Entity
public class F implements Serializable {

	private int idF;
	private static final long serialVersionUID = 1L;

	private E e;

	public F() {
		super();
	}

	@Id
	public int getIdF() {
		return this.idF;
	}

	public void setIdF(int idF) {
		this.idF = idF;
	}

	@ManyToOne
	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

}
