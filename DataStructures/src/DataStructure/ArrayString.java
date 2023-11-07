package DataStructure;
import java.util.*;
public class ArrayString 
{
	private Scanner scan = new Scanner (System.in);
	private String arr[];
	
	public ArrayString (int n)
	{
		arr= new String[n];
	}
	public void Insert ()
	{
		System.out.println("Enter the position from 0 to "+(arr.length));
		int pos=scan.nextInt();
		System.out.println("Enter the String ");
		String names=scan.next();
		arr[pos]=names;
	}
	
	public void Delete ()
	{
		System.out.println("Enter the position to delete the String");
		int pos=scan.nextInt();
		System.out.println("the deleted String is "+arr[pos]);
		arr[pos]=null;
	}
	
	public void Display ()
	{
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println(i+"."+arr[i]+" ");
		}
		System.out.println();
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
