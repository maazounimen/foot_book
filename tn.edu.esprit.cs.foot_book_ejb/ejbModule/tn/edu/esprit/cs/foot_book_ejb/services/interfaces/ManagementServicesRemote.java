package tn.edu.esprit.cs.foot_book_ejb.services.interfaces;

import javax.ejb.Remote;

@Remote
public interface ManagementServicesRemote {
	void sayAhla(String name);
}
