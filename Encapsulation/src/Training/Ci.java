package Training;

import java.util.Scanner;

public class Ci {
	
	Scanner scan = new Scanner (System.in);

	public void Principle()
	{
		try
		{
		int ci= scan.nextInt();
		System.out.println("Enter Rate of Interest");
		float r=scan.nextFloat();
		System.out.println("Enter Time");
		int t = scan.nextInt();
		
		double p=(double) ((Math.pow(1+r/100, t)/ci));
		System.out.println(p);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void interest()
	{
		System.out.println("Enter Compound interest");
		int ci= scan.nextInt();
		System.out.println("Enter principle");
		int p=scan.nextInt();
		System.out.println("Enter Time");
		int t = scan.nextInt();
		
		
	}
	

}























