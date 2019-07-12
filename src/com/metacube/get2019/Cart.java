package com.metacube.get2019;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Cart {
	ArrayList<CartItem> cartItemList = new ArrayList<CartItem>();
	/**
	 * This method is used to add a item into the cart.
	 * 
	 * @param itemList
	 */
	public void addItem(ArrayList<Item> itemList) {
		try {
			System.out.print("enter the item number = ");
			Scanner sc = new Scanner(System.in);
			int itemId = sc.nextInt();
			Iterator<Item> iterator = itemList.iterator();
			while (iterator.hasNext()) {
				Item i = (Item) iterator.next();
				if (i.getid() == itemId) {
					System.out.print("Enter quantity for the item = ");
					int itemQuantity = sc.nextInt();
					CartItem obj = new CartItem(i.getItemName(), itemQuantity, i.getprice());
					cartItemList.add(obj);
					System.out.println("--------------------------------------");
					System.out.println("Item is successfully added into cart");
					System.out.println("--------------------------------------");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input");
		}

	}

	/**
	 * This method is used to update quantity of any item which is already added
	 * into cart.
	 */
	public void updateItem() {
		try {
			System.out.print("Enter the name of item which you want to update = ");
			Scanner sc = new Scanner(System.in);
			String itemName = sc.nextLine();
			
			Iterator<CartItem> iterator = cartItemList.iterator();
			boolean flag = false;
			while (iterator.hasNext()) {
				if(flag) {
					break;
				}
				CartItem i = (CartItem) iterator.next();
				if(i.getItemName().equals(itemName)) {
					flag = true;
					System.out.print("Enter the quantity to which you want to update = ");
					int itemQuantity = sc.nextInt();
					System.out.println();
					i.setQuantity(itemQuantity);
					System.out.println("--------------------------------------");
					System.out.println("Successfully updated");
					System.out.println("--------------------------------------");
				}
			
			}
		
			if(flag) {
				System.out.println("--------------------------------------");
				System.out.println("This item do not exist in your cart\n");
				System.out.println("--------------------------------------");
			}
			}
		catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
	}

	/**
	 * This method is used to show items of the cart.
	 */
	public void showCart() {
		if (cartItemList.size() == 0) {
			System.out.println("--------------------------------------");
			System.out.println("There is no item in the cart\n");
			System.out.println("--------------------------------------");

		}
		
		Iterator<CartItem> iterator = cartItemList.iterator();
		System.out.println("--------------------------------------");
		System.out.println("ITEMNAME\tQUANTITY\tCOST");
		System.out.println("--------------------------------------");
		while (iterator.hasNext()) {
			CartItem item = (CartItem) iterator.next();
			System.out.println(item.getItemName()+"\t\t"+item.getItemQuantity()+"\t\t"+item.getItemPrice());
			
		}	
	}

	/**
	 * This method is used to generate bill of the items available in the cart.
	 * 
	 * @param itemList
	 *            it is list which stores all items present in shop.
	 */
	public void generateBill(ArrayList<Item> itemList) {
		double sum = 0;
		if (cartItemList.size() == 0) {
			System.out.println("Firstly add some items into cart\n");

		} 
		else {
			System.out.println("--------------------------------------");
			System.out.println("ITEMNAME\tQUANTITY\tCOST");
			System.out.println("--------------------------------------");

			
			Iterator itr1 = cartItemList.iterator();
			while(itr1.hasNext()){
				CartItem item = (CartItem) itr1.next();
				System.out.println(item.getItemName()+"\t\t"+item.getItemQuantity()+"\t\t"+item.getItemPrice()*item.getItemQuantity());
				sum += item.getItemPrice() * item.getItemQuantity();
				
			}
			System.out.println("--------------------------------------");
			System.out.println("Total cost = " + sum + "\n");
		}

	}

}
