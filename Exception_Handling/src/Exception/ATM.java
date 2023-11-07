package Exception;
import java.util.*;
public class ATM {
	Scanner scan = new Scanner(System.in);
	int accNo=2222,password=7777;
	int an,pw,amount;
	
	void acceptInput()
	{
		System.out.println("Enter Account Number");
		an=scan.nextInt();
		System.out.println("Enter Password");
		pw=scan.nextInt();
	}
	
	void verify() throws Exception
	{
		if(an==accNo && pw==password)
		{
			System.out.println("Enter Amount");
			amount=scan.nextInt();
			System.out.println("Take it and Enjoy "+amount);
		}
		else
		{
			InvalidCustomerException ice =new InvalidCustomerException();
			ice.getMessage();
			throw ice;
		}
	}

}

















