package tn.edu.esprit.cs.foot_book.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
	private static Connection connection;
	private static Statement statement;
	private static String url = "jdbc:mysql://localhost:3306/base";
	private static String user = "root";
	private static String password = "root";

	public static Connection giveMeConnectionPlease() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded ...");

			connection = DriverManager.getConnection(url, user, password);
			System.out.println("connection configured ...");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static Statement giveMeStatementPlease() {
		try {
			statement = giveMeConnectionPlease().createStatement();
			System.out.println("statement loaded ...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statement;
	}

}
