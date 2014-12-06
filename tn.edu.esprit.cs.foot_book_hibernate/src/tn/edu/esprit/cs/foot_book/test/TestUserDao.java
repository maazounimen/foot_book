package tn.edu.esprit.cs.foot_book.test;

import tn.edu.esprit.cs.foot_book.dao.impl.UserDao;
import tn.edu.esprit.cs.foot_book.dao.interfaces.IUserDao;
import tn.edu.esprit.cs.foot_book.model.User;

public class TestUserDao {
	private static IUserDao iUserDao = new UserDao();

	public static void testAddUser() {
		User user = new User();
		user.setName("foulen");

		iUserDao.addUser(user);
	}

	public static void main(String[] args) {
		testAddUser();

	}
}
