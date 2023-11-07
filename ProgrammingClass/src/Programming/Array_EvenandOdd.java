package Programming;
import java.util.*;
public class Array_EvenandOdd {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	
	System.out.println("Enter Size of Array");
	int size=scan.nextInt();
	
	int arr[]= new int[size];
	

	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the element"+ i);
		arr[i]=scan.nextInt();

	}
	for(int i=0;i<=arr.length-1;i++)
	{
		int temp=arr[i];
		if(temp%2==0)
		{
			System.out.println("The odd number is "+arr[i]);
		}
		else
		{
			
		}
			
	}

	

}

}
