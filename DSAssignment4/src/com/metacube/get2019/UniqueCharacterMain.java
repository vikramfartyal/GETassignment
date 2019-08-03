package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class UniqueCharacterMain {

	/**
	 * It is a main method
	 * @param args unused
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		UniqueCharacter uniObj = new UniqueCharacter();
		boolean isExit = false;
		try {
			do {
				System.out.println("--------------------------------------");
				System.out.println("1. Find number of unique characters.");
				System.out.println("2. Exit");
				System.out.println("--------------------------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				System.out.println("--------------------------------------");
				sc.nextLine();
				switch (choice) {
				case 1:
					System.out.print("Enter a string : ");
					String str = sc.nextLine();
					System.out
							.println("--------------------------------------");
					int noOfUniChar = uniObj.noOfUniqueChar(str);
					System.out.println("No of unique characters : "
							+ noOfUniChar);
					System.out
							.println("--------------------------------------");
					break;
				case 2:
					isExit = true;
					System.out.println("Exit!!!");
					System.out
							.println("--------------------------------------");
					break;
				default:
					System.out.println("Invalid choice!!");
					System.out
							.println("--------------------------------------");
				}

			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}finally {
			sc.close();
		}
	}
}
