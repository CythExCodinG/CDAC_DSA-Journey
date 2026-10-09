package com.Stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack nStack=new ArrayStack();
//		nStack.push(1);
//		nStack.push(2);
//		nStack.push(3);
//		nStack.push(4);
//		nStack.push(5);
//		System.out.println(nStack.pop());
//		if(nStack.isEmpty()) {
//			System.out.println("stack is empty");
//			
//		}
//		
//		if(nStack.isFull()) {
//			System.out.println("stack is full");
//		}
		int choice=0;
		Scanner scanner=new Scanner(System.in);
		do {
            System.out.println("\n--- STACK OPERATIONS MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty?");
            System.out.println("5. Is Full?");
            System.out.println("6. Display Stack");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            
             choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    nStack.push();
                    break;
                case 2:
                	System.out.println(nStack.pop());
                    break;
                case 3:
                	System.out.println("PEEK==>"+ nStack.peek());
                    break;
                case 4:
                	if(nStack.isEmpty()) {
                		System.out.println("Stack is empty");
                	}
                    break;
                case 5:
                	if(nStack.isFull()) {
                		System.out.println("Stack is full");
                	}
                    break;
                case 6:
                	nStack.display();
                    break;
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose between 1 and 7.");
            }
        } while (choice != 7);
	scanner.close();	
	}

}
