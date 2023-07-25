package com.infogalaxy.datastructure;

import java.awt.Choice;
import java.util.Scanner;

public class DoubleEndedQueueDemo {

	int queue[] = new int[5];
	int front = -1;
	int rear = -1;
	Scanner scanner = new Scanner(System.in);
	
	public void front_insert() {
		if(front == -1 && rear == -1) {
			front = rear = 0;
			System.out.println(" Enter the Number to Add in Queue from FRONT = ");
			int no = scanner.nextInt();
			queue[front] = no;
		} else if((front == 0 && rear == queue.length-1) || (front == rear) || (front == 0)) {
			System.out.println("Queue is Full or Front is Not Allowed.");
		} else {
			front--;
			System.out.println("Enter the Number to Add in Queue from FRONT = ");
			int no = scanner.nextInt();
			queue[front] = no;
		}
		
	}
	
	public void rear_insert() {
		if(front == -1 && rear == -1) {
			front = rear = 0;
			System.out.println("Enter the Number to Add in Queue from REAR ==> ");
			int no = scanner.nextInt();
			queue[front] = no;
		} else if(rear == queue.length - 1) {
			System.out.println("Rear is Reached at End of Queue");
		} else {
			rear++;
			System.out.println("Enter the Number to Add in Queue from REAR ==> ");
			int no = scanner.nextInt();
			queue[rear] = no;
		}
	}
	
	public void front_delete() {
		if(front == -1 && rear == -1) {
			System.out.println("Queue is Empty, Can Not Delete Element");
		} else {
			System.out.println("Element Deleted ==>"+queue[front]);
			front++;
		}
	}
	
	public void rear_delete() {
		if(front == -1 && rear == -1) {
			System.out.println("Queue is Empty, Can Not Delete Element");
		} else {
			System.out.println("Element Deleted:"+queue[rear]);
			rear--;
		}		
	}
	
	public void display() {
		for(int i = front; i <= rear; i++) {
			System.out.print("   "+queue[i]);
		}
	}
	
	public static void main(String[] args) {
		DoubleEndedQueueDemo DEQUE = new DoubleEndedQueueDemo();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("***** DOUBLE ENDED QUEUE *****");
			System.out.println("\n1. INSERT FROM FRONT \n2. INSERT FROM REAR \n3. DELETE FROM FRONT \n4. DELETE FROM REAR \n5. DISPLAY \n6. EXIT");
			System.out.println("Enter the Operation ==> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: DEQUE.front_insert();
				    break;
			case 2: DEQUE.rear_insert();
				    break;
			case 3: DEQUE.front_delete();
				    break;
			case 4: DEQUE.rear_delete();
				    break;
			case 5: DEQUE.display();
				    break;
			case 6: System.out.println("EXIT CODE");
				    break;
			default:System.out.println("Invalid Operation");
				    break;
			}
		}while(choice!=6);
	}
}

