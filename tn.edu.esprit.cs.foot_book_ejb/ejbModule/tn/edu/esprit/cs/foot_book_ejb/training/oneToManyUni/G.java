package tn.edu.esprit.cs.foot_book_ejb.training.oneToManyUni;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: G
 * 
 */
@Entity
public class G implements Serializable {

	private int idG;
	private static final long serialVersionUID = 1L;

	private List<H> hs;

	public G() {
		super();
	}

	@Id
	public int getIdG() {
		return this.idG;
	}

	public void setIdG(int idG) {
		this.idG = idG;
	}

	@OneToMany
	public List<H> getHs() {
		return hs;
	}

	public void setHs(List<H> hs) {
		this.hs = hs;
	}

}
