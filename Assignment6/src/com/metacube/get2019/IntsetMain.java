package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * It is a class for main method.
 * @author Khushi
 *
 */
public class IntsetMain {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * It is a method used to take input from user.
	 * @param numberOfElements
	 * @return set.
	 */
	public static int[] getInput(int numberOfElements) {
		int set[] = new int[numberOfElements];
		System.out.print("Enter elements of set : ");
		for (int i = 0; i < numberOfElements; i++) {
			set[i] = sc.nextInt();
		}
		System.out.println();
		return set;
	}
	
	/**
	 * It is main method.
	 * @param args not used.
	 */
	public static void main(String args[]) {
		Intset s, s1, s2;
		int numberOfElements;
		boolean isExit = false;
		int[] set;
		try {
			do { 
				System.out
						.println("1. Check whether x is member of set or not.");
				System.out.println("2. Get the size of set.");
				System.out.println("3. Check whether s is subset of set ");
				System.out.println("4. Find the complement of set s.");
				System.out.println("5. Find union of 2 sets.");
				System.out.println("6. Exit");
				System.out.println("--------------------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				System.out.println("--------------------------------");
				switch (choice) {
				case 1:
					System.out.print("Enter number of elements in set : ");
					numberOfElements = sc.nextInt();
					set = new int[numberOfElements];
					set = getInput(numberOfElements);
					s = new Intset(set, numberOfElements);
					System.out.println("--------------------------------");
					System.out.print("Enter the element whose membership you want to check : ");
					int x = sc.nextInt();
					boolean result = s.isMember(x);
					System.out.println(x + " is a member of set : " + result);
					System.out.println("--------------------------------");
					break;
				case 2:
					System.out.print("Enter number of elements in set : ");
					numberOfElements = sc.nextInt();
					set = new int[numberOfElements];
					set = getInput(numberOfElements);
					s = new Intset(set, numberOfElements);
					int size = s.size();
					System.out.println("--------------------------------");
					System.out.println("Size of set : " + size);
					System.out.println("--------------------------------");
					break;
				case 3:
					System.out.print("Enter number of elements in set : ");
					numberOfElements = sc.nextInt();
					set = new int[numberOfElements];
					set = getInput(numberOfElements);
					s = new Intset(set, numberOfElements);
					System.out.print("Enter number of elements in set : ");
					numberOfElements = sc.nextInt();
					set = getInput(numberOfElements);
					s1 = new Intset(set, numberOfElements);
					boolean isSubset = s.isSubSet(s1);
					System.out.println("--------------------------------");
					System.out.println("s is subset of set : "+isSubset);
					System.out.println("--------------------------------");
					break;
				case 4:
					System.out.print("Enter number of elements in set : ");
					numberOfElements = sc.nextInt();
					set = new int[numberOfElements];
					set = getInput(numberOfElements);
					s = new Intset(set, numberOfElements);
					Intset complement = s.getComplement();
					System.out.println("--------------------------------");
					System.out.print("Complement of set s : ");
					int[] complementArr = new int[1000 - numberOfElements];
					complementArr = complement.getSet();
					for (int i = 0; i < complementArr.length; i++) {
						System.out.print(complementArr[i] + " ");
					}
					System.out.println("\n--------------------------------");
					break;
				case 5:
					System.out.print("Enter number of elements in set : ");
					numberOfElements = sc.nextInt();
					set = new int[numberOfElements];
					set = getInput(numberOfElements);
					s1 = new Intset(set, numberOfElements);
					System.out.print("Enter number of elements in set : ");
					int numberOfElements1 = sc.nextInt();
					int[] set1 = new int[numberOfElements1];
					set1 = getInput(numberOfElements1);
					s2 = new Intset(set1, numberOfElements1);
					Intset union = s1.union(s1, s2);
					System.out.println("--------------------------------");
					System.out.print("Union of set s : ");
					int[] unionArr = new int[numberOfElements + numberOfElements1];
					unionArr = union.getSet();
 					for (int i = 0; i < unionArr.length; i++) {
						System.out.print(unionArr[i] + " ");
					}
					System.out.println("\n--------------------------------");
					break;
				case 6:
					isExit = true;
					System.out.println("--------------------------------");
					System.out.println("Successfully Exit!!!");
					System.out.println("--------------------------------");
					break;
				default:
					System.out.println("--------------------------------");
					System.out.println("Invalid choice");
					System.out.println("--------------------------------");
				}
			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
	}

}
