package Training;

import java.util.Scanner;

public class Application1 {
	Scanner scan= new Scanner(System.in);
	static float p,t,r,si;
	static
	{
		r = 2.5f;
	}
	void acceptInput ()
	{
		System.out.println("Enter the Principle amount :");
		p=scan.nextFloat();
		System.out.println("Enter the time duration :");
		t=scan.nextFloat();
	}
	void compute()
	{
		si=(p*t*r)/100;
	}
	void disp ()
	{
		System.out.println(si);
	}
	public static void main(String[] args) {
		Applicatin a=new Applicatin();
		Applicatin a1=new Applicatin();
		a.acceptInput();
		a.compute();
		a.disp();
		a1.acceptInput();
		a1.compute();
		a1.disp();
	}

}
