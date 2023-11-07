package BeginnerJava;
import java.util.*;
public class App1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Number for 2D Array");
		int n=scan.nextInt();
		int [][]arr=new int[n][n];
		System.out.println("Enter Array Elements ");
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextInt();			}
		}
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
