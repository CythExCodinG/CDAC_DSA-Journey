package com.Queue;

import com.generic.ArrayQueueNew;

public class Program {
	public static void main(String[] args) {
		Queue arrQueue=new ArrayQueue();
		
		arrQueue.enQueue();
		arrQueue.enQueue();
		arrQueue.enQueue();
		arrQueue.enQueue();
		arrQueue.display();
		
		System.out.println("Dequeue");
		System.out.println(arrQueue.deQueue());
		System.out.println(arrQueue.deQueue());
		System.out.println(arrQueue.deQueue());
		System.out.println(arrQueue.deQueue());
		
	}
}
