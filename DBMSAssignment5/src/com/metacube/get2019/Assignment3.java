package com.metacube.get2019;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * It is a class for assignment3
 * @author Khushi
 *
 */
public class Assignment3 {

	/**
	 * It is a main method used to return number of product effected on a particular condition.
	 * @param args unused
	 * @throws SQLException
	 */
	public static void main(String args[]) throws SQLException {
		JDBC jdbcObj = new JDBC();
		Query queryObj = new Query();
		try (Connection con = jdbcObj.connect();
		PreparedStatement stmt = con.prepareStatement(queryObj.query3()); ) {
			int rowsAffected = stmt.executeUpdate();
			System.out.println("Number of product effected  : " + rowsAffected);
		}
	}
}
