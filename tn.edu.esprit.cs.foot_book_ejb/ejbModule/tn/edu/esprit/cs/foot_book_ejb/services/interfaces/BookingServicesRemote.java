package tn.edu.esprit.cs.foot_book_ejb.services.interfaces;

import java.util.Date;

import javax.ejb.Remote;

import tn.edu.esprit.cs.foot_book_ejb.model.Stadium;
import tn.edu.esprit.cs.foot_book_ejb.model.User;

@Remote
public interface BookingServicesRemote {
	User identify(String login, String password);

	boolean bookForStadium(Date date, float duration, User user, Stadium stadium);

}
