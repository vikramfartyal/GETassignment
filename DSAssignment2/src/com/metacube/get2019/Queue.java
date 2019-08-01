package com.metacube.get2019;

public interface Queue {

	public void enqueue(int data);
	public int dequeue();
	public boolean isFull();
	public boolean isEmpty();
}
