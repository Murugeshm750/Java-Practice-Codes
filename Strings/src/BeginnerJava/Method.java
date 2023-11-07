package BeginnerJava;
import java.util.*;
public class Method {
	Scanner scan = new Scanner (System.in);
	int x,y;
	void add()
	{
		System.out.println("value 1");
		int a= scan.nextInt();
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}
	void sub (int a, int b)
	{
		int c = a-b;
		System.out.println(c);
	}
	int mul()
	{
		int a=10;
		int b=10;
		int c = a*b;
		return c;

	}
	int div (int a, int b)
	{
		int c =a/b;
		return c;
	}
	String checkEvenOdd(long num) {
		if((num % 2) == 0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	String checkPosNeg(long num) {
		if(num >= 0) {
			return "positive";
		}
		else {
			return "negative";
		}
	}
}




























