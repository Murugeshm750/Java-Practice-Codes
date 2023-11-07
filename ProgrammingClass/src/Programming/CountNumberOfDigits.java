package Programming;

import java.util.Scanner;

public class CountNumberOfDigits {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int count=0;
	int arr[]= {1,2,3,4,5,6,0};
	
	for(int i=1;i<=arr.length;i++)
	{
		if(i>=0)
		{
		count++;
		}
	}
	System.out.println(count);
}
}
