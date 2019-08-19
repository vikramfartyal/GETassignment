package com.metacube.get2019;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * It is a class for assignment1
 * @author Khushi
 *
 */
public class Assignment1 {

	/**
	 * It is a main method to get order details.
	 * @param args unused
	 * @throws SQLException
	 */
	public static void main(String args[]) throws SQLException {
		Scanner sc  = new Scanner(System.in);
		Query queryObj = new Query();
		JDBC jdbcObj = new JDBC();
		try ( Connection con = jdbcObj.connect(); ) {
			System.out.println("-----------------------");
			System.out.print("Enter the id of user : ");
			int user_Id = sc.nextInt();
			System.out.println("-----------------------");
			try (PreparedStatement stmt = con.prepareStatement(queryObj.returnQuery(user_Id)); ) {
				ResultSet rs = stmt.executeQuery();
				System.out.println("Order_id  order_date  order_amount");
				System.out.println("-----------------------");
				while (rs.next()) {
					System.out.println( rs.getInt("Order_id") + "\t" + rs.getDate("Order_date") + "\t" + rs.getDouble("Order_amount"));
				}
				System.out.println("-----------------------");
				sc.close();
			}
		}
	}
}
