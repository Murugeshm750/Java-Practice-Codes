package Exception;
import java.util.*;
public class Program1{ 
	Scanner scan = new Scanner (System.in);
	
	void activity1 () throws Exception
	{
		try
		{
			System.out.println("Connection 3 is Started");
			System.out.println("Enter Numerator");
			int a=scan.nextInt();
			System.out.println("Enter Denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);

		}
		catch (Exception e)
		{
			
			System.out.println("Exception is Handled activity 1");
			throw e;
		}
		finally
		{
		System.out.println("Connection 3 is Ended");
		}

	}
}




