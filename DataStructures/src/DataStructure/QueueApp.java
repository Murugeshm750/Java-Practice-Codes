package DataStructure;
import java.util.*;
public class QueueApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the size of Queue");
		int n= scan.nextInt();
		
		Queue q = new Queue(n);
		
		while (true)
		{
			System.out.println("**************************");
			System.out.println("Press 1------> Insert");
			System.out.println("Press 2------> Delete");
			System.out.println("Press 3------> Display");
			System.out.println("Press Any Number ----> Exit");
			System.out.println("**************************");

			System.out.println("Enter your choice");
			int choice =scan.nextInt();
			
			switch(choice)
			{
			case 1: q.Insert();
			break;
			
			case 2 : q.Delete();
			break;
			
			case 3: q.Display();
			break;
			
			default :System.out.println("----End-----");
				System.exit(0);
			
			}
		}
		
		
	}

}












