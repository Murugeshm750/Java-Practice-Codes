package DataStructure;
import java.util.*;
public class ArrayStringApp {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the length of Array");
	int n=scan.nextInt();
	ArrayString as = new ArrayString (n);
	
	while (true)
	{
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Display");
		System.out.println("Enter any other number to exit");
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		
		switch (choice)
		{
		case 1: as.Insert();
				break;
		case 2: as.Delete();
				break;
		case 3: as.Display();
				break;
		default: System.out.println("bye bye");
			     System.exit(0);
		}
		
	}
			
	}

}



























