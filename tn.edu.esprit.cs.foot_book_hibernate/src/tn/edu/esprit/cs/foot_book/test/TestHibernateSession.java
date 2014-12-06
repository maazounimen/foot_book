package tn.edu.esprit.cs.foot_book.test;

import tn.edu.esprit.cs.foot_book.utilities.HibernateUtilities;

public class TestHibernateSession {
	public static void main(String[] args) {
		HibernateUtilities.getInstance().getSession();
	}

}
