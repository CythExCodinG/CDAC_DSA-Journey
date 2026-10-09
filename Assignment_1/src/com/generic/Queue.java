package com.generic;

public interface Queue<T> {
	void enQueue(T element) throws Exception;
	T deQueue() throws Exception;
	boolean isFull();
	public void display();
	boolean isEmpty();
}
