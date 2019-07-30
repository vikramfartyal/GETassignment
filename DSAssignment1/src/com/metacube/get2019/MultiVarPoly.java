package com.metacube.get2019;

public class MultiVarPoly {

	Node head;

	class Node {

		int data;
		Node right;
		Node down;

		Node() {
		}

		Node(int data) {
			this.data = data;
			right = null;
			down = null;
		}

	}

	public void createLinkList(int coeff, int[] expoArr) {
		Node newNode = new Node(coeff);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.right != null) {
				temp = temp.right;
			}
			temp.right = newNode;
		}
		for (int i = 1; i < expoArr.length ; i++) {
			Node newNode1 = new Node(expoArr[i]);
			newNode.down = newNode1;
			newNode = newNode1;
		}

	}
	
	public void show() {
		Node temp = head;
		if (head == null) {
			System.out.println("No elements are in the list!!!");
			return;
		}
		System.out.println("LINKED LIST  : ");
		while(temp != null) {
			System.out.print(temp.data + "->");
			Node temp1= temp.down;
			while (temp1 != null) {
				System.out.print(temp1.data + "->");
				temp1 = temp1.down;
			}
			temp = temp.right;
			System.out.println();
		}
	}
	
	public void findDegree() {
		int max = 0;
		if (head == null) {
			System.out.println("No items in the list!!!");
			return;
		}
		Node temp = head;
		while (temp != null) {
			int sum = 0;
			Node temp1 = temp;
			while (temp1.down != null) {
				sum = sum + temp1.down.data;
				temp1 =temp1.down;
			}
			if (sum > max) {
				max = sum;
			}
			temp = temp.right;
		}
		System.out.println("--------------------------------------------");
		System.out.println("Degree of polynomial : "+max);
		System.out.println("--------------------------------------------");
	}
}