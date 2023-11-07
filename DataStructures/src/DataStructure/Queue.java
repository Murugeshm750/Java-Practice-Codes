package DataStructure;
import java.util.*;
public class Queue {
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	
	private Scanner scan= new Scanner (System.in);
	
	public Queue(int n)
	{
		q=new int[n];
		size=q.length;
	}
	
	public void Insert()
	{
		if (r==size-1)
		{
			System.out.println("Insert not possible");
		}
		else
		{
			System.out.println("Enter an Element  "+r);
			int element=scan.nextInt();
			++r;
			q[r]=element;
		}
	}
	
	public void Delete()
	{
		if(r==-1 || f>r)
		{
			System.out.println("Delete no possible");
		}
		else
		{
			System.out.println("Delete element is "+q[f]);
			++f;
		}
	}
	
	public void Display()
	{
		if(r==-1 || f>r)
		{
			System.out.println("Display not possible");
		}
		else
		{
			for(int i=0;i<=r;i++)
			{
				System.out.print(q[i]+" ");
			}
			System.out.println();
		}
	}

}










































