package Abstraction;
import java.util.*;
public class Circle {

	Scanner scan = new Scanner(System.in);
	
	double area;
	int r;
	
	void acceptInput ()
	{
		System.out.println("Enter the Radius of Circle ");
		r=scan.nextInt();
	}
	
	void compute ()
	{
		area =(double) (Math.PI*Math.pow(r, 2));
	}
	
	void area ()
	{
		System.out.println("Formila, Area = 3.141 x r x r");
		System.out.println("Area of Circle is = "+area);
	}
}
















