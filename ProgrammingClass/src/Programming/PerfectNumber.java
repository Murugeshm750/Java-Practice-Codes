package Programming;
import java.util.*;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Enter a number");
		int n =scan.nextInt();
		
		int count=0;
		
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count+=i;
			}
		}
		if (count==n)
		{
			System.out.println(n+" is Perfect Number");
		}
		else
		{
			System.out.println(n+" is not Perfect Number");
		}
	}

}
