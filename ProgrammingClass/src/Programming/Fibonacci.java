package Programming;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int a=-1;
		int b=1;
		int c;
		System.out.println("Enter the length");
		int len=scan.nextInt();
		for (int i=0;i<=len;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		
		}
	}

}
