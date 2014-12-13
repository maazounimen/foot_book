package tn.edu.esprit.cs.foot_book_ejb.training.oneToOneBi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: B
 * 
 */
@Entity
public class B implements Serializable {

	private int idB;
	private static final long serialVersionUID = 1L;

	private A a;

	public B() {
		super();
	}

	@Id
	public int getIdB() {
		return this.idB;
	}

	public void setIdB(int idB) {
		this.idB = idB;
	}

	@OneToOne(mappedBy="b")
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

}
