package Exception;
import java.util.*;
public class Calculator {
	Scanner scan = new Scanner (System.in);
	
	void add()
	{
		try
		{
			System.out.println("Enter first number to Add");
			int a=scan.nextInt();
			System.out.println("Enter sec number to Add");
			int b=scan.nextInt();
			int c=a+b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception is Handled");
		}
	}
	void sub() throws Exception
	{
		System.out.println("Enter first number to Sub");
		int a=scan.nextInt();
		System.out.println("Enter sec number to Sub");
		int b=scan.nextInt();
		int c=a-b;
		System.out.println(c);
	}
	void div() throws Exception
	{
		try
		{
			System.out.println("Enter first number to Div");
			int a=scan.nextInt();
			System.out.println("Enter sec number to Div");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println("Exception is Handled");
			throw e;
		}
		finally
		{
			System.out.println("Div test completed");
		}
	}
	void mul() throws Exception
	{
		try
		{
			System.out.println("Enter first number to Mul");
			int a=scan.nextInt();
			System.out.println("Enter sec number to Mul");
			int b=scan.nextInt();
			int c=a*b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println("Exception is Handled");
			throw e;
		}
		finally
		{
			System.out.println("Mul test completed");
		}
	}
	
}





















