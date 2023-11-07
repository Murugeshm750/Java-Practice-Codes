package Exception;

public class BankPin {
	void initiate()
	{
		AtmPin atmpin =new AtmPin();
		try
		{
			atmpin.inputAC();
			atmpin.inputMB();
			atmpin.inputOTP();
			atmpin.inputPASS();
		}
		catch(Exception e)
		{
			try
			{
				System.out.println("Attempt 1");
				atmpin.inputAC();
				atmpin.inputMB();
				atmpin.inputOTP();
				atmpin.inputPASS();
			}
			catch(Exception e1)
			{
				try
				{
					System.out.println("Attempt 2");
					atmpin.inputAC();
					atmpin.inputMB();
					atmpin.inputOTP();
					atmpin.inputPASS();
				}
				catch(Exception e2)
				{
					System.out.println("Apply New Card !!!");
				}
			}
			
		}
	}
}






















