package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class StringClass {

	/**
	 * It is a main method which is using methods of StringOperations class.
	 * @param args unused
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str;
		boolean isExit = false;
		try {
			do {
				String result;
				StringOperations so_obj = new StringOperations();
				System.out.println("1. Reverse a string");
				System.out.println("2. Reverse the case of string");
				System.out.println("3. Compare two strings");
				System.out.println("4. Find largest word in a string");
				System.out.println("5. Exit the program");
				System.out.println("--------------------------");
				System.out.print("Enter your choice = ");
				int choice = sc.nextInt();
				sc.nextLine();
				System.out.println("--------------------------");
				switch (choice) {
				case 1:
					System.out.print("Enter a string = ");
					str = sc.nextLine();
					result = so_obj.reverseString(str);
					System.out.println("Reverse of string = " + result);
					System.out.println("-----------------------------");
					break;
				case 2:
					System.out.print("Enter a string = ");
					str = sc.nextLine();
					result = so_obj.swapCase(str);
					System.out.println("Reversed case string = " + result);
					System.out.println("-----------------------------");
					break;
				case 3:
					System.out.print("Enter a string = ");
					str = sc.nextLine();
					System.out.print("Enter one more string to compare = ");
					String str2 = sc.nextLine();
					int result1 = so_obj.compare2Strings(str, str2);
					System.out.println("Result of comparison of 2 string is = "
							+ result1);
					System.out.println("-----------------------------");
					break;
				case 4:
					System.out.print("Enter a string = ");
					str = sc.nextLine();
					result = so_obj.largestWordOfString(str);
					System.out.println("Largest word of string = " + result);
					System.out.println("-----------------------------");
					break;
				case 5:
					isExit = true;
					System.out.println("Successfully exit");
					System.out.println("-----------------------------");
					break;
				default:
					System.out.println("Invalid input, enter a valid input");
					System.out.println("-----------------------------");
				}
			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			sc.close();
		}
	}
}
