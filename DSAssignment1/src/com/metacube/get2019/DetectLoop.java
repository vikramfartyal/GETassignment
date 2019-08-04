package com.metacube.get2019;

/**
 * It is a class which is used to detect a loop in the linked list
 * @author Khushi
 *
 */
public class DetectLoop extends Node{

	Node head;
	Node lastNode;

	/**
	 * It is a method used to check whether there is a loop in linked list or not.
	 * @return boolean value
	 */
	
	public boolean detectLoop(Node slowPtr, Node fastPtr) {
		if (slowPtr != null && fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				return true;
			}
			else {
				return detectLoop(slowPtr, fastPtr);
			}
		}
		return false;
	}
	/*public boolean detectLoop() {
		
		if (head == null) {
			System.out.println("No elements are there in the list!!!");
			return false;
		}
		Node slowPtr = head;
		Node fastPtr = head;
		while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}*/
	
	/**
	 * It is method used to insert an element at the starting of linked list.
	 * @param data element to be inserted.
	 */
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			lastNode = head;
			return;
		}
		lastNode.next = newNode;
		lastNode = newNode;

	}
	
	/**
	 * It is used to create a loop into the linked list at kth position.
	 * @param k position where to create a loop.
	 */
	public void makeLoop(int k) {
		int count = 1;
		if (head == null) {
			System.out.println("---------------------------------------");
			System.out.println("No items in  the list!!!");
			System.out.println("---------------------------------------");
			return;
		}
		Node temp = head;
		while (count != k) {
			if (temp == null) {
				System.out.println("---------------------------------------");
				System.out.println("No further items in the list!!!!");
				System.out.println("---------------------------------------");
				return;
			}
			temp = temp.next;
			count++;
		}
		lastNode.next = temp;
	}
	
	/**
	 * It is a method to return head.
	 * @return head of linked list.
	 */
	public Node getHead() {
		return head;
	}
	
	/**
	 * It is a method used to show elements of a linked list.
	 */
	public void show(Node temp) {
		if (temp != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
			show(temp);
		}
	}
 
}
