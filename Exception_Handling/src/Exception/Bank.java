package Exception;

public class Bank {
	
	void initiate()
	{
		ATM atm = new ATM();
		try
		{
			atm.acceptInput();
			atm.verify();
		}
		catch(Exception e)
		{
			try
			{
				System.out.println("Attempt 1");
				System.out.println("Please Enter Valid Account No and Password");
				atm.acceptInput();
				atm.verify();
			}
			catch(Exception e1)
			{
				try
				{
					System.out.println("Attempt 2");
					System.out.println("Please Enter Valid Account No and Password");
					atm.acceptInput();
					atm.verify();
				}
				catch(Exception e2)
				{
					System.out.println("Your Card Blocked Good Bye !!!");
				}
			}
		}
	}

}























