package com.metacube.get2019;

/**
 * It is a class used to implement operations need to rotate a linked list.
 * @author Khushi
 *
 */
public class RotateLinkList extends Node {

	Node head;
	Node lastNode;

	/**
	 * It is a method used to rotate a subList of a linked list
	 * @param left left position of sublist.
	 * @param right right position of sublist.
	 * @param numberOfRotation number of rotation of linked list.
	 */
	public void rotateLinkList(int left, int right, int numberOfRotation) {
		Node temp = new Node();
		Node temp1 = new Node();
		Node temp2 = new Node();
		Node prev = new Node();

		int count = 0;

		if (head == null) {
			System.out.println("Empty list");
			return;
		} else {
			while (count != numberOfRotation) {
				temp = head;
				temp1 = head;
				prev = head;
				int count1 = 1;
				int count2 = 1;
				while (count1 != left) {
					if (temp == null) {
						System.out.println("---------------------------------------");
						System.out.println("No further items in the list!!!");
						System.out.println("---------------------------------------");
						return;
					}
					prev = temp;
					temp = temp.next;
					count1++;
				}
				while (count2 != right) {
					if (temp1 == null) {
						System.out.println("---------------------------------------");
						System.out.println("No further items in the list!!!");
						System.out.println("---------------------------------------");
						return;
					}
					temp1 = temp1.next;
					count2++;
				}
				temp2 = temp.next;
				temp.next = temp1.next;
				temp1.next = temp;
				prev.next = temp2;
				count ++;
			}
		}
	
	}
	
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
