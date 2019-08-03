package com.metacube.get2019;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class EmpNameSorterMain {

	/**
	 * It is a main method
	 * @param args unused.
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean isExit = false;
		EmpNameSorter empObj = new EmpNameSorter();
		List<EmpNameSorter> empList = new ArrayList<EmpNameSorter>();

		
		try {
			do {
				System.out.println("----------------------------");
				System.out.println("1. Insert an employee.");
				System.out.println("2. Sort according to employee name.");
				System.out.println("3. Exit");
				System.out.println("----------------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				sc.nextLine();
				System.out.println("----------------------------");
				switch (choice) {
				case 1:
					System.out.print("Enter the Id of employee : ");
					int empId = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the name of employee : ");
					String empName = sc.nextLine();
					System.out.print("Enter the address of employee : ");
					String empAddress = sc.nextLine();
					System.out.println("----------------------------");
					empObj.makeEmpList(new EmpNameSorter(empId, empName, empAddress));
					break;
				case 2: 
					empList = empObj.sortAccName();
					System.out.println("EMPID\t\tEMPNAME\t\tEMPADDRESS");
					System.out.println("----------------------------");
					for(EmpNameSorter i : empList) {
						System.out.println(i.empId + "\t\t" + i.empName + "\t\t" + i.empAddress);
					}
					System.out.println("----------------------------");
				case 3:
					isExit = true;
					System.out.println("Successfully exit!!!");
					System.out.println("----------------------------");
					break;
				default:
					System.out.println("Invalid choice!!!");
					System.out.println("----------------------------");
				}
				
			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}finally {
			sc.close();
		}
	}
}
