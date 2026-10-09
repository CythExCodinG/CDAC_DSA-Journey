package com.Stack;

import java.util.Scanner;

public class ArrayStack implements Stack{
	private int[] stackArray;
	private int count=0;
	private int top=-1;
	
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return -1;
		}
		return stackArray[top--];
	}
	@Override
	public int peek() {
		// TODO Auto-generated method stub
		
		return stackArray[top];
	}
	@Override
	public void push() {
		Scanner scanner=new Scanner(System.in);

		// TODO Auto-generated method stub
		if(stackArray==null) {
			this.stackArray=new int[5];
		}
		if(isFull()) {
			int arr[]=new int[stackArray.length+1];
			int index=0;
			for(int i:stackArray) {
				arr[index]=stackArray[index++];
			}
			stackArray=arr;
		}
		System.out.println("Enter element to push into stack :");
		int element=scanner.nextInt();
		stackArray[++top]=element;
		count++;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top==-1) {
			return true;
		}
		return false;
	}
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(top==stackArray.length-1) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		int temp=top;
		System.out.println("TOP==>"+stackArray[top--]);
		for(int i=1;i<count-1;i++) {
			System.out.println(stackArray[top--]);
		}
		System.out.println(stackArray[top]);
		top=temp;
	}
	
	
}
