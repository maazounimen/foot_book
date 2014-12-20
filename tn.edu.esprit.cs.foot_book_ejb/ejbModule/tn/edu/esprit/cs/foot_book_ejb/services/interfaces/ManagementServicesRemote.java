package tn.edu.esprit.cs.foot_book_ejb.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.cs.foot_book_ejb.model.User;

@Remote
public interface ManagementServicesRemote {
	void sayAhla(String name);

	boolean save(User user);
}
