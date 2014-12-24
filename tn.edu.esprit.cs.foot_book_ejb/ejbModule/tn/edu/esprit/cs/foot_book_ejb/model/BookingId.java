package tn.edu.esprit.cs.foot_book_ejb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class BookingId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUser;
	private int idStadium;
	private Date date;

	public BookingId() {
		// TODO Auto-generated constructor stub
	}

	public BookingId(Date date, int idUser, int idStadium) {
		super();
		this.idUser = idUser;
		this.idStadium = idStadium;
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + idStadium;
		result = prime * result + idUser;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingId other = (BookingId) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idStadium != other.idStadium)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdStadium() {
		return idStadium;
	}

	public void setIdStadium(int idStadium) {
		this.idStadium = idStadium;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
