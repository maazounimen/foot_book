package tn.edu.esprit.cs.foot_book_ejb_client.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.foot_book_ejb.model.Admin;
import tn.edu.esprit.cs.foot_book_ejb.model.Player;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesRemote;

public class InitDb {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/ManagementServices!"
					+ ManagementServicesRemote.class.getCanonicalName();
			ManagementServicesRemote proxy = (ManagementServicesRemote) context
					.lookup(jndiName);

			proxy.sayAhla("ronaldo");

			Admin admin = new Admin();
			admin.setName("admin");
			admin.setAccessLevel("high level");

			Player player = new Player();
			player.setName("playerOne");
			player.setAccount("primium");

			Player player2 = new Player();
			player2.setName("playerTwo");
			player2.setAccount("pro");

			proxy.save(admin);
			proxy.save(player);
			proxy.save(player2);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
