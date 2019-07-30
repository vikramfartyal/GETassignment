package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a main class.
 * @author Khushi
 *
 */
public class DetectLoopMain {

	/**
	 * It is a main method. 
	 * @param args unused
	 */
	public static void main(String args[]) {
		
		boolean isExit = false;
		Scanner sc = new Scanner(System.in);
		DetectLoop detLoopObj = new DetectLoop();
		try {
			do {
				System.out.println("---------------------------------------");
				System.out.println("1. Insert an element into the linked list.");
				System.out.println("2. Make a loop in linked list at kth position.");
				System.out.println("3. Detect a loop into the linked list");
				System.out.println("4. Show Linked List");
				System.out.println("5. Exit");
				System.out.println("---------------------------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				System.out.println("---------------------------------------");
				switch (choice) {
				case 1 :
					System.out.print("Enter the value of element to be inserted : ");
					int data = sc.nextInt();
					System.out.println("---------------------------------------");
					detLoopObj.insert(data);
					break;
				case 2 :
					System.out.print("Enter the position where u want to create a loop : ");
					int k = sc.nextInt();
					System.out.println("---------------------------------------");
					detLoopObj.makeLoop(k);
					break;
				case 3 :
					System.out.println("---------------------------------------");
					boolean result = detLoopObj.detectLoop();
					System.out.println("Loop found in the linked list : "+result);
					break;
				case 4 :
					detLoopObj.show();
					break;
				case 5 :
					isExit = true;
					System.out.println("Successfully Exit!!!");
					System.out.println("---------------------------------------");
					break;
				default :
					System.out.println("Invalid choice.");
					System.out.println("---------------------------------------");
				}
				
			}while(!isExit);
			
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}
	}

}
