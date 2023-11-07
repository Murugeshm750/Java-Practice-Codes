package Interface;
import java.util.*;
class Calc1 implements Calculator {
	Scanner scan = new Scanner (System.in);
	
	int a,b,c;
	public void add()
	{
		System.out.println("Value 1");
		a=scan.nextInt();
		System.out.println("Value 2");
		b=scan.nextInt();
		c=a+b;
		System.out.println(c);
		
	}


	public void sub() {
		System.out.println("Value 1");
		a=scan.nextInt();
		System.out.println("Value 2");
		b=scan.nextInt();
		c=a-b;
		System.out.println(c);
	}

	public void mul() {
		System.out.println("Value 1");
		a=scan.nextInt();
		System.out.println("Value 2");
		b=scan.nextInt();
		c=a*b;
		System.out.println(c);
	}

	public void div() {
		System.out.println("Value 1");
		a=scan.nextInt();
		System.out.println("Value 2");
		b=scan.nextInt();
		c=a/b;
		System.out.println(c);
	}

}
