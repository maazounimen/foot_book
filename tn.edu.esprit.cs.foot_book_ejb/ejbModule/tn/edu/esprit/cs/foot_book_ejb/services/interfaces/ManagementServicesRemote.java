package tn.edu.esprit.cs.foot_book_ejb.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.cs.foot_book_ejb.model.User;

@Remote
public interface ManagementServicesRemote {
	void sayAhla(String name);

	boolean save(User user);

	User findUserById(int id);

	boolean updateUser(User user);

	boolean deleteUserById(int id);

	List<User> findAllUsers();
}
