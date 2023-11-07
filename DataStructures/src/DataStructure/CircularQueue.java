package DataStructure;
import java.util.*;
public class CircularQueue {
	
	// First Declare variable
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	private Scanner scan = new Scanner (System.in);
	
	public CircularQueue(int n)
	{
		cq= new int[n];
		size=cq.length;
		
	}
	//Inert the Element in Circular Array
	public void Insert()
	{
		if(count==size)
		{
			System.out.println("Insert nor possible");
		}
		else
		{
			System.out.println("Enter an Element "+count);
			int elem=scan.nextInt();
			r=(r+1)%size;
			cq[r]=elem;
			count++;
		}
	}
	
	//Delete The Elemnt in Circular Array
	public void Delete()
	{
		if(count==0)
		{
			System.out.println("Delete not possible");
		}
		else
		{
			System.out.println("Deleted Element is  "+cq[f]);
			f=(f+1)%size;
			count--;
		}
	}
	
	//Display the Stored Element
	public void Display()
	{
		int f1=f;
		if(count==0)
		{
			System.out.println("Display not possible");
		}
		else
		{
			for(int i=0;i<=count;i++)
				{
					System.out.print(cq[f1]+" ");
					f1=(f1+1)%size;
				}
			System.out.println();
		}
	}
	public static void main(String[] args) 
{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the Size of an Array");
		int n=scan.nextInt();
		
		CircularQueue cq =new CircularQueue(n);
		
		while(true)
		{
			System.out.println("Press 1 ---> Insert");
			System.out.println("Press 2 ---> Delete");
			System.out.println("Press 3 ---> Display");
			System.out.println("Press Any Number Exit....!");
			System.out.println("Enter yor Choice");
			int choice=scan.nextInt();
			
			switch(choice)
			{
			case 1: cq.Insert();
			break;
			
			case 2: cq.Delete();
			break;
			
			case 3: cq.Display();
			break;
			
			default: System.out.println("Test Completed...!");
			System.exit(0);
			}
		}
	}
	
	
	
}














