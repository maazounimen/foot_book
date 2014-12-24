package tn.edu.esprit.cs.foot_book_ejb_client.test.bookingServices;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.foot_book_ejb.model.Stadium;
import tn.edu.esprit.cs.foot_book_ejb.model.User;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.BookingServicesRemote;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesRemote;

public class TestBookForStadium {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/BookingServices!"
					+ BookingServicesRemote.class.getCanonicalName();
			BookingServicesRemote bookingServicesRemote = (BookingServicesRemote) context
					.lookup(jndiName);
			String jndiName2 = "ejb:/tn.edu.esprit.cs.foot_book_ejb/ManagementServices!"
					+ ManagementServicesRemote.class.getCanonicalName();
			ManagementServicesRemote managementServicesRemote = (ManagementServicesRemote) context
					.lookup(jndiName2);

			User userFound = managementServicesRemote.findUserById(2);
			Stadium stadiumFound = managementServicesRemote.findStadiumById(2);

			bookingServicesRemote.bookForStadium(new Date(), 2, userFound,
					stadiumFound);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
