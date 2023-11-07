package pattern;
import java.util.*;
public class PatternM {
public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	    System.out.println("Enter value");
	
	int n=scan.nextInt();
	System.out.println("Alpha-----A");
	
	for (int i=0;i<=n;i++)
	{
		for (int j=0;j<=n;j++)
		{
			if(i==0 ||j==0 ||i==5|| j==10 )
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	System.out.println("Alpha-----B");
	
	for (int i=0;i<=n;i++)
	{
		for (int j=0;j<=n;j++)
		{
			if(i==0 ||j==0 ||i==5|| j==10 || i==10)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	
	System.out.println("Alpha-----C");
	for (int i=0;i<=n;i++)
	{
		for (int j=0;j<=n;j++)
		{
			if(i==0 ||j==0 || i==10)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	
	System.out.println("Alpha-----D");
	for (int i=0;i<=n;i++)
	{
		for (int j=0;j<=n;j++)
		{
			if(i==0 ||j==0 ||j==10 || i==10)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	
	System.out.println("Alpha-----E");
	for (int i=0;i<=n;i++)
	{
		for (int j=0;j<=n;j++)
		{
			if(i==0 ||j==0 ||i==5|| i==10)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	
	System.out.println("Alpha-----F");
	for (int i=0;i<=n;i++)
	{
		for (int j=0;j<=n;j++)
		{
			if(i==0 ||j==0 ||i==5 )
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	
	System.out.println("Alpha-----G");
	
	for (int i=0;i<=n;i++)
	{
		for (int j=0;j<=n;j++)
		{
			if(i==0 ||j==0 ||i==5 )
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
}
}










