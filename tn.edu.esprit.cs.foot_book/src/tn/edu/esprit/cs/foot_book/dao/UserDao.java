package tn.edu.esprit.cs.foot_book.dao;

import java.sql.Statement;

import tn.edu.esprit.cs.foot_book.model.User;
import tn.edu.esprit.cs.foot_book.util.MyConnection;

public class UserDao {

	public static boolean addUser(User user) {
		boolean b = false;
		try {
			MyConnection myConnection = new MyConnection();
			Statement statement = myConnection.giveMeStatementPlease();
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
}
