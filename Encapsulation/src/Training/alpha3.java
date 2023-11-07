package Training;
import java.util.*;
public class alpha3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Legth");
		int n=scan.nextInt();
		for  (int i=0; i<n; i++)
		{
			for (int j=0; j<=n; j++)
			{
				if (i==0 || j==0 ||i==(n-1) || i==(n/2) )
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}

}
