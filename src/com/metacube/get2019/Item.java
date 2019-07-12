package com.metacube.get2019;

/**
 * Item class is used to create items with three attributes id, itemname and price
 * @author Admin
 *
 */
class Item
{
	int itemId;
	String itemName;
	double itemPrice;
	

	/**
	 * This is constructor used to set values of 3 attributes and to print them.
	 * @param id This is first parameter to set id of item
	 * @param itemName this is second parameter to set itemname
	 * @param price this is third parameter to set price of item
	 */
	public Item (int itemId, String itemName, double itemPrice) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		System.out.println(itemId+"\t\t"+itemName+"\t\t"+itemPrice);
	}
	
	/**
	 * This method is used to return value of itemname
	 * @return string type itemname
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * This method is used to return value of id.
	 * @return id of item
	 */
	public int getid() {
		return itemId;
	}

	/**
	 * This method is used to return the price of the item.
	 * @return price of item
	 */
	public double getprice() {
		return itemPrice;
	}
}

