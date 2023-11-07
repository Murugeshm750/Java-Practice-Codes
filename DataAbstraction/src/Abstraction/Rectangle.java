package Abstraction;
import java.util.*;
public class Rectangle {
	Scanner scan = new Scanner (System.in);
	
	int l,b;
	int area;
	
	void aceeptInput ()
	{
		System.out.println("Enter the Length of Rectangle");
		l=scan.nextInt();
		System.out.println("Enter the Breadth of Rectangle");
		b=scan.nextInt();
	}
	
	void compute ()
	{
		area = l*b;
	}
	
	void area ()
	{
		System.out.println("Formula, Area = L x b");
		System.out.println("Area of Rectangle is = "+area);
	}

}
