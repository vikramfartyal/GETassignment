package com.metacube.get2019;

/**
 * It is an interface for priority queue.
 * @author Khushi
 *
 */
public interface PriorityQueue {

	public void enqueue(int data, int priority);
	public int getHighestPriority();
	public int dequeue();
	public boolean isFull();
	public boolean isEmpty();
}
