package com.infogalaxy.datastructure;

import java.util.Scanner;

public class StackDemo {
	
	Scanner scanner = new Scanner(System.in);
	
	int[] stack = new int[5];
	int top = -1;
	
	
	public void push() {
		if(top == stack.length-1) {
			
			System.out.println("Stack is OverFlow. [FULL]");
		} else {
			System.out.println("Enter the Number to Push in Stack:");
			
			int no = scanner.nextInt();
			
			top++;
			stack[top] = no;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is UnderFlow. [EMPTY]");
		} else {
			System.out.println("Element POP = "+stack[top]);
			top--;
		}
	}
	
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String[] args) {
		StackDemo stackDemo = new StackDemo();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {

			System.out.println("***** STACK OPERATIONS *****");
			System.out.println("1. PUSH \n2. POP \n3. DISPLAY \n4. EXIT");
			System.out.println("Enter the Operation Number ==>");
			choice = sc.nextInt();
			
			switch(choice){
				case 1:stackDemo.push();
					   break;
				case 2:stackDemo.pop();
					   break;
				case 3:stackDemo.display();
					   break;
				default:
						System.out.println("Please Enter the Number between 1-3");
					   break;
			}
			
		} while(choice!=4);
	}
	
}
