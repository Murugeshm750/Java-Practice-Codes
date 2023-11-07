package Training;
import java.util.*;
public class Calc {
	static Scanner scan = new Scanner (System.in);
	 static int a,b,add,sub,mul,div;
	 
	 static
	 {
		 System.out.println("Enter value 1");
		 a=scan.nextInt();
		 System.out.println("Enter value 2");
		 b=scan.nextInt();
	 }
	  static void compute()
	 {
		 add=a+b;
		 sub=a-b;
		 mul=a*b;
		 div=a/b;
	 }
	 static void  dispAdd()
	 {
		 System.out.println(add);
	 }
	 static void dispSub()
	 {
		 System.out.println(sub);
	 }
	 static void dispMul()
	 {
		 System.out.println(mul);
	 }
	 static void dispDiv()
	 {
		 System.out.println(div);
	 }
	 public static void main(String[] args) {
		Calc.compute();
		Calc.dispAdd();
		Calc.dispSub();
		Calc.dispMul();
		Calc.dispDiv();
	}
}







































