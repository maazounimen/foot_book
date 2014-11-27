package tn.edu.esprit.cs.foot_book.test;

import tn.edu.esprit.cs.foot_book.dao.UserDao;
import tn.edu.esprit.cs.foot_book.model.User;

public class TestUserDao {
	public static void testAddUser() {
		User user = new User();
		user.setName("foulen");

		System.out.println(UserDao.addUser(user));
	}

	public static void testdeleteUserById() {
		UserDao.deleteUserById(5);
	}

	public static void main(String[] args) {
		testdeleteUserById();
	}
}
