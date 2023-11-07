package Array;
import java.util.*;
public class SumOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] arr1 =new int [3];
		int [] arr2 =new int [3];
		
		int sum = 0;
		
		System.out.println("Enter the first Element");
		for ( int i = 0; i <= arr1.length-1; i++)
		{
			arr1[i] = scan.nextInt();
		}
		
		
		System.out.println("Enter the sec Element");
		for ( int i = 0; i <= arr1.length-1; i++)
		{
			arr2[i] = scan.nextInt();
			sum=arr1[i]+arr2[i];
		}

		System.out.println(sum);
	}

}















































