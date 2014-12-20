package tn.edu.esprit.cs.foot_book_ejb_client.test;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.foot_book_ejb.model.Admin;
import tn.edu.esprit.cs.foot_book_ejb.model.User;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesRemote;

public class TestFindUserById {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/ManagementServices!"
					+ ManagementServicesRemote.class.getCanonicalName();
			ManagementServicesRemote proxy = (ManagementServicesRemote) context
					.lookup(jndiName);

			List<User> users = proxy.findAllUsers();
			for (User u : users) {
				if (u instanceof Admin) {
					System.out.println("admin : " + u.getName());
				} else {
					System.out.println("player : " + u.getName());
				}

			}

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
