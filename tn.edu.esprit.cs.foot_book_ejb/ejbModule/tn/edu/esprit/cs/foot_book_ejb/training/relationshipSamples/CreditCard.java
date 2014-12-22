package tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: CreditCard
 * 
 */
@Entity
public class CreditCard implements Serializable {

	private int id;
	private String typeCard;
	private static final long serialVersionUID = 1L;

	private Client client;

	public CreditCard() {
		super();
	}

	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeCard() {
		return this.typeCard;
	}

	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}

	@OneToOne(mappedBy = "creditCard", cascade = CascadeType.PERSIST)
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void linkClientToThisCreditCard(Client client) {
		this.client = client;
		client.setCreditCard(this);
	}

}
