package Programming;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter year");
		int year = scan.nextInt();
		
		boolean LeapYear =true;
		
		if (year>=1000 && year<=9999)
		{
			System.out.println(year+" is four digit Number");
		}
		else
		{
			System.out.println("Invalid Number");
			System.exit(0);
		}
		
		if (year%4==0)
		{
			if (year%100==0)
			{
				if (year%400==0)
				{
					LeapYear=true;
				}
				else
				{
					LeapYear=false;
				}
			}
			else
			{
				LeapYear=true;
			}
		}
		else
		{
			LeapYear=false;
		}
		
		
		if (LeapYear==true)
		{
			System.out.println(year+"  is Leap Year");
		}
		else
		{
			System.out.println(year+" is not Leap Year");
		}
		
		
	}

	
	
	
}






















