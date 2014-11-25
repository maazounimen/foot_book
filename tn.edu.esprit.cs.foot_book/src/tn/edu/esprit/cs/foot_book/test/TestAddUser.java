package tn.edu.esprit.cs.foot_book.test;

import tn.edu.esprit.cs.foot_book.dao.UserDao;
import tn.edu.esprit.cs.foot_book.model.User;

public class TestAddUser {

	public static void main(String[] args) {
		User user = new User();
		user.setName("daly");

		boolean b = UserDao.addUser(user);
		System.out.println(b);
	}

}
