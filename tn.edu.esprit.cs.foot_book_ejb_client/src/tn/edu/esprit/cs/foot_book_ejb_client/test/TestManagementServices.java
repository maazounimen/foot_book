package tn.edu.esprit.cs.foot_book_ejb_client.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tn.edu.esprit.cs.foot_book_ejb.model.Stadium;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesRemote;

public class TestManagementServices {
	private Context context;
	private ManagementServicesRemote proxy;

	@Before
	public void setUp() {
		try {
			context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/ManagementServices!"
					+ ManagementServicesRemote.class.getCanonicalName();
			proxy = (ManagementServicesRemote) context.lookup(jndiName);
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void TestSaveStadium() {
		Stadium stadium = new Stadium();
		stadium.setId(1);
		stadium.setName("rades");
		
		Assert.assertTrue(proxy.saveStadium(stadium));

	}
}
