package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class AddEmployeeMain {

	/**
	 * It is a main method
	 * @param args unused
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean isExit = false;
		AddEmployee empObj = new AddEmployee();

		
		try {
			do {
				System.out.println("--------------------------");
				System.out.println("1. Insert an employee.");
				System.out.println("2. Exit");
				System.out.println("--------------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				sc.nextLine();
				System.out.println("--------------------------");
				switch (choice) {
				case 1:
					System.out.print("Enter the Id of employee : ");
					int empId = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the name of employee : ");
					String empName = sc.nextLine();
					System.out.print("Enter the address of employee : ");
					String empAddress = sc.nextLine();
					System.out.println("--------------------------");
					boolean hasDuplicate = empObj.createEmpList(new AddEmployee(empId, empName, empAddress));
					System.out.println(hasDuplicate);
					break;
				
				case 2:
					isExit = true;
					System.out.println("Successfully exit!!!");
					System.out.println("--------------------------");
					break;
				default:
					System.out.println("Invalid choice!!!");
					System.out.println("--------------------------");
				}
				
			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}finally {
			sc.close();
		}
	}
}
