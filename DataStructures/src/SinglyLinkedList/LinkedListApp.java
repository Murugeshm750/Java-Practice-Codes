package SinglyLinkedList;

import java.util.Scanner;

public class LinkedListApp {
public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	
	LinkedList ll =new LinkedList();
	while(true)
	{
		System.out.println("Press 1---> InsertRear");
		System.out.println("Press 2---> DeleteRear");
		System.out.println("Press 3---> InsertFront");
		System.out.println("Press 4---> DeleteFront");
		System.out.println("Press 5---> Display");
		System.out.println("Press Any to Exit");
		System.out.println("Enter your Choice");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		case 1: ll.insertRear();
		break;
		
		case 2: ll.deleteRear();
		break;
		
		case 3: ll.insertFront();
		break;
		
		case 4: ll.deleteFront();
		break;
		
		case 5: ll.display();
		break;
		
		default : System.exit(0);
		}
	}
}
}




















