package Abstraction;
import java.util.*;
class Square {
	Scanner scan = new Scanner (System.in);
	int a1,a2;
	int area;
	
	
	void acceptInput ()
	{
		System.out.println("Enter the side one of Square");
		a1=scan.nextInt();
		System.out.println("Enter the side two of Square");
		a2=scan.nextInt();		
	}
	
	void compute ()
	{
		area=a1*a2;
	}
	
	void area()
	{
		System.out.println("Formula, Area = a x a");
		System.out.println("Area of Square is = "+area);
	}

}
















