package DataStructure;
import java.util.*;
public class ArrayApp {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the array length");
	int n=scan.nextInt();
	Array a=new Array(n);
	while(true)
	{
		System.out.println("press 1------>  Inserting");
		System.out.println("press 2------>  Deleting");
		System.out.println("press 3------>  Displaying");
		System.out.println("Press any key to exit");
		System.out.println("Enter your Choice");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1: a.Insert();
		break;
		case 2: a.Delete();
		break;
		case 3: a.Display();
		break;
		default : System.exit(0);
		}
	}
}
}

















