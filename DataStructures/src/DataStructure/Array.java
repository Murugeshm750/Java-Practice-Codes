package DataStructure;

import java.util.Scanner;

public class Array 
{
	private Scanner scan = new Scanner (System.in);
	private int arr[];
	
	public Array (int n)
	{
		arr=new int[n];
	}
	
	public void Insert()
	{
		System.out.println("Enter position from 0 to"+ (arr.length-1));
		int pos=scan.nextInt();
		System.out.println("Enter the Element");
		int elem = scan.nextInt();
		arr[pos]=elem;
	}
	
	public void Delete ()
	{
		System.out.println("Enter the position to delete the element");
		int pos=scan.nextInt()	;
		System.out.println("Element delete is "+arr[pos]);
		arr[pos]=0;
	}
	
	public void Display()
	{
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}