package tn.edu.esprit.cs.foot_book_ejb.training.oneToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: E
 *
 */
@Entity

public class E implements Serializable {

	
	private int idE;
	private static final long serialVersionUID = 1L;
	
	private List<F> fs;

	public E() {
		super();
	}   
	@Id    
	public int getIdE() {
		return this.idE;
	}

	public void setIdE(int idE) {
		this.idE = idE;
	}
	@OneToMany(mappedBy="e")
	public List<F> getFs() {
		return fs;
	}
	public void setFs(List<F> fs) {
		this.fs = fs;
	}
   
}
