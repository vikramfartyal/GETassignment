package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOperationMain {

	public static void main(String args[]) {

		ArrayOperation aoObj = new ArrayOperation();

		boolean isExit = false;
		int result;
		try {
			do {
				System.out.println("1. Find maxMirror length in an array.");
				System.out.println("2. Find number of clumps in an array.");
				System.out.println("3. Return an array in which X followed by Y");
				System.out.println("4. Return the index at which array is divided into 2 halves");
				System.out.println("5. Exit");
				System.out.println("-------------------------------------");
				System.out.print("Enter your choice : ");
				Scanner sc = new Scanner(System.in);
				int choice = sc.nextInt();
				int n;
				int[] arr;
				switch (choice) {
				case 1:
					System.out.print("Enter number of elements of array : ");
					n = sc.nextInt();
					arr = new int[n];
					System.out.println("-------------------------------------");
					System.out.print("Enter elements of array : ");
					for (int i = 0; i < n; i++) {
						arr[i] = sc.nextInt();
					}
					result = aoObj.maxMirror(arr);
					System.out.println("-------------------------------------");
					System.out.println("MaxMirror length : " + result);
					System.out.println("-------------------------------------");
					break;
				case 2:
					System.out.print("Enter number of elements of array : ");
					n = sc.nextInt();
					arr = new int[n];
					System.out.print("Enter elements of array :  ");
					for (int i = 0; i < n; i++) {
						arr[i] = sc.nextInt();
					}
					result = aoObj.countClumps(arr);
					System.out.println("-------------------------------------");
					System.out.println("Number of clumps in array : " + result);
					System.out.println("-------------------------------------");
					break;
				case 3:
					System.out.print("Enter number of elements of array : ");
					n = sc.nextInt();
					arr = new int[n];
					System.out.print("Enter elements of array : ");
					for (int i = 0; i < n; i++) {
						arr[i] = sc.nextInt();
					}
					System.out.print("Enter the value of X : ");
					int X = sc.nextInt();
					System.out.print("Enter the value of Y : ");
					int Y = sc.nextInt();
					int[] result1 = new int[n];
					result1 = aoObj.fixXY(arr, X, Y);
					System.out.print("Updated array is : ");
					for (int i = 0; i < n; i++) {
						System.out.print(result1[i] + " ");
					}
					System.out.println();
					break;
				case 4:
					System.out.print("Enter number of elements of array : ");
					n = sc.nextInt();
					arr = new int[n];
					System.out.print("Enter elements of array : ");
					for (int i = 0; i < n; i++) {
						arr[i] = sc.nextInt();
					}
					result = aoObj.splitArray(arr);
					System.out.println("-------------------------------------");
					System.out.println("Index at which array split : " + result);
					System.out.println("-------------------------------------");
					break;
				case 5:
					isExit = true;
					System.out.println("-------------------------------------");
					System.out.println("Successfully exit");
					System.out.println("-------------------------------------");
					break;
				default:
					System.out.println("-------------------------------------");
					System.out.println("Invalid choice");
					System.out.println("-------------------------------------");

				}

			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
