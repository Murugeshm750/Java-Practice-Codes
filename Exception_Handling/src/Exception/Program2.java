package Exception;

public class Program2 {
	
	void activity2()
	{
		try
		{
		System.out.println("Connection 2 is Started");
		Program1 p1 = new Program1();
		p1.activity1();
		System.out.println();
		}
		catch (Exception e)
		{
			System.out.println("Exception is Handled activity 2");
		}
		System.out.println("Connection 2 is Ended");

	}

}
