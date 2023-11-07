package Programming;

import java.util.Scanner;

public class SumOfNatural {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int sum=0;
		
		for(int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of Natural Number is "+sum);
	}

}
