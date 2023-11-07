package Programming;
import java.util.*;
public class Triangle {
	Scanner scan = new Scanner (System.in);
	
	void input()
	{
		
			System.out.println("Enter Side 1 value of Trianlge");
			int a=scan.nextInt();
			System.out.println("Enter Side 2 value of Trianlge");
			int b=scan.nextInt();
			System.out.println("Enter Side 3 value of Trianlge");
			int c=scan.nextInt();
			/*/
			if(a+b>c && b+c>c && a+c>b)
			{
				System.out.println("Equitriangle");
			}
			else if (a+b>c || b+c>c != a+c>b)
			{
				System.out.println("Isoceles");
			}
			else 
			{
				System.out.println("invalid");
			}
		*/
			if(a+b>c && b+c>a && a+c>b)
			{
			if( a==b && b == c)
			{
				System.out.println("Equilateral triangle");
			}
			else if (a==b || b==c||c==a)
			{
				System.out.println("Isoceles");
			}
			else 
			{
				System.out.println("Scalen");
			}
			}
			else
			{
				System.out.println("Invalid");
			}
			
	}
}










