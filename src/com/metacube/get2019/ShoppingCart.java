package com.metacube.get2019;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;



/**
 * Shopping cart is used to implement all the operations for the cart like add to cart, update to cart, show cart, generate bill.
 * @author Admin
 *
 */
public class ShoppingCart {

	
	/**
	 * It is main method which is using above methods.
	 * @param args unused
	 */
	public static void main(String args[]) {
		Cart object = new Cart();
		ArrayList<Item> itemList = new ArrayList<Item>();

		System.out.println("Avaiable items in shop");
		itemList.add(new Item(1,"Book",100.00));
		itemList.add(new Item(2,"Bat",200.00));
		itemList.add(new Item(3,"pen",5.00));
		itemList.add(new Item(4,"Pencil",5.00));
		System.out.println("--------------------------------------");


		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		try {
			do {
				System.out.println("Choose the action want to do");
				System.out.println("--------------------------------------");
				System.out.println("1.Add in the cart");
				System.out.println("2.Update the cart");
				System.out.println("3.Show items in the cart");
				System.out.println("4.Generate Bill");
				System.out.println("5.Wants to exit");
				System.out.println("\n--------------------------------------\n");
	
				int choice = sc.nextInt();
	
				switch(choice) {
					case 1:
						object.addItem(itemList);
						break;
					case 2:
						object.updateItem();
						break;
					case 3:
						object.showCart();
						break;
					case 4:
						object.generateBill(itemList);
						break;
					case 5:
						exit = true;
						System.out.println("--------------------------------------");
						System.out.println("Successfully exited");
						System.out.println("--------------------------------------");
						break;
					default:
						System.out.println("Invalid choice");
				}
	
			}while(!exit);
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}

	}
}
