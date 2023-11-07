package Programming;
import java.util.*;
public class GeneratePrimeNum {
public static void main(String[] args) {
	Scanner scan  = new Scanner (System.in);
	
	System.out.println("Enter the Number");
	int n = scan.nextInt();
	int count=0;
	
	for (int i=1;i<=n;i++)
	{
		for (int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(i+" is Prime Number");
		}
		count=0;
	}
	
	
}
}
