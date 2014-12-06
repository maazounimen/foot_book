package tn.edu.esprit.cs.foot_book.dao;

import java.sql.Statement;

import tn.edu.esprit.cs.foot_book.model.User;
import tn.edu.esprit.cs.foot_book.util.MyConnection;

public class UserDao {
	private static Statement statement = MyConnection.giveMeStatementPlease();

	public static boolean addUser(User user) {
		boolean b = false;
		try {
			String sql = "insert into base.user (name) values('"
					+ user.getName() + "')";
			statement.executeUpdate(sql);
			System.out.println("user added ...");
			b = true;
		} catch (Exception e) {
			System.err.println("add fail ...");
		}
		return b;
	}

	public static boolean deleteUserById(int id) {
		boolean b = false;
		try {
			String sql = "delete from base.user where id =" + id;
			statement.executeUpdate(sql);
			b = true;
		} catch (Exception e) {
			System.err.println("delete problem");
		}
		return b;

	}

}
