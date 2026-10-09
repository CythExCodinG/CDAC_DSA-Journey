package com.generic;

public class ProgramNew {
	public static void main(String[] args) throws Exception {
		Queue arrQueue=new ArrayQueueNew();
		
		arrQueue.enQueue(5);
		arrQueue.enQueue(3);
		arrQueue.enQueue(2);
		arrQueue.enQueue(1);
		arrQueue.display();
		
		System.out.println("Dequeue");
		System.out.println(arrQueue.deQueue());
		System.out.println(arrQueue.deQueue());
		System.out.println(arrQueue.deQueue());
		System.out.println(arrQueue.deQueue());
		
	}
}
