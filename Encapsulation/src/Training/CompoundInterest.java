package Training;
import java.util.*;
public class CompoundInterest {
	Scanner scan = new Scanner (System.in);
	double p,r,ci,n,a,b,c,add,sub,mul,div;
	
	void getData()
	{
		System.out.println("Enter the principle Amount :");
		p=scan.nextFloat();
		System.out.println("Enter the time :");
		n=scan.nextFloat();
		System.out.println("Enter Rate of interest :");
		r=scan.nextFloat();
		/*System.out.println("value 1");
		a=scan.nextInt();
		System.out.println("value 2");
		b=scan.nextInt();*/
	}
	void compute ()
	{
		/*add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;*/
		ci=(double) (p*(Math.pow(1+r/100, n))-p);
	}
	void disp()
	{
		/*System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);*/
		System.out.println(ci);
	}
	public static void main(String[] args) {
		CompoundInterest ci =new CompoundInterest();
		ci.getData();
		ci.compute();
		ci.disp();
		
	}
}

















