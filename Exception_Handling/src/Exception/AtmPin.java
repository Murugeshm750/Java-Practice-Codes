package Exception;
import java.util.*;
public class AtmPin {
	Scanner scan= new Scanner (System.in);
	int accNo,password,otp;
	long mobileN;
	int ac,pw,mn,ot;
	
	void inputAC()
	{
		System.out.println("Enter Your Account Number");
		ac=scan.nextInt();
	}
	void inputMB()
	{
		System.out.println("Enter Your Mobile Number");
		mn=scan.nextInt();
	}
	void inputOTP()
	{
		System.out.println("Enter 6 digit OTP");
		ot=scan.nextInt();
	}
	void inputPASS()
	{
		System.out.println("Enter Your  new Password");
		password=scan.nextInt();
	}
	void verify()throws Exception
	{
		if(ac>=1000 && ac<=9999)
		{
			System.out.println("hiii");
		}
		else if(mn>=10000 && mn<=99999)
		{
			
		}
		else if(ot>=100000 && ot<=999999)
		{
			
		}
		else if(password>=1000 && password<=9999)
		{
			
		}
		else
		{
			InvalidCustomerException ice =new InvalidCustomerException();
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
	/*
	void generate() throws Exception
	{
		if(otp>=100000 && otp<=99999 == true)
		{
			System.out.println("Enter your Password Must 4 digit Number");
			password=scan.nextInt();
			if(password>=1000 && password<=9999)
			{
				System.out.println("Successfully Generated !!!!");
			}
			else
			{
				InvalidCustomerException ice= new InvalidCustomerException();
				ice.getMessage();
				throw ice;
			}
		}
		else
		{
			InvalidCustomerException ice= new InvalidCustomerException();
			ice.getMessage();
			throw ice;
		}
	}
*/
}















