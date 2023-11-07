package MultiThread;

public class MsWord extends Thread {
	public void run()
	{
		if(getName().equals("CHECK"))
		{
			check();
		}
		else if(getName().equals("TYPE"))
		{
			typing();
		}
		else
		{
			print();
		}
	}
	void check()
	{
		try
		{
			for (int i=0;i<=5;i++)
			{
				System.out.println("Spell Checking");
				Thread.sleep(5000);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void typing()
	{
		try
		{
			for ( ; ; )
			{
				System.out.println("Typing");
				Thread.sleep(5000);
			}
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
			for ( ; ; )
			{
				System.out.println("Printing");
				Thread.sleep(5000);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
