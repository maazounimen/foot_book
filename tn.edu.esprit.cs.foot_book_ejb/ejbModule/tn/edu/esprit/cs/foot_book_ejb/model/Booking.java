package tn.edu.esprit.cs.foot_book_ejb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Booking
 * 
 */
@Entity
public class Booking implements Serializable {

	private BookingId bookingId;
	private float duration;
	private static final long serialVersionUID = 1L;

	private User user;
	private Stadium stadium;

	public Booking() {
		super();
	}

	@EmbeddedId
	public BookingId getBookingId() {
		return bookingId;
	}

	public void setBookingId(BookingId bookingId) {
		this.bookingId = bookingId;
	}

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "id", insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "idStadium", referencedColumnName = "id", insertable = false, updatable = false)
	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	public Booking(Date dateOfBooking, float duration, User user,
			Stadium stadium) {
		super();
		this.user = user;
		this.stadium = stadium;
		this.duration = duration;
		this.bookingId = new BookingId(dateOfBooking, user.getId(),
				stadium.getId());
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

}
