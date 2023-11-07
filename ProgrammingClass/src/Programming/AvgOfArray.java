package Programming;

import java.util.Scanner;

public class AvgOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Length");
		int len =scan.nextInt();
		
		int arr[]=new int[len];
		int sum=0;
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter an Element");
			arr[i]=scan.nextInt();
			
			sum=sum+arr[i];
		}
		System.out.println("The Average is "+sum/len);
	}

}
