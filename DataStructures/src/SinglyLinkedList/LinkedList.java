package SinglyLinkedList;

import java.util.Scanner;

public class LinkedList {
	class Node
	{
		int data;
		Node link;
	}
	private Node first;
	private Scanner scan= new Scanner(System.in);
	
	public void insertRear()
	{
		Node temp;
		System.out.println("Enter an Element");
		int elem=scan.nextInt();
		Node newnode = new Node();
		newnode.data=elem;
		newnode.link=null;
		
		if(first == null)
		{
			first=newnode;
		}
		else
		{
			temp=first;
			while(newnode.link!=null)
			{
				temp=temp.link;
			}
			temp.link=newnode;
		}
	}
	
	public void deleteRear()
	{
		Node temp;
		if(first== null)
		{
			System.out.println("Delete Not Possible");
		}
		else if(first.link==null)
		{
			System.out.println("Delete Element is "+first.data);
			first=null;
			
		}
		else
		{
			temp=first;
			while(temp.link.link!=null)
			{
				temp=temp.link;
			}
			System.out.println("Delete Element is "+ temp.link.data);
			temp.link=null;
		}
	}
	
	public void insertFront()
	{
		System.out.println("Enter an Element");
		int elem=scan.nextInt();
		
		Node newnode =new Node();
		newnode.data=elem;
		newnode.link=null;
		
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			newnode.link=first;
			first=newnode;
		}
	}
	
	public void deleteFront()
	{
		if(first==null)
		{
			System.out.println("Deletion Not Possible");
		}
		else if(first.link==null)
		{
			System.out.println("Deleted Element is "+first.data);
			first=null;
		}
		else
		{
			System.out.println("Deleted Element is "+first.data);
			first=first.link;
		}
	}
	
	public void display()
	{
		Node temp;
		
		if(first==null)
		{
			System.out.println("Display not Possible");
		}
		else if(first.link==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.println();
		}
	}
}






















