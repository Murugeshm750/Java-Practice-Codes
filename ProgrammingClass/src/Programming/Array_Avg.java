package Programming;
import java.util.*;
public class Array_Avg {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of an Array");
		int size =scan.nextInt();
		
		int[]arr= new int[size];
		int count=0;
		int sum=0;
		int avg=0;
		
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter an Element to Store");
			int elem=scan.nextInt();
			count++;
		
			
		}
		System.out.println(count);
		System.out.println(avg);
	
	}

}
