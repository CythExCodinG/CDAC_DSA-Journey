package com.generic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQueueNew<T> implements Queue<T> {
	private T[] queueArray=null;
	private int front=-1;
	private int back=-1;
	
	@SuppressWarnings("unchecked")
	@Override
	public void enQueue(T element) {
		// TODO Auto-generated method stub
		if(queueArray==null) {
			queueArray=(T[])new Object[5];
		}
		if(!isFull()) {
	
		queueArray[++back]=element;
		}
	}

	@Override
	public T deQueue() throws Exception{
		// TODO Auto-generated method stub
		if(!isEmpty()) {
		T removed=queueArray[++front];
			return removed;
		}
		System.out.println("Queue is empty");
		throw new Exception("Queue is empty");
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(back==queueArray.length-1) return true;
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front==back) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public void display() {
		System.out.print("Front===> ");
		System.out.print(Arrays.toString(queueArray));
		System.out.println("<====Back");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
