package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class MarkSheet {

	/**
	 * It is main method using methods of class MarksOperations
	 * @param args unused
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			MarksOperations mo_obj = new MarksOperations();
			System.out.print("Enter the number of students = ");
			int numberOfStudents = sc.nextInt();
			System.out.println("--------------------------------");
			System.out.println("Enter grades for students between 0 and 100");
			float[] grades_arr = new float[numberOfStudents];
			for (int i = 0; i < numberOfStudents; i++) {
				float grade = sc.nextFloat();
				grades_arr[i] = grade;
			}

			boolean isExit = false;
			do {
				System.out.println("--------------------------------");
				System.out.println("1. Average of grades ");
				System.out.println("2. Maximum of grades ");
				System.out.println("3. Minimum of grades ");
				System.out.println("4. Percentage of passes students ");
				System.out.println("5. Exit");
				System.out.println("--------------------------------");
				System.out.print("Enter your choice = ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					float averageOfGrades = mo_obj.averageOfGrades(grades_arr,
							numberOfStudents);
					System.out.println("--------------------------------");
					System.out
							.printf("Average of grades = %.2f", averageOfGrades);
					System.out.println("\n--------------------------------");
					break;
				case 2:
					float maximumOfGrades = mo_obj.maxOfgrades(grades_arr,
							numberOfStudents);
					System.out.println("--------------------------------");
					System.out
							.printf("Maximum of grades = %.2f", maximumOfGrades);
					System.out.println("\n--------------------------------");
					break;
				case 3:
					float minimumOfGrades = mo_obj.minOfGrades(grades_arr,
							numberOfStudents);
					System.out.println("--------------------------------");
					System.out
							.printf("Minimum of grades = %.2f", minimumOfGrades);
					System.out.println("\n--------------------------------");
					break;
				case 4:
					float percentage = mo_obj.percentageOfPassStudents(grades_arr, numberOfStudents);
					System.out.println("--------------------------------");
					System.out.printf("Pecentage = %.2f", percentage);
					System.out.println("\n--------------------------------");
					break;
				case 5:
					isExit = true;
					System.out.println("--------------------------------");
					System.out.println("Successfully exit");
					System.out.println("--------------------------------");
					break;
				default:
					System.out.println("Invalid choice");
				}
			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			sc.close();
		}
	}
}

