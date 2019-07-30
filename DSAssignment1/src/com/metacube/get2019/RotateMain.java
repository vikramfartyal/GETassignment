package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a main class.
 * @author Khushi
 *
 */
public class RotateMain {

	/**
	 * It is a main method. 
	 * @param args unused
	 */
	public static void main(String args[]) {
		
		boolean isExit = false;
		Scanner sc = new Scanner(System.in);
		RotateLinkList rotObj = new RotateLinkList();
		try {
			do {
				System.out.println("---------------------------------------");
				System.out.println("1. Insert an element into the linked list.");
				System.out.println("2. Rotate a linked list.");
				System.out.println("3. Show Linked List");
				System.out.println("4. Exit");
				System.out.println("---------------------------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				System.out.println("---------------------------------------");
				switch (choice) {
				case 1 :
					System.out.print("Enter the value of element to be inserted : ");
					int data = sc.nextInt();
					System.out.println("---------------------------------------");
					rotObj.insert(data);
					break;
				case 2 :
					System.out.print("Enter left position of sublist : ");
					int left = sc.nextInt();
					System.out.print("Enter the right position of sublist : ");
					int right = sc.nextInt();
					System.out.print("Enter the number of steps by which u want to rotate your list : ");
					int numberOfrotation = sc.nextInt();
					System.out.println("---------------------------------------");
					rotObj.rotateLinkList(left, right, numberOfrotation);
					break;
				case 3 :
					rotObj.show();
					break;
				case 4:
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
