package BeginnerJava;

import java.util.Scanner;

public class BussinessMan {
	float p,t,si;
	static float r;
	static {
		r = 2.5f;
	}
	void getData() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the money");
		p =scan.nextFloat();
		System.out.println("Enter the duration");
		t =scan.nextFloat();
	}
	void compute() {
		si=(p*t*r)/100;
	}
	void display() {
		System.out.println("The simple intrest is:"+si);
	}
}
