package tn.edu.esprit.cs.foot_book_ejb_client.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.Client;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.CreditCard;
import tn.edu.esprit.cs.foot_book_ejb.training.relationshipSamples.services.ClientServicesRemote;

public class TestSaveCreditCard {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/ClientServices!"
					+ ClientServicesRemote.class.getCanonicalName();
			ClientServicesRemote proxy = (ClientServicesRemote) context
					.lookup(jndiName);

			Client client = new Client();
			client.setId(1);
			client.setName("foulen");

			CreditCard creditCard = new CreditCard();
			creditCard.setId(1);
			creditCard.setTypeCard("master card");

			creditCard.linkClientToThisCreditCard(client);

			proxy.saveCreditCard(creditCard);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
