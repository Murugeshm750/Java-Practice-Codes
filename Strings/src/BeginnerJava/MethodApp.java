package BeginnerJava;
import java.util.*;

public class MethodApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Method met = new Method();
		met.add();  // Type 1
		
		System.out.println("value 1");
		int val1= scan.nextInt();
		System.out.println("value 1");
		int val2= scan.nextInt();
		met.sub(val1, val2);  //Type 2
		
		int res= met.mul();  //Type 3
		System.out.println(res);
		
		int res1 = met.div(val1, val2);  //Type 4
		System.out.println(res1);
		
		
		System.out.println("Enter a number");
		long num = scan.nextLong();
		System.out.println(met.checkEvenOdd(num));
		System.out.println(met.checkPosNeg(num));
	}
}
