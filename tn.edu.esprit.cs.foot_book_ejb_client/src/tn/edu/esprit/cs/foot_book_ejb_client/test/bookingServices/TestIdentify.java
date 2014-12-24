package tn.edu.esprit.cs.foot_book_ejb_client.test.bookingServices;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.foot_book_ejb.model.Admin;
import tn.edu.esprit.cs.foot_book_ejb.model.User;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.BookingServicesRemote;

public class TestIdentify {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/BookingServices!"
					+ BookingServicesRemote.class.getCanonicalName();
			BookingServicesRemote proxy = (BookingServicesRemote) context
					.lookup(jndiName);

			User userFound = proxy.identify("player", "player");
			if (userFound != null) {
				if (userFound instanceof Admin) {
					System.out.println("welcome sir : " + userFound.getName());
				} else {
					System.out.println("welcome user :" + userFound.getName());
				}

			} else {
				System.out.println("user not found ...");
			}

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
