package Programming;
import java.util.*;
public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//Given Number Amstrong or Not
		System.out.println("Enter Number");
		int num=scan.nextInt();
		
		//Check the number is three digit
		if(num>=100 && num<=999)
		{
			
		int temp=num;
		int d1,d2,d3;
		
		d3=temp%10;
		temp=temp/10;
		
		d2=temp%10;
		temp=temp/10;
		
		d1=temp%10;
		int result=(d3*d3*d3)+(d2*d2*d2)+(d1*d1*d1);
		
		
		if (num==result)
		{
			System.out.println(num+" is Amstrong Number");
		}
		else
		{
			System.out.println(num+" is not Amstrong Number");
		}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}

}




















