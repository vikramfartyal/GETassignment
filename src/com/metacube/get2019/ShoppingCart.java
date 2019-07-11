package com.metacube.get2019;



import java.util.*;

/**
 * Item class is used to create items with three attributes id, itemname and price
 * @author Admin
 *
 */
class Item
{
	int id;
	String itemName;
	double price;

	/**
	 * This method is used to set values of 3 properties and to print them.
	 * @param id This is first parameter to set id of item
	 * @param itemName this is second parameter to set itemname
	 * @param price this is third parameter to set price of item
	 */
	public Item(int id, String itemName, double price){
		this.id=id;
		this.itemName=itemName;
		this.price=price;
		System.out.println(id+"\t\t"+itemName+"\t\t"+price);
	}
	
	/**
	 * This method is used to return value of itemname
	 * @return string type itemname
	 */
	public String getItemName(){
		return itemName;
	}

	/**
	 * This method is used to return value of id.
	 * @return id of item
	 */
	public int getid(){
		return id;
	}

	/**
	 * This method is used to return the price of the item.
	 * @return price of item
	 */
	public double getprice(){
		return price;
	}
}


/**
 * Shopping cart is used to implement all the operations for the cart like add to cart, update to cart, show cart, generate bill.
 * @author Admin
 *
 */
public class ShoppingCart {

	ArrayList <String> item=new ArrayList <String>();
	ArrayList<Integer> quantity=new ArrayList<Integer>();
	ArrayList<Double> price=new ArrayList<Double>();
	
	/**
	 * This method is used to add a item into the cart.
	 * @param itemList
	 */
	public void addItem(ArrayList<Item> itemList){
		try{
			System.out.print("enter the item number = ");
			Scanner sc=new Scanner(System.in);
			int itemId=sc.nextInt();
			Iterator<Item> iterator=itemList.iterator();
			while(iterator.hasNext()){	
				Item i=(Item)iterator.next();
				if (i.getid()==itemId){
					item.add(i.getItemName());
					System.out.print("Enter quantity for the item = ");
					int itemQuantity=sc.nextInt();
					quantity.add(itemQuantity);
					price.add(i.getprice());
					System.out.println("Item is successfully added into cart\n");
				}
			}
		}
		catch(Exception e){
			System.out.println("Invalid Input");
		}

	}

	/**
	 * This method is used to update quantity of any item which is already added into cart.
	 */
	public void updateItem(){
		try{
			System.out.println("Enter the name of item which you want to update");
			Scanner sc=new Scanner(System.in);
			String itemName=sc.nextLine();
			int index;
			index = item.indexOf(itemName);
			if(index!=-1){
				System.out.println("Enter the quantity to which you want to update");
				int itemQuantity=sc.nextInt();
				quantity.set(index, itemQuantity);
				System.out.println("Successfully updated");
			}
			else{
				System.out.println("This item do not exist in your cart\n");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}
	}

	/**
	 * This method is used to show items of the  cart.
	 */
	public void showCart(){
		if(item.size()==0){
			System.out.println("There is no item in the cart\n");
		}
		for (int i=0; i<item.size(); i++){
			System.out.println(item.get(i)+"\t\t"+quantity.get(i)+"\t\t"+price.get(i)+"\n");
	}
	}

	/**
	 * This method is used to generate bill of the items avaiable in the cart.
	 * @param itemList it is list which stores all items present in shop.
	 */
	public void generateBill(ArrayList<Item> itemList){
		double sum=0;
		if(item.size()==0){
			System.out.println("Firstly add some items into cart\n");
		
		}
		else{
			System.out.println("ITEMNAME\tQUANTITY\tCOST");
			for (int i=0; i<item.size(); i++){
				Iterator<Item> itr=itemList.iterator();
				System.out.println(item.get(i)+"\t\t"+quantity.get(i)+"\t\t"+price.get(i)*quantity.get(i));
				sum+=price.get(i)*quantity.get(i);
			}
			System.out.println("Total cost = "+sum+"\n");
		}

	}

	/**
	 * It is main method which is using above methods.
	 * @param args unused
	 */
	public static void main(String args[]){
		ShoppingCart object=new ShoppingCart();
		ArrayList<Item> itemList=new ArrayList<Item>();

		System.out.println("avaiable items in shop");
		itemList.add(new Item(1,"Book",100.00));
		itemList.add(new Item(2,"Bat",200.00));
		itemList.add(new Item(3,"pen",5.00));
		itemList.add(new Item(4,"Pencil",5.00));

		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		try{
			do{
				System.out.println("Choose the action want to do\n");
				System.out.println("1.Add in the cart");
				System.out.println("2.Update the cart");
				System.out.println("3.Show items in the cart");
				System.out.println("4.Generate Bill");
				System.out.println("5.Wants to exit");
	
				int choice=sc.nextInt();
	
				switch(choice){
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
						exit=true;
						System.out.println("Successfully exited");
						break;
					default:
						System.out.println("Invalid choice");
				}
	
			}while(!exit);
		}
		catch(Exception e){
			System.out.println("Invalid input");
		}

	}
}