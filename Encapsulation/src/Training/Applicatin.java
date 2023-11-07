package Training;
import java.util.*;
public class Applicatin {
	Scanner scan= new Scanner(System.in);
	float p,t,r,si;
	void acceptInput ()
	{
		System.out.println("Enter the Principle amount :");
		p=scan.nextFloat();
		System.out.println("Enter the time duration :");
		t=scan.nextFloat();
		r=2.5f;
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




















