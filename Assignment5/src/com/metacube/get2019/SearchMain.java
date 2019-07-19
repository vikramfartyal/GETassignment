package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchMain {

	public static void main(String args[]) {

		Search srObj = new Search();
		try {
			System.out.print("Enter number of elements in array : ");
			Scanner sc = new Scanner(System.in);
			int numberOfelements = sc.nextInt();
			int arr[] = new int[numberOfelements];
			boolean isExit = false;
			System.out.println("Enter elements of array");
			for (int i = 0; i < numberOfelements; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("------------------");
			System.out.print("Enter element to be searched : ");
			int element = sc.nextInt();
			System.out.println("------------------");
			int result;
			do {
				System.out.println("1. Linear serach");
				System.out.println("2. Binary Search");
				System.out.println("3. Exit");
				System.out.println("------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				System.out.println("------------------");
				switch (choice) {
				case 1:
					result = srObj.linearSearch(arr, element, numberOfelements);
					System.out.println("Index of " + element + " : " + result);
					System.out.println("------------------");
					break;
				case 2:
					result = srObj.binarySearch(arr, 0, numberOfelements,
							element);
					System.out.println("Index of " + element + " : " + result);
					System.out.println("------------------");
					break;
				case 3:
					isExit = true;
					System.out.println("Successfully exit");
					System.out.println("------------------");
					break;
				default :
					System.out.println("Not a valid Choice");
				}

			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
