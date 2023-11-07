package MultiThread;
import java.util.*;
public class Program extends Thread{
	Scanner scan=new Scanner (System.in);
	
	public void run()
	{
		try
		{
			if(Thread.currentThread().getName().equals("BANK"))
			{
				banking();
			}
			else if(Thread.currentThread().getName().equals("ADD"))
			{
				add();
			}
			else
			{
				print();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		void banking()
		{
			try
			{
			System.out.println("Banking Started");
			System.out.println("Enter your AC No");
			int an=scan.nextInt();
			System.out.println("Enter your Password");
			int pw=scan.nextInt();
			Thread.sleep(5000);
			System.out.println("Collect your Money");
			System.out.println("Banking Ended");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		void add()
		{
			try 
			{
				System.out.println("Addition Started");
				int a=10,b=20;
				int c=a+b;
				System.out.println(c);
				Thread.sleep(5000);
				System.out.println("Addition Ended");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		void print()
		{
			try
			{
				System.out.println("Printing Started");
				for (int i=0;i<=5;i++)
				{
					System.out.println(i);
					Thread.sleep(5000);
				}
				System.out.println("Printing Ended");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}
}


















