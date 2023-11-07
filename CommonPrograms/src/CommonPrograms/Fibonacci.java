package CommonPrograms;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Length");
		int n=scan.nextInt();
		int a=-1;
		int b=1;
		int c;
		
		for (int i=0;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
