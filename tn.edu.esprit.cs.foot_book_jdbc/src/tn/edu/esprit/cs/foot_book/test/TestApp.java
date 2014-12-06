package tn.edu.esprit.cs.foot_book.test;

import tn.edu.esprit.cs.foot_book.util.MyConnection;

public class TestApp {
	public static void testGiveMeConnectionPlease() {
		MyConnection myConnection = new MyConnection();
		myConnection.giveMeConnectionPlease();
	}

	public static void testGiveMeStatementPlease() {
		MyConnection myConnection = new MyConnection();
		myConnection.giveMeStatementPlease();
	}

	public static void main(String[] args) {
		testGiveMeConnectionPlease();
		testGiveMeStatementPlease();
	}
}
