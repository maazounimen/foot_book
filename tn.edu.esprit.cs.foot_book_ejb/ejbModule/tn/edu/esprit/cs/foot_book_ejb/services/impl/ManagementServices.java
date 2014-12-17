package tn.edu.esprit.cs.foot_book_ejb.services.impl;

import javax.ejb.Stateless;

import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesLocal;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesRemote;

@Stateless
public class ManagementServices implements ManagementServicesRemote,
		ManagementServicesLocal {

	@Override
	public void sayAhla(String name) {
		System.out.println("ahla w sahla : " + name);

	}

}
