package com.metacube.get2019;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * It is a class for Assignment2
 * @author Khushi
 *
 */
public class Assignment2 {
	
	/**
	 * It is a method used for batch Insert.
	 * @param imageList List of images to be inserted
	 * @param product_id product id
	 * @throws SQLException
	 */
	public static void insertImage(List<String> imageList, int product_id) throws SQLException {
		JDBC jdbcObj = new JDBC();
		Query queryObj = new Query();
		try (Connection con = jdbcObj.connect();
		PreparedStatement stmt = con.prepareStatement(queryObj.query2()); ) {
			con.setAutoCommit(false);
			for(int i = 0; i < imageList.size(); i++) {
				stmt.setString(1, imageList.get(i));
				stmt.setInt(2, product_id);
				stmt.addBatch();
			}
			int[] result = stmt.executeBatch();
			System.out.println("The number of rows inserted  : "+ result.length);
			System.out.println("------------------------------------");
			con.commit();
		}
	}
	
	/**
	 * It is a main method.
	 * @param args unused.
	 * @throws SQLException
	 */
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		try {
			List<String> url = new ArrayList<String>();
			System.out.println("------------------------------------");
			System.out.print("Enter the id of product for which u want to insert images  : ");
			int product_id = sc.nextInt();
			System.out.println("------------------------------------");
			url.add("Oven1.jpg");
			url.add("Oven2.png");
			url.add("Oven3.jpg");
			url.add("Oven4.png");
			url.add("Oven5.jpg");
			url.add("Oven6.png");
			insertImage(url, product_id);
		}
		catch (SQLException e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}
	}
}
